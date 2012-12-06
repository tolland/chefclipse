package org.limepepper.chefclipse.graphviewer.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class DependencyGraphEditorInput implements IEditorInput {

    private final IResource resource;
    
    public DependencyGraphEditorInput(IResource resource)
    {
        this.resource=resource;
    }
    
    public IResource getProjectPath()
    {
        return resource;
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
        if (!resource.getFullPath().equals(other.getProjectPath()))
        {
            return false;
        }
        return true;
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

}
