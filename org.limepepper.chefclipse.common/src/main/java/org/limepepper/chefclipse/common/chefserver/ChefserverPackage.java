/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.utility.UtilityPackage;

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
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverFactory
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
    String eNS_URI = "http://limepepper.org/v1/chefclipse/chefserver";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "org.limepepper.chefclipse.chefserver";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ChefserverPackage eINSTANCE = org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl.init();

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getEnvironment()
	 * @generated
	 */
    int ENVIRONMENT = 0;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;

    /**
	 * The feature id for the '<em><b>Override attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT__OVERRIDE_ATTRIBUTES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagImpl <em>Data Bag</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.DataBagImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getDataBag()
	 * @generated
	 */
    int DATA_BAG = 1;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;

    /**
	 * The feature id for the '<em><b>Server</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG__SERVER = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG__ITEMS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG__RESOURCE = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The number of structural features of the '<em>Data Bag</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.RoleImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getRole()
	 * @generated
	 */
    int ROLE = 2;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROLE__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROLE__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROLE__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;

    /**
	 * The feature id for the '<em><b>Run list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROLE__RUN_LIST = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROLE__ENVIRONMENT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROLE_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.NodeImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getNode()
	 * @generated
	 */
    int NODE = 3;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;

    /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__ENVIRONMENT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__SERVER = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__CLIENT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__ATTRIBUTES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Run list items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__RUN_LIST_ITEMS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Run list</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE__RUN_LIST = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 5;

    /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 6;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServer()
	 * @generated
	 */
    int SERVER = 4;

    /**
	 * The feature id for the '<em><b>Cookbooks</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Sandboxes</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER__SANDBOXES = 7;

    /**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER__CONFIG = 8;

    /**
	 * The feature id for the '<em><b>Knife Config</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__KNIFE_CONFIG = 9;

				/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_FEATURE_COUNT = 10;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.PlatformImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getPlatform()
	 * @generated
	 */
    int PLATFORM = 5;

    /**
	 * The feature id for the '<em><b>Test Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PLATFORM__TEST_VAL = 0;

    /**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PLATFORM_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.RunListImpl <em>Run List</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.RunListImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getRunList()
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
	 * The feature id for the '<em><b>Run list items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_LIST__RUN_LIST_ITEMS = 4;

    /**
	 * The number of structural features of the '<em>Run List</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_LIST_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerConfigImpl <em>Server Config</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerConfigImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServerConfig()
	 * @generated
	 */
    int SERVER_CONFIG = 7;

    /**
	 * The number of structural features of the '<em>Server Config</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_CONFIG_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl <em>Data Bag Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getDataBagItem()
	 * @generated
	 */
    int DATA_BAG_ITEM = 8;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG_ITEM__NAME = UtilityPackage.NAMED_OBJECT__NAME;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG_ITEM__ID = UtilityPackage.NAMED_OBJECT__ID;

    /**
	 * The feature id for the '<em><b>Data Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG_ITEM__DATA_BAG = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Json Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAG_ITEM__JSON_RESOURCE = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Data Bag Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_BAG_ITEM_FEATURE_COUNT = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.SandboxImpl <em>Sandbox</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.SandboxImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getSandbox()
	 * @generated
	 */
    int SANDBOX = 9;

    /**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SANDBOX__CHECKSUM = 0;

    /**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SANDBOX__URL = 1;

    /**
	 * The number of structural features of the '<em>Sandbox</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SANDBOX_FEATURE_COUNT = 2;


    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.CookbookListVersionRespImpl <em>Cookbook List Version Resp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.CookbookListVersionRespImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getCookbookListVersionResp()
	 * @generated
	 */
	int COOKBOOK_LIST_VERSION_RESP = 10;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_LIST_VERSION_RESP__URL = 0;

				/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_LIST_VERSION_RESP__VERSION = 1;

				/**
	 * The number of structural features of the '<em>Cookbook List Version Resp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_LIST_VERSION_RESP_FEATURE_COUNT = 2;

				/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.CookbookListRespImpl <em>Cookbook List Resp</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.CookbookListRespImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getCookbookListResp()
	 * @generated
	 */
    int COOKBOOK_LIST_RESP = 11;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_LIST_RESP__NAME = 0;

    /**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_LIST_RESP__VERSIONS = 1;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_LIST_RESP__URL = 2;

    /**
	 * The number of structural features of the '<em>Cookbook List Resp</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_LIST_RESP_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl <em>Server Cookbook File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServerCookbookFile()
	 * @generated
	 */
	int SERVER_COOKBOOK_FILE = 12;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__URL = UtilityPackage.SANDBOXED_OBJECT__URL;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__NAME = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__ID = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__CHECKSUM = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__BYTES = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__PATH = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__SPECIFICITY = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 5;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE__COOKBOOK = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 6;

				/**
	 * The number of structural features of the '<em>Server Cookbook File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_FILE_FEATURE_COUNT = UtilityPackage.SANDBOXED_OBJECT_FEATURE_COUNT + 7;

				/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl <em>Server Cookbook Version</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServerCookbookVersion()
	 * @generated
	 */
    int SERVER_COOKBOOK_VERSION = 13;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__DESCRIPTION = CookbookPackage.COOKBOOK_VERSION__DESCRIPTION;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__NAME = CookbookPackage.COOKBOOK_VERSION__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__ID = CookbookPackage.COOKBOOK_VERSION__ID;

				/**
	 * The feature id for the '<em><b>Json class</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__JSON_CLASS = CookbookPackage.COOKBOOK_VERSION__JSON_CLASS;

    /**
	 * The feature id for the '<em><b>Chef type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__CHEF_TYPE = CookbookPackage.COOKBOOK_VERSION__CHEF_TYPE;

    /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__ENVIRONMENT = CookbookPackage.COOKBOOK_VERSION__ENVIRONMENT;

				/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__TEMPLATES = CookbookPackage.COOKBOOK_VERSION__TEMPLATES;

				/**
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__RECIPES = CookbookPackage.COOKBOOK_VERSION__RECIPES;

    /**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__DEFINITIONS = CookbookPackage.COOKBOOK_VERSION__DEFINITIONS;

				/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__FILES = CookbookPackage.COOKBOOK_VERSION__FILES;

				/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__RESOURCES = CookbookPackage.COOKBOOK_VERSION__RESOURCES;

				/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__LIBRARIES = CookbookPackage.COOKBOOK_VERSION__LIBRARIES;

    /**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__METADATA = CookbookPackage.COOKBOOK_VERSION__METADATA;

				/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__PROVIDERS = CookbookPackage.COOKBOOK_VERSION__PROVIDERS;

				/**
	 * The feature id for the '<em><b>Root files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__ROOT_FILES = CookbookPackage.COOKBOOK_VERSION__ROOT_FILES;

				/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__ATTRIBUTES = CookbookPackage.COOKBOOK_VERSION__ATTRIBUTES;

				/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__CATALOG = CookbookPackage.COOKBOOK_VERSION__CATALOG;

				/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__DEPENDS = CookbookPackage.COOKBOOK_VERSION__DEPENDS;

				/**
	 * The feature id for the '<em><b>Missing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__MISSING = CookbookPackage.COOKBOOK_VERSION__MISSING;

				/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__VERSION = CookbookPackage.COOKBOOK_VERSION_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Cookbook name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION__COOKBOOK_NAME = CookbookPackage.COOKBOOK_VERSION_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Knife Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_COOKBOOK_VERSION__KNIFE_CONFIG = CookbookPackage.COOKBOOK_VERSION_FEATURE_COUNT + 2;

				/**
	 * The number of structural features of the '<em>Server Cookbook Version</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVER_COOKBOOK_VERSION_FEATURE_COUNT = CookbookPackage.COOKBOOK_VERSION_FEATURE_COUNT + 3;


    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefserver.impl.RunListItemImpl <em>Run List Item</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefserver.impl.RunListItemImpl
	 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getRunListItem()
	 * @generated
	 */
    int RUN_LIST_ITEM = 14;

    /**
	 * The number of structural features of the '<em>Run List Item</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_LIST_ITEM_FEATURE_COUNT = 0;


    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Environment
	 * @generated
	 */
    EClass getEnvironment();

    /**
	 * Returns the meta object for the attribute list '{@link org.limepepper.chefclipse.common.chefserver.Environment#getOverride_attributes <em>Override attributes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Override attributes</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Environment#getOverride_attributes()
	 * @see #getEnvironment()
	 * @generated
	 */
    EAttribute getEnvironment_Override_attributes();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.DataBag <em>Data Bag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bag</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag
	 * @generated
	 */
    EClass getDataBag();

    /**
	 * Returns the meta object for the container reference '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag#getServer()
	 * @see #getDataBag()
	 * @generated
	 */
    EReference getDataBag_Server();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag#getItems()
	 * @see #getDataBag()
	 * @generated
	 */
    EReference getDataBag_Items();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag#getResource()
	 * @see #getDataBag()
	 * @generated
	 */
	EAttribute getDataBag_Resource();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Role
	 * @generated
	 */
    EClass getRole();

    /**
	 * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.common.chefserver.Role#getRun_list <em>Run list</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run list</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Role#getRun_list()
	 * @see #getRole()
	 * @generated
	 */
    EReference getRole_Run_list();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Role#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Role#getEnvironment()
	 * @see #getRole()
	 * @generated
	 */
    EReference getRole_Environment();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node
	 * @generated
	 */
    EClass getNode();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Node#getRun_list <em>Run list</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Run list</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node#getRun_list()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Run_list();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Node#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node#getEnvironment()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Environment();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Node#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node#getServer()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Server();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Node#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node#getClient()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Client();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Node#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node#getAttributes()
	 * @see #getNode()
	 * @generated
	 */
    EReference getNode_Attributes();

    /**
	 * Returns the meta object for the attribute list '{@link org.limepepper.chefclipse.common.chefserver.Node#getRun_list_items <em>Run list items</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Run list items</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Node#getRun_list_items()
	 * @see #getNode()
	 * @generated
	 */
    EAttribute getNode_Run_list_items();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server
	 * @generated
	 */
    EClass getServer();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getCookbooks()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Cookbooks();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getRoles()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Roles();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getNodes()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Nodes();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getDatabags <em>Databags</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databags</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getDatabags()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Databags();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environments</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getEnvironments()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Environments();

    /**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getClients()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Clients();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.Server#getWebuiport <em>Webuiport</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webuiport</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getWebuiport()
	 * @see #getServer()
	 * @generated
	 */
    EAttribute getServer_Webuiport();

    /**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getSandboxes <em>Sandboxes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sandboxes</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getSandboxes()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Sandboxes();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.Server#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getConfig()
	 * @see #getServer()
	 * @generated
	 */
    EReference getServer_Config();

    /**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.chefserver.Server#getKnifeConfig <em>Knife Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Knife Config</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getKnifeConfig()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_KnifeConfig();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Platform
	 * @generated
	 */
    EClass getPlatform();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.Platform#getTestVal <em>Test Val</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Val</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Platform#getTestVal()
	 * @see #getPlatform()
	 * @generated
	 */
    EAttribute getPlatform_TestVal();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.RunList <em>Run List</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run List</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList
	 * @generated
	 */
    EClass getRunList();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.RunList#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList#getNode()
	 * @see #getRunList()
	 * @generated
	 */
    EReference getRunList_Node();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.RunList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList#getEnvironment()
	 * @see #getRunList()
	 * @generated
	 */
    EReference getRunList_Environment();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.RunList#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList#getRole()
	 * @see #getRunList()
	 * @generated
	 */
    EReference getRunList_Role();

    /**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.chefserver.RunList#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipes</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList#getRecipes()
	 * @see #getRunList()
	 * @generated
	 */
    EReference getRunList_Recipes();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.RunList#getRun_list_items <em>Run list items</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run list items</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList#getRun_list_items()
	 * @see #getRunList()
	 * @generated
	 */
    EReference getRunList_Run_list_items();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.ServerConfig <em>Server Config</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Config</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerConfig
	 * @generated
	 */
    EClass getServerConfig();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem <em>Data Bag Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bag Item</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBagItem
	 * @generated
	 */
    EClass getDataBagItem();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag <em>Data Bag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Bag</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag()
	 * @see #getDataBagItem()
	 * @generated
	 */
    EReference getDataBagItem_DataBag();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getJsonResource <em>Json Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Resource</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBagItem#getJsonResource()
	 * @see #getDataBagItem()
	 * @generated
	 */
	EAttribute getDataBagItem_JsonResource();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.Sandbox <em>Sandbox</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sandbox</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Sandbox
	 * @generated
	 */
    EClass getSandbox();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.Sandbox#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Sandbox#getChecksum()
	 * @see #getSandbox()
	 * @generated
	 */
    EAttribute getSandbox_Checksum();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.Sandbox#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.Sandbox#getUrl()
	 * @see #getSandbox()
	 * @generated
	 */
    EAttribute getSandbox_Url();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp <em>Cookbook List Version Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cookbook List Version Resp</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp
	 * @generated
	 */
	EClass getCookbookListVersionResp();

				/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp#getUrl()
	 * @see #getCookbookListVersionResp()
	 * @generated
	 */
	EAttribute getCookbookListVersionResp_Url();

				/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp#getVersion()
	 * @see #getCookbookListVersionResp()
	 * @generated
	 */
	EAttribute getCookbookListVersionResp_Version();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp <em>Cookbook List Resp</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cookbook List Resp</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListResp
	 * @generated
	 */
    EClass getCookbookListResp();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListResp#getName()
	 * @see #getCookbookListResp()
	 * @generated
	 */
    EAttribute getCookbookListResp_Name();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListResp#getVersions()
	 * @see #getCookbookListResp()
	 * @generated
	 */
	EReference getCookbookListResp_Versions();

				/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListResp#getUrl()
	 * @see #getCookbookListResp()
	 * @generated
	 */
    EAttribute getCookbookListResp_Url();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile <em>Server Cookbook File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Cookbook File</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookFile
	 * @generated
	 */
	EClass getServerCookbookFile();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion <em>Server Cookbook Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Cookbook Version</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion
	 * @generated
	 */
    EClass getServerCookbookVersion();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getVersion()
	 * @see #getServerCookbookVersion()
	 * @generated
	 */
    EAttribute getServerCookbookVersion_Version();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getCookbook_name <em>Cookbook name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookbook name</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getCookbook_name()
	 * @see #getServerCookbookVersion()
	 * @generated
	 */
    EAttribute getServerCookbookVersion_Cookbook_name();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getKnifeConfig <em>Knife Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knife Config</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getKnifeConfig()
	 * @see #getServerCookbookVersion()
	 * @generated
	 */
	EReference getServerCookbookVersion_KnifeConfig();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefserver.RunListItem <em>Run List Item</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run List Item</em>'.
	 * @see org.limepepper.chefclipse.common.chefserver.RunListItem
	 * @generated
	 */
    EClass getRunListItem();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getEnvironment()
		 * @generated
		 */
        EClass ENVIRONMENT = eINSTANCE.getEnvironment();

        /**
		 * The meta object literal for the '<em><b>Override attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ENVIRONMENT__OVERRIDE_ATTRIBUTES = eINSTANCE.getEnvironment_Override_attributes();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagImpl <em>Data Bag</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.DataBagImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getDataBag()
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
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_BAG__ITEMS = eINSTANCE.getDataBag_Items();

        /**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BAG__RESOURCE = eINSTANCE.getDataBag_Resource();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.RoleImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getRole()
		 * @generated
		 */
        EClass ROLE = eINSTANCE.getRole();

        /**
		 * The meta object literal for the '<em><b>Run list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ROLE__RUN_LIST = eINSTANCE.getRole_Run_list();

        /**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ROLE__ENVIRONMENT = eINSTANCE.getRole_Environment();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.NodeImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getNode()
		 * @generated
		 */
        EClass NODE = eINSTANCE.getNode();

        /**
		 * The meta object literal for the '<em><b>Run list</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Run list items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE__RUN_LIST_ITEMS = eINSTANCE.getNode_Run_list_items();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServer()
		 * @generated
		 */
        EClass SERVER = eINSTANCE.getServer();

        /**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Sandboxes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SERVER__SANDBOXES = eINSTANCE.getServer_Sandboxes();

        /**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SERVER__CONFIG = eINSTANCE.getServer_Config();

        /**
		 * The meta object literal for the '<em><b>Knife Config</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__KNIFE_CONFIG = eINSTANCE.getServer_KnifeConfig();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.PlatformImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getPlatform()
		 * @generated
		 */
        EClass PLATFORM = eINSTANCE.getPlatform();

        /**
		 * The meta object literal for the '<em><b>Test Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PLATFORM__TEST_VAL = eINSTANCE.getPlatform_TestVal();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.RunListImpl <em>Run List</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.RunListImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getRunList()
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
		 * The meta object literal for the '<em><b>Run list items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN_LIST__RUN_LIST_ITEMS = eINSTANCE.getRunList_Run_list_items();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerConfigImpl <em>Server Config</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerConfigImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServerConfig()
		 * @generated
		 */
        EClass SERVER_CONFIG = eINSTANCE.getServerConfig();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl <em>Data Bag Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getDataBagItem()
		 * @generated
		 */
        EClass DATA_BAG_ITEM = eINSTANCE.getDataBagItem();

        /**
		 * The meta object literal for the '<em><b>Data Bag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_BAG_ITEM__DATA_BAG = eINSTANCE.getDataBagItem_DataBag();

        /**
		 * The meta object literal for the '<em><b>Json Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BAG_ITEM__JSON_RESOURCE = eINSTANCE.getDataBagItem_JsonResource();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.SandboxImpl <em>Sandbox</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.SandboxImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getSandbox()
		 * @generated
		 */
        EClass SANDBOX = eINSTANCE.getSandbox();

        /**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SANDBOX__CHECKSUM = eINSTANCE.getSandbox_Checksum();

        /**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SANDBOX__URL = eINSTANCE.getSandbox_Url();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.CookbookListVersionRespImpl <em>Cookbook List Version Resp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.CookbookListVersionRespImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getCookbookListVersionResp()
		 * @generated
		 */
		EClass COOKBOOK_LIST_VERSION_RESP = eINSTANCE.getCookbookListVersionResp();

								/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK_LIST_VERSION_RESP__URL = eINSTANCE.getCookbookListVersionResp_Url();

								/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK_LIST_VERSION_RESP__VERSION = eINSTANCE.getCookbookListVersionResp_Version();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.CookbookListRespImpl <em>Cookbook List Resp</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.CookbookListRespImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getCookbookListResp()
		 * @generated
		 */
        EClass COOKBOOK_LIST_RESP = eINSTANCE.getCookbookListResp();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute COOKBOOK_LIST_RESP__NAME = eINSTANCE.getCookbookListResp_Name();

        /**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOK_LIST_RESP__VERSIONS = eINSTANCE.getCookbookListResp_Versions();

								/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute COOKBOOK_LIST_RESP__URL = eINSTANCE.getCookbookListResp_Url();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl <em>Server Cookbook File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServerCookbookFile()
		 * @generated
		 */
		EClass SERVER_COOKBOOK_FILE = eINSTANCE.getServerCookbookFile();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl <em>Server Cookbook Version</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getServerCookbookVersion()
		 * @generated
		 */
        EClass SERVER_COOKBOOK_VERSION = eINSTANCE.getServerCookbookVersion();

        /**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVER_COOKBOOK_VERSION__VERSION = eINSTANCE.getServerCookbookVersion_Version();

        /**
		 * The meta object literal for the '<em><b>Cookbook name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVER_COOKBOOK_VERSION__COOKBOOK_NAME = eINSTANCE.getServerCookbookVersion_Cookbook_name();

        /**
		 * The meta object literal for the '<em><b>Knife Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_COOKBOOK_VERSION__KNIFE_CONFIG = eINSTANCE.getServerCookbookVersion_KnifeConfig();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefserver.impl.RunListItemImpl <em>Run List Item</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefserver.impl.RunListItemImpl
		 * @see org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl#getRunListItem()
		 * @generated
		 */
        EClass RUN_LIST_ITEM = eINSTANCE.getRunListItem();

    }

} //ChefserverPackage
