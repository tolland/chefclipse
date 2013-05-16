/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.Activator;

/**
 * Provides the value and image for a {@link DataBagItem}.
 * 
 * @author Sebastian Sampaoli
 */
public class DataBagLabelProvider extends ColumnLabelProvider {

    private Map<String, JsonNode> dataBagItemsMap;

    public DataBagLabelProvider(Map<String, JsonNode> nodesMap) {
        this.dataBagItemsMap = nodesMap;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void update(final ViewerCell cell) {
        final Entry<String, JsonNode> entryElement = (Entry<String, JsonNode>) cell.getElement();
        if (cell.getColumnIndex() == 0) {
            cell.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
            cell.setImage(getImage(entryElement, cell.getColumnIndex()));
            cell.setText(getText(entryElement, cell.getColumnIndex()));
        } else {
            cell.setText(getText(entryElement, cell.getColumnIndex()));
        }
    }

    private Image getImage(Entry<String, JsonNode> entryElement, int columnIndex) {
        if (columnIndex == 0) {
            boolean hasChildren = DataBagEditorManager.INSTANCE.hasChildren(entryElement,
                    dataBagItemsMap);
            ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
            if (hasChildren) {
                return imageRegistry
                        .getDescriptor(Activator.JSON_OBJECT).createImage();
            }
            return imageRegistry
                    .getDescriptor(Activator.JSON_FIELD).createImage();
        }
        return null;
    }

    private String getText(Entry<String, JsonNode> entryElement, int columnIndex) {
        if (columnIndex == 0) {
            return entryElement.getKey();
        }
        ArrayList<Entry<String, JsonNode>> entries = new ArrayList<Entry<String, JsonNode>>(
                dataBagItemsMap.entrySet());
        String dataBagItemName = entries.get(columnIndex - 1).getKey();
        JsonNode propertyValue = DataBagEditorManager.INSTANCE.getValue(entryElement,
                dataBagItemName);
        if (propertyValue != null) {
            if (propertyValue.isValueNode()) {
                return propertyValue.asText();
            }
            return propertyValue.toString();
        }
        return "";
    }
}
