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
 * Content provider which provides the JSON structure (the keys) of a
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

//    /**
//     * Returns the children of the given field node.
//     * 
//     * @param parentNodeEntry the parent entry
//     * @return an array of children for the given field entry
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public Object[] getChildren(Object parentElement) {
//        Map<String, JsonNode> childrenMap = new HashMap<String, JsonNode>();
//        Entry<String, JsonNode> parentNodeEntry = (Entry<String, JsonNode>) parentElement;
//        JsonNode valueNode = parentNodeEntry.getValue();
//        for (String fileName : nodesMap.keySet()) {
//            JsonNode childNode = valueNode.findValue(fileName);
//            if (childNode != null && childNode.isObject() && childNode.size() > 0) {
//                createChildrenFromNode(childrenMap, fileName, childNode);
//            }
//        }
//        return childrenMap.entrySet().toArray();
//    }
    /**
     * Returns the children of the given field node.
     * 
     * @param parentNodeEntry the parent entry
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

//    private void createChildrenFromNode(Map<String, JsonNode> childrenMap,
//            String fileName, JsonNode childNode) {
//        ObjectMapper mapper = new ObjectMapper();
//        for (Iterator<String> fieldNames = childNode.getFieldNames(); fieldNames.hasNext();) {
//            String fieldName = fieldNames.next();
//            if (childrenMap.containsKey(fieldName)) {
//                ArrayNode childrenNodes = (ArrayNode) childrenMap.get(fieldName);
//                ObjectNode newChildNode = mapper.createObjectNode();
//                newChildNode.put(fileName, childNode.path(fieldName));
//                childrenNodes.add(newChildNode);
//            } else {
//                childrenMap.put(fieldName, mapper.createArrayNode());
//                ArrayNode childrenNodes = (ArrayNode) childrenMap.get(fieldName);
//                ObjectNode newChildNode = mapper.createObjectNode();
//                newChildNode.put(fileName, childNode.path(fieldName));
//                childrenNodes.add(newChildNode);
//            }
//        }
//    }

//    /**
//     * Returns whether the given field has children or not.
//     * 
//     * @param childNodeEntry the field to check if contains children or not
//     * @return true if the given childNodeEntry contains children, false
//     *         otherwise
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public boolean hasChildren(Object element) {
//        Entry<String, JsonNode> parentNodeEntry = (Entry<String, JsonNode>) element;
//        JsonNode valueNode = parentNodeEntry.getValue();
//        if (valueNode.isArray()) {
//            for (String fileName : nodesMap.keySet()) {
//                JsonNode childNode = valueNode.findValue(fileName);
//                if (childNode != null && childNode.isObject() && childNode.size() > 0) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    
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
            return null;
        }
        return null;
    }

//    /**
//     * Returns the parent of the given field.
//     * 
//     * @param child the child to look for the parent
//     * @return a parent for the given field entry
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public Entry<String, JsonNode> getParent(Object child) {
//        Entry<String, JsonNode> childNodeEntry = (Entry<String, JsonNode>) child;
//        ObjectNode childNode = mapper.createObjectNode();
//        childNode.put(childNodeEntry.getKey(), childNodeEntry.getValue());
//        List<JsonNode> possibleParents = fieldsNode.findParents(childNodeEntry.getKey());
//        for (JsonNode parent : possibleParents) {
//            List<Entry<String, JsonNode>> fields = IteratorUtils.toList(parent.getFields());
//            for (Entry<String, JsonNode> parentEntry : fields) {
//                if (parentEntry.getValue().isArray()) {
//                    ArrayNode parentValueArray = (ArrayNode) parentEntry.getValue();
//                    if (containsChild(parentValueArray, childNodeEntry)) {
//                        return parentEntry;
//                    }
//                }
//            }
//        }
//        return null;
//    }

    private boolean containsChild(ArrayNode parentValueArray, Entry<String, JsonNode> childNodeEntry) {
        for (Iterator<JsonNode> children = parentValueArray.getElements(); children.hasNext(); ) {
            JsonNode childElement = children.next();
            Iterator<Entry<String, JsonNode>> childElementFields = childElement.getFields();
            Entry<String, JsonNode> childElementField = childElementFields.next();
            if (childElementField.getKey().equals(childNodeEntry.getKey())) {
                boolean areEquals = childElementsAreEquals(childElementField.getValue(), childNodeEntry.getValue());
                if (areEquals) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean childElementsAreEquals(JsonNode valueFromParent, JsonNode valueFromChild) {
        if (valueFromParent.isValueNode() && valueFromChild.isValueNode()) {
            if (valueFromParent.equals(valueFromChild)) {
                return true;
            }
            return false;
        }
        if (valueFromChild.isArray() && valueFromParent.isArray()) {
            ArrayNode arrayChildNode = (ArrayNode) valueFromChild;
            for (Iterator<JsonNode> childrenOfChildNode = arrayChildNode.getElements(); childrenOfChildNode.hasNext(); ) {
                JsonNode childOfChildNode = childrenOfChildNode.next();
                Iterator<Entry<String, JsonNode>> childField = childOfChildNode.getFields();
                Entry<String, JsonNode> childFieldEntry = childField.next();
                ArrayNode arrayParentNode = (ArrayNode) valueFromParent;
                boolean contains = false;
                for (Iterator<JsonNode> childrenOfParentNode = arrayParentNode.getElements(); childrenOfParentNode.hasNext() && !contains; ) {
                    JsonNode childOfParentNode = childrenOfParentNode.next();
                    Iterator<Entry<String, JsonNode>> parentField = childOfParentNode.getFields();
                    Entry<String, JsonNode> parentFieldEntry = parentField.next();
                    if (childFieldEntry.getKey().equals(parentFieldEntry.getKey())) {
                        contains = childElementsAreEquals(childFieldEntry.getValue(), parentFieldEntry.getValue());
                    }
                }
                if (!contains) {
                    return false;
                }
            }
            return true;
        }
        return false;
                
    }

//    /**
//     * Returns the parent of the given field.
//     * 
//     * @param child the child to look for the parent
//     * @return a parent for the given field entry
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public Entry<String, JsonNode> getParent(Object child) {
//        Entry<String, JsonNode> childNodeEntry = (Entry<String, JsonNode>) child;
//        List<JsonNode> possibleParents = fieldsNode.findParents(childNodeEntry.getKey());
//        for (JsonNode parent : possibleParents) {
//            JsonNode node = parent.path(childNodeEntry.getKey());
//            if (matches(parent, childNodeEntry)) {
//                Iterator<Entry<String, JsonNode>> fields = parent.getFields();
//                Entry<String, JsonNode> parentEntry = fields.next();
//                fieldsNode.findParents(parentEntry.getKey());
//            }
//            if (node.equals(childNodeEntry.getValue())) {
//                List<JsonNode> parents = fieldsNode.findParents(childNodeEntry.getKey(), new ArrayList<JsonNode>());
//                System.out.println(parents);
//            }
//        }
//        return null;
//    }

//    @SuppressWarnings("unchecked")
//    private boolean matches(JsonNode parent, Entry<String, JsonNode> childNodeEntry) {
//        List<Entry<String, JsonNode>> fields = IteratorUtils.toList(parent.getFields());
//        if (fields.size() == 1) {
//            Entry<String, JsonNode> fieldEntry = fields.get(0);
//            if (fieldEntry.getKey().equals(childNodeEntry.getKey())) {
//                ArrayNode fieldValueArray = (ArrayNode) fieldEntry.getValue();
//                if (fieldValueArray.isArray()) {
//                    ArrayNode childNodeValue = (ArrayNode) childNodeEntry.getValue();
//                    for (Iterator<JsonNode> childrenOfchildNode = childNodeValue.getElements(); childrenOfchildNode.hasNext(); ) {
//                        JsonNode childEntry = childrenOfchildNode.next();
//                        Iterator<String> childNodeFieldNames = childEntry.getFieldNames();
//                        String childNodeFieldName = childNodeFieldNames.next();
//                        if (!parentContains(childNodeFieldName, fieldValueArray)) {
//                            return false;
//                        }
//                    }
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private boolean parentContains(String childNodeFieldName, ArrayNode fieldValueArray) {
//        for (Iterator<JsonNode> parentIterator = fieldValueArray.getElements(); parentIterator.hasNext(); ) {
//            JsonNode parentEntry = parentIterator.next();
//            Iterator<String> parentNodeFieldNames = parentEntry.getFieldNames();
//            String nodeFieldName = parentNodeFieldNames.next();
//            if (nodeFieldName.equals(childNodeFieldName)) {
//                return true;
//            }
//        }
//        return false;
//    }

//    /**
//     * Returns the parent of the given field.
//     * 
//     * @param child the child to look for the parent
//     * @return a parent for the given field entry
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public Entry<String, JsonNode> getParent(Object child) {
//        Entry<String, JsonNode> childNodeEntry = (Entry<String, JsonNode>) child;
//        JsonNode parent = findParent(fieldsNode, childNodeEntry);
//        if (parent != null) {
//            return getParent(parent, fieldsNode);
//        }
//        return null;
//    }

//    private JsonNode findParent(JsonNode rootNode, Entry<String, JsonNode> childNodeEntry) {
//        String fieldName = childNodeEntry.getKey();
//        List<JsonNode> parents = rootNode.findParents(fieldName);
//        for (JsonNode parent : parents) {
//            JsonNode element = parent.path(fieldName);
//            if (element.equals(childNodeEntry.getValue())) {
//                return parent;
//            }
//        }
//        return null;
//    }

//    private Entry<String, JsonNode> getParent(JsonNode childElement, JsonNode rootNode) {
//        for (Iterator<Entry<String, JsonNode>> fields = rootNode.getFields(); fields
//                .hasNext();) {
//            Entry<String, JsonNode> next = fields.next();
//            if (next.getValue().equals(childElement)) {
//                return next;
//            }
//            if (next.getValue().isObject()) {
//                Entry<String, JsonNode> parent = getParent(childElement, next.getValue());
//                if (parent != null) {
//                    return parent;
//                }
//            }
//        }
//        return null;
//    }

}
