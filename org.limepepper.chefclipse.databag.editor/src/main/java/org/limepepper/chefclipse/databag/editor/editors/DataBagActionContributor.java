/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
        IPropertyListener, ISelectionChangedListener {

    protected IEditorPart activeEditorPart;

    protected ISelectionProvider selectionProvider;

    protected Collection<IAction> createChildActions;

    protected Map<String, Collection<IAction>> createChildSubmenuActions;

    protected IMenuManager createChildMenuManager;

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
        removeDataBagItemAction.setEnabled(false);
        removeJsonPropertyAction = (RemoveJsonPropertyAction) editor.getActionRegistry().get(
                RemoveJsonPropertyAction.ID);
        addNewDataBagItemAction = (AddNewDataBagItemAction) editor.getActionRegistry().get(
                AddNewDataBagItemAction.ID);
        addJsonPropertyAction = (AddJsonPropertyAction) editor.getActionRegistry().get(
                AddJsonPropertyAction.ID);
        addJsonPropertyAction.setEnabled(false);
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
        return activeEditorPart;
    }

    @Override
    public void setActiveEditor(IEditorPart part) {
        super.setActiveEditor(part);
        if (part != activeEditorPart) {
            if (activeEditorPart != null) {
                deactivate();
            }

            if (part instanceof IEditingDomainProvider) {
                activeEditorPart = part;
                activate();
            }
        }
        // Switch to the new selection provider.
        //
        if (selectionProvider != null)
        {
            selectionProvider.removeSelectionChangedListener(this);
        }
        if (part == null)
        {
            selectionProvider = null;
        }
        else
        {
            selectionProvider = activeEditorPart instanceof ISelectionProvider ?
                    (ISelectionProvider) activeEditorPart :
                        activeEditorPart.getEditorSite().getSelectionProvider();
            selectionProvider.addSelectionChangedListener(this);

            // Fake a selection changed event to update the menus.
            //
            if (selectionProvider.getSelection() != null)
            {
                selectionChanged(new SelectionChangedEvent(selectionProvider,
                        selectionProvider.getSelection()));
            }
        }
    }

    @Override
    public void setActivePage(IEditorPart part) {
        // Do nothing
    }

    public void deactivate() {
        activeEditorPart.removePropertyListener(this);

        removeDataBagItemAction.setActiveWorkbenchPart(null);
        addNewDataBagItemAction.setActiveWorkbenchPart(null);
        removeJsonPropertyAction.setActiveWorkbenchPart(null);
        addJsonPropertyAction.setActiveWorkbenchPart(null);
        undoAction.setActiveWorkbenchPart(null);
        redoAction.setActiveWorkbenchPart(null);

        ISelectionProvider selectionProvider =
                activeEditorPart instanceof ISelectionProvider ?
                        (ISelectionProvider) activeEditorPart :
                            activeEditorPart.getEditorSite().getSelectionProvider();

        if (selectionProvider != null) {
            selectionProvider.removeSelectionChangedListener(removeJsonPropertyAction);
            selectionProvider.removeSelectionChangedListener(removeDataBagItemAction);
            selectionProvider.removeSelectionChangedListener(addJsonPropertyAction);
            selectionProvider.removeSelectionChangedListener(addNewDataBagItemAction);
        }
    }

    public void activate() {
        activeEditorPart.addPropertyListener(this);

        removeDataBagItemAction.setActiveWorkbenchPart(activeEditorPart);
        addNewDataBagItemAction.setActiveWorkbenchPart(activeEditorPart);
        removeJsonPropertyAction.setActiveWorkbenchPart(activeEditorPart);
        addJsonPropertyAction.setActiveWorkbenchPart(activeEditorPart);
        undoAction.setActiveWorkbenchPart(activeEditorPart);
        redoAction.setActiveWorkbenchPart(activeEditorPart);

        ISelectionProvider selectionProvider =
                activeEditorPart instanceof ISelectionProvider ?
                        (ISelectionProvider) activeEditorPart :
                            activeEditorPart.getEditorSite().getSelectionProvider();

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
                activeEditorPart instanceof ISelectionProvider ?
                        (ISelectionProvider) activeEditorPart :
                            activeEditorPart.getEditorSite().getSelectionProvider();

        if (selectionProvider != null) {
            ISelection selection = selectionProvider.getSelection();
            IStructuredSelection structuredSelection =
                    selection instanceof IStructuredSelection ? (IStructuredSelection) selection
                            : StructuredSelection.EMPTY;
            if (removeDataBagItemAction.isEnabled()) {
                removeDataBagItemAction.updateSelection(structuredSelection);
            }
            addNewDataBagItemAction.updateSelection(structuredSelection);
            removeJsonPropertyAction.updateSelection(structuredSelection);
            addJsonPropertyAction.updateSelection(structuredSelection);
        }
        undoAction.update();
        redoAction.update();
    }

    @Override
    public void selectionChanged(SelectionChangedEvent event) {
        // Remove any menu items for old selection.
        //
        if (createChildMenuManager != null) {
            depopulateManager(createChildMenuManager, createChildSubmenuActions);
            depopulateManager(createChildMenuManager, createChildActions);
        }

        // Query the new selection for appropriate new child descriptors
        //
//        Collection<?> newChildDescriptors = null;

        ISelection selection = event.getSelection();
        if (selection instanceof IStructuredSelection
                && ((IStructuredSelection) selection).size() == 1) {
            Object object = ((IStructuredSelection) selection).getFirstElement();

            EditingDomain domain = ((IEditingDomainProvider) activeEditorPart).getEditingDomain();

//            newChildDescriptors = domain.getNewChildDescriptors(object, null);
        }

        // Generate actions for selection; populate and redraw the menus.
        //
//        createChildActions = generateCreateChildActions(newChildDescriptors, selection);
//        createChildSubmenuActions = extractSubmenuActions(createChildActions);

        if (createChildMenuManager != null) {
            populateManager(createChildMenuManager, createChildSubmenuActions, null);
            populateManager(createChildMenuManager, createChildActions, null);
            createChildMenuManager.update(true);
        }
    }

