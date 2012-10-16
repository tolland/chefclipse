/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.repository;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.internal.p2.discovery.AbstractCatalogSource;
import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.limepepper.chefclipse.remotepicker.api.CookbookInfo;
import org.limepepper.chefclipse.remotepicker.api.CookbookSiteRepository;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;

/**
 * @author Sebastian Sampaoli
 *
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryStrategy extends AbstractDiscoveryStrategy {

	/**
	 * 
	 */
	public CookbookDiscoveryStrategy() {
		categories = new ArrayList<CatalogCategory>();
		items = new ArrayList<CatalogItem>();
	
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy#performDiscovery(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void performDiscovery(IProgressMonitor monitor) throws CoreException {
		
		ICookbooksRepository cookbooksSiteRepository= new CookbookSiteRepository();
		List<CookbookInfo> cookbooks = cookbooksSiteRepository.getCookbooks(null);
		for (CookbookInfo cookBookInfo : cookbooks){
			items.add(createItem(cookBookInfo));
		}
//		CatalogCategory category = new CatalogCategory();
//		category.setDescription("Dummy category description.");
//		category.setId("dummy cattegory 1");
//		category.setName("category name");
//		category.setData(new Object());
//		category.setSource(new AbstractCatalogSource() {
//			
//			@Override
//			public URL getResource(String resourceName) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Object getId() {
//				return "category source id";
//			}
//		});
//		boolean contains = false;
//		for (CatalogCategory cat : categories){
//			if (cat.getId().equals(category.getId()))
//				contains = true;
//		}
//		if (!contains)
//			categories.add(category);
//
//		items.add(createItem("dummy item 1", "dummy item 1 description", "dummy item 1 name", category.getId()));
//		items.add(createItem("dummy item 2", "dummy item 2 description", "dummy item 2 name", category.getId()));
//		items.add(createItem("dummy item 3", "dummy item 3 description", "dummy item 3 name", category.getId()));
//		items.add(createItem("dummy item 4", "dummy item 4 description", "dummy item 4 name", category.getId()));
	}

	private CatalogItem createItem(CookbookInfo cookBookInfo) {

		final CatalogItem item = new CatalogItem();
		item.setId(cookBookInfo.getName());
		item.setDescription(cookBookInfo.getDescription());
		item.setName(cookBookInfo.getName());
		item.setProvider(cookBookInfo.getMaintainer());
//		item.setCategoryId(categoryId);
		item.setSiteUrl(cookBookInfo.getUrl());
		item.setSource(new AbstractCatalogSource() {
			@Override
			public URL getResource(String resourceName) {
				return null;
			}
			
			@Override
			public Object getId() {
				return item.getId();
			}
		});
		return item;
		//e va a devolver Name, Description, Maintainer y URL, el resto NULL.
	}
	
//	private CatalogItem createItem(String id, String description,
//			String name, String categoryId) {
//		
//		CatalogItem item = new CatalogItem();
//		item.setId(id);
//		item.setDescription(description);
//		item.setName(name);
//		item.setCategoryId(categoryId);
//		item.setSource(new AbstractCatalogSource() {
//			
//			@Override
//			public URL getResource(String resourceName) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Object getId() {
//				return "item source id";
//			}
//		});
//		item.setAvailable(true);
//		item.setGroupId("group id 1");
//		item.setProvider("provider 1");
//		return item;
//	}

}
