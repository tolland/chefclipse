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
		MockRecipeImpl mysql_R1 = new MockRecipeImpl("default.rb", null);
		MockRecipeImpl mysql_R2 = new MockRecipeImpl("client.rb", null);
		MockRecipeImpl mysql_R3 = new MockRecipeImpl("server.rb", null);
		MockCookbookImpl mysqlCb =new MockCookbookImpl("mysql v1.3.0 (Databases)",
				new BasicEList<Recipe>(Arrays.asList(new MockRecipeImpl[] { mysql_R1, mysql_R2, mysql_R3 })));

		MockRecipeImpl apt_R1 = new MockRecipeImpl("default.rb", null);
		MockRecipeImpl apt_R2 = new MockRecipeImpl("cacher-client.rb", null);
		MockRecipeImpl apt_R3 = new MockRecipeImpl("cacher-ng.rb", null);
		MockCookbookImpl aptCb = new MockCookbookImpl("mysql v1.1.16 (Web Servers)",
				new BasicEList<Recipe>(Arrays.asList(new MockRecipeImpl[] { apt_R1, apt_R2, apt_R3 })));

		MockRecipeImpl apache2_R1 = new MockRecipeImpl("mod_auth_basic.rb",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { mysqlCb, aptCb })));
		MockRecipeImpl apache2_R2 = new MockRecipeImpl("mod_authz_groupfile.rb", null);
		MockRecipeImpl apache2_R3 = new MockRecipeImpl("mod_authz_host.rb", null);
		MockRecipeImpl apache2_R4 = new MockRecipeImpl("mod_proxy_balancer.rb",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { aptCb })));
		MockCookbookImpl apache2Cb = new MockCookbookImpl("apt v1.4.8 (Package Management)",
				new BasicEList<Recipe>(Arrays.asList(new Recipe[] { apache2_R1, apache2_R2,
						apache2_R3, apache2_R4 })));

		Recipe yum_R1 = new MockRecipeImpl("default.rb", null);
		Recipe yum_R2 = new MockRecipeImpl("epel.rb", null);
		Recipe yum_R3 = new MockRecipeImpl("ius.rb", null);
		MockCookbookImpl yumCb = new MockCookbookImpl("yum v1.0.0 (Package Management)",
				new BasicEList<Recipe>(Arrays.asList(new Recipe[] { yum_R1, yum_R2, yum_R3 })));

		MockRecipeImpl php_R1 = new MockRecipeImpl("default.rb",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { apache2Cb })));
		MockRecipeImpl php_R2 = new MockRecipeImpl("module_apc.rb", null);
		MockRecipeImpl php_R3 = new MockRecipeImpl("module_curl.rb",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { mysqlCb, yumCb })));
		MockRecipeImpl php_R4 = new MockRecipeImpl("module_module_mysql.rb",
				new BasicEList<Cookbook>(Arrays.asList(new Cookbook[] { mysqlCb, aptCb })));
		MockCookbookImpl phpCb = new MockCookbookImpl("php v1.1.0 (Programming Languages)",
				new BasicEList<Recipe>(Arrays.asList(new MockRecipeImpl[] { php_R1, php_R2, php_R3, php_R4 })));

		return phpCb;
	}
}
