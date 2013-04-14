package chefclipse.core;

import org.eclipse.core.resources.IFile;

public class ChefFile extends ChefResource {

	public ChefFile(IFile resource) {
		super(resource);
	}

	public ChefFile(IFile iFile, ChefProject chefProject) {
		super(iFile);
	}

}
