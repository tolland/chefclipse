/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.actions;

import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.limepepper.chefclipse.structured.json.editor.StructuredJsonEditorActivator;
import org.limepepper.chefclipse.structured.json.editor.commands.AddJsonFileCommand;
import org.limepepper.chefclipse.structured.json.editor.dialogs.AddNewJsonFileDialog;
import org.limepepper.chefclipse.structured.json.editor.utils.StructuredJsonEditorUtils;

/**
 * Adds a new JSON file to the current editor.
 * 
 * @author Sebastian Sampaoli
 */
public class AddNewJsonFileAction extends CommandActionHandler {
    
    private static final String ADD_JSON_FILE_TOOLTIP = "Add a new JSON file to the current editor";
    private static final String ADD_JSON_FILE_ACTION = "Add new JSON file item";
    public static final String ID = ADD_JSON_FILE_ACTION;
    private IFolder parentFolder;

    public AddNewJsonFileAction(EditingDomain editingDomain, IFolder parentFolder) {
        super(editingDomain, ADD_JSON_FILE_ACTION);
        this.parentFolder = parentFolder;
        setId(ID);
        setToolTipText(ADD_JSON_FILE_TOOLTIP);
        setText(ADD_JSON_FILE_ACTION);
        ImageDescriptor descriptor = StructuredJsonEditorActivator.getDefault().getImageRegistry().getDescriptor(StructuredJsonEditorActivator.STRUCTURED_JSON_EDITOR);
        ImageDescriptor addImageOverlay = StructuredJsonEditorActivator.getDefault().getImageRegistry().getDescriptor(StructuredJsonEditorActivator.ADD_JSON_FILE_OVERLAY);
        setImageDescriptor(StructuredJsonEditorUtils.INSTANCE.getOverlayImageDescriptor(descriptor, addImageOverlay));
    }
    
    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }
    
    @Override
    public Command createCommand(Collection<?> selection) {
        Command addJsonFileCommand = new AddJsonFileCommand(domain);
        return addJsonFileCommand;
    }
    
    @Override
    public void run() {
      AddNewJsonFileDialog addJsonFileDialog = new AddNewJsonFileDialog(Display.getCurrent().getActiveShell(), null, false);
      int open = addJsonFileDialog.open();
      if (open == IDialogConstants.OK_ID) {
          String jsonFileName = addJsonFileDialog.getJsonFileName();
          if (!jsonFileName.toLowerCase().endsWith(".json")) {
              jsonFileName = jsonFileName + ".json";
          }
          IPath dbItemPath = parentFolder.getFullPath().append(jsonFileName);
          Command addJsonFileCommand = new AddJsonFileCommand(domain, dbItemPath);
          domain.getCommandStack().execute(addJsonFileCommand);
      }
      
    }
}
