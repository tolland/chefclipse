package org.limepepper.chefclipse.graphviewer.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.zest.core.viewers.IFigureProvider;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.ISelfStyleProvider;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableContainer;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;
import org.limepepper.chefclipse.graphviewer.common.ICookbookElement;
import org.limepepper.chefclipse.graphviewer.common.ImageLoader;
import org.limepepper.chefclipse.graphviewer.common.MockCookbookImpl;
import org.limepepper.chefclipse.graphviewer.controller.CookbookController;
import org.limepepper.chefclipse.graphviewer.figure.ChefclipseConnectionAnchor;
import org.limepepper.chefclipse.graphviewer.figure.ContainerFigure;
import org.limepepper.chefclipse.graphviewer.figure.CookbookElementFigure;
import org.limepepper.chefclipse.graphviewer.figure.CookbookFigure;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel.ICookbookChangeListener;

public class CookbookGraphEditor extends EditorPart implements ICookbookChangeListener {
	
	private CookbookGraphEditorInput input;
	private CookbookModel cookbookModel;
	private CookbookController cookbookController;
	
	private GraphViewer graphViewer;
	private Graph graph;
	
	public static final String ID = "org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditor";

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

		graphViewer.setContentProvider(new CookbookViewerContentProvider());
		graphViewer.setLabelProvider(new CookbookViewerLabelProvider());
		graphViewer.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
		TreeLayoutAlgorithm treeLayoutAlgorithm = new TreeLayoutAlgorithm(TreeLayoutAlgorithm.LEFT_RIGHT,new Dimension(200,50));
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
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				synchronized (this) {
					DrawableCookbook rootCookbook = cookbookModel.getDrawableCookbook();
					graphViewer.setInput(rootCookbook);
				}
			}
		});
	}
	
	@Override
	public void dispose() {
		cookbookModel.removeCookbookChangeListener(this);
		super.dispose();
	}

	static class CookbookViewerContentProvider implements
	IGraphEntityContentProvider {

public Object[] getConnectedTo(Object entity) {
	if (entity instanceof DrawableCookbook) {
		DrawableCookbook root = (DrawableCookbook) entity;
		return root.getDirectElements();
	}
	else if(entity instanceof DrawableContainer)
	{
		DrawableContainer container =(DrawableContainer)entity;
		return container.getElements();
	}
	else if(entity instanceof ICookbookElement)
	{
		return null;
	}
	
	throw new RuntimeException("Type not supported");
}

public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	// TODO Auto-generated method stub

}

public Object[] getElements(Object inputElement) {
	
	DrawableCookbook drawableCookbook = (DrawableCookbook) inputElement;
	return drawableCookbook.getElements();
}

@Override
public void dispose() {
	// TODO Auto-generated method stub
	
}
}

static class CookbookViewerLabelProvider extends LabelProvider implements
	ISelfStyleProvider,IFigureProvider {

	Image attributeImage = ImageLoader.Load("methpub_obj.gif");
	
public CookbookViewerLabelProvider() {

}

public String getText(Object element) {
	if(element instanceof ICookbookElement)
	{
		return ((ICookbookElement)element).getName();
	}
	return null;
}

public Image getImage(Object element) {
	if(element instanceof ICookbookElement)
	{
		return attributeImage;
	}
	return null;
}

@Override
public void selfStyleConnection(Object element,
		GraphConnection connection) {
	connection.setLineColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_BLUE));
	ManhattanConnectionRouter router = new ManhattanConnectionRouter();
	Connection c = connection.getConnectionFigure();
	c.setConnectionRouter(router);
	
	ConnectionAnchor s= new ChefclipseConnectionAnchor(c.getSourceAnchor().getOwner());
	ConnectionAnchor t= new ChefclipseConnectionAnchor(c.getTargetAnchor().getOwner());
	c.setSourceAnchor(s);
	c.setTargetAnchor(t);
}

@Override
public void selfStyleNode(Object element, GraphNode node) {
	// TODO Auto-generated method stub

}

@Override
public IFigure getFigure(Object element) {
	if(element instanceof DrawableCookbook)
	{
		MockCookbookImpl c = (MockCookbookImpl)((DrawableCookbook)element).getCookbook();;
		return new CookbookFigure(c.getName(),c.getVersion(),c.getCatalog());
	}
	else if(element instanceof DrawableContainer)
	{
		return new ContainerFigure((DrawableContainer)element);
	}
	else if (element instanceof ICookbookElement)
	{
		return new CookbookElementFigure((ICookbookElement)element);
	}
	return null;
}
}
}
