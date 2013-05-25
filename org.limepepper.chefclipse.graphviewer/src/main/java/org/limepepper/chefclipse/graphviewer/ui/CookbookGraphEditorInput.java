package org.limepepper.chefclipse.graphviewer.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import chefclipse.core.managers.ChefRepositoryManager;

public class CookbookGraphEditorInput implements IEditorInput {

    private final IResource resource;
    private CookbookVersion cookbook;
    
    public CookbookGraphEditorInput(@NonNull IResource resource)
    {
        this.resource=resource;
        cookbook = (CookbookVersion) ChefRepositoryManager
                .INSTANCE.getElement(resource);
    }
    
    public IResource getResource()
    {
        return resource;
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
    	return cookbook.getName()+ " Structure";
    }

    @Override
    public IPersistableElement getPersistable() {
        return null;
    }

    @Override
    public String getToolTipText() {
    	return cookbook.getName()+" Structure";
    }

/*    @Override
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
        if (!resource.getFullPath().equals(other.getResource()))
        {
            return false;
        }
        return true;
    }*/
}
