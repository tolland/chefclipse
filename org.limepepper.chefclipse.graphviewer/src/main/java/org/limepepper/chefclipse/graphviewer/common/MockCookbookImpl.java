package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.model.cookbook.Recipe;
import org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl;

public class MockCookbookImpl extends CookbookImpl {
	protected String name;
	
	public MockCookbookImpl(String name, EList<Recipe> recipes )
	{
		this.name=name;
		this.recipes=recipes;
	}
	
	public String getName() {
		return name;
	}
}
