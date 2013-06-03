package org.limepepper.chefclipse.databag.editor.editors;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
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
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.databag.editor.Activator;
import org.limepepper.chefclipse.databag.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveJsonPropertyAction;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * A multi page editor to manage all operations to {@link DataBag}s and {@link DataBagItem}s.
 * 
 * This editor has the following pages:
 * <ul>
 * <li>page 0 contains a visual column based editor.
 * <li>subsequent pages depend on the number of data bag items which contain the opened
 * DataBag. There is one page per data bag item file. Each page is a Json editor.
 * <li>last page shows an editor that manage each data bag item as rows.
 * </ul>
 * 
 * @author Sebastian Sampaoli
 */
public class MultiPageDataBagEditor extends MultiPageEditorPart implements IResourceChangeListener{
    
    public static final String ID = "org.limepepper.chefclipse.databag.editor.editors.MultiPageDataBagEditor";

	/** The column data bag editor used in page 0. */
	private DataBagColumnEditor columnEditor;
	
	@Inject
	private Provider<XtextEditor> editorProvider;

//	@Inject
//	private XtextResourceFactory resourceFactory;

	private StyledText text;

    private EObject dataBagEObject;

	
	private Map<String, IAction> actionRegistry;

    private DataBagActionContributor dataBagActionContributor;
	
