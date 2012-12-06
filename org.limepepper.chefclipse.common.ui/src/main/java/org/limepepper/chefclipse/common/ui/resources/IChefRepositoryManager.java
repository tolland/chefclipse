package org.limepepper.chefclipse.common.ui.resources;

import org.eclipse.core.resources.IResource;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * The ChefRepository manager is the point of contact for working with the
 * ChefObject model
 *
 *
 * @author tomhodder
 *
 */
public interface IChefRepositoryManager {

    /**
     * So i guess the idea here is to cause a full refresh of all the resouces
     * in the local repo
     *
     */
    public void add(IResource resource);

    /**
     * opens the repo corresponding to this project, sets the parent element of
     * the model to the IProject resource or if not exists
     * then Initializes a repository in the project
     *
     */
    public void remove(IResource resource);

    
    public void updateDependsLists(CookbookVersion cookbook);
}
