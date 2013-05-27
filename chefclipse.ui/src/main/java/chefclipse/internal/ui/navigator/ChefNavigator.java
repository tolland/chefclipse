package chefclipse.internal.ui.navigator;

import java.util.List;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class ChefNavigator extends CommonNavigator implements
		ISelectionProvider {
	private PropertySheetPage propertySheetPage;
	private ComposedAdapterFactory adapterFactory;

	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else {
			return super.getAdapter(adapter);
		}
	}

	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new PropertySheetPage();
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		getCommonViewer().addSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		return getCommonViewer().getSelection();
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		getCommonViewer().removeSelectionChangedListener(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		getCommonViewer().setSelection(selection);
	}
	
	@Override
	public void dispose() {
		adapterFactory.dispose();
		super.dispose();
	}
}
