/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.Activator;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.utils.DataBagEditorUtils;

/**
 * Removes the selected JSON property for all the opened data bag items
 * 
 * @author Sebastian Sampaoli
 */
public class RemoveDataBagItemAction extends CommandActionHandler {

    private static final String REMOVE_JSON_PROPERTY_TOOLTIP = "Remove the selected data bag item";
    private static final String REMOVE_JSON_PROPERTY_ACTION = "Remove data bag item";
    public static final String ID = REMOVE_JSON_PROPERTY_ACTION;
    private IWorkbenchPart editor;

    public RemoveDataBagItemAction(EditingDomain editingDomain) {
        super(editingDomain, REMOVE_JSON_PROPERTY_ACTION);
        setId(ID);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        ImageDescriptor descriptor = Activator.getDefault().getImageRegistry()
                .getDescriptor(Activator.DATA_BAG_EDITOR);
        ImageDescriptor removeImageOverlay = PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE);
        setImageDescriptor(DataBagEditorUtils.INSTANCE.getOverlayImageDescriptor(descriptor,
                removeImageOverlay));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
    }
    
    @Override
    public boolean isEnabled() {
        DataBagItem selectedDataBagItem = ((DataBagColumnEditor) editor).getSelectedDataBagItem();
        return (selectedDataBagItem != null);
    }

    @Override
    public Command createCommand(Collection<?> selection) {
        DataBagItem selectedDataBagItem = ((DataBagColumnEditor) editor).getSelectedDataBagItem();
        URI itemURI = URI.createPlatformResourceURI(selectedDataBagItem.getJsonResource()
                .getFullPath().toOSString(), false);
        Resource dataBagItemResource = getResourceFromURI(itemURI);
        return DeleteCommand.create(domain, dataBagItemResource);
        
//        CompoundCommand deleteCompoundCommand = new CompoundCommand();
//        DataBagItem selectedDataBagItem = ((DataBagColumnEditor) editor).getSelectedDataBagItem();
//        Collection<EObject> eObjects = DataBagEditorManager.INSTANCE.getEObjectsOfKey(selectedDataBagItem, domain.getResourceSet().getResources());
//        for (EObject value : eObjects) {
//            deleteCompoundCommand.append(DeleteCommand.create(domain, value));
//        }
//        return deleteCompoundCommand;
//        deleteCompoundCommand.append(DeleteCommand.create(domain, entryElement));
//        for (Object object: selection) {
//            EObject entryElement = (EObject) object;
//            Collection<EObject> eObjects = DataBagEditorManager.INSTANCE.getEObjectsOfKey(entryElement, domain.getResourceSet().getResources());
//            for (EObject value : eObjects) {
//                deleteCompoundCommand.append(DeleteCommand.create(domain, value));
//            }
//            deleteCompoundCommand.append(DeleteCommand.create(domain, entryElement));
//        }
//        return deleteCompoundCommand;
//        DataBagItem selectedDataBagItem = ((DataBagColumnEditor) editor).getSelectedDataBagItem();
//        URI itemURI = URI.createPlatformResourceURI(selectedDataBagItem.getJsonResource().getFullPath().toOSString(), false);
//        Resource dataBagItemResource = getResourceFromURI(itemURI);
//        return DeleteCommand.create(domain, dataBagItemResource);
        
//        for (Object object: selection) {
//            EObject entryElement = (EObject) object;
//            Collection<EObject> eObjects = DataBagEditorManager.INSTANCE.getEObjectsOfKey(entryElement, domain.getResourceSet().getResources());
//            for (EObject value : eObjects) {
//                deleteCompoundCommand.append(DeleteCommand.create(domain, value));
//            }
//            deleteCompoundCommand.append(DeleteCommand.create(domain, entryElement));
//        }
//        return deleteCompoundCommand;
//        
//        return DeleteCommand.create(domain, selection);
//        for (Object object : selection) {
//            Resource item = (Resource) object;
//            
//        }
//        return null;
    }
    
    private Resource getResourceFromURI(URI itemURI) {
        EList<Resource> resources = getEditingDomain().getResourceSet().getResources();
        for (Iterator<Resource> it = resources.iterator(); it.hasNext(); ) {
            Resource resource = it.next();
            if (resource.getURI().equals(itemURI)) {
                return resource;
            }
        }
        return null;
    }

    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            editor = workbenchPart;
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }
}
