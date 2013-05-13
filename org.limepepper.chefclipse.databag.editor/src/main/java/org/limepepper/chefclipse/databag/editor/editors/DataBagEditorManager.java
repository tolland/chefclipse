/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Provides methods to perform operations that access or modify {@link DataBag}s and
 * {@link DataBagItem}s. 
 * 
 * It also provides methods to put and retrieve values from an specific {@link JsonNode}.
 * 
 * @author Sebastian Sampaoli
 */
public enum DataBagEditorManager {

    INSTANCE;

    /**
     * Create a {@link JsonNode} which contains all the fields and values of the nodes
     * given as parameter. The created JsonNode contains all the fields of all
     * the JsonNodes given as parameter. The map given as parameter should contain
     * the JsonNodes of a collection of {@link DataBagItem}s. Specifically, it contains 
     * a map where each key represents a Json file name, and each value the {@link JsonNode}
     * associated with that file name. Each entry in the map represents the {@link IResource}
     * contained in a {@link DataBagItem}.
     *  
     * The elements of the resulting JSON are {@link ArrayNode}s which each one contain 
     * the values of all the JSON files for the current field. For
     * example, given two JSON files as below:
     * 
     * *******JsonFile1.json*******
     * {
     *  "name": "John",
     *  "address": "57 Street 8900"
     * }
     * 
     * *******JsonFile2.json*******
     * {
     *  "name": "Peter",
     *  "surname": "Crouch",
     *  "address": {
     *      "name": {
     *              value: "Av. Corrientes",
     *              "creation year": 1850
     *              },
     *      "number": 1234,
     *      "Province": "Buenos Aires"
     *              }
     *  }
     *  
     *  The resulting JsonNode would be:
     *  
     *  {
     *  "name": [{"JsonFile1.json": "John"}, {"JsonFile2.json": "Peter"}],
     *  "surname": [{"JsonFile2.json": "Crouch"}],
     *  "address": [{"JsonFile1.json":"57 Street 8900"},
     *              {name: [{"value":[{"JsonFile2.json": "Av. Corrientes"}]},
     *                      {"creation year":[{"JsonFile2.json": 1850}]}
     *                     ]},
     *              {"number": [{"JsonFile2.json": 1234}]}
     *              {"Province": [{"JsonFile2.json":"Buenos Aires"}]}]
     *  }
     * 
     * @param nodes to retrieve the fields
     * @return a JsonNode which contains a set of fields
     */
    public JsonNode createAllFieldsNode(Map<String, JsonNode> nodesMap) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode resultNode = mapper.createObjectNode();
        for (Entry<String, JsonNode> nodeEntry : nodesMap.entrySet()) {
            JsonNode nodeToRead = nodeEntry.getValue();
            for (Iterator<String> fields = nodeToRead.getFieldNames(); fields.hasNext(); ) {
                String field = fields.next();
                JsonNode arrayNode = resultNode.path(field);
                if (arrayNode.isMissingNode()) {
                    arrayNode = resultNode.putArray(field);
                }
                JsonNode fieldValue = nodeToRead.path(field);
                if (fieldValue != null && !fieldValue.isMissingNode()) {
//                    ObjectNode nodeToAdd = mapper.createObjectNode();
//                    nodeToAdd.put(nodeEntry.getKey(), fieldValue);
//                    ((ArrayNode) arrayNode).add(nodeToAdd);
                    if (fieldValue.isValueNode() || fieldValue.isArray()) {
                        ObjectNode nodeToAdd = mapper.createObjectNode();
                        nodeToAdd.put(nodeEntry.getKey(), fieldValue);
                        ((ArrayNode) arrayNode).add(nodeToAdd);
                    } else {
                        //it's an object
                        generateNodeWithChildren(nodeEntry.getKey(), fieldValue, (ArrayNode) arrayNode);
//                        ((ArrayNode) arrayNode).add(generateNodeWithChildren(nodeEntry.getKey(), fieldValue, (ArrayNode) arrayNode));
//                        resultNode = generateNodeWithChildren(nodeEntry.getKey(), field, fieldValue, resultNode);
                    }
                }
            }
        }
        if (!validateJsonNode(resultNode)) {
            throw new IllegalArgumentException(
                    "Could not find id attribute. Data Bag items must have an id.");
        }
        return resultNode;
    }

    private void generateNodeWithChildren(String fileName, JsonNode fieldValue, ArrayNode parentContainer) {
        ObjectMapper mapper = new ObjectMapper();
        for (Iterator<Entry<String, JsonNode>> fields = fieldValue.getFields(); fields.hasNext();) {
            Entry<String, JsonNode> childNodeEntry = fields.next();
            ArrayNode childContainer = findContainer(parentContainer, childNodeEntry.getKey());
            JsonNode childValueNode = childNodeEntry.getValue();
            if (childValueNode.isObject()) {
                generateNodeWithChildren(fileName, childValueNode, childContainer);
            } else {
                ObjectNode childNodeToAdd = mapper.createObjectNode();
                childNodeToAdd.put(fileName, childValueNode);
                childContainer.add(childNodeToAdd);
            }
        }
//        return null;
    }

    private ArrayNode findContainer(ArrayNode container, String fieldName) {
        ObjectMapper mapper = new ObjectMapper();
        for (Iterator<JsonNode> containerFields = container.getElements(); containerFields.hasNext();) {
            JsonNode containerField = containerFields.next();
            JsonNode childContainer = containerField.path(fieldName);
            if (!childContainer.isMissingNode()) {
                return (ArrayNode) childContainer;
            }
        }
        ObjectNode nodeOfArray = mapper.createObjectNode();
        nodeOfArray.put(fieldName, mapper.createArrayNode());
        container.add(nodeOfArray);
        return (ArrayNode) nodeOfArray.path(fieldName);
    }

