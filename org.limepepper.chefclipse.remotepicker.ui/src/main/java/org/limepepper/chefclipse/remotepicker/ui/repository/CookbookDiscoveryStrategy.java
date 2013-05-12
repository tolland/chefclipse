/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.repository;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.internal.p2.discovery.AbstractCatalogSource;
import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.discovery.model.Icon;
import org.eclipse.equinox.internal.p2.discovery.model.Overview;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.internal.util.BundleUtility;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.osgi.framework.Bundle;

/**
 * Strategy for discovering cookbooks. Strategy design pattern.
 * 
 * @author Sebastian Sampaoli
 *
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryStrategy extends AbstractDiscoveryStrategy {

	private static final class CatalogSource extends AbstractCatalogSource {

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
					Activator.log(e);
					return null;
				}
			}
			return fullPathString;
		}

		@Override
		public Object getId() {
			return "remotepicker";
		}
	}

	private HashMap<String, CatalogCategory> categoriesMap;
	private DateFormat dateFormat;
	private CatalogDescriptor catalogDescriptor;
	
	@Inject
	private CookbookRepositoryManager repoManager;
	private CatalogSource source = new CatalogSource();

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
		CookbookRepositoryManager repoManager = CookbookRepositoryManager.getInstance();
		setRepoManager(repoManager);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy#performDiscovery(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void performDiscovery(final IProgressMonitor monitor) throws CoreException {
		final AtomicBoolean ready = new AtomicBoolean(false);
		final SubMonitor mon = SubMonitor.convert(monitor, "Reading cookbooks", 1000);
		
		final RemoteRepository repository = getRepoManager().getRepository(catalogDescriptor.getId());
		getRepoManager().addRepositoryListener(catalogDescriptor.getId(), new PropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent evt) {
				if (mon.isCanceled())
					return;
				EList<RemoteCookbook> cookbooks = repository.getCookbooks();
				if (evt.getNewValue() instanceof Throwable && !cookbooks.isEmpty()) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error getting cookbooks", "Could not fetch cookbooks from repository. Error: " + ((Throwable)evt.getNewValue()).getMessage());
						}
					});
				}
				mon.setWorkRemaining(cookbooks.size()*10);
				for (RemoteCookbook cookBookInfo : cookbooks){
					addCategoryFromCookbook(cookBookInfo);
					items.add(createItem(cookBookInfo));
					mon.worked(10);
				}
				getRepoManager().removeRepositoryListener(catalogDescriptor.getId(), this);
				ready.set(true);
			}
		});
		
		if (!ready.get())
			mon.beginTask("Getting cookbooks...", 1000);
			
		while (!mon.isCanceled() && !ready.get()) {
			try {
				Thread.sleep(400);
				mon.worked(10);
			} catch (InterruptedException e) {
				Activator.log(e);
			}
		}
		mon.done();
	}
	
	/**
	 * Add a new category gathered from a remote cookbook to the list of categories.
	 * 
	 * @param cookBookInfo
	 */
	private void addCategoryFromCookbook(RemoteCookbook cookBookInfo) {
		String category = cookBookInfo.getCategory();
		if (!getCategoriesMap().containsKey(category)){
			CatalogCategory catalogCategory = new CatalogCategory();
			catalogCategory.setId(category);
			catalogCategory.setName(category);
			Icon icon = new Icon();
			icon.setImage32("icons/category.gif");
			catalogCategory.setIcon(icon);
			catalogCategory.setSource(source);
			getCategoriesMap().put(category, catalogCategory);
			getCategories().add(catalogCategory);
		}
	}
	
	/**
	 * Create a catalog item from a remote cookbook element.
	 * 
	 * @param cookBookInfo
	 * @return a catalog item
	 */
	private CatalogItem createItem(RemoteCookbook cookBookInfo) {

		final CatalogItem item = new CatalogItem();
		item.setId(cookBookInfo.getName());
		item.setDescription(cookBookInfo.getDescription());
		item.setName(cookBookInfo.getName());
		item.setProvider(cookBookInfo.getMaintainer());
		item.setSiteUrl(cookBookInfo.getUrl());
		item.setCategoryId(cookBookInfo.getCategory());
		item.setCategory(categoriesMap.get(cookBookInfo.getCategory()));
		item.getInstallableUnits().add(item.getId());
		item.setData(cookBookInfo);
		Icon icon = new Icon();
		RemoteRepository repository = repoManager.getRepository(cookBookInfo.getRepositoryId());
		icon.setImage32(repository.getIcon());
		item.setIcon(icon);
		if (cookBookInfo.getUpdatedAt() != null) {
			item.setLicense("updated at " + dateFormat.format(cookBookInfo.getUpdatedAt()));
		}
		item.setSource(source);
		item.setOverview(createOverview(item));
		return item;
	}

	/**
	 * Create an overview for a catalog item.
	 * 
	 * @param item
	 * @return an overview object
	 */
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
	
	/**
	 * @return the repoManager
	 */
	public CookbookRepositoryManager getRepoManager() {
		return repoManager;
	}
	
	/**
	 * @param repoManager the repoManager to set
	 */
	public void setRepoManager(CookbookRepositoryManager repoManager) {
		this.repoManager = repoManager;
	}
}
