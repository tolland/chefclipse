package chefclipse.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import chefclipse.core.managers.ChefModelManager;

// copied from org.eclipse.jdt.JavaCore

/**
 * The plug-in runtime class for the Chef model plug-in containing the core
 * (UI-free) support for Chef projects.
 * <p>
 * Like all plug-in runtime classes (subclasses of <code>Plugin</code>), this
 * class is automatically instantiated by the platform when the plug-in gets
 * activated. Clients must not attempt to instantiate plug-in runtime classes
 * directly.
 * </p>
 * <p>
 * The single instance of this class can be accessed from any plug-in declaring
 * the Java model plug-in as a prerequisite via
 * <code>ChefCore.getChefCore()</code>. The Chef model plug-in will be activated
 * automatically if not already active.
 * </p>
 *
 * @noinstantiate This class is not intended to be instantiated by clients.
 */

public class ChefCore extends Plugin {

	public ChefCore() {
		super();
		CHEF_CORE_PLUGIN = this;
	}

	private static final IResource[] NO_GENERATED_RESOURCES = new IResource[0];

	private static Plugin CHEF_CORE_PLUGIN = null;
	public static final String PLUGIN_ID = "chefclipse.core"; //$NON-NLS-1$
	public static final String BUILDER_ID = PLUGIN_ID + ".chefbuilder"; //$NON-NLS-1$
	public static final String MODEL_ID = PLUGIN_ID + ".chefmodel"; //$NON-NLS-1$
	public static final String NATURE_ID = PLUGIN_ID + ".chefnature"; //$NON-NLS-1$

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	void setContext(BundleContext context) {
		ChefCore.context = context;
	}

	public static IChefElement create(IFile file) {
		return ChefModelManager.create(file, null/* unknown java project */);
	}

	/**
	 * Returns the package fragment or package fragment root corresponding to
	 * the given folder, or
	 */
	public static IChefElement create(IFolder folder) {
		return ChefModelManager.create(folder, null/* unknown java project */);
	}

	/**
	 */
	public static IChefProject create(IProject project) {
		if (project == null) {
			return null;
		}
		IChefModel chefModel = ChefModelManager.getChefModelManager()
				.getChefModel();
		return chefModel.getChefProject(project);
	}

	/**
	 */
	public static IChefElement create(IResource resource, IProject project) {
		return ChefModelManager.create(resource, project);
	}

	/**
	 */
	public static IChefModel create(IWorkspaceRoot root) {
		if (root == null) {
			return null;
		}
		return ChefModelManager.getChefModelManager().getChefModel();
	}

	/*
	 * (non-Javadoc) Shutdown the JavaCore plug-in. <p> De-registers the
	 * JavaModelManager as a resource changed listener and save participant. <p>
	 *
	 * @see org.eclipse.core.runtime.Plugin#stop(BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		try {
			ChefModelManager.getChefModelManager().shutdown();
		} finally {
			// ensure we call super.stop as the last thing
			super.stop(context);
		}
	}

	/*
	 * (non-Javadoc) Startup the JavaCore plug-in. <p> Registers the
	 * JavaModelManager as a resource changed listener and save participant.
	 * Starts the background indexing, and restore saved classpath variable
	 * values. <p>
	 *
	 * @throws Exception
	 *
	 * @see org.eclipse.core.runtime.Plugin#start(BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		setContext(context);
		ChefModelManager.getChefModelManager().startup();
		System.err.println("this is a test");
	}

	public static Object create(IResource resource) {

		switch (resource.getType()) {
		case IResource.FOLDER:
			return create((IFolder) resource);
		case IResource.FILE:
			return create((IFile) resource);
		case IResource.PROJECT:
			return create((IProject) resource);
		default:
			throw new IllegalArgumentException(
					"Messages.element_invalidResourceForProject");
		}

	}

}
