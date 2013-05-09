package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.ui.Activator;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import chefclipse.core.ChefFile;
import chefclipse.core.ChefFolder;
import chefclipse.core.ChefProject;
import chefclipse.core.ChefResource;
import chefclipse.core.CookbookFolder;

public class ChefCore {

	public static ChefResource create(IResource resource) {

		try {
			if (resource instanceof IProject) {
				ChefProject eObject = new ChefProject((IProject) resource);

				for (IResource member : ((IProject) resource).members()) {
					ChefResource child = create(member);
					// eObject.getMembers().add(child);
				}
				return null;

			}
		} catch (CoreException e) {
			Activator.log(e.getMessage());

		}
		return null;
	}

	public static Object createCookbook(IFolder resource) {

		try {
			if (resource instanceof IFolder) {
				// CookbookFolder eObject = ModelFactory.eINSTANCE
				// .createCookbookFolder();
				// eObject.setResource(resource);
				for (IResource member : ((IFolder) resource).members()) {
					ChefResource child = create(member);
					// eObject.getMembers().add(child);
				}
				return null;
			}
		} catch (CoreException e) {
			Activator.log(e.getMessage());

		}
		return null;
	}

	public static Object createDataBag(IFolder resource) {
		ChefRepositoryManager instance = ChefRepositoryManager.INSTANCE;
		EObject element = instance.getElement(resource);
		if (element != null) {
			return element;
		} else {
			try {
				return instance.createDataBag(resource);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}
	}

	public static Object createDataBagItem(IFile resource) {
		ChefRepositoryManager instance = ChefRepositoryManager.INSTANCE;
		EObject element = instance.getElement(resource);
		if (element != null) {
			return element;
		} else {
			return instance.createDataBagItem(resource);
		}
	}
}
