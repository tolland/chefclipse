package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.IProgressMonitor;

public class ContainerResourceMapping extends
        ChefResourceMapping {

    public ContainerResourceMapping(Object object) {
        super(object);
    }

    @Override
    public IProject[] getProjects() {

        return null;
    }
    /* (non-Javadoc)
     * @see org.eclipse.core.resources.mapping.ResourceMapping#getTraversals(org.eclipse.core.resources.mapping.ResourceMappingContext, org.eclipse.core.runtime.IProgressMonitor)
     */
    public ResourceTraversal[] getTraversals(ResourceMappingContext context,
            IProgressMonitor monitor) {
        return new ResourceTraversal[] { 
                new ResourceTraversal(new IResource[] { 
                        getResource()
                }, IResource.DEPTH_INFINITE, IResource.NONE)
            };
    }

    private IResource getResource() {
        return ((ChefContainer)getModelObject()).getResource();
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.core.resources.mapping.ResourceMapping#contains(org.eclipse.core.resources.mapping.ResourceMapping)
     */
    public boolean contains(ResourceMapping mapping) {
        if (mapping instanceof ChefResourceMapping) {
            ChefObject object = (ChefObject)mapping.getModelObject();
            if (object instanceof ChefResource) {
                IResource resource = ((ChefResource) object).getResource();
                return getResource().getFullPath().isPrefixOf(resource.getFullPath());
            }
        }
        return false;
    }
}
