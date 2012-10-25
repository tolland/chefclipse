package org.limepepper.chefclipse.graphviewer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.limepepper.chefclipse.graphviewer.common.MockCookbookImpl;
import org.limepepper.chefclipse.graphviewer.common.MockRecipeImpl;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.Recipe;

public class DependencyController {
	static private DependencyController sController=null;
	
	static public DependencyController getController()
	{
		if(sController==null)
		{
			sController=new DependencyController();
		}
		return sController;
	}
	
	public void removeDependency(Object dependencyRelation)
	{
		if(dependencyRelation instanceof EntityConnectionData)
		{
			EntityConnectionData entityConnectionData= (EntityConnectionData)dependencyRelation;
			Object source= entityConnectionData.source;
			Object target = entityConnectionData.dest;
			if(source instanceof Recipe)
			{
				Recipe recipe= (Recipe)source;
				if(recipe.getCookbook().contains(target))
				{
					recipe.getCookbook().remove(target);
				}
			}
			
			if(source instanceof Cookbook)
			{
				Cookbook cookbook = (Cookbook) source;
				if(cookbook.getRecipes().contains(target))
				{
					cookbook.getRecipes().remove(target);
				}
			}
			DependencyModel.getModel().notifyDependencyChanged();
		}
	}
	
	public void removeNode(Object node)
	{
		removeNodeRecursively(DependencyModel.getModel().getCookbook(),node);
		DependencyModel.getModel().notifyDependencyChanged();
	}
	
	private void removeNodeRecursively(Object parent,Object node)
	{
		if(parent instanceof Recipe)
		{
			Recipe recipe = (Recipe)parent;
			List<Cookbook> cookbooks = recipe.getCookbook();
			if(cookbooks!=null)
			{
				if(cookbooks.contains(node))
				{
					cookbooks.remove(node);
				}
				for(int i=0;i<cookbooks.size();i++)
				{
					removeNodeRecursively(cookbooks.get(i),node);
				}
			}
		}
		else if (parent instanceof Cookbook)
		{
			Cookbook cookbook = (Cookbook)parent;
			List<Recipe> recipes = cookbook.getRecipes();
			if(recipes!=null)
			{
				if(recipes.contains(node))
				{
					recipes.remove(node);
				}
				for(int i=0;i<recipes.size();i++)
				{
					removeNodeRecursively(recipes.get(i),node);
				}
			}
		}
	}
	
	public Cookbook getRootCookbook() {
		MockCookbookImpl mysqlCb =new MockCookbookImpl("mysql","v1.3.0", "Databases",null);

		MockCookbookImpl aptCb = new MockCookbookImpl("mysql","v1.1.16","Web Servers",null);

		MockCookbookImpl apache2Cb = new MockCookbookImpl("apt","v1.4.8", "Package Management",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { aptCb,mysqlCb })));

		MockCookbookImpl yumCb = new MockCookbookImpl("yum","v1.0.0","Package Management",
				null);

		MockCookbookImpl phpCb = new MockCookbookImpl("php", "v1.1.0","Programming Languages",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { yumCb,apache2Cb,mysqlCb })));

		return phpCb;
	}
}
