/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.databag.editor.Activator;
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

    public RemoveDataBagItemAction(EditingDomain editingDomain) {
        super(editingDomain, REMOVE_JSON_PROPERTY_ACTION);
        setId(ID);
        setToolTipText(REMOVE_JSON_PROPERTY_TOOLTIP);
        setText(REMOVE_JSON_PROPERTY_ACTION);
        ImageDescriptor descriptor = Activator.getDefault().getImageRegistry()
                .getDescriptor(Activator.DATA_BAG_EDITOR);
        ImageDescriptor removeImageOverlay = PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE);
        setImageDescriptor(DataBagEditorUtils.INSTANCE.getOverlayImageDescriptor(descriptor,
                removeImageOverlay));
        setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
    }

    @Override
    public Command createCommand(Collection<?> selection) {
        return DeleteCommand.create(domain, selection);
//        for (Object object : selection) {
//            Resource item = (Resource) object;
//            
//        }
//        return null;
    }

    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }
}
