/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.util.EventObject;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.EditorPart;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.databag.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.editing.FieldEditingSupport;

/**
 * @author Sebastian Sampaoli
 */
public class DataBagColumnEditor extends EditorPart implements CommandStackListener,
        IResourceChangeListener {

    private EObject dataBagEObject;
    private TreeViewer viewer;
    private Map<String, JsonNode> nodesMap;
    private JsonNode allFieldsNode;
    private Action addNewDataBagItemAction;
    private Action removePropertyAction;
    private Action addJsonPropertyAction;
    private Action removeDataBagItemAction;
    private CommandStack commandStack;
    private Composite filterControl;

    /**
     * 
     */
    public DataBagColumnEditor(Map<String, JsonNode> nodesMap) {
        this.nodesMap = nodesMap;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
     */
    @Override
    public void doSaveAs() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite,
     * org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        if (!(input instanceof DataBagEditorInput))
            throw new PartInitException("Invalid Input: Must be DataBagEditorInput");
        setSite(site);
        setInput(input);
        setPartName(input.getName());
        setCommandStack(new CommandStack());
        getCommandStack().addCommandStackListener(this);
        dataBagEObject = ((DataBagEditorInput) input).geteObject();
        try {
            allFieldsNode = DataBagEditorManager.INSTANCE.createAllFieldsNode(nodesMap);
        } catch (Exception e) {
            // TODO log the exception and present some error dialog: some file
            // could not be parsed.
            MessageDialog.open(MessageDialog.ERROR, getSite().getShell(),
                    "Error while trying to load JSON file", e.getMessage(), SWT.NONE);
            ObjectMapper mapper = new ObjectMapper();
            allFieldsNode = mapper.createObjectNode();
        }
    }

    private void createKeysToolBar(Composite bar) {
        final ToolBar toolBar = new ToolBar(bar, SWT.VERTICAL);
        ToolBarManager manager = new ToolBarManager(toolBar);

        ViewerProvider viewerProvider = new ViewerProvider();
        addKeysRelatedActions(manager, viewerProvider);
        manager.update(true);
    }
    
    private void createDataBagItemsToolBar(Composite bar) {
        final ToolBar toolBar = new ToolBar(bar, SWT.HORIZONTAL);
        GridDataFactory.fillDefaults().align(SWT.END, SWT.BEGINNING).grab(false, false).applyTo(toolBar);
        ToolBarManager manager = new ToolBarManager(toolBar);

        ViewerProvider viewerProvider = new ViewerProvider();
        addDataBagItemsRelatedActions(manager, viewerProvider);
        manager.update(true);
    }

    private void addKeysRelatedActions(ToolBarManager manager, ViewerProvider viewerProvider) {
        setAddJsonPropertyAction(new AddJsonPropertyAction(viewerProvider, nodesMap));
        setRemovePropertyAction(new RemoveJsonPropertyAction(viewerProvider));

        manager.add(getAddJsonPropertyAction());
        manager.add(getRemovePropertyAction());
    }
    
    private void addDataBagItemsRelatedActions(ToolBarManager manager, ViewerProvider viewerProvider) {
        setAddNewDataBagItemAction(new AddNewDataBagItemAction(viewerProvider, nodesMap));
        setRemoveDataBagItemAction(new RemoveDataBagItemAction(viewerProvider));

        manager.add(getAddNewDataBagItemAction());
        manager.add(getRemoveDataBagItemAction());
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isDirty()
     */
    @Override
    public boolean isDirty() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    @Override
    public boolean isSaveAsAllowed() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
//        Group editorGroup = new Group(parent, SWT.NONE);
//        GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false).applyTo(editorGroup);
//        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(editorGroup);
        viewer = doCreateViewer(parent);
        viewer.setContentProvider(new DataBagContentProvider(nodesMap));
//        viewer.setLabelProvider(new DataBagValueLabelProvider(nodesMap));
        viewer.setInput(allFieldsNode);
        GridLayoutFactory.swtDefaults().equalWidth(false).applyTo(viewer.getTree());
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true)
                .applyTo(viewer.getTree());
    }

    private TreeViewer doCreateViewer(Composite parent) {
        final Composite bar = new Composite(parent, SWT.NULL);
        GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false).margins(0, 0).spacing(0, 0).applyTo(parent);
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).indent(0, 0).applyTo(parent);
        GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BEGINNING).indent(0, 37).grab(false, true).applyTo(bar);
        createKeysToolBar(bar);
        
        final FilteredTree filter = new FilteredTree(parent, SWT.H_SCROLL | SWT.V_SCROLL
                | SWT.BORDER | SWT.FULL_SELECTION, new PatternFilter(), true) {

            @Override
            protected Composite createFilterControls(Composite parent) {
                final Composite bar = new Composite(parent, SWT.NULL);
                GridLayoutFactory.swtDefaults().numColumns(3).equalWidth(false).margins(0, 0).spacing(0, 0).applyTo(bar);
//                bar.setLayout(new GridLayout(3, false));
                GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).indent(0, 2).grab(true, false).applyTo(bar);
                // new Label(bar, SWT.NULL).setText("Filter:");
                // addAditionalActions(bar);
                setFilterControl(super.createFilterControls(bar));
//                getFilterControl().setSize(f, height)
                GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BEGINNING).indent(0, 0).hint(140, 20).grab(false, false).applyTo(getFilterControl());
