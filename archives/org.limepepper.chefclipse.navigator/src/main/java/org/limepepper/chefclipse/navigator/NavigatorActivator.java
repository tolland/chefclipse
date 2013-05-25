package org.limepepper.chefclipse.navigator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class NavigatorActivator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String        PLUGIN_ID = "org.limepepper.chefclipse.navigator";     //$NON-NLS-1$

    static Logger                     logger    = LoggerFactory
                                                        .getLogger(NavigatorActivator.class);

    // The shared instance
    private static NavigatorActivator plugin;

    /**
     * The constructor
     */
    public NavigatorActivator() {
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
    public static NavigatorActivator getDefault() {
        return plugin;
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
