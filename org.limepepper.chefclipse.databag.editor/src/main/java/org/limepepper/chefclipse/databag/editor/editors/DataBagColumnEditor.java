/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.editing.FieldEditingSupport;
import org.limepepper.chefclipse.json.json.Model;
import org.limepepper.chefclipse.json.json.provider.JsonItemProviderAdapterFactory;

/**
 * @author Sebastian Sampaoli
 */
public class DataBagColumnEditor extends EditorPart implements
        IResourceChangeListener, IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider, IGotoMarker {

    private EObject dataBagEObject;
    private TreeViewer viewer;
    private Action addNewDataBagItemAction;
    private Action removePropertyAction;
    private Action editValueAction;
    private CommandStack commandStack;
    private Composite filterControl;
    
    /**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;
	private ComposedAdapterFactory adapterFactory;

	/**
	 * Resources that have been saved.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();
	
	/**
	 * This keeps track of the selection of the editor as a whole.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;
	private XtextResourceFactory resFactory;
	private Action addJsonPropertyAction;
	private Action removeDataBagItemAction;
	
    /**
     * @param resourceFactory 
     * 
     */
    public DataBagColumnEditor(XtextResourceFactory resourceFactory/*Map<String, JsonNode> nodesMap*/) {
//        this.nodesMap = nodesMap;
        this.resFactory = resourceFactory;
		initializeEditingDomain();
	}

	/**
	 * This sets up the editing domain for the model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new JsonItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
//					 getContainer().getDisplay().asyncExec
					 getEditorSite().getShell().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  firePropertyChange(IEditorPart.PROP_DIRTY);

								  // Try to select the affected objects.
								  //
								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
								  if (mostRecentCommand != null) {
//									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
								  }
//								  for (Iterator<PropertySheetPage> i = propertySheetPages.iterator(); i.hasNext(); ) {
//									  PropertySheetPage propertySheetPage = i.next();
//									  if (propertySheetPage.getControl().isDisposed()) {
//										  i.remove();
//									  }
//									  else {
//										  propertySheetPage.refresh();
//									  }
//								  }
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		XtextResourceSet resourceSet = new XtextResourceSet();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, resourceSet);
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewer getViewer() {
		return viewer;
	}
	
	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	/**
	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createModel() {
		Exception exception = null;
		try {
			// Load the resource through the editing domain.
			editingDomain.getResourceSet().getResourceFactoryRegistry().getContentTypeToFactoryMap().put("databag", resFactory);

			List<DataBagItem> items = new ArrayList<DataBagItem>();
			if (dataBagEObject instanceof DataBag) {
				items = ((DataBag) dataBagEObject).getItems();
			} else {
				items.add((DataBagItem) dataBagEObject);
			}
			
			for (DataBagItem item : items) {
				Resource res = editingDomain.getResourceSet().createResource(URI.createPlatformResourceURI(item.getJsonResource().getFullPath().toOSString(), false), "databag");
				res.load(null);
			}
		}
		catch (Exception e) {
			exception = e;
		}

//		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
//		if (diagnostic.getSeverity() != Diagnostic.OK) {
//			resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
//		}
//		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
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
        dataBagEObject = ((DataBagEditorInput) input).geteObject();
        
        setSite(site);
		setInputWithNotify(input);
        setPartName(input.getName());
//        setCommandStack(new CommandStack());
//        getCommandStack().addCommandStackListener(this);
		site.setSelectionProvider(this);
//		site.getPage().addPartListener(partListener);
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
        
        try {
        	createModel();
        } catch (Exception e) {
            MessageDialog.open(MessageDialog.ERROR, getSite().getShell(),
                    "Error while trying to load JSON file", e.getMessage(), SWT.NONE);
        }
    }

    /*
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFocus() {
		if (viewer != null) {
			viewer.getTree().setFocus();
		}
		else {
//			getControl(getActivePage()).setFocus();
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
//		selectionChangedListeners.add(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
//		selectionChangedListeners.remove(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection getSelection() {
		return editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
	 * Calling this result will notify the listeners.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(ISelection selection) {
		editorSelection = selection;

//		for (ISelectionChangedListener listener : selectionChangedListeners) {
//			listener.selectionChanged(new SelectionChangedEvent(this, selection));
//		}
//		setStatusLineManager(selection);
	}


	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
//		updateProblemIndication = false;

//		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);

//		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

//		if (getActionBarContributor().getActiveEditor() == this) {
//			getActionBarContributor().setActiveEditor(null);
//		}

//		for (PropertySheetPage propertySheetPage : propertySheetPages) {
//			propertySheetPage.dispose();
//		}

//		if (contentOutlinePage != null) {
//			contentOutlinePage.dispose();
//		}

		super.dispose();
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
        setAddJsonPropertyAction(new AddJsonPropertyAction());
        setRemovePropertyAction(new RemoveJsonPropertyAction());

        manager.add(getAddJsonPropertyAction());
        manager.add(getRemovePropertyAction());
    }
    
    private void addDataBagItemsRelatedActions(ToolBarManager manager, ViewerProvider viewerProvider) {
        setAddNewDataBagItemAction(new AddNewDataBagItemAction());
        setRemoveDataBagItemAction(new RemoveDataBagItemAction());

        manager.add(getAddNewDataBagItemAction());
        manager.add(getRemoveDataBagItemAction());
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    /**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
				// This is the method that gets invoked when the operation runs.
				//
				@Override
				public void execute(IProgressMonitor monitor) {
					// Save the resources to the file system.
					//
					boolean first = true;
					for (Resource resource : editingDomain.getResourceSet().getResources()) {
						if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
							try {
								long timeStamp = resource.getTimeStamp();
								resource.save(saveOptions);
								if (resource.getTimeStamp() != timeStamp) {
									savedResources.add(resource);
								}
							}
							catch (Exception exception) {
//								resourceToDiagnosticCCMap.put(resource, analyzeResourceProblems(resource, exception));
							}
							first = false;
						}
					}
				}
			};

//		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			exception.printStackTrace();
//			JsonEditorPlugin.INSTANCE.log(exception);
		}
//		updateProblemIndication = true;
//		updateProblemIndication();
	}

	/**
	 * This returns whether something has been persisted to the URI of the specified resource.
	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		}
		catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor =
			getActionBars().getStatusLineManager() != null ?
				getActionBars().getStatusLineManager().getProgressMonitor() :
				new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
//		List<?> targetObjects = markerHelper.getTargetObjects(editingDomain, marker);
//		if (!targetObjects.isEmpty()) {
//			setSelectionToViewer(targetObjects);
//		}
	}

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
    	// Creates the model from the editor input
//		createModel();

		// Only creates the other pages if there is something that can be edited
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			Group editorGroup = new Group(parent, SWT.NONE);
	        GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false).applyTo(editorGroup);
	        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(editorGroup);
	        viewer = doCreateViewer(editorGroup);
	        viewer.setContentProvider(new AdapterFactoryContentProvider(new JsonItemProviderAdapterFactory()));
//		        viewer.setLabelProvider(new DataBagValueLabelProvider(nodesMap));
//	        viewer.setLabelProvider(new AdapterFactoryLabelProvider(new JsonItemProviderAdapterFactory()));
	
	        Model model = DataBagEditorManager.INSTANCE.createSchemaModel(editingDomain.getResourceSet());
	        viewer.setInput(model);
	        viewer.expandAll();
	
	        new AdapterFactoryTreeEditor(viewer.getTree(), adapterFactory);
	        
	        createContextMenuFor(viewer);
	
	        GridLayoutFactory.swtDefaults().equalWidth(false).applyTo(viewer.getTree());
	        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true)
	                .applyTo(viewer.getTree());
		}
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
        fieldColumn.setLabelProvider(new DataBagLabelProvider(null));
        fieldColumn.getColumn().addListener(SWT.Resize, new Listener() {

            @Override
            public void handleEvent(Event event) {
                filterControl.setSize(fieldColumn.getColumn().getWidth(), filterControl.getSize().y);
            }
            
        });
        filterControl.setSize(fieldColumn.getColumn().getWidth(), filterControl.getSize().y);
        
        TreeColumnLayout treeLayout = new TreeColumnLayout();
//        GridLayoutFactory.swtDefaults().margins(0, 0).spacing(0, 0).applyTo(treeViewer.getTree());
        treeViewer.getTree().setLayout(treeLayout);
        //GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).indent(0, 0).grab(true, true).applyTo(treeViewer.getTree());
        
        treeLayout.setColumnData(fieldColumn.getColumn(), new
                ColumnWeightData(40, 150));

        if (dataBagEObject instanceof DataBag) {
            createColumns(treeViewer, /*nodesMap,*/ treeLayout);
        } else { // it's a databagitem
            TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText("Value");
            valueColumn.getColumn().setWidth(150);
            // valueColumn.setEditingSupport(new ValueEditingSupport(viewer,
            // textCellEditor));
            treeLayout.setColumnData(valueColumn.getColumn(),
                    new ColumnWeightData(30, 150));
            valueColumn.setLabelProvider(new DataBagLabelProvider(editingDomain.getResourceSet().getResources().get(0)));
        }
        return treeViewer;
    }

    private void createColumns(TreeViewer treeViewer,/* Map<String, JsonNode> nodesMap,*/
            TreeColumnLayout columnLayout) {
        // final TextCellEditor textCellEditor = new
        // TextCellEditor(treeViewer.getTree());
        int columnWeight = 20;
        
        for (Resource res : editingDomain.getResourceSet().getResources()) {
        	
//        for (String columnName : nodesMap.keySet()) {
            TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
//            valueColumn.getColumn().setText("Data bag item: " + columnName);
            valueColumn.getColumn().setText("Data bag item: " + res.getURI().trimFileExtension().lastSegment());
            valueColumn.getColumn().setWidth(150);
            // valueColumn.setEditingSupport(new ValueEditingSupport(treeViewer,
            // textCellEditor));
            valueColumn.setLabelProvider(new DataBagLabelProvider(res));
            columnLayout.setColumnData(valueColumn.getColumn(), new
                    ColumnWeightData(
                            --columnWeight, 150));
        }
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {

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

//        public Entry<String, JsonNode> getItemSelected() {
            // IStructuredSelection selection = (IStructuredSelection)
            // getViewer().getSelection();
//            return null;
//        }
        
//        public CommandStack getCommandStack() {
//            return commandStack;
//        }
    }

	public ResourceSet getResourceSet() {
		return editingDomain.getResourceSet();
	}
}
