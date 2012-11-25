/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;

/**
 * @author Guillermo Zunino
 * 
 */
public class CookbookRepositoryManager {
	
	private static final String CACHE_EXT = "cookbookrepository";
	private static final String COOKBOOKS_PROJECT_DIRECTORY = "cookbooks";

	private static CookbookRepositoryManager instance;

	private ResourceSet resSet = new ResourceSetImpl();
	private Map<String, RemoteRepository> repositories = new HashMap<String, RemoteRepository>();
	private Map<String, ICookbooksRepository> retrievers = new HashMap<String, ICookbooksRepository>();
	private Map<String, PropertyChangeSupport> listeners = new HashMap<String, PropertyChangeSupport>();
	private Lock lock = new ReentrantLock();
	private String cacheFolder;

	CookbookRepositoryManager() {
		instance = this;
	}

	public static CookbookRepositoryManager getInstance() {
		if (instance == null) {
			instance = new CookbookRepositoryManager();
		}
		return instance;
	}


	public Collection<RemoteRepository> getRepositories() {
		lock.lock(); // block until condition holds
		try {
//			if (!loaded) {
//				readCache();
//			}
			return Collections.unmodifiableCollection(repositories.values());
		} finally {
			lock.unlock();
		}
	}

	public RemoteRepository getRepository(String id) {
//		if (!loaded) {
//			readCache();
//		}
		return repositories.get(id);
	}

//	private void readCache() {
//		// TODO load repositories on demand by EMF lazy support
//		// Initialize the model
//		CookbookrepositoryPackage.eINSTANCE.eClass();
//		// Register the XMI resource factory for the .cookbookrepo extension
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put(CACHE_EXT, new XMIResourceFactoryImpl());
//
//		for (RemoteRepository repo : repositories.values()) {
//			if (isCached(repo)) {
//				// Obtain a new resource set
//				ResourceSet resSet = new ResourceSetImpl();
//
//				// Get the resource
//				Resource resource = resSet.getResource(
//						URI.createFileURI(getCacheFile(repo)), true);
//				if (resource != null) {
//					// Get the first model element and cast it to the right
//					// type, in my
//					// example everything is hierarchical included in this first
//					// node
//					RemoteRepository cachedRepo = (RemoteRepository) resource
//							.getContents().get(0);
//					repo.getCookbooks().addAll(cachedRepo.getCookbooks());
//				}
//			}
//		}
//		loaded = true;
//	}

	public RemoteRepository registerRepository(RemoteRepository repo,
			ICookbooksRepository retriever) {
		lock.lock(); // block until condition holds
		try {
			if (repositories.isEmpty()) {
				loadRepositoriesCache();
			}
			RemoteRepository cachedRepo = repositories.get(repo.getId());
			if (cachedRepo == null) {
				cachedRepo = repo;
				repositories.put(repo.getId(), repo);
			}
			listeners.put(repo.getId(), new PropertyChangeSupport(repo));
			retrievers.put(repo.getId(), retriever);
			return cachedRepo;
		} finally {
			lock.unlock();
		}
	}

	private void loadRepositoriesCache() {
		CookbookrepositoryPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .cookbookrepo extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(CACHE_EXT, new XMIResourceFactoryImpl());

		if (isCached()) {
			// Get the resource
			Resource resource = resSet.getResource(
					URI.createFileURI(getCacheFile()), true);
			if (resource != null) {
				Collection<RemoteRepository> toDelete = new ArrayList<RemoteRepository>();
				for (EObject eobject : resource.getContents()) {
					RemoteRepository cachedRepo = (RemoteRepository) eobject;
					if (isCached(cachedRepo)) {
						lock.lock();
						try {
							repositories.put(cachedRepo.getId(), cachedRepo);
						} finally {
							lock.unlock();
						}
					} else {
						toDelete.add(cachedRepo);
					}
				}
				resource.getContents().removeAll(toDelete);
			}
		}
	}

	public void evictCache() {
		new File(getCacheFile()).delete();
		for (RemoteRepository repo : repositories.values()) {
			new File(getCacheFile(repo.getId())).delete();
		}
	}

