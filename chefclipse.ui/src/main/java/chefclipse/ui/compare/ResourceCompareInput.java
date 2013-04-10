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
package chefclipse.ui.compare;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.DiffTreeViewer;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.compare.structuremergeviewer.IDiffContainer;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * A two-way compare for arbitrary IResources.
 */
public class ResourceCompareInput extends CompareEditorInput {

	private IStructureComparator fLeft;
	private IStructureComparator fRight;
	private DiffTreeViewer fDiffViewer;
	private Object fRoot;
	/*
	 * Creates an compare editor input for the given selection.
	 */
	public ResourceCompareInput(final CompareConfiguration config) {
		super(config);
	}

	@Override
	protected Object prepareInput(IProgressMonitor monitor)
			throws InvocationTargetException, InterruptedException {


		Differencer d= new Differencer() {
			@Override
			protected Object visit(final Object parent, final int description, final Object ancestor, final Object left, final Object right) {
				return new MyDiffNode((IDiffContainer) parent, description, (ITypedElement)ancestor, (ITypedElement)left, (ITypedElement)right);
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

		return true;
	}

	private IStructureComparator getStructure(Object object) {
		if (object instanceof CookbookVersion) {
			return new CookbookFolderNode((CookbookVersion) object);
		}
		return null;
	}
	
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
	
	
}
