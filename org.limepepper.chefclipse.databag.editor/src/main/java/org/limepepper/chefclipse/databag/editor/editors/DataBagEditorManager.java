/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editors;

import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * @author Sebastian Sampaoli
 *
 */
public enum DataBagEditorManager {
    
    INSTANCE;
    
    public void doSomething() {
        
    }

    public Object[] getElements(Object inputElement) {
        if (inputElement instanceof DataBag) {
            DataBag dataBag = (DataBag) inputElement;
            return dataBag.getItems().toArray();
        } else if (inputElement instanceof DataBagItem) {
            DataBagItem dataBagItem = (DataBagItem) inputElement;
            return new Object[]{dataBagItem};
        }
        return null;
    }
}
