package chefclipse.ui.compare;

import java.util.ArrayList;

import org.eclipse.compare.ITypedElement;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;

public class CookbookCollectionNode extends CookbookResourceNode {

	ArrayList<Object> children = new ArrayList<Object>();

	CookbookCollectionNode(String name, Object[] elements) {
		super(name);
		for (Object object : elements) {
			if (object instanceof CookbookFile) {
				children.add(new CookbookFileNode((CookbookFile) object));
			}
		}
	}

	@Override
	public Object[] getChildren() {
		return children.toArray();
	}

	@Override
	public String getType() {
		return ITypedElement.FOLDER_TYPE;
	}

}
