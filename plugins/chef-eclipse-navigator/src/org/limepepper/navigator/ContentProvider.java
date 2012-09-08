package org.limepepper.navigator;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.limepepper.chefclipse.knife.builder.KnifeNature;

public class ContentProvider implements ITreeContentProvider {

    
    private static final Object[]   NO_CHILDREN = {};
    private IKnifeProjectElement[] _KnifeProjectParents;

    @Override
    public Object[] getChildren(Object parentElement) {
    	
        Object[] children = null;
        if (KnifeProjectWorkbenchRoot.class.isInstance(parentElement)) {
            if (_KnifeProjectParents == null) {
                _KnifeProjectParents = initializeParent(parentElement);
            }

            children = _KnifeProjectParents;
        } else if (IKnifeProjectElement.class.isInstance(parentElement)) {
            children = ((IKnifeProjectElement) parentElement).getChildren();
        } else {
            children = NO_CHILDREN;
        }

        return children;
    }

    @Override
    public Object getParent(Object element) {
        Object parent = null;

        if (IProject.class.isInstance(element)) {
            parent = ((IProject)element).getWorkspace().getRoot();
        } else if (IKnifeProjectElement.class.isInstance(element)) {
            parent = ((IKnifeProjectElement)element).getParent();
        } // else parent = null if IWorkspaceRoot or anything else

        return parent;
    }
    
    @Override
    public boolean hasChildren(Object element) {
        boolean hasChildren = false;

        if (IWorkspaceRoot.class.isInstance(element)) {
            hasChildren = ((IWorkspaceRoot)element).getProjects().length > 0;
        } else if (IKnifeProjectElement.class.isInstance(element)) {
            hasChildren = ((IKnifeProjectElement)element).hasChildren();
        }
        // else it is not one of these so return false

        return hasChildren;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
     * .lang.Object)
     */
    @Override
    public Object[] getElements(Object inputElement) {
        // This is the same as getChildren() so we will call that instead
        return getChildren(inputElement);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.viewers.IContentProvider#dispose()
     */
    @Override
    public void dispose() {

    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
     * .viewers.Viewer, java.lang.Object, java.lang.Object)
     */
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    	if(oldInput==null){
    		
    		System.out
            .println("oldInput is null");
    		
    	}else if(newInput==null){
    		System.out
            .println("newInput is null");
    		
    	}else{
        System.out
                .println("ContentProvider.inputChanged: old: " + oldInput.getClass().getName() 
                		+ " new: " + newInput.getClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$

    	}
    }

    private IKnifeProjectElement[] initializeParent(Object parentElement) {
    	
    	System.out
        .println("calling initialize parent");
    	
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

        List<KnifeProjectParent> list = new Vector<KnifeProjectParent>();
        for (int i = 0; i < projects.length; i++) {
            try {
                if (projects[i].getNature(KnifeNature.NATURE_ID) != null) {
                    list.add(new KnifeProjectParent(projects[i]));
                }
            } catch (CoreException e) {
                // Go to the next IProject
            }
        }

        KnifeProjectParent[] result = new KnifeProjectParent[list.size()];
        list.toArray(result);

        return result;
    }

}
