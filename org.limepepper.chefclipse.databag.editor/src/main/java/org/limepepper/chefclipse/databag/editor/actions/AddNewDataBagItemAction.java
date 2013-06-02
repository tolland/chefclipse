/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.Activator;
import org.limepepper.chefclipse.databag.editor.commands.AddDataBagItemCommand;
import org.limepepper.chefclipse.databag.editor.dialogs.AddNewDataBagItemDialog;
import org.limepepper.chefclipse.databag.editor.utils.DataBagEditorUtils;

/**
 * Adds a new {@link DataBagItem} to the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class AddNewDataBagItemAction extends CommandActionHandler {
    
    private static final String ADD_DATA_BAG_ITEM_TOOLTIP = "Add a new data bag item to the current editor";
    private static final String ADD_DATA_BAG_ITEM_ACTION = "Add new Data Bag item";
    public static final String ID = ADD_DATA_BAG_ITEM_ACTION;
    private IFolder parentFolder;

    public AddNewDataBagItemAction(EditingDomain editingDomain, IFolder parentFolder) {
        super(editingDomain, ADD_DATA_BAG_ITEM_ACTION);
        this.parentFolder = parentFolder;
        setId(ID);
        setToolTipText(ADD_DATA_BAG_ITEM_TOOLTIP);
        setText(ADD_DATA_BAG_ITEM_ACTION);
        ImageDescriptor descriptor = Activator.getDefault().getImageRegistry().getDescriptor(Activator.DATA_BAG_EDITOR);
        ImageDescriptor addImageOverlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.ADD_DATA_BAG_ITEM_OVERLAY);
        setImageDescriptor(DataBagEditorUtils.INSTANCE.getOverlayImageDescriptor(descriptor, addImageOverlay));
    }
    
    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }
    
    @Override
    public Command createCommand(Collection<?> selection) {
        Command addDataBagItemCommand = new AddDataBagItemCommand(domain);
        return addDataBagItemCommand;
    }
    
    @Override
    public void run() {
      AddNewDataBagItemDialog addDataBagItemDialog = new AddNewDataBagItemDialog(Display.getCurrent().getActiveShell(), null, false);
      int open = addDataBagItemDialog.open();
      if (open == IDialogConstants.OK_ID) {
          String dataBagItemName = addDataBagItemDialog.getDataBagitemName();
          if (!dataBagItemName.toLowerCase().endsWith(".json")) {
              dataBagItemName = dataBagItemName + ".json";
          }
          IPath dbItemPath = parentFolder.getFullPath().append(dataBagItemName);
          Command addDataBagItemCommand = new AddDataBagItemCommand(domain, dbItemPath);
          domain.getCommandStack().execute(addDataBagItemCommand);
      }
      
    }
}
