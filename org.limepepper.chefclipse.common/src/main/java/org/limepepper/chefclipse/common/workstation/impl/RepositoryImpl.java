/**
 */
package org.limepepper.chefclipse.common.workstation.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
import org.limepepper.chefclipse.impl.DescribedObjectImpl;

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
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl#getKnife <em>Knife</em>}</li>
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
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, newName);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getID() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setID(String newID) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, newID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getOS() {
		return (String)eGet(WorkstationPackage.Literals.REPOSITORY__OS, true);
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
		return (String)eGet(WorkstationPackage.Literals.REPOSITORY__BASEPATH, true);
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
		return (EList<CookbookVersion>)eGet(WorkstationPackage.Literals.REPOSITORY__COOKBOOKS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<KnifeConfig> getKnife() {
		return (EList<KnifeConfig>)eGet(WorkstationPackage.Literals.REPOSITORY__KNIFE, true);
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
				case WorkstationPackage.REPOSITORY__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case WorkstationPackage.REPOSITORY__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
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
				case ChefclipsePackage.NAMED_OBJECT__NAME: return WorkstationPackage.REPOSITORY__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return WorkstationPackage.REPOSITORY__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RepositoryImpl
