/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
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

	private static final String COOKBOOKSOURCE = ".cookbooksource";
	public static final String COMPOSITE_REPOSITORY_ID = "composite.repository";
	private static final String CACHE_EXT = "cookbookrepository";
	private static final String COOKBOOKS_PROJECT_DIRECTORY = "cookbooks";

	private static CookbookRepositoryManager instance;

	private final ResourceSet resSet = new ResourceSetImpl();
	private final Map<String, RemoteRepository> repositories = new HashMap<String, RemoteRepository>();
	private final Map<String, ICookbooksRepository> retrievers = new HashMap<String, ICookbooksRepository>();
	private final Map<String, PropertyChangeSupport> listeners = new HashMap<String, PropertyChangeSupport>();
	private final Lock lock = new ReentrantLock();
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
	public RemoteRepository getRepository(final String id) {
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
	public RemoteRepository registerRepository(final RemoteRepository repo,
			final ICookbooksRepository retriever) {
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

	private void cacheRepository(final RemoteRepository repo) {
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
			addRepositoryIds(repo);
		} finally {
			lock.unlock();
		}

		if (listeners.containsKey(repo.getId())) {
			listeners.get(repo.getId()).firePropertyChange("cookbooks", null, cookbooks);
		}
		saveCacheModel(repo);
	}

	private void saveCacheModel(final RemoteRepository repo) {
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
	public void setCacheFolder(final String stateLocation) {
		cacheFolder = stateLocation;
	}

	private String getCacheFile(final String repoId) {
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

	private boolean isCached(final RemoteRepository repo) {
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
	public void loadRepository(final String repoId) {
		RemoteRepository repo = repositories.get(repoId);
		ICookbooksRepository cookbookRepository = retrievers.get(repoId);

		if (cookbookRepository == null || repo == null) {
			throw new RuntimeException("Invalid repoId " + repoId);
		}

		if (!isCached(repo) || cookbookRepository.isUpdated(repo)) {
			cacheRepository(repo);
		}
	}

	private void addRepositoryIds(final RemoteRepository repo) {

		for (RemoteCookbook cookbook : repo.getCookbooks()) {
			cookbook.setRepositoryId(repo.getId());
		}
	}

	/**
	 * Download and expand a chef cookbook tree structure from remote in a local tmp folder.
	 * @param remoteCookbook
	 * @param repositoryId
	 * @return
	 * @throws InstallCookbookException
	 */
	public File downloadCookbook(final RemoteCookbook remoteCookbook, final String repositoryId) throws InstallCookbookException{
		ICookbooksRepository cookbooksRepository = retrievers.get(repositoryId);
		File downloadCookbook = cookbooksRepository.downloadCookbook(remoteCookbook);
		return downloadCookbook;
	}

	/**
	 * Installs a chef cookbook under the given chef projectPath.
	 * @param cookbookName the cookbook name to instakk
	 * @param downloadCookbook previuos File given by {@link #downloadCookbook(RemoteCookbook, String)}
	 * @param projectPath the path to install to
	 * @throws InstallCookbookException if cannot be done.
	 */
	public void installCookbook(final RemoteCookbook cookbook, final File downloadCookbook, final String projectPath) throws InstallCookbookException {

		File targetDirectory = new File(projectPath, COOKBOOKS_PROJECT_DIRECTORY);
		if (!targetDirectory.exists()) {
			boolean mkdirs = targetDirectory.mkdirs();
			if (!mkdirs){
				throw new InstallCookbookException(InstallCookbookException.INSTALL_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName());
			}
		}
		try {
			FileUtils.copyDirectoryToDirectory(downloadCookbook, targetDirectory);
			updateInstalledDate(cookbook);
			
			File source = new File(new File(targetDirectory, downloadCookbook.getName()), COOKBOOKSOURCE);
			source.createNewFile();
			Collection<String> lines = new ArrayList<String>(3);
			lines.add(cookbook.getRepositoryId());
			lines.add(cookbook.getName());
			lines.add(cookbook.getLatestVersion());
			FileUtils.writeLines(source, lines);
		} catch (IOException e) {
			throw new InstallCookbookException(InstallCookbookException.INSTALL_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName(), e);
		}
	}

	public RemoteCookbook getSourceCookbook(final File cookbookFolder) {
		assert cookbookFolder.isDirectory();
		Iterator<File> files = FileUtils.iterateFiles(cookbookFolder,
				FileFilterUtils.nameFileFilter(COOKBOOKSOURCE), null);
		if (files.hasNext()) {
			File source = files.next();

			try {
				List<String> lines = FileUtils.readLines(source);
				String repoId = lines.get(0);
				String cookbookName = lines.get(1);
				String version = lines.get(2);

				RemoteRepository sourceRepo = this.getRepository(repoId);
				return getCookbook(cookbookName, sourceRepo);
			} catch (IOException e) {
			}
		}
		return null;
	}

	/**
	 * Add a listener to be called when the given repository finish loading cookbooks.
	 * Useful method when putting the manager on a separate thread.
	 * @param repoId the {@link RemoteRepository} id.
	 * @param listener a {@link PropertyChangeListener}
	 */
	public void addRepositoryListener(final String repoId, final PropertyChangeListener listener) {
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
	public void removeRepositoryListener(final String repoId,
			final PropertyChangeListener listener) {
		listeners.get(repoId).removePropertyChangeListener(listener);
	}

	/**
	 * Returns true if the repository has loaded all cookbooks and it's ready.
	 * @param repoId the {@link RemoteRepository} id.
	 * @return true if repository is ready.
	 */
	public boolean isRepositoryReady(final String repoId) {
		lock.lock();
		try {
			return !repositories.get(repoId).getCookbooks().isEmpty();
		} finally {
			lock.unlock();
		}
	}

	private void updateInstalledDate(final RemoteCookbook remoteCookbook) {

		Calendar cal = Calendar.getInstance();
		remoteCookbook.setInstalledAt(cal.getTime());

		Resource resource = remoteCookbook.eResource();
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Register a composite repository (a repository which has all the cookbooks of the others repositories).
	 * This method must be called after registering all the concrete repositories.
	 */
	public void createCompositeRepository() {

		final RemoteRepository repo = CookbookrepositoryFactory.eINSTANCE.createRemoteRepository();
		repo.setId(COMPOSITE_REPOSITORY_ID);
		repo.setName("Composite Repository");
		repo.setDescription("Contains all the cookbooks of all registered repositories.");
		repo.setUri("http:/www.chefclipse.com/compositeRespository.html");

		final RemoteRepository registeredRepository = registerCompositeRepository(repo);

		URL iconURL = this.getClass().getClassLoader().getResource("icons/composite.png");
		registeredRepository.setIcon(iconURL.toString());

		for (final RemoteRepository remoteRepository : getRepositories()){
			this.addRepositoryListener(remoteRepository.getId(), new PropertyChangeListener() {

				@Override
				public void propertyChange(final PropertyChangeEvent evt) {
					EList<RemoteCookbook> cookbooks = remoteRepository.getCookbooks();
					registeredRepository.getCookbooks().addAll(cookbooks);
					removeRepositoryListener(remoteRepository.getId(), this);
					boolean areAllReady = true;
					for (final RemoteRepository remoteRepository : getRepositories()){
						if (!isRepositoryReady(remoteRepository.getId())){
							areAllReady = false;
						}
					}
					if (areAllReady){
						listeners.get(registeredRepository.getId()).firePropertyChange("cookbooks", null, cookbooks);
					}
				}
			});
		}

	}

	/**
	 * Searches a cookbook by name on given repo.
	 * @param name the name of the cookbook to find
	 * @param repository the repository
	 * @return the found cookbook or null
	 */
	protected RemoteCookbook getCookbook(final String name, final RemoteRepository repository) {
		EList<RemoteCookbook> cookbooks = repository.getCookbooks();
		for (RemoteCookbook cookbook : cookbooks){
			if (cookbook.getName().equals(name)) {
				return cookbook;
			}
		}
		return null;
	}

	/**
	 * Create and register a composite repository.
	 * 
	 * @param repo the composite repository to be registered.
	 * @return
	 */
	private RemoteRepository registerCompositeRepository(
			final RemoteRepository repo) {

		RemoteRepository registeredRepository = registerRepository(repo, new ICookbooksRepository() {

			@Override
			public boolean isUpdated(final RemoteRepository repo) {
				//as it's only use to cache purposes.
				return false;
			}

			@Override
			public java.net.URI getRepositoryURI() {
				try {
					return new java.net.URI(repo.getUri());
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				return null;
			}

			@Override
			public String getRepositoryId() {
				return repo.getId();
			}

			@Override
			public Collection<RemoteCookbook> getCookbooks() {
				return Collections.emptyList();
			}

			@Override
			public RemoteCookbook getCookbook(final String name) {
				for (RemoteRepository repository : getRepositories()) {
					RemoteCookbook c = CookbookRepositoryManager.this.getCookbook(name, repository);
					if (c != null) {
						return c;
					}
				}
				return null;
			}

			@Override
			public File downloadCookbook(final RemoteCookbook remoteCookbook)
					throws InstallCookbookException {

				String repositoryId = remoteCookbook.getRepositoryId();
				File downloadedCookbook = CookbookRepositoryManager.getInstance().downloadCookbook(remoteCookbook, repositoryId);
				return downloadedCookbook;
			}
		});
		return registeredRepository;
	}
}
