package org.limepepper.chefclipse.remotepicker.extpoint;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
import org.eclipse.ui.progress.IProgressConstants2;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.osgi.framework.Bundle;

/**
 * Extension Point reader.
 * 
 * @author Guillermo Zunino
 */
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
				
				final Object o = e.createExecutableExtension("class");
				if (o instanceof ICookbooksRepository) {
					RemoteRepository registeredRepository = getRepoManager().registerRepository(repo, (ICookbooksRepository) o);
					registeredRepository.setIcon(iconFile.toString());
					getRepoManager().createCompositeRepository();
				}
			}
			retrieveAndCacheCookbooks();
		} catch (CoreException ex) {
			IStatus status = new Status(Status.ERROR, Activator.PLUGIN_ID, ex.getMessage(), ex);
			Platform.getLog(Activator.getContext().getBundle()).log(status );
		}
	}

	private void retrieveAndCacheCookbooks() {
		for (final RemoteRepository repo : repoManager.getRepositories()) {
			Job job = new Job("Retrieving Cookbooks from respository \"" + repo.getName()+ "\"") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Retrieving cookbooks", IProgressMonitor.UNKNOWN);
					ExecutorService ex = Executors.newSingleThreadExecutor();
					ex.execute(new Runnable() {
						@Override public void run() {
							getRepoManager().loadRepository(repo.getId());
						}
					});
					ex.shutdown();
					try {
						while (!ex.awaitTermination(300, TimeUnit.MILLISECONDS)) {
							if (monitor.isCanceled()) 
								throw new InterruptedException();
						}
					} catch (InterruptedException e) {
						ex.shutdownNow();
						return Status.CANCEL_STATUS;
					}
					monitor.done();
					return Status.OK_STATUS;
				}
				
				@Override
				public boolean belongsTo(Object family) {
					return family == JOBS_FAMILY;
				}
			};
			
			try {
				ImageDescriptor image = ImageDescriptor.createFromURL(new URL(repo.getIcon()));
				job.setProperty(IProgressConstants.ICON_PROPERTY, image);
			} catch (MalformedURLException e) {}
			job.setProperty(IProgressConstants2.SHOW_IN_TASKBAR_ICON_PROPERTY, Boolean.TRUE);
			job.schedule();
		}
	}
}