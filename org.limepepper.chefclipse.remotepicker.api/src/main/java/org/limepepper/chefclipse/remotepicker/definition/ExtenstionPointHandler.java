package org.limepepper.chefclipse.remotepicker.definition;

import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;
import org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;

public class ExtenstionPointHandler {
	private static final String POINT_ID = "org.limepepper.chefclipse.cookbook.repository";

	@Inject
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

	@Execute
	public void execute(IExtensionRegistry registry) {
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
//				repo.setIcon(e.getAttribute("icon"));
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