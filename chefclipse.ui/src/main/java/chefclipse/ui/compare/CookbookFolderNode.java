package chefclipse.ui.compare;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.compare.ITypedElement;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Root_file;

import chefclipse.internal.ui.navigator.MenuLevelHolder;
import chefclipse.ui.ChefPlugin;

public class CookbookFolderNode extends CookbookResourceNode {

	List<Object> children = new ArrayList<Object>();

	boolean serverCookbook = false;

	public CookbookFolderNode(CookbookVersion input) {
		this(input, "root");
		recurseInput(input);
	}

	public CookbookFolderNode(ServerCookbookVersion input) {
		this(input, "root");
		serverCookbook = true;
		recurseInput(input);
	}

	public CookbookFolderNode(EObject input, String name) {
		super(name);
	}

	public Object[] getChildren() {

		return children.toArray();
	}

	public String getType() {
		return ITypedElement.FOLDER_TYPE;
	}

	private void recurseInput(EObject input) {
		if (input instanceof CookbookVersion) {
			ChefPlugin.log("recursing local elements of input: "
					+ ((CookbookVersion) input).getName());

			CookbookVersion cookbookVersion = (CookbookVersion) input;

			for (EObject iterable_element : cookbookVersion.eContents()) {
				ChefPlugin.log("iterable  " + iterable_element.eClass());
			}

			for (Root_file iterable_element : ((CookbookVersion) input)
					.getRoot_files()) {
				ChefPlugin.log("adding " + iterable_element.getName());
				children.add(new CookbookFileNode(iterable_element));
			}
			children.add(new CookbookCollectionNode("recipes",
					((CookbookVersion) input).getRecipes().toArray()));

			children.add(new CookbookCollectionNode("templates",
					((CookbookVersion) input).getTemplates().toArray()));

			children.add(new CookbookCollectionNode("files",
					((CookbookVersion) input).getFiles().toArray()));

			children.add(new CookbookCollectionNode("attributes",
					((CookbookVersion) input).getAttributes().toArray()));

			children.add(new CookbookCollectionNode("definitions",
					((CookbookVersion) input).getDefinitions().toArray()));

			children.add(new CookbookCollectionNode("libraries",
					((CookbookVersion) input).getLibraries().toArray()));

		} else if (input instanceof ServerCookbookFile) {

			children.add(new CookbookFileNode((ServerCookbookFile) input));
		} else if (input instanceof ServerCookbookFile) {

			children.add(new CookbookFileNode((CookbookFile) input));

		} else if (input instanceof MenuLevelHolder) {

			for (Object item : ((MenuLevelHolder) input).getChildren()) {
				children.add(new CookbookFileNode((CookbookFile) item));
			}

		}
	}

}