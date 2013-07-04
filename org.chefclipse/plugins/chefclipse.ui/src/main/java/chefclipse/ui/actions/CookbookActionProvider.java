package chefclipse.ui.actions;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

public class CookbookActionProvider extends CommonActionProvider {

	public CookbookActionProvider() {
	}

	private static final String NEW_MENU_ID = "common.new.menu";
	private CreateNewRecipeAction createRecipeAction;

	@Override
	public void init(ICommonActionExtensionSite aSite) {
		ICommonViewerSite viewSite = aSite.getViewSite();
		if (viewSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
			createRecipeAction = new CreateNewRecipeAction(
					workbenchSite.getPage(),
					workbenchSite.getSelectionProvider());
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {

		for (IContributionItem iterable_element : menu.getItems()) {
			System.out.println(iterable_element);
		}

		IContributionItem newMenu = menu.find("common.new.menu");
		if (newMenu == null) {
			newMenu = new MenuManager("&New", NEW_MENU_ID);
			menu.appendToGroup(ICommonMenuConstants.GROUP_NEW, newMenu);
		}
		if (createRecipeAction.isEnabled()) {
			((MenuManager) newMenu).add(createRecipeAction);
		}
	}
}
