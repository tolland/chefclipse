/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editors;

import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Input for the {@link MultiPageDataBagEditor}.
 * 
 * @author Sebastian Sampaoli
 * 
 */
public class DataBagEditorInput implements IEditorInput {

    private EObject eObject;
    private String name;
    private Map<String, JsonNode> nodesMap;
    private IFolder parentFolder;

    public DataBagEditorInput(EObject eObject, Map<String, JsonNode> nodesMap) {
        this.seteObject(eObject);
        if (eObject instanceof DataBag) {
            DataBag dataBag = (DataBag) eObject;
            name = dataBag.getName();
            setParentFolder((IFolder) dataBag.getResource());
        } else if (eObject instanceof DataBagItem) {
            DataBagItem dataBagItem = (DataBagItem) eObject;
            name =  dataBagItem.getName();
            setParentFolder((IFolder) dataBagItem.getJsonResource().getParent());
        }
        this.nodesMap = nodesMap;
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
    public Map<String, JsonNode> getNodesMap() {
        return nodesMap;
    }
    public void setNodesMap(Map<String, JsonNode> nodesMap) {
        this.nodesMap = nodesMap;
    }
    public IFolder getParentFolder() {
        return parentFolder;
    }
    public void setParentFolder(IFolder parentFolder) {
        this.parentFolder = parentFolder;
    }
}