//                createFilterControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                Label emptyLabel = new Label(bar, SWT.NONE);
                GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).indent(0, 0).grab(true, false).applyTo(emptyLabel);
                createDataBagItemsToolBar(bar);
                return bar;
                
//                final Composite filterParent = new Composite(parent, SWT.NULL);
//                filterParent.setLayout(new GridLayout(2, false));
                // new Label(bar, SWT.NULL).setText("Filter:");
                // addAditionalActions(bar);
//                final Composite createFilterControls = super.createFilterControls(filterParent);
//                createToolBar(bar);
//                GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.FILL).grab(false, false).applyTo(createFilterControls);
//                createFilterControls.setLayoutData(new GridData(GridData.BEGINNING));
//                return filterParent;
            }

        };
        GridLayoutFactory.swtDefaults().margins(0, 0).spacing(0, 1).applyTo(filter);
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).indent(2, 0).grab(true, true).applyTo(filter);
        
        final TreeViewer treeViewer = filter.getViewer();
        treeViewer.setUseHashlookup(true);
        treeViewer.getTree().setHeaderVisible(true);
        treeViewer.getTree().setLinesVisible(true);
        // viewer.setSorter(new NameSorter());

        TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(treeViewer,
                new FocusCellOwnerDrawHighlighter(treeViewer));
        ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(
                treeViewer) {

            protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
                return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
                        || event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
                        || (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
                        || event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC
                        || (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.F2);
            }
        };

        TreeViewerEditor.create(treeViewer, focusCellManager, actSupport,
                ColumnViewerEditor.TABBING_HORIZONTAL
                        | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
                        | ColumnViewerEditor.TABBING_VERTICAL
                        | ColumnViewerEditor.KEYBOARD_ACTIVATION);

        final TextCellEditor textCellEditor = new TextCellEditor(treeViewer.getTree());

        final TreeViewerColumn fieldColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
        fieldColumn.getColumn().setAlignment(SWT.LEFT);
        fieldColumn.getColumn().setText("Field name");
        fieldColumn.getColumn().setWidth(150);
        fieldColumn.setEditingSupport(new FieldEditingSupport(treeViewer,
                textCellEditor));
        fieldColumn.setLabelProvider(new DataBagLabelProvider(nodesMap));
