package org.limepepper.chefclipse.remotepicker.api;

import java.io.File;
import java.net.URI;
import java.util.Collection;

import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;

public interface ICookbooksRepository {
	
	String getRepositoryId();
	
	URI getRepositoryURI();

	Collection<RemoteCookbook> getCookbooks();

	RemoteCookbook getCookbook(String name);
	
	boolean isUpdated();
	
	File downloadCookbook(RemoteCookbook remoteCookbook) throws InstallCookbookException;

}
