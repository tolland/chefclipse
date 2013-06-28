/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.cookbook.Attributes;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.File;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.common.cookbook.Provider;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.Resource;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.cookbook.Template;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.DescribedObjectImpl;
=======
import org.limepepper.chefclipse.impl.DescribedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getJson_class <em>Json class</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getChef_type <em>Chef type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getRoot_files <em>Root files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl#getMissing <em>Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
<<<<<<< HEAD
public class CookbookVersionImpl extends DescribedObjectImpl implements
		CookbookVersion {
=======
public class CookbookVersionImpl extends DescribedObjectImpl implements CookbookVersion {
>>>>>>> origin/tomhodder
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.COOKBOOK_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
<<<<<<< HEAD
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__NAME, true);
=======
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
<<<<<<< HEAD
		eSet(UtilityPackage.Literals.NAMED_OBJECT__NAME, newName);
=======
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, newName);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
<<<<<<< HEAD
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__ID, true);
=======
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
<<<<<<< HEAD
		eSet(UtilityPackage.Literals.NAMED_OBJECT__ID, newID);
=======
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, newID);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJson_class() {
<<<<<<< HEAD
		return (String) eGet(CookbookPackage.Literals.COOKBOOK__JSON_CLASS,
				true);
=======
		return (String)eGet(CookbookPackage.Literals.COOKBOOK__JSON_CLASS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJson_class(String newJson_class) {
		eSet(CookbookPackage.Literals.COOKBOOK__JSON_CLASS, newJson_class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Environment getEnvironment() {
		return (Environment) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT, true);
=======
	public String getChef_type() {
		return (String)eGet(CookbookPackage.Literals.COOKBOOK__CHEF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChef_type(String newChef_type) {
		eSet(CookbookPackage.Literals.COOKBOOK__CHEF_TYPE, newChef_type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return (Environment)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
<<<<<<< HEAD
		eSet(CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT,
				newEnvironment);
=======
		eSet(CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT, newEnvironment);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Template> getTemplates() {
<<<<<<< HEAD
		return (EList<Template>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__TEMPLATES, true);
=======
		return (EList<Template>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__TEMPLATES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Recipe> getRecipes() {
<<<<<<< HEAD
		return (EList<Recipe>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__RECIPES, true);
=======
		return (EList<Recipe>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__RECIPES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Definition> getDefinitions() {
<<<<<<< HEAD
		return (EList<Definition>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__DEFINITIONS, true);
=======
		return (EList<Definition>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__DEFINITIONS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<File> getFiles() {
<<<<<<< HEAD
		return (EList<File>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__FILES, true);
=======
		return (EList<File>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__FILES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource> getResources() {
<<<<<<< HEAD
		return (EList<Resource>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES, true);
=======
		return (EList<Resource>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Library> getLibraries() {
<<<<<<< HEAD
		return (EList<Library>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__LIBRARIES, true);
=======
		return (EList<Library>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__LIBRARIES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
<<<<<<< HEAD
		return (Metadata) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__METADATA, true);
=======
		return (Metadata)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__METADATA, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		eSet(CookbookPackage.Literals.COOKBOOK_VERSION__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Provider> getProviders() {
<<<<<<< HEAD
		return (EList<Provider>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__PROVIDERS, true);
=======
		return (EList<Provider>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__PROVIDERS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Root_file> getRoot_files() {
<<<<<<< HEAD
		return (EList<Root_file>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__ROOT_FILES, true);
=======
		return (EList<Root_file>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__ROOT_FILES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attributes> getAttributes() {
<<<<<<< HEAD
		return (EList<Attributes>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChef_type() {
		return (String) eGet(CookbookPackage.Literals.COOKBOOK__CHEF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChef_type(String newChef_type) {
		eSet(CookbookPackage.Literals.COOKBOOK__CHEF_TYPE, newChef_type);
=======
		return (EList<Attributes>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__ATTRIBUTES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
<<<<<<< HEAD
		return (String) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__CATALOG, true);
=======
		return (String)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__CATALOG, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		eSet(CookbookPackage.Literals.COOKBOOK_VERSION__CATALOG, newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CookbookVersion> getDepends() {
<<<<<<< HEAD
		return (EList<CookbookVersion>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__DEPENDS, true);
=======
		return (EList<CookbookVersion>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__DEPENDS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Map.Entry<String, String>> getMissing() {
<<<<<<< HEAD
		return (EList<Map.Entry<String, String>>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__MISSING, true);
=======
		return (EList<Map.Entry<String, String>>)eGet(CookbookPackage.Literals.COOKBOOK_VERSION__MISSING, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
<<<<<<< HEAD
			case CookbookPackage.COOKBOOK_VERSION__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case CookbookPackage.COOKBOOK_VERSION__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
=======
				case CookbookPackage.COOKBOOK_VERSION__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case CookbookPackage.COOKBOOK_VERSION__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		if (baseClass == Cookbook.class) {
			switch (derivedFeatureID) {
<<<<<<< HEAD
			case CookbookPackage.COOKBOOK_VERSION__JSON_CLASS:
				return CookbookPackage.COOKBOOK__JSON_CLASS;
			case CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE:
				return CookbookPackage.COOKBOOK__CHEF_TYPE;
			default:
				return -1;
=======
				case CookbookPackage.COOKBOOK_VERSION__JSON_CLASS: return CookbookPackage.COOKBOOK__JSON_CLASS;
				case CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE: return CookbookPackage.COOKBOOK__CHEF_TYPE;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
<<<<<<< HEAD
			case UtilityPackage.NAMED_OBJECT__NAME:
				return CookbookPackage.COOKBOOK_VERSION__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return CookbookPackage.COOKBOOK_VERSION__ID;
			default:
				return -1;
=======
				case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.COOKBOOK_VERSION__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.COOKBOOK_VERSION__ID;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		if (baseClass == Cookbook.class) {
			switch (baseFeatureID) {
<<<<<<< HEAD
			case CookbookPackage.COOKBOOK__JSON_CLASS:
				return CookbookPackage.COOKBOOK_VERSION__JSON_CLASS;
			case CookbookPackage.COOKBOOK__CHEF_TYPE:
				return CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE;
			default:
				return -1;
=======
				case CookbookPackage.COOKBOOK__JSON_CLASS: return CookbookPackage.COOKBOOK_VERSION__JSON_CLASS;
				case CookbookPackage.COOKBOOK__CHEF_TYPE: return CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CookbookVersionImpl
