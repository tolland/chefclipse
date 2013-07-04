package chefclipse.core;

import org.eclipse.core.resources.IResource;

public class ChefResource implements IChefResource, IChefElement {

	private IResource resource;

	ChefResource(IResource resource) {

		this.resource = resource;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public chefclipse.core.IChefElement getParent() {
		return null;
	}

	@Override
	public IResource getResource() {
		return resource;
	}

}
