package chefclipse.ui.compare;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.internal.CompareEditor;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This is a temporary replacement for CompareWithOtherResourceAction which was
 * available from "Compare With > Other Resource...". See bug 264498.
 */
public class CompareAction extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IWorkbenchPage workbenchPage = HandlerUtil.getActiveWorkbenchWindow(
				event).getActivePage();

		// CompareAction#isEnabled(ISelection)
		CompareConfiguration cc = new CompareConfiguration();
		cc.setProperty(CompareEditor.CONFIRM_SAVE_PROPERTY, new Boolean(false));
		CookbookCompareInput input = new CookbookCompareInput(cc);

		int selectionSize = 0;
		if (selection instanceof IStructuredSelection) {
			selectionSize = ((IStructuredSelection) selection).toArray().length;
		}
		if (input.isEnabled(selection) || selectionSize == 1) {

			// CompareAction#run(ISelection)
			if (!input.setSelection(selection, workbenchPage
					.getWorkbenchWindow().getShell(), false))
				return null;
			input.initializeCompareConfiguration();
			CompareUI.openCompareEditorOnPage(input, workbenchPage);
		}
		return null;
	}
}