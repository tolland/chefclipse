/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.repository;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.internal.p2.discovery.AbstractCatalogSource;
import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.discovery.model.Icon;
import org.eclipse.equinox.internal.p2.discovery.model.Overview;
import org.eclipse.ui.internal.util.BundleUtility;
import org.limepepper.chefclipse.remotepicker.api.CookbookInfo;
import org.limepepper.chefclipse.remotepicker.api.CookbookSiteRepository;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.osgi.framework.Bundle;

/**
 * @author Sebastian Sampaoli
 *
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryStrategy extends AbstractDiscoveryStrategy {

	private static final String COOKBOOK_ICON = "icons/opscode.png";
	private HashMap<String, CatalogCategory> categoriesMap;
	private DateFormat dateFormat;
	private CatalogDescriptor catalogDescriptor;

	/**
	 * 
	 */
	public CookbookDiscoveryStrategy() {
		categories = new ArrayList<CatalogCategory>();
		setCategoriesMap(new HashMap<String, CatalogCategory>());
		items = new ArrayList<CatalogItem>();
		dateFormat = DateFormat.getDateTimeInstance();
	}

	public CookbookDiscoveryStrategy(CatalogDescriptor catalogDescriptor) {
		this();
		if (catalogDescriptor == null) {
			throw new IllegalArgumentException();
		}
		this.catalogDescriptor = catalogDescriptor;
//		marketplaceService = createMarketplaceService();
//		source = new MarketplaceCatalogSource(marketplaceService);
//		marketplaceInfo = MarketplaceInfo.getInstance();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy#performDiscovery(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void performDiscovery(IProgressMonitor monitor) throws CoreException {
		
		ICookbooksRepository cookbooksSiteRepository= new CookbookSiteRepository();
		List<CookbookInfo> cookbooks = cookbooksSiteRepository.getCookbooks(monitor);
		for (CookbookInfo cookBookInfo : cookbooks){
			addCategoryFromCookbook(cookBookInfo);
			items.add(createItem(cookBookInfo));
		}
		
	}

	private void addCategoryFromCookbook(CookbookInfo cookBookInfo) {
		String category = cookBookInfo.getCategory();
		if (!getCategoriesMap().containsKey(category)){
			CatalogCategory catalogCategory = new CatalogCategory();
			catalogCategory.setId(category);
			catalogCategory.setName(category);
			getCategoriesMap().put(category, catalogCategory);
			getCategories().add(catalogCategory);
		}
	}

	private CatalogItem createItem(CookbookInfo cookBookInfo) {

		final CatalogItem item = new CatalogItem();
		item.setId(cookBookInfo.getName());
		item.setDescription(cookBookInfo.getDescription());
		item.setName("\n"+cookBookInfo.getName());
		item.setProvider(cookBookInfo.getMaintainer());
		item.setSiteUrl(cookBookInfo.getUrl());
		item.setCategoryId(cookBookInfo.getCategory());
		item.setCategory(categoriesMap.get(cookBookInfo.getCategory()));
		item.getInstallableUnits().add(item.getId());
		Icon icon = new Icon();
		icon.setImage32(COOKBOOK_ICON);
		item.setIcon(icon);
		item.setLicense("updated at " + dateFormat.format(cookBookInfo.getUpdatedAt()));
//		item.setCertificationId("cert");
		item.setSource(new AbstractCatalogSource() {
			@Override
			public URL getResource(String resourceName) {
				Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
				// look for the image (this will check both the plugin and
				// fragment folders
				URL fullPathString = BundleUtility.find(bundle, resourceName);
				if (fullPathString == null) {
					try {
						fullPathString = new URL(resourceName);
					} catch (MalformedURLException e) {
						return null;
					}
				}
				return fullPathString;
			}
			
			@Override
			public Object getId() {
				return item.getId();
			}
		});
		item.setOverview(createOverview(item));
//		Certification cert = new Certification();
//		cert.setName("cert");
//		cert.setDescription("la description");
//		cert.setSource(item.getSource());
//		cert.setIcon(icon);
//		item.setCertification(cert);
		return item;
	}

	private Overview createOverview(CatalogItem item) {
		
		Overview overview = new Overview();
		overview.setCategory(item.getCategory());
		overview.setSummary(item.getDescription());
		overview.setItem(item);
		overview.setUrl(item.getSiteUrl());
		return overview;
	}

	public HashMap<String, CatalogCategory> getCategoriesMap() {
		return categoriesMap;
	}

	public void setCategoriesMap(HashMap<String, CatalogCategory> categoriesMap) {
		this.categoriesMap = categoriesMap;
	}
}
