package org.limepepper.chefclipse.chefserver.api.ui.views;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.provider.ChefserverItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.provider.WorkstationItemProviderAdapterFactory;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.utility.provider.UtilityItemProviderAdapterFactory;

public class PropertyView extends ViewPart implements ISelectionProvider {

	private ComposedAdapterFactory adapterFactory;
	private ChefServerApi api;
	private NodeTable nodeTable;
	private RoleTable roleTable;
	private EnvironmentTable environmentTable;
	private KnifeConfigController configController = KnifeConfigController.INSTANCE;
	public static final String ID = "org.limepepper.chefclipse.chefserver.api.ui.views.PropertyView";

	private Control control;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	public PropertyView() {
		initialize();
	}

	public void initialize() {
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new UtilityItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ChefserverItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new WorkstationItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// TODO replace with project chefconfig from current selection or view
		// input.
		KnifeConfig config = ChefConfigManager.instance()
				.retrieveDefaultChefConfig();
		api = configController.getServer(config);
	}

	@Override
	public void createPartControl(final Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		TabFolder tabFolder = new TabFolder(parent, SWT.NONE);

		control = tabFolder;

		TabItem nodesTabItem = new TabItem(tabFolder, SWT.NONE);
		nodesTabItem.setText("Nodes");

		TabItem rolesTabItem = new TabItem(tabFolder, SWT.NONE);
		rolesTabItem.setText("Roles");

		TabItem environmentsTabItem = new TabItem(tabFolder, SWT.NONE);
		environmentsTabItem.setText("Environments");

		// TabItem serverCookbooksTabItem = new TabItem(tabFolder, SWT.NONE);
		// serverCookbooksTabItem.setText("Server Cookbooks");

		// layout for nodes tab item
		Composite nodesComposite = new Composite(tabFolder, SWT.NONE);
		nodesComposite.setLayout(new FillLayout());
		nodesTabItem.setControl(nodesComposite);
		nodeTable = new NodeTable(nodesComposite, api);

		// layout for roles tab item
		Composite rolesComposite = new Composite(tabFolder, SWT.NONE);
		rolesComposite.setLayout(new FillLayout());
		rolesTabItem.setControl(rolesComposite);
		roleTable = new RoleTable(rolesComposite, api);

		// layout for environment tab item
		Composite environmentsComposite = new Composite(tabFolder, SWT.NONE);
		environmentsComposite.setLayout(new FillLayout());
		environmentsTabItem.setControl(environmentsComposite);
		environmentTable = new EnvironmentTable(environmentsComposite, api);

		// layout for server cookbook tab item
		// Composite serverCookbooksComposite = new Composite(tabFolder,
		// SWT.NONE);
		// serverCookbooksComposite.setLayout(new FillLayout());
		// serverCookbooksTabItem.setControl(serverCookbooksComposite);
		// serverCookbookTable = new
		// ServerCookbookTable(serverCookbooksComposite,api);
		makeActions();
		hookContextMenu();

	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(final IMenuManager manager) {
				PropertyView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(control);
		control.setMenu(menu);
		nodeTable.setMenu(menu);
		roleTable.setMenu(menu);
		environmentTable.setMenu(menu);
		getSite().registerContextMenu(menuMgr, this);
	}

	protected void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void makeActions() {
		action1 = new Action() {
			@Override
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		action2 = new Action() {
			@Override
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			@Override
			public void run() {
				/*
				 * ISelection selection = viewer.getSelection(); Object obj =
				 * ((IStructuredSelection) selection) .getFirstElement();
				 */
				showMessage("Double-click detected");
			}
		};
	}

	private void showMessage(final String message) {
		MessageDialog.openInformation(control.getShell(), "Sample View",
				message);
	}

	@Override
	public void setFocus() {

	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSelection(ISelection selection) {
		// TODO Auto-generated method stub

	}

}
