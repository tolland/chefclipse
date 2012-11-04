package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Set;

import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryWizard;
import org.limepepper.chefclipse.remotepicker.api.MultipleVendorCookbookRepository;
import org.limepepper.chefclipse.remotepicker.api.CookbookSiteRepository;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.repository.CookbookDiscoveryStrategy;

/**
 * A wizard for interacting with cookbooks repositories.
 * 
 * @author Sebastian Sampaoli
 */
public class CookbookDiscoveryWizard extends DiscoveryWizard{

	private static final String PREF_DEFAULT_CATALOG = CatalogDescriptor.class.getSimpleName();
	
	private static final String INSTALL_COOKBOOKS = "Install Cookbooks";

	private Set<CatalogItem> operationNewInstallItems;

	private boolean initialSelectionInitialized;

	private Set<URI> addedRepositoryLocations;
	

//	private final MarketplaceService marketplaceService;

	public CookbookDiscoveryWizard(Catalog catalog, CookbookCatalogConfiguration configuration) {
		super(catalog, configuration);
		setWindowTitle(INSTALL_COOKBOOKS);
	}

	@Override
	protected CookbookCatalogPage doCreateCatalogPage() {
		return new CookbookCatalogPage(getCatalog(), getConfiguration());
	}
	
	@Override
	public void addPages() {
		doDefaultCatalogSelection();
		super.addPages();
	}

	private void doDefaultCatalogSelection() {
		
		if (getConfiguration().getCatalogDescriptor() == null) {
			ICookbooksRepository cookbooksSiteRepository= new CookbookSiteRepository();
			CatalogDescriptor defaultCatalogDescriptor = new CatalogDescriptor();
			defaultCatalogDescriptor.setDescription("Opscode catalog descriptor");
			defaultCatalogDescriptor.setLabel(cookbooksSiteRepository.getRepositoryId());
			try {
				defaultCatalogDescriptor.setUrl(cookbooksSiteRepository.getRepositoryURI().toURL());
			} catch (MalformedURLException e) {
				System.out.println("no se pudo crear la url del repo...");
				e.printStackTrace();
			}
			ICookbooksRepository communityCookbookRepository = new MultipleVendorCookbookRepository();
			CatalogDescriptor catalogDescriptor = new CatalogDescriptor();
			catalogDescriptor.setDescription("Community catalog descriptor");
			catalogDescriptor.setLabel(communityCookbookRepository.getRepositoryId());
			try {
				catalogDescriptor.setUrl(communityCookbookRepository.getRepositoryURI().toURL());
			} catch (MalformedURLException e) {
				System.out.println("no se pudo crear la url del repo...");
				e.printStackTrace();
			}
			getConfiguration().getCatalogDescriptors().add(defaultCatalogDescriptor);
			getConfiguration().getCatalogDescriptors().add(catalogDescriptor);
			getConfiguration().setCatalogDescriptor(defaultCatalogDescriptor);
//			String defaultCatalogUrl = MarketplaceClientUiPlugin.getInstance()
//			.getPreferenceStore()
//			.getString(PREF_DEFAULT_CATALOG);
//			// if a preferences was set, we default to that catalog descriptor
//			if (defaultCatalogUrl != null && defaultCatalogUrl.length() > 0) {
//				for (CatalogDescriptor descriptor : getConfiguration().getCatalogDescriptors()) {
//					URL url = descriptor.getUrl();
//					try {
//						if (url.toURI().toString().equals(defaultCatalogUrl)) {
//							getConfiguration().setCatalogDescriptor(descriptor);
//							break;
//						}
//					} catch (URISyntaxException e) {
//						// ignore
//					}
//				}
//			}
//			// if no catalog is selected, pick one
//			if (getConfiguration().getCatalogDescriptor() == null
//					&& getConfiguration().getCatalogDescriptors().size() > 0) {
//				// fall back to first catalog
//				getConfiguration().setCatalogDescriptor(getConfiguration().getCatalogDescriptors().get(0));
//			}
		}
	}
	
	@Override
	public CookbookCatalogConfiguration getConfiguration() {
		return (CookbookCatalogConfiguration) super.getConfiguration();
	}

	@Override
	public void dispose() {
//		removeAddedRepositoryLocations();
//		if (getConfiguration().getCatalogDescriptor() != null) {
//			// remember the catalog for next time.
//			try {
//				Activator.getDefault()
//				.getPreferenceStore()
//				.setValue(PREF_DEFAULT_CATALOG,
//						getConfiguration().getCatalogDescriptor().getUrl().toURI().toString());
//			} catch (URISyntaxException e) {
//				// ignore
//			}
//		}
		if (getCatalog() != null) {
			getCatalog().dispose();
		}
		super.dispose();
	}

	@Override
	public boolean performFinish() {
//		if (profileChangeOperation != null
//				&& profileChangeOperation.getResolutionResult().getSeverity() != IStatus.ERROR) {
//			if (computeMustCheckLicenseAcceptance()) {
//				if (acceptLicensesPage != null && acceptLicensesPage.isPageComplete()) {
//					acceptLicensesPage.performFinish();
//				}
//			}
//			ProvisioningJob provisioningJob = profileChangeOperation.getProvisioningJob(null);
//			if (!operationNewInstallItems.isEmpty()) {
//				provisioningJob.addJobChangeListener(new ProvisioningJobListener(operationNewInstallItems));
//			}
//			ProvisioningUI.getDefaultUI().schedule(provisioningJob, StatusManager.SHOW | StatusManager.LOG);
//			addedRepositoryLocations = null;
//			return true;
//		}
//		return false;
		return super.performFinish();
	}

	@Override
	public CookbookCatalogPage getCatalogPage() {
		return (CookbookCatalogPage) super.getCatalogPage();
	}

//	public synchronized Set<String> getInstalledFeatures() {
//		if (installedFeatures == null) {
//			try {
//				if (Display.getCurrent() != null) {
//					getContainer().run(true, false, new IRunnableWithProgress() {
//						public void run(IProgressMonitor monitor) throws InvocationTargetException,
//						InterruptedException {
//							installedFeatures = MarketplaceClientUi.computeInstalledFeatures(monitor);
//						}
//					});
//				} else {
//					installedFeatures = MarketplaceClientUi.computeInstalledFeatures(new NullProgressMonitor());
//				}
//			} catch (InvocationTargetException e) {
//				MarketplaceClientUi.error(e.getCause());
//				installedFeatures = Collections.emptySet();
//			} catch (InterruptedException e) {
//				// should never happen (not cancelable)
//				throw new IllegalStateException(e);
//			}
//		}
//		return installedFeatures;
//	}

//	public SelectionModel getSelectionModel() {
//		return selectionModel;
//	}

	void initializeCatalog() {
		for (AbstractDiscoveryStrategy strategy : getCatalog().getDiscoveryStrategies()) {
			strategy.dispose();
		}
		getCatalog().getDiscoveryStrategies().clear();
		if (getConfiguration().getCatalogDescriptor() != null) {
			getCatalog().getDiscoveryStrategies().add(
					new CookbookDiscoveryStrategy(getConfiguration().getCatalogDescriptor()));
		}
	}

}
