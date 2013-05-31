package org.limepepper.chefclipse.preferences.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ChefCore implements BundleActivator {

	private static BundleContext context;
	public static final String PLUGIN_ID = "org.limepepper.chefclipse.preferences.api";

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ChefCore.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ChefCore.context = null;
	}

}
