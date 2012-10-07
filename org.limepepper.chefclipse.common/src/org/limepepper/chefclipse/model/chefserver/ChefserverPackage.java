/**
 */
package org.limepepper.chefclipse.model.chefserver;

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
 * @see org.limepepper.chefclipse.model.chefserver.ChefserverFactory
 * @model kind="package"
 * @generated
 */
public interface ChefserverPackage extends EPackage {
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
	String eNS_PREFIX = "org.limepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChefserverPackage eINSTANCE = org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.EnvironmentImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getEnvironment()
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.DataBagImpl <em>Data Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.DataBagImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getDataBag()
	 * @generated
	 */
	int DATA_BAG = 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__SERVER = 0;

	/**
	 * The number of structural features of the '<em>Data Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.RoleImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getRole()
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.NodeImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getNode()
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
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SERVER = 2;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ServerImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getServer()
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
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NODES = 2;

	/**
	 * The feature id for the '<em><b>Databags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DATABAGS = 3;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ENVIRONMENTS = 4;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CLIENTS = 5;

	/**
	 * The feature id for the '<em><b>Webuiport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__WEBUIPORT = 6;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.PlatformImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 5;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.RunListImpl <em>Run List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.RunListImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getRunList()
	 * @generated
	 */
	int RUN_LIST = 6;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_LIST__NODE = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_LIST__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_LIST__ROLE = 2;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_LIST__RECIPES = 3;

	/**
	 * The number of structural features of the '<em>Run List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_LIST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.chefserver.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ConfigImpl
	 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 7;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.DataBag <em>Data Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bag</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.DataBag
	 * @generated
	 */
	EClass getDataBag();

	/**
	 * Returns the meta object for the container reference '{@link org.limepepper.chefclipse.model.chefserver.DataBag#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.DataBag#getServer()
	 * @see #getDataBag()
	 * @generated
	 */
	EReference getDataBag_Server();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.chefserver.Node#getRun_list <em>Run list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run list</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Node#getRun_list()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Run_list();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.Node#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Node#getEnvironment()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Environment();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.Node#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Node#getServer()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Server();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.Node#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Node#getClient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Client();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.Node#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Node#getAttributes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Attributes();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.chefserver.Server#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getCookbooks()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Cookbooks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.chefserver.Server#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getRoles()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.chefserver.Server#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getNodes()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.chefserver.Server#getDatabags <em>Databags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databags</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getDatabags()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Databags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.chefserver.Server#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getEnvironments()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Environments();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.chefserver.Server#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getClients()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Clients();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.model.chefserver.Server#getWebuiport <em>Webuiport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webuiport</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getWebuiport()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Webuiport();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.RunList <em>Run List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run List</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.RunList
	 * @generated
	 */
	EClass getRunList();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.RunList#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.RunList#getNode()
	 * @see #getRunList()
	 * @generated
	 */
	EReference getRunList_Node();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.RunList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.RunList#getEnvironment()
	 * @see #getRunList()
	 * @generated
	 */
	EReference getRunList_Environment();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.chefserver.RunList#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.RunList#getRole()
	 * @see #getRunList()
	 * @generated
	 */
	EReference getRunList_Role();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.chefserver.RunList#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipes</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.RunList#getRecipes()
	 * @see #getRunList()
	 * @generated
	 */
	EReference getRunList_Recipes();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.chefserver.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.model.chefserver.Config
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
	ChefserverFactory getChefserverFactory();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.EnvironmentImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.DataBagImpl <em>Data Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.DataBagImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getDataBag()
		 * @generated
		 */
		EClass DATA_BAG = eINSTANCE.getDataBag();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BAG__SERVER = eINSTANCE.getDataBag_Server();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.RoleImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.NodeImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getNode()
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
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ENVIRONMENT = eINSTANCE.getNode_Environment();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SERVER = eINSTANCE.getNode_Server();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CLIENT = eINSTANCE.getNode_Client();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ATTRIBUTES = eINSTANCE.getNode_Attributes();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ServerImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getServer()
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
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__ROLES = eINSTANCE.getServer_Roles();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__NODES = eINSTANCE.getServer_Nodes();

		/**
		 * The meta object literal for the '<em><b>Databags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__DATABAGS = eINSTANCE.getServer_Databags();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__ENVIRONMENTS = eINSTANCE.getServer_Environments();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__CLIENTS = eINSTANCE.getServer_Clients();

		/**
		 * The meta object literal for the '<em><b>Webuiport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__WEBUIPORT = eINSTANCE.getServer_Webuiport();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.PlatformImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.RunListImpl <em>Run List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.RunListImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getRunList()
		 * @generated
		 */
		EClass RUN_LIST = eINSTANCE.getRunList();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_LIST__NODE = eINSTANCE.getRunList_Node();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_LIST__ENVIRONMENT = eINSTANCE.getRunList_Environment();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_LIST__ROLE = eINSTANCE.getRunList_Role();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_LIST__RECIPES = eINSTANCE.getRunList_Recipes();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.chefserver.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ConfigImpl
		 * @see org.limepepper.chefclipse.model.chefserver.impl.ChefserverPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

	}

} //ChefserverPackage
