/**
 *
 */
package org.limepepper.chefclipse.remotepicker.ui.handlers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.ui.progress.IProgressConstants2;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.CatalogRegistry;
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

	private List<CatalogDescriptor> catalogDescriptors;

	private static final String DISCOVERY_DESCRIPTION = "Select cookbooks to install and press Finish to proceed with installation.\n"
			+ "Press the information button to see an overview and link to more information.";

	private static final String CHEFCLIPSE_COOKBOOK_DISCOVERY = "Chefclipse Cookbook Discovery";

	protected static final Object JOBS_FAMILY = "Cookbook Repositories";

	/**
	 *
	 */
	public RemotePickerHandler() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
	 * ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

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

		if (catalogDescriptors == null || catalogDescriptors.isEmpty()) {
			catalogRegistry.installRepositories();
			configuration.getCatalogDescriptors().addAll(
					catalogRegistry.getCatalogDescriptors());
		} else {
			configuration.getCatalogDescriptors().addAll(catalogDescriptors);
		}

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		CookbookDiscoveryWizard wizard = new CookbookDiscoveryWizard(catalog,
				configuration);
		wizard.init(
				window.getWorkbench(),
				selection instanceof IStructuredSelection ? (IStructuredSelection) selection
						: StructuredSelection.EMPTY);
		wizard.getCatalogPage().setTitle(CHEFCLIPSE_COOKBOOK_DISCOVERY);
		wizard.getCatalogPage().setDescription(DISCOVERY_DESCRIPTION);

		WizardDialog dialog = new WizardDialog(Display.getCurrent()
				.getActiveShell(), wizard);
		dialog.open();

		return null;
	}

	/**
	 * @param repo
	 */
	public static void startRepositoryJob(final RemoteRepository repo,
			final CookbookRepositoryManager repoManager) {
		enableRepository(repo);
		Job job = new Job("Retrieving Cookbooks from respository \""
				+ repo.getName() + "\"") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Retrieving cookbooks",
						IProgressMonitor.UNKNOWN);
				ExecutorService ex = Executors.newSingleThreadExecutor();
				ex.execute(new Runnable() {
					@Override
					public void run() {
						repoManager.loadRepository(repo.getId());
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
			ImageDescriptor image = ImageDescriptor.createFromURL(new URL(repo
					.getIcon()));
			job.setProperty(IProgressConstants.ICON_PROPERTY, image);
		} catch (MalformedURLException e) {
		}
		job.setProperty(IProgressConstants2.SHOW_IN_TASKBAR_ICON_PROPERTY,
				Boolean.TRUE);
		job.schedule();
	}

	/**
	 * Enables the repository by default.
	 *
	 * @param repo
	 */
	public static void enableRepository(final RemoteRepository repo) {
		Activator.getDefault().getPreferenceStore()
				.setDefault(repo.getId(), true);
	}

}
