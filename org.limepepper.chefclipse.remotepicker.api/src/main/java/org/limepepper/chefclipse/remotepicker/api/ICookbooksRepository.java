package org.limepepper.chefclipse.remotepicker.api;

import java.net.URI;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

public interface ICookbooksRepository {
	
	String getRepositoryId();
	
	URI getRepositoryURI();

	List<CookbookInfo> getCookbooks(IProgressMonitor monitor);

	CookbookInfo getCookbook(String name, IProgressMonitor monitor);

}