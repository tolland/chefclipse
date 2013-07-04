package chefclipse.internal.ui.navigator;

import org.eclipse.compare.ITypedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

public class MenuLevelHolder implements ITypedElement {
	EObject parentElement;
	String label;
	Object[] children;

	public String getLabel() {
		return label;
	}

	public Object[] getChildren() {
		return children;
	}

	public MenuLevelHolder(@NonNull String name,
			@NonNull EList<? extends CookbookFile> eList) {
		label = name;
		children = eList.toArray();
	}

	public MenuLevelHolder(@NonNull EList<CookbookVersion> eList,
			@NonNull String name) {
		label = name;
		children = eList.toArray();
	}

	@Override
	public String getName() {

		return getLabel();
	}

	@Override
	public Image getImage() {
		
		return null;
	}

	@Override
	public String getType() {

		return ITypedElement.FOLDER_TYPE;
	}

}