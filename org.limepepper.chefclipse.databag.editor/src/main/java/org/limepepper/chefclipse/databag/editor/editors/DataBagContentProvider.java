/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.IteratorUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Content provider which provides the JSON structure of a
 * {@link DataBag} or a {@link DataBagItem} to a Data Bag editor.
 * 
 * @author Sebastian Sampaoli
 */
public class DataBagContentProvider implements ITreeContentProvider {

    private JsonNode fieldsNode;
    private Map<String, JsonNode> nodesMap;
    private ObjectMapper mapper;

    public DataBagContentProvider() {

    }

    public DataBagContentProvider(Map<String, JsonNode> nodesMap) {
        this.nodesMap = nodesMap;
        mapper = new ObjectMapper();
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.viewers.IContentProvider#dispose()
     */
    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
     * .viewers.Viewer, java.lang.Object, java.lang.Object)
     */
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        fieldsNode = (JsonNode) newInput;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.
     * Object)
     */
    @Override
    public Object[] getElements(Object inputElement) {
        if (inputElement instanceof JsonNode) {
            JsonNode node = (JsonNode) inputElement;
            return IteratorUtils.toList(node.getFields()).toArray();
        }
        throw new IllegalArgumentException(
                "The Data Bag editor input must be a Json node.");

    }

    /**
     * Returns the children of the given field node.
     * 
     * @param parentElement the parent entry
     * @return an array of children for the given field entry
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object[] getChildren(Object parentElement) {
        Entry<String, JsonNode> parentNodeEntry = (Entry<String, JsonNode>) parentElement;
        Map<String, JsonNode> childrenMap = new LinkedHashMap<String, JsonNode>();
        ArrayNode childrenArray = (ArrayNode) parentNodeEntry.getValue();
        for (Iterator<JsonNode> children = childrenArray.getElements(); children.hasNext(); ) {
            JsonNode child = children.next();
            //below the field list is obtained, it must have only one element, we don't need to check that.
            List<Entry<String, JsonNode>> fieldList = IteratorUtils.toList(child.getFields());
            Entry<String, JsonNode> childEntry = fieldList.get(0);
            if (!nodesMap.containsKey(childEntry.getKey()) && childEntry.getValue().isArray() && ((ArrayNode)childEntry.getValue()).size() > 0) {
                childrenMap.put(childEntry.getKey(), childEntry.getValue());
            }
        }
        return childrenMap.entrySet().toArray();
    }

    /**
     * Returns whether the given field has children or not.
     * 
     * @param parentElement the field to check if contains children or not
     * @return true if the given parentElement contains children, false
     *         otherwise
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean hasChildren(Object parentElement) {
        Entry<String, JsonNode> parentNodeEntry = (Entry<String, JsonNode>) parentElement;
        JsonNode valueNode = parentNodeEntry.getValue();
        if (valueNode.isArray()) {
            ArrayNode childrenArray = (ArrayNode) valueNode;
            for (Iterator<JsonNode> children = childrenArray.getElements(); children.hasNext(); ) {
                JsonNode child = children.next();
                //below the field list is obtained, it must have only one element, we don't need to check that.
                List<Entry<String, JsonNode>> fieldList = IteratorUtils.toList(child.getFields());
                Entry<String, JsonNode> childEntry = fieldList.get(0);
                if (!nodesMap.containsKey(childEntry.getKey()) && childEntry.getValue().isArray() && ((ArrayNode)childEntry.getValue()).size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Returns the parent of the given field.
     * 
     * @param child the child to look for the parent
     * @return a parent for the given field entry
     */
    @SuppressWarnings("unchecked")
    @Override
    public Entry<String, JsonNode> getParent(Object child) {
        Entry<String, JsonNode> childNodeEntry = (Entry<String, JsonNode>) child;
        ObjectNode childNode = mapper.createObjectNode();
        childNode.put(childNodeEntry.getKey(), childNodeEntry.getValue());
        for (Iterator<Entry<String, JsonNode>> fields = fieldsNode.getFields(); fields.hasNext(); ) {
            Entry<String, JsonNode> fieldEntry = fields.next();
            if (fieldEntry.getKey().equals(childNodeEntry.getKey()) && fieldEntry.getValue().equals(childNodeEntry.getValue())) {
                return null;
            }
            Entry<String, JsonNode> parent = getParent(fieldEntry, childNodeEntry);
            if (parent != null) {
                return parent;
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    private Entry<String, JsonNode> getParent(Entry<String, JsonNode> parentEntry, Entry<String, JsonNode> childNodeEntry) {
        JsonNode parentValue = parentEntry.getValue();
        if (parentValue.isArray()) {
            ArrayNode parentArray = (ArrayNode) parentValue;
            for (Iterator<JsonNode> elements = parentArray.getElements(); elements.hasNext(); ) {
                JsonNode element = elements.next();
                List<Entry<String, JsonNode>> elementFields = IteratorUtils.toList(element.getFields());
                if (elementFields.size() > 0) {
                    Entry<String, JsonNode> firstElementInArray = elementFields.get(0);
                    if (elementFields.size() == 1 && firstElementInArray.getValue().isArray()) {
                        if (firstElementInArray.getKey().equals(childNodeEntry.getKey()) && ((ArrayNode)firstElementInArray.getValue()).equals(childNodeEntry.getValue())) {
                            return parentEntry;
                        }
                        Entry<String, JsonNode> parent = getParent(firstElementInArray, childNodeEntry);
                        if (parent != null) {
                            return parent;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }
}
