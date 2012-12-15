package org.limepepper.chefclipse.graphviewer.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IFigureProvider;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.ISelfStyleProvider;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphContainer;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShiftAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.graphviewer.common.ImageLoader;
import org.limepepper.chefclipse.graphviewer.controller.DependencyController;
import org.limepepper.chefclipse.graphviewer.figure.CookbookFigure;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel.IDependencyChangeListener;
import org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditor.CookbookGraphLayoutAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyGraphEditor extends EditorPart implements
		IDependencyChangeListener {

	static Logger logger = LoggerFactory.getLogger(DependencyGraphEditor.class);

	private GraphViewer graphViewer;
	private Graph graph;
    LayoutAlgorithm currentLayoutAlgorithm;
	private DependencyGraphEditorInput input;
	private DependencyController dependencyController;
	private DependencyModel dependencyModel;
	private GraphNode selectedGraphNode;

	public static final String ID = "org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor";

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
		if (!(input instanceof DependencyGraphEditorInput)) {
			throw new RuntimeException("Wrong input");
		}
		setSite(site);
		setInput(input);
		this.input = (DependencyGraphEditorInput) input;

		dependencyModel = new DependencyModel();
		dependencyController = new DependencyController(dependencyModel);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		dependencyModel.addDependencyChangeListener(this);
		
		ViewForm viewForm = new ViewForm(parent, SWT.NONE);
        viewForm.setLayout(new FillLayout());
		graphViewer = new GraphViewer(viewForm, SWT.NONE);
		graph = graphViewer.getGraphControl();
		graphViewer.setContentProvider(new GraphViewerContentProvider());
		graphViewer.setLabelProvider(new GraphViewerLabelProvider());
		// graphViewer.addSelectionChangedListener(graghviewer_SelectionChangedListener);
		graph.addSelectionListener(gragh_SelectionChangedListener);
		graphViewer.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
		currentLayoutAlgorithm = new TreeLayoutAlgorithm(
				TreeLayoutAlgorithm.TOP_DOWN, new Dimension(200, 150));
		//HorizontalShiftAlgorithm horizontalShift = new HorizontalShiftAlgorithm();
		//CompositeLayoutAlgorithm compositeLayoutAlgorithm = new CompositeLayoutAlgorithm(
		//		new LayoutAlgorithm[] { horizontalShift, treeLayoutAlgorithm });
		// g.setLayoutAlgorithm(new
		// GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		graphViewer.setLayoutAlgorithm(currentLayoutAlgorithm);

		IResource resource = ((DependencyGraphEditorInput) input).getResource();
		dependencyModel.setResource(resource);
		graph = graphViewer.getGraphControl();
		hookMenu(graph);
		createToolbar(viewForm);
		viewForm.setContent(graph);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
    private void createToolbar(ViewForm viewFrom)
    {
    	ToolBar toolBar = new ToolBar(viewFrom, SWT.FLAT);
    	ToolBarManager toolBarManager =new ToolBarManager(toolBar);
    	toolBarManager.add(new DependencyGraphLayoutAction());
    	toolBarManager.update(true);
    	viewFrom.setTopLeft(toolBar);
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
		Object selectedNode = null;
		Object selectedRelation = null;
		IStructuredSelection selection = (IStructuredSelection) graphViewer
				.getSelection();
		if (selection != null) {
			Object selected = selection.getFirstElement();
			if (selected instanceof Recipe
					|| selected instanceof CookbookVersion) {
				selectedNode = selected;
			} else if (selected instanceof EntityConnectionData) {
				selectedRelation = selected;
			}
		}
		menuMgr.add(new DeleteDependencyAction(selectedRelation));
		menuMgr.add(new DeleteNodeAction(selectedNode));
		menuMgr.add(new LinkToStructureViewerAction(selectedNode));
	}

	SelectionListener gragh_SelectionChangedListener = new SelectionListener() {

		@Override
		public void widgetSelected(SelectionEvent e) {
			List graphNodes = graph.getSelection();
			if (graphNodes != null && graphNodes.size() > 0) {
				if (selectedGraphNode != null) {
					selectedGraphNode.getFigure().setBackgroundColor(
							new Color(null, 255, 255, 206));
				}
				GraphNode selectedNode = (GraphNode) graphNodes.get(0);
				selectedNode.getFigure().setBackgroundColor(
						new Color(null, 206, 206, 255));
				selectedGraphNode = selectedNode;
			}
			// TODO
			// Auto-generated
			// method stub
			// IStructuredSelection
			// selection =
			// (IStructuredSelection)
			// graph
			// .getSelection();
			// Object selected
			// =null;
			// if (selection !=
			// null) {
			// selected =
			// selection.getFirstElement();
			// }
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO
			// Auto-generated
			// method stub

		}

	};

	@Override
	public void dependencyChanged() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				synchronized (this) {
					CookbookVersion rootCookbook = dependencyModel
							.getCookbook();
					graphViewer.setInput(rootCookbook);
				}
			}
		});
	}

	static class GraphViewerContentProvider implements
			IGraphEntityContentProvider {

		public Object[] getConnectedTo(Object entity) {
			if (entity instanceof CookbookVersion) {
				CookbookVersion node = (CookbookVersion) entity;
				if ((node.getDepends() == null)
						|| (node.getDepends().size() == 0)) {
					return new Object[] {};
				}
				return node.getDepends().toArray();
			}
			// throw new
			// RuntimeException("Type not supported:"+entity.getClass());
			logger.debug("Type not supported: {}", entity.getClass());
			return null;
		}

		public void dispose() {
			// TODO Auto-generated method stub

		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub

		}

		public Object[] getElements(Object inputElement) {
			CookbookVersion cookbook = (CookbookVersion) inputElement;
			List<Object> elements = new ArrayList<Object>();
			elements.add(cookbook);
			for (int i = 0; i < elements.size(); i++) {
				Object current = elements.get(i);
				List<? extends Object> denpendencies = null;
				if (current instanceof CookbookVersion) {
					denpendencies = ((CookbookVersion) current).getDepends();
				}
				if (denpendencies == null) {
					continue;
				}
				for (Object d : denpendencies) {
					if (!elements.contains(d)) {
						elements.add(d);
					}
				}
			}
			return elements.toArray();
		}
	}

	class GraphViewerLabelProvider extends LabelProvider implements
			ISelfStyleProvider, IFigureProvider {

		public GraphViewerLabelProvider() {

		}

		public String getText(Object element) {
			return null;
		}

		public Image getImage(Object element) {
			return null;
		}

		@Override
		public void selfStyleConnection(Object element,
				GraphConnection connection) {
			connection.setLineColor(Display.getDefault().getSystemColor(
					SWT.COLOR_DARK_BLUE));
			ManhattanConnectionRouter router = new ManhattanConnectionRouter();
			Connection c = connection.getConnectionFigure();
			c.setConnectionRouter(router);

			// ConnectionAnchor s= new
			// ChefclipseConnectionAnchor(c.getSourceAnchor().getOwner());
			// ConnectionAnchor t= new
			// ChefclipseConnectionAnchor(c.getTargetAnchor().getOwner());
			// c.setSourceAnchor(s);
			// c.setTargetAnchor(t);
		}

		@Override
		public void selfStyleNode(Object element, GraphNode node) {
			// TODO Auto-generated method stub

		}

		@Override
		public IFigure getFigure(Object element) {
			if (element instanceof CookbookVersion) {
				CookbookVersion c = (CookbookVersion) element;
				return new CookbookFigure(c.getName(), c.getMetadata()
						.getVersion(), c.getCatalog(), c.equals(dependencyModel
						.getSelected()));
			}
			return null;
		}
	}

	@Override
	public void dispose() {
		dependencyModel.removeDependencyChangeListener(this);
		dependencyModel.dispose();
		super.dispose();
	}

	public class DeleteDependencyAction extends Action {
		private Object selectedRelation;

		public DeleteDependencyAction(Object selectedRelation) {
			this.setText("Delete Dependency");
			this.selectedRelation = selectedRelation;
		}

		@Override
		public void run() {
			dependencyController.removeDependency(selectedRelation);
		}

		@Override
		public boolean isEnabled() {
			return selectedRelation != null;
		}
	}

	public class DeleteNodeAction extends Action {

		private Object selectedElement;

		public DeleteNodeAction(Object selectedNode) {
			this.setText("Delete Node");
			selectedElement = selectedNode;
		}

		@Override
		public void run() {
			dependencyController.removeNode(selectedElement);
		}

		@Override
		public boolean isEnabled() {
			return selectedElement != null;
		}
	}

	public class LinkToStructureViewerAction extends Action {

		private Object selectedElement;

		public LinkToStructureViewerAction(Object selectedNode) {
			this.setText("Structure Viewer");
			selectedElement = selectedNode;
		}

		@Override
		public void run() {
			try {
				PlatformUI
						.getWorkbench()
						.getActiveWorkbenchWindow()
						.getActivePage()
						.openEditor(
								new CookbookGraphEditorInput(
										input.getResource()),
								CookbookGraphEditor.ID);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public boolean isEnabled() {
			return selectedElement != null;
		}
	}
	
    class DependencyGraphLayoutAction extends Action
    {
    	public DependencyGraphLayoutAction() {
    		this.setToolTipText("Change Dependency Graph Layout");
    		setImageDescriptor(ImageDescriptor.createFromImage(ImageLoader.Load("full_hierarchy.gif")));
    	}
    	
    	@Override
    	public void run()
    	{
    		if(currentLayoutAlgorithm.getClass() == TreeLayoutAlgorithm.class)
    		{
    			currentLayoutAlgorithm = new GridLayoutAlgorithm();
    		}
    		else
    		{
    			currentLayoutAlgorithm = new TreeLayoutAlgorithm(
    	                TreeLayoutAlgorithm.LEFT_RIGHT, new Dimension(200, 150));
    		}
    		graphViewer.setLayoutAlgorithm(currentLayoutAlgorithm);
    		dependencyModel.notifyDependencyChanged();
    	}
    }

}
