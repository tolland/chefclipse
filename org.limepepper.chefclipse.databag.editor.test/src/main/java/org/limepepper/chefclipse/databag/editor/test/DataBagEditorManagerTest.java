/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.test;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.IteratorUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;

/**
 * @author Sebastian Sampaoli
 *
 */
public class DataBagEditorManagerTest extends AbstractDataBagEditorTest{

	private DataBagEditorManager managerInstance;
    private ObjectMapper mapper;
	
	@Before
    public void setUp() {
	    mapper = new ObjectMapper();
	    managerInstance = DataBagEditorManager.INSTANCE;
	    super.setUp();
	}
	
	@SuppressWarnings("unchecked")
    @Test
	public void testCreateAllKeysNode() {
	    Map<String, JsonNode> nodesMap = new HashMap<String, JsonNode>();
	    nodesMap.put("jsonFile1", firstKeysNode);
	    nodesMap.put("jsonFile2", secondKeysNode);
	    nodesMap.put("jsonFile3", thirdKeysNode);
		JsonNode allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
		Iterator<String> fieldNamesIterator = allKeysNode.getFieldNames();
		List<String> fieldList = IteratorUtils.toList(fieldNamesIterator);
		assertThat(fieldList).hasSize(8);
		assertThat(fieldList).contains("id", "name", "surname", "password", "address", "emptyObject", "emptyArray", "fullArray");
	}
    
	@Test  
	public void testValuesOfKeysNode() {
	    Map<String, JsonNode> nodesMap = new HashMap<String, JsonNode>();
        nodesMap.put("jsonFile1", firstKeysNode);
        nodesMap.put("jsonFile2", secondKeysNode);
        JsonNode allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
        JsonNode nameNode = allKeysNode.path("name");
        assertThat(nameNode.isArray()).isTrue();
        JsonNode surnameNode = allKeysNode.path("surname");
        assertThat(surnameNode.isArray()).isTrue();
        
        ArrayNode nameArray = (ArrayNode) nameNode;
        assertThat(nameArray.size()).isEqualTo(2);
        
        assertThat(nameArray.findValue("jsonFile1").asText()).isEqualTo("John");
        assertThat(nameArray.findValue("jsonFile2").asText()).isEqualTo("Peter");
        
        ArrayNode surnameArray = (ArrayNode) surnameNode;
        assertThat(surnameArray.size()).isEqualTo(1);
        assertThat(surnameArray.findValue("jsonFile1").asText()).isEqualTo("William");
	}
    
//    @Test
//	public void testValuesOfCompositeKeysNode() {
//        Map<String, JsonNode> nodesMap = new HashMap<String, JsonNode>();
//        nodesMap.put("jsonFile1", firstKeysNode);
//        nodesMap.put("jsonFile2", secondKeysNode);
//        nodesMap.put("jsonFile3", thirdKeysNode);
//	    JsonNode allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
//	    JsonNode addressNode = allKeysNode.path("address");
//	    assertThat(addressNode.isArray()).isTrue();
//	    
//	    ArrayNode arrayAddress = (ArrayNode)addressNode;
//	    assertThat(arrayAddress.size()).isEqualTo(3);
//	    
//        JsonNode firstElement = arrayAddress.findValue("jsonFile1");
//	    assertThat(firstElement.asText()).isEqualTo("an address");
//	    
//	    ObjectNode secondAddressNode = mapper.createObjectNode();
//	    ObjectNode nameAttributes = mapper.createObjectNode();
//	    nameAttributes.put("value", "Marriot street");
//	    nameAttributes.put("creationYear", 1985);
//	    secondAddressNode.put("name", nameAttributes);
//	    secondAddressNode.put("number", 1234);
////	    ((ObjectNode) secondAddressNode).put("address", secondAddressNode);
//	    JsonNode secondElement = arrayAddress.findValue("jsonFile2");
//        assertThat((ObjectNode)secondElement).isEqualTo(secondAddressNode);
//	    
//        ObjectNode thirdAddressNode = mapper.createObjectNode();
//        thirdAddressNode.put("name", "Av. Corrientes");
//        thirdAddressNode.put("number", 8989);
//        thirdAddressNode.put("Prov", "Buenos Aires");
//        JsonNode thirdElement = arrayAddress.findValue("jsonFile3");
//        assertThat((ObjectNode)thirdElement).isEqualTo(thirdAddressNode);
//	}
//	
	@SuppressWarnings("unchecked")
    @Test
    public void testValuesOfCompositeKeysNode() {
        Map<String, JsonNode> nodesMap = new HashMap<String, JsonNode>();
        nodesMap.put("jsonFile1", firstKeysNode);
        nodesMap.put("jsonFile2", secondKeysNode);
        nodesMap.put("jsonFile3", thirdKeysNode);
        JsonNode allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
        JsonNode addressNode = allKeysNode.path("address");
        assertThat(addressNode.isArray()).isTrue();
        
        ArrayNode arrayAddress = (ArrayNode)addressNode;
        assertThat(arrayAddress.size()).isEqualTo(4);
        
        JsonNode firstAddressNode = arrayAddress.findValue("jsonFile1");
        assertThat(firstAddressNode.asText()).isEqualTo("an address");
        
        ObjectNode valueAttributes = mapper.createObjectNode();
        valueAttributes.put("jsonFile2", "Marriot street");
        
        ObjectNode valueNode = mapper.createObjectNode();
        valueNode.putArray("value");
        ArrayNode valueArray = (ArrayNode) valueNode.path("value");
        valueArray.add(valueAttributes);
        
        ObjectNode dateAttributes = mapper.createObjectNode();
        dateAttributes.put("jsonFile2", 1985);
        
        ObjectNode dateNode = mapper.createObjectNode();
        dateNode.putArray("creationYear");
        ArrayNode dateArray = (ArrayNode) dateNode.path("creationYear");
        dateArray.add(dateAttributes);
        
        ObjectNode simpleAddressNameNode = mapper.createObjectNode();
        simpleAddressNameNode.put("jsonFile3", "Av. Corrientes");
        
        JsonNode secondElement = arrayAddress.findValue("name");
        assertThat(secondElement.isArray()).isTrue();
        Iterator<JsonNode> elementsOfSecondElement = ((ArrayNode)secondElement).getElements();
        List<JsonNode> secondElementsList = IteratorUtils.toList(elementsOfSecondElement);
        assertThat(secondElementsList).hasSize(3);
        assertThat(secondElementsList).contains(valueNode, dateNode, simpleAddressNameNode);
        
        ObjectNode firstNumberAttributes = mapper.createObjectNode();
        firstNumberAttributes.put("jsonFile2", 1234);
        ObjectNode secondNumberAttributes = mapper.createObjectNode();
        secondNumberAttributes.put("jsonFile3", 8989);
        
        JsonNode thirdElement = arrayAddress.findValue("number");
        assertThat(thirdElement.isArray()).isTrue();
        Iterator<JsonNode> elementsOfThirdElement = ((ArrayNode)thirdElement).getElements();
        List<JsonNode> thirdElementsList = IteratorUtils.toList(elementsOfThirdElement);
        assertThat(thirdElementsList).hasSize(2);
        assertThat(thirdElementsList).contains(firstNumberAttributes, secondNumberAttributes);
        
        ObjectNode provAttributes = mapper.createObjectNode();
        provAttributes.put("jsonFile3", "Buenos Aires");
        
        ObjectNode provNode = mapper.createObjectNode();
        provNode.putArray("Prov");
        ArrayNode provArray = (ArrayNode) provNode.path("Prov");
        provArray.add(provAttributes);
        
        JsonNode fourthElement = arrayAddress.findValue("Prov");
        assertThat(fourthElement.isArray()).isTrue();
        assertThat((ArrayNode)fourthElement).hasSize(1);
        assertThat((ArrayNode)fourthElement).isEqualTo(provArray);
    }
	
