/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.actions;

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
import org.limepepper.chefclipse.databag.editor.DatabagEditorActivator;
import org.limepepper.chefclipse.databag.editor.commands.RemoveDataBagItemCommand;
import org.limepepper.chefclipse.databag.editor.editors.DataBagColumnEditor;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.utils.DataBagEditorUtils;

/**
 * Removes the selected JSON property for all the opened data bag items
 * 
 * @author Sebastian Sampaoli
 */
public class RemoveDataBagItemAction extends CommandActionHandler {

    private static final String REMOVE_JSON_PROPERTY_TOOLTIP = "Remove the selected data bag item";
    private static final String REMOVE_JSON_PROPERTY_ACTION = "Remove data bag item";
    public static final String ID = REMOVE_JSON_PROPERTY_ACTION;
    private IWorkbenchPart editor;

    public RemoveDataBagItemAction(EditingDomain editingDomain) {
        super(editingDomain, REMOVE_JSON_PROPERTY_ACTION);
        setId(ID);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        ImageDescriptor descriptor = DatabagEditorActivator.getDefault().getImageRegistry()
                .getDescriptor(DatabagEditorActivator.DATA_BAG_EDITOR);
        ImageDescriptor removeImageOverlay = PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE);
        setImageDescriptor(DataBagEditorUtils.INSTANCE.getOverlayImageDescriptor(descriptor,
                removeImageOverlay));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
    }

    @Override
    public boolean isEnabled() {
        URI resoureUri = ((DataBagColumnEditor) editor).getURIOfSelectedDBItem();
        return (resoureUri != null);
    }

    @Override
    public Command createCommand(Collection<?> selection) {
        URI dbItemUri = ((DataBagColumnEditor) editor).getURIOfSelectedDBItem();
//        DataBagEditorManager.INSTANCE.getResourceFromUri(dbItemUri);
        IResource dbItemResource = DataBagEditorManager.INSTANCE.getResourceFromUri(dbItemUri);
        if (dbItemResource != null) {
            RemoveDataBagItemCommand removeDataBagItemCommand = new RemoveDataBagItemCommand(
                    domain, dbItemResource);
            return removeDataBagItemCommand;
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
