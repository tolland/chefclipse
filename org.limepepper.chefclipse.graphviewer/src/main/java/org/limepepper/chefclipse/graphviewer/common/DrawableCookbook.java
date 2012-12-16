package org.limepepper.chefclipse.graphviewer.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

public class DrawableCookbook {
    
    private CookbookVersion cookbook;
    private DrawableAttributeContainer drawableAttributeContainer;
    private DrawableLibraryContainer drawableLibraryContainer;
    private DrawableRecipeContainer drawableRecipeContainer;
    private DrawableDefinitionContainer drawableDefinitionContainer;
    private DrawableTemplateContainer drawableTemplatesContainer;
    private DrawableFolder drawableAttributeFolder;
    private DrawableFolder drawableLibraryFolder;
    private DrawableFolder drawableRecipeFolder;
    private DrawableFolder drawableDefinitionFolder;
    private DrawableFolder drawableTemplatesFolder;
    
    public DrawableCookbook(@NonNull CookbookVersion cookbook)
    {
        this.cookbook=cookbook;
        
        Color color = new Color(null, 255, 255, 190);
        
        drawableAttributeContainer =new DrawableAttributeContainer();
        drawableLibraryContainer =new DrawableLibraryContainer();
        drawableRecipeContainer =new DrawableRecipeContainer();
        drawableDefinitionContainer =new DrawableDefinitionContainer();
        drawableTemplatesContainer =new DrawableTemplateContainer();
        drawableAttributeFolder=new DrawableFolder("attributes",drawableAttributeContainer,color);
        drawableLibraryFolder=new DrawableFolder("libraries",drawableLibraryContainer,color);
        drawableRecipeFolder=new DrawableFolder("recipes",drawableRecipeContainer,color);
        drawableDefinitionFolder=new DrawableFolder("definitions",drawableDefinitionContainer,color);
        drawableTemplatesFolder=new DrawableFolder("templates",drawableTemplatesContainer,color);
    }
    
    @SuppressWarnings("unused")
    private DrawableCookbook()
    {
    }
    
    public CookbookVersion getCookbook()
    {
        return cookbook;
    }
    
    public Object[] getDirectElements()
    {
        return new Object[]{drawableAttributeFolder,drawableLibraryFolder,drawableRecipeFolder,drawableDefinitionFolder,drawableTemplatesFolder};
    }
    
    public Object[] getElements()
    {
        List<Object> nodes=new ArrayList<Object>();
        nodes.add(this);
        nodes.add(drawableAttributeFolder);
        nodes.add(drawableLibraryFolder);
        nodes.add(drawableRecipeFolder);
        nodes.add(drawableDefinitionFolder);
        nodes.add(drawableTemplatesFolder);
        nodes.addAll(Arrays.asList(drawableAttributeFolder.getElements()));
        nodes.addAll(Arrays.asList(drawableLibraryFolder.getElements()));
        nodes.addAll(Arrays.asList(drawableRecipeFolder.getElements()));
        nodes.addAll(Arrays.asList(drawableDefinitionFolder.getElements()));
        nodes.addAll(Arrays.asList(drawableTemplatesFolder.getElements()));
        return nodes.toArray();
    }
    
    public abstract class DrawableContainer
    {
        abstract public String getName();
        
        abstract public Object[] getElements();
    }
    
    public class DrawableCookbookFileContainer extends DrawableContainer
    {

        private String name = "cookbook file";
        
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public Object[] getElements() {
            return cookbook.getRecipes().toArray();
        }
        
        @Override
        public String getName() {
            return name;
        }        
    }
    
    public class DrawableTemplateContainer extends DrawableContainer
    {

        @Override
        public Object[] getElements() {
            return cookbook.getTemplates().toArray();
        }

        @Override
        public String getName() {
            return "templates";
        }
    }
    
    public class DrawableRecipeContainer extends DrawableContainer
    {

        @Override
        public Object[] getElements() {
            return cookbook.getRecipes().toArray();
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
            Object[] arr = cookbook.getAttributes().toArray();
            return arr;
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
        	Object[] libraries =  cookbook.getLibraries().toArray();
        	return libraries;
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
            return cookbook.getDefinitions().toArray();
        }

        @Override
        public String getName() {
            return "definitions";
        }
    }
    
    public class DrawableFolder
    {
    	private Image containerImage = ImageLoader.Load("FolderOpen_24x24_72.png");
    	DrawableContainer drawableContainer;
    	Color color;
    	String folderName;
    	
    	public DrawableFolder(String folderName, DrawableContainer drawableContainer,  Color color)
    	{
    		this.drawableContainer=drawableContainer;
    		this.folderName=folderName;
    		this.color=color;	
    	}
    	
         public Object[] getElements() {
             return new Object[]{drawableContainer};
         }

         public Color getBackgroundColor() {
             return color;
         }

         public String getName() {
             return folderName;
         }
         
         public Image getImage()
         {
             return containerImage;
         }
    }
}
