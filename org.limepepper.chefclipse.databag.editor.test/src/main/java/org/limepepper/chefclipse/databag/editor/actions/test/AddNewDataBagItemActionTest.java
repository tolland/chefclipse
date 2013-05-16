/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions.test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.HashMap;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.eclipse.gef.commands.Command;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.test.AbstractDataBagEditorTest;

/**
 * @author Sebastian Sampaoli
 *
 */
public class AddNewDataBagItemActionTest extends AbstractDataBagEditorTest{
    
    private DataBagEditorManager managerInstance;
    private JsonNode allKeysNode;
    private HashMap<String, JsonNode> nodesMap;

    @Before
    public void setUp() {
        super.setUp();
        managerInstance = DataBagEditorManager.INSTANCE;
        nodesMap = new HashMap<String, JsonNode>();
        nodesMap.put("jsonFile1", firstKeysNode);
        nodesMap.put("jsonFile2", secondKeysNode);
        nodesMap.put("jsonFile3", thirdKeysNode);
        
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode fourthKeysNode = mapper.createObjectNode();
        
        nodesMap.put("jsonFile", fourthKeysNode);

        allKeysNode = managerInstance.createAllFieldsNode(nodesMap);
        System.out.println(allKeysNode);
    }
    
    @Test
    public void testAddNewDataBagItem() {
        DataBagColumnEditor.ViewerProvider viewerProvider = mock(DataBagColumnEditor.ViewerProvider.class);
        AddNewDataBagItemAction addDataBagItemAction = new AddNewDataBagItemAction(viewerProvider, nodesMap);
        addDataBagItemAction.run();
        verify(viewerProvider).getCommandStack().execute(isA(Command.class));
        assertThat(nodesMap).hasSize(4);
    }
}
