
package org.limepepper.chefclipse.ui.navigator;

import java.util.ArrayList;
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
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.common.ui.providers.ChefProjectAdapterFactory;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.model.CookbookFolder;
import org.limepepper.chefclipse.model.mapping.ChefCore;
import org.limepepper.chefclipse.navigator.NavigatorActivator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChefNavigatorContentProvider extends AdapterFactoryContentProvider
        implements IPipelinedTreeContentProvider,
        IPipelinedTreeContentProvider2 {

	private static Logger log = LoggerFactory.getLogger(ChefNavigatorContentProvider.class);
    public ChefNavigatorContentProvider() {
        super(ChefProjectAdapterFactory.getAdapterFactory());
    }

    private ICommonContentExtensionSite extensionSite;
    private Viewer viewer;

    @Override
    public Object[] getElements(Object inputElement) {
        log.debug("getElements for: " + inputElement);
        /*
         * if (inputElement instanceof IWorkspaceRoot) { IWorkspaceRoot root =
         * (IWorkspaceRoot) inputElement; return root.getProjects(); } else if
         * (inputElement instanceof IJavaModel) { return
         * ((IJavaModel)inputElement).getWorkspace().getRoot().getProjects(); }
         */
        if (inputElement instanceof IResource) {
            return super.getElements(ChefCore.create((IProject) inputElement));
        }

        return super.getElements(inputElement);
    }

    public Object[] getChildren(Object parentElement) {
        log.debug("getting children of " + parentElement);
        ArrayList<Object> children = new ArrayList<Object>();
        log.debug(parentElement.getClass().toString());

        if (parentElement instanceof IProject) {
            children.add(ChefRepositoryManager.INSTANCE
                    .getRepository(((IProject) parentElement)));

            for (KnifeConfig knifeConfig : ChefRepositoryManager.INSTANCE
                    .getKnives(((IProject) parentElement))) {
                children.add(knifeConfig);
            }

            return children.toArray();

        } else if (parentElement instanceof CookbookFolder) {
            try {
                Object[] members = ((IContainer) ((CookbookFolder) parentElement)
                        .getResource()).members();
                return members;
            } catch (CoreException e) {
                e.printStackTrace();
            }
        } else if (parentElement instanceof DataBag) {
            Object[] members = ((DataBag) parentElement).getItems().toArray();
            return members;
        }
        return super.getChildren(parentElement);
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
                return (((parent.getName().toLowerCase().equals("data_bags") || (parent.getParent() != null && parent
                        .getParent().getName().toLowerCase().equals("data_bags")))) && ((IFile) element)
                        .getName().toLowerCase().endsWith("json"));
            }
        }
        return false;
    }

    public void getPipelinedElements(Object anInput, Set theCurrentElements) {
        // Replace any model projects with a ChefModelProject
        if (anInput instanceof IWorkspaceRoot) {
            List newProjects = new ArrayList();
            for (Iterator iter = theCurrentElements.iterator(); iter.hasNext();) {
                Object element = iter.next();
                if (element instanceof IProject) {
                    IProject project = (IProject) element;
                    // @todo change to static import
                    if (isChefProject(project)) {
                        log.debug("pipelining project");
                        // iter.remove();
                        // newProjects.add(ChefCore.create(project));
                    }
                }
            }
            theCurrentElements.addAll(newProjects);
        }
    }

    @Override
    public boolean hasPipelinedChildren(Object anInput,
            boolean currentHasChildren) {
        if ((anInput instanceof IFolder)) {
            return true;
        }
        return currentHasChildren;
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

    @SuppressWarnings({
            "rawtypes", "unchecked"
    })
    @Override
    public void getPipelinedChildren(Object aParent, Set theCurrentChildren) {
        log.debug("pipelining children");
        if (aParent instanceof IProject) {
        } else if (aParent instanceof IFolder) {
            List<Object> newChildren = new ArrayList<Object>();
            for (Iterator iter = theCurrentChildren.iterator(); iter.hasNext();) {
                Object element = iter.next();
                if (element instanceof IFolder) {
                    IFolder folder = (IFolder) element;
                    // @todo change to static import
                    if (isCookbook(folder)) {
                        log.debug("pipelining cookbook");
                        iter.remove();
                        newChildren.add(ChefCore.createCookbook(folder));
                    }
                    if (isDataBag(folder)) {
                        log.debug("pipelining databag");
                        iter.remove();
                        newChildren.add(ChefCore.createDataBag(folder));
                    }
                }
                if (element instanceof IFile) {
                    if (isDataBagItem((IFile) element)) {
                        log.debug("pipelining databag");
                        iter.remove();
                        newChildren.add(ChefCore.createDataBagItem((IFile) element));
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
}
