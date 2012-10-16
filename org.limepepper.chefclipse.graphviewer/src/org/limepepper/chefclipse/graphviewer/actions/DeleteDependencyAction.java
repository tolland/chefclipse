package org.limepepper.chefclipse.graphviewer.actions;
 
import org.eclipse.jface.action.Action;

import org.limepepper.chefclipse.graphviewer.controller.DependencyController;

public class DeleteDependencyAction extends Action {
	private Object selectedRelation;
	public DeleteDependencyAction(Object selectedRelation)
	{
		this.setText("Delete Dependency");
		this.selectedRelation=selectedRelation;
	}
	
	@Override
	public void run() {
		DependencyController.getController().removeDependency(selectedRelation);
	}

	@Override
	public boolean isEnabled() {
		return selectedRelation!=null;
	}
}
