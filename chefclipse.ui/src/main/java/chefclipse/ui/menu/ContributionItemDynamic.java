package chefclipse.ui.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class ContributionItemDynamic extends CompoundContributionItem {

	private static Logger log = LoggerFactory
			.getLogger(ContributionItemDynamic.class);

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

		if (Platform.getAdapterManager()
				.getAdapter(item, CookbookVersion.class) != null) {
			System.out.println("here:" + item.getClass());
			System.out.println("here:" + item.toString());
			menuItems.put("refresh.cookbookVersion",
					"update model for this cookbook");
		}

		log.debug("here si the message");

		menuItems.put("compare.cookbook", "1Compare with ... ");
		menuItems.put("debug.show.listeners", "Show listeners");

		return fillMenu();
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
				"chefclipse.ui.commands.popupContext");

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