	public MultiPageDataBagEditor() {
		super();
		actionRegistry = new HashMap<String, IAction>();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

    /**
     * Creates page 0 of the multi-page editor, which contains a column data bag
     * editor.
     */
    void createColumnEditorPage() {
        try {
//        	columnEditor = new DataBagColumnEditor();
        	int index = 0;
            addPage(index, columnEditor, getEditorInput());
            setPageText(index, "Column Editor");
            setPageImage(index, Activator.getDefault().getImageRegistry().getDescriptor(Activator.COLUMN_PAGE).createImage());
        } catch (PartInitException e) {
            ErrorDialog.openError(
                    getSite().getShell(),
                    "Error creating nested data bag editor",
                    null,
                    e.getStatus());
        }
    }
    
	/**
	 * Creates pages for each {@link DataBagItem} contained in the opened
	 * {@link DataBag}. Each page contains a JSON editor. If the item being
	 * opened is a DataBagItem, it shows only one page.
	 * 
	 */
	void createJsonEditorPages() {
	    if (dataBagEObject instanceof DataBag) {
	        DataBag dataBag = (DataBag) dataBagEObject;
	        for (DataBagItem dataBagItem : dataBag.getItems()) {
	            createJsonEditorForDataBagItem(dataBagItem/*, res.next()*/);
	        }
	    } else if (dataBagEObject instanceof DataBagItem) {
	        createJsonEditorForDataBagItem((DataBagItem) dataBagEObject/*, res.next()*/);
	    }
	}

    private void createJsonEditorForDataBagItem(DataBagItem dataBagItem/*, Resource resource*/) {
        try {
        	XtextEditor xtext = editorProvider.get();

            int index = addPage(xtext, new FileEditorInput((IFile) dataBagItem.getJsonResource()));
            XtextResource res = xtext.getDocument().readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
				@Override
				public XtextResource exec(XtextResource resource) throws Exception {
					return resource;
				}
            });
            columnEditor.getEditingDomain().getResourceSet().getResources().add(res);
//            columnEditor.getEditingDomain().getResourceSet().getResource(res.getURI(), true);
            String dbItemName = dataBagItem.getName();
            int lastDot = dbItemName.lastIndexOf(".");
            if (lastDot != -1) {
                dbItemName = dbItemName.substring(0, lastDot);
            }
            setPageText(index, dbItemName);
            setPageImage(index, Activator.getDefault().getImageRegistry().getDescriptor(Activator.DATA_BAG_ITEM_PAGE).createImage());
        } catch (PartInitException e) {
        	ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
        	ErrorDialog.openError(getSite().getShell(),
        			"Error creating nested text editor", null, null);
        	e.printStackTrace();
        }
    }
	/**
	 * Creates last page of this editor. This page shows an editor which manages
	 * all data bag items as rows in the viewer. The JSON properties are showed in a
	 * left column.
	 */
	void createRowEditorPage() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		text = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		text.setEditable(false);

		int index = addPage(composite);
		setPageText(index, "Row Editor");
		setPageImage(index, Activator.getDefault().getImageRegistry().getDescriptor(Activator.ROW_PAGE).createImage());
	}

	/**
	 * Creates the pages of the multi-page data bag editor.
	 */
	protected void createPages() {
		columnEditor = new DataBagColumnEditor(dataBagActionContributor);
		
		createRowEditorPage();
		createJsonEditorPages();
		createColumnEditorPage();
	}
	
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
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
		for (int i = 0 ; i < getPageCount(); i++) {
			IEditorPart editor = getEditor(i);
			if (editor != null) {
				editor.doSave(monitor);
//				setPageText(i, editor.getTitle());
//				setInput(getEditorInput());
			}
		}
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
	 * of <code>DataBagEditorInput</code>. Besides, it loads all the JSON nodes from each 
	 * data bag item JSON file. 
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof DataBagEditorInput)) {
			throw new PartInitException("Invalid Input: Must be DataBagEditorInput");
		}
		dataBagEObject = ((DataBagEditorInput) editorInput).geteObject();
		super.init(site, editorInput);
		initActionRegistry();
        dataBagActionContributor = new DataBagActionContributor(this);
		setPartName(editorInput.getName());
	}

	private void initActionRegistry() {
	    AddNewDataBagItemAction addNewDataBagItemAction = new AddNewDataBagItemAction(null, ((DataBagEditorInput)getEditorInput()).getParentFolder());
        actionRegistry.put(addNewDataBagItemAction.getId(), addNewDataBagItemAction);
        RemoveDataBagItemAction removeDataBagItemAction = new RemoveDataBagItemAction(null);
        actionRegistry.put(removeDataBagItemAction.getId(), removeDataBagItemAction);
        AddJsonPropertyAction addJsonPropertyAction = new AddJsonPropertyAction(null);
        actionRegistry.put(addJsonPropertyAction.getId(), addJsonPropertyAction);
	    RemoveJsonPropertyAction removeJsonPropertyAction = new RemoveJsonPropertyAction(null, this);
        actionRegistry.put(removeJsonPropertyAction.getId(), removeJsonPropertyAction);
    }
	
	public IXtextDocument getXtextDocument(Resource resource) {
	    int editorIndex = getXTextEditorIndex(resource);
	    if (editorIndex != -1) {
	        XtextEditor editor = (XtextEditor) getEditor(editorIndex);
	        return editor.getDocument();
	    }
	    return null;
	}
	
	public int getXTextEditorIndex(Resource resource) {
	    for (int i = 0 ; i < getPageCount(); i++) {
            IEditorPart editor = getEditor(i);
            if (isXtextEditor(editor)) {
                XtextEditor x = (XtextEditor) editor;
                if (resource.getURI().lastSegment().equals(((FileEditorInput)x.getEditorInput()).getName()))
                    return i;
            }
        }
        return -1;
	}
	
	static class ResourceDeltaVisitor implements IResourceDeltaVisitor {
        protected ResourceSet resourceSet;
        protected Collection<Resource> changedResources = new ArrayList<Resource>();
        protected Collection<Resource> removedResources = new ArrayList<Resource>();
        protected Collection<Resource> addedResources = new ArrayList<Resource>();
        protected Collection<Resource> savedResources = new ArrayList<Resource>();
        
        public ResourceDeltaVisitor(ResourceSet resourceSet) {
            this.resourceSet = resourceSet;
        }
        
        public boolean visit(IResourceDelta delta) {
            if (delta.getResource().getType() == IResource.FILE && delta.getFlags() != IResourceDelta.MARKERS) {
                if (delta.getKind() == IResourceDelta.REMOVED ||
                        delta.getKind() == IResourceDelta.CHANGED) {
                    Resource resource = resourceSet.getResource(URI
                            .createPlatformResourceURI(delta.getFullPath()
                                    .toString(), true), false);
                    if (resource != null) {
                        if (delta.getKind() == IResourceDelta.REMOVED) {
                            removedResources.add(resource);
                        } else if (!savedResources.remove(resource)) {
                            changedResources.add(resource);
                        }
                    }
                } else if (delta.getKind() == IResourceDelta.ADDED) {
                    ResourceSet resSet = new ResourceSetImpl();
                    Resource resource = resSet.createResource(URI
                            .createPlatformResourceURI(delta.getFullPath()
                                    .toString(), true), "databag");
                    addedResources.add(resource);
                }
            }
            return true;
        }

        public Collection<Resource> getChangedResources() {
            return changedResources;
        }

        public Collection<Resource> getRemovedResources() {
            return removedResources;
        }
        
        public Collection<Resource> getAddedResources() {
            return addedResources;
        }
        
        public Collection<Resource> getSavedResources() {
            return savedResources;
        }
    }

	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
	    final IResourceDelta delta = event.getDelta();
        try {
            final ResourceSet resourceSet = columnEditor.getEditingDomain().getResourceSet();
            final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor(resourceSet);
            delta.accept(visitor);

            if (!visitor.getRemovedResources().isEmpty()) {
                getSite().getShell().getDisplay().asyncExec
                        (new Runnable() {
                            public void run() {
                                for (Resource resource : visitor.getRemovedResources()) {
                                    removePage(getXTextEditorIndex(resource));
//                                    resourceSet.getResources().remove(resource);
                                    try {
                                        resource.delete(new HashMap<Object, Object>());
                                        columnEditor.removeDBItemColumn(resource);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
            }
            if (!visitor.getAddedResources().isEmpty()) {
                getSite().getShell().getDisplay().asyncExec
                        (new Runnable() {
                            public void run() {
                                for (Resource resource : visitor.getAddedResources()) {
                                    IFile dbFile = (IFile) DataBagEditorManager.INSTANCE.getResourceFromUri(resource.getURI());
                                    DataBagItem dataBagItem = (DataBagItem) ChefRepositoryManager.INSTANCE.createDataBagItem(dbFile);
                                    createJsonEditorForDataBagItem(dataBagItem);
                                    columnEditor.addDBItemColumn(resource);
                                }
                            }
                        });
            }
        } catch (CoreException exception) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
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
