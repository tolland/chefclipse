package org.limepepper.chefclipse.chefserver.api.ui.editors;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.part.EditorPart;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.chefserver.provider.ChefserverItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.ui.providers.ChefProjectAdapterFactory;
import org.limepepper.chefclipse.common.workstation.provider.WorkstationItemProviderAdapterFactory;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.provider.ChefclipseItemProviderAdapterFactory;
import org.limepepper.chefclipse.tools.EMFUtils;

public class RunListEditor extends EditorPart {

    public static final String ID = "org.limepepper.chefclipse.chefserver.api.ui.editors.RunListEditor"; //$NON-NLS-1$
    KnifeConfigController      configController = KnifeConfigController.INSTANCE;
    private ComposedAdapterFactory adapterFactory;
    private ChefServerApi api;
    private Node selectedNode;
    private ServerCookbookVersion selectedServerCookbook;
    private EList<RunListItem> runListItemList;
    private EList<ServerCookbookFile> serverCookbookRecipes;
    private TableViewer nodeTableviewer;
    private Table nodeTable;
    private TableViewer runlistTableViewer;
    private Table runlistTable;
    private TableViewer serverCookbookTableviewer;
    private Table serverCookbookTable;
    private TableViewer recipeTableviewer;
    private Table recipeTable;
    private RunListEditorInput input;

    public RunListEditor() {
        initialize();
    }

