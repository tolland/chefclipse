package org.limepepper.chefclipse.remotepicker.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.inject.Inject;

import org.eclipse.jface.resource.ImageDescriptor;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;

/**
 * Registry which holds the existing cookbooks repositories.
 * 
 * @author Sebastian Sampaoli
 */
public class CatalogRegistry {
	
	@Inject
	private CookbookRepositoryManager repoManager;
	
	private final List<CatalogDescriptor> catalogDescriptors = new CopyOnWriteArrayList<CatalogDescriptor>();
	
	public CatalogRegistry() {
		
		CookbookRepositoryManager repoManager = CookbookRepositoryManager.getInstance();
		setRepoManager(repoManager);
	}

	public void installRepositories() {
		Collection<RemoteRepository> repositories = repoManager.getRepositories();
		for (RemoteRepository remoteRepository : repositories) {
			CatalogDescriptor descriptor = new CatalogDescriptor();
			descriptor.setId(remoteRepository.getId());
			descriptor.setLabel(remoteRepository.getName());
			try {
				descriptor.setUrl(new URL(remoteRepository.getUri()));
				descriptor.setIcon(ImageDescriptor.createFromURL(new URL(remoteRepository.getIcon())));
			} catch (MalformedURLException e) {
				Activator.log(e);
			}
			descriptor.setDescription(remoteRepository.getDescription());
			catalogDescriptors.add(descriptor);
		}
	}

	public void unregister(CatalogDescriptor catalogDescriptor) {
		catalogDescriptors.remove(catalogDescriptor);
	}

	public List<CatalogDescriptor> getCatalogDescriptors() {
		return Collections.unmodifiableList(catalogDescriptors);
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
