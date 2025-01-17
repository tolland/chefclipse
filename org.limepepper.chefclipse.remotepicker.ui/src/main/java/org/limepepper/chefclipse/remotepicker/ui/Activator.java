package org.limepepper.chefclipse.remotepicker.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * image registry keys
	 */
	public static final String IU_ICON_UPDATE = "IU_ICON_UPDATE"; //$NON-NLS-1$

	public static final String IU_ICON = "IU_ICON"; //$NON-NLS-1$

	public static final String NO_ICON_PROVIDED = "NO_ICON_PROVIDED"; //$NON-NLS-1$

	public static final String NO_ICON_PROVIDED_CATALOG = "NO_ICON_PROVIDED_CATALOG"; //$NON-NLS-1$

	public static final String DEPRECATED_ICON_OVERLAY = "DEPRECATED_ICON";

	public static final String NEW_ICON_OVERLAY = "NEW_ICON_OVERLAY";

	public static final String INSTALLED_ICON_OVERLAY = "INSTALLED_ICON_OVERLAY";

	public static final String DIRTY_ICON_OVERLAY = "DIRTY_ICON_OVERLAY";

	public static final String TEMPLATE_REPO_OVERLAY = "TEMPLATE_REPO_OVERLAY";

	public static final String REPO_ADD = "REPO_ADD";

	public static final String REPO_REMOVE = "REPO_REMOVE";

	// The plug-in ID
	public static final String PLUGIN_ID = "org.limepepper.chefclipse.remotepicker.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
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
		imageRegistry.put(NO_ICON_PROVIDED, imageDescriptorFromPlugin(getBundle().getSymbolicName(),
		"icons/noiconprovided.png")); //$NON-NLS-1$
		imageRegistry.put(NO_ICON_PROVIDED_CATALOG, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/noiconprovided32.png")); //$NON-NLS-1$
		imageRegistry.put(IU_ICON, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/iu_obj.gif")); //$NON-NLS-1$
		imageRegistry.put(IU_ICON_UPDATE, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/iu_update_obj.gif")); //$NON-NLS-1$
		imageRegistry.put(DEPRECATED_ICON_OVERLAY, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/deprecated_decorator.gif")); //$NON-NLS-1$
		imageRegistry.put(DIRTY_ICON_OVERLAY, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/dirty_decorator.png")); //$NON-NLS-1$
		imageRegistry.put(NEW_ICON_OVERLAY, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/new_decorator.jpg")); //$NON-NLS-1$
		imageRegistry.put(INSTALLED_ICON_OVERLAY, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/installed_decorator.gif")); //$NON-NLS-1$
		imageRegistry.put(INSTALLED_ICON_OVERLAY, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/installed_decorator.gif")); //$NON-NLS-1$
		imageRegistry.put(TEMPLATE_REPO_OVERLAY, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/add_template_repo.png")); //$NON-NLS-1$
		imageRegistry.put(REPO_ADD, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/add_repo.gif")); //$NON-NLS-1$
		imageRegistry.put(REPO_REMOVE, imageDescriptorFromPlugin(getBundle().getSymbolicName(), "icons/delete_repo.gif")); //$NON-NLS-1$
		return imageRegistry;
	}

	/**
	 * Logs the specified status with this plug-in's log.
	 * 
	 * @param status status to log
	 */
	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}
	
	/**
	 * Logs the specified throwable with this plug-in's log.
	 * 
	 * @param t throwable to log 
	 */
	public static void log(Throwable t) {
		if (t instanceof CoreException) {
			log(((CoreException)t).getStatus());
		} else {
			log(newErrorStatus("Error logged from Console plug-in: ", t)); //$NON-NLS-1$
		}
	}
	
	/**
	 * Returns a new error status for this plug-in with the given message
	 * @param message the message to be included in the status
	 * @param exception the exception to be included in the status or <code>null</code> if none
	 * @return a new error status
	 */
	public static IStatus newErrorStatus(String message, Throwable exception) {
		return new Status(IStatus.ERROR, PLUGIN_ID, message, exception);
	}
}
