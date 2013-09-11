/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.actions;

import org.eclipse.jface.action.Action;
import org.limepepper.chefclipse.structured.json.editor.StructuredJsonEditorActivator;

/**
 * Edits the value of a certain JSON property for a JSON file
 * in the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class EditJsonValueOfJsonFileAction extends Action {
    
    private static final String EDIT_JSON_VALUE_TOOLTIP = "Edit the value of the selected JSON property for the current JSON file";
    private static final String EDIT_JSON_VALUE_ACTION = "Edit value";

    public EditJsonValueOfJsonFileAction() {
        setId(EDIT_JSON_VALUE_ACTION);
        setToolTipText(EDIT_JSON_VALUE_TOOLTIP);
        setText(EDIT_JSON_VALUE_ACTION);
        setImageDescriptor(StructuredJsonEditorActivator.getDefault().getImageRegistry().getDescriptor(StructuredJsonEditorActivator.EDIT_JSON_VALUE));
    }
    
}
