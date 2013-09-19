package org.limepepper.chefclipse.databag.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * Allows to configure the retargetable OPEN action and programmatically configure
 * the context menu. This action provider does some computation before allowing an element
 * being opened with the Structured JSON editor. That is: if the resource can be opened with the 
 * Structured JSON editor (it's a {@link DataBag} or a collection of {@link DataBagItem}}, the OPEN action will
 * be reconfigure and a menu item is added to the context menu, otherwise, not Open menu item
 * will be added.
 *  
 * @author Sebastian Sampaoli
 *
 */
public class OpenJsonFilesActionProvider extends CommonActionProvider {

    private OpenStructuredJSONEditorAction openAction;

    /**
     * 
     */
    public OpenJsonFilesActionProvider() {

    }
    
    @Override
    public void init(ICommonActionExtensionSite aSite) {
        ICommonViewerSite viewSite = aSite.getViewSite();
        if (viewSite instanceof ICommonViewerWorkbenchSite) {
            ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
            openAction = new OpenStructuredJSONEditorAction(workbenchSite.getPage(), workbenchSite.getSelectionProvider());
        }
    }
    
    @Override
    public void fillActionBars(IActionBars actionBars) {
        if (openAction.isEnabled()) {
            actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, openAction);
        }
    }
    
    @Override
    public void fillContextMenu(IMenuManager menu) {
        if (openAction.isEnabled()) {
            menu.appendToGroup(ICommonMenuConstants.GROUP_OPEN, openAction);
//            menu.appendToGroup(ICommonMenuConstants.GROUP_OPEN_WITH, openAction);
        }
    }

}
