package org.limepepper.chefclipse.remotepicker.api;

import java.net.URI;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook;

public interface ICookbooksRepository {
	
	String getRepositoryId();
	
	URI getRepositoryURI();

	Collection<RemoteCookbook> getCookbooks(IProgressMonitor monitor);

	RemoteCookbook getCookbook(String name, IProgressMonitor monitor);
	
	boolean isUpdated();

}