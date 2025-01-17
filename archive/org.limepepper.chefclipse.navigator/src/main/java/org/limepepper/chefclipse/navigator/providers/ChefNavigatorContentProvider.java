package org.limepepper.chefclipse.navigator.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
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
import org.limepepper.chefclipse.common.knife.KnifeConfig;

import chefclipse.core.ChefCore;
import chefclipse.core.CookbookFolder;
import chefclipse.core.builders.ChefProjectNature;
import chefclipse.core.factories.ChefModelItemProviderAdapterFactory;
import chefclipse.core.managers.ChefRepositoryManager;
import chefclipse.core.providers.ChefProjectAdapterFactory;

public class ChefNavigatorContentProvider extends AdapterFactoryContentProvider
        implements IPipelinedTreeContentProvider,
        IPipelinedTreeContentProvider2 {

    public ChefNavigatorContentProvider() {
        super(ChefModelItemProviderAdapterFactory.getAdapterFactory());
    }

    private ICommonContentExtensionSite extensionSite;
    private Viewer                      viewer;

    @Override
    public Object[] getElements(Object inputElement) {
/*
 * if (inputElement instanceof IWorkspaceRoot) {
 * IWorkspaceRoot root = (IWorkspaceRoot) inputElement;
 * return root.getProjects();
 * } else if (inputElement instanceof IJavaModel) {
 * return ((IJavaModel)inputElement).getWorkspace().getRoot().getProjects();
 * }
 */
        if (inputElement instanceof IResource) {
            return super.getElements(ChefCore.create((IProject) inputElement));
        }

        return super.getElements(inputElement);
    }

    public Object[] getChildren(Object parentElement) {
        NavigatorActivator.log("getting children of " + parentElement);
        ArrayList<Object> children = new ArrayList<Object>();
        NavigatorActivator.log(parentElement.getClass().toString());

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
                        NavigatorActivator.log("pipelining project");
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

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void getPipelinedChildren(Object aParent, Set theCurrentChildren) {
        NavigatorActivator.log("pipelining children");
        if (aParent instanceof IProject) {
        } else if (aParent instanceof IFolder) {
            List<Object> newChildren = new ArrayList<Object>();
            for (Iterator iter = theCurrentChildren.iterator(); iter.hasNext();) {
                Object element = iter.next();
                if (element instanceof IFolder) {
                    IFolder folder = (IFolder) element;
                    // @todo change to static import
                    if (isCookbook(folder)) {
                        NavigatorActivator.log("pipelining cookbook");
                        iter.remove();
                        newChildren.add(ChefCore.createCookbook(folder));
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
