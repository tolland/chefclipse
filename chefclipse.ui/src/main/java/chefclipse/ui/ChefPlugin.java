package chefclipse.ui;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.ChefCore;

/**
 * The activator class controls the plug-in life cycle
 */
public class ChefPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "chefclipse.ui"; //$NON-NLS-1$

	static Logger logger = LoggerFactory.getLogger(ChefPlugin.class);

	// The shared instance
	private static ChefPlugin plugin;

	/**
	 * The constructor
	 */
	public ChefPlugin() {

		super();
		plugin = this;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		log("creating the workspaceRoot will trigger a walk of each of the open projects");
		ChefCore.create(ResourcesPlugin.getWorkspace().getRoot());
	}

	/*
	 * (non-Javadoc)
	 * 
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
	public static ChefPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static void log(CoreException e) {
		logger.debug("exception was: {}", e);
	}

	public static void log(String string) {
		logger.debug("exception was: {}", string);
	}

	public static void debug(Object class1) {
		logger.debug("exception was: {}", class1);
	}

}