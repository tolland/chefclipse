
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

    public static final String DATA_BAG_ICON = "DATA BAG VALUE";

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
        imageRegistry.put(DATA_BAG_ICON,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/data_bag_item.png")); //$NON-NLS-1$
        return imageRegistry;
    }
}
