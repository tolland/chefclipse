package org.limepepper.chefclipse.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.navigator.testers.ChefTester;

public class ContributionItemDynamic extends CompoundContributionItem {

    IWorkbenchWindow      workbench             = PlatformUI
                                                        .getWorkbench()
                                                        .getActiveWorkbenchWindow();

    ChefRepositoryManager chefRepositoryManager = ChefRepositoryManager.INSTANCE;

    Map<String, String>   menuItems             = new HashMap<String, String>();
    Map<String, String>   remoteMenuItems       = new HashMap<String, String>();

    @Override
    protected IContributionItem[] getContributionItems() {

        IStructuredSelection selection = (IStructuredSelection) PlatformUI
                .getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        if (selection == null)
            return new IContributionItem[] {};

        Object item = selection.getFirstElement();
        // if (item instanceof IResource) {

        /*
         * if (ChefTester.testResource(item, "isCookbook")) {
         * menuItems.put("compare.cookbook", "Compare with server1");
         * }
         * if (ChefTester.testResource(item, "isKnifeConfig")) {
         * menuItems.put("open.knifeconfig", "parse knife ecores");
         * menuItems
         * .put("open.remoteconnection", "OPen remote to this server");
         * }
         */
        if (ChefTester.testResource(item, "isKnifeConfigFile")) {
            menuItems.put("open.knifeconfig", "parse knife ecores");
        }

/*
 * if (ChefTester.testResource(item, "isChefserver")) {
 * menuItems.put("open.remoteconnection",
 * "open this server connection");
 * menuItems.put("refresh.remoteconnection",
 * "refresh this model from server");
 * }
 */
        // }
        return fillMenu();
        // return new IContributionItem[] {};
    }

    IContributionItem[] fillMenu() {

        menuItems.put("refresh.workstation", "update local model");

        List<IContributionItem> iContItems = new ArrayList<IContributionItem>();
        for (Entry<String, String> entry : menuItems.entrySet()) {
            iContItems.add(menuItem(entry));
        }

        return iContItems.toArray(new IContributionItem[0]);

    }

    // org.limepepper.chefclipse.chefserver.api.ui.handler

    IContributionItem menuItem(Entry<String, String> entry) {
        // @todo monkey hack
        IContributionItem menuItem = menuItem(entry,
                "org.limepepper.chefclipse.commands.popupContext");

        return menuItem;
    }

    IContributionItem menuItem(Entry<String, String> entry, String commandId) {

        workbench = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

        CommandContributionItemParameter ccip = new CommandContributionItemParameter(
                workbench, entry.getKey(), commandId,
                CommandContributionItem.STYLE_PUSH);

        Map<String, String> params = new HashMap<String, String>();
        params.put("commandParameter1", entry.getKey());
        ccip.parameters = params;
        ccip.label = entry.getValue();

        return new CommandContributionItem(ccip);
    }
}
