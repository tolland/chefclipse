package org.limepepper.chefclipse.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.service.prefs.PreferencesService;
import org.osgi.util.tracker.ServiceTracker;

public class ApiPluginActivator implements BundleActivator {

	private ServiceTracker tracker;
	private PreferencesService service;
	private static final String COLOR = "color"; //NON-NLS-1
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		tracker = new ServiceTracker(context, PreferencesService.class.getName(), null);
		tracker.open();
		
		// grab the service
		service = (PreferencesService) tracker.getService();
		Preferences preferences = service.getSystemPreferences();
		
		preferences.put(COLOR, "lavender");
		
		System.out.println("My favourite color is: " + preferences.get(COLOR, "")); 
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		// clean up
		tracker.close();
		tracker = null;
		
		service = null;
	}

}
