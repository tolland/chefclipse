package chefclipse.core;

public class ChefResource implements IChefResource, IChefElement {

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public chefclipse.core.IChefElement getParent() {
		return null;
	}

}
