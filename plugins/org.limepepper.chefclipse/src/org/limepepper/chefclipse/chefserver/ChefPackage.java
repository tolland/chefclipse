/**
 */
package org.limepepper.chefclipse.chefserver;

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
 * @see org.limepepper.chefclipse.chefserver.ChefFactory
 * @model kind="package"
 * @generated
 */
public interface ChefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chefserver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://limepepper.org/chefclipse/0.0.1/chefserver";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chefserver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChefPackage eINSTANCE = org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.EnvironmentImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 0;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.DataBagImpl <em>Data Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.DataBagImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getDataBag()
	 * @generated
	 */
	int DATA_BAG = 1;

	/**
	 * The number of structural features of the '<em>Data Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.RoleImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.NodeImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Run list</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RUN_LIST = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.ServerImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 4;

	/**
	 * The feature id for the '<em><b>Cookbooks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__COOKBOOKS = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ROLES = 1;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.OhaiImpl <em>Ohai</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.OhaiImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getOhai()
	 * @generated
	 */
	int OHAI = 5;

	/**
	 * The number of structural features of the '<em>Ohai</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHAI_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.PlatformImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 6;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.RunListImpl <em>Run List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.RunListImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getRunList()
	 * @generated
	 */
	int RUN_LIST = 7;

	/**
	 * The number of structural features of the '<em>Run List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_LIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.ChefConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefConfigImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getChefConfig()
	 * @generated
	 */
	int CHEF_CONFIG = 8;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEF_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefserver.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefserver.impl.SearchImpl
	 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 9;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.DataBag <em>Data Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bag</em>'.
	 * @see org.limepepper.chefclipse.chefserver.DataBag
	 * @generated
	 */
	EClass getDataBag();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.chefserver.Node#getRun_list <em>Run list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run list</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Node#getRun_list()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Run_list();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.chefserver.Server#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Server#getCookbooks()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Cookbooks();

	/**
	 * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.chefserver.Server#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Server#getRoles()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Roles();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Ohai <em>Ohai</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ohai</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Ohai
	 * @generated
	 */
	EClass getOhai();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.RunList <em>Run List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run List</em>'.
	 * @see org.limepepper.chefclipse.chefserver.RunList
	 * @generated
	 */
	EClass getRunList();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.ChefConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.chefserver.ChefConfig
	 * @generated
	 */
	EClass getChefConfig();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefserver.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.limepepper.chefclipse.chefserver.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChefFactory getChefFactory();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.EnvironmentImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.DataBagImpl <em>Data Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.DataBagImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getDataBag()
		 * @generated
		 */
		EClass DATA_BAG = eINSTANCE.getDataBag();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.RoleImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.NodeImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Run list</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__RUN_LIST = eINSTANCE.getNode_Run_list();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.ServerImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__COOKBOOKS = eINSTANCE.getServer_Cookbooks();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__ROLES = eINSTANCE.getServer_Roles();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.OhaiImpl <em>Ohai</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.OhaiImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getOhai()
		 * @generated
		 */
		EClass OHAI = eINSTANCE.getOhai();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.PlatformImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.RunListImpl <em>Run List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.RunListImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getRunList()
		 * @generated
		 */
		EClass RUN_LIST = eINSTANCE.getRunList();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.ChefConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefConfigImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getChefConfig()
		 * @generated
		 */
		EClass CHEF_CONFIG = eINSTANCE.getChefConfig();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefserver.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefserver.impl.SearchImpl
		 * @see org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

	}

} //ChefPackage
