package chefclipse.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.managers.ChefRepositoryManager;

public class UiHandler implements IHandler {

	private Logger logger = LoggerFactory.getLogger(UiHandler.class);
	ChefRepositoryManager chefRepositoryManager = ChefRepositoryManager.INSTANCE;

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		IStructuredSelection selection = (IStructuredSelection) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();

		final Object item = selection.getFirstElement();
		final String name = event.getParameter("commandParameter1");

		Job job = new Job("My Job") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				KnifeConfigController api = KnifeConfigController.INSTANCE;
				System.err.println("execturing the handler for the ui spot");

				if (name.equals("refresh.cookbookVersion")) {

					logger.info("made the call");

					System.out.println("item ius" + item);

					if (Platform.getAdapterManager().getAdapter(item,
							CookbookVersion.class) != null) {

						chefRepositoryManager.create(chefRepositoryManager
								.getResource((CookbookVersion) item));

					}

				} else if (name.equals("connect.chefserver")) {

					if (item instanceof KnifeConfig) {

						logger.debug("here");

						System.out.println(api.getServer((KnifeConfig) item)
								.getNodeList());

					}

				}

				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();

		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
