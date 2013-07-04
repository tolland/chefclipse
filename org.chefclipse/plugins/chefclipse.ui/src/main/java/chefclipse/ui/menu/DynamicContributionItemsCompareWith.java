package chefclipse.ui.menu;

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

/**
 *
 *
 * @author tomhodder
 *
 *
 *         http://wiki.eclipse.org/Menu_Contributions/
 *         Populating_a_dynamic_submenu
 *         http://wiki.eclipse.org/Menu_Contributions/Problems_View_Example
 *         http:
 *         //wiki.eclipse.org/FAQ_How_do_I_make_menus_with_dynamic_contents%3F
 *
 */
public class DynamicContributionItemsCompareWith extends
		CompoundContributionItem {

	IWorkbenchWindow workbench = PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow();

	Map<String, String> menuItems = new HashMap<String, String>();
	Map<String, String> remoteMenuItems = new HashMap<String, String>();

	@Override
	protected IContributionItem[] getContributionItems() {
		IStructuredSelection selection = (IStructuredSelection) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		if (selection == null)
			return new IContributionItem[] {};

		Object item = selection.getFirstElement();
		// if (item instanceof IResource) {

		menuItems.put("compare.cookbook.opscode", "opscode community");
		menuItems.put("compare.cookbook.local", "Local History");
		menuItems.put("compare.cookbook.server", "Chef Server");
		// }
		return fillMenu();
		// return new IContributionItem[] {};
	}

	IContributionItem[] fillMenu() {

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
