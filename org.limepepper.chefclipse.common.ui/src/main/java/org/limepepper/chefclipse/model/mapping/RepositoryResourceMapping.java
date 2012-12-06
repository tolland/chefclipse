package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IProject;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.model.ChefObject;


public class RepositoryResourceMapping extends ChefResourceMapping {

    public RepositoryResourceMapping(Repository adaptableObject) {
        super((ChefObject)adaptableObject);
    }

    @Override
    public IProject[] getProjects() {
        // TODO Auto-generated method stub
        return null;
    }



}
