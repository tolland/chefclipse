/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Collection;
import java.util.ListIterator;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.editors.MultiPageDataBagEditor;

/**
 * Removes the selected JSON property for all the opened data bag items.
 * 
 * @author Sebastian Sampaoli
 */
public class RemoveJsonPropertyAction extends CommandActionHandler {

    private static final String REMOVE_JSON_PROPERTY_TOOLTIP =
            "Remove the selected JSON property for all the opened data bag items";
    private static final String REMOVE_JSON_PROPERTY_ACTION = "Remove JSON property";
    public static final String ID = REMOVE_JSON_PROPERTY_ACTION;
	private MultiPageDataBagEditor editor;

    public RemoveJsonPropertyAction(EditingDomain editingDomain, MultiPageDataBagEditor multiPageDataBagEditor) {
        super(editingDomain, REMOVE_JSON_PROPERTY_ACTION);
        this.editor = multiPageDataBagEditor;
        setId(ID);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
    }

    class XTextCompoundCommand extends CompoundCommand {
    	@Override
		public void execute() {
			for (ListIterator<Command> commands = commandList.listIterator(); commands.hasNext();) {
				try {
					final DeleteCommand command = (DeleteCommand) commands.next();
					EObject object = (EObject) command.getCollection().iterator().next();
					if (object.eResource() instanceof XtextResource) {
						IXtextDocument doc = editor.getXtextDocument(object.eResource());
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
    
    @Override
    public Command createCommand(Collection<?> selection) {
        CompoundCommand deleteCompoundCommand = new XTextCompoundCommand();
        for (Object object: selection) {
            EObject entryElement = (EObject) object;
            Collection<EObject> eObjects = DataBagEditorManager.INSTANCE.getEObjectsOfKey(entryElement, domain.getResourceSet().getResources());
            for (EObject value : eObjects) {
                deleteCompoundCommand.append(DeleteCommand.create(domain, value));
            }
            deleteCompoundCommand.append(DeleteCommand.create(domain, entryElement));
        }
        return deleteCompoundCommand;
    }
    
    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }

}
