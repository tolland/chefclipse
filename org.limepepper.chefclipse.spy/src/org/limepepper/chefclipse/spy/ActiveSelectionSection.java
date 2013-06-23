package org.limepepper.chefclipse.spy;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.handlers.HandlerUtil;

public class ActiveSelectionSection {

	public void build(ScrolledForm form, FormToolkit toolkit,
			ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return;
		}

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Shell shell = HandlerUtil.getActiveShell(event);
		if (selection != null && selection instanceof StructuredSelection && window.getShell() == shell) {
			Section section = toolkit.createSection(form.getBody(),
					ExpandableComposite.TITLE_BAR);
			section.clientVerticalSpacing = 9;
			section.setText("Active Selection");

			Tree tree = toolkit.createTree(section, SWT.MULTI | SWT.H_SCROLL
					| SWT.V_SCROLL);
			section.setClient(tree);
			
			GridDataFactory.fillDefaults().hint(500, 400).applyTo(section);

			TreeViewer viewer = createViewer(tree);
			viewer.setInput(((StructuredSelection)selection).getFirstElement());
		}
	}

	private TreeViewer createViewer(Tree tree) {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		
		TreeViewer viewer = new TreeViewer(tree);
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		return viewer;
	}

}
