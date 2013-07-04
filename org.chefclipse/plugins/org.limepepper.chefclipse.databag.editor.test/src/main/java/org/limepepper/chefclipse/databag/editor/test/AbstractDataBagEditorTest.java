
package org.limepepper.chefclipse.databag.editor.test;

import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Before;

public abstract class AbstractDataBagEditorTest {

    protected JsonNode firstKeysNode;
    protected JsonNode secondKeysNode;
    protected JsonNode thirdKeysNode;

    @Before
    public void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        firstKeysNode = mapper.createObjectNode(); // will be of type
        ((ObjectNode) firstKeysNode).put("id", "John_id");
        ((ObjectNode) firstKeysNode).put("name", "John");
        ((ObjectNode) firstKeysNode).put("surname", "William");
        ((ObjectNode) firstKeysNode).put("password", "passw0000");
        ((ObjectNode) firstKeysNode).put("address", "an address");
        // Now, I'll add an empty array and an empty object node to the
        // keysNodeWithChildren
        ((ObjectNode) firstKeysNode).putObject("emptyObject");
        ((ObjectNode) firstKeysNode).putArray("emptyArray");
        ArrayNode putArray = ((ObjectNode) firstKeysNode).putArray("fullArray");
        ObjectNode testNode = mapper.createObjectNode();
        testNode.put("name", "One");
        ObjectNode testNode1 = mapper.createObjectNode();
        testNode1.put("score", 90);
        putArray.add(testNode);
        putArray.add(testNode1);

        secondKeysNode = mapper.createObjectNode(); // will be of type
        ((ObjectNode) secondKeysNode).put("name", "Peter");
        ((ObjectNode) secondKeysNode).put("password", "uuu0i0o0");

        ObjectNode addressAttributes = mapper.createObjectNode();
        ObjectNode nameAttributes = mapper.createObjectNode();
        nameAttributes.put("value", "Marriot street");
        nameAttributes.put("creationYear", 1985);
        addressAttributes.put("name", nameAttributes);
        addressAttributes.put("number", 1234);
        ((ObjectNode) secondKeysNode).put("address", addressAttributes);

        thirdKeysNode = mapper.createObjectNode();
        ObjectNode address = mapper.createObjectNode();
        address.put("name", "Av. Corrientes");
        address.put("number", 8989);
        address.put("Prov", "Buenos Aires");
        ((ObjectNode) thirdKeysNode).put("address", address);
    }

    @SuppressWarnings("hiding")
    class JsonNodeEntry<String, JsonNode> implements Entry<String, JsonNode> {

        private String key;
        private JsonNode value;

        public JsonNodeEntry(String key, JsonNode value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public JsonNode getValue() {
            return value;
        }

        @Override
        public JsonNode setValue(JsonNode value) {
            this.value = value;
            return value;
        }
    }
}
