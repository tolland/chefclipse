/**
 * 
 */
package org.limepepper.chefclipse.graphviewer.controller;

import java.util.Arrays;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;
import org.limepepper.chefclipse.graphviewer.common.MockAttributeImpl;
import org.limepepper.chefclipse.graphviewer.common.MockCookbookImpl;
import org.limepepper.chefclipse.graphviewer.common.MockDefinitionImpl;
import org.limepepper.chefclipse.graphviewer.common.MockLibraryImpl;
import org.limepepper.chefclipse.graphviewer.common.MockRecipeImpl;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Recipe;

/**
 * @author Binhua2
 *
 */
public class CookbookController {
	
	private CookbookModel cookbookModel;
	
	public CookbookController(CookbookModel cookbookModel)
	{
		this.cookbookModel=cookbookModel;
	}
	
	public DrawableCookbook buildDrawableCookbook()
	{
		MockCookbookImpl cookbook=new MockCookbookImpl("mysql","v1.3.0", "Databases",null);
		return buildDrawableCookbook(cookbook);
	}
	
	public DrawableCookbook buildDrawableCookbook(MockCookbookImpl cookbook)
	{
		
		MockAttributeImpl attribute1 =new MockAttributeImpl("client.rb");
		MockAttributeImpl attribute2 =new MockAttributeImpl("server.rb");
		cookbook.setAttributes(new BasicEList<Attribute>(Arrays.asList(new Attribute[] { attribute1,attribute2})));
		
		MockLibraryImpl library1 = new MockLibraryImpl("database.rb");
		MockLibraryImpl library2 = new MockLibraryImpl("helpers.rb");
		cookbook.setLibraries(new BasicEList<Library>(Arrays.asList(new Library[] { library1,library2})));
		
		MockRecipeImpl recipe1 = new MockRecipeImpl("client.rb",null);
		MockRecipeImpl recipe2 = new MockRecipeImpl("default.rb",null);
		MockRecipeImpl recipe3 = new MockRecipeImpl("server.rb",null);
		MockRecipeImpl recipe4 = new MockRecipeImpl("server_ec2.rb",null);
		cookbook.setRecipes(new BasicEList<Recipe>(Arrays.asList(new Recipe[] { recipe1,recipe2,recipe3,recipe4})));
		
		MockDefinitionImpl definition1 =new MockDefinitionImpl("conf.rb");
		MockDefinitionImpl definition2 =new MockDefinitionImpl("module.rb");
		MockDefinitionImpl definition3 =new MockDefinitionImpl("site.rb");
		MockDefinitionImpl definition4 =new MockDefinitionImpl("app.rb");
		cookbook.setDefinitions(new BasicEList<Definition>(Arrays.asList(new Definition[] { definition1,definition2,definition3,definition4})));
		
		return new DrawableCookbook(cookbook);
	}

}
