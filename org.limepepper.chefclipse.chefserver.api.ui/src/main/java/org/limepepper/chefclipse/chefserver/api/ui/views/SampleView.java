package org.limepepper.chefclipse.chefserver.api.ui.views;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.provider.ChefserverItemProviderAdapterFactory;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.provider.WorkstationItemProviderAdapterFactory;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.tools.EMFUtils;
import org.limepepper.chefclipse.utility.provider.UtilityItemProviderAdapterFactory;

import chefclipse.core.providers.ChefProjectAdapterFactory;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class SampleView extends ViewPart {

    KnifeConfigController      configController = KnifeConfigController.INSTANCE;

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID               = "org.limepepper.chefclipse.chefserver.api.ui.views.SampleView";

    private TableViewer        viewer;
    private Action             action1;
    private Action             action2;
    private Action             doubleClickAction;

    /*
     * The content provider class is responsible for
     * providing objects to the view. It can wrap
     * existing objects in adapters or simply return
     * objects as-is. These objects may be sensitive
     * to the current input of the view, or ignore
     * it and always show the same content
     * (like Task List, for example).
     */

    class ViewContentProvider implements IStructuredContentProvider {
        @Override
        public void inputChanged(final Viewer v, final Object oldInput, final Object newInput) {
        }

        @Override
        public void dispose() {
        }

        @Override
        public Object[] getElements(final Object parent) {

            try {
                KnifeConfig config = null;
                if (parent instanceof EObject) {
                    IFile iFile = EMFUtils.getIFileFromEObject((EObject) parent);
                    ChefConfigManager.instance().retrieveProjectChefConfig(iFile);
                }
                ChefServerApi api = configController.getServer(config);
                return api.getNodes().toArray();
            } finally {

            }

            // return new String[] { "One", "Two", "Three" };
        }
    }

    class ViewLabelProvider extends LabelProvider implements
    ITableLabelProvider {
        @Override
        public String getColumnText(final Object obj, final int index) {
            return getText(obj);
        }

        @Override
        public Image getColumnImage(final Object obj, final int index) {
            return getImage(obj);
        }

        @Override
        public Image getImage(final Object obj) {
            return PlatformUI.getWorkbench().getSharedImages()
                    .getImage(ISharedImages.IMG_OBJ_ELEMENT);
        }
    }

    class NameSorter extends ViewerSorter {
    }

    /**
     * The constructor.
     */
    public SampleView() {
    }

    class NodeLabelProvider extends AdapterFactoryLabelProvider {

        public NodeLabelProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public String getText(final Object element) {

            return super.getText(element);
        }

        @Override
        public String getColumnText(final Object obj, final int index) {
            return getText(obj);
        }

        @Override
        public Image getColumnImage(final Object obj, final int index) {
            return getImage(obj);
        }
        @Override
        public Image getImage(final Object obj) {
            return PlatformUI.getWorkbench().getSharedImages()
                    .getImage(ISharedImages.IMG_OBJ_ELEMENT);
        }
    }

    class NodeContentProvider extends AdapterFactoryContentProvider {

        List<Node> nodes;

        NodeContentProvider(final List<Node> nodes) {
            super(ChefProjectAdapterFactory.getAdapterFactory());
            this.nodes = nodes;
        }

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        @Override
        public Object[] getElements(final Object inputElement) {
            if (inputElement instanceof NodeContentProvider) {
                return nodes.toArray();
            }
            return null;
        }
    }

    /**
     * This is a callback that will allow us
     * to create the viewer and initialize it.
     */
    @Override
    public void createPartControl(final Composite parent) {
        viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL);

        ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(new UtilityItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ChefserverItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new WorkstationItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

        viewer.setSorter(new NameSorter());

        // TODO replace with project chef config, selected or input for this view.
        KnifeConfig config = ChefConfigManager.instance().retrieveDefaultChefConfig();
        ChefServerApi api = configController.getServer(config);
        NodeContentProvider nodeContentProvider = new NodeContentProvider(
                api.getNodes());
        NodeLabelProvider nodeLabelProvider = new NodeLabelProvider();
        viewer.setContentProvider(nodeContentProvider);
        viewer.setLabelProvider(nodeLabelProvider);
        viewer.setInput(nodeContentProvider);

        // viewer.setInput(getViewSite());

        // Create the help context id for the viewer's control
        PlatformUI
        .getWorkbench()
        .getHelpSystem()
        .setHelp(viewer.getControl(),
                "org.limepepper.chefclipse.chefserver.api.ui.viewer");
        makeActions();
        hookContextMenu();
        hookDoubleClickAction();
        contributeToActionBars();
    }

    private void hookContextMenu() {
        MenuManager menuMgr = new MenuManager("#PopupMenu");
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            @Override
            public void menuAboutToShow(final IMenuManager manager) {
                SampleView.this.fillContextMenu(manager);
            }
        });
        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);
        getSite().registerContextMenu(menuMgr, viewer);
    }

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(final IMenuManager manager) {
        manager.add(action1);
        manager.add(new Separator());
        manager.add(action2);
    }

    private void fillContextMenu(final IMenuManager manager) {
        manager.add(action1);
        manager.add(action2);
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    private void fillLocalToolBar(final IToolBarManager manager) {
        manager.add(action1);
        manager.add(action2);
    }

    private void makeActions() {
        action1 = new Action() {
            @Override
            public void run() {
                showMessage("Action 1 executed");
            }
        };
        action1.setText("Action 1");
        action1.setToolTipText("Action 1 tooltip");
        action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

        action2 = new Action() {
            @Override
            public void run() {
                showMessage("Action 2 executed");
            }
        };
        action2.setText("Action 2");
        action2.setToolTipText("Action 2 tooltip");
        action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
        doubleClickAction = new Action() {
            @Override
            public void run() {
                ISelection selection = viewer.getSelection();
                Object obj = ((IStructuredSelection) selection)
                        .getFirstElement();
                showMessage("Double-click detected on " + obj.toString());
            }
        };
    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(final DoubleClickEvent event) {
                doubleClickAction.run();
            }
        });
    }

    private void showMessage(final String message) {
        MessageDialog.openInformation(viewer.getControl().getShell(),
                "Sample View", message);
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }
}