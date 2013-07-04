/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package chefclipse.ui.importWizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import chefclipse.core.managers.ChefProjectManager;
import chefclipse.ui.wizards.ChefConfigSelectionWizardPage;
import chefclipse.ui.wizards.ChefProjectWizard;

public class ImportRepositoryToProjectWizard extends ChefProjectWizard
		implements IImportWizard {

	private Path locationPath;
	private Boolean doChefConfigSelection;
	private ChefConfigSelectionWizardPage chefConfigPage;

	NewProjectExistingChefRepoWizardPage mainPage;

	protected Path getLocationPath() {
		return locationPath;
	}

	protected void setLocationPath(Path locationPath) {
		this.locationPath = locationPath;
	}

	public ImportRepositoryToProjectWizard() {
		super();
		chefConfigPage = new ChefConfigSelectionWizardPage(this);
	}

	public boolean performFinish() {

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {

					// @todo how to deal with dupes..
					String projectName = "chef-repo";

					IProject proj = ChefProjectManager.instance()
							.createChefProject(projectName, getLocationPath(),
									monitor);

					if (!proj.isOpen()) {
						proj.open(monitor);
					}
				} catch (CoreException e) {
					e.printStackTrace();
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}

		};

		try {
			this.getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(),
					"Error", realException.getMessage()); //$NON-NLS-1$
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Chef Repository Import Wizard"); // NON-NLS-1
		setNeedsProgressMonitor(true);
		mainPage = new NewProjectExistingChefRepoWizardPage(
				"Import Chef Repository"); // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		super.addPages();
		addPage(mainPage);
	}

	public Boolean getDoChefConfigSelection() {
		return doChefConfigSelection;
	}

	public void setDoChefConfigSelection(Boolean doChefConfigSelection) {
		this.doChefConfigSelection = doChefConfigSelection;
	}

	public void addChefConfigPage(boolean b) {
		if (b) {
			addPage(chefConfigPage);
		} else {
			//getPage(name);
		}

	}

}
