/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.repository;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.internal.p2.discovery.AbstractCatalogSource;
import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.discovery.model.Icon;
import org.limepepper.chefclipse.remotepicker.api.CookbookInfo;
import org.limepepper.chefclipse.remotepicker.api.CookbookSiteRepository;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;

/**
 * @author Sebastian Sampaoli
 *
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryStrategy extends AbstractDiscoveryStrategy {

	private static final String COOKBOOK_ICON = "icons/opscode.png";
	private HashMap<String, CatalogCategory> categoriesMap;

	/**
	 * 
	 */
	public CookbookDiscoveryStrategy() {
		categories = new ArrayList<CatalogCategory>();
		setCategoriesMap(new HashMap<String, CatalogCategory>());
		items = new ArrayList<CatalogItem>();
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
		item.setName(cookBookInfo.getName());
		item.setProvider(cookBookInfo.getMaintainer());
		item.setSiteUrl(cookBookInfo.getUrl());
		item.setCategoryId(cookBookInfo.getCategory());
		item.setCategory(categoriesMap.get(cookBookInfo.getCategory()));
		item.getInstallableUnits().add(item.getId());
		Icon icon = new Icon();
		icon.setImage32(COOKBOOK_ICON);
		
		item.setSource(new AbstractCatalogSource() {
			@Override
			public URL getResource(String resourceName) {
				try {
					return new URL(resourceName);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				return null;
			}
			
			@Override
			public Object getId() {
				return item.getId();
			}
		});
		return item;
	}

	public HashMap<String, CatalogCategory> getCategoriesMap() {
		return categoriesMap;
	}

	public void setCategoriesMap(HashMap<String, CatalogCategory> categoriesMap) {
		this.categoriesMap = categoriesMap;
	}
}
