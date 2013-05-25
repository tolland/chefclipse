package chefclipse.internal.ui.navigator;

import java.text.Collator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class ChefResourceExtensionSorter extends ViewerSorter {

	public ChefResourceExtensionSorter() {
	}

	public ChefResourceExtensionSorter(Collator collator) {
		super(collator);
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {

		if (e1 instanceof EObject) {
			return -1;
		}
		return super.compare(viewer, e1, e2);
	}

}
