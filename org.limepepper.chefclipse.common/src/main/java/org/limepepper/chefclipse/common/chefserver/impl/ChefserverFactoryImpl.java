/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.limepepper.chefclipse.common.chefserver.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
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
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ChefserverFactoryImpl();
    }

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
        EnvironmentImpl environment = new EnvironmentImpl();
        return environment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataBag createDataBag() {
        DataBagImpl dataBag = new DataBagImpl();
        return dataBag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role createRole() {
        RoleImpl role = new RoleImpl();
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Server createServer() {
        ServerImpl server = new ServerImpl();
        return server;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Platform createPlatform() {
        PlatformImpl platform = new PlatformImpl();
        return platform;
    }

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
        ServerConfigImpl serverConfig = new ServerConfigImpl();
        return serverConfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataBagItem createDataBagItem() {
        DataBagItemImpl dataBagItem = new DataBagItemImpl();
        return dataBagItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sandbox createSandbox() {
        SandboxImpl sandbox = new SandboxImpl();
        return sandbox;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookListResp createCookbookListResp() {
        CookbookListRespImpl cookbookListResp = new CookbookListRespImpl();
        return cookbookListResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServerCookbookFile createServerCookbookFile() {
        ServerCookbookFileImpl serverCookbookFile = new ServerCookbookFileImpl();
        return serverCookbookFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServerCookbookVersion createServerCookbookVersion() {
        ServerCookbookVersionImpl serverCookbookVersion = new ServerCookbookVersionImpl();
        return serverCookbookVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RunListItem createRunListItem() {
        RunListItemImpl runListItem = new RunListItemImpl();
        return runListItem;
    }

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
        return ChefserverPackage.eINSTANCE;
    }

} //ChefserverFactoryImpl
