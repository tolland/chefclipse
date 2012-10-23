package org.limepepper.chefclipse.graphviewer.model;

import java.util.ArrayList;

import org.limepepper.chefclipse.model.cookbook.Cookbook;

public class DependencyModel {
	private static DependencyModel sModel=null;
	private Cookbook mCookbook;
	
	private final ArrayList<IDependencyChangeListener> mDependencyChangeListeners =
            new ArrayList<IDependencyChangeListener>();
	
	
	static public DependencyModel getModel()
	{
		if(sModel==null)
		{
			sModel=new DependencyModel();
		}
		return sModel;
	}
	
	public void setCookbook(Cookbook cookbook)
	{
		mCookbook=cookbook;
		notifyDependencyChanged();
	}
	
	public Cookbook getCookbook()
	{
		return mCookbook;
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
    
	public static interface IDependencyChangeListener {
        public void dependencyChanged();
    }
	
}
