package org.limepepper.chefclipse.graphviewer.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.limepepper.chefclipse.graphviewer.controller.CookbookController;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel.ICookbookChangeListener;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor.GraphViewerContentProvider;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor.GraphViewerLabelProvider;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.Recipe;

public class CookbookGraphEditor extends EditorPart implements ICookbookChangeListener {
	
	private CookbookGraphEditorInput input;
	private CookbookModel cookbookModel;
	private CookbookController cookbookController;
	
	private GraphViewer graphViewer;
	private Graph graph;

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		if (!(input instanceof CookbookGraphEditorInput)) {
			throw new RuntimeException("Wrong input");
		}
		setSite(site);
		setInput(input);
		this.input = (CookbookGraphEditorInput) input;
		
		cookbookModel=new CookbookModel();
		cookbookController  = new CookbookController(cookbookModel);
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		cookbookModel.addCookbookChangeListener(this);
		graphViewer = new GraphViewer(parent, SWT.NONE);

		graphViewer.setContentProvider(new GraphViewerContentProvider());
		graphViewer.setLabelProvider(new GraphViewerLabelProvider());
		graphViewer.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
		RadialLayoutAlgorithm treeLayoutAlgorithm = new RadialLayoutAlgorithm();
		graphViewer.setLayoutAlgorithm(treeLayoutAlgorithm, true);
		cookbookModel.setDrawableCookbook(
				cookbookController.buildDrawableCookbook());
		graph = graphViewer.getGraphControl();
		hookMenu(graph);
	}

	private void hookMenu(final Graph g) {

		MenuManager menuMgr = new MenuManager("#PopupMenu");

		menuMgr.setRemoveAllWhenShown(true);

		menuMgr.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager manager) {

				fillContextMenu(manager);

			}

		});
		g.setMenu(menuMgr.createContextMenu(g));
	}
	
	private void fillContextMenu(IMenuManager menuMgr) {

		IStructuredSelection selection = (IStructuredSelection) graphViewer
				.getSelection();
		if (selection != null) {
			Object selected = selection.getFirstElement();
		}
	}
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cookbookChanged() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dispose() {
		cookbookModel.removeCookbookChangeListener(this);
		super.dispose();
	}

}
