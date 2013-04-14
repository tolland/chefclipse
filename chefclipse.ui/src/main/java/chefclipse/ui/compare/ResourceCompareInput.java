/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: IBM Corporation - initial API and implementation Matt McCutchen
 * (hashproduct+eclipse@gmail.com) - Bug 35390 Three-way compare cannot select
 * (mis-selects) )ancestor resource Aleksandra Wozniak
 * (aleksandra.k.wozniak@gmail.com) - Bug 239959
 *******************************************************************************/
package chefclipse.ui.compare;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.DiffTreeViewer;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.compare.structuremergeviewer.IDiffContainer;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.knife.api.ChefConfigManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.managers.ChefRepositoryManager;
import chefclipse.core.testers.ChefTester;

/**
 * A two-way compare for arbitrary IResources.
 */
public class ResourceCompareInput extends CompareEditorInput {

	static Logger logger = LoggerFactory.getLogger(ResourceCompareInput.class);
	private IStructureComparator fLeft;
	private IStructureComparator fRight;
	private DiffTreeViewer fDiffViewer;
	private Object fRoot;

	static KnifeConfigController api = KnifeConfigController.INSTANCE;

	/*
	 * Creates an compare editor input for the given selection.
	 */
	public ResourceCompareInput(final CompareConfiguration config) {
		super(config);
	}

	@Override
	protected Object prepareInput(IProgressMonitor monitor)
			throws InvocationTargetException, InterruptedException {

		Differencer d = new Differencer() {
			@Override
			protected Object visit(final Object parent, final int description,
					final Object ancestor, final Object left, final Object right) {
				return new MyDiffNode((IDiffContainer) parent, description,
						(ITypedElement) ancestor, (ITypedElement) left,
						(ITypedElement) right);
			}
		};

		fRoot = d.findDifferences(false, monitor, null, null, fLeft, fRight);
		return fRoot;
	}

	public boolean setSelection(IStructuredSelection selection, Shell shell,
			boolean b) {

		Object[] selections = selection.toArray();

		if (selection.size() > 1) {
			fLeft = getStructure(selections[0]);
			fRight = getStructure(selections[1]);

		}

		// the selection is only 1, then compare against the latest server
		// cookbook
		if (selection.size() == 1) {
			fLeft = getStructure(selections[0]);
			fRight = getRemoteStructure(selections[0]);
		}

		return true;
	}

	private IStructureComparator getRemoteStructure(Object object) {
		if (object instanceof ServerCookbookVersion) {
			return new CookbookFolderNode(
					getStructureFromServer((CookbookVersion) object));
		} else if (object instanceof CookbookVersion) {
			return new CookbookFolderNode(
					getStructureFromServer((CookbookVersion) object));
		} else if (object instanceof IFolder) {
			if (ChefTester.testResource(object, "isCookbook")) {
				return new CookbookFolderNode(
						getStructureFromServer((CookbookVersion) ChefRepositoryManager.INSTANCE
								.getElement((IResource) object)));
			}
		}
		return null;
	}

	private IStructureComparator getStructure(Object object) {
		if (object instanceof CookbookVersion) {
			return new CookbookFolderNode((CookbookVersion) object);
		} else if (object instanceof IFolder) {
			if (ChefTester.testResource(object, "isCookbook")) {
				return new CookbookFolderNode(
						(CookbookVersion) ChefRepositoryManager.INSTANCE
								.getElement((IResource) object));
			}
		}
		return null;
	}

	class MyDiffNode extends DiffNode {

		private boolean fDirty = false;
		private ITypedElement fLastId;
		private String fLastName;

		public MyDiffNode(final IDiffContainer parent, final int description,
				final ITypedElement ancestor, final ITypedElement left,
				final ITypedElement right) {
			super(parent, description, ancestor, left, right);
		}

		@Override
		public void fireChange() {
			super.fireChange();
			setDirty(true);
			fDirty = true;
			if (fDiffViewer != null) {
				fDiffViewer.refresh(this);
			}
		}

		void clearDirty() {
			fDirty = false;
		}

		@Override
		public String getName() {
			if (fLastName == null) {
				fLastName = super.getName();
			}
			if (fDirty) {
				return '<' + fLastName + '>';
			}
			return fLastName;
		}

		@Override
		public ITypedElement getId() {
			ITypedElement id = super.getId();
			if (id == null) {
				return fLastId;
			}
			fLastId = id;
			return id;
		}
	}

	public static ServerCookbookVersion getStructureFromServer(
			@NonNull CookbookVersion cookbook) {

		IFolder cookbookResource = ChefRepositoryManager.INSTANCE
				.getResource(cookbook);

		assertNotNull(cookbookResource);

		KnifeConfig config = ChefConfigManager.instance()
				.retrieveProjectChefConfig(cookbookResource.getProject());

		ChefServerApi chefServerApi = api.getServer(config);

		assertNotNull(chefServerApi);

		// ChefPlugin.log(item);

		// IResource cookbookResource = item.getResource();

		// assertNotNull(cookbookVersion);

		String cookbookName = cookbookResource.getName();

		ServerCookbookVersion remoteCookbook = chefServerApi
				.getCookbookVersion(cookbookName);

		assertNotNull(remoteCookbook);

		for (Root_file root_file : remoteCookbook.getRoot_files()) {
			System.out.println("roiofile urlk was " + root_file.getUrl());
		}

		/*
		 * CompareUI.openCompareEditor(new CookbookCompareInput(
		 * item.getResource(), cookbook));
		 */
		return remoteCookbook;
	}
}