//    private ObjectNode generateNodeWithChildren(String fileName, String fieldName, JsonNode fieldValue, ObjectNode resultNode) {
//        ObjectMapper mapper = new ObjectMapper();
//        for (Iterator<Entry<String, JsonNode>> fields = fieldValue.getFields(); fields.hasNext();) {
//            Entry<String, JsonNode> childNode = fields.next();
//            JsonNode childValueNode = childNode.getValue();
//            if (childValueNode.isObject()) {
//                
//            } else {
//                ObjectNode nodeToAdd = mapper.createObjectNode();
//                nodeToAdd.put(nodeEntry.getKey(), fieldValue);
//                ((ArrayNode) arrayNode).add(nodeToAdd);
//            }
//        }
//        ArrayNode arrayNode = (ArrayNode) resultNode.path(fieldName);
//        for (Iterator<Entry<String, JsonNode>> fields = fieldValue.getFields(); fields.hasNext();) {
//            Entry<String, JsonNode> arrayChild = fields.next();
//            fo
//            if (fi)
//        }
//        arrayNode.find
//        Iterator<String> fieldNames = fieldValue.getFieldNames();
//        return null;
//    }

    /**
     * Validates if a JSON node which belong to a {@link DataBagItem} has an id
     * attribute.
     * 
     * @param jsonNode the node where to look for an id
     * @return true if an id attribute exists, false otherwise
     */
    public boolean validateJsonNode(JsonNode jsonNode) {
        for (Iterator<Entry<String, JsonNode>> fields = jsonNode.getFields(); fields
                .hasNext();) {
            Entry<String, JsonNode> next = fields.next();
            if (next.getKey().toLowerCase().equals("id")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a {@link Map} that contains {@link JsonNode}s and it corresponded file names
     * which are contained in the {@link DataBag} or the {@link DataBagItem} passed as parameter. 
     * In case the eObject is a {@link DataBagItem}, it will return a map with only one entry.
     * 
     * @param eObject the DataBag or DataBagItem which contains JSON nodes
     * @return a map of JSON entry nodes
     */
    public Map<String, JsonNode> retrieveNodes(EObject eObject)
            throws JsonParseException,
            JsonMappingException, IOException {
        Map<String, JsonNode> nodes = new LinkedHashMap<String, JsonNode>(); 
        // List<JsonNodeEntry<String, JsonNode>> nodes = new
        // ArrayList<JsonNodeEntry<String, JsonNode>>();
        if (eObject instanceof DataBag) {
            DataBag dataBag = (DataBag) eObject;
            EList<DataBagItem> items = dataBag.getItems();
            for (DataBagItem dataBagItem : items) {
                File jsonFile = dataBagItem.getJsonResource().getLocation().toFile();
                JsonNode node = loadJsonFile(jsonFile);
                nodes.put(jsonFile.getName(), node);
            }
            return nodes;
        } else if (eObject instanceof DataBagItem) {
            DataBagItem dataBagItem = (DataBagItem) eObject;
            File jsonFile = dataBagItem.getJsonResource().getLocation().toFile();
            JsonNode node = loadJsonFile(jsonFile);
            nodes.put(jsonFile.getName(), node);
            return nodes;
        }
        return new HashMap<String, JsonNode>();
    }

    private JsonNode loadJsonFile(File jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = null;
        try {
            node = mapper.readValue(jsonFile, JsonNode.class);
        } catch (IOException e) {
            throw new IOException("The " + jsonFile.getName()
                    + " file could not be read because it has some error or it is not well formed",
                    e);
        }
        return node;
    }

    /**
     * Returns the value which has a {@link DataBagItem} for an specific JSON property.
     * It's highly recommended that the method {@link #createAllFieldsNode(Map)} is used
     * first, in order to create and have a suitable structure to add, remove, or get 
     * values from data bags items.
     * 
     * @param element an entry in the JsonNode structure. The key of such entry is the name of a JSON property
     * @param dataBagItemName the name of the data bag item to fetch the value
     * @return the value for the given JSON property in the data bag item, otherwise it returns null
     */
    public JsonNode getValue(Entry<String, JsonNode> element, String dataBagItemName) {
        JsonNode elementArray = element.getValue();
        for (Iterator<JsonNode> elements = elementArray.getElements(); elements.hasNext(); ) {
            JsonNode childElement = elements.next();
            Iterator<Entry<String, JsonNode>> childFields = childElement.getFields();
            Entry<String, JsonNode> childNode = childFields.next();
            if (childNode.getKey().equals(dataBagItemName) && (childNode.getValue().isValueNode() || childNode.getValue().isArray())) {
                return childNode.getValue();
            }
        }
        return null;
    }
    
    //TODO add method to add a new property to a specific data bag item. It should receive as parameter
//    the super JsonNode object (give instructions to call the createAllKeysNode method before), a databagitemname
//    and an Entry<String,JsonNode>???may be these stuff I am writing should be on label provider.
    
//    add a simple method to find the value of a data bag item given a string property, the name of the data bag item, and a super jsonnode
//    if the property name exists more than once, it will return the first found.
    
//    same for remove. Maybe I have to consider not using the super Json node and use the JsonNode of the databag directly,
//    I think it makes more sense. This methods I am thinking to put are only for the API pourposes.
    
//  So TOMORROW just worried about creating the functionality for the label provide, then we will see the other stuff, that's
//    where to put methods.
}
