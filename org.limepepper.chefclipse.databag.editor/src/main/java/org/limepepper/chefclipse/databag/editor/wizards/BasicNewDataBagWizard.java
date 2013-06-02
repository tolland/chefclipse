/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.wizards;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.databag.editor.Activator;

/**
 * Wizard which allows to create a new {@link DataBag}.
 * 
 * @author Sebastian Sampaoli
 */
@SuppressWarnings("restriction")
public class BasicNewDataBagWizard extends Wizard implements INewWizard {

    private static final String PROJECT_SELECTION_MESSAGE_DIALOG = "Choose the Chef projects to which you want to create an empty Data Bag.";

    /**
     * The wizard id for creating new data bags in the workspace.
     */
    //    public static final String WIZARD_ID = "org.eclipse.ui.wizards.new.folder"; //$NON-NLS-1$

    private WizardNewDataBagMainPage mainPage;
    // private IFolder dataBagsFolder;

    private WizardNewProjectReferencePage secondPage;

    private List<IProject> selectedProjects;

    /**
     * Creates a wizard for creating a new Data Bag in the workspace.
     */
    public BasicNewDataBagWizard() {
        super();
        selectedProjects = new ArrayList<IProject>();
    }

    public BasicNewDataBagWizard(IProject chefProject) {
        super();
        selectedProjects = new ArrayList<IProject>();
        selectedProjects.add(chefProject);
        setWindowTitle("New Data Bag");
        setNeedsProgressMonitor(true);
        setDefaultPageImageDescriptor(Activator.getDefault().getImageRegistry()
                .getDescriptor(Activator.DATA_BAG_EDITOR));
    }

    /*
     * (non-Javadoc) Method declared on IWizard.
     */
    @Override
    public void addPages() {
        super.addPages();
        if (selectedProjects.size() > 0) {
            mainPage = new WizardNewDataBagMainPage("Data Bag", selectedProjects.get(0));
            addPage(mainPage);
        } else {
            mainPage = new WizardNewDataBagMainPage("Data Bag");
            addPage(mainPage);
            secondPage = new WizardNewProjectReferencePage("Project Selection") {

                @Override
                public void createControl(Composite parent) {
                    super.createControl(parent);
                    Control[] children = ((Composite) getControl()).getChildren();
                    final Table checkboxTable = (Table) children[1];
                    setPageComplete(false);
                    checkboxTable.addSelectionListener(new SelectionListener() {

                        @Override
                        public void widgetSelected(SelectionEvent e) {

                            IProject[] referencedProjects = getReferencedProjects();
                            setSelectedProjects(Arrays.asList(referencedProjects));
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
    }

    /**
     * Can perform the creation of a Data Bag if the selected projects are Chef
     * projects.
     */
    @Override
    public boolean canFinish() {
        IProject[] projects = getSelectedProjects().toArray(
                new IProject[getSelectedProjects().size()]);
        List<IProject> projectWithChefclipseNature = getProjectWithChefclipseNature(projects);
        if (projectWithChefclipseNature != null && projectWithChefclipseNature.size() > 0) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc) Method declared on IWizard.
     */
    @Override
    public boolean performFinish() {
        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        for (final IProject iProject : getSelectedProjects()) {
            IProjectNature nature;
            try {
                if (iProject.isOpen()) {
                    nature = iProject
                            .getNature(ChefProjectNature.NATURE_ID);
                    if (nature != null) {
						final ToggleXtextNatureAction xtextNature = new ToggleXtextNatureAction();

                        final IWorkspaceRunnable createDataBagOperation =
                                new IWorkspaceRunnable() {
                                    public void run(IProgressMonitor monitor) throws CoreException {
                                    	xtextNature.toggleNature(iProject);
                                        createNewDataBag(iProject);
                                        iProject.refreshLocal(IResource.DEPTH_INFINITE,
                                                 new NullProgressMonitor());
                                    }
                                };
                        workspace.run(createDataBagOperation, null);
                    }
                }
            } catch (CoreException e) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e
                                .getMessage(), e));
            }
        }
        return true;
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
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e
                                .getMessage(), e));
            }
        }
        return null;
    }

    public EObject createNewDataBag(IProject project) {
        String dataBagName = mainPage.getDataBagName();
        try {
            IFolder dataBagsFolder = project.getFolder("data_bags");
            if (!dataBagsFolder.exists()) {
                dataBagsFolder.create(true, true, new NullProgressMonitor());
            }
            if (dataBagName.toLowerCase().endsWith(".json")) {
                return createDataBagItem(dataBagsFolder, dataBagName);
            } else {
                return createDataBag(dataBagsFolder, dataBagName);
            }
        } catch (UnsupportedEncodingException e) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e
                            .getMessage(), e));
        } catch (CoreException e) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e
                            .getMessage(), e));
        }
        return null;
    }

    private DataBag createDataBag(IFolder parentFolder, String dataBagName) throws CoreException {
        IFolder folder = parentFolder.getFolder(dataBagName);
        if (!folder.exists()) {
            folder.create(true, true, new NullProgressMonitor());
            EObject dataBag = ChefRepositoryManager.INSTANCE.createDataBag(folder);
            // parentFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE,
            // new
            // NullProgressMonitor());
            return (DataBag) dataBag;
        }
        return null;
    }

    private DataBagItem createDataBagItem(IFolder parentFolder, String dataBagName)
            throws UnsupportedEncodingException, CoreException {
        IFile file = parentFolder.getFile(dataBagName);
        if (!file.exists()) {
            file.create(null, IResource.NONE, new NullProgressMonitor());
            // file.create(new ByteArrayInputStream("".getBytes("UTF-8")), true,
            // new NullProgressMonitor());
            EObject dataBag = ChefRepositoryManager.INSTANCE.createDataBagItem(file);
            // parentFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE,
            // new
            // NullProgressMonitor());
            return (DataBagItem) dataBag;
        }
        return null;
    }

    public List<IProject> getSelectedProjects() {
        return selectedProjects;
    }

    public void setSelectedProjects(List<IProject> selectedProjects) {
        this.selectedProjects = selectedProjects;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {

    }
}
