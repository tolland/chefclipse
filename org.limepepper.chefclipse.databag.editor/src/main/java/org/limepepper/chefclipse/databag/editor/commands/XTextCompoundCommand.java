/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.commands;

import java.util.ListIterator;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * @author Sebastian Sampaoli
 *
 */
public class XTextCompoundCommand extends CompoundCommand {
    
    private ModifyXTextDocumentCommand xTextCommand;

    public XTextCompoundCommand(ModifyXTextDocumentCommand command) {
        this.xTextCommand = command;
    }
    
    @Override
    public void execute() {
        for (ListIterator<Command> commands = commandList.listIterator(); commands.hasNext();) {
            try {
                final Command command = commands.next();
                EObject object = xTextCommand.getEObjectFromCommand(command);
//                final DeleteCommand command = (DeleteCommand) commands.next();
//                EObject object = (EObject) command.getCollection().iterator().next();
                if (object.eResource() instanceof XtextResource) {
                    IXtextDocument doc = xTextCommand.getEditor().getXtextDocument(object.eResource());
                    doc.modify(new IUnitOfWork.Void<XtextResource>() {
                        @Override
                        public void process(XtextResource state) throws Exception {
                            command.execute();
                        }
                    });
                } else {
                    command.execute();
                }
            } catch (RuntimeException exception) {
                // Skip over the command that threw the exception.
                commands.previous();

                try {
                    // Iterate back over the executed commands to undo them.
                    while (commands.hasPrevious()) {
                        Command command = commands.previous();
                        if (command.canUndo()) {
                            command.undo();
                        } else {
                            break;
                        }
                    }
                } catch (RuntimeException nestedException) {
                    CommonPlugin.INSTANCE.log(new WrappedException(
                                    CommonPlugin.INSTANCE.getString("_UI_IgnoreException_exception"), nestedException).fillInStackTrace());
                }

                throw exception;
            }
        }
    }
}
