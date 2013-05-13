/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor.ViewerProvider;

/**
 * Adds a new {@link DataBagItem} to the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class AddNewDataBagItemAction extends Action {
    
    private static final String ADD_DATA_BAG_ITEM_TOOLTIP = "Add a new data bag item to the current editor";
    private static final String ADD_DATA_BAG_ITEM_ACTION = "Add new Data Bag item";
    private ViewerProvider viewerProvider;

    public AddNewDataBagItemAction(ViewerProvider viewerProvider) {
        setId(ADD_DATA_BAG_ITEM_ACTION);
        setToolTipText(ADD_DATA_BAG_ITEM_TOOLTIP);
        setText(ADD_DATA_BAG_ITEM_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
        this.viewerProvider = viewerProvider;
    }
    
}
