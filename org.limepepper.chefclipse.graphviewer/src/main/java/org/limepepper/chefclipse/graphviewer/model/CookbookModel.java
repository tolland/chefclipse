package org.limepepper.chefclipse.graphviewer.model;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;

/**
 * this is a cookbook Model, I wonder a cookbook model is
 * 
 * @author
 * 
 */
public class CookbookModel implements IResourceChangeListener  {

    private DrawableCookbook                         drawableCookbook;
    private IResource resource;

    private final ArrayList<ICookbookChangeListener> mCookbookChangeListeners = new ArrayList<ICookbookChangeListener>();

    public CookbookModel()
    {
    	ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    }
    
	public void setResource(IResource resource)
	{
		this.resource=resource;
        CookbookVersion cookbook = (CookbookVersion) ChefRepositoryManager
                .INSTANCE.getElement(resource);
        setDrawableCookbook(new DrawableCookbook(cookbook));
	}
    
    public void setDrawableCookbook(DrawableCookbook drawableCookbook) {
        this.drawableCookbook = drawableCookbook;
        notifyCookbookChanged();
    }

    public DrawableCookbook getDrawableCookbook() {
        return drawableCookbook;
    }

    private ICookbookChangeListener[] getDependencyChangeListenerList() {
        ICookbookChangeListener[] listeners = null;
        synchronized (mCookbookChangeListeners) {
            if (mCookbookChangeListeners.size() == 0) {
                return null;
            }
            listeners = mCookbookChangeListeners
                    .toArray(new ICookbookChangeListener[mCookbookChangeListeners
                            .size()]);
        }
        return listeners;
    }

    public void notifyCookbookChanged() {
        ICookbookChangeListener[] listeners = getDependencyChangeListenerList();
        if (listeners != null) {
            for (int i = 0; i < listeners.length; i++) {
                listeners[i].cookbookChanged();
            }
        }
    }

    public void addCookbookChangeListener(ICookbookChangeListener listener) {
        synchronized (mCookbookChangeListeners) {
            mCookbookChangeListeners.add(listener);
        }
    }

    public void removeCookbookChangeListener(ICookbookChangeListener listener) {
        synchronized (mCookbookChangeListeners) {
            mCookbookChangeListeners.remove(listener);
        }
    }

    public interface ICookbookChangeListener {
        public void cookbookChanged();
    }

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		if (event.getType() != IResourceChangeEvent.POST_CHANGE)
            return;
		if(resource==null)
			return;
		IResourceDelta rootDelta = event.getDelta();
		IResourceDelta cookbookDelta = rootDelta.findMember(resource.getFullPath());
		if(cookbookDelta==null)
		{
			return;
		}
		setResource(cookbookDelta.getResource());
	}
	
	public void dispose()
	{
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}
}
