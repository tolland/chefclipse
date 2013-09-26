/**
 * 
 */

package org.limepepper.chefclipse.structured.json.editor.editors;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.limepepper.chefclipse.json.json.Model;
import org.limepepper.chefclipse.json.json.provider.JsonItemProviderAdapterFactory;
import org.limepepper.chefclipse.structured.json.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.structured.json.editor.actions.RemoveJsonFileAction;
import org.limepepper.chefclipse.structured.json.editor.actions.RemoveJsonPropertyAction;
import org.limepepper.chefclipse.structured.json.editor.editing.FieldEditingSupport;
import org.limepepper.chefclipse.structured.json.editor.editing.ValueEditingSupport;

import com.google.inject.Provider;

/**
 * Column editor for editing JSON files.
 * 
 * @author Sebastian Sampaoli
 */
public class StructuredColumnJsonEditor extends EditorPart implements
        IResourceChangeListener, IEditingDomainProvider, ISelectionProvider, IMenuListener,
        IViewerProvider, IGotoMarker, IPageChangedListener {

    private TreeViewer viewer;
    private Composite filterControl;
    private JsonFileActionContributor actionContributor;

    /**
     * This keeps track of the editing domain that is used to track all changes
     * to the model.
     */
    protected AdapterFactoryEditingDomain editingDomain;

    private ComposedAdapterFactory adapterFactory;

    /**
     * This is the content outline page.
     */
    protected IContentOutlinePage contentOutlinePage;

    protected IStatusLineManager contentOutlineStatusLineManager;

    /**
     * This is the content outline page's viewer.
     */
    protected TreeViewer contentOutlineViewer;

    /**
     * Resources that have been removed since last activation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<Resource> removedResources = new ArrayList<Resource>();

    /**
     * Resources that have been changed since last activation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<Resource> changedResources = new ArrayList<Resource>();

    /**
     * Resources that have been saved. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    protected Collection<Resource> savedResources = new ArrayList<Resource>();

    /**
     * This keeps track of the selection of the editor as a whole. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ISelection editorSelection = StructuredSelection.EMPTY;

    private List<ISelectionChangedListener> selectionChangedListeners;
    private TreeViewerFocusCellManager focusCellManager;
    private List<URI> columnsToUris = new ArrayList<URI>();
    private boolean shouldUpdate;
    private Notification pendingNotification;
    private MultiPageStructuredJsonEditor multiPageStructuredJsonEditor;
	private List<IFile> jsonFiles;

    /**
     * @param resourceFactory
     * @param jsonFileActionContributor
     * @param resourceSetProvider 
     * @param multiPageStructuredJsonEditor
     */
    public StructuredColumnJsonEditor(JsonFileActionContributor jsonFileActionContributor,
            Provider<XtextResourceSet> resourceSetProvider, MultiPageStructuredJsonEditor multiPageStructuredJsonEditor) {
        this.multiPageStructuredJsonEditor = multiPageStructuredJsonEditor;
        this.actionContributor = jsonFileActionContributor;
        this.selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
        initializeEditingDomain(resourceSetProvider.get());
    }

    /**
     * This sets up the editing domain for the model editor. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param xtextResourceSet 
     * 
     * @generated
     */
    protected void initializeEditingDomain(XtextResourceSet resourceSet) {
        // Create an adapter factory that yields item providers.
        //
        adapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new JsonItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

        // Create the command stack that will notify this editor as commands are
        // executed.
        //
        BasicCommandStack commandStack = new BasicCommandStack();
/*
        // Add a listener to set the most recent command's affected objects to
        // be the selection of the viewer with focus.
        //
        commandStack.addCommandStackListener
                (new CommandStackListener() {
                    public void commandStackChanged(final EventObject event) {
                        getEditorSite().getShell().getDisplay().asyncExec
                                (new Runnable() {
                                    public void run() {
                                        firePropertyChange(IEditorPart.PROP_DIRTY);

                                        // Try to select the affected objects.
                                        //
                                        Command mostRecentCommand = ((CommandStack) event
                                                .getSource()).getMostRecentCommand();
                                        if (mostRecentCommand != null) {
                                            setViewerInput();
                                            // setSelectionToViewer(mostRecentCommand
                                        }
                                    }
                                });
                    }
                });*/

        // Create the editing domain with a special command stack.
        editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, resourceSet);
    }

    public boolean isChangeNotification(Notification notification) {
        return notification.getEventType() < Notification.REMOVING_ADAPTER;
    }

    /**
     * This sets the selection into whichever viewer is active. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSelectionToViewer(Collection<?> collection) {
        final Collection<?> theSelection = collection;
        // Make sure it's okay.
        //
        if (theSelection != null && !theSelection.isEmpty()) {
            Runnable runnable =
                    new Runnable()
                    {
                        public void run()
                        {
                            // Try to select the items in the current content
                            // viewer of the editor.
                            //
                            if (viewer != null) {
                                viewer.refresh();
                            }
                        }
                    };
            getSite().getShell().getDisplay().asyncExec(runnable);
        }
    }

    /**
     * This returns the editing domain as required by the
     * {@link IEditingDomainProvider} interface. This is important for
     * implementing the static methods of {@link AdapterFactoryEditingDomain}
     * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EditingDomain getEditingDomain() {
        return editingDomain;
    }

    /**
     * This returns the viewer as required by the {@link IViewerProvider}
     * interface. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Viewer getViewer() {
        return viewer;
    }

    /**
     * This creates a context menu for the viewer and adds a listener as well
     * registering the menu for extension. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void createContextMenuFor(StructuredViewer viewer) {
        MenuManager contextMenu = new MenuManager("#PopUp");
        contextMenu.add(new Separator("additions"));
        contextMenu.setRemoveAllWhenShown(true);
        contextMenu.addMenuListener(this);
        Menu menu = contextMenu.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);
        getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

        int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
        Transfer[] transfers = new Transfer[] {
                LocalTransfer.getInstance()
        };
        viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
        viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(
                editingDomain, viewer));
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite,
     * org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        if (!(input instanceof StructuredJsonEditorInput))
            throw new PartInitException("Invalid Input: Must be StructuredJsonEditorInput");
        jsonFiles = ((StructuredJsonEditorInput) input).getJSONFiles();

        setSite(site);
        setInputWithNotify(input);
        setPartName(input.getName());
        site.setSelectionProvider(this);
        actionContributor.setActiveEditor(this);

        try {
        	loadResourceSet();
        } catch (Exception e) {
            MessageDialog.open(MessageDialog.ERROR, getSite().getShell(),
                    "Error while trying to load JSON file", e.getMessage(), SWT.NONE);
        }
    }

	private void loadResourceSet() {
		for (IFile json : jsonFiles) {
			addResource(json);
		}
	}

	public Resource addResource(IFile json) {
		URI uri = URI.createPlatformResourceURI(json.getFullPath().toString(), true);
		
		return editingDomain.getResourceSet().getResource(uri, true);
	}

    /*
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFocus() {
        if (viewer != null) {
            // viewer.getTree().setFocus();
        }
        else {
            // getControl(getActivePage()).setFocus();
        }
    }

    /**
     * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        selectionChangedListeners.add(listener);
    }

    /**
     * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        selectionChangedListeners.remove(listener);
    }

    /**
     * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to
     * return this editor's overall selection. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public ISelection getSelection() {
        return editorSelection;
    }

    /**
     * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to
     * set this editor's overall selection. Calling this result will notify the
     * listeners. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSelection(ISelection selection) {
        editorSelection = selection;
        int columnNumber = getCurrentColumnNumber();
        for (ISelectionChangedListener listener : selectionChangedListeners) {
            if (listener instanceof RemoveJsonFileAction) {
                URI selectedJsonFile = getURIOfSelectedJsonFile();
                if (selectedJsonFile != null) {
                    ((RemoveJsonFileAction) listener).setEnabled(true);
                    ((RemoveJsonFileAction) listener)
                            .selectionChanged(new SelectionChangedEvent(this, selection));
                } else {
                    ((RemoveJsonFileAction) listener).setEnabled(false);
                }
            } else if (listener instanceof AddJsonPropertyAction || listener instanceof RemoveJsonPropertyAction) {
                Action jsonPropertyAction = (Action) listener;
				jsonPropertyAction.setEnabled(columnNumber == 0);
                if (jsonPropertyAction.isEnabled()) {
                	listener.selectionChanged(new SelectionChangedEvent(this, selection));
                }
            } else {
                listener.selectionChanged(new SelectionChangedEvent(this, selection));
            }
        }
        setStatusLineManager(selection);
    }

    /**
     * This implements {@link org.eclipse.jface.action.IMenuListener} to help
     * fill the context menus with contributions from the Edit menu. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void menuAboutToShow(IMenuManager menuManager) {
        actionContributor.menuAboutToShow(menuManager);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public JsonFileActionContributor getActionBarContributor() {
        return actionContributor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IActionBars getActionBars() {
        return getActionBarContributor().getActionBars();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AdapterFactory getAdapterFactory() {
        return adapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void dispose() {
        columnsToUris.clear();
        // urisToColumns.clear();
        // updateProblemIndication = false;

        // ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);

        // getSite().getPage().removePartListener(partListener);

        adapterFactory.dispose();

        // if (getActionBarContributor().getActiveEditor() == this) {
        // getActionBarContributor().setActiveEditor(null);
        // }

        // for (PropertySheetPage propertySheetPage : propertySheetPages) {
        // propertySheetPage.dispose();
        // }

        // if (contentOutlinePage != null) {
        // contentOutlinePage.dispose();
        // }
        selectionChangedListeners.clear();
        super.dispose();
    }

    private void createKeysToolBar(Composite bar) {
        final ToolBar toolBar = new ToolBar(bar, SWT.VERTICAL);
        ToolBarManager manager = new ToolBarManager(toolBar);

        actionContributor.addKeysRelatedActions(manager);
        // addKeysRelatedActions(manager, viewerProvider);
        manager.update(true);
    }

    private void createJsonFilesToolBar(Composite bar) {
        final ToolBar toolBar = new ToolBar(bar, SWT.HORIZONTAL);
        GridDataFactory.fillDefaults().align(SWT.END, SWT.BEGINNING).grab(false, false)
                .applyTo(toolBar);
        ToolBarManager manager = new ToolBarManager(toolBar);

        actionContributor.addJsonFilesRelatedActions(manager);
        manager.update(true);
    }

    public URI getURIOfSelectedJsonFile() {
        int currentColumnNumber = getCurrentColumnNumber();
        if (currentColumnNumber > 0 && currentColumnNumber <= columnsToUris.size()) {
            return columnsToUris.get(currentColumnNumber - 1);
        }
        return null;
    }

    public int getCurrentColumnNumber() {
        if (focusCellManager != null) {
            ViewerCell focusCell = focusCellManager.getFocusCell();
            if (viewer != null && !viewer.getTree().isDisposed() && focusCell != null) {
                return focusCell.getColumnIndex();
            }
        }
        return -1;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    /**
     * This is for implementing {@link IEditorPart} and simply tests the command
     * stack. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isDirty() {
//        return ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();
    	return false;
    }

    /**
     * This is for implementing {@link IEditorPart} and simply saves the model
     * file. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void doSave(IProgressMonitor progressMonitor) {
        pendingNotification = null;
        //changeAdapter.unsetTarget(editingDomain.getResourceSet());

        // Save only resources that have actually changed.
        //
        // final Map<Object, Object> saveOptions = new HashMap<Object,
        // Object>();
        // saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
        // Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

        // Do the work within an operation because this is a long running
        // activity that modifies the workbench.
        //
        // WorkspaceModifyOperation operation =
        // new WorkspaceModifyOperation() {
        // // This is the method that gets invoked when the operation runs.
        // //
        // @Override
        // public void execute(IProgressMonitor monitor) {
        // // Save the resources to the file system.
        // //
        // boolean first = true;
        // for (Resource resource :
        // editingDomain.getResourceSet().getResources()) {
        // if ((first || !resource.getContents().isEmpty() ||
        // isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
        // try {
        // long timeStamp = resource.getTimeStamp();
        // resource.save(saveOptions);
        // if (resource.getTimeStamp() != timeStamp) {
        // savedResources.add(resource);
        // }
        // }
        // catch (Exception exception) {
        // // resourceToDiagnosticCCMap.put(resource,
        // analyzeResourceProblems(resource, exception));
        // }
        // first = false;
        // }
        // }
        // }
        // };

        // updateProblemIndication = false;
        try {
            // This runs the options, and shows progress.
            //
            // new ProgressMonitorDialog(getSite().getShell()).run(true, false,
            // operation);

            // Refresh the necessary state.
            //
            //((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
            firePropertyChange(IEditorPart.PROP_DIRTY);
        } catch (Exception exception) {
            // Something went wrong that shouldn't.
            //
            exception.printStackTrace();
            // JsonEditorPlugin.INSTANCE.log(exception);
        }
        // updateProblemIndication = true;
        // updateProblemIndication();
        //changeAdapter.setTarget(editingDomain.getResourceSet());
    }

    /**
     * This returns whether something has been persisted to the URI of the
     * specified resource. The implementation uses the URI converter from the
     * editor's resource set to try to open an input stream. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    /*protected boolean isPersisted(Resource resource) {
        boolean result = false;
        try {
            InputStream stream = editingDomain.getResourceSet().getURIConverter()
                    .createInputStream(resource.getURI());
            if (stream != null) {
                result = true;
                stream.close();
            }
        } catch (IOException e) {
            // Ignore
        }
        return result;
    }*/

    /**
     * This always returns true because it is not currently supported. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isSaveAsAllowed() {
        return true;
    }

    /**
     * This also changes the editor's input. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void doSaveAs() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void gotoMarker(IMarker marker) {
        // List<?> targetObjects = markerHelper.getTargetObjects(editingDomain,
        // marker);
        // if (!targetObjects.isEmpty()) {
        // setSelectionToViewer(targetObjects);
        // }
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
        createViewer(parent);
    }

    private void createViewer(Composite parent) {
        viewer = doCreateViewer(parent);
        viewer.setContentProvider(new AdapterFactoryContentProvider(
                adapterFactory));
        getEditorSite().setSelectionProvider(viewer);

        setViewerInput();

        new AdapterFactoryTreeEditor(viewer.getTree(), adapterFactory);

        createContextMenuFor(viewer);

        GridLayoutFactory.swtDefaults().equalWidth(false).applyTo(viewer.getTree());
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true)
                .applyTo(viewer.getTree());
    }

    public void setViewerInput() {
        final Model model = StructuredJsonEditorManager.INSTANCE.createSchemaModel(editingDomain
                .getResourceSet());
        Display display = getSite().getShell().getDisplay();
        if (Thread.currentThread() != display.getThread()) {
        	display.syncExec(new Runnable() {
        		@Override
        		public void run() {
        			if (viewer.getTree() != null && !viewer.getTree().isDisposed()) {
        				viewer.setInput(model);
        				viewer.expandAll();
        			}
        		}
        	});
        } else {
        	if (viewer.getTree() != null && !viewer.getTree().isDisposed()) {
        		viewer.setInput(model);
        		viewer.expandAll();
        	}
        }
    }

    private TreeViewer doCreateViewer(Composite parent) {
        final Composite bar = new Composite(parent, SWT.NULL);
        GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false).margins(0, 0).spacing(0, 0)
                .applyTo(parent);
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).indent(0, 0)
                .applyTo(parent);
        GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BEGINNING).indent(0, 37)
                .grab(false, true).applyTo(bar);
        createKeysToolBar(bar);

        final FilteredTree filter = new FilteredTree(parent, SWT.H_SCROLL | SWT.V_SCROLL
                | SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION, new PatternFilter(), true) {

            @Override
            protected Composite createFilterControls(Composite parent) {
                final Composite bar = new Composite(parent, SWT.NULL);
                GridLayoutFactory.swtDefaults().numColumns(3).equalWidth(false).margins(0, 0)
                        .spacing(0, 0).applyTo(bar);
                // bar.setLayout(new GridLayout(3, false));
                GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).indent(0, 2)
                        .grab(true, false).applyTo(bar);
                // new Label(bar, SWT.NULL).setText("Filter:");
                // addAditionalActions(bar);
                setFilterControl(super.createFilterControls(bar));
                // getFilterControl().setSize(f, height)
                GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BEGINNING).indent(0, 0)
                        .hint(140, 20).grab(false, false).applyTo(getFilterControl());
                // createFilterControls.setLayoutData(new
                // GridData(GridData.FILL_HORIZONTAL));
                Label emptyLabel = new Label(bar, SWT.NONE);
                GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).indent(0, 0)
                        .grab(true, false).applyTo(emptyLabel);
                createJsonFilesToolBar(bar);
                return bar;
            }

        };
        GridLayoutFactory.swtDefaults().margins(0, 0).spacing(0, 1).applyTo(filter);
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).indent(2, 0).grab(true, true)
                .applyTo(filter);

        final TreeViewer treeViewer = filter.getViewer();
        treeViewer.setUseHashlookup(true);
        treeViewer.getTree().setHeaderVisible(true);
        treeViewer.getTree().setLinesVisible(true);

        focusCellManager = new TreeViewerFocusCellManager(treeViewer,
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
                textCellEditor, getEditingDomain(), multiPageStructuredJsonEditor));
        fieldColumn.setLabelProvider(new JsonFileLabelProvider(null));
        fieldColumn.getColumn().addListener(SWT.Resize, new Listener() {

            @Override
            public void handleEvent(Event event) {
                // filterControl.setSize(fieldColumn.getColumn().getWidth(),
                // filterControl.getSize().y);
            }

        });
        filterControl.setSize(fieldColumn.getColumn().getWidth(), filterControl.getSize().y);

        // TreeColumnLayout treeLayout = new TreeColumnLayout();
        // treeViewer.getTree().setLayout(treeLayout);
        // treeLayout.setColumnData(fieldColumn.getColumn(), new
        // ColumnWeightData(500, 150));

        TreeColumnLayout treeLayout = null;

        int columnWeight = 450;
        if (jsonFiles.size() > 1) {
        	for (Resource res : editingDomain.getResourceSet().getResources()) {
                createColumn(treeViewer, treeLayout, --columnWeight, res);
            }
        } else if (jsonFiles.size() == 1) {
        	Resource resource = getResourceSet()
                    .getResources().get(0);
            createColumn(treeViewer, treeLayout, 30, resource);
        }
        
        treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                setSelection(event.getSelection());
            }
        });
        return treeViewer;
    }

    private int createColumn(TreeViewer treeViewer, TreeColumnLayout columnLayout,
            int columnWeight, Resource res) {
        TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
        valueColumn.getColumn().setAlignment(SWT.LEFT);
        valueColumn.getColumn().setText(
                "JSON file: " + res.getURI().trimFileExtension().lastSegment());
        valueColumn.getColumn().setWidth(150);
        valueColumn.setEditingSupport(new ValueEditingSupport(this, treeViewer, res));
        valueColumn.setLabelProvider(new JsonFileLabelProvider(res));
        columnsToUris.add(res.getURI());
        return columnWeight;
    }
    
	public IXtextDocument getXtextDocument(Resource resource) {
		return multiPageStructuredJsonEditor.getXtextDocument(resource);
	}

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        // final IResourceDelta delta = event.getDelta();
        // try {
        // final ResourceDeltaVisitor visitor = new
        // ResourceDeltaVisitor(getResourceSet());
        // delta.accept(visitor);
        //
        // if (!visitor.getRemovedResources().isEmpty()) {
        // getSite().getShell().getDisplay().asyncExec
        // (new Runnable() {
        // public void run() {
        // // removedResources.addAll(visitor.getRemovedResources());
        // for (Resource resource : visitor.getRemovedResources()) {
        // Integer column = urisToColumns.get(resource.getURI().toString());
        // urisToColumns.remove(resource.getURI().toString());
        // viewer.getTree().getColumn(column).dispose();
        // columnsToUris.remove(column);
        // viewer.getTree().setRedraw(true);
        // viewer.expandAll();
        //
        // }
        // }
        // });
        // }
        // if (!visitor.getAddedResources().isEmpty()) {
        // getSite().getShell().getDisplay().asyncExec
        // (new Runnable() {
        // public void run() {
        // for (Resource resource : visitor.getAddedResources()) {
        // TreeColumnLayout treeLayout = new TreeColumnLayout();
        // createColumn(viewer, treeLayout, 0, resource);
        // setViewerInput();
        // viewer.getTree().setRedraw(true);
        // viewer.expandAll();
        // }
        // }
        // });
        // }
        //
        // if (!visitor.getChangedResources().isEmpty()) {
        // getSite().getShell().getDisplay().asyncExec
        // (new Runnable() {
        // public void run() {
        // // changedResources.addAll(visitor.getChangedResources());
        // if (getSite().getPage().getActiveEditor() ==
        // ColumnEditor.this) {
        // // handleActivate();
        // }
        // }
        // });
        // }
        // } catch (CoreException exception) {
        // Activator
        // .getDefault()
        // .getLog()
        // .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
        // Status.ERROR, exception.getMessage(), exception));
        // }
    }

    private void setFilterControl(Composite filterControl) {
        this.filterControl = filterControl;
    }

    public ResourceSet getResourceSet() {
        return editingDomain.getResourceSet();
    }

    public void setStatusLineManager(ISelection selection) {
        IStatusLineManager statusLineManager = contentOutlineStatusLineManager;

        if (statusLineManager != null) {
            if (selection instanceof IStructuredSelection) {
                Collection<?> collection = ((IStructuredSelection) selection)
                        .toList();
                switch (collection.size()) {
                    case 0: {
                        statusLineManager
                                .setMessage("Selected Nothing");
                        break;
                    }
                    case 1: {
                        String text = new AdapterFactoryItemDelegator(
                                adapterFactory).getText(collection.iterator()
                                .next());
                        statusLineManager.setMessage(getString(
                                "Selected Object: {0}", text));
                        break;
                    }
                    default: {
                        statusLineManager.setMessage(getString(
                                "Selected {0} Objects",
                                Integer.toString(collection.size())));
                        break;
                    }
                }
            } else {
                statusLineManager.setMessage("");
            }
        }
    }

    private String getString(String string, Object arg) {
        return MessageFormat.format(string, arg);
    }

    /**
     * This deals with how we want selection in the outliner to affect the other
     * views. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void handleContentOutlineSelection(ISelection selection) {
        if (viewer != null && !selection.isEmpty()
                && selection instanceof IStructuredSelection) {
            Iterator<?> selectedElements = ((IStructuredSelection) selection)
                    .iterator();
            if (selectedElements.hasNext()) {
                // Get the first selected element.
                //
                Object selectedElement = selectedElements.next();

                // If it's the selection viewer, then we want it to select the
                // same selection as this selection.
                //
                ArrayList<Object> selectionList = new ArrayList<Object>();
                selectionList.add(selectedElement);
                while (selectedElements.hasNext()) {
                    selectionList.add(selectedElements.next());
                }

                // Set the selection to the widget.
                //
                // viewer.setSelection(new StructuredSelection(
                // selectionList));
            }
        }
    }

    /**
     * This accesses a cached version of the content outliner. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IContentOutlinePage getContentOutlinePage() {
        if (contentOutlinePage == null) {
            // The content outline is just a tree.
            //
            class MyContentOutlinePage extends ContentOutlinePage {
                @Override
                public void createControl(Composite parent) {
                    super.createControl(parent);
                    contentOutlineViewer = getTreeViewer();
                    contentOutlineViewer.addSelectionChangedListener(this);

                    // Set up the tree viewer.
                    //
                    contentOutlineViewer
                            .setContentProvider(new AdapterFactoryContentProvider(
                                    adapterFactory));
                    contentOutlineViewer
                            .setLabelProvider(new AdapterFactoryLabelProvider.FontAndColorProvider(
                                    adapterFactory, contentOutlineViewer));
                    contentOutlineViewer.setInput(editingDomain
                            .getResourceSet());

                    // Make sure our popups work.
                    //
                    createContextMenuFor(contentOutlineViewer);

                    if (!editingDomain.getResourceSet().getResources()
                            .isEmpty()) {
                        // Select the root object in the view.
                        //
                        contentOutlineViewer
                                .setSelection(new StructuredSelection(
                                        editingDomain.getResourceSet()
                                                .getResources().get(0)), true);
                    }
                }

                @Override
                public void makeContributions(IMenuManager menuManager,
                        IToolBarManager toolBarManager,
                        IStatusLineManager statusLineManager) {
                    super.makeContributions(menuManager, toolBarManager,
                            statusLineManager);
                    contentOutlineStatusLineManager = statusLineManager;
                }

                @Override
                public void setActionBars(IActionBars actionBars) {
                    super.setActionBars(actionBars);
                    // getActionBarContributor().shareGlobalActions(this,
                    // actionBars);
                }
            }

            contentOutlinePage = new MyContentOutlinePage();

            // Listen to selection so that we can handle it is a special way.
            //
            contentOutlinePage
                    .addSelectionChangedListener(new ISelectionChangedListener() {
                        // This ensures that we handle selections correctly.
                        //
                        public void selectionChanged(SelectionChangedEvent event) {
                            handleContentOutlineSelection(event.getSelection());
                        }
                    });
        }

        return contentOutlinePage;
    }

    /**
     * This is how the framework determines which interfaces we implement.
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class key) {
        if (key.equals(IContentOutlinePage.class)) {
            return getContentOutlinePage();
        } else {
            return super.getAdapter(key);
        }
    }

    public void addJsonFileColumn(Resource resource) {
        TreeColumnLayout treeLayout = new TreeColumnLayout();
        createColumn(viewer, treeLayout, 0, resource);
        viewer.getTree().setRedraw(true);
        viewer.expandAll();
    }

    public void removeDBItemColumn(Resource resource) {
        int column = columnsToUris.indexOf(resource.getURI()) + 1;
        viewer.getTree().getColumn(column).dispose();
        columnsToUris.remove(column - 1);
        viewer.getTree().setRedraw(true);
        viewer.expandAll();
    }

    @Override
    public void pageChanged(PageChangedEvent event) {
        shouldUpdate = (event.getSelectedPage() == this);
        processPendingNotification();
    }

    public void processPendingNotification() {
        if (shouldUpdate && pendingNotification != null) {
            pendingNotification = null;
        }
    }

    public void setShouldUpdate(boolean shouldUpdate) {
        this.shouldUpdate = shouldUpdate;
        processPendingNotification();
    }
}
