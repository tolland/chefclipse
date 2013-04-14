

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ServerApiActivator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.limepepper.chefclipse.chefserver.api"; //$NON-NLS-1$

    // The shared instance
    private static ServerApiActivator   plugin;

    /*
     * (non-Javadoc)
     *
     * @see
     * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
     * )
     */
    public void start(BundleContext context) throws Exception {
        plugin = this;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static ServerApiActivator getDefault() {
        return plugin;
    }

}
