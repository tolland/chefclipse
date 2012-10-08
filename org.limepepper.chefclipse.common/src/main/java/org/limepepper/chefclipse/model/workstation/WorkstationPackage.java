/**
 */
package org.limepepper.chefclipse.model.workstation;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.limepepper.chefclipse.model.workstation.WorkstationFactory
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
	String eNS_PREFIX = "org.limepepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkstationPackage eINSTANCE = org.limepepper.chefclipse.model.workstation.impl.WorkstationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.workstation.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.workstation.impl.RepositoryImpl
	 * @see org.limepepper.chefclipse.model.workstation.impl.WorkstationPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Cookbooks</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OS = 2;

	/**
	 * The feature id for the '<em><b>Basepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BASEPATH = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.workstation.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.workstation.impl.ConfigImpl
	 * @see org.limepepper.chefclipse.model.workstation.impl.WorkstationPackageImpl#getConfig()
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
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.workstation.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.limepepper.chefclipse.model.workstation.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.workstation.Repository#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.model.workstation.Repository#getCookbooks()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Cookbooks();

	/**
	 * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.model.workstation.Repository#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.limepepper.chefclipse.model.workstation.Repository#getConfiguration()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.model.workstation.Repository#getOS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS</em>'.
	 * @see org.limepepper.chefclipse.model.workstation.Repository#getOS()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_OS();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.model.workstation.Repository#getBasepath <em>Basepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basepath</em>'.
	 * @see org.limepepper.chefclipse.model.workstation.Repository#getBasepath()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Basepath();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.workstation.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.model.workstation.Config
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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.workstation.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.workstation.impl.RepositoryImpl
		 * @see org.limepepper.chefclipse.model.workstation.impl.WorkstationPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OS = eINSTANCE.getRepository_OS();

		/**
		 * The meta object literal for the '<em><b>Basepath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__BASEPATH = eINSTANCE.getRepository_Basepath();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.workstation.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.workstation.impl.ConfigImpl
		 * @see org.limepepper.chefclipse.model.workstation.impl.WorkstationPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

	}

} //WorkstationPackage
