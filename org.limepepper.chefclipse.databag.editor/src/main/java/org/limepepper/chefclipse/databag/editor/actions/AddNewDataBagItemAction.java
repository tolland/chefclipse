/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
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
public class AddNewDataBagItemAction extends Action {
    
    private static final String ADD_DATA_BAG_ITEM_TOOLTIP = "Add a new data bag item to the current editor";
    private static final String ADD_DATA_BAG_ITEM_ACTION = "Add new Data Bag item";
    private Map<String, JsonNode> dataBagItemsMap;

    public AddNewDataBagItemAction() {
        setId(ADD_DATA_BAG_ITEM_ACTION);
        setToolTipText(ADD_DATA_BAG_ITEM_TOOLTIP);
        setText(ADD_DATA_BAG_ITEM_ACTION);
        ImageDescriptor descriptor = Activator.getDefault().getImageRegistry().getDescriptor(Activator.DATA_BAG_EDITOR);
        ImageDescriptor addImageOverlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.ADD_DATA_BAG_ITEM_OVERLAY);
        setImageDescriptor(DataBagEditorUtil.INSTANCE.getOverlayImageDescriptor(descriptor, addImageOverlay));
    }
    
    @Override
    public void run() {
        AddNewDataBagItemDialog addDataBagItemDialog = new AddNewDataBagItemDialog(Display.getCurrent().getActiveShell(), null, false);
        int open = addDataBagItemDialog.open();
        if (open == IDialogConstants.OK_ID) {
            final String dataBagItemName = addDataBagItemDialog.getDataBagitemName();
            Command addDataBagItemCommand = new AddDataBagItemCommand(dataBagItemsMap);
//            viewerProvider.getViewer()
            
        }
    }
}
