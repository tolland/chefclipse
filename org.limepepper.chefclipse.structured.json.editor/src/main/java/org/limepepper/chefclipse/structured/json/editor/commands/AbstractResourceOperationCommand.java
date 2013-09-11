/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.ide.undo.AbstractWorkspaceOperation;

/**
 * Abstract class which handles common behavior of CRUD JSON files operations.
 * 
 * Subclasses must provide the specific operation.
 * 
 * @author Sebastian Sampaoli
 */
public abstract class AbstractResourceOperationCommand extends AbstractOverrideableCommand {

    /**
     * @param domain
     */
    public AbstractResourceOperationCommand(EditingDomain domain) {
        super(domain);
    }

    /**
     * @param domain
     * @param label
     */
    public AbstractResourceOperationCommand(EditingDomain domain, String label) {
        super(domain, label);
    }

    /**
     * @param domain
     * @param label
     * @param description
     */
    public AbstractResourceOperationCommand(EditingDomain domain, String label, String description) {
        super(domain, label, description);
    }

    @Override
    public void doExecute() {
        try {
            getResourceOperation().execute(new NullProgressMonitor(), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doUndo() {
        try {
            getResourceOperation().undo(new NullProgressMonitor(), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doRedo() {
        try {
            getResourceOperation().redo(new NullProgressMonitor(), null);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    
    public abstract AbstractWorkspaceOperation getResourceOperation();
}
