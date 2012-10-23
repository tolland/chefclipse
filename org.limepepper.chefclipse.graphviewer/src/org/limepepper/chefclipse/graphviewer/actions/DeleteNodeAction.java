package org.limepepper.chefclipse.graphviewer.actions;

import org.eclipse.jface.action.Action;
import org.limepepper.chefclipse.graphviewer.controller.DependencyController;


public class DeleteNodeAction extends Action {

	private Object selectedElement;
	public DeleteNodeAction(Object selectedNode)
	{
		this.setText("Delete Node");
		selectedElement=selectedNode;
	}
	
	@Override
	public void run() {
		DependencyController.getController().removeNode(selectedElement);
	}

	@Override
	public boolean isEnabled() {
		return selectedElement!=null;
	}
}
