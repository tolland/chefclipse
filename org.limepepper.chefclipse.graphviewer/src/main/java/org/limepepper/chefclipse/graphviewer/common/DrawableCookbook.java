package org.limepepper.chefclipse.graphviewer.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor;
import org.limepepper.chefclipse.common.cookbook.Cookbook;

public class DrawableCookbook {
	
	private Cookbook cookbook;
	private DrawableAttributeContainer drawableAttributeContainer =new DrawableAttributeContainer();
	private DrawableLibraryContainer drawableLibraryContainer =new DrawableLibraryContainer();
	private DrawableRecipeContainer drawableRecipeContainer =new DrawableRecipeContainer();
	private DrawableDefinitionContainer drawableDefinitionContainer =new DrawableDefinitionContainer();
	
	public DrawableCookbook(Cookbook cookbook)
	{
		this.cookbook=cookbook;
	}
	
	public Cookbook getCookbook()
	{
		return cookbook;
	}
	
	public Object[] getDirectElements()
	{
		return new Object[]{drawableAttributeContainer,drawableLibraryContainer,drawableRecipeContainer,drawableDefinitionContainer};
	}
	
	public Object[] getElements()
	{
		List<Object> nodes=new ArrayList<Object>();
		nodes.add(this);
		nodes.add(drawableAttributeContainer);
		nodes.add(drawableLibraryContainer);
		nodes.add(drawableRecipeContainer);
		nodes.add(drawableDefinitionContainer);
		nodes.addAll(Arrays.asList(drawableAttributeContainer.getElements()));
		nodes.addAll(Arrays.asList(drawableLibraryContainer.getElements()));
		nodes.addAll(Arrays.asList(drawableRecipeContainer.getElements()));
		nodes.addAll(Arrays.asList(drawableDefinitionContainer.getElements()));
		return nodes.toArray();
	}
	
	public abstract class DrawableContainer
	{
		private Image containerImage = ImageLoader.Load("FolderOpen_24x24_72.png");
		
		abstract public String getName();
		
		abstract public Object[] getElements();
		
		abstract public Color getBackgroundColor();
		
		public Image getImage()
		{
			return containerImage;
		}
	}
	
	public class DrawableRecipeContainer extends DrawableContainer
	{

		@Override
		public Object[] getElements() {
			return cookbook.getRecipes().toArray();
		}

		@Override
		public Color getBackgroundColor() {
			return new Color(null, 255, 255, 190);
		}

		@Override
		public String getName() {
			return "recipes";
		}
	}
	
	public class DrawableAttributeContainer extends DrawableContainer
	{

		@Override
		public Object[] getElements() {
			return ((MockCookbookImpl)cookbook).getAttributes().toArray();
		}

		@Override
		public Color getBackgroundColor() {
			return new Color(null, 255, 255, 190);
		}

		@Override
		public String getName() {
			return "attributes";
		}
	}
	
	public class DrawableLibraryContainer extends DrawableContainer
	{
		@Override
		public Object[] getElements() {
			return ((MockCookbookImpl)cookbook).getLibraries().toArray();
		}

		@Override
		public Color getBackgroundColor() {
			return new Color(null, 255, 255, 190);
		}

		@Override
		public String getName() {
			return "libraries";
		}
	}
	
	public class DrawableDefinitionContainer extends DrawableContainer
	{
		@Override
		public Object[] getElements() {
			return ((MockCookbookImpl)cookbook).getDefinitions().toArray();
		}

		@Override
		public Color getBackgroundColor() {
			return new Color(null, 255, 255, 190);
		}

		@Override
		public String getName() {
			return "definitions";
		}
	}

	
}
