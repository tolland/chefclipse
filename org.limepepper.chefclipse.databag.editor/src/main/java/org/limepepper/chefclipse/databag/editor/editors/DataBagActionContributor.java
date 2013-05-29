/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.limepepper.chefclipse.databag.editor.actions.AddJsonPropertyAction;
import org.limepepper.chefclipse.databag.editor.actions.AddNewDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveDataBagItemAction;
import org.limepepper.chefclipse.databag.editor.actions.RemoveJsonPropertyAction;

/**
 * @author Sebastian Sampaoli
 */
public class DataBagActionContributor extends
        MultiPageEditorActionBarContributor
        implements
        IMenuListener,
        IPropertyListener {

    /**
     * This keeps track of the current editor part.
     */
    protected IEditorPart activeEditor;

    /**
     * This is the action used to remove an existing JSON property.
     */
    protected RemoveJsonPropertyAction removeJsonPropertyAction;

    /**
     * This is the action used to add a new JSON property.
     */
    protected AddJsonPropertyAction addJsonPropertyAction;

    /**
     * This is the action used to remove an existing data bag item.
     */
    protected RemoveDataBagItemAction removeDataBagItemAction;

    /**
     * This is the action used to add a new data bag item.
     */
    protected AddNewDataBagItemAction addNewDataBagItemAction;

    /**
     * This is the action used to implement undo.
     */
    protected UndoAction undoAction;

    /**
     * This is the action used to implement redo.
     */
    protected RedoAction redoAction;

    /**
     * This style bit indicates that the "additions" separator should come after
     * the "edit" separator.
     */
    public static final int ADDITIONS_LAST_STYLE = 0x1;

    /**
     * This is used to encode the style bits.
     */
    protected int style;

    private MultiPageDataBagEditor multiPageEditor;

    // private IEditingDomainProvider editingDomainProvider;
    //
    // public DataBagActionContributor(IEditingDomainProvider
    // editingDomainProvider) {
    // this.editingDomainProvider = editingDomainProvider;
    // }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(
     * org.eclipse.jface.viewers.SelectionChangedEvent)
     */
    // @Override
    // public void selectionChanged(SelectionChangedEvent event) {
    //
    // }

    public DataBagActionContributor() {
        super();
        init();
    }

    public DataBagActionContributor(MultiPageDataBagEditor multiPageDataBagEditor) {
        super();
        this.multiPageEditor = multiPageDataBagEditor;
        init();
    }

    private void init() {
        ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
        // MultiPageDataBagEditor editor =
        // DataBagEditorUtils.INSTANCE.getDataBagEditorFromActivePage();
        MultiPageDataBagEditor editor = multiPageEditor;

        removeDataBagItemAction = (RemoveDataBagItemAction) editor.getActionRegistry().get(
                RemoveDataBagItemAction.ID);
//        removeDataBagItemAction.setEnabled(false);
        removeJsonPropertyAction = (RemoveJsonPropertyAction) editor.getActionRegistry().get(
                RemoveJsonPropertyAction.ID);
        addNewDataBagItemAction = (AddNewDataBagItemAction) editor.getActionRegistry().get(
                AddNewDataBagItemAction.ID);
        addJsonPropertyAction = (AddJsonPropertyAction) editor.getActionRegistry().get(
                AddJsonPropertyAction.ID);
        undoAction = createUndoAction();
        undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
        redoAction = createRedoAction();
        redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
    }

    public void addDataBagItemsRelatedActions(IToolBarManager manager) {
        manager.add(undoAction);
        manager.add(redoAction);
        manager.add(addNewDataBagItemAction);
        manager.add(removeDataBagItemAction);
    }

    public void addKeysRelatedActions(IToolBarManager manager) {
        manager.add(addJsonPropertyAction);
        manager.add(removeJsonPropertyAction);
    }

    /**
     * Returns the action used to implement undo.
     * 
     * @see #undoAction
     */
    protected UndoAction createUndoAction() {
        return new UndoAction();
    }

    /**
     * Returns the action used to implement redo.
     * 
     * @see #redoAction
     */
    protected RedoAction createRedoAction() {
        return new RedoAction();
    }

    public IEditorPart getActiveEditor() {
        return activeEditor;
    }

    @Override
    public void setActiveEditor(IEditorPart part) {
        super.setActiveEditor(part);

        if (part != activeEditor) {
            if (activeEditor != null) {
                deactivate();
            }

            if (part instanceof IEditingDomainProvider) {
                activeEditor = part;
                activate();
            }
        }
    }

    @Override
    public void setActivePage(IEditorPart part) {
        // Do nothing
    }

    public void deactivate() {
        activeEditor.removePropertyListener(this);

        removeDataBagItemAction.setActiveWorkbenchPart(null);
        addNewDataBagItemAction.setActiveWorkbenchPart(null);
        removeJsonPropertyAction.setActiveWorkbenchPart(null);
        addJsonPropertyAction.setActiveWorkbenchPart(null);
        undoAction.setActiveWorkbenchPart(null);
        redoAction.setActiveWorkbenchPart(null);

        ISelectionProvider selectionProvider =
                activeEditor instanceof ISelectionProvider ?
                        (ISelectionProvider) activeEditor :
                        activeEditor.getEditorSite().getSelectionProvider();

        if (selectionProvider != null) {
            selectionProvider.removeSelectionChangedListener(removeJsonPropertyAction);
            selectionProvider.removeSelectionChangedListener(removeDataBagItemAction);
            selectionProvider.removeSelectionChangedListener(addJsonPropertyAction);
            selectionProvider.removeSelectionChangedListener(addNewDataBagItemAction);
        }
    }

    public void activate() {
        activeEditor.addPropertyListener(this);

        removeDataBagItemAction.setActiveWorkbenchPart(activeEditor);
        addNewDataBagItemAction.setActiveWorkbenchPart(activeEditor);
        removeJsonPropertyAction.setActiveWorkbenchPart(activeEditor);
        addJsonPropertyAction.setActiveWorkbenchPart(activeEditor);
        undoAction.setActiveWorkbenchPart(activeEditor);
        redoAction.setActiveWorkbenchPart(activeEditor);

        ISelectionProvider selectionProvider =
                activeEditor instanceof ISelectionProvider ?
                        (ISelectionProvider) activeEditor :
                        activeEditor.getEditorSite().getSelectionProvider();

        if (selectionProvider != null) {
            selectionProvider.addSelectionChangedListener(removeDataBagItemAction);
            selectionProvider.addSelectionChangedListener(addNewDataBagItemAction);
            selectionProvider.addSelectionChangedListener(removeJsonPropertyAction);
            selectionProvider.addSelectionChangedListener(addJsonPropertyAction);
        }

        update();
    }

    public void update() {
        ISelectionProvider selectionProvider =
                activeEditor instanceof ISelectionProvider ?
                        (ISelectionProvider) activeEditor :
                        activeEditor.getEditorSite().getSelectionProvider();
                       
        if (selectionProvider != null) {
            ISelection selection = selectionProvider.getSelection();
            IStructuredSelection structuredSelection =
                    selection instanceof IStructuredSelection ? (IStructuredSelection) selection
                            : StructuredSelection.EMPTY;
//            if (removeDataBagItemAction.isEnabled()) {
                removeDataBagItemAction.updateSelection(structuredSelection);
//            }
            addNewDataBagItemAction.updateSelection(structuredSelection);
            removeJsonPropertyAction.updateSelection(structuredSelection);
            addJsonPropertyAction.updateSelection(structuredSelection);
        }
        undoAction.update();
        redoAction.update();
    }

    /**
     * This implements {@link org.eclipse.jface.action.IMenuListener} to help
     * fill the context menus with contributions from the Edit menu.
     */
    public void menuAboutToShow(IMenuManager menuManager) {
        // Add our standard marker.
        //
        if ((style & ADDITIONS_LAST_STYLE) == 0)
        {
            menuManager.add(new Separator("additions"));
        }
        menuManager.add(new Separator("edit"));

        // Add the edit menu actions.
        //
        // menuManager.add(new ActionContributionItem(undoAction));
        // menuManager.add(new ActionContributionItem(redoAction));
        // menuManager.add(new Separator());
        // menuManager.add(new ActionContributionItem(cutAction));
        // menuManager.add(new ActionContributionItem(copyAction));
        // menuManager.add(new ActionContributionItem(pasteAction));
        // menuManager.add(new Separator());
        // menuManager.add(new ActionContributionItem(deleteAction));
        // menuManager.add(new Separator());
        //
        // if ((style & ADDITIONS_LAST_STYLE) != 0)
        // {
        // menuManager.add(new Separator("additions"));
        // menuManager.add(new Separator());
        // }
        // // Add our other standard marker.
        // //
        // menuManager.add(new Separator("additions-end"));
        //
        // addGlobalActions(menuManager);
    }

    /**
     * This inserts global actions before the "additions-end" separator.
     */
    // protected void addGlobalActions(IMenuManager menuManager) {
    // String key = (style & ADDITIONS_LAST_STYLE) == 0 ? "additions-end" :
    // "additions";
    // if (validateAction != null)
    // {
    // menuManager.insertBefore(key, new
    // ActionContributionItem(validateAction));
    // }
    //
    // if (controlAction != null)
    // {
    // menuManager.insertBefore(key, new ActionContributionItem(controlAction));
    // }
    //
    // if (validateAction != null || controlAction != null)
    // {
    // menuManager.insertBefore(key, new Separator());
    // }
    //
    // if (loadResourceAction != null)
    // {
    // menuManager.insertBefore("additions-end",
    // new ActionContributionItem(loadResourceAction));
    // menuManager.insertBefore("additions-end", new Separator());
    // }
    // }

    public void propertyChanged(Object source, int id) {
        update();
    }
}
