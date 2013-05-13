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
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.EditorPart;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.databag.editor.Activator;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.EditJsonValueOfDataBagItemAction;
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
    private Action editValueAction;

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

    private void createToolBar(Composite bar) {
        final ToolBar toolBar = new ToolBar(bar, SWT.NONE);
        ToolBarManager manager = new ToolBarManager(toolBar);

        ViewerProvider viewerProvider = new ViewerProvider();
        addCommonActions(manager, viewerProvider);
        manager.update(true);
    }

    private void addCommonActions(ToolBarManager manager, ViewerProvider viewerProvider) {
        setAddNewDataBagItemAction(new AddNewDataBagItemAction(viewerProvider));
        setRemovePropertyAction(new RemoveJsonPropertyAction(viewerProvider));
        setEditValueAction(new EditJsonValueOfDataBagItemAction(viewerProvider));

        manager.add(getAddNewDataBagItemAction());
        manager.add(getRemovePropertyAction());
        manager.add(getEditValueAction());
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
        viewer = doCreateViewer(parent);
        viewer.setContentProvider(new DataBagContentProvider(nodesMap));
        viewer.setLabelProvider(new DataBagLabelProvider(nodesMap));
        viewer.setInput(allFieldsNode);
        GridLayoutFactory.swtDefaults().equalWidth(false).applyTo(viewer.getTree());
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true)
                .applyTo(viewer.getTree());
    }

    private TreeViewer doCreateViewer(Composite parent) {
        final FilteredTree filter = new FilteredTree(parent, SWT.H_SCROLL | SWT.V_SCROLL
                | SWT.BORDER | SWT.FULL_SELECTION, new PatternFilter(), true) {

            @Override
            protected Composite createFilterControls(Composite parent) {
                final Composite bar = new Composite(parent, SWT.NULL);
                bar.setLayout(new GridLayout(4, false));
                // new Label(bar, SWT.NULL).setText("Filter:");
                // addAditionalActions(bar);
                final Composite createFilterControls = super.createFilterControls(bar);
                createToolBar(bar);
                createFilterControls.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                return bar;
            }
        };

        final TreeViewer viewer = filter.getViewer();
        viewer.setUseHashlookup(true);
        viewer.getTree().setHeaderVisible(true);
        viewer.getTree().setLinesVisible(true);
        // viewer.setSorter(new NameSorter());

        TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(viewer,
                new FocusCellOwnerDrawHighlighter(viewer));
        ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(
                viewer) {

            protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
                return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
                        || event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
                        || (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
                        || event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC
                        || (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.F2);
            }
        };

        TreeViewerEditor.create(viewer, focusCellManager, actSupport,
                ColumnViewerEditor.TABBING_HORIZONTAL
                        | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
                        | ColumnViewerEditor.TABBING_VERTICAL
                        | ColumnViewerEditor.KEYBOARD_ACTIVATION);

        final TextCellEditor textCellEditor = new TextCellEditor(viewer.getTree());

        TreeViewerColumn objectColumn = new TreeViewerColumn(viewer, SWT.LEFT);
        objectColumn.getColumn().setAlignment(SWT.LEFT);
        objectColumn.getColumn().setText("Field name");
        objectColumn.getColumn().setWidth(230);
        objectColumn.setEditingSupport(new FieldEditingSupport(viewer,
                textCellEditor));
        // objectColumn.setLabelProvider(new MetadataCellLabelProvider());
        // TableColumnLayout columnLayout = new TableColumnLayout();
        // columnLayout.setColumnData(objectColumn.getColumn(), new
        // ColumnWeightData(200, 150, true));

        if (dataBagEObject instanceof DataBag) {
            createColumns(viewer, nodesMap);
        } else { // it's a databagitem
            TreeViewerColumn valueColumn = new TreeViewerColumn(viewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText("Value");
            valueColumn.getColumn().setWidth(300);
            valueColumn.getColumn().setImage(
                    Activator.getDefault().getImageRegistry()
                            .getDescriptor(Activator.DATA_BAG_ICON).createImage());
            // valueColumn.setEditingSupport(new ValueEditingSupport(viewer,
            // textCellEditor));
            // columnLayout.setColumnData(valueColumn.getColumn(),
            // new ColumnWeightData(150, 150, true));
            // valueColumn.setLabelProvider(new MetadataValueLabelProvider());
        }
        // viewer.getTree().setLayout(columnLayout);
        return viewer;
    }

    private void createColumns(TreeViewer treeViewer, Map<String, JsonNode> nodesMap) {
        // final TextCellEditor textCellEditor = new
        // TextCellEditor(treeViewer.getTree());
        // int columnWeight = 140;
        // TableColumnLayout columnLayout = new TableColumnLayout();
        for (String columnName : nodesMap.keySet()) {
            TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText(columnName);
            valueColumn.getColumn().setWidth(180);
            valueColumn.getColumn().setImage(
                    Activator.getDefault().getImageRegistry()
                            .getDescriptor(Activator.DATA_BAG_ICON).createImage());
            // valueColumn.setEditingSupport(new ValueEditingSupport(treeViewer,
            // textCellEditor));
            // columnLayout.setColumnData(valueColumn.getColumn(), new
            // ColumnWeightData(
            // --columnWeight, 150, true));
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

    public Action getEditValueAction() {
        return editValueAction;
    }

    public void setEditValueAction(Action editValueAction) {
        this.editValueAction = editValueAction;
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
    }
}
