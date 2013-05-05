/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * @author Sebastian Sampaoli
 *
 */
public class DataBagEditorInput implements IEditorInput {

    private EObject eObject;
    private String name;

    public DataBagEditorInput(EObject eObject) {
        this.seteObject(eObject);
        if (eObject instanceof DataBag) {
            name = ((DataBag) eObject).getName();
        } else if (eObject instanceof DataBagItem) {
            name =  ((DataBagItem) eObject).getName();
        }
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
        return "Displays a Data Bag";
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
        DataBagEditorInput other = (DataBagEditorInput) obj;
        if (name != other.name)
            return false;
        return true;
    }
    
    public EObject geteObject() {
        return eObject;
    }
    
    public void seteObject(EObject eObject) {
        this.eObject = eObject;
    }
}