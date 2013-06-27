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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.limepepper.chefclipse.databag.editor.DatabagEditorActivator;
import org.limepepper.chefclipse.databag.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveJsonPropertyAction;
import org.limepepper.chefclipse.json.json.JsonFactory;
import org.limepepper.chefclipse.json.json.JsonObject;
import org.limepepper.chefclipse.json.json.Model;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.json.StringValue;

import chefclipse.core.managers.ChefRepositoryManager;

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
            setPageImage(index, DatabagEditorActivator.getDefault().getImageRegistry().getDescriptor(DatabagEditorActivator.COLUMN_PAGE).createImage());
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
	        	if (dataBagItem.getJsonResource().exists()) {
	        		createJsonEditorForDataBagItem(dataBagItem/*, res.next()*/);
	        	}
	        }
	    } else if (dataBagEObject instanceof DataBagItem) {
	        createJsonEditorForDataBagItem((DataBagItem) dataBagEObject/*, res.next()*/);
	    }
	}

    private XtextResource createJsonEditorForDataBagItem(DataBagItem dataBagItem/*, Resource resource*/) {
        try {
        	XtextEditor xtext = editorProvider.get();

            int index = addPage(xtext, new FileEditorInput((IFile) dataBagItem.getJsonResource()));
            XtextResource res = addXtextResource(xtext);
//            columnEditor.getEditingDomain().getResourceSet().getResource(res.getURI(), true);
            String dbItemName = dataBagItem.getId();
            int lastDot = dbItemName.lastIndexOf(".");
            if (lastDot != -1) {
                dbItemName = dbItemName.substring(0, lastDot);
            }
            setPageText(index, dbItemName);
            setPageImage(index, DatabagEditorActivator.getDefault().getImageRegistry().getDescriptor(DatabagEditorActivator.DATA_BAG_ITEM_PAGE).createImage());
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
		setPageImage(index, DatabagEditorActivator.getDefault().getImageRegistry().getDescriptor(DatabagEditorActivator.ROW_PAGE).createImage());
	}

	/**
	 * Creates the pages of the multi-page data bag editor.
	 */
	protected void createPages() {
		columnEditor = new DataBagColumnEditor(dataBagActionContributor, this);
		super.addPageChangedListener(columnEditor);

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

	class ResourceDeltaVisitor implements IResourceDeltaVisitor {
        protected Collection<IFile> changedResources = new ArrayList<IFile>();
        protected Collection<IFile> removedResources = new ArrayList<IFile>();
        protected Collection<IFile> addedResources = new ArrayList<IFile>();

        public ResourceDeltaVisitor(ResourceSet resourceSet) {
        }

        public boolean visit(IResourceDelta delta) {
            DataBagEditorInput editorInput = (DataBagEditorInput) getEditorInput();
            if (delta.getResource().getType() == IResource.FILE && delta.getFlags() != IResourceDelta.MARKERS) {
                IFile resource = (IFile) delta.getResource();
                if (editorInput.isDataBag()) {
                    IPath dataBagLocation = ((DataBag)editorInput.geteObject()).getResource().getRawLocation();
                    if (!resource.getParent().getRawLocation().equals(dataBagLocation)){
                        return false;
                    }
                } else {
                    IPath dataBagItemLocation = ((DataBagItem)editorInput.geteObject()).getJsonResource().getRawLocation();
                    if (!resource.getRawLocation().equals(dataBagItemLocation)){
                        return false;
                    }
                }
                if (delta.getKind() == IResourceDelta.REMOVED ||
                        delta.getKind() == IResourceDelta.CHANGED) {
                    if (delta.getKind() == IResourceDelta.REMOVED) {
                        removedResources.add((IFile)resource);
                    }
                } else if (delta.getKind() == IResourceDelta.ADDED) {
                    addedResources.add((IFile)resource);
                }
            }
            return true;
        }

        public Collection<IFile> getChangedResources() {
            return changedResources;
        }

        public Collection<IFile> getRemovedResources() {
            return removedResources;
        }

        public Collection<IFile> getAddedResources() {
            return addedResources;
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
                        	columnEditor.setShouldUpdate(false);
                            for (IFile resource : visitor.getRemovedResources()) {
                                int xTextEditorIndex = getXTextEditorIndex(resource.getFullPath().lastSegment());
								XtextResource res = getXtextResource((XtextEditor) getEditor(xTextEditorIndex));
								removePage(xTextEditorIndex);
//                                    resourceSet.getResources().remove(res);
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
                                DataBagItem dataBagItem = (DataBagItem) ChefRepositoryManager.INSTANCE.createDataBagItem(resource);
                                final XtextResource res = createJsonEditorForDataBagItem(dataBagItem);
//                                EditingDomain editingDomain = columnEditor.getEditingDomain();
//                                Model model = DataBagEditorManager.INSTANCE.createSchemaModel(editingDomain.getResourceSet());
                                IXtextDocument xtextDocument = getXtextDocument(res);
                                xtextDocument.modify(new IUnitOfWork.Void<XtextResource>() {
                                    @Override
                                    public void process(XtextResource state) throws Exception {
                                        res.getContents().add(JsonFactory.eINSTANCE.createModel());
                                        EObject model = res.getContents().get(0);
                                        JsonObject createdJsonObject = JsonFactory.eINSTANCE.createJsonObject();
                                        ((Model) model).getObjects().add(createdJsonObject);
                                        Pair createPair = JsonFactory.eINSTANCE.createPair();
                                        createPair.setString("id");
                                        StringValue stringValue = JsonFactory.eINSTANCE.createStringValue();
                                        stringValue.setValue("");
                                        createPair.setValue(stringValue);
                                        createdJsonObject.getPairs().add(createPair);
                                    }
                                });

//                                Command command = AddCommand.create(editingDomain, model,
//                                        JsonPackage.eINSTANCE.getModel_Objects(), createdJsonObject);
//                                command.execute();
                                columnEditor.addDBItemColumn(res);
                            }
                            columnEditor.setShouldUpdate(true);
                        }
                    });
            }
        } catch (CoreException exception) {
            DatabagEditorActivator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, DatabagEditorActivator.PLUGIN_ID,
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
