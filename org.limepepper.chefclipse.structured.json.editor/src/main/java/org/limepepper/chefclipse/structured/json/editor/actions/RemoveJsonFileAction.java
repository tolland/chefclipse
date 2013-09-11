/**
 * 
 */

package org.limepepper.chefclipse.structured.json.editor.actions;

import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.structured.json.editor.StructuredJsonEditorActivator;
import org.limepepper.chefclipse.structured.json.editor.commands.RemoveJsonFileCommand;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredColumnJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorManager;
import org.limepepper.chefclipse.structured.json.editor.utils.StructuredJsonEditorUtils;

/**
 * Removes the selected JSON property for all the opened Json files
 * 
 * @author Sebastian Sampaoli
 */
public class RemoveJsonFileAction extends CommandActionHandler {

    private static final String REMOVE_JSON_PROPERTY_TOOLTIP = "Remove the selected JSON file";
    private static final String REMOVE_JSON_PROPERTY_ACTION = "Remove JSON file";
    public static final String ID = REMOVE_JSON_PROPERTY_ACTION;
    private IWorkbenchPart editor;

    public RemoveJsonFileAction(EditingDomain editingDomain) {
        super(editingDomain, REMOVE_JSON_PROPERTY_ACTION);
        setId(ID);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        ImageDescriptor descriptor = StructuredJsonEditorActivator.getDefault().getImageRegistry()
                .getDescriptor(StructuredJsonEditorActivator.STRUCTURED_JSON_EDITOR);
        ImageDescriptor removeImageOverlay = PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE);
        setImageDescriptor(StructuredJsonEditorUtils.INSTANCE.getOverlayImageDescriptor(descriptor,
                removeImageOverlay));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
    }

    @Override
    public boolean isEnabled() {
        URI resoureUri = ((StructuredColumnJsonEditor) editor).getURIOfSelectedJsonFile();
        return (resoureUri != null);
    }

    @Override
    public Command createCommand(Collection<?> selection) {
        URI dbItemUri = ((StructuredColumnJsonEditor) editor).getURIOfSelectedJsonFile();
        IResource jsonFileResource = StructuredJsonEditorManager.INSTANCE.getResourceFromUri(dbItemUri);
        if (jsonFileResource != null) {
            RemoveJsonFileCommand removeJsonFileCommand = new RemoveJsonFileCommand(
                    domain, jsonFileResource);
            return removeJsonFileCommand;
        }
        return UnexecutableCommand.INSTANCE;
    }

    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            editor = workbenchPart;
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }
}
