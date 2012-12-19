package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.limepepper.chefclipse.common.ui.Activator;
import org.limepepper.chefclipse.model.ChefFile;
import org.limepepper.chefclipse.model.ChefFolder;
import org.limepepper.chefclipse.model.ChefProject;
import org.limepepper.chefclipse.model.ChefResource;
import org.limepepper.chefclipse.model.CookbookFolder;
import org.limepepper.chefclipse.model.ModelFactory;

public class ChefCore {

    public static ChefResource create(IResource resource) {

        try {
            if (resource instanceof IProject) {
                ChefProject eObject = ModelFactory.eINSTANCE
                        .createChefProject();
                eObject.setResource(resource);
                for (IResource member : ((IProject) resource).members()) {
                    ChefResource child = create(member);
                    eObject.getMembers().add(child);
                }
                return eObject;
            } else if (resource instanceof IFolder) {
                ChefFolder eObject = ModelFactory.eINSTANCE.createChefFolder();
                eObject.setResource(resource);
                for (IResource member : ((IFolder) resource).members()) {
                    ChefResource child = create(member);
                    eObject.getMembers().add(child);
                }
                return eObject;
            } else if (resource instanceof IFile) {
                ChefFile eObject = ModelFactory.eINSTANCE.createChefFile();
                eObject.setResource(resource);
                return eObject;
            }
        } catch (CoreException e) {
            Activator.log(e.getMessage());

        }
        return null;
    }

    public static Object createCookbook(IFolder resource) {

        try {
            if (resource instanceof IFolder) {
                CookbookFolder eObject = ModelFactory.eINSTANCE.createCookbookFolder();
                eObject.setResource(resource);
                for (IResource member : ((IFolder) resource).members()) {
                    ChefResource child = create(member);
                    eObject.getMembers().add(child);
                }
                return eObject;
            }
        } catch (CoreException e) {
            Activator.log(e.getMessage());

        }
        return null;
    }

}
