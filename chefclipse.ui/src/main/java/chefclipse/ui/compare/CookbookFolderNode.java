package chefclipse.ui.compare;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IProject;
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

	private IProject project = null;

	public CookbookFolderNode(CookbookVersion input) {
		this(input, "root");
		recurseInput(input);
	}

	/**
	 *
	 * not put that much thought into this, so this is just a hack to associated
	 * the correct IProject with an arbitrary input
	 *
	 * @param input
	 * @param project
	 */
	public CookbookFolderNode(ServerCookbookVersion input, IProject project) {
		this(input, "root");
		this.project = project;
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

			CookbookVersion cookbookVersion = (CookbookVersion) input;

			for (Root_file iterable_element : cookbookVersion.getRoot_files()) {
				ChefPlugin.log("adding " + iterable_element.getName());
				children.add(new CookbookFileNode(iterable_element));
			}
			children.add(new CookbookCollectionNode("recipes",
					((CookbookVersion) input).getRecipes().toArray()));

			children.add(new CookbookCollectionNode("templates",
					((CookbookVersion) input).getTemplates().toArray()));

			children.add(new CookbookCollectionNode("attributes",
					((CookbookVersion) input).getAttributes().toArray()));

			children.add(new CookbookCollectionNode("definitions",
					((CookbookVersion) input).getDefinitions().toArray()));

			children.add(new CookbookCollectionNode("libraries",
					((CookbookVersion) input).getLibraries().toArray()));

		} else if (input instanceof ServerCookbookFile) {

			children.add(new CookbookFileNode((ServerCookbookFile) input,
					this.project));
		} else if (input instanceof ServerCookbookFile) {

			children.add(new CookbookFileNode((CookbookFile) input));

		} else if (input instanceof MenuLevelHolder) {

			for (Object item : ((MenuLevelHolder) input).getChildren()) {
				children.add(new CookbookFileNode((CookbookFile) item));
			}

		}
	}

}
