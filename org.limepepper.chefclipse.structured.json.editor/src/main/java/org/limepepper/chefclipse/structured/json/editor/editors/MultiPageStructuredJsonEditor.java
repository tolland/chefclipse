package org.limepepper.chefclipse.structured.json.editor.editors;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
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
public class MultiPageStructuredJsonEditor extends MultiPageEditorPart implements IResourceChangeListener{

    public static final String ID = "org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor";

	/** The column editor used in page 0. */
	private StructuredColumnJsonEditor columnEditor;

	@Inject
	private Provider<XtextEditor> editorProvider;

//	@Inject
//	private XtextResourceFactory resourceFactory;

	private Map<String, IAction> actionRegistry;

    private JsonFileActionContributor StructuredJsonEditorActionContributor;

	private List<IFile> jsonFiles;

	public MultiPageStructuredJsonEditor() {
		super();
		actionRegistry = new HashMap<String, IAction>();
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
		for (IFile jsonFile : jsonFiles) {
			if (jsonFile.exists()) {
				XtextResource res = createJsonEditorFor(jsonFile);
        		if (res.getContents().isEmpty()) {
        			IXtextDocument xtextDocument = getXtextDocument(res);
                    StructuredJsonEditorManager.INSTANCE.addEmptyModelTo(res, xtextDocument, jsonFile);
        		}
			}
		}
	}
	
    private XtextResource createJsonEditorFor(IFile jsonFile) {
        try {
        	XtextEditor xtext = editorProvider.get();

            int index = addPage(xtext, new FileEditorInput(jsonFile));
            XtextResource res = addXtextResource(xtext);
//            columnEditor.getEditingDomain().getResourceSet().getResource(res.getURI(), true);
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

	public XtextResource addXtextResource(XtextEditor xtext) {
		XtextResource res = getXtextResource(xtext);
		columnEditor.getEditingDomain().getResourceSet().getResources().add(res);
		return res;
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
		columnEditor = new StructuredColumnJsonEditor(StructuredJsonEditorActionContributor, this);
		super.addPageChangedListener(columnEditor);

		createJsonEditorPages();
		createColumnEditorPage();
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		super.removePageChangedListener(columnEditor);
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
		columnEditor.setShouldUpdate(false);
		columnEditor.getEditingDomain().getResourceSet().getResources().clear();
		for (int i = getPageCount()-1 ; i >= 0; i--) {
			IEditorPart editor = getEditor(i);
			if (editor != null) {
				editor.doSave(monitor);
//				if (isXtextEditor(editor)) {
//					addXtextResource((XtextEditor) editor);
//				}
//				setPageText(i, editor.getTitle());
//				setInput(getEditorInput());
			}
		}

		for (int i = 0 ; i < getPageCount(); i++) {
			IEditorPart editor = getEditor(i);
			if (isXtextEditor(editor)) {
				addXtextResource((XtextEditor) editor);
			}
		}
		columnEditor.setShouldUpdate(true);
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
		super.init(site, editorInput);
		initActionRegistry();
        StructuredJsonEditorActionContributor = new JsonFileActionContributor(this);
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
    								XtextResource res = getXtextResource((XtextEditor) getEditor(xTextEditorIndex));
    								removePage(xTextEditorIndex);
//                                        resourceSet.getResources().remove(res);
                                    try {
                                        res.delete(new HashMap<Object, Object>());
                                        columnEditor.removeDBItemColumn(res);
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
                                    final XtextResource res = createJsonEditorFor(resource);
                                    IXtextDocument xtextDocument = getXtextDocument(res);
                                    StructuredJsonEditorManager.INSTANCE.addEmptyModelTo(res, xtextDocument, resource);
                                    
//                                    Command command = AddCommand.create(editingDomain, model,
//                                            JsonPackage.eINSTANCE.getModel_Objects(), createdJsonObject);
//                                    command.execute();
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
