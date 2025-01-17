package org.limepepper.chefclipse.graphviewer.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IFigureProvider;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.INestedContentProvider;
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
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableContainer;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableFolder;
import org.limepepper.chefclipse.graphviewer.common.DrawableElement;
import org.limepepper.chefclipse.graphviewer.common.ICookbookElement;
import org.limepepper.chefclipse.graphviewer.common.ImageLoader;
import org.limepepper.chefclipse.graphviewer.controller.CookbookController;
import org.limepepper.chefclipse.graphviewer.figure.ChefclipseConnectionAnchor;
import org.limepepper.chefclipse.graphviewer.figure.CookbookElementFigure;
import org.limepepper.chefclipse.graphviewer.figure.CookbookFigure;
import org.limepepper.chefclipse.graphviewer.figure.FolderFigure;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel.ICookbookChangeListener;
import org.limepepper.chefclipse.utility.NamedObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookbookGraphEditor extends EditorPart implements
        ICookbookChangeListener {

    static Logger                    logger = LoggerFactory
                                                    .getLogger(CookbookGraphEditor.class);

    private CookbookGraphEditorInput input;
    private CookbookModel            cookbookModel;
    private CookbookController       cookbookController;

    private GraphViewer              graphViewer;
    private Graph                    graph;
    LayoutAlgorithm currentLayoutAlgorithm;

    public static final String       ID     = "org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditor";

    @Override
    public void doSave(IProgressMonitor monitor) {


    }

    @Override
    public void doSaveAs() {


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

        cookbookModel = new CookbookModel();
        cookbookController = new CookbookController(cookbookModel);
    }

    @Override
    public boolean isDirty() {

        return false;
    }

    @Override
    public boolean isSaveAsAllowed() {

        return false;
    }

    @Override
    public void createPartControl(Composite parent) {
        cookbookModel.addCookbookChangeListener(this);

        ViewForm viewForm = new ViewForm(parent, SWT.NONE);
        viewForm.setLayout(new FillLayout());

        graphViewer = new GraphViewer(viewForm, SWT.NONE);

        graphViewer.setContentProvider(new CookbookViewerContentProvider());
        graphViewer.setLabelProvider(new CookbookViewerLabelProvider(this));
        graphViewer.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
        TreeLayoutAlgorithm treeLayoutAlgorithm = new TreeLayoutAlgorithm(
                TreeLayoutAlgorithm.LEFT_RIGHT, new Dimension(250, 150));
        graphViewer.setLayoutAlgorithm(treeLayoutAlgorithm, true);
        currentLayoutAlgorithm = treeLayoutAlgorithm;
        IResource resource = ((CookbookGraphEditorInput) input).getResource();
        cookbookModel.setResource(resource);
        graph = graphViewer.getGraphControl();
        createToolbar(viewForm);
        hookMenu(graph);
        viewForm.setContent(graph);
    }

    private void createToolbar(ViewForm viewFrom)
    {
        ToolBar toolBar = new ToolBar(viewFrom, SWT.FLAT);
        ToolBarManager toolBarManager =new ToolBarManager(toolBar);
        toolBarManager.add(new CookbookGraphLayoutAction());
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

        IStructuredSelection selection = (IStructuredSelection) graphViewer
                .getSelection();
        if (selection != null) {
            Object selected = selection.getFirstElement();
        }
    }

    @Override
    public void setFocus() {


    }

    @Override
    public void cookbookChanged() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                synchronized (this) {
                    DrawableCookbook rootCookbook = cookbookModel
                            .getDrawableCookbook();
                    graphViewer.setInput(rootCookbook);
                }
            }
        });
    }

    @Override
    public void dispose() {
        cookbookModel.removeCookbookChangeListener(this);
        cookbookModel.dispose();
        super.dispose();
    }

    static class CookbookViewerContentProvider implements
            IGraphEntityContentProvider,INestedContentProvider {

        public Object[] getConnectedTo(Object entity) {
            if (entity instanceof DrawableCookbook) {
                DrawableCookbook root = (DrawableCookbook) entity;
                return root.getDirectElements();
            }  else if (entity instanceof DrawableFolder)
            {
                DrawableFolder drawableFolder = (DrawableFolder) entity;
                return drawableFolder.getElements();
            }
            else if (entity instanceof ICookbookElement) {
                return null;

            } else if (entity instanceof DrawableElement) {
                return null;
            }

            // throw new
            // RuntimeException("Type not supported:"+entity.getClass());
            logger.debug("Type not supported: {}", entity.getClass());
            return null;
        }

        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {


        }

        public Object[] getElements(Object inputElement) {

            DrawableCookbook drawableCookbook = (DrawableCookbook) inputElement;
            return drawableCookbook.getElements();
        }

        @Override
        public void dispose() {


        }

        @Override
        public boolean hasChildren(Object element) {
            if(element instanceof DrawableContainer)
            {
                return true;
            }
            return false;
        }

        @Override
        public Object[] getChildren(Object element) {
            if(element instanceof DrawableContainer)
            {
                Object[] objects = ((DrawableContainer)element).getElements();
                if(objects.length>0)
                {
                    return objects;
                }
            }
            return null;
        }
    }

    public LayoutAlgorithm getLayoutAlgorithm()
    {
        return this.currentLayoutAlgorithm;
    }

    static class CookbookViewerLabelProvider extends LabelProvider implements
            ISelfStyleProvider, IFigureProvider {

        Image attributeImage = ImageLoader.Load("methpub_obj.gif");
        CookbookGraphEditor editor;
        public CookbookViewerLabelProvider(CookbookGraphEditor editor) {
            this.editor=editor;
        }

        public String getText(Object element) {
            if(element instanceof DrawableContainer)
            {
                return ((DrawableContainer)element).getName();
            }
            if (element instanceof ICookbookElement) {
                return ((ICookbookElement) element).getName();
            }
            if (element instanceof NamedObject) {
                return ((NamedObject) element).getName();
            }
            return null;
        }

        public Image getImage(Object element) {
            if (element instanceof ICookbookElement) {
                return attributeImage;
            }
            return null;
        }

        @Override
        public void selfStyleConnection(Object element,
                GraphConnection connection) {
            connection.setLineColor(Display.getDefault().getSystemColor(
                    SWT.COLOR_DARK_BLUE));
            ManhattanConnectionRouter router = new ManhattanConnectionRouter();
            Connection c = connection.getConnectionFigure();
            connection.setRouter(router);

            if(editor.getLayoutAlgorithm().getClass()==TreeLayoutAlgorithm.class)
            {
                ConnectionAnchor s = new ChefclipseConnectionAnchor(c
                        .getSourceAnchor().getOwner());
                ConnectionAnchor t = new ChefclipseConnectionAnchor(c
                        .getTargetAnchor().getOwner());
                c.setLocation(s.getReferencePoint());
                c.setSourceAnchor(s);
                c.setTargetAnchor(t);
            }
        }

        @Override
        public void selfStyleNode(Object element, GraphNode node) {

            if(element instanceof DrawableContainer)
            {
                GraphContainer graphContainer = (GraphContainer)node;
                DrawableContainer container = (DrawableContainer)element;

                if(container.getElements().length>0)
                {
                    graphContainer.open(false);
                    CompositeLayoutAlgorithm compositeLayoutAlgorithm = new CompositeLayoutAlgorithm(
                            new LayoutAlgorithm[] { new GridLayoutAlgorithm(),
                                    new HorizontalShiftAlgorithm() });
                    graphContainer.setLayoutAlgorithm(compositeLayoutAlgorithm, false);
                }
            }
            else if(element instanceof DrawableCookbook)
            {}
            else if(element instanceof DrawableFolder)
            {}
            else
            {
                //files in container
            }
        }

        @Override
        public IFigure getFigure(Object element) {
            if (element instanceof DrawableCookbook) {
                CookbookVersion c = (CookbookVersion) ((DrawableCookbook) element)
                        .getCookbook();
                ;
                return new CookbookFigure(c.getName(), c.getMetadata()
                        .getVersion(), c.getCatalog());
            } else if (element instanceof DrawableFolder) {
                return new FolderFigure((DrawableFolder) element);
            } else if (element instanceof ICookbookElement) {
                return new CookbookElementFigure((ICookbookElement) element);
            }
            return null;
        }
    }

    class CookbookGraphLayoutAction extends Action
    {
        public CookbookGraphLayoutAction() {
            this.setToolTipText("Change Cookbook Structure Graph Layout");
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
                        TreeLayoutAlgorithm.LEFT_RIGHT, new Dimension(250, 150));
            }
            graphViewer.setLayoutAlgorithm(currentLayoutAlgorithm);
            cookbookModel.notifyCookbookChanged();
        }
    }
}
