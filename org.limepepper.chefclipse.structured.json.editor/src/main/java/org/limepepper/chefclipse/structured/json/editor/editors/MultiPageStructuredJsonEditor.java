package org.limepepper.chefclipse.structured.json.editor.editors;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.ObjectUndoContext;
import org.eclipse.core.commands.operations.UndoContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.operations.OperationHistoryActionHandler;
import org.eclipse.ui.operations.RedoActionHandler;
import org.eclipse.ui.operations.UndoActionHandler;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.IAbstractTextEditorHelpContextIds;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.ui.texteditor.IUpdate;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.structured.json.editor.StructuredJsonEditorActivator;
import org.limepepper.chefclipse.structured.json.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.structured.json.editor.actions.AddNewJsonFileAction;
import org.limepepper.chefclipse.structured.json.editor.actions.RemoveJsonFileAction;
import org.limepepper.chefclipse.structured.json.editor.actions.RemoveJsonPropertyAction;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * A multi page editor to manage all operations to JSON files. 
 *
 * This editor has the following pages:
 * <ul>
 * <li>page 0 contains a visual column based editor.
 * <li>subsequent pages depend on the number of JSON files which contain the
 * editor input. There is one page per JSON file. Each page is a JSON editor.
 * <li>last page shows an editor that manage each JSON file as rows.
 * </ul>
 *
 * @author Sebastian Sampaoli
 */
public class MultiPageStructuredJsonEditor extends MultiPageEditorPart implements IResourceChangeListener, IXtextModelListener {

    private class MultiUndoContext extends UndoContext {
		private List<IXtextDocument> resources = new ArrayList<IXtextDocument>();

		@Override
		public String getLabel() {
			return "Multi Undo";
		}
		
		public void addDocument(IXtextDocument doc) {
			resources.add(doc);
		}

		@Override
		public boolean matches(IUndoContext context) {
			if (context instanceof ObjectUndoContext) {
				return resources.contains(((ObjectUndoContext) context).getObject());
			}
			return super.matches(context);
		}
	}

	public static final String ID = "org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor";

	/** The column editor used in page 0. */
	private StructuredColumnJsonEditor columnEditor;

	@Inject
	private Provider<XtextEditor> editorProvider;
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

//	@Inject
//	private XtextResourceFactory resourceFactory;

	private Map<String, IAction> actionRegistry;

    private JsonFileActionContributor structuredJsonEditorActionContributor;

	private List<IFile> jsonFiles;

	private ScheduledExecutorService viewerUpdater;

	protected HashMap<URI, ScheduledFuture<?>> scheduledUpdates = new HashMap<URI, ScheduledFuture<?>>();

	private MultiUndoContext undoContext;

	/** The actions registered with the editor. */
	private Map<String, IAction> fActions = new HashMap<String, IAction>(10);
	
