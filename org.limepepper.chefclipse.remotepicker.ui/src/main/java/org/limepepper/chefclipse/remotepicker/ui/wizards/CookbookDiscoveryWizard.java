package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
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
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.preferences.IRemotePickerPreferences;
import org.limepepper.chefclipse.remotepicker.ui.repository.CookbookDiscoveryStrategy;

import chefclipse.core.builders.ChefProjectNature;

/**
 * A wizard for interacting with cookbooks repositories.
 *
 * @author Sebastian Sampaoli
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryWizard extends DiscoveryWizard {

	public static final String INSTALL_COOKBOOKS = "Install Cookbooks";

	private static final String PROJECT_SELECTION_MESSAGE_DIALOG = "Choose the projects to which you want to install the selected cookbooks.";

	private boolean performFinishStatus;

	@Inject
	private CookbookRepositoryManager repoManager;

	private WizardNewProjectReferencePage secondPage;

	private List<IProject> selectedProjects = new ArrayList<IProject>();

	public CookbookDiscoveryWizard(Catalog catalog,
			CookbookCatalogConfiguration configuration) {
		super(catalog, configuration);
		setWindowTitle(INSTALL_COOKBOOKS);
		setNeedsProgressMonitor(true);
		CookbookRepositoryManager repoManager = CookbookRepositoryManager
				.getInstance();
		setRepoManager(repoManager);
	}

	@Override
	protected CookbookCatalogPage doCreateCatalogPage() {
		return new CookbookCatalogPage(getCatalog(), getConfiguration());
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// this.selection = selection;

		for (Object sel : selection.toArray()) {
			if (sel instanceof IProject) {
				selectedProjects.add((IProject) sel);
			}

		}

	}

	@Override
	public void addPages() {
		doDefaultCatalogSelection();
		super.addPages();
		secondPage = new WizardNewProjectReferencePage("Project Selection") {
		    // widgets
		    private CheckboxTableViewer referenceProjectsViewer;

		    private final String REFERENCED_PROJECTS_TITLE = IDEWorkbenchMessages.WizardNewProjectReferences_title;

		    private static final int PROJECT_LIST_MULTIPLIER = 15;

			@Override
			public void createControl(Composite parent) {
				Font font = parent.getFont();

				Composite composite = new Composite(parent, SWT.NONE);
				composite.setLayout(new GridLayout());
				composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				composite.setFont(font);

				PlatformUI
						.getWorkbench()
						.getHelpSystem()
						.setHelp(
								composite,
								IIDEHelpContextIds.NEW_PROJECT_REFERENCE_WIZARD_PAGE);

				Label referenceLabel = new Label(composite, SWT.NONE);
				referenceLabel.setText(REFERENCED_PROJECTS_TITLE);
				referenceLabel.setFont(font);

				referenceProjectsViewer = CheckboxTableViewer.newCheckList(
						composite, SWT.BORDER);
				referenceProjectsViewer.getTable().setFont(composite.getFont());
				GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);

				data.heightHint = getDefaultFontHeight(
						referenceProjectsViewer.getTable(),
						PROJECT_LIST_MULTIPLIER);
				referenceProjectsViewer.getTable().setLayoutData(data);
				referenceProjectsViewer.setLabelProvider(WorkbenchLabelProvider
						.getDecoratingWorkbenchLabelProvider());
				referenceProjectsViewer
						.setContentProvider(getContentProvider());
				referenceProjectsViewer.setComparator(new ViewerComparator());
				referenceProjectsViewer
						.setInput(ResourcesPlugin.getWorkspace());

				setControl(composite);

				referenceProjectsViewer.setCheckedElements(selectedProjects.toArray());

				Control[] children = ((Composite) getControl()).getChildren();
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

		    private int getDefaultFontHeight(Control control, int lines) {
		        FontData[] viewerFontData = control.getFont().getFontData();
		        int fontHeight = 10;

		        //If we have no font data use our guess
		        if (viewerFontData.length > 0) {
					fontHeight = viewerFontData[0].getHeight();
				}
		        return lines * fontHeight;

		    }

			protected IStructuredContentProvider getContentProvider() {
				return new WorkbenchContentProvider() {
					public Object[] getChildren(Object element) {
						if (!(element instanceof IWorkspace)) {
							return new Object[0];
						}
						IProject[] projects = ((IWorkspace) element).getRoot()
								.getProjects();

						ArrayList<IProject> chefProjects = new ArrayList<IProject>();
						for (IProject iProject : projects) {
							try {
								if (iProject
										.hasNature(chefclipse.core.builders.ChefProjectNature.NATURE_ID)) {
									chefProjects.add(iProject);
								}
							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

						projects = chefProjects
								.toArray(new IProject[chefProjects.size()]);

						return projects == null ? new Object[0] : projects;
					}
				};
			}

		    public IProject[] getReferencedProjects() {
		        Object[] elements = referenceProjectsViewer.getCheckedElements();
		        IProject[] projects = new IProject[elements.length];
		        System.arraycopy(elements, 0, projects, 0, elements.length);
		        return projects;
		    }

			/*
			 * public IProject[] setReferencedProjects() { Object[] elements =
			 * referenceProjectsViewer.getCheckedElements(); IProject[] projects
			 * = new IProject[elements.length]; System.arraycopy(elements, 0,
			 * projects, 0, elements.length); return projects; }
			 */

		};
		secondPage.setTitle("Project Selection");
		secondPage.setDescription(PROJECT_SELECTION_MESSAGE_DIALOG);

		addPage(secondPage);

		if (selectedProjects.size() == 1) {
			// secondPage.setPageComplete(true);

		}
	}

	/**
	 * Select the default repository to be shown in the wizard. This default
	 * repository is chosen from a preference page.
	 *
	 */
	private void doDefaultCatalogSelection() {

		if (getConfiguration().getCatalogDescriptor() == null) {

			IPreferenceStore preferenceStore = Activator.getDefault()
					.getPreferenceStore();
			String repositoryId = preferenceStore
					.getString(IRemotePickerPreferences.DEFAULT_REPOSITORY);

			List<CatalogDescriptor> catalogDescriptors = getConfiguration()
					.getCatalogDescriptors();

			for (CatalogDescriptor catalogDescriptor : catalogDescriptors) {
				if (catalogDescriptor.getId().equals(repositoryId)) {
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

		List<CatalogItem> installableCookbooks = getCatalogPage()
				.getInstallableCookbooks();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		for (CatalogItem catalogItem : installableCookbooks) {
			try {
				final RemoteCookbook remoteCookbook = (RemoteCookbook) catalogItem
						.getData();
				final File downloadCookbook = repoManager.downloadCookbook(
						remoteCookbook, remoteCookbook.getRepositoryId());
				for (final IProject iProject : selectedProjects) {

					getContainer();

					IWorkspaceRunnable myRunnable = new IWorkspaceRunnable() {

						@Override
						public void run(IProgressMonitor monitor)
								throws CoreException {
							monitor.beginTask("Installing cookbooks...",
									IProgressMonitor.UNKNOWN);

							try {
								repoManager.installCookbook(remoteCookbook,
										downloadCookbook, iProject
												.getLocation().toString());
							} catch (InstallCookbookException e) {
								e.printStackTrace();
							}

							monitor.done();
						}
					};
					// @todo add the progress monitor
					workspace.run(myRunnable, iProject,
							IWorkspace.AVOID_UPDATE, null);
				}
				refreshProjects(selectedProjects);
			} catch (InstallCookbookException e) {
				showAndLogErrorMessage(activeShell, e);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		setPerformFinishStatus(true);

		return isPerformFinishStatus();
	}

	/**
	 * Refresh the selected workspace projects after the installation of
	 * cookbooks to them.
	 *
	 * @param selectedProjects
	 */
	private void refreshProjects(List<IProject> selectedProjects) {
		for (IProject iProject : selectedProjects) {
			try {
				iProject.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
			} catch (CoreException e) {
				Activator
						.getDefault()
						.getLog()
						.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
								Status.ERROR, e.getMessage(), e));
			}
		}
	}

	private void showAndLogErrorMessage(final Shell activeShell,
			final InstallCookbookException e) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				MessageDialog.openError(activeShell,
						"Error while trying to install cookbook.",
						e.getMessage());
				Activator
						.getDefault()
						.getLog()
						.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
								Status.ERROR, e.getMessage(), e));
				setPerformFinishStatus(false);
			}
		});
	}

	@Override
	public CookbookCatalogPage getCatalogPage() {
		return (CookbookCatalogPage) super.getCatalogPage();
	}

	/**
	 * Initialize the catalog to be shown and create the catalog items and
	 * categories.
	 */
	void initializeCatalog() {
		for (AbstractDiscoveryStrategy strategy : getCatalog()
				.getDiscoveryStrategies()) {
			strategy.dispose();
		}
		getCatalog().getDiscoveryStrategies().clear();
		if (getConfiguration().getCatalogDescriptor() != null) {
			getCatalog().getDiscoveryStrategies().add(
					new CookbookDiscoveryStrategy(getConfiguration()
							.getCatalogDescriptor()));
		}
	}

	/**
	 * Can perform the installation if at least one project exists in the
	 * workspace, or the user has selected projects in the next project
	 * selection page.
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

	private ArrayList<IProject> getProjectWithChefclipseNature(
			IProject[] projects) {
		for (IProject iProject : projects) {
			IProjectNature nature;
			try {
				if (iProject.isOpen()) {
					nature = iProject.getNature(ChefProjectNature.NATURE_ID);
					if (nature != null) {
						ArrayList<IProject> projectWithChefclipseNature = new ArrayList<IProject>();
						projectWithChefclipseNature.add(iProject);
						return projectWithChefclipseNature;
					}
				}
			} catch (CoreException e) {
				Activator.log(e);
			}
		}
		return null;
	}

	private List<IProject> getSelectedProjectFromPackageExplorer() {
		ISelectionService service = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService();
		IStructuredSelection selection = (IStructuredSelection) service
				.getSelection("org.eclipse.jdt.ui.PackageExplorer");
		if (selection != null) {
			Object firstElement = selection.getFirstElement();
			if (firstElement == null) {
				return null;
			}
			IProject project = null;
			if (firstElement instanceof IJavaProject) {
				project = ((IJavaProject) firstElement).getProject();
			} else if (firstElement instanceof IProject) {
				project = (IProject) firstElement;
			} else {
				return null;
			}
			if (project != null) {
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
	 * @param repoManager
	 *            the repoManager to set
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
