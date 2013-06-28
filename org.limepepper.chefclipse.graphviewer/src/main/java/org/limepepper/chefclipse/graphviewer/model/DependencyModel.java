package org.limepepper.chefclipse.graphviewer.model;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
<<<<<<< HEAD

=======
>>>>>>> origin/tomhodder
import chefclipse.core.managers.ChefRepositoryManager;

public class DependencyModel implements IResourceChangeListener {
    private CookbookVersion                            mCookbook;
    private Object                                     selectedObject;
    private IResource                                  resource;

    private final ArrayList<IDependencyChangeListener> mDependencyChangeListeners = new ArrayList<IDependencyChangeListener>();

    public DependencyModel() {
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    }

    public void setCookbook(CookbookVersion cookbook) {
        mCookbook = cookbook;
        selectedObject = null;
        notifyDependencyChanged();
    }

    public void setResource(IResource resource) {
        this.resource = resource;
        CookbookVersion cookbook = (CookbookVersion) ChefRepositoryManager.INSTANCE
                .getElement(resource);
        setCookbook(cookbook);
    }

    public CookbookVersion getCookbook() {
        return mCookbook;
    }

    public Object getSelected() {
        return selectedObject;
    }

    public void setSelected(Object selected) {
        if (selected == selectedObject) {
            return;
        }
        selectedObject = selected;
        notifyDependencyChanged();
    }

    private IDependencyChangeListener[] getDependencyChangeListenerList() {
        IDependencyChangeListener[] listeners = null;
        synchronized (mDependencyChangeListeners) {
            if (mDependencyChangeListeners.size() == 0) {
                return null;
            }
            listeners = mDependencyChangeListeners
                    .toArray(new IDependencyChangeListener[mDependencyChangeListeners
                            .size()]);
        }
        return listeners;
    }

    public void notifyDependencyChanged() {
        IDependencyChangeListener[] listeners = getDependencyChangeListenerList();
        if (listeners != null) {
            for (int i = 0; i < listeners.length; i++) {
                listeners[i].dependencyChanged();
            }
        }
    }

    public void addDependencyChangeListener(IDependencyChangeListener listener) {
        synchronized (mDependencyChangeListeners) {
            mDependencyChangeListeners.add(listener);
        }
    }

    public void removeDependencyChangeListener(
            IDependencyChangeListener listener) {
        synchronized (mDependencyChangeListeners) {
            mDependencyChangeListeners.remove(listener);
        }
    }

    public interface IDependencyChangeListener {
        public void dependencyChanged();
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if (event.getType() != IResourceChangeEvent.POST_CHANGE)
            return;
        if (resource == null)
            return;
        IResourceDelta rootDelta = event.getDelta();
        IResourceDelta cookbookDelta = rootDelta.findMember(resource
                .getFullPath());
        if (cookbookDelta == null) {
            return;
        }
        setResource(cookbookDelta.getResource());
    }

    public void dispose() {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    }
}