	public MultiPageStructuredJsonEditor() {
		super();
		actionRegistry = new HashMap<String, IAction>();
		viewerUpdater = Executors.newSingleThreadScheduledExecutor();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

    /**
     * Creates page 0 of the multi-page editor, which contains a column JSON file
     * editor.
     */
    void createColumnEditorPage() {
        try {
        	int index = 0;
            addPage(index, columnEditor, getEditorInput());
            setPageText(index, "Column Editor");
            setPageImage(index, StructuredJsonEditorActivator.getDefault().getImageRegistry().getDescriptor(StructuredJsonEditorActivator.COLUMN_PAGE).createImage());
            
            columnEditor.setViewerInput();
        } catch (PartInitException e) {
            ErrorDialog.openError(
                    getSite().getShell(),
                    "Error creating nested JSON file editor",
                    null,
                    e.getStatus());
        }
    }

	/**
	 * Creates pages for each JSON file contained in the editor input.
	 * Each page contains a JSON editor. If the item being
	 * opened is only one file, it shows only one page.
	 *
	 */
	void createJsonEditorPages() {
		for (final IFile jsonFile : jsonFiles) {
			if (jsonFile.exists()) {
				createJsonEditorFor(jsonFile);
			}
		}
	}
	
	@Override
	public void modelChanged(final XtextResource resource) {
		ScheduledFuture<?> scheduledUpdate = scheduledUpdates.get(resource.getURI());
		if (scheduledUpdate != null) {
			scheduledUpdate.cancel(true);
		}
		scheduledUpdate = viewerUpdater.schedule(new Runnable() {
			@Override
			public void run() {
				ResourceSet rset = columnEditor.getEditingDomain().getResourceSet();
				for (Resource res : rset.getResources()) {
					if (res.getURI().equals(resource.getURI())) {
						res.getContents().clear();
						Collection<EObject> copy = EcoreUtil.copyAll(resource.getContents());
						res.getContents().addAll(copy);
						//res.getContents().addAll(resource.getContents());
					}
				}
				columnEditor.setViewerInput();
			}
		}, 200, TimeUnit.MILLISECONDS);
		scheduledUpdates.put(resource.getURI(), scheduledUpdate);
		updateAction(ITextEditorActionConstants.UNDO);
		updateAction(ITextEditorActionConstants.REDO);
	}
	
    private XtextResource createJsonEditorFor(final IFile jsonFile) {
        try {
        	XtextEditor xtext = editorProvider.get();
        	int index = addPage(xtext, new FileEditorInput(jsonFile));

        	xtext.getDocument().addModelListener(this);
        	final XtextResource res = getXtextResource(xtext);
        	
        	undoContext.addDocument(xtext.getDocument());
        	
        	if (res.getContents().isEmpty()) {
				StructuredJsonEditorManager.INSTANCE.addEmptyModelTo(res, getXtextDocument(res), jsonFile);
    		}
        	
            String dbItemName = jsonFile.getName();
            int lastDot = dbItemName.lastIndexOf(".");
            if (lastDot != -1) {
                dbItemName = dbItemName.substring(0, lastDot);
            }
            setPageText(index, dbItemName);
            setPageImage(index, StructuredJsonEditorActivator.getDefault().getImageRegistry().getDescriptor(StructuredJsonEditorActivator.JSON_FILE_PAGE).createImage());
            return res;
        } catch (PartInitException e) {
        	ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
        	ErrorDialog.openError(getSite().getShell(),
        			"Error creating nested text editor", null, null);
        	e.printStackTrace();
        }
        return null;
    }

	public XtextResource getXtextResource(XtextEditor xtext) {
		XtextResource res = xtext.getDocument().readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
			@Override
			public XtextResource exec(XtextResource resource) throws Exception {
				return resource;
			}
		});
		return res;
	}

	/**
	 * Creates the pages of the multi-page JSON editor.
	 */
	protected void createPages() {
		//super.addPageChangedListener(columnEditor);

    	columnEditor = new StructuredColumnJsonEditor(structuredJsonEditorActionContributor, resourceSetProvider, this);

		createJsonEditorPages();
		createColumnEditorPage();
		createUndoRedoActions();
	}
	
	/**
	 * Creates this editor's undo/redo actions.
	 * <p>
	 * Subclasses may override or extend.</p>
	 *
	 * @since 3.1
	 */
	protected void createUndoRedoActions() {
		if (undoContext != null) {
			// Use actions provided by global undo/redo

			// Create the undo action
			OperationHistoryActionHandler undoAction= new UndoActionHandler(getEditorSite(), undoContext);
			PlatformUI.getWorkbench().getHelpSystem().setHelp(undoAction, IAbstractTextEditorHelpContextIds.UNDO_ACTION);
			undoAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_UNDO);
			registerUndoRedoAction(ITextEditorActionConstants.UNDO, undoAction);

			// Create the redo action.
			OperationHistoryActionHandler redoAction= new RedoActionHandler(getEditorSite(), undoContext);
			PlatformUI.getWorkbench().getHelpSystem().setHelp(redoAction, IAbstractTextEditorHelpContextIds.REDO_ACTION);
			redoAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_REDO);
			registerUndoRedoAction(ITextEditorActionConstants.REDO, redoAction);

			// Install operation approvers
