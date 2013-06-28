/**
 */
package org.limepepper.chefclipse.common.workstation.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.CookbooksFolder;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.DescribedObjectImpl;
=======
import org.limepepper.chefclipse.impl.DescribedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getOS <em>OS</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getCookbooks <em>Cookbooks</em>}</li>
<<<<<<< HEAD
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getKnives <em>Knives</em>}</li>
=======
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getKnife <em>Knife</em>}</li>
>>>>>>> origin/tomhodder
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getCookbookFolders <em>Cookbook Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends DescribedObjectImpl implements Repository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkstationPackage.Literals.REPOSITORY;
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
	public String getOS() {
<<<<<<< HEAD
		return (String) eGet(WorkstationPackage.Literals.REPOSITORY__OS, true);
=======
		return (String)eGet(WorkstationPackage.Literals.REPOSITORY__OS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS(String newOS) {
		eSet(WorkstationPackage.Literals.REPOSITORY__OS, newOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasepath() {
<<<<<<< HEAD
		return (String) eGet(WorkstationPackage.Literals.REPOSITORY__BASEPATH,
				true);
=======
		return (String)eGet(WorkstationPackage.Literals.REPOSITORY__BASEPATH, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasepath(String newBasepath) {
		eSet(WorkstationPackage.Literals.REPOSITORY__BASEPATH, newBasepath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CookbookVersion> getCookbooks() {
<<<<<<< HEAD
		return (EList<CookbookVersion>) eGet(
				WorkstationPackage.Literals.REPOSITORY__COOKBOOKS, true);
=======
		return (EList<CookbookVersion>)eGet(WorkstationPackage.Literals.REPOSITORY__COOKBOOKS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
<<<<<<< HEAD
	public EList<KnifeConfig> getKnives() {
		return (EList<KnifeConfig>) eGet(
				WorkstationPackage.Literals.REPOSITORY__KNIVES, true);
=======
	public EList<KnifeConfig> getKnife() {
		return (EList<KnifeConfig>)eGet(WorkstationPackage.Literals.REPOSITORY__KNIFE, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CookbooksFolder> getCookbookFolders() {
<<<<<<< HEAD
		return (EList<CookbooksFolder>) eGet(
				WorkstationPackage.Literals.REPOSITORY__COOKBOOK_FOLDERS, true);
=======
		return (EList<CookbooksFolder>)eGet(WorkstationPackage.Literals.REPOSITORY__COOKBOOK_FOLDERS, true);
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
			case WorkstationPackage.REPOSITORY__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case WorkstationPackage.REPOSITORY__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
=======
				case WorkstationPackage.REPOSITORY__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case WorkstationPackage.REPOSITORY__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
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
				return WorkstationPackage.REPOSITORY__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return WorkstationPackage.REPOSITORY__ID;
			default:
				return -1;
=======
				case ChefclipsePackage.NAMED_OBJECT__NAME: return WorkstationPackage.REPOSITORY__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return WorkstationPackage.REPOSITORY__ID;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RepositoryImpl
