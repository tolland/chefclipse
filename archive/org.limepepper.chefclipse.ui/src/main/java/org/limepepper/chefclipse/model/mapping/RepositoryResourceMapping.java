package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IProject;
import org.limepepper.chefclipse.common.workstation.Repository;


public class RepositoryResourceMapping extends ChefResourceMapping {

    public RepositoryResourceMapping(Repository adaptableObject) {
        super((ChefObject)adaptableObject);
    }

    @Override
    public IProject[] getProjects() {

        return null;
    }



}
