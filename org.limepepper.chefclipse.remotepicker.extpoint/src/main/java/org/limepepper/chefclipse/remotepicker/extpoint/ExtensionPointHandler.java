package org.limepepper.chefclipse.remotepicker.extpoint;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.handlers.RemotePickerHandler;
import org.osgi.framework.Bundle;

/**
 * Extension Point reader.
 * 
 * @author Guillermo Zunino
 */
public class ExtensionPointHandler {
	private static final String POINT_ID = "org.limepepper.chefclipse.cookbook.repository"; //$NON-NLS-1$

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
				repo.setId(e.getAttribute("id")); //$NON-NLS-1$
				repo.setName(e.getAttribute("name")); //$NON-NLS-1$
				repo.setDescription(e.getAttribute("description")); //$NON-NLS-1$
				repo.setUri(e.getAttribute("uri")); //$NON-NLS-1$
				
				IConfigurationElement icon = e.getChildren("icon")[0]; //$NON-NLS-1$
				
				Bundle bundle = Platform.getBundle(e.getContributor().getName());
				URL iconFile = FileLocator.find(bundle, Path.fromPortableString(icon.getAttribute("image32")), null); //$NON-NLS-1$
				
				try { 
					final Object o = e.createExecutableExtension("class"); //$NON-NLS-1$
					if (o instanceof ICookbooksRepository) {
						RemoteRepository registeredRepository = getRepoManager().registerRepository(repo, (ICookbooksRepository) o);
						registeredRepository.setIcon(iconFile.toString());
					}
				} catch (CoreException ex) {
					final Object o = e.createExecutableExtension("builder"); //$NON-NLS-1$
					if (o instanceof ICookbooksRepository.Builder<?>) {
						repo.setIcon(iconFile.toString());
						getRepoManager().registerRepository(repo, (ICookbooksRepository.Builder<?>) o);
					}
				}
			}
			retrieveAndCacheCookbooks();
			RemoteRepository composite = getRepoManager().createCompositeRepository();
			RemotePickerHandler.enableRepository(composite);
		} catch (CoreException ex) {
			IStatus status = new Status(Status.ERROR, Activator.PLUGIN_ID, ex.getMessage(), ex);
			Platform.getLog(Activator.getContext().getBundle()).log(status );
		}
	}

	private void retrieveAndCacheCookbooks() {
		for (final RemoteRepository repo : repoManager.getRepositories()) {
			RemotePickerHandler.startRepositoryJob(repo, getRepoManager());
		}
	}

}