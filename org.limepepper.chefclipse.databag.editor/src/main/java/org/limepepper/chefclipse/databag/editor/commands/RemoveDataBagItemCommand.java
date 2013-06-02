/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.commands;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.ide.undo.AbstractWorkspaceOperation;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Removes a {@link DataBagItem} resource from the file system.
 *  
 * @author Sebastian Sampaoli
 */
public class RemoveDataBagItemCommand extends AbstractResourceOperationCommand {

    private IResource dataBagItemResource;
//    private EditingDomain domain;
    private DeleteResourcesOperation deleteOperation;

    public RemoveDataBagItemCommand(EditingDomain domain, IResource dataBagItemResource) {
        super(domain);
        this.dataBagItemResource = dataBagItemResource;
        initializeDeleteOperation(dataBagItemResource);
    }

    private void initializeDeleteOperation(IResource dataBagItemResource) {
        ArrayList<IResource> resources = new ArrayList<>(Arrays.asList(dataBagItemResource));
        deleteOperation = new DeleteResourcesOperation(resources.toArray(new IResource[1]), "Delete data bag item", true); 
    }
    
    @Override
    protected boolean prepare() {
        return (dataBagItemResource != null);
    }

    @Override
    public AbstractWorkspaceOperation getResourceOperation() {
        return deleteOperation;
    }
}
