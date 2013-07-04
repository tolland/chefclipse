package org.limepepper.chefclipse.spy;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class EMFSpyDialog extends PopupDialog {

	private ExecutionEvent event;
	private Point fAnchor;
	private Composite composite;
	private FormToolkit toolkit;

	private class CloseAction extends Action {
		public ImageDescriptor getImageDescriptor() {
			return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE);
		}

		public void run() {
			close();
		}
	}

	public EMFSpyDialog(Shell parent, ExecutionEvent event, Point point) {
		super(parent, SWT.NONE, true, true, false, false, false, null, null);
		this.event = event;
		this.fAnchor = point;
		this.toolkit = new FormToolkit(Display.getDefault());
	}

	protected Control createContents(Composite parent) {
		getShell().setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY));
		initializeBounds();
		return createDialogArea(parent);
	}

	protected Control createDialogArea(Composite parent) {
		this.composite = (Composite) super.createDialogArea(parent);

		ScrolledForm form = toolkit.createScrolledForm(composite);
		toolkit.decorateFormHeading(form.getForm());

		form.setText("Chefclipse EMF spy");
		form.getToolBarManager().add(new CloseAction());
		form.getToolBarManager().update(true);

		form.getBody().setLayout(new GridLayout());

		ActiveSelectionSection section = new ActiveSelectionSection();
		section.build(form, toolkit, event);

		parent.pack();
		return composite;
	}

	protected Point getInitialLocation(Point size) {
		if (fAnchor == null) {
			return super.getInitialLocation(size);
		}
		Point point = fAnchor;
		Rectangle monitor = getShell().getMonitor().getClientArea();
		if (monitor.width < point.x + size.x) {
			point.x = Math.max(0, point.x - size.x);
		}
		if (monitor.height < point.y + size.y) {
			point.y = Math.max(0, point.y - size.y);
		}
		return point;
	}

	public boolean close() {
		if (toolkit != null)
			toolkit.dispose();
		toolkit = null;
		return super.close();
	}

	protected Control getFocusControl() {
		return this.composite;
	}

}
