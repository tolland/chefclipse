package org.limepepper.chefclipse.graphviewer.controller;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.graphviewer.common.MockCookbookImpl;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;

public class DependencyController {

	private DependencyModel dependencyModel;
	
	public DependencyController(DependencyModel dependencyModel)
	{
		this.dependencyModel=dependencyModel;
	}
	
	public void removeDependency(Object dependencyRelation)
	{
		if(dependencyRelation instanceof EntityConnectionData)
		{
			EntityConnectionData entityConnectionData= (EntityConnectionData)dependencyRelation;
			Object source= entityConnectionData.source;
			Object target = entityConnectionData.dest;

			if(source instanceof Cookbook)
			{
				MockCookbookImpl cookbook = (MockCookbookImpl) source;
				if(cookbook.getDependency().cookbooks!=null&&
						cookbook.getDependency().cookbooks.contains(target))
				{
					cookbook.getDependency().cookbooks.remove(target);
				}
			}
			dependencyModel.notifyDependencyChanged();
		}
	}
	
	public void removeNode(Object node)
	{
		removeNodeRecursively(dependencyModel.getCookbook(),node);
		dependencyModel.notifyDependencyChanged();
	}
	
	private void removeNodeRecursively(Object parent,Object node)
	{
		if (parent instanceof Cookbook)
		{
			MockCookbookImpl cookbook = (MockCookbookImpl)parent;
			List<Cookbook> cookbooks = cookbook.getDependency().cookbooks;
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
