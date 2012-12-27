package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.IProgressMonitor;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

public class CookbookResourceMapping extends ContainerResourceMapping {

    CookbookVersion cookbook = null;


    
    public CookbookResourceMapping(CookbookVersion cookbook) {
        super(cookbook);
        this.cookbook = cookbook;
    }

    @Override
    public Object getModelObject() {
        return cookbook;
    }

    @Override
     public ResourceTraversal[] getTraversals(
               ResourceMappingContext context, 
               IProgressMonitor monitor) {
        
        return null; 
                
        
     }
    

    @Override
    public String getModelProviderId() {

        return null;
    }

    @Override
    public IProject[] getProjects() {

        return null;
    }

}
