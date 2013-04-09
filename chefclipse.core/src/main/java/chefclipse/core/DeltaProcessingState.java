package chefclipse.core;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;

public class DeltaProcessingState implements IResourceChangeListener {

	@Override
	public void resourceChanged(IResourceChangeEvent event) {

		// ChefModelManager.getChefModelManager().getChefModel().getChefProject();
		System.out.println("processing delta state");

	}

}
