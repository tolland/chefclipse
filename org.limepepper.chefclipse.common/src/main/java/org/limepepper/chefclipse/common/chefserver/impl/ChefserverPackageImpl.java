/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Platform;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.common.chefserver.Sandbox;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerConfig;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
import org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl;
import org.limepepper.chefclipse.impl.ChefclipsePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefserverPackageImpl extends EPackageImpl implements ChefserverPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass environmentEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dataBagEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass roleEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nodeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serverEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass platformEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass runListEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serverConfigEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dataBagItemEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sandboxEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass cookbookListRespEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serverCookbookFileEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serverCookbookVersionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass runListItemEClass = null;

    /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private ChefserverPackageImpl() {
		super(eNS_URI, ChefserverFactory.eINSTANCE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static boolean isInited = false;

    /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ChefserverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static ChefserverPackage init() {
		if (isInited) return (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);

		// Obtain or create and register package
		ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChefserverPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
		ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);

		// Create package meta-data objects
		theChefserverPackage.createPackageContents();
		theChefclipsePackage.createPackageContents();
		theChefclientPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theWorkstationPackage.createPackageContents();
		theKnifePackage.createPackageContents();

		// Initialize created meta-data
		theChefserverPackage.initializePackageContents();
		theChefclipsePackage.initializePackageContents();
		theChefclientPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChefserverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChefserverPackage.eNS_URI, theChefserverPackage);
		return theChefserverPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEnvironment() {
		return environmentEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getEnvironment_Override_attributes() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDataBag() {
		return dataBagEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataBag_Server() {
		return (EReference)dataBagEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataBag_Items() {
		return (EReference)dataBagEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRole() {
		return roleEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRole_Run_list() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRole_Environment() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNode() {
		return nodeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNode_Run_list() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNode_Environment() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNode_Server() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNode_Client() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getNode_Attributes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getNode_Run_list_items() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServer() {
		return serverEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Cookbooks() {
		return (EReference)serverEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Roles() {
		return (EReference)serverEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Nodes() {
		return (EReference)serverEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Databags() {
		return (EReference)serverEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Environments() {
		return (EReference)serverEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Clients() {
		return (EReference)serverEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServer_Webuiport() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Sandboxes() {
		return (EReference)serverEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServer_Config() {
		return (EReference)serverEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getPlatform() {
		return platformEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getPlatform_TestVal() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRunList() {
		return runListEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRunList_Node() {
		return (EReference)runListEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRunList_Environment() {
		return (EReference)runListEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRunList_Role() {
		return (EReference)runListEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRunList_Recipes() {
		return (EReference)runListEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRunList_Run_list_items() {
		return (EReference)runListEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServerConfig() {
		return serverConfigEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDataBagItem() {
		return dataBagItemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataBagItem_DataBag() {
		return (EReference)dataBagItemEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSandbox() {
		return sandboxEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSandbox_Checksum() {
		return (EAttribute)sandboxEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSandbox_Url() {
		return (EAttribute)sandboxEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCookbookListResp() {
		return cookbookListRespEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCookbookListResp_Name() {
		return (EAttribute)cookbookListRespEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCookbookListResp_Url() {
		return (EAttribute)cookbookListRespEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServerCookbookFile() {
		return serverCookbookFileEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServerCookbookFile_Cookbook() {
		return (EReference)serverCookbookFileEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServerCookbookVersion() {
		return serverCookbookVersionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServerCookbookVersion_Version() {
		return (EAttribute)serverCookbookVersionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServerCookbookVersion_Cookbook_name() {
		return (EAttribute)serverCookbookVersionEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRunListItem() {
		return runListItemEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefserverFactory getChefserverFactory() {
		return (ChefserverFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isCreated = false;

    /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__OVERRIDE_ATTRIBUTES);

		dataBagEClass = createEClass(DATA_BAG);
		createEReference(dataBagEClass, DATA_BAG__SERVER);
		createEReference(dataBagEClass, DATA_BAG__ITEMS);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__RUN_LIST);
		createEReference(roleEClass, ROLE__ENVIRONMENT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__ENVIRONMENT);
		createEReference(nodeEClass, NODE__SERVER);
		createEReference(nodeEClass, NODE__CLIENT);
		createEReference(nodeEClass, NODE__ATTRIBUTES);
		createEAttribute(nodeEClass, NODE__RUN_LIST_ITEMS);
		createEReference(nodeEClass, NODE__RUN_LIST);

		serverEClass = createEClass(SERVER);
		createEReference(serverEClass, SERVER__COOKBOOKS);
		createEReference(serverEClass, SERVER__ROLES);
		createEReference(serverEClass, SERVER__NODES);
		createEReference(serverEClass, SERVER__DATABAGS);
		createEReference(serverEClass, SERVER__ENVIRONMENTS);
		createEReference(serverEClass, SERVER__CLIENTS);
		createEAttribute(serverEClass, SERVER__WEBUIPORT);
		createEReference(serverEClass, SERVER__SANDBOXES);
		createEReference(serverEClass, SERVER__CONFIG);

		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__TEST_VAL);

		runListEClass = createEClass(RUN_LIST);
		createEReference(runListEClass, RUN_LIST__NODE);
		createEReference(runListEClass, RUN_LIST__ENVIRONMENT);
		createEReference(runListEClass, RUN_LIST__ROLE);
		createEReference(runListEClass, RUN_LIST__RECIPES);
		createEReference(runListEClass, RUN_LIST__RUN_LIST_ITEMS);

		serverConfigEClass = createEClass(SERVER_CONFIG);

		dataBagItemEClass = createEClass(DATA_BAG_ITEM);
		createEReference(dataBagItemEClass, DATA_BAG_ITEM__DATA_BAG);

		sandboxEClass = createEClass(SANDBOX);
		createEAttribute(sandboxEClass, SANDBOX__CHECKSUM);
		createEAttribute(sandboxEClass, SANDBOX__URL);

		cookbookListRespEClass = createEClass(COOKBOOK_LIST_RESP);
		createEAttribute(cookbookListRespEClass, COOKBOOK_LIST_RESP__NAME);
		createEAttribute(cookbookListRespEClass, COOKBOOK_LIST_RESP__URL);

		serverCookbookFileEClass = createEClass(SERVER_COOKBOOK_FILE);
		createEReference(serverCookbookFileEClass, SERVER_COOKBOOK_FILE__COOKBOOK);

		serverCookbookVersionEClass = createEClass(SERVER_COOKBOOK_VERSION);
		createEAttribute(serverCookbookVersionEClass, SERVER_COOKBOOK_VERSION__VERSION);
		createEAttribute(serverCookbookVersionEClass, SERVER_COOKBOOK_VERSION__COOKBOOK_NAME);

		runListItemEClass = createEClass(RUN_LIST_ITEM);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isInitialized = false;

    /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ChefclipsePackage theChefclipsePackage = (ChefclipsePackage)EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI);
		ChefclientPackage theChefclientPackage = (ChefclientPackage)EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI);
		CookbookPackage theCookbookPackage = (CookbookPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		environmentEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		dataBagEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		roleEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		roleEClass.getESuperTypes().add(this.getRunListItem());
		nodeEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		dataBagItemEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		serverCookbookFileEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		serverCookbookFileEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		serverCookbookFileEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		serverCookbookVersionEClass.getESuperTypes().add(theCookbookPackage.getCookbookVersion());

		// Initialize classes and features; add operations and parameters
		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Override_attributes(), ecorePackage.getEString(), "override_attributes", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBagEClass, DataBag.class, "DataBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBag_Server(), this.getServer(), this.getServer_Databags(), "server", null, 0, 1, DataBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBag_Items(), this.getDataBagItem(), null, "items", null, 0, -1, DataBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Run_list(), this.getRunList(), null, "run_list", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Server(), this.getServer(), null, "server", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Client(), theChefclientPackage.getClient(), null, "client", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Attributes(), theCookbookPackage.getAttribute(), null, "attributes", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Run_list_items(), ecorePackage.getEString(), "run_list_items", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Run_list(), this.getRunList(), null, "run_list", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServer_Cookbooks(), this.getServerCookbookVersion(), null, "cookbooks", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Roles(), this.getRole(), null, "roles", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Databags(), this.getDataBag(), this.getDataBag_Server(), "databags", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Environments(), this.getEnvironment(), null, "environments", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Clients(), theChefclientPackage.getClient(), null, "clients", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Webuiport(), ecorePackage.getEInt(), "webuiport", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Sandboxes(), this.getSandbox(), null, "sandboxes", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Config(), this.getServerConfig(), null, "config", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_TestVal(), ecorePackage.getEInt(), "TestVal", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runListEClass, RunList.class, "RunList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunList_Node(), this.getNode(), null, "node", null, 0, 1, RunList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunList_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, RunList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunList_Role(), this.getRole(), null, "role", null, 0, 1, RunList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunList_Recipes(), theCookbookPackage.getRecipe(), null, "recipes", null, 0, -1, RunList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunList_Run_list_items(), this.getRunListItem(), null, "run_list_items", null, 0, -1, RunList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverConfigEClass, ServerConfig.class, "ServerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBagItemEClass, DataBagItem.class, "DataBagItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBagItem_DataBag(), this.getDataBag(), null, "dataBag", null, 1, 1, DataBagItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sandboxEClass, Sandbox.class, "Sandbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSandbox_Checksum(), ecorePackage.getEString(), "checksum", null, 1, 1, Sandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSandbox_Url(), theChefclipsePackage.getURL(), "url", null, 1, 1, Sandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cookbookListRespEClass, CookbookListResp.class, "CookbookListResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCookbookListResp_Name(), ecorePackage.getEString(), "name", null, 1, 1, CookbookListResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbookListResp_Url(), ecorePackage.getEString(), "url", null, 1, 1, CookbookListResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverCookbookFileEClass, ServerCookbookFile.class, "ServerCookbookFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerCookbookFile_Cookbook(), this.getServerCookbookVersion(), null, "cookbook", null, 1, 1, ServerCookbookFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverCookbookVersionEClass, ServerCookbookVersion.class, "ServerCookbookVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerCookbookVersion_Version(), theChefclipsePackage.getVersion(), "version", "0.0.0", 1, 1, ServerCookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerCookbookVersion_Cookbook_name(), ecorePackage.getEString(), "cookbook_name", null, 1, 1, ServerCookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runListItemEClass, RunListItem.class, "RunListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// JSON
		createJSONAnnotations();
	}

    /**
	 * Initializes the annotations for <b>JSON</b>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void createJSONAnnotations() {
		String source = "JSON";		
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "root", "true"
		   });		
		addAnnotation
		  (getNode_Run_list_items(), 
		   source, 
		   new String[] {
			 "element", "run_list"
		   });
	}

} //ChefserverPackageImpl
