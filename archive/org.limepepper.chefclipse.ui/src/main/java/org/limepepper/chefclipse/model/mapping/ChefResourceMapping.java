package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.limepepper.chefclipse.common.workstation.Repository;

import chefclipse.core.providers.ChefModelProvider;

public class ChefResourceMapping extends ResourceMapping {

    private final Object object;

    public static ResourceMapping create(Object adaptableObject) {


        if (adaptableObject instanceof Repository) {
            return new RepositoryResourceMapping((Repository) adaptableObject);

        }
        if (adaptableObject instanceof ChefProject) {
            return new ChefclipseProjectResourceMapping(
                    (ChefProject) adaptableObject);
        }
        if (adaptableObject instanceof ChefContainer) {
            return new ContainerResourceMapping(
                    (ChefContainer) adaptableObject);
        }

        return null;
    }

    public ChefResourceMapping(Object adaptableObject) {
        this.object = adaptableObject;
    }

    public Object getModelObject() {
        return object;
    }

    public String getModelProviderId() {
        return ChefModelProvider.MODEL_ID;
    }

/*
 * public IProject[] getProjects() {
 * return new IProject[] { (IProject) object.getProject().getResource() };
 * }
 */
    public ResourceTraversal[] getTraversals(ResourceMappingContext context,
            IProgressMonitor monitor) throws CoreException {

        return null;
    }

@Override
public IProject[] getProjects() {
    // TODO Auto-generated method stub
    return null;
}

}
