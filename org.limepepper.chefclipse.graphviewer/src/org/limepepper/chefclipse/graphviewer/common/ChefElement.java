package org.limepepper.chefclipse.graphviewer.common;

import java.util.ArrayList;
import java.util.List;

public abstract class ChefElement {

	protected String mName;

	protected List<ChefElement> mParent = new ArrayList<ChefElement>();

	public String getName() {
		return mName;
	}

	public abstract String getType();

	public abstract List<ChefElement> getChildren();
	
	public abstract void remvoeChild(ChefElement child);

	public List<ChefElement> getParent() {
		return mParent;
	}

	public void setParent(List<ChefElement> parent) {
		mParent = parent;
	}

	public void addParent(ChefElement parent) {
		mParent.add(parent);
	}

	public void removeParent(ChefElement parent)
	{
		mParent.remove(parent);
	}
}
