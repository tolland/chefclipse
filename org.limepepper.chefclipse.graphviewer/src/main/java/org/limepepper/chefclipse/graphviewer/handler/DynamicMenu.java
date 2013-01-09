package org.limepepper.chefclipse.graphviewer.handler;

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
import org.limepepper.chefclipse.navigator.testers.ChefTester;

public class DynamicMenu extends CompoundContributionItem {

    // @todo is it reasonable to initialize this and leave the value?
    IWorkbenchWindow    workbench  = PlatformUI.getWorkbench()
                                           .getActiveWorkbenchWindow();
    // @toso is there a dedicated dynamic menu manager?
    Map<String, String> menuItems  = new HashMap<String, String>();

    static String       COMMAND_ID = "org.limepepper.chefclipse.graphviewer.popupContext";

    public DynamicMenu() {
    }

    public DynamicMenu(String id) {
        super(id);
    }

    @Override
    protected IContributionItem[] getContributionItems() {

        IStructuredSelection selection = (IStructuredSelection) PlatformUI
                .getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        
        if(selection==null)
            return new IContributionItem[] {};
        
        
        Object item = selection.getFirstElement();
/*        if (item instanceof IResource) {
            return fillMenu((IResource)item);
        }
        if (item instanceof EObject) {
            return fillMenu((EObject)item);
        }*/
        return fillMenu(item);
        // return new IContributionItem[] {}; //blank out the list for debugging
    }

    IContributionItem[] fillMenu(Object item) {

        // @todo erm?

        if (ChefTester.testResource(item, "isCookbookFolder")) {
            menuItems.put("Dependency.Graph.Editor", "Dependency Graph Editor");
            menuItems.put("Structure.Graph.Editor", "Structure Graph Editor");
        }


        if (ChefTester.testResource(item, "isKnifeConfig")) {
        }

        if (ChefTester.testResource(item, "isChefserver")) {
            // @todo - some server side vi//
            // menuItems.put("Dependency.Graph.Editor",
            // "Dependency Graph Editor");
        }

        List<IContributionItem> iContItems = new ArrayList<IContributionItem>();
        for (Entry<String, String> entry : menuItems.entrySet()) {
            iContItems.add(getMenuItem(entry));
        }

        return iContItems.toArray(new IContributionItem[0]);

    }

    IContributionItem getMenuItem(Entry<String, String> entry) {

        CommandContributionItemParameter ccip = new CommandContributionItemParameter(
                workbench, entry.getKey(), DynamicMenu.COMMAND_ID,
                CommandContributionItem.STYLE_PUSH);

        Map<String, String> params = new HashMap<String, String>();
        params.put("commandParameter", entry.getKey());
        ccip.parameters = params;
        ccip.label = entry.getValue();

        return new CommandContributionItem(ccip);
    }

}
