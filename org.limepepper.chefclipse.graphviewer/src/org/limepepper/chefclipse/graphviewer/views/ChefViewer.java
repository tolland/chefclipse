package org.limepepper.chefclipse.graphviewer.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.IGraphEntityRelationshipContentProvider;
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

import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.Recipe;
import org.limepepper.chefclipse.graphviewer.actions.DeleteDependencyAction;
import org.limepepper.chefclipse.graphviewer.actions.DeleteNodeAction;
import org.limepepper.chefclipse.graphviewer.common.MockCookbookImpl;
import org.limepepper.chefclipse.graphviewer.common.MockDependencyRelation;
import org.limepepper.chefclipse.graphviewer.common.MockRecipeImpl;
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
		
		graphViewer.setContentProvider(new GraphViewerContentProvider());
		graphViewer.setLabelProvider(new GraphViewerLabelProvider());
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
	
	static class GraphViewerContentProvider  implements IGraphEntityContentProvider {

		public Object[] getConnectedTo(Object entity) {
		    if (entity instanceof Recipe) {
		    	Recipe node = (Recipe) entity;
		      return node.getCookbook().toArray();
		    }
		    else if (entity instanceof Cookbook)
		    {
		    	Cookbook node = (Cookbook) entity;
			      return node.getRecipes().toArray();
		    }
		    throw new RuntimeException("Type not supported");
		  }

		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}

		public Object[] getElements(Object inputElement) {
			Cookbook cookbook = (Cookbook)inputElement;
			List<Object> elements =new ArrayList<Object>();
			elements.add(cookbook);
			for(int i=0; i<elements.size();i++)
			{
				Object current = elements.get(i);
				List<? extends Object> children=null;
				if(current instanceof Cookbook)
				{
					children = ((Cookbook)current).getRecipes();
				}
				else if(current instanceof Recipe)
				{
					children = ((Recipe)current).getCookbook();
				}
				if(children==null)
				{
					continue;
				}
				for(Object child:children)
				{
					if(!elements.contains(child))
					{
						elements.add(child);
					}
				}
			}
			return elements.toArray();
		}
	}

	static class GraphViewerLabelProvider extends LabelProvider {
		final Image image = Display.getDefault().getSystemImage(
				SWT.ICON_WARNING);

		Image cookbookImage = new Image(Display.getDefault(),
				ChefViewer.class.getResourceAsStream("class_obj.gif"));
		Image recipeImage = new Image(Display.getDefault(),
				ChefViewer.class.getResourceAsStream("methpub_obj.gif"));

		public GraphViewerLabelProvider() {

		}

		public String getText(Object element) {
			if (element instanceof Recipe) {
				return ((MockRecipeImpl) element).getName();
			}
			else if(element instanceof Cookbook)
			{
				return ((MockCookbookImpl) element).getName();
			}
			return null;
		}

		public Image getImage(Object element) {
			if (element instanceof Cookbook) {
					return cookbookImage;
			}
			else if (element instanceof Recipe) {
				return recipeImage;
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
		Object selectedNode=null;
		Object selectedRelation=null;
		IStructuredSelection selection = (IStructuredSelection)graphViewer.getSelection(); 
		if (selection != null) { 
			Object selected = selection.getFirstElement();
			if(selectedNode instanceof Recipe|| selectedNode instanceof Cookbook)
			{
				selectedNode=selected;
			}
			else if(selected instanceof MockDependencyRelation)
			{
				selectedRelation= selected;
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
