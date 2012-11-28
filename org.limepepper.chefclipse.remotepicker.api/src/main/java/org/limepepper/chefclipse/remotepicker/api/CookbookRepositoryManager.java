/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
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
 * Manager for Cookbook Repositories.
 * Handles registration, loading, installing and local cache of repositories.
 * A common usage is to call #registerRepository(RemoteRepository, ICookbooksRepository)
 * for each repository and then #loadRepository(String) to load and cache the cookbooks.
 * {@link #setCacheFolder(String)} should be called prior to loading.
 * This class is thread safe.
 * This plugin can be used standalone, outside eclipse.
 * 
 * @author Guillermo Zunino
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

	/**
	 * Gets the singleton instance of this class.
	 * @return the singleton instance
	 */
	public static CookbookRepositoryManager getInstance() {
		if (instance == null) {
			instance = new CookbookRepositoryManager();
		}
		return instance;
	}

	/**
	 * Returns the registered repositories.
	 * @return a {@link Collection} of repositories
	 */
	public Collection<RemoteRepository> getRepositories() {
		lock.lock(); // block until condition holds
		try {
			return Collections.unmodifiableCollection(repositories.values());
		} finally {
			lock.unlock();
		}
	}

	/**
	 * Returns a {@link RemoteRepository} by it's unique id.
	 * @param id the repository Id
	 * @return a {@link RemoteCookbook}
	 */
	public RemoteRepository getRepository(String id) {
		return repositories.get(id);
	}

	/**
	 * Registers a repository of cookbooks to managed by this manager.
	 * @param repo the {@link RemoteRepository} instance.
	 * @param retriever an implementation of {@link ICookbooksRepository} to download 
	 * cookbooks (eg. contacting a REST service)
	 * @return a managed instance of {@link RemoteRepository}, possible different than the given if this 
	 * was previously registered 
	 */
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

	/**
	 * Deletes the cache and clears registered repositories.
	 */
	public void evictCache() {
		new File(getCacheFile()).delete();
		for (RemoteRepository repo : repositories.values()) {
			new File(getCacheFile(repo.getId())).delete();
		}
		repositories.clear();
		retrievers.clear();
		listeners.clear();
	}

	private void cacheRepository(RemoteRepository repo) {
		ICookbooksRepository cookbookRepository = retrievers.get(repo.getId());
		Collection<RemoteCookbook> cookbooks = cookbookRepository
				.getCookbooks();
		Map<String, Date> installed = new HashMap<String, Date>();
		EList<RemoteCookbook> old = repo.getCookbooks();
		for (RemoteCookbook cookbook : old) {
			if (cookbook.getInstalledAt() != null) {
				installed.put(cookbook.getName(), cookbook.getInstalledAt());
			}
		}
		repo.getCookbooks().clear();

		// restore installed date
		for (RemoteCookbook cookbook : cookbooks) {
			Date installedAt = installed.get(cookbook.getName());
			if (installedAt != null) {
				cookbook.setInstalledAt(installedAt);
			}
		}
		lock.lock();
		try {
			repo.getCookbooks().addAll(cookbooks);
		} finally {
			lock.unlock();
		}

		if (listeners.containsKey(repo.getId()))
			listeners.get(repo.getId()).firePropertyChange("cookbooks", null, cookbooks);
		saveCacheModel(repo);
	}

	private void saveCacheModel(RemoteRepository repo) {
		Calendar cal = Calendar.getInstance();
		repo.setUpdatedAt(cal.getTime());
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
			e.printStackTrace();
		}
	}

	/**
	 * Sets the folder used as cache.
	 * @param stateLocation the cache folder path
	 */
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

	/**
	 * Loads an cache cookbooks from the given repository. This can be a blocking long time operation.
	 * If the repository is already cached, it will return immediately. Cookbooks can be accesed with
	 * {@link RemoteRepository#getCookbooks()} after this method returns.
	 * @param repoId the repository Id to load.
	 */
	public void loadRepository(String repoId) {
		RemoteRepository repo = repositories.get(repoId);
		ICookbooksRepository cookbookRepository = retrievers.get(repoId);
		
		if (cookbookRepository == null || repo == null) {
			throw new RuntimeException("Invalid repoId " + repoId);
		}

		if (!isCached(repo) || cookbookRepository.isUpdated(repo)) {
			cacheRepository(repo);
		}
	}

	/**
	 * Download and expand a chef cookbook tree structure from remote in a local tmp folder.
	 * @param remoteCookbook
	 * @param repositoryId
	 * @return
	 * @throws InstallCookbookException
	 */
	public File downloadCookbook(RemoteCookbook remoteCookbook, String repositoryId) throws InstallCookbookException{
		ICookbooksRepository cookbooksRepository = retrievers.get(repositoryId);
		File downloadCookbook = cookbooksRepository.downloadCookbook(remoteCookbook);
		updateInstalledDate(remoteCookbook);
		return downloadCookbook;
	}
	
	/**
	 * Installs a chef cookbook under the given chef projectPath.
	 * @param cookbookName the cookbook name to instakk
	 * @param downloadCookbook previuos File given by {@link #downloadCookbook(RemoteCookbook, String)}
	 * @param projectPath the path to install to
	 * @throws InstallCookbookException if cannot be done.
	 */
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

	/**
	 * Add a listener to be called when the given repository finish loading cookbooks.
	 * Useful method when putting the manager on a separate thread.
	 * @param repoId the {@link RemoteRepository} id.
	 * @param listener a {@link PropertyChangeListener}
	 */
	public void addRepositoryListener(String repoId, PropertyChangeListener listener) {
		listeners.get(repoId).addPropertyChangeListener(listener);
		if (isRepositoryReady(repoId)) {
			RemoteRepository repo = repositories.get(repoId);
			listeners.get(repoId).firePropertyChange("cookbooks", null, repo.getCookbooks());
		}
	}

	/**
	 * Remove a previously registered listener for the given {@link RemoteRepository} id. 
	 * @param repoId the repository id
	 * @param listener the {@link PropertyChangeListener}
	 */
	public void removeRepositoryListener(String repoId, 
			PropertyChangeListener listener) {
		listeners.get(repoId).removePropertyChangeListener(listener);
	}

	/**
	 * Returns true if the repository has loaded all cookbooks and it's ready.
	 * @param repoId the {@link RemoteRepository} id.
	 * @return true if repository is ready.
	 */
	public boolean isRepositoryReady(String repoId) {
		lock.lock();
		try {
			return !repositories.get(repoId).getCookbooks().isEmpty();
		} finally {
			lock.unlock();
		}
	}

	private void updateInstalledDate(RemoteCookbook remoteCookbook) {
	
		Calendar cal = Calendar.getInstance();
		remoteCookbook.setInstalledAt(cal.getTime());
		
		Resource resource = remoteCookbook.eResource();
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}