/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Matt McCutchen (hashproduct+eclipse@gmail.com) - Bug 35390 Three-way compare cannot select (mis-selects) )ancestor resource
 *     Aleksandra Wozniak (aleksandra.k.wozniak@gmail.com) - Bug 239959
 *******************************************************************************/
package org.limepepper.chefclipse.remotepicker.ui.handlers;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.ZipFileStructureCreator;
import org.eclipse.compare.internal.BufferedResourceNode;
import org.eclipse.compare.internal.CompareUIPlugin;
import org.eclipse.compare.internal.CompareWithOtherResourceDialog;
import org.eclipse.compare.internal.Utilities;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.DiffTreeViewer;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.compare.structuremergeviewer.IDiffContainer;
import org.eclipse.compare.structuremergeviewer.IDiffElement;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import chefclipse.core.managers.ChefRepositoryManager;

import chefclipse.core.CookbookFolder;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.ui.Activator;

/**
 * A two-way compare for arbitrary IResources.
 */
@SuppressWarnings("restriction")
public class ResourceCompareInput extends CompareEditorInput {

	public static final String EXTERNAL_FILES = "External_Files";

	private static final boolean NORMALIZE_CASE= true;

	private boolean fThreeWay= false;
	private Object fRoot;
	private IStructureComparator fAncestor;
	private IStructureComparator fLeft;
	private IStructureComparator fRight;
	private IResource fAncestorResource;
	private IResource fLeftResource;
	private IResource fRightResource;
	private DiffTreeViewer fDiffViewer;
	private IAction fOpenAction;

	class MyDiffNode extends DiffNode {

		private boolean fDirty= false;
		private ITypedElement fLastId;
		private String fLastName;


		public MyDiffNode(final IDiffContainer parent, final int description, final ITypedElement ancestor, final ITypedElement left, final ITypedElement right) {
			super(parent, description, ancestor, left, right);
		}
		@Override
		public void fireChange() {
			super.fireChange();
			setDirty(true);
			fDirty= true;
			if (fDiffViewer != null) {
				fDiffViewer.refresh(this);
			}
		}
		void clearDirty() {
			fDirty= false;
		}
		@Override
		public String getName() {
			if (fLastName == null) {
				fLastName= super.getName();
			}
			if (fDirty) {
				return '<' + fLastName + '>';
			}
			return fLastName;
		}

		@Override
		public ITypedElement getId() {
			ITypedElement id= super.getId();
			if (id == null) {
				return fLastId;
			}
			fLastId= id;
			return id;
		}
	}

	static class FilteredBufferedResourceNode extends BufferedResourceNode {
		FilteredBufferedResourceNode(final IResource resource) {
			super(resource);
		}
		@Override
		protected IStructureComparator createChild(final IResource child) {
			String name= child.getName();
			if (CompareUIPlugin.getDefault().filter(name, child instanceof IContainer, false)
					|| CookbookRepositoryManager.COOKBOOKSOURCE.equalsIgnoreCase(child.getName())
					|| ".cookbook".equalsIgnoreCase(child.getName())) {
				return null;
			}
			return new FilteredBufferedResourceNode(child);
		}
	}

	/*
	 * Creates an compare editor input for the given selection.
	 */
	ResourceCompareInput(final CompareConfiguration config) {
		super(config);
	}

