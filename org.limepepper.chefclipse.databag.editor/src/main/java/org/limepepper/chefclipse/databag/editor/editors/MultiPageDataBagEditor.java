package org.limepepper.chefclipse.databag.editor.editors;


import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.databag.editor.Activator;

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
	
	/** The font chosen in page 1. */
	private Font font;

	/** The text widget used in page 2. */
	private StyledText text;

    private EObject dataBagEObject;

    private Map<String, JsonNode> nodesMap;
	
	public MultiPageDataBagEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

    /**
     * Creates page 0 of the multi-page editor, which contains a column data bag
     * editor.
     */
    void createColumnEditorPage() {
        try {
            columnEditor = new DataBagColumnEditor(nodesMap);
            int index = addPage(columnEditor, getEditorInput());
            setPageText(index, "Column DataBag Editor");
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
	            createJsonEditorForDataBagItem(dataBagItem);
	        }
	    } else if (dataBagEObject instanceof DataBagItem) {
	        createJsonEditorForDataBagItem((DataBagItem) dataBagEObject);
	    }

//		Composite composite = new Composite(getContainer(), SWT.NONE);
//		GridLayout layout = new GridLayout();
//		composite.setLayout(layout);
//		layout.numColumns = 2;
//
//		Button fontButton = new Button(composite, SWT.NONE);
//		GridData gd = new GridData(GridData.BEGINNING);
//		gd.horizontalSpan = 2;
//		fontButton.setLayoutData(gd);
//		fontButton.setText("Change Font...");
//		
//		fontButton.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent event) {
//				setFont();
//			}
//		});
//
//		int index = addPage(composite);
//		setPageText(index, "Properties");
	}

    private void createJsonEditorForDataBagItem(DataBagItem dataBagItem) {
        try {
            TextEditor editor = new TextEditor();
            int index = addPage(editor, new FileEditorInput((IFile) dataBagItem.getJsonResource()));
            setPageText(index, dataBagItem.getName());
            setPageImage(index, Activator.getDefault().getImageRegistry().getDescriptor(Activator.DATA_BAG_ITEM_PAGE).createImage());
        } catch (PartInitException e) {
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
		setPageText(index, "Row DataBag Editor");
		setPageImage(index, Activator.getDefault().getImageRegistry().getDescriptor(Activator.ROW_PAGE).createImage());
	}
	/**
	 * Creates the pages of the multi-page data bag editor.
	 */
	protected void createPages() {
		createColumnEditorPage();
		createRowEditorPage();
		createJsonEditorPages();
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
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
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
		setInput(editorInput);
		setSite(site);
		setPartName(editorInput.getName());
		dataBagEObject = ((DataBagEditorInput) editorInput).geteObject();
		nodesMap = ((DataBagEditorInput) editorInput).getNodesMap();
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		if (newPageIndex == 2) {
			sortWords();
		}
	}
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
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
	/**
	 * Sets the font related data to be applied to the text in page 2.
	 */
	void setFont() {
		FontDialog fontDialog = new FontDialog(getSite().getShell());
		fontDialog.setFontList(text.getFont().getFontData());
		FontData fontData = fontDialog.open();
		if (fontData != null) {
			if (font != null)
				font.dispose();
			font = new Font(text.getDisplay(), fontData);
			text.setFont(font);
		}
	}
	/**
	 * Sorts the words in page 0, and shows them in page 2.
	 */
	void sortWords() {

//		String editorText =
//			editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();
//
//		StringTokenizer tokenizer =
//			new StringTokenizer(editorText, " \t\n\r\f!@#\u0024%^&*()-_=+`~[]{};:'\",.<>/?|\\");
//		ArrayList editorWords = new ArrayList();
//		while (tokenizer.hasMoreTokens()) {
//			editorWords.add(tokenizer.nextToken());
//		}
//
//		Collections.sort(editorWords, Collator.getInstance());
//		StringWriter displayText = new StringWriter();
//		for (int i = 0; i < editorWords.size(); i++) {
//			displayText.write(((String) editorWords.get(i)));
//			displayText.write(System.getProperty("line.separator"));
//		}
//		text.setText(displayText.toString());
	}
}
