package org.limepepper.chefclipse.remotepicker.ui.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.internal.CompareEditor;
import org.eclipse.compare.rangedifferencer.RangeDifference;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;
import org.limepepper.chefclipse.remotepicker.ui.Activator;

@SuppressWarnings("restriction")
public class CompareWithRemotePickerHandler extends AbstractHandler {

	private ResourceCompareInput fInput;

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final IWorkbenchPage workbenchPage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();

		CompareConfiguration cc= new CompareConfiguration();
		cc.setLeftEditable(true);
		cc.setRightEditable(false);
		cc.setChangeIgnored(RangeDifference.CONFLICT, true);
		// buffered merge mode: don't ask for confirmation
		// when switching between modified resources
		cc.setProperty(CompareEditor.CONFIRM_SAVE_PROPERTY, new Boolean(false));
		// uncomment following line to have separate outline view
		cc.setProperty(CompareConfiguration.USE_OUTLINE_VIEW, new Boolean(true));

		fInput = new ResourceCompareInput(cc);

		IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
		try {
			progressService.busyCursorWhile(new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					boolean ok = false;
					try {
						monitor.beginTask("Comparing with origin cookbook", IProgressMonitor.UNKNOWN);
						ok = fInput.setSelection(selection, workbenchPage
								.getWorkbenchWindow().getShell(), true);
					} finally {
						monitor.done();
					}
					if (ok) {
						fInput.initializeCompareConfiguration();
						
						CompareUI.openCompareEditorOnPage(fInput, workbenchPage);
						fInput= null;	// don't reuse this input!
					}
				}
			});
		} catch (InvocationTargetException e) {
			Activator.log(e);
		} catch (InterruptedException e) {
			Activator.log(e);
		}
		return null;
	}

}
