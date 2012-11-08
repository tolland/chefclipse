package org.limepepper.chefclipse.remotepicker.definition;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.progress.IProgressConstants;
import org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.osgi.framework.Bundle;

public class ExtensionPointHandler {
	private static final String POINT_ID = "org.limepepper.chefclipse.cookbook.repository";

	protected static final Object JOBS_FAMILY = "Cookbook Repositories";

	private CookbookRepositoryManager repoManager;
	
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

	public void read(IExtensionRegistry registry) {
		evaluate(registry);
	}

	private void evaluate(IExtensionRegistry registry) {
		IConfigurationElement[] config = registry
				.getConfigurationElementsFor(POINT_ID);
		System.out.println("Evaluate: "+config.length);
		try {
			for (IConfigurationElement e : config) {
				RemoteRepository repo = CookbookrepositoryFactory.eINSTANCE.createRemoteRepository();
				repo.setId(e.getAttribute("id"));
				repo.setName(e.getAttribute("name"));
				repo.setDescription(e.getAttribute("description"));
				repo.setUri(e.getAttribute("uri"));
				
				IConfigurationElement icon = e.getChildren("icon")[0];
				
				Bundle bundle = Platform.getBundle(e.getContributor().getName());
				URL iconFile = FileLocator.find(bundle, Path.fromPortableString(icon.getAttribute("image32")), null);
				
				repo.setIcon(iconFile.toString());
				
				final Object o = e.createExecutableExtension("class");
				if (o instanceof ICookbooksRepository) {
					getRepoManager().registerRepository(repo, (ICookbooksRepository) o);
				}
			}
			retrieveAndCacheCookbooks();
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void retrieveAndCacheCookbooks() {
		for (final RemoteRepository repo : repoManager.getRepositories()) {
			Job job = new Job("Retriving Cookbooks from respository " + repo.getName()) {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					getRepoManager().loadRepository(repo, monitor);
					return Status.OK_STATUS;
				}
				
				@Override
				public boolean belongsTo(Object family) {
					return family == JOBS_FAMILY;
				}
			};
			
			ImageDescriptor image;
			try {
				image = ImageDescriptor.createFromURL(new URL(repo.getIcon()));
				job.setProperty(IProgressConstants.ICON_PROPERTY, image);
			} catch (MalformedURLException e) {
			}
//			job.setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
			job.setProperty(IProgressConstants.KEEPONE_PROPERTY, JOBS_FAMILY);
//			job.setProperty(IProgressConstants.ACTION_PROPERTY, action);
			job.schedule();			
		}
	}
}