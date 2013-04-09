package chefclipse.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

public class ChefProject implements IChefProject {

	public ChefProject(IProject project, ChefModel chefModel) {
		// TODO Auto-generated constructor stub
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

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean hasChefNature(IProject project) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() throws ChefModelException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open(IProgressMonitor progress) throws ChefModelException {
		// TODO Auto-generated method stub
		
	}

}
