/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.DiscoveryCore;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.CatalogRegistry;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookCatalogConfiguration;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookDiscoveryWizard;

/**
 * Handler that configures and opens the remote picker wizard.
 * 
 * @author Sebastian Sampaoli
 *
 */
@SuppressWarnings("restriction")
public class RemotePickerHandler extends AbstractHandler {

	private List<CatalogDescriptor> catalogDescriptors;
		
	private static final String DISCOVERY_DESCRIPTION = "Select cookbooks to install. Press Finish to proceed with installation.\n" +
			"Press the information button to see a detailed overview and a link to more information.";
	
	private static final String CHEFCLIPSE_COOKBOOK_DISCOVERY = "Chefclipse Cookbook Discovery";

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

		CookbookCatalogConfiguration configuration = new CookbookCatalogConfiguration();
		configuration.setShowInstalled(false);
		configuration.setShowInstalledFilter(false);
		configuration.setShowTagFilter(false);
		configuration.setVerifyUpdateSiteAvailability(false);
		configuration.setShowCategories(true);
		
		CatalogRegistry catalogRegistry = new CatalogRegistry();
		
		if (catalogDescriptors == null || catalogDescriptors.isEmpty()) {
			catalogRegistry.installRepositories();
			configuration.getCatalogDescriptors().addAll(catalogRegistry.getCatalogDescriptors());
		} else {
			configuration.getCatalogDescriptors().addAll(catalogDescriptors);
		}

		CookbookDiscoveryWizard wizard = new CookbookDiscoveryWizard(catalog, configuration);
		wizard.getCatalogPage().setTitle(CHEFCLIPSE_COOKBOOK_DISCOVERY);
		wizard.getCatalogPage().setDescription(DISCOVERY_DESCRIPTION);
		
		WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
		dialog.open();
		
		return null;
	}

}
