/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.commands;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.ide.undo.AbstractWorkspaceOperation;
import org.eclipse.ui.ide.undo.CreateFileOperation;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Creates a new {@link DataBagItem} resource.
 *  
 * @author Sebastian Sampaoli
 */
public class AddDataBagItemCommand extends AbstractResourceOperationCommand {

    private CreateFileOperation resourceOperation;
    private String dataBagItemName;
    private IPath dbItemPath;

    public AddDataBagItemCommand(EditingDomain domain, IPath dbItemPath) {
        super(domain);
        this.dbItemPath = dbItemPath;
        initializeCreateFileOperation(dataBagItemName);
    }

    public AddDataBagItemCommand(EditingDomain domain) {
        super(domain);
    }

    private void initializeCreateFileOperation(String dataBagItemName) {
        IFile fileHandle = ResourcesPlugin.getWorkspace().getRoot().getFile(dbItemPath);
        resourceOperation = new CreateFileOperation(fileHandle, null, null, "Creating data bag item");
    }

    @Override
    protected boolean prepare() {
        return true;
    }

    @Override
    public AbstractWorkspaceOperation getResourceOperation() {
        return resourceOperation;
    }
}
