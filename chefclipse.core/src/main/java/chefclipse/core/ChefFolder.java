package chefclipse.core;

import org.eclipse.core.resources.IFolder;

public class ChefFolder extends ChefContainer {

	public ChefFolder(IFolder iFolder, ChefProject chefProject) {
		super(iFolder);
	}

	@Override
	public boolean exists() {
		
		return false;
	}

	@Override
	public IChefElement getParent() {
		
		return null;
	}

}
