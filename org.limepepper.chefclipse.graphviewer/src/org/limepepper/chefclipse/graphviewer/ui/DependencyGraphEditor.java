package org.limepepper.chefclipse.graphviewer.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.limepepper.chefclipse.graphviewer.actions.DeleteDependencyAction;
import org.limepepper.chefclipse.graphviewer.actions.DeleteNodeAction;
import org.limepepper.chefclipse.graphviewer.common.MockCookbookImpl;
import org.limepepper.chefclipse.graphviewer.common.MockRecipeImpl;
import org.limepepper.chefclipse.graphviewer.controller.DependencyController;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel.IDependencyChangeListener;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.Recipe;

public class DependencyGraphEditor extends EditorPart implements IDependencyChangeListener {

	private GraphViewer graphViewer;
	private Graph graph;
	private DependencyGraphEditorInput input;
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
		this.input=(DependencyGraphEditorInput)input;
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

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

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
			if(selected instanceof Recipe|| selected instanceof Cookbook)
			{
				selectedNode=selected;
			}
			else if(selected instanceof EntityConnectionData)
			{
				selectedRelation= selected;
			}
		}
		menuMgr.add(new DeleteDependencyAction(selectedRelation));
		menuMgr.add(new DeleteNodeAction(selectedNode));
	}
	
	@Override
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
				DependencyGraphEditor.class.getResourceAsStream("class_obj.gif"));
		Image recipeImage = new Image(Display.getDefault(),
				DependencyGraphEditor.class.getResourceAsStream("methpub_obj.gif"));

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
}
