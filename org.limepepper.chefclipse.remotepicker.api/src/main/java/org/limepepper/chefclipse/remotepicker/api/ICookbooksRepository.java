package org.limepepper.chefclipse.remotepicker.api;

import java.io.File;
import java.net.URI;
import java.util.Collection;

import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;

/**
 * Interface to be implemented for cookbook repositories in order to access and install cookbooks.
 * 
 * @author Guillermo Zunino
 */
public interface ICookbooksRepository {
	
	/**
	 * A unique Id for the repository.
	 * @return the id of the repository
	 */
	String getRepositoryId();
	
	/**
	 * The base URL from where the repository is acceded.
	 * @return URL
	 */
	URI getRepositoryURI();

	/**
	 * Collects {@link RemoteCookbook}s from the remote repository.
	 * This can be a long execution task.
	 * @return a {@link Collection} of {@link RemoteCookbook}
	 */
	Collection<RemoteCookbook> getCookbooks();

	/**
	 * Returns a single cookbook from the repository.
	 * @param name The name of the cookbook to retrieve
	 * @return a {@link RemoteCookbook}
	 */
	RemoteCookbook getCookbook(String name);
	
	/**
	 * Checks if the given {@link RemoteRepository} for this {@link ICookbooksRepository} is updated on the origin.
	 * This operation should be quick and access as few as possible remote connection. For example, it can check
	 * for the IF-MODIFIED-SINCE HTTP header.
	 * @param repo the last cached {@link RemoteRepository} for this repository.
	 * @return true if the remote repository is updated and the local cache should be refreshed.
	 */
	boolean isUpdated(RemoteRepository repo);
	
	/**
	 * Downloads a specific version of {@link RemoteCookbook} on the local file system.
	 * Possible on temporary location.
	 * @param version a valid version for this cookbook.
	 * @param remoteCookbook the cookbook to download.
	 * @return The file representing the local copy of the cookbook.
	 * @throws InstallCookbookException if {@link RemoteCookbook} cannot be downloaded.
	 */
	File downloadCookbook(RemoteCookbook remoteCookbook, String version) throws InstallCookbookException;

	/**
	 * Returns a user friendly version number for the given version.
	 * @param cookbook the RemoteCookbook
	 * @param version a version number to translate
	 * @return A string representing the version
	 */
	String getReadableVersion(RemoteCookbook cookbook, String version);
	
	static interface Builder<T> {
		
		ICookbooksRepository createRepository(T parameter);
		
		T configure();
	}

}
