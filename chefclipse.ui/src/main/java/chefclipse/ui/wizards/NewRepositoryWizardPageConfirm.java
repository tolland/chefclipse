package chefclipse.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;



public class NewRepositoryWizardPageConfirm extends WizardPage {
	private Text containerText;
	private Text locationText;
	private Text repoText;	
	
	private ISelection selection;

	
	public NewRepositoryWizardPageConfirm(ISelection selection) {
		super("repositoryWizardPage");
		setTitle("New Chef Repository");
		setDescription("This wizard creates a reference to the chef repository");
		this.selection = selection;
	}

	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		
		
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContainerBrowse();
			}
		});
		
		
		
		
		
		label = new Label(container, SWT.NULL);
		label.setText("&Repository location:");

		locationText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		locationText.setLayoutData(gd);
		locationText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleLocationBrowse();
			}
		});
		
		
		
						
		
		
		label = new Label(container, SWT.NULL);
		label.setText("&Repository name:");

		repoText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		repoText.setLayoutData(gd);
		repoText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				
				// Check if the container is the template project
//				if(container instanceof IProject){
//					if(ChefProjectManager.openChefProject((IProject)container) != null){
//						containerText.setText(container.getFullPath().toString());
//					}
//				}				
			}
		}
		
		repoText.setText("local.repo");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleContainerBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new repository container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}
	
	
	private void handleLocationBrowse() {
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		dialog.setText("Select location of the local repository");
		String path = dialog.open();
		if(path != null){
			locationText.setText(path);
		}				
	}
	
	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		
		String fileName = getRepoName();

		if (getContainerName().length() == 0) {
			updateStatus("Repository container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & IResource.PROJECT) == 0) {
			updateStatus("Repository container must exist");
			return;
		}
												
		if (!container.isAccessible()) {
			updateStatus("Repository container must be writable");
			return;
		}		
		
		if(getLocationName().length() == 0){
			updateStatus("Repository location must be specified");
			return;
		}
		
		
		if( (fileName.length() == 0) ||
			(fileName.replace('\\', '/').indexOf('/', 1) > 0) ||
			(!fileName.substring(fileName.indexOf(".") + 1).equals("repo"))){
			
			updateStatus("The generator model file name must end in '.repo'");
			return;
		}
		
//		if (container instanceof IProject){
//			ChefProjectManager project = ChefProjectManager.openChefProject((IProject)container);
//			if(project == null){
//				updateStatus("Chef Project container must be specified");
//				return;
//			}										
//		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public String getRepoName() {
		return repoText.getText();
	}
	
	public String getContainerName() {
		return containerText.getText();
	}
	
	
	public String getLocationName(){
		return locationText.getText();
	}
	
	public IProject getContainerHandle(){
		return ResourcesPlugin.getWorkspace().getRoot().getProject(
                getContainerName());
	}
			
					
}
