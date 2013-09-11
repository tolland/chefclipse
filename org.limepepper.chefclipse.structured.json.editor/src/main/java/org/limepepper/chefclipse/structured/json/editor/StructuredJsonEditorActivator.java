
package org.limepepper.chefclipse.structured.json.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class StructuredJsonEditorActivator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.limepepper.chefclipse.structured.json.editor"; //$NON-NLS-1$
    
    public static final String JSON_EXTENSION = ".json";

    public static final String EDIT_JSON_VALUE = "EDIT JSON VALUE";

    public static final String STRUCTURED_JSON_EDITOR = "STRUCTURED JSON EDITOR";

    public static final String JSON_FILE_PAGE = "JSON FILE PAGE";

    public static final String COLUMN_PAGE = "COLUMN PAGE";

    public static final String JSON_FIELD = "JSON FIELD";

    public static final String JSON_OBJECT = "JSON OBJECT";

    public static final String ROW_PAGE = "ROW PAGE";

    public static final String ADD_JSON_FILE_OVERLAY = "ADD JSON FILE OVERLAY";

    // The shared instance
    private static StructuredJsonEditorActivator plugin;

    /**
     * The constructor
     */
    public StructuredJsonEditorActivator() {
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
    public static StructuredJsonEditorActivator getDefault() {
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
        imageRegistry.put(STRUCTURED_JSON_EDITOR,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/structured_editor.png")); //$NON-NLS-1$
        imageRegistry.put(JSON_FILE_PAGE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/json_file_page.gif")); //$NON-NLS-1$
        imageRegistry.put(COLUMN_PAGE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/column_page.gif")); //$NON-NLS-1$
        imageRegistry.put(JSON_FIELD,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/json_field.gif")); //$NON-NLS-1$
        imageRegistry.put(JSON_OBJECT,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/json_object.gif")); //$NON-NLS-1$
        imageRegistry.put(ROW_PAGE,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/row_page.gif")); //$NON-NLS-1$
        imageRegistry.put(ADD_JSON_FILE_OVERLAY,
                imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/add_json_file_icon.png")); //$NON-NLS-1$
        return imageRegistry;
    }

	public static void log(String string) {


	}
}
