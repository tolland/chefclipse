/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.test;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.databag.editor.editors.DataBagContentProvider;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;

/**
 * @author Sebastian Sampaoli
 */
public class DataBagContentProviderTest extends AbstractDataBagEditorTest {

    private DataBagContentProvider contentProvider;
    private JsonNode allKeysNode;
    private ObjectMapper mapper;
    private DataBagEditorManager managerInstance;

    @Before
    public void setUp() {
        super.setUp();
        managerInstance = DataBagEditorManager.INSTANCE;
        Map<String, JsonNode> nodesMap = new HashMap<String, JsonNode>();
        nodesMap.put("jsonFile1", firstKeysNode);
        nodesMap.put("jsonFile2", secondKeysNode);
        nodesMap.put("jsonFile3", thirdKeysNode);

        allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
        contentProvider = new DataBagContentProvider(nodesMap);
        contentProvider.inputChanged(null, null, allKeysNode);
        mapper = new ObjectMapper();
    }

    // @Ignore
    // @Test
    // public void testDoNotHaveChildren() {
    // JsonNode nameNode = firstKeysNode.path("name");
    // JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String,
    // JsonNode>("name", nameNode);
    // JsonNode surnameNode = firstKeysNode.path("surname");
    // JsonNodeEntry<String, JsonNode> surnameEntry = new JsonNodeEntry<String,
    // JsonNode>("surname", surnameNode);
    // JsonNode passwordNode = firstKeysNode.path("password");
    // JsonNodeEntry<String, JsonNode> passwordEntry = new JsonNodeEntry<String,
    // JsonNode>("password", passwordNode);
    // JsonNode addressNode = firstKeysNode.path("address");
    // JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String,
    // JsonNode>("address", addressNode);
    //
    // assertThat(contentProvider.hasChildren(nameEntry)).isFalse();
    // assertThat(contentProvider.hasChildren(surnameEntry)).isFalse();
    // assertThat(contentProvider.hasChildren(passwordEntry)).isFalse();
    // assertThat(contentProvider.hasChildren(addressEntry)).isFalse();
    // }

