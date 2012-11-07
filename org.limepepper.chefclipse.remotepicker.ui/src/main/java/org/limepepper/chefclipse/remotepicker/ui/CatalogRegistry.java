package org.limepepper.chefclipse.remotepicker.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.inject.Inject;

import org.eclipse.jface.resource.ImageDescriptor;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;


/**
 * @author Sebastian Sampaoli
 */
public class CatalogRegistry {

	private static CatalogRegistry instance;
	
	@Inject
	private CookbookRepositoryManager repoManager;
	
	private final List<CatalogDescriptor> catalogDescriptors = new CopyOnWriteArrayList<CatalogDescriptor>();

	public synchronized static CatalogRegistry getInstance() {
		
		if (instance == null) {
			instance = new CatalogRegistry();
		}
		return instance;
	}
	
	private CatalogRegistry() {
		CookbookRepositoryManager repoManager = CookbookRepositoryManager.getInstance();
		setRepoManager(repoManager);
		Collection<RemoteRepository> repositories = repoManager.getRepositories();
		for (RemoteRepository remoteRepository : repositories) {
			CatalogDescriptor descriptor = new CatalogDescriptor();
			descriptor.setLabel(remoteRepository.getId());
			try {
				descriptor.setUrl(new URL(remoteRepository.getUri()));
				descriptor.setIcon(ImageDescriptor.createFromURL(new URL(remoteRepository.getIcon())));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			descriptor.setDescription(remoteRepository.getDescription());
			catalogDescriptors.add(descriptor);
		}
	}

	public void register(CatalogDescriptor catalogDescriptor) {
		catalogDescriptors.add(new CatalogDescriptor(catalogDescriptor));
	}

	public void unregister(CatalogDescriptor catalogDescriptor) {
		catalogDescriptors.remove(catalogDescriptor);
	}

	public List<CatalogDescriptor> getCatalogDescriptors() {
		return Collections.unmodifiableList(catalogDescriptors);
	}

	public CatalogDescriptor findCatalogDescriptor(String url) {
		if (url == null || url.length() == 0) {
			return null;
		}
		for (CatalogDescriptor catalogDescriptor : catalogDescriptors) {
			if (url.startsWith(catalogDescriptor.getUrl().toExternalForm())) {
				return catalogDescriptor;
			}
		}
		return null;
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
