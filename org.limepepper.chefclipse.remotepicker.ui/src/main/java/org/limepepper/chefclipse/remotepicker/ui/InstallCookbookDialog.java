/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author Sebastian Sampaoli
 *
 */
public class InstallCookbookDialog extends TitleAreaDialog{

	private static final String MESSAGE_DIALOG = "Choose the projects to which you want to install the selected cookbooks.";
	private TreeViewer viewer;
	private List<IProject> selectedProjects;
	/**
	 * 
	 */
	public InstallCookbookDialog(Shell parentShell) {
		
		super(parentShell);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {

		Composite composite = (Composite) super.createDialogArea(parent);

		setTitle("Project Selection");
		setMessage(MESSAGE_DIALOG);

		final FilteredTree filter = new FilteredTree(composite, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER,
				new PatternFilter(), true);
		
		viewer = filter.getViewer();
		viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setContentProvider(new BaseWorkbenchContentProvider());
		viewer.setLabelProvider(new WorkbenchLabelProvider());
		viewer.setUseHashlookup(true);
		viewer.setSorter(new NameSorter());

		viewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
		
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void selectionChanged(SelectionChangedEvent arg0) {
				final IStructuredSelection selection = (IStructuredSelection) viewer
						.getSelection();
				if (selection != null) {
					if (selection.toList() == null || selection.toList().isEmpty()){
						getButton(OK).setEnabled(false);
					} else if (areAllProjects(selection.toList())) {
						setSelectedProjects(selection.toList());
						getButton(OK).setEnabled(true);
					}
				} else {
					getButton(OK).setEnabled(false);
				}
			}

			private boolean areAllProjects(List list) {
				
				for (Object object : list) {
					if (!(object instanceof IProject)){
						return false;
					}
				}
				return true;
			}
		});
		return parent;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		getButton(OK).setEnabled(false);
	}

	public List<IProject> getSelectedProjects() {
		return selectedProjects;
	}

	public void setSelectedProjects(List<IProject> selectedProjects) {
		this.selectedProjects = selectedProjects;
	}

	private class NameSorter extends ViewerSorter {

	}

}