    // @Ignore
    // @Test
    // public void testEmptyObjectsShouldNotHaveChildren() {
    // JsonNode emptyObjectNode = firstKeysNode.path("emptyObject");
    // JsonNodeEntry<String, JsonNode> emptyObjectEntry = new
    // JsonNodeEntry<String, JsonNode>("emptyObject", emptyObjectNode);
    // JsonNode emptyArrayNode = firstKeysNode.path("emptyArray");
    // JsonNodeEntry<String, JsonNode> emptyArrayEntry = new
    // JsonNodeEntry<String, JsonNode>("emptyArray", emptyArrayNode);
    //
    // assertThat(contentProvider.hasChildren(emptyObjectEntry)).isFalse();
    // assertThat(contentProvider.hasChildren(emptyArrayEntry)).isFalse();
    // }
    //
    // @Ignore
    // @Test
    // public void testHasChildren() {
    // JsonNode nameNode = secondKeysNode.path("name");
    // JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String,
    // JsonNode>("name", nameNode);
    // JsonNode addressNode = secondKeysNode.path("address");
    // JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String,
    // JsonNode>("address", addressNode);
    // JsonNode nameWithChildrenNode =
    // secondKeysNode.path("address").path("name");
    // JsonNodeEntry<String, JsonNode> nameWithChildrenEntry = new
    // JsonNodeEntry<String, JsonNode>("name", nameWithChildrenNode);
    //
    // assertThat(contentProvider.hasChildren(nameEntry)).isFalse();
    // assertThat(contentProvider.hasChildren(addressEntry)).isTrue();
    // assertThat(contentProvider.hasChildren(nameWithChildrenEntry)).isTrue();
    // }
    //
    // @Ignore
    // @Test
    // public void testDoNotGetParent() {
    // contentProvider.inputChanged(null, null, firstKeysNode);
    // JsonNode nameNode = firstKeysNode.path("name");
    // JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String,
    // JsonNode>("name", nameNode);
    // JsonNode surnameNode = firstKeysNode.path("surname");
    // JsonNodeEntry<String, JsonNode> surnameEntry = new JsonNodeEntry<String,
    // JsonNode>("surname", surnameNode);
    // JsonNode passwordNode = firstKeysNode.path("password");
    // JsonNodeEntry<String, JsonNode> passwordEntry = new JsonNodeEntry<String,
    // JsonNode>("password", passwordNode);
    // JsonNode addressNode = firstKeysNode.path("address");
    // JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String,
    // JsonNode>("address", addressNode);
    //
    // Entry<String, JsonNode> nameParent =
    // contentProvider.getParent(nameEntry);
    // assertThat(nameParent).isNull();
    //
    // Entry<String, JsonNode> surnameParent =
    // contentProvider.getParent(surnameEntry);
    // assertThat(surnameParent).isNull();
    //
    // Entry<String, JsonNode> passwordParent =
    // contentProvider.getParent(passwordEntry);
    // assertThat(passwordParent).isNull();
    //
    // Entry<String, JsonNode> addressParent =
    // contentProvider.getParent(addressEntry);
    // assertThat(addressParent).isNull();
    // }
    //
    // @Ignore
    // @Test
    // public void testGetParent() {
    // contentProvider.inputChanged(null, null, secondKeysNode);
    // JsonNode nameWithChildrenNode =
    // secondKeysNode.path("address").path("name");
    // JsonNodeEntry<String, JsonNode> nameWithChildrenEntry = new
    // JsonNodeEntry<String, JsonNode>("name", nameWithChildrenNode);
    // JsonNode valueNameNode =
    // secondKeysNode.path("address").path("name").path("value");
    // JsonNodeEntry<String, JsonNode> valueNameEntry = new
    // JsonNodeEntry<String, JsonNode>("value", valueNameNode);
    // JsonNode creationYearNameNode =
    // secondKeysNode.path("address").path("name").path("creationYear");
    // JsonNodeEntry<String, JsonNode> creationYearNameEntry = new
    // JsonNodeEntry<String, JsonNode>("creationYear", creationYearNameNode);
    //
    // Entry<String, JsonNode> nameParent =
    // contentProvider.getParent(nameWithChildrenEntry);
    // assertThat(nameParent.getKey()).isEqualTo("address");
    // assertThat(nameParent.getValue()).isEqualTo(secondKeysNode.path("address"));
    //
    // Entry<String, JsonNode> valueNameParent =
    // contentProvider.getParent(valueNameEntry);
    // assertThat(valueNameParent.getKey()).isEqualTo("name");
    // assertThat(valueNameParent.getValue()).isEqualTo(secondKeysNode.path("address").path("name"));
    //
    // Entry<String, JsonNode> creationYearParent =
    // contentProvider.getParent(creationYearNameEntry);
    // assertThat(creationYearParent.getKey()).isEqualTo("name");
    // assertThat(creationYearParent.getValue()).isEqualTo(secondKeysNode.path("address").path("name"));
    // }

    @Test
    public void testDoNotGetParent() {
        JsonNode nameNode = allKeysNode.path("name");
        JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String, JsonNode>("name",
                nameNode);
        JsonNode surnameNode = allKeysNode.path("surname");
        JsonNodeEntry<String, JsonNode> surnameEntry = new JsonNodeEntry<String, JsonNode>(
                "surname", surnameNode);
        JsonNode passwordNode = allKeysNode.path("password");
        JsonNodeEntry<String, JsonNode> passwordEntry = new JsonNodeEntry<String, JsonNode>(
                "password", passwordNode);
        JsonNode addressNode = allKeysNode.path("address");
        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
                "address", addressNode);

        Entry<String, JsonNode> nameParent = contentProvider.getParent(nameEntry);
        assertThat(nameParent).isNull();

        Entry<String, JsonNode> surnameParent = contentProvider.getParent(surnameEntry);
        assertThat(surnameParent).isNull();

        Entry<String, JsonNode> passwordParent = contentProvider.getParent(passwordEntry);
        assertThat(passwordParent).isNull();

