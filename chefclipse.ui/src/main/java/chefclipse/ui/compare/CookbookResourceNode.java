package chefclipse.ui.compare;

import org.eclipse.compare.CompareUI;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.swt.graphics.Image;

abstract class CookbookResourceNode implements IStructureComparator,
		ITypedElement {

	private String fName;

	CookbookResourceNode(String name) {
		fName = name;
	}

	public String getName() {
		return fName;
	}

	public Image getImage() {
		return CompareUI.getImage(getType());
	}

	/*
	 * Returns true if other is ITypedElement and names are equal.
	 * 
	 * @see IComparator#equals
	 */
	public boolean equals2(Object other) {
		if (other instanceof ITypedElement)
			return fName.equals(((ITypedElement) other).getName());
		return super.equals(other);
	}

	public boolean equals(Object other) {

		boolean buff = equals2(other);
		System.out.println("buff was " + buff + " for "
				+ ((ITypedElement) other).getName());
		return buff;

	}

	public int hashCode() {
		return fName.hashCode();
	}

}