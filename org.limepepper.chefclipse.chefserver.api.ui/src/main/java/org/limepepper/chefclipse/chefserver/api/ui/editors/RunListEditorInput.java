package org.limepepper.chefclipse.chefserver.api.ui.editors;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.limepepper.chefclipse.common.chefserver.Node;

public class RunListEditorInput implements IEditorInput {
	
	public Node selectedNode;
	
	public RunListEditorInput(Node selectedNode)
	{
		this.selectedNode=selectedNode;
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return "RunList Editor";
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "RunList Editor";
	}

}
