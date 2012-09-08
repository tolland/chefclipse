/**
 */
package org.limepepper.chefclipse.workstation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.workstation.WorkstationFactory
 * @model kind="package"
 * @generated
 */
public interface WorkstationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workstation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://limepepper.org/chefclipse/workstation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.limepepepper.chefclipse.workstation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkstationPackage eINSTANCE = org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.workstation.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.workstation.impl.RepositoryImpl
	 * @see org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Cookbooks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COOKBOOKS = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.workstation.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.workstation.impl.ConfigImpl
	 * @see org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.workstation.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.limepepper.chefclipse.workstation.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.workstation.Repository#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.workstation.Repository#getCookbooks()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Cookbooks();

	/**
	 * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.workstation.Repository#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.limepepper.chefclipse.workstation.Repository#getConfiguration()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Configuration();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.workstation.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.workstation.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkstationFactory getWorkstationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.workstation.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.workstation.impl.RepositoryImpl
		 * @see org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COOKBOOKS = eINSTANCE.getRepository_Cookbooks();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONFIGURATION = eINSTANCE.getRepository_Configuration();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.workstation.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.workstation.impl.ConfigImpl
		 * @see org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

	}

} //WorkstationPackage
