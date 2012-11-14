/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbookRepositoryManager {
	
	private static final String COOKBOOKS_PROJECT_DIRECTORY = "cookbooks";
	private static CookbookRepositoryManager instance;

	CookbookRepositoryManager() {
		instance = this;
	}
	
	public static CookbookRepositoryManager getInstance() {
		if (instance == null) {
			instance = new CookbookRepositoryManager();
		}
		return instance;
	}
	
	private static final String CACHE_EXT = "cache";
	private Map<String, RemoteRepository> repositories = new HashMap<String, RemoteRepository>();
	private Map<String, ICookbooksRepository> retrievers = new HashMap<String, ICookbooksRepository>();
	private boolean loaded = false;
	private Lock lock = new ReentrantLock();
	private IPath cacheFolder;

	public Collection<RemoteRepository> getRepositories() {
		lock.lock(); // block until condition holds
		try {
			if (!loaded) {
				readCache();
			}
			return Collections.unmodifiableCollection(repositories.values());
		} finally {
			lock.unlock();
		}
	}
	
	private void readCache() {
		// TODO load repositories on demand by EMF lazy support
		// Initialize the model
		CookbookrepositoryPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .cookbookrepo extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(CACHE_EXT, new XMIResourceFactoryImpl());
		
		for (RemoteRepository repo : repositories.values()) {
			if (isCached(repo)) {
				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();
				
				// Get the resource
				Resource resource = resSet.getResource(URI
						.createFileURI(getCacheFile(repo)), true);
				if (resource != null) {
				// Get the first model element and cast it to the right type, in my
				// example everything is hierarchical included in this first node
					RemoteRepository cachedRepo = (RemoteRepository) resource.getContents().get(0);
					repo.getCookbooks().addAll(cachedRepo.getCookbooks());
				}
			}
		}
		loaded = true;
	}

	public RemoteRepository getRepository(String id) {
		if (!loaded) {
			readCache();
		}
		return repositories.get(id);
	}

	public void registerRepository(RemoteRepository repo, ICookbooksRepository retriever) {
		lock.lock(); // block until condition holds
		try {
			repositories.put(repo.getId(), repo);
			retrievers.put(repo.getId(), retriever);
		} finally {
			lock.unlock();
		}
	}
	
	public void evictCache() {
		for (RemoteRepository repo : repositories.values()) {
			new File(getCacheFile(repo)).delete();
		}
	}

	private void cacheRepository(RemoteRepository repo, IProgressMonitor monitor) {
		ICookbooksRepository cookbookRepository = retrievers.get(repo.getId());
		Collection<RemoteCookbook> cookbooks = cookbookRepository.getCookbooks(monitor);
		repo.getCookbooks().addAll(cookbooks);
		
		saveCacheModel(repo);
	}

	private void saveCacheModel(RemoteRepository repo) {
		//TODO save only cookbooks and info about lastupdate
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put(CACHE_EXT, new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Create a resource
	    Resource resource = resSet.createResource(URI
	        .createFileURI(getCacheFile(repo)));
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(repo);

	    // Now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	      loaded = true;
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	}

	/**
	 * @param repo
	 * @return
	 */
	private String getCacheFile(RemoteRepository repo) {
		return cacheFolder.append(repo.getId()).addFileExtension(CACHE_EXT).toOSString();
	}

	public void setCacheFolder(IPath stateLocation) {
		cacheFolder = stateLocation;
	}

	private boolean isCached(RemoteRepository repo) {
		File file = new File(getCacheFile(repo));
		return file.exists() && file.canRead();
	}

	public void loadRepository(RemoteRepository repo, IProgressMonitor monitor) {
		ICookbooksRepository cookbookRepository = retrievers.get(repo.getId());
		
		if (!isCached(repo) || cookbookRepository.isUpdated()) {
			cacheRepository(repo, monitor);
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

}
