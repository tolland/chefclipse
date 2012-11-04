package org.limepepper.chefclipse.graphviewer.model;

import java.util.ArrayList;

import org.limepepper.chefclipse.common.cookbook.Cookbook;

public class DependencyModel {
	private Cookbook mCookbook;
	private Object selectedObject;
	
	private final ArrayList<IDependencyChangeListener> mDependencyChangeListeners =
            new ArrayList<IDependencyChangeListener>();
	
	public void setCookbook(Cookbook cookbook)
	{
		mCookbook=cookbook;
		selectedObject=null;
		notifyDependencyChanged();
	}
	
	public Cookbook getCookbook()
	{
		return mCookbook;
	}
	
	public Object getSelected()
	{
		return selectedObject;
	}
	
	public void setSelected(Object selected)
	{
		if(selected==selectedObject)
		{
			return;
		}
		selectedObject=selected;
		notifyDependencyChanged();
	}
	
	private IDependencyChangeListener[] getDependencyChangeListenerList() {
		IDependencyChangeListener[] listeners = null;
        synchronized (mDependencyChangeListeners) {
            if (mDependencyChangeListeners.size() == 0) {
                return null;
            }
            listeners =
            		mDependencyChangeListeners.toArray(new IDependencyChangeListener[mDependencyChangeListeners.size()]);
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

    public void removeDependencyChangeListener(IDependencyChangeListener listener) {
        synchronized (mDependencyChangeListeners) {
        	mDependencyChangeListeners.remove(listener);
        }
    }
    
	public interface IDependencyChangeListener {
        public void dependencyChanged();
    }
	
}
