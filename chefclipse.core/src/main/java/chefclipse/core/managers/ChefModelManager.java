package chefclipse.core.managers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentTypeManager.ContentTypeChangeEvent;
import org.eclipse.core.runtime.content.IContentTypeManager.IContentTypeChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.ChefCore;
import chefclipse.core.ChefModel;
import chefclipse.core.DeltaProcessingState;
import chefclipse.core.IChefElement;
import chefclipse.core.IChefModel;
import chefclipse.core.testers.ChefTester;

public class ChefModelManager implements IContentTypeChangeListener {

	static Logger logger = LoggerFactory.getLogger(ChefModelManager.class);

	/**
	 * Unique handle onto the ChefModel
	 */
	final IChefModel chefModel = new ChefModel(null);

	/**
	 * Holds the state used for delta processing.
	 */
	public DeltaProcessingState deltaState = new DeltaProcessingState();

	private static ChefModelManager MANAGER = new ChefModelManager();

	/**
	 * Returns the singleton ChefModelManager
	 */
	public final static ChefModelManager getChefModelManager() {
		return MANAGER;
	}

	/*
	 * public static IChefElement create(IFolder folder, Object object) { return
	 * null; }
	 */

	public static IChefElement create(IResource resource, Object object) {

		switch (resource.getType()) {
		case IResource.ROOT:

			break;
		case IResource.PROJECT:
			if (ChefTester.testResource(resource, "isChefProject")) {
				logger.debug(
						"opening project and repository in model manager: {}",
						((IProject) resource).getName());

			}
			break;
		case IResource.FOLDER:

			if (ChefTester.testResource(resource, "isCookbook")) {
				logger.debug("opening cookbook model manager: {}",
						((IFolder) resource).getName());

			} else if (ChefTester.testResource(resource, "isCookbookFolder")) {
				logger.debug("opening cookbook folder model manager: {}",
						((IFolder) resource).getName());

			}
			break;
		case IResource.FILE:

			if (ChefTester.testResource(resource, "isKnifeConfigFile")) {
				logger.debug("opening knife file in model manager: {}",
						((IFile) resource).getName());

			} else if (ChefTester.testResource(resource, "isTemplate")) {
				logger.debug("opening isTemplate file in model manager: {}",
						((IFile) resource).getName());

			} else if (ChefTester.testResource(resource, "isCookbookMetadata")) {
				logger.debug(
						"opening isCookbookMetadata file in model manager: {}",
						((IFile) resource).getName());

			}

			break;
		default:
			break;
		}

		return null;
	}

	public IChefModel getChefModel() {
		return this.chefModel;
	}

	public void shutdown() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.removeResourceChangeListener(this.deltaState);
		// workspace.removeSaveParticipant(ChefCore.PLUGIN_ID);

		// Stop listening to content-type changes
		Platform.getContentTypeManager().removeContentTypeChangeListener(this);

		// Stop indexing
		// if (this.indexManager != null) {
		// this.indexManager.shutdown();
		// }

		// Stop listening to preferences changes
		/*
		 * preferences.removePreferenceChangeListener(this.propertyListener);
		 * ((IEclipsePreferences) this.preferencesLookup[PREF_DEFAULT].parent())
		 * .removeNodeChangeListener(this.defaultNodeListener);
		 * this.preferencesLookup[PREF_DEFAULT] = null; ((IEclipsePreferences)
		 * this.preferencesLookup[PREF_INSTANCE].parent())
		 * .removeNodeChangeListener(this.instanceNodeListener);
		 * this.preferencesLookup[PREF_INSTANCE]
		 * .removePreferenceChangeListener(this.instancePreferencesListener);
		 * this.preferencesLookup[PREF_INSTANCE] = null; String
		 * resourcesPluginId = ResourcesPlugin.getPlugin().getBundle()
		 * .getSymbolicName(); InstanceScope.INSTANCE.getNode(resourcesPluginId)
		 * .removePreferenceChangeListener(this.resourcesPropertyListener);
		 */

		// wait for the initialization job to finish
		try {
			Job.getJobManager().join(ChefCore.PLUGIN_ID, null);
		} catch (InterruptedException e) {
			// ignore
		}

	}

	public void startup() {

		// initialize Java model cache
		// this.cache = new JavaModelCache();

		// request state folder creation (workaround 19885)
		// JavaCore.getPlugin().getStateLocation();

		// Initialize eclipse preferences
		// initializePreferences();

		Platform.getContentTypeManager().addContentTypeChangeListener(this);

		// listen for resource changes
		// this.deltaState.initializeRootsWithPreviousSession();

		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(this.deltaState,
		/*
		 * update spec in JavaCore#addPreProcessingResourceChangedListener(...)
		 * if adding more event types
		 */
		IResourceChangeEvent.POST_CHANGE);

		/*
		 * IResourceChangeEvent.PRE_BUILD | IResourceChangeEvent.POST_BUILD |
		 * IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_DELETE |
		 * IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_REFRESH
		 */

		// startIndexing();
	}

	@Override
	public void contentTypeChanged(ContentTypeChangeEvent event) {

	}

}
