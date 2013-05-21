/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.commands.AddDataBagItemCommand;
import org.limepepper.chefclipse.databag.editor.dialogs.AddNewDataBagItemDialog;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor.ViewerProvider;

/**
 * Adds a new {@link DataBagItem} to the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class AddJsonPropertyAction extends Action {
    
    private static final String ADD_PROPERTY_TOOLTIP = "Add a new property to the current editor";
    private static final String ADD_PROPERTY_ITEM_ACTION = "Add new JSON property";
    private ViewerProvider viewerProvider;
    private Map<String, JsonNode> dataBagItemsMap;

    public AddJsonPropertyAction(ViewerProvider viewerProvider, Map<String, JsonNode> nodesMap) {
        setId(ADD_PROPERTY_ITEM_ACTION);
        setToolTipText(ADD_PROPERTY_TOOLTIP);
        setText(ADD_PROPERTY_ITEM_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
        this.viewerProvider = viewerProvider;
        this.dataBagItemsMap = nodesMap;
    }
    
    @Override
    public void run() {
        AddNewDataBagItemDialog addDataBagItemDialog = new AddNewDataBagItemDialog(Display.getCurrent().getActiveShell(), null, false);
        int open = addDataBagItemDialog.open();
        if (open == IDialogConstants.OK_ID) {
            final String dataBagItemName = addDataBagItemDialog.getDataBagitemName();
            Command addDataBagItemCommand = new AddDataBagItemCommand(viewerProvider, dataBagItemsMap);
//            viewerProvider.getViewer()
            
        }
    }
}
