/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editing;

import java.util.Map.Entry;

import org.codehaus.jackson.JsonNode;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;

/**
 * Supports editing of the field name.
 * 
 * @author Sebastian Sampaoli
 */
public class FieldEditingSupport extends EditingSupport {

    private TreeViewer viewer;
    private TextCellEditor textCellEditor;

    public FieldEditingSupport(TreeViewer viewer, TextCellEditor textCellEditor) {
        super(viewer);
        this.textCellEditor = textCellEditor;
        this.viewer = viewer;
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
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected Object getValue(Object element) {
        final Entry<String, JsonNode> entryElement = (Entry<String, JsonNode>) element;
        return entryElement.getKey();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected void setValue(Object element, Object value) {
//        final Entry<String, JsonNode> entryElement = (Entry<String, JsonNode>) element;
        viewer.update(element, null);
    }

}
