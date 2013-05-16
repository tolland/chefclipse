/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.commands;

import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.eclipse.gef.commands.Command;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor.ViewerProvider;

/**
 * Command to add a new data bag item to the collection of
 * {@link DataBagItem}s.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class AddDataBagItemCommand extends Command {

    public AddDataBagItemCommand(ViewerProvider viewerProvider,
            Map<String, JsonNode> dataBagItemsMap) {
        // TODO Auto-generated constructor stub
    }
    
}