	@Override
	public Viewer createDiffViewer(final Composite parent) {
		fDiffViewer= new DiffTreeViewer(parent, getCompareConfiguration()) {
			@Override
			protected void fillContextMenu(final IMenuManager manager) {

				if (fOpenAction == null) {
					fOpenAction= new Action() {
						@Override
						public void run() {
							handleOpen(null);
						}
					};
					Utilities.initAction(fOpenAction, getBundle(), "action.CompareContents."); //$NON-NLS-1$
				}

				boolean enable= false;
				ISelection selection= getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss= (IStructuredSelection)selection;
					if (ss.size() == 1) {
						Object element= ss.getFirstElement();
						if (element instanceof MyDiffNode) {
							ITypedElement te= ((MyDiffNode) element).getId();
							if (te != null) {
								enable= !ITypedElement.FOLDER_TYPE.equals(te.getType());
							}
						} else {
							enable= true;
						}
					}
				}
				fOpenAction.setEnabled(enable);

				manager.add(fOpenAction);

				super.fillContextMenu(manager);
			}
		};
		return fDiffViewer;
	}

	// If the compare is three-way, this method asks the user which resource
	// to use as the ancestor. Depending on the value of
	// showSelectAncestorDialog flag it uses different dialogs to get the
	// feedback from the user. Returns false if the user cancels the prompt,
	// true otherwise.
	boolean setSelection(final ISelection s, final Shell shell, final boolean showSelectAncestorDialog) {

		if (!showSelectAncestorDialog) {
			return showCompareWithOtherResourceDialog(shell, s);
		}

		final IResource[] selection = getResources((IStructuredSelection) s);
		if (selection.length == 1) {
			shell.getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					MessageDialog.openInformation(shell, "Cannot compare with origin cookbook", "Cookbook " + selection[0].getName() + " was not installed from remote picker cookbook.");
				}
			});
			return false;
		}

		fThreeWay = selection.length == 3;

		if (fThreeWay) {
			// SelectAncestorDialog dialog =
			// new SelectAncestorDialog(shell, selection);
			// int code = dialog.open();
			// if (code != Window.OK) {
			// return false;
			// }
			//
			// fAncestorResource= dialog.ancestorResource;
			fAncestorResource= selection[2];
			fAncestor = getStructure(fAncestorResource);
			fLeftResource = selection[0];
			fRightResource = selection[1];
//			fLeftResource= dialog.leftResource;
//			fRightResource= dialog.rightResource;
		} else {
			fAncestorResource= null;
			fAncestor= null;
			fLeftResource= selection[0];
			fRightResource= selection[1];
		}
		fLeft= getStructure(fLeftResource);
		fRight= getStructure(fRightResource);
		return true;
	}

	private IResource[] getResources(final IStructuredSelection selection) {
		List<IResource> res = new ArrayList<IResource>(3);
		Object selected = selection.getFirstElement();

		ChefRepositoryManager repoManager = ChefRepositoryManager.INSTANCE;
		CookbookRepositoryManager cookbookManager = CookbookRepositoryManager.getInstance();

		if (selected instanceof IResource) {
			res.add(repoManager.getCookbookForResource((IResource) selected));
		} else if (selected instanceof CookbookVersion) {
			res.add(repoManager.getResource((EObject) selected));
		} else if (selected instanceof CookbookFolder) {
			res.add(((CookbookFolder) selected).getResource());
		}

		if (res.size() == 0) {
			throw new IllegalArgumentException("Could not get cookbook from selection : " + selection);
		}

		//get installed version
		RemoteCookbook sourceCookbook = cookbookManager.getSourceCookbook(res.get(0)
				.getRawLocation().toFile());
		if (sourceCookbook != null) {
			try {
				String installedVersion = sourceCookbook.getLatestVersion();
				String latestVersion = sourceCookbook.getVersions().get(0);

				res.add(downloadCookbook(cookbookManager, sourceCookbook, latestVersion));

				if (!installedVersion.equals(latestVersion)) {
					res.add(downloadCookbook(cookbookManager, sourceCookbook, installedVersion));
				}
			} catch (InstallCookbookException e) {
				Activator.log(e);
			} catch (CoreException e) {
				Activator.log(e);
			}
		}
		return res.toArray(new IResource[0]);
	}

	/**
	 * @param cookbookManager
	 * @param cookbook
	 * @param version
	 * @return
	 * @throws InstallCookbookException
	 * @throws CoreException
	 */
	protected IFolder downloadCookbook(CookbookRepositoryManager cookbookManager,
			RemoteCookbook cookbook, String version) throws InstallCookbookException, CoreException {
		File tmpCookbook = cookbookManager.downloadCookbook(cookbook, version,
				cookbook.getRepositoryId());

		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject project = ws.getRoot().getProject(EXTERNAL_FILES);
		if (!project.exists()) {
			project.create(null);
		}
		if (!project.isOpen()) {
			project.open(null);
			project.setHidden(true);
		} else {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		}

		IPath location = new Path(tmpCookbook.getAbsolutePath());
		String v = cookbookManager.getReadableVersion(cookbook, version);
		IFolder file = project.getFolder(cookbook.getName()+"_"+v);
		if (!file.exists()) {
			file.createLink(location, IResource.NONE, null);
		}
		return file;
	}

	private boolean showCompareWithOtherResourceDialog(final Shell shell, final ISelection s) {
		CompareWithOtherResourceDialog dialog = new CompareWithOtherResourceDialog(shell, s) {

		};
		if (dialog.open() != IDialogConstants.OK_ID) {
			return false;
		}
		IResource[] selection = dialog.getResult();
		if (!checkSelection(selection)) {
			return false;
		}

		fThreeWay = selection.length == 3;
		if (fThreeWay) {
			fAncestorResource = selection[0];
			fAncestor = getStructure(fAncestorResource);
			fLeftResource = selection[1];
			fRightResource = selection[2];
		} else {
			fAncestorResource = null;
			fAncestor = null;
			fLeftResource = selection[0];
			fRightResource = selection[1];
		}
		fLeft= getStructure(fLeftResource);
		fRight= getStructure(fRightResource);
		return true;
	}

	private boolean checkSelection(final IResource[] resources) {
		for (IResource resource : resources) {
			if (resource == null) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Returns true if compare can be executed for the given selection.
	 */
	public boolean isEnabled(final ISelection s) {

		IResource[] selection= Utilities.getResources(s);
		if (selection.length < 2 || selection.length > 3) {
			return false;
		}

		boolean threeWay= selection.length == 3;

		if (threeWay) {
			// It only makes sense if they're all mutually comparable.
			// If not, the user should compare two of them.
			return comparable(selection[0], selection[1])
					&& comparable(selection[0], selection[2])
					&& comparable(selection[1], selection[2]);
		}

		return comparable(selection[0], selection[1]);
	}

	/**
	 * Initializes the images in the compare configuration.
	 */
	void initializeCompareConfiguration() {
		CompareConfiguration cc= getCompareConfiguration();
		if (fLeftResource != null) {
			cc.setLeftLabel(buildLabel(fLeftResource));
			cc.setLeftImage(CompareUIPlugin.getImage(fLeftResource));
		}
		if (fRightResource != null) {
			cc.setRightLabel(buildLabel(fRightResource));
			cc.setRightImage(CompareUIPlugin.getImage(fRightResource));
		}
		if (fThreeWay && fAncestorResource != null) {
			cc.setAncestorLabel(buildLabel(fAncestorResource));
			cc.setAncestorImage(CompareUIPlugin.getImage(fAncestorResource));
		}
	}

	/*
	 * Returns true if both resources are either structured or unstructured.
	 */
	private boolean comparable(final IResource c1, final IResource c2) {
		return hasStructure(c1) == hasStructure(c2);
	}

	/*
	 * Returns true if the given argument has a structure.
	 */
	private boolean hasStructure(final IResource input) {

		if (input instanceof IContainer) {
			return true;
		}

		if (input instanceof IFile) {
			IFile file= (IFile) input;
			String type= file.getFileExtension();
			if (type != null) {
				type= normalizeCase(type);
				return "JAR".equals(type) || "ZIP".equals(type);	//$NON-NLS-2$ //$NON-NLS-1$
			}
		}

		return false;
	}

	/*
	 * Creates a <code>IStructureComparator</code> for the given input.
	 * Returns <code>null</code> if no <code>IStructureComparator</code>
	 * can be found for the <code>IResource</code>.
	 */
	private IStructureComparator getStructure(final IResource input) {

		if (input instanceof IContainer) {
			return new FilteredBufferedResourceNode(input);
		}

		if (input instanceof IFile) {
			IStructureComparator rn= new FilteredBufferedResourceNode(input);
			IFile file= (IFile) input;
			String type= normalizeCase(file.getFileExtension());
			if ("JAR".equals(type) || "ZIP".equals(type)) {
				return new ZipFileStructureCreator().getStructure(rn);
			}
			return rn;
		}
		return null;
	}

	/*
	 * Performs a two-way or three-way diff on the current selection.
	 */
	@Override
	public Object prepareInput(final IProgressMonitor pm) throws InvocationTargetException {

		try {
			// fix for PR 1GFMLFB: ITPUI:WIN2000 - files that are out of sync with the file system appear as empty
			fLeftResource.refreshLocal(IResource.DEPTH_INFINITE, pm);
			fRightResource.refreshLocal(IResource.DEPTH_INFINITE, pm);
			if (fThreeWay && fAncestorResource != null) {
				fAncestorResource.refreshLocal(IResource.DEPTH_INFINITE, pm);
			}
			// end fix

			pm.beginTask(Utilities.getString("ResourceCompare.taskName"), IProgressMonitor.UNKNOWN); //$NON-NLS-1$

			String leftLabel = fLeftResource.getName();
			String rightLabel = fRightResource.getName();

			String title;
			if (fThreeWay) {
				String format= Utilities.getString("ResourceCompare.threeWay.title"); //$NON-NLS-1$
				String ancestorLabel= fAncestorResource.getName();
				title= MessageFormat.format(format, ancestorLabel, leftLabel, rightLabel);
			} else {
				String format= Utilities.getString("ResourceCompare.twoWay.title"); //$NON-NLS-1$
				title= MessageFormat.format(format, leftLabel, rightLabel);
			}
			setTitle(title);

			Differencer d= new Differencer() {
				@Override
				protected Object visit(final Object parent, final int description, final Object ancestor, final Object left, final Object right) {
					return new MyDiffNode((IDiffContainer) parent, description, (ITypedElement)ancestor, (ITypedElement)left, (ITypedElement)right);
				}
			};

			fRoot= d.findDifferences(fThreeWay, pm, null, fAncestor, fLeft, fRight);
			return fRoot;

		} catch (CoreException ex) {
			throw new InvocationTargetException(ex);
		} finally {
			pm.done();
		}
	}

	@Override
	public String getToolTipText() {
		if (fLeftResource != null && fRightResource != null) {
			String leftLabel= fLeftResource.getFullPath().makeRelative().toString();
			String rightLabel= fRightResource.getFullPath().makeRelative().toString();
			if (fThreeWay) {
				String format= Utilities.getString("ResourceCompare.threeWay.tooltip"); //$NON-NLS-1$
				String ancestorLabel= fAncestorResource.getFullPath().makeRelative().toString();
				return MessageFormat.format(format, ancestorLabel, leftLabel, rightLabel);
			}
			String format= Utilities.getString("ResourceCompare.twoWay.tooltip"); //$NON-NLS-1$
			return MessageFormat.format(format, leftLabel, rightLabel);
		}
		// fall back
		return super.getToolTipText();
	}

	private String buildLabel(final IResource r) {
		// for a linked resource in a hidden project use its local file system location
		if (r.isLinked() && r.getProject().isHidden()) {
			return r.getName();
		}
		String n= r.getFullPath().toString();
		if (n.charAt(0) == IPath.SEPARATOR) {
			return n.substring(1);
		}
		return n;
	}

	@Override
	public void saveChanges(final IProgressMonitor pm) throws CoreException {
		super.saveChanges(pm);
		if (fRoot instanceof DiffNode) {
			try {
				commit(pm, (DiffNode) fRoot);
			} finally {
				if (fDiffViewer != null) {
					fDiffViewer.refresh();
				}
				setDirty(false);
			}
		}
	}

	/*
	 * Recursively walks the diff tree and commits all changes.
	 */
	private static void commit(final IProgressMonitor pm, final DiffNode node) throws CoreException {

		if (node instanceof MyDiffNode) {
			((MyDiffNode)node).clearDirty();
		}

		ITypedElement left= node.getLeft();
		if (left instanceof BufferedResourceNode) {
			((BufferedResourceNode) left).commit(pm);
		}

		ITypedElement right= node.getRight();
		if (right instanceof BufferedResourceNode) {
			((BufferedResourceNode) right).commit(pm);
		}

		IDiffElement[] children= node.getChildren();
		if (children != null) {
			for (IDiffElement element : children) {
				if (element instanceof DiffNode) {
					commit(pm, (DiffNode) element);
				}
			}
		}
	}

	/* (non Javadoc)
	 * see IAdaptable.getAdapter
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(final Class adapter) {
		if (IFile.class.equals(adapter)) {
			IProgressMonitor pm= new NullProgressMonitor();
			// flush changes in any dirty viewer
			flushViewers(pm);
			IFile[] files= (IFile[]) getAdapter(IFile[].class);
			if (files != null && files.length > 0) {
				return files[0];	// can only return one: limitation on IDE.saveAllEditors; see #64617
			}
			return null;
		}
		if (IFile[].class.equals(adapter)) {
			HashSet<IResource> collector= new HashSet<IResource>();
			collectDirtyResources(fRoot, collector);
			return collector.toArray(new IFile[collector.size()]);
		}
		return super.getAdapter(adapter);
	}

	private void collectDirtyResources(final Object o, final Set<IResource> collector) {
		if (o instanceof DiffNode) {
			DiffNode node= (DiffNode) o;

			ITypedElement left= node.getLeft();
			if (left instanceof BufferedResourceNode) {
				BufferedResourceNode bn= (BufferedResourceNode) left;
				if (bn.isDirty()) {
					IResource resource= bn.getResource();
					if (resource instanceof IFile) {
						collector.add(resource);
					}
				}
			}

			ITypedElement right= node.getRight();
			if (right instanceof BufferedResourceNode) {
				BufferedResourceNode bn= (BufferedResourceNode) right;
				if (bn.isDirty()) {
					IResource resource= bn.getResource();
					if (resource instanceof IFile) {
						collector.add(resource);
					}
				}
			}

			IDiffElement[] children= node.getChildren();
			if (children != null) {
				for (IDiffElement element : children) {
					if (element instanceof DiffNode) {
						collectDirtyResources(element, collector);
					}
				}
			}
		}
	}

	private static String normalizeCase(final String s) {
		if (NORMALIZE_CASE && s != null) {
			return s.toUpperCase();
		}
		return s;
	}

	@Override
	public boolean canRunAsJob() {
		return true;
	}
}

