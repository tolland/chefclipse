/**
 * 
 */
package org.limepepper.chefclipse.databag.actions;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.limepepper.chefclipse.common.chefserver.DataBag;

/**
 * Allows to configure the NEW action and programmatically configure the context menu. 
 * This action provider does some computation before allowing creating a {@link DataBag}. 
 * That is; if the current selected resource is the folder "data_bags" it allows to create
 * a {@link DataBag} and a menu item to create the DataBag is added to the context menu, 
 * otherwise, not menu item will be added.
 *  
 * @author Sebastian Sampaoli
 *
 */
public class NewDataBagActionProvider extends CommonActionProvider {

    private static final String NEW_MENU_ID = "common.new.menu";
    private CreateNewDataBagAction createDataBagAction;

    /**
     * 
     */
    public NewDataBagActionProvider() {

    }
    
    @Override
    public void init(ICommonActionExtensionSite aSite) {
        ICommonViewerSite viewSite = aSite.getViewSite();
        if (viewSite instanceof ICommonViewerWorkbenchSite) {
            ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
            createDataBagAction = new CreateNewDataBagAction(workbenchSite.getPage(), workbenchSite.getSelectionProvider());
        }
    }
    
    @Override
    public void fillContextMenu(IMenuManager menu) {
        IContributionItem newMenu = menu.find(NEW_MENU_ID);
        if (newMenu == null) {
            newMenu = new MenuManager("&New", NEW_MENU_ID);
            menu.appendToGroup(ICommonMenuConstants.GROUP_NEW, newMenu);
        }
        if (createDataBagAction.isEnabled()) {
            ((MenuManager) newMenu).add(createDataBagAction);
        }
    }

}