	@Test
    public void testGetTextOfDataBagItemsForCertainProperties() {
	    Map<String, JsonNode> nodesMap = new HashMap<String, JsonNode>();
        nodesMap.put("jsonFile1", firstKeysNode);
        nodesMap.put("jsonFile2", secondKeysNode);
        nodesMap.put("jsonFile3", thirdKeysNode);
        JsonNode allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
        JsonNode addressNode = allKeysNode.path("address");
        
        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
                "address", addressNode);
        JsonNode jsonFile1AddressValue = managerInstance.getValue(addressEntry, "jsonFile1");
        assertThat(jsonFile1AddressValue.asText()).isEqualTo("an address");
        
        JsonNode jsonFile2AddressValue = managerInstance.getValue(addressEntry, "jsonFile2");
        assertThat(jsonFile2AddressValue).isNull();
        
        JsonNode jsonFile3AddressValue = managerInstance.getValue(addressEntry, "jsonFile3");
        assertThat(jsonFile3AddressValue).isNull();
        
        ArrayNode arrayAddress = (ArrayNode)addressNode;
        JsonNode nameElement = arrayAddress.findValue("name");
        JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String, JsonNode>(
                "name", nameElement);
        
        JsonNode jsonFile1AddressNameValue = managerInstance.getValue(nameEntry, "jsonFile1");
        JsonNode jsonFile2AddressNameValue = managerInstance.getValue(nameEntry, "jsonFile2");
        JsonNode jsonFile3AddressNameValue = managerInstance.getValue(nameEntry, "jsonFile3");
        assertThat(jsonFile1AddressNameValue).isNull();
        assertThat(jsonFile2AddressNameValue).isNull();
        assertThat(jsonFile3AddressNameValue.asText()).isEqualTo("Av. Corrientes");
        
        JsonNode valueElement = nameElement.findValue("value");
        JsonNodeEntry<String, JsonNode> valueElementEntry = new JsonNodeEntry<String, JsonNode>(
                "value", valueElement);
        JsonNode jsonFile1valueElementValue = managerInstance.getValue(valueElementEntry, "jsonFile1");
        JsonNode jsonFile2valueElementValue = managerInstance.getValue(valueElementEntry, "jsonFile2");
        JsonNode jsonFile3valueElementValue = managerInstance.getValue(valueElementEntry, "jsonFile3");
        assertThat(jsonFile1valueElementValue).isNull();
        assertThat(jsonFile2valueElementValue.asText()).isEqualTo("Marriot street");
        assertThat(jsonFile3valueElementValue).isNull();
        
        JsonNode numberNode = arrayAddress.findValue("number");
        JsonNodeEntry<String, JsonNode> numberNodeEntry = new JsonNodeEntry<String, JsonNode>(
                "value", numberNode);
        JsonNode jsonFile1numberNodeValue = managerInstance.getValue(numberNodeEntry, "jsonFile1");
        JsonNode jsonFile2numberNodeValue = managerInstance.getValue(numberNodeEntry, "jsonFile2");
        JsonNode jsonFile3numberNodeValue = managerInstance.getValue(numberNodeEntry, "jsonFile3");
        assertThat(jsonFile1numberNodeValue).isNull();
        assertThat(jsonFile2numberNodeValue.asInt()).isEqualTo(1234);
        assertThat(jsonFile3numberNodeValue.asInt()).isEqualTo(8989);
    }
}
