/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.commands;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.ide.undo.AbstractWorkspaceOperation;
import org.eclipse.ui.ide.undo.CreateFileOperation;

/**
 * Creates a new JSON file resource.
 *  
 * @author Sebastian Sampaoli
 */
public class AddJsonFileCommand extends AbstractResourceOperationCommand {

    private CreateFileOperation resourceOperation;
    private String jsonFileName;
    private IPath jsonFilePath;

    public AddJsonFileCommand(EditingDomain domain, IPath dbItemPath) {
        super(domain);
        this.jsonFilePath = dbItemPath;
        initializeCreateFileOperation(jsonFileName);
    }

    public AddJsonFileCommand(EditingDomain domain) {
        super(domain);
    }

    private void initializeCreateFileOperation(String jsonFileName) {
        IFile fileHandle = ResourcesPlugin.getWorkspace().getRoot().getFile(jsonFilePath);
        resourceOperation = new CreateFileOperation(fileHandle, null, null, "Creating JSON file");
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
