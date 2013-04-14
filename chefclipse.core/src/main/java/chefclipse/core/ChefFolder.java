package chefclipse.core;

import org.eclipse.core.resources.IFolder;

public class ChefFolder extends ChefContainer {

	public ChefFolder(IFolder iFolder, ChefProject chefProject) {
		super(iFolder);
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IChefElement getParent() {
		// TODO Auto-generated method stub
		return null;
	}

}
