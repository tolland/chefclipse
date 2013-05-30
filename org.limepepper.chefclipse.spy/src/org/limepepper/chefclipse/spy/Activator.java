package org.limepepper.chefclipse.spy;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String ID = "org.limepepper.chefclipse.spy"; //$NON-NLS-1$

	private static Activator inst;
	private BundleContext fContext;

	public Activator() {
		inst = this;
	}

	public static IWorkbenchPage getActivePage() {
		return getDefault().internalGetActivePage();
	}

	public static Shell getActiveWorkbenchShell() {
		return getActiveWorkbenchWindow().getShell();
	}

	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow();
	}

	public static Activator getDefault() {
		return inst;
	}

	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}

	private IWorkbenchPage internalGetActivePage() {
		return getWorkbench().getActiveWorkbenchWindow().getActivePage();
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		this.fContext = context;
	}

	public BundleContext getBundleContext() {
		return this.fContext;
	}

	public static void log(Throwable e) {
		if (e instanceof InvocationTargetException)
			e = ((InvocationTargetException) e).getTargetException();
		IStatus status = null;
		if (e instanceof CoreException) {
			status = ((CoreException) e).getStatus();
		} else if (e.getMessage() != null) {
			status = new Status(IStatus.ERROR, ID, IStatus.OK, e.getMessage(), e);
		}
		if (status != null)
			getDefault().getLog().log(status);
	}
}
