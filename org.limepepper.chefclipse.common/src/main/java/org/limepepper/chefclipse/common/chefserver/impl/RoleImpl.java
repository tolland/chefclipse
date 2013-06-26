/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.DescribedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getRun_list_items <em>Run list items</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getRun_list <em>Run list</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends DescribedObjectImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.ROLE;
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
	@SuppressWarnings("unchecked")
	public EList<RunList> getRun_list() {
		return (EList<RunList>) eGet(
				ChefserverPackage.Literals.RUN_LIST__RUN_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return (Server) eGet(ChefserverPackage.Literals.RUN_LIST__SERVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		eSet(ChefserverPackage.Literals.RUN_LIST__SERVER, newServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>) eGet(
				ChefserverPackage.Literals.ROLE__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return (Environment) eGet(
				ChefserverPackage.Literals.RUN_LIST__ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		eSet(ChefserverPackage.Literals.RUN_LIST__ENVIRONMENT, newEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Recipe> getRecipes() {
		return (EList<Recipe>) eGet(
				ChefserverPackage.Literals.RUN_LIST__RECIPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getRun_list_items() {
		return (EList<String>) eGet(
				ChefserverPackage.Literals.RUN_LIST__RUN_LIST_ITEMS, true);
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
			case ChefserverPackage.ROLE__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case ChefserverPackage.ROLE__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
			}
		}
		if (baseClass == RunListItem.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == RunList.class) {
			switch (derivedFeatureID) {
			case ChefserverPackage.ROLE__ENVIRONMENT:
				return ChefserverPackage.RUN_LIST__ENVIRONMENT;
			case ChefserverPackage.ROLE__RECIPES:
				return ChefserverPackage.RUN_LIST__RECIPES;
			case ChefserverPackage.ROLE__RUN_LIST_ITEMS:
				return ChefserverPackage.RUN_LIST__RUN_LIST_ITEMS;
			case ChefserverPackage.ROLE__RUN_LIST:
				return ChefserverPackage.RUN_LIST__RUN_LIST;
			case ChefserverPackage.ROLE__SERVER:
				return ChefserverPackage.RUN_LIST__SERVER;
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
				return ChefserverPackage.ROLE__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return ChefserverPackage.ROLE__ID;
			default:
				return -1;
			}
		}
		if (baseClass == RunListItem.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == RunList.class) {
			switch (baseFeatureID) {
			case ChefserverPackage.RUN_LIST__ENVIRONMENT:
				return ChefserverPackage.ROLE__ENVIRONMENT;
			case ChefserverPackage.RUN_LIST__RECIPES:
				return ChefserverPackage.ROLE__RECIPES;
			case ChefserverPackage.RUN_LIST__RUN_LIST_ITEMS:
				return ChefserverPackage.ROLE__RUN_LIST_ITEMS;
			case ChefserverPackage.RUN_LIST__RUN_LIST:
				return ChefserverPackage.ROLE__RUN_LIST;
			case ChefserverPackage.RUN_LIST__SERVER:
				return ChefserverPackage.ROLE__SERVER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleImpl
