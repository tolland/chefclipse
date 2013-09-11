/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * Input for the {@link MultiPageStructuredJsonEditor}.
 * 
 * @author Sebastian Sampaoli
 * 
 */
public class StructuredJsonEditorInput implements IEditorInput {

    private String name;
    private IFolder parentFolder;
    private List<IFile> jsonFiles;

    public StructuredJsonEditorInput() {
    	this.jsonFiles = new ArrayList<IFile>();
    }
	/* (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class adapter) {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IEditorInput#exists()
     */
    @Override
    public boolean exists() {
        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
     */
    @Override
    public ImageDescriptor getImageDescriptor() {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IEditorInput#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IEditorInput#getPersistable()
     */
    @Override
    public IPersistableElement getPersistable() {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IEditorInput#getToolTipText()
     */
    @Override
    public String getToolTipText() {
        return "Displays a JSON File or a collection of JSON files";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StructuredJsonEditorInput other = (StructuredJsonEditorInput) obj;
        if (name != other.name)
            return false;
        return true;
    }
    
    public IFolder getParentFolder() {
        return parentFolder;
    }
    public void setParentFolder(IFolder parentFolder) {
        this.parentFolder = parentFolder;
    }
    
	public List<IFile> getJSONFiles() {
		return jsonFiles;
	}
	public void setJSONFiles(List<IFile> jsonFiles) {
		this.jsonFiles = jsonFiles;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean contains(IFile file) {
		try {
			for (IResource iResource : getParentFolder().members()) {
				if (iResource instanceof IFile) {
					if (file.getRawLocation().equals(iResource.getRawLocation())){
						return true;
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return false;
	}
}
