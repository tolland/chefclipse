package org.limepepper.chefclipse.dltk;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.ruby.internal.ui.editor.RubyEditor;
import org.eclipse.dltk.ruby.internal.ui.editor.RubyOutlinePage;
import org.eclipse.dltk.ruby.internal.ui.editor.RubyOutlinePageFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author Dinko Ivanov
 *
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.limepepper.chefclipse.dltk"; //$NON-NLS-1$

	public static final String CHEFCLIPSE_ICON = "CHEFCLIPSE_ICON"; //$NON-NLS-1$
	
	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
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

		RubyEditor.setRubyOutlinePageFactory(new RubyOutlinePageFactory() {
			@Override
			public RubyOutlinePage createOutlinePage(RubyEditor editor,
					IPreferenceStore preferenceStore) {
				return new ChefRubyOutlinePage(editor, preferenceStore);
			}
		});
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

	@Override
	protected void initializeImageRegistry(ImageRegistry registry) {
		super.initializeImageRegistry(registry);
		Bundle bundle = Platform.getBundle(PLUGIN_ID);

		ImageDescriptor myImage = ImageDescriptor.createFromURL(FileLocator
				.find(bundle, new Path("icons/16x16.png"), null));
		registry.put(CHEFCLIPSE_ICON, myImage);
	}
}
