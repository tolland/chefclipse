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

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.Creatable;
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
@Creatable
public class CookbookRepositoryManager {
	
	private static final String CACHE_EXT = "cookbookrepo";
	private Map<String, RemoteRepository> repositories = new HashMap<String, RemoteRepository>();
	private Map<String, ICookbooksRepository> retrievers = new HashMap<String, ICookbooksRepository>();
	private boolean loaded = false;

	public Collection<RemoteRepository> getRepositories() {
		if (!loaded) {
			loadRepositories();
		}
		return Collections.unmodifiableCollection(repositories.values());
	}
	
	private void loadRepositories() {
		// TODO load repositories on demand by EMF lazy support
		// Initialize the model
		CookbookrepositoryPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(CACHE_EXT, new XMIResourceFactoryImpl());
		
		for (RemoteRepository repo : repositories.values()) {
			
			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();
			
			// Get the resource
			Resource resource = resSet.getResource(URI
					.createURI(getCacheFile(repo)), true);
			if (resource != null) {
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
				RemoteRepository cachedRepo = (RemoteRepository) resource.getContents().get(0);
				repo.getCookbooks().addAll(cachedRepo.getCookbooks());
			}
		}
		loaded = true;
	}

	public RemoteRepository getRepository(String id) {
		if (!loaded) {
			loadRepositories();
		}
		return repositories.get(id);
	}

	public void registerRepository(RemoteRepository repo, ICookbooksRepository retriever) {
		repositories.put(repo.getId(), repo);
		retrievers.put(repo.getId(), retriever);
		
		if (!isCached(repo)) {
			cacheRepository(repo);
		}
	}
	
	public void evictCache() {
		new File("cache").delete();
	}

	private void cacheRepository(RemoteRepository repo) {
		ICookbooksRepository cookbookRepository = retrievers.get(repo.getId());
		Collection<RemoteCookbook> cookbooks = cookbookRepository.getCookbooks(new NullProgressMonitor());
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
	        .createURI(getCacheFile(repo)));
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
		// TODO save on plugin folder
		return "cache/cache_"+repo.getId()+".cookbookrepo";
	}

	private boolean isCached(RemoteRepository repo) {
		File file = new File(getCacheFile(repo));
		return file.exists() && file.canRead();
	}
	
}
