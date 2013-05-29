/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;

/**
 * Removes the selected JSON property for all the opened data bag items.
 * 
 * @author Sebastian Sampaoli
 */
public class RemoveJsonPropertyAction extends CommandActionHandler {

    private static final String REMOVE_JSON_PROPERTY_TOOLTIP =
            "Remove the selected JSON property for all the opened data bag items";
    private static final String REMOVE_JSON_PROPERTY_ACTION = "Remove JSON property";
    public static final String ID = REMOVE_JSON_PROPERTY_ACTION;

    public RemoveJsonPropertyAction(EditingDomain editingDomain) {
        super(editingDomain, REMOVE_JSON_PROPERTY_ACTION);
        setId(ID);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
    }

    @Override
    public Command createCommand(Collection<?> selection) {
        CompoundCommand deleteCompoundCommand = new CompoundCommand();
        for (Object object: selection) {
            EObject entryElement = (EObject) object;
            Collection<EObject> eObjects = DataBagEditorManager.INSTANCE.getEObjectsOfKey(entryElement, domain.getResourceSet().getResources());
            for (EObject value : eObjects) {
                deleteCompoundCommand.append(DeleteCommand.create(domain, value));
            }
            deleteCompoundCommand.append(DeleteCommand.create(domain, entryElement));
        }
        return deleteCompoundCommand;
    }
    
    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }

}