    public void initialize()
    {
        adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(new ChefclipseItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ChefserverItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new WorkstationItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    }

    /**
     * Create contents of the editor part.
     * @param parent
     */
    @Override
    public void createPartControl(final Composite parent) {
        FormToolkit toolkit = new FormToolkit(parent.getDisplay());
        ScrolledForm form = toolkit.createScrolledForm(parent);
        ToolBarManager manager = (ToolBarManager) form.getToolBarManager();
        toolkit.decorateFormHeading(form.getForm());
        IMenuService menuService = (IMenuService) getSite().getService(
                IMenuService.class);
        menuService.populateContributionManager(manager, "popup:formsToolBar");
        manager.update(true);

        form.setText("Edit Runlist");

        // Lets make a layout for the first section of the screen
        GridLayout scrolledformLayout = new GridLayout();
        scrolledformLayout.numColumns = 2;
        scrolledformLayout.marginWidth = 5;
        scrolledformLayout.marginHeight = 5;

        Composite body = form.getBody();
        body.setLayout(scrolledformLayout);

        // Creating the node section
        Section nodeSection = toolkit.createSection(body, Section.DESCRIPTION
                | Section.TITLE_BAR);
        nodeSection.setText("Nodes"); //$NON-NLS-1$
        nodeSection.setDescription("Select the node");
        GridData griddata = new GridData();
        griddata.heightHint = 300;
        griddata.widthHint = 400;
        nodeSection.setLayoutData(griddata);

        Composite client = toolkit.createComposite(nodeSection, SWT.WRAP);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        nodeTable = toolkit.createTable(client, SWT.NULL);
        griddata = new GridData(GridData.FILL_BOTH);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        nodeTable.setLayoutData(griddata);
        toolkit.paintBordersFor(client);
        nodeSection.setClient(client);
        nodeTableviewer = new TableViewer(nodeTable);

        nodeTableviewer.setContentProvider(new NodeContentProvider());
        nodeTableviewer.setLabelProvider(new NodeLabelProvider());
        nodeTableviewer.setInput(api.getNodes());
        nodeTableviewer.addSelectionChangedListener(nodeTableviewer_SelectionChangedListener);

        // Creating the server cookbook section
        Section serverCookbookSection = toolkit.createSection(body, Section.DESCRIPTION
                | Section.TITLE_BAR);
        serverCookbookSection.setText("Server Cookbooks"); //$NON-NLS-1$
        serverCookbookSection.setDescription("Select server cookbook");
        griddata = new GridData();
        griddata.heightHint = 300;
        griddata.widthHint = 400;
        serverCookbookSection.setLayoutData(griddata);

        // Composite for storing the data
        client = toolkit.createComposite(serverCookbookSection, SWT.WRAP);
        layout = new GridLayout();
        layout.numColumns = 1;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        serverCookbookTable = toolkit.createTable(client, SWT.NULL);
        griddata = new GridData(GridData.FILL_BOTH);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        serverCookbookTable.setLayoutData(griddata);
        toolkit.paintBordersFor(client);
        serverCookbookSection.setClient(client);
        serverCookbookTableviewer = new TableViewer(serverCookbookTable);

        serverCookbookTableviewer.setContentProvider(new ServerCookbookContentProvider());
        serverCookbookTableviewer.setLabelProvider(new ServerCookbookLabelProvider());
        serverCookbookTableviewer.setInput(api.getCookbooks());
        serverCookbookTableviewer.addSelectionChangedListener(serverCookbookTableviewer_SelectionChangedListener);

        // Creating the runlist section
        Section runlistSection = toolkit.createSection(body, Section.DESCRIPTION
                | Section.TITLE_BAR);
        runlistSection.setText("RunList"); //$NON-NLS-1$
        runlistSection.setDescription("Edit RunList of current node");
        griddata = new GridData();
        griddata.heightHint = 300;
        griddata.widthHint = 400;
        runlistSection.setLayoutData(griddata);

        // Composite for storing the data
        client = toolkit.createComposite(runlistSection, SWT.WRAP);
        layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        runlistTable = toolkit.createTable(client, SWT.NULL);
        griddata = new GridData(GridData.FILL_BOTH);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        runlistTable.setLayoutData(griddata);
        toolkit.paintBordersFor(client);

        //button sets
        Composite buttonComsite=new Composite(client,SWT.WRAP);
        layout = new GridLayout();
        layout.numColumns = 1;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        buttonComsite.setLayout(layout);
        griddata = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        buttonComsite.setLayoutData(griddata);

        Button	b = toolkit.createButton(buttonComsite, "Up", SWT.PUSH); //$NON-NLS-1$
        griddata = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        b.setLayoutData(griddata);
        b = toolkit.createButton(buttonComsite, "Down", SWT.PUSH); //$NON-NLS-1$
        griddata = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        b.setLayoutData(griddata);
        b = toolkit.createButton(buttonComsite, "Remove", SWT.PUSH); //$NON-NLS-1$
        griddata = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        b.setLayoutData(griddata);
        runlistSection.setClient(client);
        runlistTableViewer = new TableViewer(runlistTable);
        runlistTableViewer.setContentProvider(new ArrayContentProvider());
        // Creating the recipe section
        Section recipeSection = toolkit.createSection(body, Section.DESCRIPTION
                | Section.TITLE_BAR);
        recipeSection.setText("Recipes"); //$NON-NLS-1$
        recipeSection.setDescription("Add recipes to RunList");
        griddata = new GridData();
        griddata.heightHint = 300;
        griddata.widthHint = 400;
        recipeSection.setLayoutData(griddata);


        client = toolkit.createComposite(recipeSection, SWT.WRAP);
        layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        client.setLayout(layout);
        recipeTable = toolkit.createTable(client, SWT.NULL);
        griddata = new GridData(GridData.FILL_BOTH);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        recipeTable.setLayoutData(griddata);
        toolkit.paintBordersFor(client);
        b = toolkit.createButton(client, "Add", SWT.PUSH); //$NON-NLS-1$
        griddata = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        griddata.heightHint = 20;
        griddata.widthHint = 100;
        b.setLayoutData(griddata);
        recipeSection.setClient(client);
        recipeTableviewer = new TableViewer(recipeTable);
        recipeTableviewer.setLabelProvider(new RecipeLabelProvider());
        recipeTableviewer.setContentProvider(new RecipeContentProvider());
    }

    @Override
    public void setFocus() {
        // Set the focus
    }

    @Override
    public void doSave(final IProgressMonitor monitor) {
        // Do the Save operation
    }

    @Override
    public void doSaveAs() {
        // Do the Save As operation
    }

    @Override
    public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
        if (!(input instanceof RunListEditorInput)) {
            throw new RuntimeException("Wrong input");
        }
        setSite(site);
        setInput(input);

        RunListEditorInput runListInput = (RunListEditorInput) input;
        IResource project = EMFUtils.getIFileFromEObject(runListInput.selectedNode);
        KnifeConfig config = ChefConfigManager.instance().retrieveProjectChefConfig(project);
        api = configController.getServer(config);
        this.input = runListInput;
    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }


    ISelectionChangedListener nodeTableviewer_SelectionChangedListener =new ISelectionChangedListener()
    {

        @Override
        public void selectionChanged(final SelectionChangedEvent event) {
            IStructuredSelection selection = (IStructuredSelection) nodeTableviewer
                    .getSelection();
            if (selection != null) {
                Node node = (Node)selection.getFirstElement();
                selectedNode=node;
                RunList runlist = selectedNode.getRun_list();
                runListItemList = runlist.getRun_list_items();
                runlistTableViewer.setInput(runListItemList);
            }
        }

    };

