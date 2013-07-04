/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editing;


import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.limepepper.chefclipse.databag.editor.commands.ModifyXTextDocumentCommand;
import org.limepepper.chefclipse.databag.editor.commands.XTextCompoundCommand;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.editors.MultiPageDataBagEditor;
import org.limepepper.chefclipse.json.json.JsonPackage;
import org.limepepper.chefclipse.json.json.Pair;

/**
 * Supports editing of the field name.
 * 
 * @author Sebastian Sampaoli
 */
public class FieldEditingSupport extends EditingSupport {

    private TreeViewer viewer;
    private TextCellEditor textCellEditor;
	private EditingDomain editingDomain;
	private MultiPageDataBagEditor editor;

    public FieldEditingSupport(TreeViewer viewer, TextCellEditor textCellEditor, EditingDomain editingDomain, MultiPageDataBagEditor multiPageDataBagEditor) {
        super(viewer);
        this.textCellEditor = textCellEditor;
        this.viewer = viewer;
        this.editor = multiPageDataBagEditor;
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
    protected void setValue(Object element, Object value) {
    	String stringValue = ((String) value).trim();
    	if (stringValue.isEmpty() || getValue(element).equals(stringValue))
    		return; 
    	CompoundCommand compoundCommand = new XTextCompoundCommand(new ModifyXTextDocumentCommand() {
			@Override
			public MultiPageDataBagEditor getEditor() {
				return editor;
			}

            @Override
            public EObject getAffectedEObject(Command command) {
                return ((SetCommand) command).getOwner();
            }
		});
    	for (Resource res : editingDomain.getResourceSet().getResources()) {
    		Object owner = DataBagEditorManager.INSTANCE.getEObjectOfKey((EObject) element, res);
    		if (owner != null) {
    			Command command = SetCommand.create(editingDomain, owner, JsonPackage.eINSTANCE.getPair_String(), value);
    			compoundCommand.append(command);
    		}
		}
    	editingDomain.getCommandStack().execute(compoundCommand);
//        viewer.update(element, null);
    }

}
