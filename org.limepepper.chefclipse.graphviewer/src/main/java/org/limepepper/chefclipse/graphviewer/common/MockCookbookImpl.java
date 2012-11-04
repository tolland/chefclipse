package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.Resource;

public class MockCookbookImpl extends CookbookImpl {
	protected String name;
	protected String version;
	protected String catalog;
	protected MockDependencyRelation dependency;
	private EList<Attribute> attributes;
	private EList<Definition> definitions;
	private EList<Library> libraries;
	private EList<Resource> resources;
	
	public MockCookbookImpl(String name, String version, String catalog, EList<Cookbook> cookbookDependencies)
	{
		this.name=name;
		this.version=version;
		this.catalog=catalog;
		dependency=new MockDependencyRelation();
		this.dependency.cookbooks=cookbookDependencies;
	}
	
	public void setRecipes(EList<Recipe> recipes)
	{
		this.recipes=recipes;
	}
	
	public EList<Recipe> getRecipes()
	{
		return this.recipes;
	}
	
	public void setAttributes(EList<Attribute> attributes)
	{
		this.attributes=attributes;
	}
	
	public EList<Attribute> getAttributes()
	{
		return this.attributes;
	}
	
	public void setLibraries(EList<Library> libraries)
	{
		this.libraries=libraries;
	}
	
	public EList<Library> getLibraries()
	{
		return this.libraries;
	}
	
	public EList<Resource> getResource()
	{
		return this.resources;
	}
	
	public void setResource(EList<Resource> resources)
	{
		this.resources=resources;
	}
	
	
	public void setDefinitions(EList<Definition> definitions)
	{
		this.definitions=definitions;
	}
	
	public EList<Definition> getDefinitions()
	{
		return this.definitions;
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
