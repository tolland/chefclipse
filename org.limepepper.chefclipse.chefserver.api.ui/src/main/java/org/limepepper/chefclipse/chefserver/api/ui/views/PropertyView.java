package org.limepepper.chefclipse.chefserver.api.ui.views;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.part.ViewPart;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.provider.ChefserverItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.provider.WorkstationItemProviderAdapterFactory;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.utility.provider.UtilityItemProviderAdapterFactory;

public class PropertyView extends ViewPart {

	private ComposedAdapterFactory adapterFactory;
	private ChefServerApi api;
	private NodeTable nodeTable;
	private RoleTable roleTable;
	private EnvironmentTable environmentTable;
	// private ServerCookbookTable serverCookbookTable;

	KnifeConfigController configController = KnifeConfigController.INSTANCE;
	public static final String ID = "org.limepepper.chefclipse.chefserver.api.ui.views.PropertyView";

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
	}

	@Override
	public void setFocus() {
		

	}

}