	private void cacheRepository(RemoteRepository repo) {
		ICookbooksRepository cookbookRepository = retrievers.get(repo.getId());
		Collection<RemoteCookbook> cookbooks = cookbookRepository
				.getCookbooks();
		lock.lock();
		try {
			repo.getCookbooks().addAll(cookbooks);
		} finally {
			lock.unlock();
		}

		saveCacheModel(repo);
		if (listeners.containsKey(repo.getId()))
			listeners.get(repo.getId()).firePropertyChange("cookbooks", null, cookbooks);
	}

	private void saveCacheModel(RemoteRepository repo) {
		// TODO save only cookbooks and info about lastupdate

		// get or create the main cache resource
		Resource cacheRes;
		if (isCached()) {
			cacheRes = resSet.getResource(URI.createFileURI(getCacheFile()), true);
		} else {
			cacheRes = resSet.createResource(URI.createFileURI(getCacheFile()));
		}
		if (repo.eResource() == null) {
			cacheRes.getContents().add(repo);
		}
		
		// Create a resource
		Resource resource = resSet.createResource(URI
				.createFileURI(getCacheFile(repo.getId())));
		resource.getContents().addAll(repo.getCookbooks());

		// Now save the content.
		try {
			cacheRes.save(Collections.EMPTY_MAP);
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setCacheFolder(String stateLocation) {
		cacheFolder = stateLocation;
	}

	private String getCacheFile(String repoId) {
		return new StringBuilder(cacheFolder)
			.append(File.separatorChar)
			.append(repoId).append(".")
			.append(CACHE_EXT).toString();
	}

	private String getCacheFile() {
		return new StringBuilder(cacheFolder)
			.append(File.separatorChar)
			.append("cache").append(".")
			.append(CACHE_EXT).toString();
	}

	private boolean isCached(RemoteRepository repo) {
		File file = new File(getCacheFile(repo.getId()));
		return file.exists() && file.canRead();
	}

	private boolean isCached() {
		File file = new File(getCacheFile());
		return file.exists() && file.canRead();
	}

	public void loadRepository(String repoId) {
		RemoteRepository repo = repositories.get(repoId);
		ICookbooksRepository cookbookRepository = retrievers.get(repoId);
		
		if (cookbookRepository == null || repo == null) {
			throw new RuntimeException("Invalid repoId " + repoId);
		}

		if (!isCached(repo) || cookbookRepository.isUpdated()) {
			cacheRepository(repo);
		}
	}

	public File downloadCookbook(String cookbookName, String repositoryId) throws InstallCookbookException{
		ICookbooksRepository cookbooksRepository = retrievers.get(repositoryId);
		File downloadCookbook = cookbooksRepository.downloadCookbook(cookbookName);
		return downloadCookbook;
	}
	
	public void installCookbook(String cookbookName, File downloadCookbook, String projectPath) throws InstallCookbookException {
		
		File targetDirectory = new File(projectPath, COOKBOOKS_PROJECT_DIRECTORY);
		if (!targetDirectory.exists()) {
			boolean mkdirs = targetDirectory.mkdirs();
			if (!mkdirs){
				throw new InstallCookbookException(InstallCookbookException.INSTALL_COOKBOOK_EXCEPTION_MESSAGE + cookbookName);
			}
		}
		try {					
			FileUtils.copyDirectoryToDirectory(downloadCookbook, targetDirectory);
		} catch (IOException e) {
			throw new InstallCookbookException(InstallCookbookException.INSTALL_COOKBOOK_EXCEPTION_MESSAGE + cookbookName);
		}
		
	}

	public void addRepositoryListener(String repoId, PropertyChangeListener listener) {
		listeners.get(repoId).addPropertyChangeListener(listener);
		if (isRepositoryReady(repoId)) {
			RemoteRepository repo = repositories.get(repoId);
			listeners.get(repoId).firePropertyChange("cookbooks", null, repo.getCookbooks());
		}
	}

	public void removeRepositoryListener(String repoId, 
			PropertyChangeListener listener) {
		listeners.get(repoId).removePropertyChangeListener(listener);
	}

	public boolean isRepositoryReady(String repoId) {
		lock.lock();
		try {
			return !repositories.get(repoId).getCookbooks().isEmpty();
		} finally {
			lock.unlock();
		}
	}

}
