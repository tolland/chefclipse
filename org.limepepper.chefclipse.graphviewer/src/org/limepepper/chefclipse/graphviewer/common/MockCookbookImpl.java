package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl;

public class MockCookbookImpl extends CookbookImpl {
	protected String name;
	protected String version;
	protected String catalog;
	protected MockDependencyRelation dependency;
	
	
	public MockCookbookImpl(String name, String version, String catalog, EList<Cookbook> cookbookDependencies)
	{
		this.name=name;
		this.version=version;
		this.catalog=catalog;
		dependency=new MockDependencyRelation();
		this.dependency.cookbooks=cookbookDependencies;
	}
	
	public MockDependencyRelation getDependency()
	{
		return dependency;
	}
	
	public String getName() {
		return name;
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public String getCatalog()
	{
		return catalog;
	}
}
