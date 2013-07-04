package chefclipse.core;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;

public class CookbookFolder extends ChefResource {

	CookbookFolder(IResource resource) {
		super(resource);
	}

	public IFolder getResource() {
		return null;
	}

}
