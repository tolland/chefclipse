/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.ecore.EClass;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.RecipeDescription;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.DescribedObjectImpl;
=======
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.RecipeDescription;
import org.limepepper.chefclipse.impl.DescribedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeDescriptionImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
<<<<<<< HEAD
public class RecipeDescriptionImpl extends DescribedObjectImpl implements
		RecipeDescription {
=======
public class RecipeDescriptionImpl extends DescribedObjectImpl implements RecipeDescription {
>>>>>>> origin/tomhodder
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.RECIPE_DESCRIPTION;
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
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
<<<<<<< HEAD
			case CookbookPackage.RECIPE_DESCRIPTION__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case CookbookPackage.RECIPE_DESCRIPTION__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
=======
				case CookbookPackage.RECIPE_DESCRIPTION__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case CookbookPackage.RECIPE_DESCRIPTION__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
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
				return CookbookPackage.RECIPE_DESCRIPTION__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return CookbookPackage.RECIPE_DESCRIPTION__ID;
			default:
				return -1;
=======
				case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.RECIPE_DESCRIPTION__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.RECIPE_DESCRIPTION__ID;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RecipeDescriptionImpl
