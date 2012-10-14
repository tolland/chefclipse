package org.limepepper.chefclipse.graphviewer.common;

import java.util.ArrayList;
import java.util.List;

public class Recipe extends ChefElement {

	private List<Cookbook> mDependencies = null;

	public Recipe(String name, List<Cookbook> cookbooks) {
		mName = name;
		setDependencies(cookbooks);
	}
	
	public String getType() {
		return "Recipe";
	}

	public List<Cookbook> getDependencies() {
		return mDependencies;
	}

	public void setDependencies(List<Cookbook> cookbooks) {
		mDependencies = cookbooks;
		if (cookbooks != null) {
			for (Cookbook r : cookbooks) {
				r.addParent(this);
			}
		}
	}

	public List<ChefElement> getChildren() {
		if (mDependencies == null)
			return null;

		List<ChefElement> elements = new ArrayList<ChefElement>();
		for (ChefElement element : mDependencies) {
			elements.add(element);
		}
		return elements;
	}

	@Override
	public void remvoeChild(ChefElement child) {
		if(mDependencies==null)
		{
			return;
		}
		if(mDependencies.contains(child))
		{
			mDependencies.remove((Cookbook)child);
		}
	}
	
}
