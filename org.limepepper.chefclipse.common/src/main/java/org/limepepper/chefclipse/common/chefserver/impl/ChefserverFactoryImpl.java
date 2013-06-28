/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefserver.*;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Client;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
import org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp;
=======
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefserver.Organization;
import org.limepepper.chefclipse.common.chefserver.Platform;
import org.limepepper.chefclipse.common.chefserver.Role;
=======
import org.limepepper.chefclipse.common.chefserver.Platform;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.common.chefserver.Sandbox;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerConfig;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
<<<<<<< HEAD
public class ChefserverFactoryImpl extends EFactoryImpl implements
		ChefserverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChefserverFactory init() {
		try {
			ChefserverFactory theChefserverFactory = (ChefserverFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://limepepper.org/v1/chefclipse/chefserver");
			if (theChefserverFactory != null) {
				return theChefserverFactory;
			}
		} catch (Exception exception) {
=======
public class ChefserverFactoryImpl extends EFactoryImpl implements ChefserverFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static ChefserverFactory init() {
		try {
			ChefserverFactory theChefserverFactory = (ChefserverFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/chefserver"); 
			if (theChefserverFactory != null) {
				return theChefserverFactory;
			}
		}
		catch (Exception exception) {
>>>>>>> origin/tomhodder
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChefserverFactoryImpl();
	}

<<<<<<< HEAD
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefserverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ChefserverPackage.ENVIRONMENT:
			return createEnvironment();
		case ChefserverPackage.DATA_BAG:
			return createDataBag();
		case ChefserverPackage.ROLE:
			return createRole();
		case ChefserverPackage.NODE:
			return createNode();
		case ChefserverPackage.SERVER:
			return createServer();
		case ChefserverPackage.PLATFORM:
			return createPlatform();
		case ChefserverPackage.SERVER_CONFIG:
			return createServerConfig();
		case ChefserverPackage.DATA_BAG_ITEM:
			return createDataBagItem();
		case ChefserverPackage.SANDBOX:
			return createSandbox();
		case ChefserverPackage.COOKBOOK_LIST_VERSION_RESP:
			return createCookbookListVersionResp();
		case ChefserverPackage.COOKBOOK_LIST_RESP:
			return createCookbookListResp();
		case ChefserverPackage.SERVER_COOKBOOK_FILE:
			return createServerCookbookFile();
		case ChefserverPackage.SERVER_COOKBOOK_VERSION:
			return createServerCookbookVersion();
		case ChefserverPackage.RUN_LIST_ITEM:
			return createRunListItem();
		case ChefserverPackage.CLIENT:
			return createClient();
		case ChefserverPackage.ORGANIZATION:
			return createOrganization();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
=======
    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefserverFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChefserverPackage.ENVIRONMENT: return createEnvironment();
			case ChefserverPackage.DATA_BAG: return createDataBag();
			case ChefserverPackage.ROLE: return createRole();
			case ChefserverPackage.NODE: return createNode();
			case ChefserverPackage.SERVER: return createServer();
			case ChefserverPackage.PLATFORM: return createPlatform();
			case ChefserverPackage.RUN_LIST: return createRunList();
			case ChefserverPackage.SERVER_CONFIG: return createServerConfig();
			case ChefserverPackage.DATA_BAG_ITEM: return createDataBagItem();
			case ChefserverPackage.SANDBOX: return createSandbox();
			case ChefserverPackage.COOKBOOK_LIST_RESP: return createCookbookListResp();
			case ChefserverPackage.SERVER_COOKBOOK_FILE: return createServerCookbookFile();
			case ChefserverPackage.SERVER_COOKBOOK_VERSION: return createServerCookbookVersion();
			case ChefserverPackage.RUN_LIST_ITEM: return createRunListItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Environment createEnvironment() {
>>>>>>> origin/tomhodder
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag createDataBag() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataBag createDataBag() {
>>>>>>> origin/tomhodder
		DataBagImpl dataBag = new DataBagImpl();
		return dataBag;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role createRole() {
>>>>>>> origin/tomhodder
		RoleImpl role = new RoleImpl();
		return role;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Node createNode() {
>>>>>>> origin/tomhodder
		NodeImpl node = new NodeImpl();
		return node;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Server createServer() {
>>>>>>> origin/tomhodder
		ServerImpl server = new ServerImpl();
		return server;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Platform createPlatform() {
>>>>>>> origin/tomhodder
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfig createServerConfig() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RunList createRunList() {
		RunListImpl runList = new RunListImpl();
		return runList;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServerConfig createServerConfig() {
>>>>>>> origin/tomhodder
		ServerConfigImpl serverConfig = new ServerConfigImpl();
		return serverConfig;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBagItem createDataBagItem() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataBagItem createDataBagItem() {
>>>>>>> origin/tomhodder
		DataBagItemImpl dataBagItem = new DataBagItemImpl();
		return dataBagItem;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sandbox createSandbox() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Sandbox createSandbox() {
>>>>>>> origin/tomhodder
		SandboxImpl sandbox = new SandboxImpl();
		return sandbox;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookListVersionResp createCookbookListVersionResp() {
		CookbookListVersionRespImpl cookbookListVersionResp = new CookbookListVersionRespImpl();
		return cookbookListVersionResp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookListResp createCookbookListResp() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookListResp createCookbookListResp() {
>>>>>>> origin/tomhodder
		CookbookListRespImpl cookbookListResp = new CookbookListRespImpl();
		return cookbookListResp;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerCookbookFile createServerCookbookFile() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServerCookbookFile createServerCookbookFile() {
>>>>>>> origin/tomhodder
		ServerCookbookFileImpl serverCookbookFile = new ServerCookbookFileImpl();
		return serverCookbookFile;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerCookbookVersion createServerCookbookVersion() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServerCookbookVersion createServerCookbookVersion() {
>>>>>>> origin/tomhodder
		ServerCookbookVersionImpl serverCookbookVersion = new ServerCookbookVersionImpl();
		return serverCookbookVersion;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunListItem createRunListItem() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RunListItem createRunListItem() {
>>>>>>> origin/tomhodder
		RunListItemImpl runListItem = new RunListItemImpl();
		return runListItem;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefserverPackage getChefserverPackage() {
		return (ChefserverPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChefserverPackage getPackage() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefserverPackage getChefserverPackage() {
		return (ChefserverPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static ChefserverPackage getPackage() {
>>>>>>> origin/tomhodder
		return ChefserverPackage.eINSTANCE;
	}

} //ChefserverFactoryImpl
