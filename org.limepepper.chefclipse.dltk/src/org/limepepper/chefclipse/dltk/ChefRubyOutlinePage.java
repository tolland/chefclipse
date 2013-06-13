package org.limepepper.chefclipse.dltk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.ruby.internal.ui.editor.RubyOutlinePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.limepepper.chefclipse.dltk.model.ChefParser;
import org.limepepper.chefclipse.dltk.model.ModelRoot;
import org.limepepper.chefclipse.dltk.model.Resource;

public class ChefRubyOutlinePage extends RubyOutlinePage {

	private static class DelegatingLabelProvider implements ILabelProvider {

		private final ILabelProvider wrapped;

		public DelegatingLabelProvider(ILabelProvider wrapped) {
			this.wrapped = wrapped;
		}

		public Image getImage(Object element) {
			if (element instanceof Resource) {
				return Activator.getDefault().getImageRegistry()
						.get(Activator.CHEFCLIPSE_ICON);
			}
			return wrapped.getImage(element);
		}

		public String getText(Object element) {
			if (element instanceof Resource) {
				return ((Resource) element).getDisplayName();
			}
			return wrapped.getText(element);
		}

		public void addListener(ILabelProviderListener listener) {
			wrapped.addListener(listener);
		}

		public void dispose() {
			wrapped.dispose();
		}

		public boolean isLabelProperty(Object element, String property) {
			return wrapped.isLabelProperty(element, property);
		}

		public void removeListener(ILabelProviderListener listener) {
			wrapped.removeListener(listener);
		}
	}

	private static class DelegatingContentProvider implements
			ITreeContentProvider {

		private final ITreeContentProvider wrapped;

		private ChefParser parser = new ChefParser();

		public Object[] getElements(Object inputElement) {
			List elements = new ArrayList();
			elements.addAll(Arrays.asList(wrapped.getElements(inputElement)));

			if (inputElement instanceof ISourceModule) {
				ISourceModule sourceModule = (ISourceModule) inputElement;
				ModelRoot modelRoot = parser.parse(sourceModule);
				for (Resource resource : modelRoot.getResources()) {
					elements.add(resource);
				}
			}

			return elements.toArray();
		}

		public void dispose() {
			wrapped.dispose();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			wrapped.inputChanged(viewer, oldInput, newInput);
		}

		public Object[] getChildren(Object parentElement) {
			return wrapped.getChildren(parentElement);
		}

		public Object getParent(Object element) {
			return wrapped.getParent(element);
		}

		public boolean hasChildren(Object element) {
			return wrapped.hasChildren(element);
		}

		public DelegatingContentProvider(ITreeContentProvider wrapped) {
			this.wrapped = wrapped;
		}
	}

	public ChefRubyOutlinePage(ScriptEditor editor, IPreferenceStore store) {
		super(editor, store);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		ScriptOutlineViewer viewer = getOutlineViewer();

		ITreeContentProvider contentProvider = (ITreeContentProvider) viewer
				.getContentProvider();
		viewer.setContentProvider(new DelegatingContentProvider(contentProvider));

		ILabelProvider labelProvider = (ILabelProvider) viewer
				.getLabelProvider();
		viewer.setLabelProvider(new DelegatingLabelProvider(labelProvider));
	}
}
