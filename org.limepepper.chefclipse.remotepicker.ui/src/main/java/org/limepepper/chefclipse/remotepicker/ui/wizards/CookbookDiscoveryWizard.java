package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.internal.p2.discovery.AbstractDiscoveryStrategy;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryWizard;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.preferences.IRemotePickerPreferences;
import org.limepepper.chefclipse.remotepicker.ui.repository.CookbookDiscoveryStrategy;

/**
 * A wizard for interacting with cookbooks repositories.
 *
 * @author Sebastian Sampaoli
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryWizard extends DiscoveryWizard{

	private static final String INSTALL_COOKBOOKS = "Install Cookbooks";

	private static final String PROJECT_SELECTION_MESSAGE_DIALOG = "Choose the projects to which you want to install the selected cookbooks.";

	private boolean performFinishStatus;

	@Inject
	private CookbookRepositoryManager repoManager;

	private WizardNewProjectReferencePage secondPage;

	private List<IProject> selectedProjects;

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
		secondPage = new WizardNewProjectReferencePage("Project Selection") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				Control[] children = ((Composite)getControl()).getChildren();
				final Table checkboxTable = (Table) children[1];
				setPageComplete(false);
				checkboxTable.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {

						IProject[] referencedProjects = getReferencedProjects();
						setPageComplete(!(referencedProjects.length == 0));
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {

					}

				});
				setPageComplete(false);
			}
		};
		secondPage.setTitle("Project Selection");
		secondPage.setDescription(PROJECT_SELECTION_MESSAGE_DIALOG);
		addPage(secondPage);
	}

	/**
	 * Select the default repository to be shown in the wizard. This default repository is chosen
	 * from a preference page.
	 *
	 */
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

	/**
	 * Perform the installation of cookbooks to the selected projects.
	 */
	@Override
	public boolean performFinish() {

		final Shell activeShell = Display.getCurrent().getActiveShell();
		final List<IProject> selectedProjects = getSelectedProjects();

		try {
			getContainer().run(true, true, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					monitor.beginTask("Installing cookbooks...",
							IProgressMonitor.UNKNOWN);
					List<CatalogItem> installableCookbooks = getCatalogPage()
							.getInstallableCookbooks();

					for (CatalogItem catalogItem : installableCookbooks) {
						try {
							RemoteCookbook remoteCookbook = (RemoteCookbook) catalogItem
									.getData();
							File downloadCookbook = repoManager
									.downloadCookbook(
											remoteCookbook, remoteCookbook.getRepositoryId());
							for (IProject iProject : selectedProjects) {
								repoManager.installCookbook(remoteCookbook, downloadCookbook, iProject
										.getLocation().toString());
							}
							refreshProjects(selectedProjects);
						} catch (InstallCookbookException e) {
							showAndLogErrorMessage(activeShell, e);
						}
					}
					monitor.done();
					setPerformFinishStatus(true);
				}

			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Activator
					.getDefault()
					.getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
							Status.ERROR, e.getMessage(), e));
			return false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			Activator
					.getDefault()
					.getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
							Status.ERROR, e.getMessage(), e));
			return false;
		}
		return isPerformFinishStatus();
	}

	/**
	 * Refresh the selected workspace projects after the installation of cookbooks to them.
	 *
	 * @param selectedProjects
	 */
	private void refreshProjects(List<IProject> selectedProjects) {
		for (IProject iProject : selectedProjects) {
			try {
				iProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
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

	/**
	 * Initialize the catalog to be shown and create the catalog items and categories.
	 */
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
	 * Can perform the installation if at least one project exists in the workspace, or the user has selected
	 * projects in the next project selection page.
	 */
	@Override
	public boolean canFinish() {

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject[] projects = root.getProjects();
		if (projects.length == 0) {
			return false;
		}
		if (projects.length == 1) {
			setSelectedProjects(Arrays.asList(projects));
			return true;
		}
		IProject[] referencedProjects = secondPage.getReferencedProjects();
		if (secondPage.isPageComplete()) { // the user selected projects in the
											// page
			setSelectedProjects(Arrays.asList(referencedProjects));
			return true;
		}
		List<IProject> selectedProjectFromPackageExplorer = getSelectedProjectFromPackageExplorer();
		if (selectedProjectFromPackageExplorer != null) {
			setSelectedProjects(selectedProjectFromPackageExplorer);
			return true;
		}

		ArrayList<IProject> projectWithChefclipseNature = getProjectWithChefclipseNature(projects);
		if (projectWithChefclipseNature != null) {
			setSelectedProjects(projectWithChefclipseNature);
			return true;
		}
		return false;
	}

	private ArrayList<IProject> getProjectWithChefclipseNature(IProject[] projects) {
		for (IProject iProject : projects) {
			IProjectNature nature;
			try {
			    if (iProject.isOpen()) {
			        nature = iProject
	                        .getNature(ChefProjectNature.NATURE_ID);
	                if (nature != null) {
	                    ArrayList<IProject> projectWithChefclipseNature = new ArrayList<IProject>();
	                    projectWithChefclipseNature.add(iProject);
	                    return projectWithChefclipseNature;
	                }
			    }
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private List<IProject> getSelectedProjectFromPackageExplorer() {
		ISelectionService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
        IStructuredSelection selection = (IStructuredSelection) service
                .getSelection("org.eclipse.jdt.ui.PackageExplorer");
        if (selection != null){
        	Object firstElement = selection.getFirstElement();
        	if (firstElement == null){
        		return null;
        	}
        	IProject project = null;
        	if (firstElement instanceof IJavaProject){
        		project = ((IJavaProject) firstElement).getProject();
        	} else if (firstElement instanceof IProject){
        		project = (IProject) firstElement;
        	} else {
        		return null;
        	}
            if (project != null){
            	ArrayList<IProject> projectFromPackageExplorer = new ArrayList<IProject>();
            	projectFromPackageExplorer.add(project);
            	return projectFromPackageExplorer;
            }
        }
        return null;
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

	public List<IProject> getSelectedProjects() {
		return selectedProjects;
	}

	public void setSelectedProjects(List<IProject> selectedProjects) {
		this.selectedProjects = selectedProjects;
	}

}
