/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.test;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.editors.DataBagValueLabelProvider;

/**
 * @author Sebastian Sampaoli
 *
 */
public class DataBagLabelProviderTest extends AbstractDataBagEditorTest {
    
    private DataBagEditorManager managerInstance;
    private JsonNode allKeysNode;
    private DataBagValueLabelProvider labelProvider;

    @Before
    public void setUp() {
        super.setUp();
        managerInstance = DataBagEditorManager.INSTANCE;
        Map<String, JsonNode> nodesMap = new LinkedHashMap<String, JsonNode>();
        nodesMap.put("jsonFile1", firstKeysNode);
        nodesMap.put("jsonFile2", secondKeysNode);
        nodesMap.put("jsonFile3", thirdKeysNode);

        allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
        labelProvider = new DataBagValueLabelProvider(nodesMap);
    }
    
    @Test
    public void testGetColumnText() {
        JsonNode addressNode = allKeysNode.path("address");
        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
                "address", addressNode);
        String jsonFile1AddressValue = labelProvider.getColumnText(addressEntry, 1);
        assertThat(jsonFile1AddressValue).isEqualTo("an address");
        
        ArrayNode arrayAddress = (ArrayNode)addressNode;
        JsonNode nameElement = arrayAddress.findValue("name");
        JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String, JsonNode>(
                "name", nameElement);
        
        String jsonFile1AddressNameValue = labelProvider.getColumnText(nameEntry, 1);
        String jsonFile2AddressNameValue = labelProvider.getColumnText(nameEntry, 2);
        String jsonFile3AddressNameValue = labelProvider.getColumnText(nameEntry, 3);
        assertThat(jsonFile1AddressNameValue).isEqualTo("");
        assertThat(jsonFile2AddressNameValue).isEqualTo("");
        assertThat(jsonFile3AddressNameValue).isEqualTo("Av. Corrientes");
        
        JsonNode valueElement = nameElement.findValue("value");
        JsonNodeEntry<String, JsonNode> valueElementEntry = new JsonNodeEntry<String, JsonNode>(
                "value", valueElement);
        String jsonFile1valueElementValue = labelProvider.getColumnText(valueElementEntry, 1);
        String jsonFile2valueElementValue = labelProvider.getColumnText(valueElementEntry, 2);
        String jsonFile3valueElementValue = labelProvider.getColumnText(valueElementEntry, 3);
        assertThat(jsonFile1valueElementValue).isEqualTo("");
        assertThat(jsonFile2valueElementValue).isEqualTo("Marriot street");
        assertThat(jsonFile3valueElementValue).isEqualTo("");
        
        JsonNode numberNode = arrayAddress.findValue("number");
        JsonNodeEntry<String, JsonNode> numberNodeEntry = new JsonNodeEntry<String, JsonNode>(
                "value", numberNode);
        String jsonFile1numberNodeValue = labelProvider.getColumnText(numberNodeEntry, 1);
        String jsonFile2numberNodeValue = labelProvider.getColumnText(numberNodeEntry, 2);
        String jsonFile3numberNodeValue = labelProvider.getColumnText(numberNodeEntry, 3);
        assertThat(jsonFile1numberNodeValue).isEqualTo("");
        assertThat(jsonFile2numberNodeValue).isEqualTo("1234");
        assertThat(jsonFile3numberNodeValue).isEqualTo("8989");
    }
    
}
