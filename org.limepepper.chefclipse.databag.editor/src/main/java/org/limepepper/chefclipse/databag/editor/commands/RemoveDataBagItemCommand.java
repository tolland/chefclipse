/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.commands;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.ide.undo.DeleteResourcesOperation;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Removes a {@link DataBagItem} resource from the file system.
 *  
 * @author Sebastian Sampaoli
 */
public class RemoveDataBagItemCommand extends AbstractOverrideableCommand {

    private IResource dataBagItemResource;
//    private EditingDomain domain;
    private DeleteResourcesOperation deleteOperation;

    public RemoveDataBagItemCommand(EditingDomain domain, IResource dataBagItemResource) {
        super(domain);
        this.dataBagItemResource = dataBagItemResource;
//        this.domain = domain;
        initializeDeleteOperation(dataBagItemResource);
    }

    private void initializeDeleteOperation(IResource dataBagItemResource) {
        ArrayList<IResource> resources = new ArrayList<>(Arrays.asList(dataBagItemResource));
        deleteOperation = new DeleteResourcesOperation(resources.toArray(new IResource[1]), "Delete data bag item", true); 
    }
    
//    public EObject getAffectedEObject() {
//        URI itemURI = URI.createPlatformResourceURI(dataBagItemResource
//                .getFullPath().toOSString(), false);
//        Resource dataBagItemResource = getResourceFromURI(itemURI);
//        return dataBagItemResource.getContents().get(0);
//    }
//    
//    private Resource getResourceFromURI(URI itemURI) {
//        EList<Resource> resources = domain.getResourceSet().getResources();
//        for (Iterator<Resource> it = resources.iterator(); it.hasNext(); ) {
//            Resource resource = it.next();
//            if (resource.getURI().equals(itemURI)) {
//                return resource;
//            }
//        }
//        return null;
//    }
    
    @Override
    protected boolean prepare() {
        return (dataBagItemResource != null);
    }

    @Override
    public void doExecute() {
        try {
            deleteOperation.execute(new NullProgressMonitor(), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doUndo() {
        try {
            deleteOperation.undo(new NullProgressMonitor(), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doRedo() {
        try {
            deleteOperation.redo(new NullProgressMonitor(), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
