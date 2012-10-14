package org.limepepper.chefclipse.graphviewer.common;

import java.util.ArrayList;
import java.util.List;

public class Cookbook extends ChefElement {

	private List<Recipe> mRecipes;

	public Cookbook(String name, List<Recipe> recipes) {
		mName = name;
		setRecipes(recipes);
	}

	public String getType() {
		return "Cookbook";
	}

	public List<Recipe> getRecipes() {
		return mRecipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		mRecipes = recipes;
		if (recipes != null) {
			for (Recipe r : mRecipes) {
				r.addParent(this);
			}
		}
	}

	public List<ChefElement> getChildren() {
		if (mRecipes == null)
			return null;

		List<ChefElement> elements = new ArrayList<ChefElement>();
		for (ChefElement element : mRecipes) {
			elements.add(element);
		}
		return elements;
	}

	@Override
	public void remvoeChild(ChefElement child) {
		if(mRecipes==null)
		{
			return;
		}
		if(mRecipes.contains(child))
		{
			mRecipes.remove((Recipe)child);
		}
	}

}
