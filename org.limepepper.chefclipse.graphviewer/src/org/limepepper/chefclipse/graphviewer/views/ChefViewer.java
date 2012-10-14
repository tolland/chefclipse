package org.limepepper.chefclipse.graphviewer.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IGraphContentProvider;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import org.limepepper.chefclipse.graphviewer.actions.DeleteDependencyAction;
import org.limepepper.chefclipse.graphviewer.actions.DeleteNodeAction;
import org.limepepper.chefclipse.graphviewer.common.ChefElement;
import org.limepepper.chefclipse.graphviewer.common.ChefRelation;
import org.limepepper.chefclipse.graphviewer.common.Cookbook;
import org.limepepper.chefclipse.graphviewer.controller.DependencyController;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel.IDependencyChangeListener;

public class ChefViewer implements IDependencyChangeListener {
	
	public GraphViewer graphViewer;
	public Graph graph;

	public ChefViewer(Shell parent)
	{
		DependencyModel.getModel().addDependencyChangeListener(this);
		graphViewer = new GraphViewer(parent, SWT.NONE);
		
		graphViewer.setContentProvider(new ChefGraphContentProvider());
		graphViewer.setLabelProvider(new ChefLabelProvider());
		graphViewer.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
		TreeLayoutAlgorithm treeLayoutAlgorithm = new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		HorizontalShift horizontalShift =new HorizontalShift(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		CompositeLayoutAlgorithm compositeLayoutAlgorithm = new CompositeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING, new LayoutAlgorithm[] { treeLayoutAlgorithm, horizontalShift });
		//g.setLayoutAlgorithm(new GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		graphViewer.setLayoutAlgorithm(compositeLayoutAlgorithm, true);
		DependencyModel.getModel().setCookbook(DependencyController.getController().getRootCookbook());
		graph = graphViewer.getGraphControl();
		hookMenu(graph);
	}
	
	static class ChefGraphContentProvider implements IGraphContentProvider {

		public Object getDestination(Object rel) {
			ChefRelation relation = (ChefRelation) rel;
			return relation.target;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.zest.core.viewers.IGraphContentProvider#getElements(java
		 * .lang.Object)
		 */
		public Object[] getElements(Object input) {
			List<ChefRelation> relations = new ArrayList<ChefRelation>();
			List<ChefElement> nodes = new ArrayList<ChefElement>();
			ChefElement root = (ChefElement) input;
			nodes.add(root);
			for (int i = 0; i < nodes.size(); i++) {
				ChefElement node = nodes.get(i);
				List<ChefElement> children = node.getChildren();
				if (children == null)
					continue;
				for (ChefElement child : children) {
					if (!nodes.contains(child))
						nodes.add(child);
				}

				for (ChefElement child : children) {
					relations.add(new ChefRelation(node, child));
				}
			}

			return relations.toArray();
		}

		public Object getSource(Object rel) {
			ChefRelation relation = (ChefRelation) rel;
			return relation.source;
		}

		public double getWeight(Object connection) {
			return 0;
		}

		public void dispose() {

		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

	}

	static class ChefLabelProvider extends LabelProvider {
		final Image image = Display.getDefault().getSystemImage(
				SWT.ICON_WARNING);

		Image cookbookImage = new Image(Display.getDefault(),
				ChefViewer.class.getResourceAsStream("class_obj.gif"));
		Image recipeImage = new Image(Display.getDefault(),
				ChefViewer.class.getResourceAsStream("methpub_obj.gif"));

		public ChefLabelProvider() {

		}

		public String getText(Object element) {
			if (element instanceof ChefElement) {
				return ((ChefElement) element).getName();
			}
			return null;
		}

		public Image getImage(Object element) {
			if (element instanceof ChefElement) {
				String type = ((ChefElement) element).getType();
				if (type.equals("Cookbook")) {
					return cookbookImage;
				}
				if (type.equals("Recipe")) {
					return recipeImage;
				}
			}
			return null;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Display d = new Display();
		Shell shell = new Shell(d);
		shell.setText("Cookbook dependencies Viewer");
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		shell.setSize(1200,1000);
		
		ChefViewer chefViewer=new ChefViewer(shell);
		
		shell.open();
		while (!shell.isDisposed()) {
			while (!d.readAndDispatch()) {
				d.sleep();
			}
		}
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
		ChefElement selectedNode=null;
		ChefRelation selectedRelation=null;
		IStructuredSelection selection = (IStructuredSelection)graphViewer.getSelection(); 
		if (selection != null) { 
			Object selected = selection.getFirstElement();
			if(selected instanceof ChefElement)
			{
				selectedNode=(ChefElement)selected;
			}
			else if(selected instanceof ChefRelation)
			{
				selectedRelation=(ChefRelation)selected;
			}
		}
		menuMgr.add(new DeleteDependencyAction(selectedRelation));
		menuMgr.add(new DeleteNodeAction(selectedNode));
	}

	public void dependencyChanged() {
		Display.getDefault().syncExec(new Runnable() {
            public void run() {
                synchronized (this) {
                   Cookbook rootCookbook = DependencyModel.getModel().getCookbook();
                   graphViewer.setInput(rootCookbook); 
                }
            }
        });
	}
}
