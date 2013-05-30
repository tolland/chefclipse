package org.limepepper.chefclipse.spy;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class EMFSpyHandler extends AbstractHandler {

	private EMFSpyDialog INSTANCE = null;

	public Object execute(ExecutionEvent event) {
		if (event != null) {
			if (INSTANCE != null && INSTANCE.getShell() != null && !INSTANCE.getShell().isDisposed()) {
				INSTANCE.close();
			}
			Shell shell = HandlerUtil.getActiveShell(event);
			EMFSpyDialog dialog = new EMFSpyDialog(shell, event, shell.getDisplay().getCursorLocation());
			INSTANCE = dialog;
			dialog.create();
			dialog.open();
		}
		return null;
	}

}
