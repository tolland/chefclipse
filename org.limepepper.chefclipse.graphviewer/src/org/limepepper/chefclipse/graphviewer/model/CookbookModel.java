package org.limepepper.chefclipse.graphviewer.model;

import java.util.ArrayList;

import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel.IDependencyChangeListener;

public class CookbookModel {

	private DrawableCookbook drawableCookbook;
	
	private final ArrayList<ICookbookChangeListener> mCookbookChangeListeners =
            new ArrayList<ICookbookChangeListener>();
	
	public void setDrawableCookbook(DrawableCookbook drawableCookbook)
	{
		this.drawableCookbook=drawableCookbook;
	}
	
	public DrawableCookbook getDrawableCookbook()
	{
		return drawableCookbook;
	}
	
	private ICookbookChangeListener[] getDependencyChangeListenerList() {
		ICookbookChangeListener[] listeners = null;
        synchronized (mCookbookChangeListeners) {
            if (mCookbookChangeListeners.size() == 0) {
                return null;
            }
            listeners =
            		mCookbookChangeListeners.toArray(new ICookbookChangeListener[mCookbookChangeListeners.size()]);
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
}