    ISelectionChangedListener serverCookbookTableviewer_SelectionChangedListener=new ISelectionChangedListener()
    {

        @Override
        public void selectionChanged(final SelectionChangedEvent event) {
            IStructuredSelection selection = (IStructuredSelection) serverCookbookTableviewer
                    .getSelection();
            if (selection != null) {
                ServerCookbookVersion serverCookbook = (ServerCookbookVersion)selection.getFirstElement();
                selectedServerCookbook=serverCookbook;
                serverCookbookRecipes = selectedServerCookbook.getRecipes();
                recipeTableviewer.setInput(serverCookbookRecipes);
            }
        }

    };


    class NodeLabelProvider extends AdapterFactoryLabelProvider {

        public NodeLabelProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public String getText(final Object element) {

            return super.getText(element);
        }

        @Override
        public String getColumnText(final Object obj, final int index) {
            return getText(obj);
        }

        @Override
        public Image getColumnImage(final Object obj, final int index) {
            return getImage(obj);
        }
        @Override
        public Image getImage(final Object obj) {
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
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        @Override
        public Object[] getElements(final Object inputElement) {
            List<Node> nodes = (List<Node>)inputElement;
            return nodes.toArray(new Node[nodes.size()]);
        }
    }

    class ServerCookbookLabelProvider extends AdapterFactoryLabelProvider {

        @Override
        public Color getBackground(final Object object, final int columnIndex) {
            // TODO Auto-generated method stub
            return super.getBackground(object, columnIndex);
        }

        public ServerCookbookLabelProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public String getText(final Object element) {

            return super.getText(element);
        }

        @Override
        public String getColumnText(final Object obj, final int index) {
            return getText(obj);
        }

        @Override
        public Image getColumnImage(final Object obj, final int index) {
            return getImage(obj);
        }
        @Override
        public Image getImage(final Object obj) {
            return PlatformUI.getWorkbench().getSharedImages()
                    .getImage(ISharedImages.IMG_OBJ_ELEMENT);
        }
    }

    class ServerCookbookContentProvider extends AdapterFactoryContentProvider {
        ServerCookbookContentProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        @Override
        public Object[] getElements(final Object inputElement) {
            List<ServerCookbookVersion> serverCookbooks = (List<ServerCookbookVersion>)inputElement;
            return serverCookbooks.toArray(new ServerCookbookVersion[serverCookbooks.size()]);
        }
    }


    class RunListLabelProvider extends AdapterFactoryLabelProvider {

        public RunListLabelProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public String getText(final Object element) {

            return super.getText(element);
        }

        @Override
        public String getColumnText(final Object obj, final int index) {
            return getText(obj);
        }

        @Override
        public Image getColumnImage(final Object obj, final int index) {
            return getImage(obj);
        }
        @Override
        public Image getImage(final Object obj) {
            return PlatformUI.getWorkbench().getSharedImages()
                    .getImage(ISharedImages.IMG_OBJ_ELEMENT);
        }
    }

    class RunListContentProvider extends AdapterFactoryContentProvider {
        RunListContentProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        @Override
        public Object[] getElements(final Object inputElement) {
            List<RunListItem> runlistItemList = (List<RunListItem>)inputElement;
            return runlistItemList.toArray(new RunListItem[runlistItemList.size()]);
        }
    }

    class RecipeLabelProvider extends AdapterFactoryLabelProvider {

        public RecipeLabelProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public String getText(final Object element) {

            return super.getText(element);
        }

        @Override
        public String getColumnText(final Object obj, final int index) {
            return getText(obj);
        }

        @Override
        public Image getColumnImage(final Object obj, final int index) {
            return getImage(obj);
        }
        @Override
        public Image getImage(final Object obj) {
            return PlatformUI.getWorkbench().getSharedImages()
                    .getImage(ISharedImages.IMG_OBJ_ELEMENT);
        }
    }

    class RecipeContentProvider extends AdapterFactoryContentProvider {
        RecipeContentProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        @Override
        public Object[] getElements(final Object inputElement) {
            List<ServerCookbookFile> recipeList = (List<ServerCookbookFile>)inputElement;
            return recipeList.toArray(new ServerCookbookFile[recipeList.size()]);
        }
    }

}
