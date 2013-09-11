/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.editing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.json.json.JsonFactory;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.json.StringValue;
import org.limepepper.chefclipse.json.json.Value;
import org.limepepper.chefclipse.json.json.provider.JsonItemProviderAdapterFactory;
import org.limepepper.chefclipse.json.ui.internal.JsonActivator;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredColumnJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorManager;

/**
 * @author Sebastian Sampaoli
 * 
 */
public class ValueEditingSupport extends EditingSupport {

//    private TextCellEditor textCellEditor;
    private TreeViewer viewer;
	private XtextStyledTextCellEditor xtextEditor;
	private Resource resource;
	private AdapterFactoryLabelProvider adapterProvider;
	private IXtextDocument xTextDocument;
	StructuredJsonEditorManager manager = StructuredJsonEditorManager.INSTANCE;
    private StructuredColumnJsonEditor editor;
    /**
     * @param viewer
     * @param res
     * @param iXtextDocument 
     */
    public ValueEditingSupport(StructuredColumnJsonEditor editor, TreeViewer viewer, Resource res, IXtextDocument iXtextDocument) {
        super(viewer);
        this.editor = editor;
        this.xTextDocument = iXtextDocument;
        this.resource = res;
        xtextEditor = new XtextStyledTextCellEditor(SWT.SINGLE, JsonActivator.getInstance().getInjector(JsonActivator.ORG_LIMEPEPPER_CHEFCLIPSE_JSON_JSON));
    	JsonItemProviderAdapterFactory adapterFactory = new JsonItemProviderAdapterFactory();
		adapterProvider = new AdapterFactoryLabelProvider(adapterFactory);
//        this.textCellEditor = textCellEditor;
        this.viewer = viewer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
     */
    @Override
    protected CellEditor getCellEditor(Object element) {
    	if (xtextEditor.getControl() == null) {
    		 xtextEditor.create((Composite) viewer.getControl());
    	}
        return xtextEditor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
     */
    @Override
    protected boolean canEdit(Object element) {
    	EObject pair = StructuredJsonEditorManager.INSTANCE.getEObjectOfKey((EObject) element, resource);
//        return (pair != null && pair instanceof Pair);
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
     */
    @Override
    protected Object getValue(Object element) {
        EObject eObject = (EObject) element;
		EObject pair = StructuredJsonEditorManager.INSTANCE.getEObjectOfKey(eObject, resource);
        if (pair != null && pair instanceof Pair) {
        	Value val = ((Pair) pair).getValue();
        	INode node = NodeModelUtils.findActualNodeFor(val);
//        	node = NodeModelUtils.getNode(val);
        	if (node != null) {
        	    return NodeModelUtils.getTokenText(node);
        	}
//        	return adapterProvider.getText(((Pair) pair).getValue());
        }
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
     */
    @Override
    protected void setValue(Object element, final Object newValue) {
    	EObject eObject = (EObject) element;
		EObject pair = manager.getEObjectOfKey(eObject, resource);
    	if (!newValue.toString().trim().isEmpty()) {
	    	if (pair == null && manager.getEObjectOfKey(eObject.eContainer(), resource) != null) {
	    		pair = addPair(eObject);
	    	}
    	}
    	if (pair != null) {
    		INode node = null;
    		if (pair instanceof Pair) {
	        	Value val = ((Pair) pair).getValue();
	        	node = NodeModelUtils.findActualNodeFor(val);
    		} else {
    			node = NodeModelUtils.findActualNodeFor(pair);
    		}
    		if (node == null)
    			return;
    		String origText = NodeModelUtils.getTokenText(node);
    		if (newValue.equals(origText))
    			return;
    		modifyXtext(newValue, node);
    		editor.setViewerInput();
//        	return adapterProvider.getText(((Pair) pair).getValue());
        }
    }

	public EObject addPair(final EObject eObject) {
		EObject pair = xTextDocument.modify(new IUnitOfWork<EObject, XtextResource>() {
			@Override
			public EObject exec(XtextResource state) throws Exception {
				EObject copy = EcoreUtil.copy(eObject);
				if (copy instanceof Pair) {
					StringValue stringValue = JsonFactory.eINSTANCE.createStringValue();
					stringValue.setValue("");
					((Pair) copy).setValue(stringValue);
				}
				manager.addToSchema(state, eObject, copy);
				return copy;
			}
		});
		return pair;
	}

	public void modifyXtext(final Object newValue, final INode node) {
		xTextDocument.modify(new IUnitOfWork.Void<XtextResource>() {
			@Override
			public void process(XtextResource state) throws Exception {
				xTextDocument.replace(node.getOffset(), node.getLength(), (String) newValue);
			}
		});
	}

}
