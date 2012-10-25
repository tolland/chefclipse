package org.limepepper.chefclipse.graphviewer.common;

import org.limepepper.chefclipse.model.cookbook.Cookbook;

public class DrawableCookbook {
	
	private Cookbook cookbook;
	
	public DrawableCookbook(Cookbook cookbook)
	{
		this.cookbook=cookbook;
	}
	
	public Cookbook getCookbook()
	{
		return cookbook;
	}
	
	public Object[] getElements()
	{
		return null;
	}
	
	interface IDrawableContainer
	{
		Object[] getElements();
	}
	
	class IDrawableRecipeCatelog implements IDrawableContainer
	{

		@Override
		public Object[] getElements() {
			return cookbook.getRecipes().toArray();
		}
	}
	
}
