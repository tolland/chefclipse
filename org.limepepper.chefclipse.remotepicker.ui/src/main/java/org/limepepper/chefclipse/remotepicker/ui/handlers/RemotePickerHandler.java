/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.DiscoveryCore;
import org.eclipse.equinox.internal.p2.ui.discovery.util.WorkbenchUtil;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogConfiguration;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.limepepper.chefclipse.remotepicker.ui.repository.CookbookDiscoveryStrategy;

/**
 * @author Sebastian Sampaoli
 *
 */
public class RemotePickerHandler extends AbstractHandler {

	private static final String DISCOVERY_DESCRIPTION = "Select cookbooks to install. Press Finish to proceed with installation.\n" +
			"Press the information button to see a detailed overview and a link to more information.";
	private static final String CHEFCLIPSE_COOKBOOK_DISCOVERY = "Chefclipse Cookbook Discovery";
	private static final String INSTALL_COOKBOOKS = "Install Cookbooks";

	/**
	 * 
	 */
	public RemotePickerHandler() {

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Catalog catalog = new Catalog();
		catalog.setEnvironment(DiscoveryCore.createEnvironment());
		catalog.setVerifyUpdateSiteAvailability(false);

		// look for descriptors from installed bundles
		//catalog.getDiscoveryStrategies().add(new CookbookDiscoveryStrategy());

		// look for remote descriptor
		CookbookDiscoveryStrategy cookbookDiscoveryStrategy = new CookbookDiscoveryStrategy();
		catalog.getDiscoveryStrategies().add(cookbookDiscoveryStrategy);

		CatalogConfiguration configuration = new CatalogConfiguration();
		configuration.setShowInstalled(false);
		configuration.setShowInstalledFilter(false);
		configuration.setShowTagFilter(false);
		configuration.setVerifyUpdateSiteAvailability(false);

		DiscoveryWizard wizard = new DiscoveryWizard(catalog, configuration);
		wizard.setWindowTitle(INSTALL_COOKBOOKS);
		wizard.getCatalogPage().setTitle(CHEFCLIPSE_COOKBOOK_DISCOVERY);
		wizard.getCatalogPage().setDescription(DISCOVERY_DESCRIPTION);
		
		WizardDialog dialog = new WizardDialog(WorkbenchUtil.getShell(), wizard);
//		try {
//			cookbookDiscoveryStrategy.performDiscovery(null);
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		dialog.open();
		return null;
	}

}
