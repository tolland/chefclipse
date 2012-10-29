package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl;

public class MockRecipeImpl extends RecipeImpl implements ICookbookElement{
	protected String name;
	public MockRecipeImpl(String name,EList<Cookbook> cookbooks)
	{
		this.name=name;
		this.cookbook=cookbooks;
	}
	
	public String getName()
	{
		return name;
	}
}
