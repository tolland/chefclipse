/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editors;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author Sebastian Sampaoli
 *
 */
public class DataBagLabelProvider extends LabelProvider implements ITableLabelProvider {

    private Map<String, JsonNode> dataBagItemsMap;

    public DataBagLabelProvider(Map<String, JsonNode> nodesMap) {
        this.dataBagItemsMap = nodesMap;
    }

    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public String getColumnText(Object element, int columnIndex) {
        final Entry<String, JsonNode> entryElement = (Entry<String, JsonNode>) element;
        if (columnIndex == 0) {
            return entryElement.getKey();
        }
        ArrayList<Entry<String, JsonNode>> entries = new ArrayList<Entry<String, JsonNode>>(dataBagItemsMap.entrySet());
        String dataBagItemName = entries.get(columnIndex - 1).getKey();
        JsonNode propertyValue = DataBagEditorManager.INSTANCE.getValue(entryElement, dataBagItemName);
        if (propertyValue != null) {
            if (propertyValue.isValueNode()) {
                return propertyValue.asText();
            }
            return propertyValue.toString();
        }
        return "";
    }

}
