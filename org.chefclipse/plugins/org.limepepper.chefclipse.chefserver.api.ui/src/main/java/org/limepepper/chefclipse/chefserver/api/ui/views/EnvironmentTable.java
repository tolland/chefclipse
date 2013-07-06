package org.limepepper.chefclipse.chefserver.api.ui.views;

import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.common.chefserver.Environment;

import chefclipse.core.providers.ChefProjectAdapterFactory;

public class EnvironmentTable extends Composite {

	private TableViewer viewer;
	private Table table;
	private ChefServerApi api;

	public EnvironmentTable(Composite parent, ChefServerApi api) {
		super(parent, SWT.NONE);
		setLayout(new FillLayout());

		this.api = api;

		viewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);

		viewer.setContentProvider(new EnvironmentContentProvider());
		viewer.setLabelProvider(new EnvironmentLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.getTable().setLinesVisible(true);
		viewer.setInput(api.getEnvironments());
	}

	@Override
	public void setMenu(Menu menu) {
		super.setMenu(menu);

		viewer.getTable().setMenu(menu);
	}

	class NameSorter extends ViewerSorter {
	}

	class EnvironmentLabelProvider extends AdapterFactoryLabelProvider {

		public EnvironmentLabelProvider() {
			super(ChefProjectAdapterFactory.getAdapterFactory());
		}

		public String getText(Object element) {

			return super.getText(element);
		}

		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class EnvironmentContentProvider extends AdapterFactoryContentProvider {
		EnvironmentContentProvider() {
			super(ChefProjectAdapterFactory.getAdapterFactory());
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			List<Environment> environments = (List<Environment>) inputElement;
			return environments.toArray(new Environment[environments.size()]);
		}
	}
}