        Entry<String, JsonNode> addressParent = contentProvider.getParent(addressEntry);
        assertThat(addressParent).isNull();
    }

    @Test
    public void testGetParent() {
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
        
        ArrayNode nameArray = mapper.createArrayNode();
        nameArray.add(simpleAddressNameNode);
        nameArray.add(valueNode);
        nameArray.add(dateNode);
        
        JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String, JsonNode>(
                "name", nameArray);
        Entry<String, JsonNode> nameParent = contentProvider.getParent(nameEntry);
        JsonNode addressNode = allKeysNode.path("address");
        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
                "address", addressNode);
        assertThat(nameParent.getKey()).isEqualTo(addressEntry.getKey());
        assertThat(nameParent.getValue()).isEqualTo(addressEntry.getValue());
        
        JsonNodeEntry<String, JsonNode> dateEntry = new JsonNodeEntry<String, JsonNode>(
                "creationYear", dateArray);
        Entry<String, JsonNode> dateParent = contentProvider.getParent(dateEntry);
        assertThat(dateParent.getKey()).isEqualTo(nameEntry.getKey());
        assertThat(dateParent.getValue()).isEqualTo(nameEntry.getValue());
        
        JsonNodeEntry<String, JsonNode> valueEntry = new JsonNodeEntry<String, JsonNode>(
                "value", valueArray);
        Entry<String, JsonNode> valueParent = contentProvider.getParent(valueEntry);
        assertThat(valueParent.getKey()).isEqualTo(nameEntry.getKey());
        assertThat(valueParent.getValue()).isEqualTo(nameEntry.getValue());
    }

    @Test
    public void testDoNotHaveChildren() {
        JsonNode idNode = allKeysNode.path("id");
        JsonNodeEntry<String, JsonNode> idEntry = new JsonNodeEntry<String, JsonNode>("id", idNode);
        JsonNode nameNode = allKeysNode.path("name");
        JsonNodeEntry<String, JsonNode> nameEntry = new JsonNodeEntry<String, JsonNode>("name",
                nameNode);
        JsonNode surnameNode = allKeysNode.path("surname");
        JsonNodeEntry<String, JsonNode> surnameEntry = new JsonNodeEntry<String, JsonNode>(
                "surname", surnameNode);
        JsonNode passwordNode = allKeysNode.path("password");
        JsonNodeEntry<String, JsonNode> passwordEntry = new JsonNodeEntry<String, JsonNode>(
                "password", passwordNode);
        
        ObjectNode provAttributes = mapper.createObjectNode();
        provAttributes.put("jsonFile3", "Buenos Aires");
        
        ArrayNode provArray = mapper.createArrayNode();
        provArray.add(provAttributes);
        
        JsonNodeEntry<String, JsonNode> provEntry = new JsonNodeEntry<String, JsonNode>(
                "Prov", provArray);

        assertThat(contentProvider.hasChildren(nameEntry)).isFalse();
        assertThat(contentProvider.hasChildren(surnameEntry)).isFalse();
        assertThat(contentProvider.hasChildren(passwordEntry)).isFalse();
        assertThat(contentProvider.hasChildren(idEntry)).isFalse();
        assertThat(contentProvider.hasChildren(provEntry)).isFalse();
    }

    @Test
    public void testEmptyObjectsShouldNotHaveChildren() {
        JsonNode emptyObjectNode = allKeysNode.path("emptyObject");
        JsonNodeEntry<String, JsonNode> emptyObjectEntry = new JsonNodeEntry<String, JsonNode>(
                "emptyObject", emptyObjectNode);
        JsonNode emptyArrayNode = allKeysNode.path("emptyArray");
        JsonNodeEntry<String, JsonNode> emptyArrayEntry = new JsonNodeEntry<String, JsonNode>(
                "emptyArray", emptyArrayNode);

        assertThat(contentProvider.hasChildren(emptyObjectEntry)).isFalse();
        assertThat(contentProvider.hasChildren(emptyArrayEntry)).isFalse();
    }

    @Test
    public void testOrdinaryArraysShouldNotBeChildren() {
        JsonNode fullArrayNode = allKeysNode.path("fullArray");
        JsonNodeEntry<String, JsonNode> fullArrayEntry = new JsonNodeEntry<String, JsonNode>(
                "fullArray", fullArrayNode);
        assertThat(contentProvider.hasChildren(fullArrayEntry)).isFalse();
    }

    @Test
    public void testHasChildren() {
        JsonNode addressNode = allKeysNode.path("address");
        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
                "address", addressNode);
        assertThat(contentProvider.hasChildren(addressEntry)).isTrue();
    }

