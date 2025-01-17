package chefclipse.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.managers.ChefModelManager;
import chefclipse.core.managers.ChefRepositoryManager;

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

public class ChefCore extends Plugin implements BundleActivator {

	public ChefCore() {
		super();
		plugin = this;
	}

	static Logger logger = LoggerFactory.getLogger(ChefCore.class);

	private static final IResource[] NO_GENERATED_RESOURCES = new IResource[0];

	public static final String PLUGIN_ID = "chefclipse.core"; //$NON-NLS-1$
	public static final String BUILDER_ID = "chefclipse.chefbuilder"; //$NON-NLS-1$
	public static final String MODEL_ID = "chefclipse.chefmodel"; //$NON-NLS-1$
	public static final String NATURE_ID = "chefclipse.chefnature"; //$NON-NLS-1$


	// The shared instance.
	private static ChefCore plugin;


	private static BundleContext context;

	public static BundleContext getContext() {
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
			plugin = null;
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

	public static Object createDataBag(IFolder resource) {
		ChefRepositoryManager instance = ChefRepositoryManager.INSTANCE;
		EObject element = instance.getElement(resource);
		if (element != null) {
			return element;
		} else {
			try {
				return instance.createDataBag(resource);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}
	}

	public static Object createDataBagItem(IFile resource) {
		ChefRepositoryManager instance = ChefRepositoryManager.INSTANCE;
		EObject element = instance.getElement(resource);
		if (element != null) {
			return element;
		} else {
			return instance.createDataBagItem(resource);
		}
	}

	public static void log(CoreException e) {
		logger.debug("message was: {}", e);
	}

	public static void log(String string) {
		logger.debug("message was: {}", string);
	}

	public static void debug(Object class1) {
		// logger.debug("debug was: {}", class1);
	}

	public static void error(String string) {
		logger.error("debug was: {}", string);

	}
}
