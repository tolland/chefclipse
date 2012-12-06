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
    private DrawableAttributeContainer drawableAttributeContainer =new DrawableAttributeContainer();
    private DrawableLibraryContainer drawableLibraryContainer =new DrawableLibraryContainer();
    private DrawableRecipeContainer drawableRecipeContainer =new DrawableRecipeContainer();
    private DrawableDefinitionContainer drawableDefinitionContainer =new DrawableDefinitionContainer();
    private DrawableTemplateContainer drawableTemplatesContainer =new DrawableTemplateContainer();
    
    public DrawableCookbook(@NonNull CookbookVersion cookbook)
    {
        this.cookbook=cookbook;
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
        nodes.addAll(Arrays.asList(drawableTemplatesContainer.getElements()));
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
        public Color getBackgroundColor() {
            return new Color(null, 255, 255, 190);
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
        public Color getBackgroundColor() {
            return new Color(null, 255, 255, 190);
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
            if(getCookbook()==null)
                return new Object[] {};
            
            Object[] arr =          
                    getCookbook()
                    .getAttributes()
                    .toArray();
            
            
            return arr;
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
            return ((CookbookVersion)cookbook).getLibraries().toArray();
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
            return ((CookbookVersion)cookbook).getDefinitions().toArray();
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
