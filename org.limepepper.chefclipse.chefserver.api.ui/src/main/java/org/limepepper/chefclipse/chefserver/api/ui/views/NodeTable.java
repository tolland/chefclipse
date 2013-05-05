package org.limepepper.chefclipse.chefserver.api.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ResourceTransfer;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.ui.editors.RunListEditor;
import org.limepepper.chefclipse.chefserver.api.ui.editors.RunListEditorInput;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

import chefclipse.core.managers.ChefRepositoryManager;
import chefclipse.core.providers.ChefProjectAdapterFactory;
import chefclipse.core.testers.ChefTester;

public class NodeTable extends Composite {

	private TableViewer tableViewer;
	private Table table;
	private ChefServerApi api;

	public NodeTable(Composite parent, ChefServerApi api) {
		super(parent, SWT.NONE);
		setLayout(new FillLayout());

		this.api = api;

		tableViewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		Transfer[] transferTypes = new Transfer[] { ResourceTransfer
				.getInstance() };
		tableViewer.addDropSupport(DND.DROP_COPY | DND.DROP_MOVE
				| DND.DROP_LINK, transferTypes, new DropListener(tableViewer));
		tableViewer.setContentProvider(new NodeContentProvider());
		tableViewer.setLabelProvider(new NodeLabelProvider());
		tableViewer.setSorter(new NameSorter());
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setInput(api.getNodes());
	}

	class NameSorter extends ViewerSorter {
	}

	class NodeLabelProvider extends AdapterFactoryLabelProvider {

		public NodeLabelProvider() {
			super(ChefProjectAdapterFactory.getAdapterFactory());
		}

		public String getText(Object element) {

			return super.getText(element);
		}

		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NodeContentProvider extends AdapterFactoryContentProvider {
		NodeContentProvider() {
			super(ChefProjectAdapterFactory.getAdapterFactory());
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			List<Node> nodes = (List<Node>) inputElement;
			return nodes.toArray(new Node[nodes.size()]);
		}
	}

	public class DropListener extends ViewerDropAdapter {
		@Override
		public void drop(DropTargetEvent event) {
			Object operation = event.data;
			int location = this.determineLocation(event);
			Object target = determineTarget(event);
			switch (location) {
			case 1:
				// Dropped before the target
				break;
			case 2:
				// Dropped after the target
				break;
			case 3:
				// Dropped on the target ;
				break;
			case 4:
				// Dropped into nothing
				break;
			}
			super.drop(event);
		}

		protected DropListener(Viewer viewer) {
			super(viewer);
		}

		@Override
		public boolean performDrop(Object data) {
			if (data == null)
				return false;
			List<CookbookVersion> cookbookList = new ArrayList<CookbookVersion>();
			IResource[] resources = (IResource[]) data;
			for (IResource resource : resources) {
				if (!ChefTester.testResource(resource, "isCookbookFolder")) {
					CookbookVersion cookbook = (CookbookVersion) ChefRepositoryManager.INSTANCE
							.getElement(resource);
					if (!cookbookList.contains(cookbook)) {
						cookbookList.add(cookbook);
					}
				}
			}

			DropTargetEvent event = this.getCurrentEvent();
			Node node = (Node) determineTarget(event);
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			RunListEditorInput input = new RunListEditorInput(node);
			try {
				page.openEditor(input, RunListEditor.ID);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}

		@Override
		public boolean validateDrop(Object target, int operation,
				TransferData transferType) {
			DropTargetEvent event = this.getCurrentEvent();
			int location = this.determineLocation(event);
			// only allow drop on the target.
			if (location != 3) {
				return false;
			}
			return true;
		}

	}
}
