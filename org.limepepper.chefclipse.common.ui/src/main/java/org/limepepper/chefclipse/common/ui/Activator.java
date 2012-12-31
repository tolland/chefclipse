package org.limepepper.chefclipse.common.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.limepepper.chefclipse.common.ui.providers.ChefModelProvider;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    static Logger              logger    = LoggerFactory
                                                 .getLogger(Activator.class);

    // The plug-in ID
    public static final String PLUGIN_ID = "org.limepepper.chefclipse.common.ui"; //$NON-NLS-1$

    // The shared instance
    private static Activator   plugin;

    /**
     * The constructor
     */
    public Activator() {
    }

    public static Activator getPlugin() {
        return plugin;
    }

/*
 * public static ServerApiActivator getPlugin(IPluginDescriptor descriptor) {
 * super(descriptor);
 * // record this instance as the singleton
 * plugin = this;
 * }
 */
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

        ChefModelProvider.startup();

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
    public static Activator getDefault() {
        return plugin;
    }

    public static void log(Object object) {

        logger.info("log message: {}", object);
    }

    public static void debug(Object object) {

        logger.debug("log message: {}", object);
    }

}
