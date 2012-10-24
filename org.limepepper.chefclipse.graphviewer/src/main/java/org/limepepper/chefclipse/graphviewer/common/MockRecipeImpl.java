package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.Recipe;

public class MockRecipeImpl extends Recipe{
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
