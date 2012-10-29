package org.limepepper.chefclipse.graphviewer.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class DependencyGraphEditorInput implements IEditorInput {

	private final String projectPath;
	
	public String getProjectPath()
	{
		return projectPath;
	}
	
	public DependencyGraphEditorInput(String projectPath)
	{
		this.projectPath=projectPath;
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return "Dependency Graph Editor";
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "Dependency Graph Editor";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        DependencyGraphEditorInput other = (DependencyGraphEditorInput) obj;
        if (!projectPath.equals(other.getProjectPath()))
        {
            return false;
        }
        return true;
    }

}
