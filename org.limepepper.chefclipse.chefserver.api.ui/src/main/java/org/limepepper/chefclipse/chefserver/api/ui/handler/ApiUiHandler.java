package org.limepepper.chefclipse.chefserver.api.ui.handler;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.chefserver.api.ui.editors.RunListEditorInput;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiUiHandler extends AbstractHandler implements IHandler {

	private Logger logger = LoggerFactory.getLogger(ApiUiHandler.class);

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
		final IStructuredSelection selection = (IStructuredSelection) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		final IWorkbenchPage workbenchPage = HandlerUtil
				.getActiveWorkbenchWindow(event).getActivePage();
		final Object item = selection.getFirstElement();
		final String name = event.getParameter("commandParameter1");

		Job job = new Job("My Job") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				KnifeConfigController api = KnifeConfigController.INSTANCE;
				System.err
						.println("execturing the chefclipse.chefserver.api.ui.command hanlder");

				if (name.equals("runlist.editor")) {

					logger.info("made the call");
					new Thread(new Runnable() {
						public void run() {
							while (true) {
								try {
									Thread.sleep(1000);
								} catch (Exception e) {
								}
								Display.getDefault().asyncExec(new Runnable() {
									public void run() {
										try {
											RunListEditorInput input = null;
											IWorkbenchPage page = PlatformUI
													.getWorkbench()
													.getActiveWorkbenchWindow()
													.getActivePage();
											if (page == null) {

												System.out
														.println("page is NULL");
											}
											IDE.openEditor(
													page,
													new RunListEditorInput((KnifeConfig) item,
															ChefserverFactory.eINSTANCE
																	.createNode()),
													"chefserver.api.ui.editors.RunListEditor",
													true);
										} catch (PartInitException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								});
							}
						}
					}).start();

				} else if (name.equals("connect.chefserver")) {

					if (item instanceof KnifeConfig) {

						logger.debug("here");

						api.getServer((KnifeConfig) item).getNodeList();

					}

				} else if (name.equals("connect.chefserver.knife")) {

					if (item instanceof KnifeConfig) {

						KnifeConfig knifeConfig = (KnifeConfig) item;

						logger.debug("here<------");

						List<ServerCookbookVersion> cookbooks = api.getServer(
								(KnifeConfig) item).getCookbooks();

						for (ServerCookbookVersion serverCookbookVersion : cookbooks) {
							knifeConfig.getServerCookbookVersion().add(
									serverCookbookVersion);
							knifeConfig.getServer().getCookbooks()
									.add(serverCookbookVersion);

						}

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
