/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.editors;

import java.util.EventObject;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

/**
 * @author Sebastian Sampaoli
 *
 */
public class DataBagColumnEditor extends EditorPart implements CommandStackListener, IResourceChangeListener{

    private EObject dataBagEObject;
    private TreeViewer viewer;

    /**
     * 
     */
    public DataBagColumnEditor() {

    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
     */
    @Override
    public void doSaveAs() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        if (!(input instanceof DataBagEditorInput))
            throw new PartInitException("Invalid Input: Must be DataBagEditorInput");
        setSite(site);
        setInput(input);
        setPartName(input.getName());
        dataBagEObject = ((DataBagEditorInput) input).geteObject();
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isDirty()
     */
    @Override
    public boolean isDirty() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    @Override
    public boolean isSaveAsAllowed() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
        viewer = doCreateViewer(parent);
        viewer.setContentProvider(new DataBagContentProvider());
        viewer.setLabelProvider(new DataBagLabelProvider());
        viewer.setInput(dataBagEObject);
        GridLayoutFactory.swtDefaults().equalWidth(false).applyTo(viewer.getTree());
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(viewer.getTree());
    }

    private TreeViewer doCreateViewer(Composite parent) {
        final TreeViewer viewer = new TreeViewer(parent);
        
        viewer.setUseHashlookup(true);
        viewer.getTree().setHeaderVisible(true);
//        viewer.setSorter(new NameSorter());
        
        TreeViewerColumn objectColumn = new TreeViewerColumn(viewer, SWT.LEFT);
        objectColumn.getColumn().setAlignment(SWT.LEFT);
        objectColumn.getColumn().setText("Key");
        objectColumn.getColumn().setWidth(300);
//        objectColumn.setEditingSupport(new FieldEditingSupport(viewer, textCellEditor));
//        objectColumn.setLabelProvider(new MetadataCellLabelProvider());
        
        if (dataBagEObject instanceof DataBag) {
            createColumns(viewer, (DataBag)dataBagEObject);
        } else { //it's a databagitem
            TreeViewerColumn valueColumn = new TreeViewerColumn(viewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText("Value");
            valueColumn.getColumn().setWidth(300);
//            valueColumn.setEditingSupport(new ValueEditingSupport(viewer, textCellEditor));
//            valueColumn.setLabelProvider(new MetadataValueLabelProvider());
        }
        return viewer;
    }

    private void createColumns(TreeViewer treeViewer, DataBag dataBag) {
        for (DataBagItem dataBagItem: dataBag.getItems()) {
            TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
            valueColumn.getColumn().setAlignment(SWT.LEFT);
            valueColumn.getColumn().setText(dataBagItem.getName());
            valueColumn.getColumn().setWidth(180);
//            valueColumn.setEditingSupport(new ValueEditingSupport(viewer, textCellEditor));
//            valueColumn.setLabelProvider(new MetadataValueLabelProvider());
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        
    }

    @Override
    public void commandStackChanged(EventObject event) {
        
    }
    
//    private class NameSorter extends ViewerSorter {
//
//        @Override
//        public int compare(Viewer viewer, Object e1, Object e2) {
//
//        }
//    }
}
