package org.limepepper.chefclipse.chefserver.api.ui.handler;

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
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;

import chefclipse.core.managers.ChefRepositoryManager;

public class ContributionItemDynamic extends CompoundContributionItem {

	IWorkbenchWindow workbench = PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow();

	ChefRepositoryManager chefRepositoryManager = ChefRepositoryManager.INSTANCE;

	KnifeConfigController api = KnifeConfigController.INSTANCE;

	Map<String, String> menuItems = new HashMap<String, String>();
	Map<String, String> remoteMenuItems = new HashMap<String, String>();

	@Override
	protected IContributionItem[] getContributionItems() {

		System.err.println("in the api.ui");

		IStructuredSelection selection = (IStructuredSelection) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		if (selection == null)
			return new IContributionItem[] {};

		return fillMenu();
	}

	IContributionItem[] fillMenu() {


		List<IContributionItem> iContItems = new ArrayList<IContributionItem>();

		IStructuredSelection selection = (IStructuredSelection) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();

		remoteMenuItems.put("runlist.editor", "show run list editor");
		remoteMenuItems.put("get.cookbook", "Get cookbook remote");

		//if (selection instanceof KnifeConfig) {
			remoteMenuItems.put("get.the.server.for.this.knife", "Get server for this config");
		//}

		// @todo fix this
		for (Entry<String, String> entry : remoteMenuItems.entrySet()) {
			iContItems.add(menuItem(entry,
					"chefclipse.chefserver.api.ui.command"));
		}
		return iContItems.toArray(new IContributionItem[0]);

	}

	IContributionItem menuItem(Entry<String, String> entry) {
		// @todo monkey hack
		IContributionItem menuItem = menuItem(entry,
				"org.limepepper.chefclipse.api.ui.popupContext");

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
