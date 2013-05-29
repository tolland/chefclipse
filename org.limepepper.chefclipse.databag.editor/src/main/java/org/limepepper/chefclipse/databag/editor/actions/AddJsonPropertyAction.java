/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Adds a new {@link DataBagItem} to the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class AddJsonPropertyAction extends CommandActionHandler {
    
    private static final String ADD_PROPERTY_TOOLTIP = "Add a new property to the current editor";
    private static final String ADD_PROPERTY_ITEM_ACTION = "Add new JSON property";
    public static final String ID = ADD_PROPERTY_ITEM_ACTION;

    public AddJsonPropertyAction(EditingDomain editingDomain) {
        super(editingDomain, ADD_PROPERTY_ITEM_ACTION);
        setId(ID);
        setToolTipText(ADD_PROPERTY_TOOLTIP);
        setText(ADD_PROPERTY_ITEM_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
    }
    
    @Override
    public Command createCommand(Collection<?> selection) {
        return DeleteCommand.create(domain, selection);
    }

    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }
    
//    @Override
//    public void run() {
//        AddNewDataBagItemDialog addDataBagItemDialog = new AddNewDataBagItemDialog(Display.getCurrent().getActiveShell(), null, false);
//        int open = addDataBagItemDialog.open();
//        if (open == IDialogConstants.OK_ID) {
//            final String dataBagItemName = addDataBagItemDialog.getDataBagitemName();
//            Command addDataBagItemCommand = new AddDataBagItemCommand();
////            viewerProvider.getViewer()
//            
//        }
//    }
}
