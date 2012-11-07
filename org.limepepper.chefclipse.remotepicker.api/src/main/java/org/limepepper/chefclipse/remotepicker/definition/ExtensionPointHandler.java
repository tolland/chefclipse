package org.limepepper.chefclipse.remotepicker.definition;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.osgi.framework.Bundle;

public class ExtensionPointHandler {
	private static final String POINT_ID = "org.limepepper.chefclipse.cookbook.repository";

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
					retrieveAndCacheCookbooks(repo, (ICookbooksRepository) o);
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void retrieveAndCacheCookbooks(final RemoteRepository repo, final ICookbooksRepository retriever) {
		ISafeRunnable runnable = new ISafeRunnable() {
			@Override
			public void handleException(Throwable e) {
				System.out.println("Exception in client");
			}

			@Override
			public void run() throws Exception {
				getRepoManager().registerRepository(repo, retriever);
			}
		};
		SafeRunner.run(runnable);
	}
}