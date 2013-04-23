/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editors;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * @author Sebastian Sampaoli
 *
 */
public class DataBagLabelProvider extends CellLabelProvider {

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.CellLabelProvider#update(org.eclipse.jface.viewers.ViewerCell)
     */
    @Override
    public void update(ViewerCell cell) {
        final Object element = cell.getElement();
        cell.setText(getText(element));
    }

    private String getText(Object element) {
        DataBagItem dataBagItem = (DataBagItem) element;
        return dataBagItem.getName();
    }

}
