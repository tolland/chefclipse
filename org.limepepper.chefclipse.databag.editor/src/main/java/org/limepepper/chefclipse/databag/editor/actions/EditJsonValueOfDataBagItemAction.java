/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import org.eclipse.jface.action.Action;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.Activator;

/**
 * Edits the value of a certain JSON property for a {@link DataBagItem}
 * in the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class EditJsonValueOfDataBagItemAction extends Action {
    
    private static final String EDIT_JSON_VALUE_TOOLTIP = "Edit the value of the selected JSON property for the current data bag item";
    private static final String EDIT_JSON_VALUE_ACTION = "Edit value";

    public EditJsonValueOfDataBagItemAction() {
        setId(EDIT_JSON_VALUE_ACTION);
        setToolTipText(EDIT_JSON_VALUE_TOOLTIP);
        setText(EDIT_JSON_VALUE_ACTION);
        setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(Activator.EDIT_JSON_VALUE));
    }
    
}
