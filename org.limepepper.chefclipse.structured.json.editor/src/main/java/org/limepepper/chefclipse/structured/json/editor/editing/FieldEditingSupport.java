package org.limepepper.chefclipse.structured.json.editor.editing;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorManager;

/**
 * Supports editing of the field name.
 * 
 * @author Sebastian Sampaoli
 */
public class FieldEditingSupport extends EditingSupport {

    private TextCellEditor textCellEditor;
	private EditingDomain editingDomain;
	private MultiPageStructuredJsonEditor editor;

    public FieldEditingSupport(TreeViewer viewer, TextCellEditor textCellEditor, EditingDomain editingDomain, MultiPageStructuredJsonEditor multiPageStructuredJsonEditor) {
        super(viewer);
        this.textCellEditor = textCellEditor;
        this.editor = multiPageStructuredJsonEditor;
        this.editingDomain = editingDomain;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
     */
    @Override
    protected CellEditor getCellEditor(Object element) {
        return textCellEditor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
     */
    @Override
    protected boolean canEdit(Object element) {
        return element instanceof Pair;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
     */
    @Override
    protected Object getValue(Object element) {
    	EObject eObject = (EObject) element;
    	if (eObject instanceof Pair) {
    		return ((Pair) eObject).getString();
    	}
    	return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
     */
    @Override
    protected void setValue(final Object element, final Object value) {
    	String stringValue = ((String) value).trim();
    	if (stringValue.isEmpty() || getValue(element).equals(stringValue))
    		return;
    	for (Resource res : editingDomain.getResourceSet().getResources()) {
    		editor.getXtextDocument(res).modify(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource state) throws Exception {
					Object owner = StructuredJsonEditorManager.INSTANCE.getEObjectOfKey((EObject) element, state);
					if (owner instanceof Pair) {
						((Pair) owner).setString((String) value);
					}
				}
			});
		}
    }

}
