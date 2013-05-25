package chefclipse.internal.ui.navigator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;

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
public class ChefNavigatorContentProvider extends AdapterFactoryContentProvider {

	KnifeConfigController api = KnifeConfigController.INSTANCE;

	public ChefNavigatorContentProvider() {

		super(ChefProjectAdapterFactory.getAdapterFactory());
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

				for (KnifeConfig knifeConfig : ChefConfigManager.instance()
						.retrieveChefConfigurations()) {

					Server server = ChefserverFactory.eINSTANCE.createServer();
					server.setWebuiport(4040);
					knifeConfig.setServer(server);

					children.add(knifeConfig);
				}

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

}
