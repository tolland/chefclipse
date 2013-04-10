package chefclipse.ui.handlers;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.internal.CompareEditor;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.handlers.HandlerUtil;

import chefclipse.ui.compare.ResourceCompareInput;

public class CompareWithHandler extends AbstractHandler {

	private ResourceCompareInput fInput;

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		IWorkbenchPage workbenchPage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();

		CompareConfiguration cc= new CompareConfiguration();
		// buffered merge mode: don't ask for confirmation
		// when switching between modified resources
		cc.setProperty(CompareEditor.CONFIRM_SAVE_PROPERTY, new Boolean(false));

		// uncomment following line to have separate outline view
		//cc.setProperty(CompareConfiguration.USE_OUTLINE_VIEW, new Boolean(true));

		fInput = new ResourceCompareInput(cc);

		boolean ok = fInput.setSelection(selection, workbenchPage
				.getWorkbenchWindow().getShell(), true);
		if (!ok) {
			return null;
		}
		fInput.getCompareConfiguration();
		//if (fInput != null) {
		// Pass the shell so setSelection can prompt the user for which
		// resource should be the ancestor
		// boolean ok = fInput.setSelection(selection, fWorkbenchPage
		// .getWorkbenchWindow().getShell(), showSelectAncestorDialog);
		// if (!ok) {
		// return;
		// }
		// fInput.initializeCompareConfiguration();
		CompareUI.openCompareEditorOnPage(fInput, workbenchPage);
		fInput= null;	// don't reuse this input!
		return null;
	}

}
