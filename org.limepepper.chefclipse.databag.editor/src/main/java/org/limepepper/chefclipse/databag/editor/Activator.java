
package org.limepepper.chefclipse.databag.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.limepepper.chefclipse.databag.editor"; //$NON-NLS-1$

    public static final String EDIT_JSON_VALUE = "EDIT JSON VALUE";

    public static final String DATA_BAG_EDITOR = "DATA BAG EDITOR";
    
    public static final String DATA_BAG_ITEM_PAGE = "DATA BAG ITEM PAGE";

    public static final String COLUMN_PAGE = "COLUMN PAGE";

    public static final String JSON_FIELD = "JSON FIELD";

    public static final String JSON_OBJECT = "JSON OBJECT";

    public static final String ROW_PAGE = "ROW PAGE";

    public static final String ADD_DATA_BAG_ITEM_OVERLAY = "ADD DATA BAG ITEM OVERLAY";
    
    // The shared instance
    private static Activator plugin;

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
     * )
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
     * )
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path
     * 
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    @Override
    protected ImageRegistry createImageRegistry() {
        ImageRegistry imageRegistry = super.createImageRegistry();
        imageRegistry.put(EDIT_JSON_VALUE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/edit.gif")); //$NON-NLS-1$
        imageRegistry.put(DATA_BAG_EDITOR,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/data_bag_editor.png")); //$NON-NLS-1$
        imageRegistry.put(DATA_BAG_ITEM_PAGE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/databagitem_page.gif")); //$NON-NLS-1$
        imageRegistry.put(COLUMN_PAGE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/column_page.gif")); //$NON-NLS-1$
        imageRegistry.put(JSON_FIELD,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/json_field.gif")); //$NON-NLS-1$
        imageRegistry.put(JSON_OBJECT,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/json_object.gif")); //$NON-NLS-1$
        imageRegistry.put(ROW_PAGE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/row_page.gif")); //$NON-NLS-1$
        imageRegistry.put(ADD_DATA_BAG_ITEM_OVERLAY,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/add_data_bag_item_icon.png")); //$NON-NLS-1$
        return imageRegistry;
    }
}
