package org.limepepper.chefclipse.graphviewer.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class CookbookGraphEditorInput implements IEditorInput {

	private final String projectPath;
	
	public CookbookGraphEditorInput(String projectPath)
	{
		this.projectPath=projectPath;
	}
	
	public String getProjectPath()
	{
		return projectPath;
	}
	
	
	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "Cookbook Structure Graph Editor";
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		return "Cookbook Structure Graph Editor";
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if(!(obj instanceof CookbookGraphEditorInput))
        {
        	return false;
        }
        CookbookGraphEditorInput other = (CookbookGraphEditorInput) obj;
        if (!projectPath.equals(other.getProjectPath()))
        {
            return false;
        }
        return true;
    }
}
