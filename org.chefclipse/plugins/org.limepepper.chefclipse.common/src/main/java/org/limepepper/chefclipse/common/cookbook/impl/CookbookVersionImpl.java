/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.DescribedObjectImpl;

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
public class CookbookVersionImpl extends DescribedObjectImpl implements
		CookbookVersion {
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
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(UtilityPackage.Literals.NAMED_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(UtilityPackage.Literals.NAMED_OBJECT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJson_class() {
		return (String) eGet(CookbookPackage.Literals.COOKBOOK__JSON_CLASS,
				true);
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
	public Environment getEnvironment() {
		return (Environment) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		eSet(CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT,
				newEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Template> getTemplates() {
		return (EList<Template>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__TEMPLATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Recipe> getRecipes() {
		return (EList<Recipe>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__RECIPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Definition> getDefinitions() {
		return (EList<Definition>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__DEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<File> getFiles() {
		return (EList<File>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__FILES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource> getResources() {
		return (EList<Resource>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Library> getLibraries() {
		return (EList<Library>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__LIBRARIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return (Metadata) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__METADATA, true);
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
		return (EList<Provider>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__PROVIDERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Root_file> getRoot_files() {
		return (EList<Root_file>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__ROOT_FILES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attributes> getAttributes() {
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
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return (String) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__CATALOG, true);
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
		return (EList<CookbookVersion>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__DEPENDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Map.Entry<String, String>> getMissing() {
		return (EList<Map.Entry<String, String>>) eGet(
				CookbookPackage.Literals.COOKBOOK_VERSION__MISSING, true);
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
			case CookbookPackage.COOKBOOK_VERSION__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case CookbookPackage.COOKBOOK_VERSION__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
			}
		}
		if (baseClass == Cookbook.class) {
			switch (derivedFeatureID) {
			case CookbookPackage.COOKBOOK_VERSION__JSON_CLASS:
				return CookbookPackage.COOKBOOK__JSON_CLASS;
			case CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE:
				return CookbookPackage.COOKBOOK__CHEF_TYPE;
			default:
				return -1;
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
			case UtilityPackage.NAMED_OBJECT__NAME:
				return CookbookPackage.COOKBOOK_VERSION__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return CookbookPackage.COOKBOOK_VERSION__ID;
			default:
				return -1;
			}
		}
		if (baseClass == Cookbook.class) {
			switch (baseFeatureID) {
			case CookbookPackage.COOKBOOK__JSON_CLASS:
				return CookbookPackage.COOKBOOK_VERSION__JSON_CLASS;
			case CookbookPackage.COOKBOOK__CHEF_TYPE:
				return CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CookbookVersionImpl
