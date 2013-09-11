/**
 *
 */
package org.limepepper.chefclipse.structured.json.editor.commands;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.ide.undo.AbstractWorkspaceOperation;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;

/**
 * Removes a JSON file from the file system.
 *
 * @author Sebastian Sampaoli
 */
public class RemoveJsonFileCommand extends AbstractResourceOperationCommand {

    private IResource jsonFile;
//    private EditingDomain domain;
    private DeleteResourcesOperation deleteOperation;

    public RemoveJsonFileCommand(EditingDomain domain, IResource jsonFile) {
        super(domain);
        this.jsonFile = jsonFile;
        initializeDeleteOperation(jsonFile);
    }

    private void initializeDeleteOperation(IResource jsonFile) {
        ArrayList<IResource> resources = new ArrayList<IResource>(Arrays.asList(jsonFile));
        deleteOperation = new DeleteResourcesOperation(resources.toArray(new IResource[1]), "Delete JSON file", true);
    }

    @Override
    protected boolean prepare() {
        return (jsonFile != null);
    }

    @Override
    public AbstractWorkspaceOperation getResourceOperation() {
        return deleteOperation;
    }
}
