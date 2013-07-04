package chefclipse.internal.ui.navigator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.IPipelinedTreeContentProvider;
import org.eclipse.ui.navigator.IPipelinedTreeContentProvider2;
import org.eclipse.ui.navigator.PipelinedShapeModification;
import org.eclipse.ui.navigator.PipelinedViewerUpdate;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.ChefCore;
import chefclipse.core.builders.ChefProjectNature;
import chefclipse.core.managers.ChefRepositoryManager;
import chefclipse.core.providers.ChefProjectAdapterFactory;

/**
 * http://devdesignandstuff.blogspot.co.uk/2010/10/contributing-to-eclipse-
 * common.html
 *
 * @author tomhodder
 *
 */
public class ChefNavigatorContentProvider extends AdapterFactoryContentProvider
		implements IPipelinedTreeContentProvider,
		IPipelinedTreeContentProvider2 {

	KnifeConfigController api = KnifeConfigController.INSTANCE;

	private static Logger log = LoggerFactory
			.getLogger(ChefNavigatorContentProvider.class);

	public ChefNavigatorContentProvider() {

		super(ChefProjectAdapterFactory.getAdapterFactory());
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// this makes the Viewer as viewer
		super.inputChanged(viewer, oldInput, newInput);

	}

	/**
	 * add the bare ecore Repository object into the children, so there is a
	 * virtual resource to access the model use the emf generated factories to
	 * provide the items
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		try {
			if ((parentElement instanceof IProject)
					&& ((IProject) parentElement)
							.hasNature(ChefProjectNature.NATURE_ID)) {

				ArrayList<Object> children = new ArrayList<Object>(
						Arrays.asList(((IProject) parentElement).members()));

				Repository repository = ChefRepositoryManager.INSTANCE
						.getRepository(((IProject) parentElement));

				children.add(repository);

/*				for (KnifeConfig knifeConfig : repository.getKnives()) {

					children.add(knifeConfig);
				}*/

				return children.toArray();

			} else if (parentElement instanceof CookbookVersion) {
				return new MenuLevelHolder[] {
						new MenuLevelHolder("Recipes",
								((CookbookVersion) parentElement).getRecipes()),
						new MenuLevelHolder("Templates",
								((CookbookVersion) parentElement)
										.getTemplates()),
						new MenuLevelHolder("Root_Files",
								((CookbookVersion) parentElement)
										.getRoot_files()),
						new MenuLevelHolder("Attributes",
								((CookbookVersion) parentElement)
										.getAttributes()),
						new MenuLevelHolder("Definitions",
								((CookbookVersion) parentElement)
										.getDefinitions()),
						new MenuLevelHolder("Libraries",
								((CookbookVersion) parentElement)
										.getLibraries()),
						new MenuLevelHolder(
								((CookbookVersion) parentElement).getDepends(),
								"Dependencies") };

			} else if (parentElement instanceof MenuLevelHolder) {

				return ((MenuLevelHolder) parentElement).getChildren();

			} else if (parentElement instanceof DataBag) {
				Object[] members = ((DataBag) parentElement).getItems()
						.toArray();
				return members;
			}
		} catch (CoreException e) {

			e.printStackTrace();
		}
		return super.getChildren(parentElement);
	}

	@Override
	public boolean hasChildren(Object element) {
		try {
			if (element instanceof IProject) {
				if (((IProject) element).isOpen()) {
					if (((IProject) element)
							.hasNature(ChefProjectNature.NATURE_ID)) {
						return true;
					}
				}

			} else if (element instanceof MenuLevelHolder) {
				return (((MenuLevelHolder) element).getChildren().length > 0);

			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return super.hasChildren(element);
	}

	private boolean isDataBag(IFolder resource) {
		if (resource instanceof IFolder) {
			return ((IFolder) resource).getParent().getName()
					.equals("data_bags");
		}
		return false;
	}

	private boolean isDataBagItem(IFile element) {
		if (element instanceof IFile) {
			IContainer parent = element.getParent();
			if (parent != null) {
				return (((parent.getName().toLowerCase().equals("data_bags") || (parent
						.getParent() != null && parent.getParent().getName()
						.toLowerCase().equals("data_bags")))) && ((IFile) element)
						.getName().toLowerCase().endsWith("json"));
			}
		}
		return false;
	}

	@Override
	public void getPipelinedChildren(Object aParent, Set theCurrentChildren) {
		// ChefActivator.log("pipelining children");
		if (aParent instanceof IProject) {
		} else if (aParent instanceof IFolder) {
			List<Object> newChildren = new ArrayList<Object>();
			for (Iterator iter = theCurrentChildren.iterator(); iter.hasNext();) {
				Object element = iter.next();
				if (element instanceof IFolder) {
					IFolder folder = (IFolder) element;
					// @todo change to static import
					if (isCookbook(folder)) {
						// NavigatorActivator.log("pipelining cookbook");
						iter.remove();
						newChildren.add(ChefCore.create(folder));
					}
					if (isDataBag(folder)) {
						// NavigatorActivator.log("pipelining databag");
						iter.remove();
						newChildren.add(ChefCore.createDataBag(folder));
					}
				}
				if (element instanceof IFile) {
					if (isDataBagItem((IFile) element)) {
						// NavigatorActivator.log("pipelining databag");
						iter.remove();
						newChildren.add(ChefCore
								.createDataBagItem((IFile) element));
					}
				}
			}
			theCurrentChildren.addAll(newChildren);
		}
	}

	@Override
	public Object getPipelinedParent(Object anObject, Object aSuggestedParent) {
		return null;
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {

	}

	@Override
	public void restoreState(IMemento aMemento) {

	}

	@Override
	public void saveState(IMemento aMemento) {

	}

	public void getPipelinedElements(Object anInput, Set theCurrentElements) {
		// Replace any model projects with a ChefModelProject
		if (anInput instanceof IWorkspaceRoot) {
			List<Object> newProjects = new ArrayList<Object>();
			for (Iterator<Object> iter = theCurrentElements.iterator(); iter
					.hasNext();) {
				Object element = iter.next();
				if (element instanceof IProject) {
					IProject project = (IProject) element;
					// @todo change to static import
					if (isChefProject(project)) {
						// NavigatorActivator.log("pipelining project");
						// iter.remove();
						// newProjects.add(ChefCore.create(project));
					}
				}
			}
			theCurrentElements.addAll(newProjects);
		}
	}

	boolean isChefProject(IResource resource) {
		if (resource instanceof IProject) {
			try {
				return ((IProject) resource)
						.hasNature(ChefProjectNature.NATURE_ID);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	boolean isCookbook(IResource resource) {
		if (resource instanceof IFolder) {
			return ((IFolder) resource).getParent().getName()
					.equals("cookbooks");
		}
		return false;
	}

	@Override
	public PipelinedShapeModification interceptAdd(
			PipelinedShapeModification anAddModification) {

		return null;
	}

	@Override
	public PipelinedShapeModification interceptRemove(
			PipelinedShapeModification aRemoveModification) {

		return null;
	}

	@Override
	public boolean interceptRefresh(
			PipelinedViewerUpdate aRefreshSynchronization) {

		return false;
	}

	@Override
	public boolean interceptUpdate(PipelinedViewerUpdate anUpdateSynchronization) {

		return false;
	}

	@Override
	public boolean hasPipelinedChildren(Object anInput,
			boolean currentHasChildren) {
		if ((anInput instanceof IFolder)) {
			return true;
		}
		return currentHasChildren;
	}

}
