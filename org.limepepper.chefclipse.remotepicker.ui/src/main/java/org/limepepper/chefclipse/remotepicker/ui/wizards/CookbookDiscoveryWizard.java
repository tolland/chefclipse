package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryWizard;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.InstallCookbookDialog;
import org.limepepper.chefclipse.remotepicker.ui.preferences.IRemotePickerPreferences;
import org.limepepper.chefclipse.remotepicker.ui.repository.CookbookDiscoveryStrategy;

/**
 * A wizard for interacting with cookbooks repositories.
 * 
 * @author Sebastian Sampaoli
 */
public class CookbookDiscoveryWizard extends DiscoveryWizard{
	
	private static final String INSTALL_COOKBOOKS = "Install Cookbooks";
	
	private boolean performFinishStatus;
	
	@Inject
	private CookbookRepositoryManager repoManager;
	
	public CookbookDiscoveryWizard(Catalog catalog, CookbookCatalogConfiguration configuration) {
		super(catalog, configuration);
		setWindowTitle(INSTALL_COOKBOOKS);
		CookbookRepositoryManager repoManager = CookbookRepositoryManager.getInstance();
		setRepoManager(repoManager);
	}

	@Override
	protected CookbookCatalogPage doCreateCatalogPage() {
		return new CookbookCatalogPage(getCatalog(), getConfiguration());
	}
	
	@Override
	public void addPages() {
		doDefaultCatalogSelection();
		super.addPages();
	}

	private void doDefaultCatalogSelection() {
		
		if (getConfiguration().getCatalogDescriptor() == null) {
			
			IPreferenceStore preferenceStore = Activator.getDefault()
			        .getPreferenceStore();
			String repositoryId = preferenceStore.getString(IRemotePickerPreferences.DEFAULT_REPOSITORY);
			
			List<CatalogDescriptor> catalogDescriptors = getConfiguration().getCatalogDescriptors();
	
			for (CatalogDescriptor catalogDescriptor : catalogDescriptors) {
				if (catalogDescriptor.getId().equals(repositoryId)){
					getConfiguration().setCatalogDescriptor(catalogDescriptor);
					return;
				}
			}
		}
	}
	
	@Override
	public CookbookCatalogConfiguration getConfiguration() {
		return (CookbookCatalogConfiguration) super.getConfiguration();
	}

	@Override
	public void dispose() {

		if (getCatalog() != null) {
			getCatalog().dispose();
		}
		super.dispose();
	}

	@Override
	public boolean performFinish() {
		
		final Shell activeShell = Display.getCurrent().getActiveShell();
		InstallCookbookDialog installCookbookDialog = new InstallCookbookDialog(activeShell);
		final int id = installCookbookDialog.open();
		if (IDialogConstants.OK_ID != id){
			return false;
		}
		final List<IProject> selectedProjects = installCookbookDialog.getSelectedProjects();
		
		IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
		try {
			progressService.busyCursorWhile(new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					
					String repositoryId = getConfiguration().getCatalogDescriptor().getId();
					List<CatalogItem> installableCookbooks = getCatalogPage().getInstallableCookbooks();
					
					for (CatalogItem catalogItem : installableCookbooks) {
						try {
							File downloadCookbook = repoManager.downloadCookbook(catalogItem.getName(), repositoryId);
							for (IProject iProject : selectedProjects) {
								repoManager.installCookbook(catalogItem.getName(), downloadCookbook, iProject.getLocation().toString());
							}
							refreshProjects(selectedProjects);
						} catch (InstallCookbookException e) {
							showAndLogErrorMessage(activeShell, e);
						} 
					}	
					setPerformFinishStatus(true);
				}
			});
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e1.getMessage(), e1));
			return false;
		} catch (InterruptedException e1) {
			e1.printStackTrace();
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e1.getMessage(), e1));
			return false;
		} finally {
		}
		return isPerformFinishStatus();
	}
	
	private void refreshProjects(List<IProject> selectedProjects) {
		for (IProject iProject : selectedProjects) {
			try {
				iProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e.getMessage(), e));
			}
		}
	}

	private void showAndLogErrorMessage(final Shell activeShell,
			final InstallCookbookException e) {
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				MessageDialog.openError(activeShell, "Error while trying to install cookbook.", e.getMessage());
				Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e.getMessage(), e));
				setPerformFinishStatus(false);
			}
		});
	}

	@Override
	public CookbookCatalogPage getCatalogPage() {
		return (CookbookCatalogPage) super.getCatalogPage();
	}

	void initializeCatalog() {
		for (AbstractDiscoveryStrategy strategy : getCatalog().getDiscoveryStrategies()) {
			strategy.dispose();
		}
		getCatalog().getDiscoveryStrategies().clear();
		if (getConfiguration().getCatalogDescriptor() != null) {
			getCatalog().getDiscoveryStrategies().add(
					new CookbookDiscoveryStrategy(getConfiguration().getCatalogDescriptor()));
		}
	}
	
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

	public boolean isPerformFinishStatus() {
		return performFinishStatus;
	}

	public void setPerformFinishStatus(boolean performFinishStatus) {
		this.performFinishStatus = performFinishStatus;
	}
	
}
