/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor.ViewerProvider;

/**
 * Removes the selected JSON property for all the opened data bag items
 * 
 * @author Sebastian Sampaoli
 */
public class RemoveJsonPropertyAction extends Action {
    
    private static final String REMOVE_JSON_PROPERTY_TOOLTIP = "Remove the selected JSON property for all the opened data bag items";
    private static final String REMOVE_JSON_PROPERTY_ACTION = "Remove property";
    private ViewerProvider viewerProvider;

    public RemoveJsonPropertyAction(ViewerProvider viewerProvider) {
        setId(REMOVE_JSON_PROPERTY_ACTION);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
        this.viewerProvider = viewerProvider;
    }
    
}