//    @SuppressWarnings("unchecked")
//    @Test
//    public void tesGetChildren() {
//        JsonNode addressNode = allKeysNode.path("address");
//        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
//                "address", addressNode);
//
//        Object[] addressChildren = contentProvider.getChildren(addressEntry);
//        assertThat(addressChildren).hasSize(3);
//        List<String> addressAttsList = Arrays.asList(
//                ((Entry<String, JsonNode>) addressChildren[0]).getKey(),
//                ((Entry<String, JsonNode>) addressChildren[1]).getKey(),
//                ((Entry<String, JsonNode>) addressChildren[2]).getKey());
//        assertThat(addressAttsList).contains("name", "number", "Prov");
//
//        JsonNode nameNode = ((Entry<String, JsonNode>) addressChildren[0]).getValue();
//        assertThat(nameNode.isArray()).isTrue();
//        ArrayNode nameArray = (ArrayNode) nameNode;
//        assertThat(nameArray.size()).isEqualTo(2);
//        JsonNode nameAttsNode = nameArray.findValue("jsonFile2");
//        ObjectNode nameAttributes = mapper.createObjectNode();
//        nameAttributes.put("value", "Marriot street");
//        nameAttributes.put("creationYear", 1985);
//        assertThat(nameAttsNode).isEqualTo(nameAttributes);
//        assertThat(nameArray.findValue("jsonFile3").asText()).isEqualTo("Av. Corrientes");
//
//        Object[] nameChildren = contentProvider.getChildren(addressChildren[0]);
//        assertThat(nameChildren).hasSize(2);
//        List<String> nameAttsList = Arrays.asList(
//                ((Entry<String, JsonNode>) nameChildren[0]).getKey(),
//                ((Entry<String, JsonNode>) nameChildren[1]).getKey());
//        assertThat(nameAttsList).contains("value", "creationYear");
//
//        List<String> nameValuesList = Arrays.asList(
//                ((Entry<String, JsonNode>) nameChildren[0]).getValue().findValue("jsonFile2").asText(),
//                ((Entry<String, JsonNode>) nameChildren[1]).getValue().findValue("jsonFile2").asText());
//        assertThat(nameValuesList).contains("Marriot street", "1985");
//    }
    @SuppressWarnings("unchecked")
    @Test
    public void tesGetChildren() {
        JsonNode addressNode = allKeysNode.path("address");
        JsonNodeEntry<String, JsonNode> addressEntry = new JsonNodeEntry<String, JsonNode>(
                "address", addressNode);

        Object[] addressChildren = contentProvider.getChildren(addressEntry);
        assertThat(addressChildren).hasSize(3);
        List<String> addressAttsList = Arrays.asList(
                ((Entry<String, JsonNode>) addressChildren[0]).getKey(),
                ((Entry<String, JsonNode>) addressChildren[1]).getKey(),
                ((Entry<String, JsonNode>) addressChildren[2]).getKey());
        assertThat(addressAttsList).contains("name", "number", "Prov");
        assertThat(((Entry<String, JsonNode>) addressChildren[0]).getValue().isArray()).isTrue();
        assertThat(((Entry<String, JsonNode>) addressChildren[1]).getValue().isArray()).isTrue();
        assertThat(((Entry<String, JsonNode>) addressChildren[2]).getValue().isArray()).isTrue();
        
        Entry<String, JsonNode> nameEntry = null;
        for (Object entry : addressChildren) {
            Entry<String, JsonNode> childEntry = (Entry<String, JsonNode>) entry;
            if (childEntry.getKey().equals("name")) {
                nameEntry = childEntry;
            }
        }
        
        Object[] nameChildren = contentProvider.getChildren(nameEntry);
        assertThat(nameChildren).hasSize(2);
        List<String> nameAttsList = Arrays.asList(
                ((Entry<String, JsonNode>) nameChildren[0]).getKey(),
                ((Entry<String, JsonNode>) nameChildren[1]).getKey());
        assertThat(nameAttsList).contains("value", "creationYear");
    }
}