//        fieldColumn.getColumn().addListener(SWT.Resize, new Listener() {
//
//            @Override
//            public void handleEvent(Event event) {
//                filterControl.setSize(fieldColumn.getColumn().getWidth(), filterControl.getSize().y);
//            }
//            
//        });
        filterControl.setSize(fieldColumn.getColumn().getWidth(), filterControl.getSize().y);
        
        TreeColumnLayout treeLayout = new TreeColumnLayout();
//        GridLayoutFactory.swtDefaults().margins(0, 0).spacing(0, 0).applyTo(treeViewer.getTree());
        treeViewer.getTree().setLayout(treeLayout);
//        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).indent(0, 6).grab(true, true).applyTo(treeViewer.getTree());
        
        treeLayout.setColumnData(fieldColumn.getColumn(), new
                ColumnWeightData(40, 150));

        if (dataBagEObject instanceof DataBag) {
            createColumns(treeViewer, nodesMap, treeLayout);
        } else { // it's a databagitem
            TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText("Value");
            valueColumn.getColumn().setWidth(150);
            // valueColumn.setEditingSupport(new ValueEditingSupport(viewer,
            // textCellEditor));
            treeLayout.setColumnData(valueColumn.getColumn(),
                    new ColumnWeightData(30, 150));
            valueColumn.setLabelProvider(new DataBagLabelProvider(nodesMap));
        }
        return treeViewer;
    }

    private void createColumns(TreeViewer treeViewer, Map<String, JsonNode> nodesMap,
            TreeColumnLayout columnLayout) {
        // final TextCellEditor textCellEditor = new
        // TextCellEditor(treeViewer.getTree());
        int columnWeight = 20;
        for (String columnName : nodesMap.keySet()) {
            TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText("Data bag item: " + columnName);
            valueColumn.getColumn().setWidth(150);
            // valueColumn.setEditingSupport(new ValueEditingSupport(treeViewer,
            // textCellEditor));
            valueColumn.setLabelProvider(new DataBagLabelProvider(nodesMap));
            columnLayout.setColumnData(valueColumn.getColumn(), new
                    ColumnWeightData(
                            --columnWeight, 150));
        }
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {

    }

    @Override
    public void commandStackChanged(EventObject event) {

    }

    public Action getAddNewDataBagItemAction() {
        return addNewDataBagItemAction;
    }

    public void setAddNewDataBagItemAction(Action addNewDataBagItemAction) {
        this.addNewDataBagItemAction = addNewDataBagItemAction;
    }

    public Action getRemovePropertyAction() {
        return removePropertyAction;
    }

    public void setRemovePropertyAction(Action removePropertyAction) {
        this.removePropertyAction = removePropertyAction;
    }

    public CommandStack getCommandStack() {
        return commandStack;
    }

    public void setCommandStack(CommandStack commandStack) {
        this.commandStack = commandStack;
    }

    private void setFilterControl(Composite filterControl) {
        this.filterControl = filterControl;
    }

    public Action getAddJsonPropertyAction() {
        return addJsonPropertyAction;
    }

    public void setAddJsonPropertyAction(Action addJsonPropertyAction) {
        this.addJsonPropertyAction = addJsonPropertyAction;
    }

    public Action getRemoveDataBagItemAction() {
        return removeDataBagItemAction;
    }

    public void setRemoveDataBagItemAction(Action removeDataBagItemAction) {
        this.removeDataBagItemAction = removeDataBagItemAction;
    }

    // private class NameSorter extends ViewerSorter {
    //
    // @Override
    // public int compare(Viewer viewer, Object e1, Object e2) {
    //
    // }
    // }
    public class ViewerProvider {

        public TreeViewer getViewer() {
            return viewer;
        }

        public Entry<String, JsonNode> getItemSelected() {
            // IStructuredSelection selection = (IStructuredSelection)
            // getViewer().getSelection();
            return null;
        }
        
        public CommandStack getCommandStack() {
            return commandStack;
        }
    }
}
