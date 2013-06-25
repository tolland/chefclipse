package chefclipse.ui;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.ChefCore;

/**
 * The activator class controls the plug-in life cycle
 */
public class ChefUI extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "chefclipse.ui"; //$NON-NLS-1$

	public static final String PROJECT_EXPLORER_ID = "chefclipse.navigatorview"; //$NON-NLS-1$

	static Logger logger = LoggerFactory.getLogger(ChefUI.class);

	// The shared instance
	private static ChefUI plugin;

	/**
	 * The constructor
	 */
	public ChefUI() {

		super();
		plugin = this;
		logger.debug(this.getClass().toString());
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
		log("creating the workspaceRoot will trigger a walk of each of the open projects"); //$NON-NLS-1$
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
	 * Returns the currently active workbench window shell or <code>null</code>
	 * if none.
	 *
	 * @return the currently active workbench window shell or <code>null</code>
	 */
	public static Shell getShell() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench()
					.getWorkbenchWindows();
			if (windows.length > 0) {
				return windows[0].getShell();
			}
		} else {
			return window.getShell();
		}
		return null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ChefUI getDefault() {
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
		logger.debug("message was: {}", e);
	}

	public static void log(String string) {
		logger.debug("message was: {}", string);
	}

	public static void debug(Object class1) {
		logger.debug("debug was: {}", class1);
	}

}