//    protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors,
//            ISelection selection) {
//        Collection<IAction> actions = new ArrayList<IAction>();
//        if (descriptors != null) {
//            for (Object descriptor : descriptors) {
//                actions.add(new CreateChildAction(activeEditorPart, selection, descriptor));
//            }
//        }
//        return actions;
//    }

//    protected Map<String, Collection<IAction>> extractSubmenuActions(
//            Collection<IAction> createActions) {
//        Map<String, Collection<IAction>> createSubmenuActions = new LinkedHashMap<String, Collection<IAction>>();
//        if (createActions != null) {
//            for (Iterator<IAction> actions = createActions.iterator(); actions.hasNext();) {
//                IAction action = actions.next();
//                StringTokenizer st = new StringTokenizer(action.getText(), "|");
//                if (st.countTokens() == 2) {
//                    String text = st.nextToken().trim();
//                    Collection<IAction> submenuActions = createSubmenuActions.get(text);
//                    if (submenuActions == null) {
//                        createSubmenuActions.put(text, submenuActions = new ArrayList<IAction>());
//                    }
//                    action.setText(st.nextToken().trim());
//                    submenuActions.add(action);
//                    actions.remove();
//                }
//            }
//        }
//        return createSubmenuActions;
//    }

    protected void populateManager(IContributionManager manager,
            Map<String, Collection<IAction>> submenuActions, String contributionID) {
        if (submenuActions != null) {
            for (Map.Entry<String, Collection<IAction>> entry : submenuActions.entrySet()) {
                MenuManager submenuManager = new MenuManager(entry.getKey());
                if (contributionID != null) {
                    manager.insertBefore(contributionID, submenuManager);
                }
                else {
                    manager.add(submenuManager);
                }
                populateManager(submenuManager, entry.getValue(), null);
            }
        }
    }

    protected void populateManager(IContributionManager manager,
            Collection<? extends IAction> actions, String contributionID) {
        if (actions != null) {
            for (IAction action : actions) {
                if (contributionID != null) {
                    manager.insertBefore(contributionID, action);
                }
                else {
                    manager.add(action);
                }
            }
        }
    }

    protected void depopulateManager(IContributionManager manager,
            Collection<? extends IAction> actions) {
        if (actions != null) {
            IContributionItem[] items = manager.getItems();
            for (int i = 0; i < items.length; i++) {
                // Look into SubContributionItems
                //
                IContributionItem contributionItem = items[i];
                while (contributionItem instanceof SubContributionItem) {
                    contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
                }

                // Delete the ActionContributionItems with matching action.
                //
                if (contributionItem instanceof ActionContributionItem) {
                    IAction action = ((ActionContributionItem) contributionItem).getAction();
                    if (actions.contains(action)) {
                        manager.remove(contributionItem);
                    }
                }
            }
        }
    }

    protected void depopulateManager(IContributionManager manager,
            Map<String, Collection<IAction>> submenuActions) {
        if (submenuActions != null) {
            IContributionItem[] items = manager.getItems();
            for (int i = 0; i < items.length; i++) {
                IContributionItem contributionItem = items[i];
                if (contributionItem instanceof MenuManager) {
                    MenuManager submenuManager = (MenuManager) contributionItem;
                    if (submenuActions.containsKey(submenuManager.getMenuText())) {
                        depopulateManager(submenuManager, submenuActions.get(contributionItem));
                        manager.remove(contributionItem);
                    }
                }
            }
        }
    }
    
    @Override
    public void contributeToMenu(IMenuManager menuManager)
    {
        super.contributeToMenu(menuManager);

        IMenuManager submenuManager = new MenuManager(
                "Data Bag editor menu",
                "org.limepepper.chefclipse.json.jsonMenuID");
        menuManager.insertAfter("additions", submenuManager);
        submenuManager.add(new Separator("settings"));
        submenuManager.add(new Separator("actions"));
        submenuManager.add(new Separator("additions"));
        submenuManager.add(new Separator("additions-end"));

        // Prepare for CreateChild item addition or removal.
        //
        createChildMenuManager = new MenuManager(
                "new chilllddd");
        submenuManager.insertBefore("additions", createChildMenuManager);
        // Force an update because Eclipse hides empty menus now.
        //
        submenuManager.addMenuListener
                (new IMenuListener()
                {
                    public void menuAboutToShow(IMenuManager menuManager)
                    {
                        menuManager.updateAll(true);
                    }
                });

//        addGlobalActions(submenuManager);
    }
    
    /**
     * This implements {@link org.eclipse.jface.action.IMenuListener} to help
     * fill the context menus with contributions from the Edit menu.
     */
    public void menuAboutToShow(IMenuManager menuManager) {
        // Add our standard marker.
        //
//        if ((style & ADDITIONS_LAST_STYLE) == 0) {
//            menuManager.add(new Separator("additions"));
//        }
//        menuManager.add(new Separator("edit"));
        menuManager.add(addJsonPropertyAction);
        menuManager.add(removeJsonPropertyAction);
        menuManager.add(addNewDataBagItemAction);
        menuManager.add(removeDataBagItemAction);
        menuManager.add(undoAction);
        menuManager.add(redoAction);
//        if ((style & ADDITIONS_LAST_STYLE) == 0) {
//          menuManager.add(new Separator("additions"));
//        }
//        menuManager.add(new Separator("edit"));
//        MenuManager submenuManager = new MenuManager();
//        populateManager(submenuManager, createChildSubmenuActions, null);
//        populateManager(submenuManager, createChildActions, null);
//        menuManager.insertBefore("edit", submenuManager);

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
//        addGlobalActions(menuManager);
    }

//    /**
//     * This inserts global actions before the "additions-end" separator.
//     */
//     protected void addGlobalActions(IMenuManager menuManager) {
//     String key = (style & ADDITIONS_LAST_STYLE) == 0 ? "additions-end" :
//     "additions";
//     if (validateAction != null)
//     {
//     menuManager.insertBefore(key, new
//     ActionContributionItem(validateAction));
//     }
//    
//     if (controlAction != null)
//     {
//     menuManager.insertBefore(key, new ActionContributionItem(controlAction));
//     }
//    
//     if (validateAction != null || controlAction != null)
//     {
//     menuManager.insertBefore(key, new Separator());
//     }
//    
//     if (loadResourceAction != null)
//     {
//     menuManager.insertBefore("additions-end",
//     new ActionContributionItem(loadResourceAction));
//     menuManager.insertBefore("additions-end", new Separator());
//     }
//     }

    public void propertyChanged(Object source, int id) {
        update();
    }
}
