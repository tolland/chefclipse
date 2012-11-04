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
import org.eclipse.equinox.internal.p2.ui.discovery.util.WorkbenchUtil;
import org.eclipse.jface.wizard.WizardDialog;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.CatalogRegistry;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookCatalogConfiguration;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookDiscoveryWizard;

/**
 * @author Sebastian Sampaoli
 *
 */
public class RemotePickerHandler extends AbstractHandler {

	private List<CatalogDescriptor> catalogDescriptors;
	
	private CatalogDescriptor selectedCatalogDescriptor;
	
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

		// look for descriptors from installed bundles

		// look for remote descriptor
//		CookbookDiscoveryStrategy cookbookDiscoveryStrategy = new CookbookDiscoveryStrategy();
//		catalog.getDiscoveryStrategies().add(cookbookDiscoveryStrategy);

		CookbookCatalogConfiguration configuration = new CookbookCatalogConfiguration();
		configuration.setShowInstalled(false);
		configuration.setShowInstalledFilter(false);
		configuration.setShowTagFilter(false);
		configuration.setVerifyUpdateSiteAvailability(false);
		configuration.setShowCategories(true);
		
//		if (catalogDescriptors == null || catalogDescriptors.isEmpty()) {
//			installRemoteCatalogs();
//			configuration.getCatalogDescriptors().addAll(CatalogRegistry.getInstance().getCatalogDescriptors());
//		} else {
//			configuration.getCatalogDescriptors().addAll(catalogDescriptors);
//		}
//		if (selectedCatalogDescriptor != null) {
//			configuration.setCatalogDescriptor(selectedCatalogDescriptor);
//		}
//		configuration.setInitialState(wizardState);
//		if (operationByNodeId != null && !operationByNodeId.isEmpty()) {
//			configuration.setInitialOperationByNodeId(operationByNodeId);
//		}


		CookbookDiscoveryWizard wizard = new CookbookDiscoveryWizard(catalog, configuration);
		wizard.getCatalogPage().setTitle(CHEFCLIPSE_COOKBOOK_DISCOVERY);
		wizard.getCatalogPage().setDescription(DISCOVERY_DESCRIPTION);
		
		WizardDialog dialog = new WizardDialog(WorkbenchUtil.getShell(), wizard);
		
		dialog.open();
		return null;
	}
	
	private void installRemoteCatalogs() {
//		try {
//			final AtomicReference<List<Catalog>> result = new AtomicReference<List<Catalog>>();
//
//			PlatformUI.getWorkbench().getProgressService().busyCursorWhile(new IRunnableWithProgress() {
//				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
//					try {
//						CatalogService catalogService = ServiceLocator.getInstance().getCatalogService();
//						final List<Catalog> catalogs = catalogService.listCatalogs(monitor);
//						result.set(catalogs);
//					} catch (CoreException e) {
//						throw new InvocationTargetException(e);
//					}
//				}
//			});
//
//			List<Catalog> catalogs = result.get();
//			for (Catalog catalog : catalogs) {
//				CatalogDescriptor descriptor = new CatalogDescriptor();
//				descriptor.setLabel(catalog.getName());
//				descriptor.setUrl(new URL(catalog.getUrl()));
//				descriptor.setIcon(ImageDescriptor.createFromURL(new URL(catalog.getImageUrl())));
//				descriptor.setDescription(catalog.getDescription());
//				descriptor.setInstallFromAllRepositories(!catalog.isSelfContained());
//				if (catalog.getDependencyRepository() != null) {
//					descriptor.setDependenciesRepository(new URL(catalog.getDependencyRepository()));
//				}
//				registerOrOverrideCatalog(descriptor);
//			}
//		} catch (InterruptedException ie) {
//			return;
//		} catch (Exception e) {
//			System.out.println("Cannot install remote locations");
//			e.printStackTrace();
//		}
	}
	
	private void registerOrOverrideCatalog(CatalogDescriptor descriptor) {
		CatalogRegistry catalogRegistry = CatalogRegistry.getInstance();
		List<CatalogDescriptor> descriptors = catalogRegistry.getCatalogDescriptors();
		for (CatalogDescriptor catalogDescriptor : descriptors) {
			if (catalogDescriptor.getUrl().toExternalForm().equals(descriptor.getUrl().toExternalForm())) {
				catalogRegistry.unregister(catalogDescriptor);
			}
		}
		catalogRegistry.register(descriptor);
	}

}