//			IOperationHistory history= OperationHistoryFactory.getOperationHistory();
		}
	}
	
	/**
	 * Updates the specified action by calling <code>IUpdate.update</code>
	 * if applicable.
	 *
	 * @param actionId the action id
	 */
	private void updateAction(String actionId) {
		Assert.isNotNull(actionId);
		if (fActions != null) {
			IAction action= (IAction) fActions.get(actionId);
			if (action instanceof IUpdate)
				((IUpdate) action).update();
			if (action instanceof OperationHistoryActionHandler)
				((OperationHistoryActionHandler) action).update();
		}
	}
	
	/**
	 * Registers the given undo/redo action under the given ID and ensures that previously installed
	 * actions get disposed. It also takes care of re-registering the new action with the global
	 * action handler.
	 * 
	 * @param actionId the action id under which to register the action
	 * @param action the action to register or <code>null</code> to dispose them
	 * @since 3.1
	 */
	private void registerUndoRedoAction(String actionId, OperationHistoryActionHandler action) {
//		IAction oldAction= getAction(actionId);
//		if (oldAction instanceof OperationHistoryActionHandler)
//			((OperationHistoryActionHandler)oldAction).dispose();

		if (action == null)
			return;

		setAction(actionId, action);

		IActionBars actionBars= getEditorSite().getActionBars();
		if (actionBars != null)
			actionBars.setGlobalActionHandler(actionId, action);
	}

	/*
	 * @see ITextEditor#setAction(String, IAction)
	 */
	public void setAction(String actionID, IAction action) {
		Assert.isNotNull(actionID);
		if (action == null) {
			action= (IAction) fActions.remove(actionID);
//			if (action != null)
//				fActivationCodeTrigger.unregisterActionFromKeyActivation(action);
		} else {
			if (action.getId() == null)
				action.setId(actionID); // make sure the action ID has been set
			fActions.put(actionID, action);
//			fActivationCodeTrigger.registerActionForKeyActivation(action);
		}
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		//super.removePageChangedListener(columnEditor);
		if (fActions != null) {
			registerUndoRedoAction(ITextEditorActionConstants.UNDO, null);
			registerUndoRedoAction(ITextEditorActionConstants.REDO, null);
			fActions.clear();
			fActions= null;
		}
		
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		if (getSite() != null) {
		    super.dispose();
		}
	}

	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		for (int i = getPageCount()-1 ; i >= 0; i--) {
			IEditorPart editor = getEditor(i);
			if (editor != null) {
				editor.doSave(monitor);
			}
		}

		for (int i = 0 ; i < getPageCount(); i++) {
			IEditorPart editor = getEditor(i);
			if (isXtextEditor(editor)) {
				modelChanged(getXtextResource((XtextEditor) editor));
			}
		}
		columnEditor.setShouldUpdate(true);
		columnEditor.setViewerInput();
	}

	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
	}

	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		IDE.gotoMarker(columnEditor, marker);
	}
	/**
	 * Initialize the current multi page editor. It checks that the input is an instance
	 * of <code>StructuredJsonEditorInput</code>.
	 * 
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof StructuredJsonEditorInput)) {
			throw new PartInitException("Invalid Input: Must be StructuredEditorInput");
		}
		jsonFiles = ((StructuredJsonEditorInput) editorInput).getJSONFiles();
		undoContext = new MultiUndoContext();
		
		super.init(site, editorInput);
		initActionRegistry();
        structuredJsonEditorActionContributor = new JsonFileActionContributor(this);
		setPartName(editorInput.getName());
	}

	private void initActionRegistry() {
	    AddNewJsonFileAction addNewJsonFileAction = new AddNewJsonFileAction(null, ((StructuredJsonEditorInput)getEditorInput()).getParentFolder());
        actionRegistry.put(addNewJsonFileAction.getId(), addNewJsonFileAction);
        RemoveJsonFileAction removeJsonFileAction = new RemoveJsonFileAction(null);
        actionRegistry.put(removeJsonFileAction.getId(), removeJsonFileAction);
        AddJsonPropertyAction addJsonPropertyAction = new AddJsonPropertyAction(null, this);
        actionRegistry.put(addJsonPropertyAction.getId(), addJsonPropertyAction);
	    RemoveJsonPropertyAction removeJsonPropertyAction = new RemoveJsonPropertyAction(null, this);
        actionRegistry.put(removeJsonPropertyAction.getId(), removeJsonPropertyAction);
    }

	public IXtextDocument getXtextDocument(Resource resource) {
	    int editorIndex = getXTextEditorIndex(resource.getURI().lastSegment());
	    if (editorIndex != -1) {
	        XtextEditor editor = (XtextEditor) getEditor(editorIndex);
	        return editor.getDocument();
	    }
	    return null;
	}

	public int getXTextEditorIndex(String lastSegment) {
	    for (int i = 0 ; i < getPageCount(); i++) {
            IEditorPart editor = getEditor(i);
            if (isXtextEditor(editor)) {
                XtextEditor x = (XtextEditor) editor;
                if (lastSegment.equals(((FileEditorInput)x.getEditorInput()).getName()))
                    return i;
            }
        }
        return -1;
	}
	
	protected Resource getResource(IPath iPath) {
		for (Resource r : columnEditor.getEditingDomain().getResourceSet().getResources()) {
			if (iPath.lastSegment().equals(r.getURI().lastSegment()))
                return r;
		}
		return null;
	}

	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
	    final IResourceDelta delta = event.getDelta();
        try {
        	if (columnEditor != null) {
                final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor(this);
                delta.accept(visitor);

                if (!visitor.getRemovedResources().isEmpty()) {
                    getSite().getShell().getDisplay().asyncExec
                        (new Runnable() {
                            public void run() {
                            	columnEditor.setShouldUpdate(false);
                                for (IFile resource : visitor.getRemovedResources()) {
                                    int xTextEditorIndex = getXTextEditorIndex(resource.getFullPath().lastSegment());
    								XtextResource xtextRes = getXtextResource((XtextEditor) getEditor(xTextEditorIndex));
    								removePage(xTextEditorIndex);
    								Resource res = getResource(resource.getFullPath());
                                    try {
                                    	columnEditor.removeDBItemColumn(res);
                                        xtextRes.delete(Collections.emptyMap());
                                        res.delete(Collections.emptyMap());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                columnEditor.setShouldUpdate(true);
                            }
                        });
                }
                if (!visitor.getAddedResources().isEmpty()) {
                    getSite().getShell().getDisplay().asyncExec
                        (new Runnable() {
                            public void run() {
                            	columnEditor.setShouldUpdate(false);
                                for (IFile resource : visitor.getAddedResources()) {
                                	Resource res = columnEditor.addResource(resource);
                                    createJsonEditorFor(resource);
                                    columnEditor.addJsonFileColumn(res);
                                }
                                columnEditor.setShouldUpdate(true);
                            }
                        });
                }
        	}
        } catch (CoreException exception) {
            StructuredJsonEditorActivator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, StructuredJsonEditorActivator.PLUGIN_ID,
                            Status.ERROR, exception.getMessage(), exception));
        }
//		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
//			Display.getDefault().asyncExec(new Runnable(){
//				public void run(){
//					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
//					for (int i = 0; i<pages.length; i++){
//						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
//							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
//							pages[i].closeEditor(editorPart,true);
//						}
//					}
//				}
//			});
//		}
	}
	
	@Override
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
//		if (outline != null) {
//			Composite parent = outline.getControl().getParent();
//			outline.getControl().dispose();
//			setOutline(IContentOutlinePage.class);
//			outline.createControl(parent);
//			outline.setActionBars(outline.actionBars);
//		}
	}

	public boolean isXtextEditor(IEditorPart editor) {
		return editor != null && editor instanceof XtextEditor;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
//			outline = new Outline();
//			setOutline(adapter);
//			return outline;
			return getActiveEditor().getAdapter(adapter);
//			if (isXtextEditor(pageEditor)) {
//				outlinePage.setSourceViewer(((XtextEditor)pageEditor).getInternalSourceViewer());
//				return outlinePage;
//			}
		}
		return super.getAdapter(adapter);
	}

    public Map<String, IAction> getActionRegistry() {
        return actionRegistry;
    }

    public void setActionRegistry(Map<String, IAction> actionRegistry) {
        this.actionRegistry = actionRegistry;
    }
}