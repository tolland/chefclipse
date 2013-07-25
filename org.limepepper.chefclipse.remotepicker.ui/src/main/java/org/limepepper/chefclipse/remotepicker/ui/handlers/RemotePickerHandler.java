/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.handlers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.DiscoveryCore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.ui.progress.IProgressConstants2;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogRegistry;
import org.limepepper.chefclipse.remotepicker.ui.preferences.RemotePickerPreferencePage;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookCatalogConfiguration;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookDiscoveryWizard;

/**
 * Handler that configures and opens the remote picker wizard.
 * 
 * @author Sebastian Sampaoli
 *
 */
@SuppressWarnings("restriction")
public class RemotePickerHandler extends AbstractHandler {

	private static WizardDialog dialog;
		
	private static final String DISCOVERY_DESCRIPTION = "Select cookbooks to install and press Finish to proceed with installation.\n" +
			"Press the information button to see an overview and link to more information.";
	
	private static final String CHEFCLIPSE_COOKBOOK_DISCOVERY = "Chefclipse Cookbook Discovery";
	
	protected static final Object JOBS_FAMILY = "Cookbook Repositories";

	public RemotePickerHandler() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		
		openRemotePicker(shell);
		
		return null;
	}

	/**
	 * Opens remote picker dialog and keeps track of the opened instance.
	 * @param shell 
	 */
	public static void openRemotePicker(Shell shell) {
		if (dialog != null) {
			dialog.close();
		}
		
		Catalog catalog = new Catalog();
		catalog.setEnvironment(DiscoveryCore.createEnvironment());
		catalog.setVerifyUpdateSiteAvailability(false);

		CookbookCatalogConfiguration configuration = new CookbookCatalogConfiguration();
		configuration.setShowInstalled(false);
		configuration.setShowInstalledFilter(false);
		configuration.setShowTagFilter(false);
		configuration.setVerifyUpdateSiteAvailability(false);
		configuration.setShowCategories(true);
		
		CatalogRegistry catalogRegistry = new CatalogRegistry();
		
		catalogRegistry.installRepositories();
		configuration.getCatalogDescriptors().addAll(catalogRegistry.getCatalogDescriptors());

		CookbookDiscoveryWizard wizard = new CookbookDiscoveryWizard(catalog, configuration);
		wizard.getCatalogPage().setTitle(CHEFCLIPSE_COOKBOOK_DISCOVERY);
		wizard.getCatalogPage().setDescription(DISCOVERY_DESCRIPTION);
		
		if (shell == null) {
			shell = Display.getCurrent().getActiveShell();
		}
		
		dialog = new WizardDialog(shell, wizard) {
			@Override
			protected Point getInitialSize() {
				Point size = super.getInitialSize();
				Rectangle parent = getParentShell().getBounds();
				if (size.y > parent.height) {
					size.y = parent.height;
				}
				return size;
			}
		};
		dialog.setBlockOnOpen(false);
		dialog.open();
		dialog.getShell().addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				dialog = null;
			}
		});
	}
	
	static class PrefsListener implements IPropertyChangeListener {
		boolean needsReopen = false;
		
		@Override
		public void propertyChange(PropertyChangeEvent event) {
			needsReopen = true;
		}
	}
	
	/**
	 * Opens Remotepicker preference page.
	 * After closing it, it will redraw the remotepicker if needed.
	 * @param fromPicker if it was opened from the remotepicker itself
	 */
	public static void openPreferences(boolean fromPicker) {
		PrefsListener listener = new PrefsListener();
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(listener);

		PreferenceDialog dlg = PreferencesUtil.createPreferenceDialogOn(null,
				RemotePickerPreferencePage.ID,
				new String[] { RemotePickerPreferencePage.ID },
				null);
		dlg.open();
		
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener(listener);
		if (fromPicker && dialog != null && listener.needsReopen) {
			openRemotePicker(null);
		}
	}

	/**
	 * Starts loading the given repository.
	 * @param repo
	 * @return the scheduled job
	 */
	public static Job startRepositoryJob(final RemoteRepository repo, final CookbookRepositoryManager repoManager) {
		enableRepository(repo);
		Job job = new Job("Retrieving Cookbooks from respository \"" + repo.getName()+ "\"") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Retrieving cookbooks", IProgressMonitor.UNKNOWN);
				ExecutorService ex = Executors.newSingleThreadExecutor();
				ex.execute(new Runnable() {
					@Override public void run() {
						try {
							repoManager.loadRepository(repo.getId());
						} catch (InstallCookbookException e) {
							// error already logged
						}
					}
				});
				ex.shutdown();
				try {
					while (!ex.awaitTermination(300, TimeUnit.MILLISECONDS)) {
						if (monitor.isCanceled()) 
							throw new InterruptedException();
					}
				} catch (InterruptedException e) {
					ex.shutdownNow();
					return Status.CANCEL_STATUS;
				}
				monitor.done();
				return Status.OK_STATUS;
			}
			
			@Override
			public boolean belongsTo(Object family) {
				return family == JOBS_FAMILY;
			}
		};
		
		try {
			ImageDescriptor image = ImageDescriptor.createFromURL(new URL(repo.getIcon()));
			job.setProperty(IProgressConstants.ICON_PROPERTY, image);
		} catch (MalformedURLException e) {}
		job.setProperty(IProgressConstants2.SHOW_IN_TASKBAR_ICON_PROPERTY, Boolean.TRUE);
		job.schedule();
		return job;
	}

	/**
	 * Enables the repository by default.
	 * @param repo
	 */
	public static void enableRepository(final RemoteRepository repo) {
		Activator.getDefault().getPreferenceStore().setDefault(repo.getId(), true);
	}

}
