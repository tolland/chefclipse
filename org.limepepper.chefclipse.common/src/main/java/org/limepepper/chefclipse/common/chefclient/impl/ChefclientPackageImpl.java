/**
 */
package org.limepepper.chefclipse.common.chefclient.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.REST.RESTPackage;
import org.limepepper.chefclipse.REST.impl.RESTPackageImpl;
import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.Client;
import org.limepepper.chefclipse.common.chefclient.ClientConfig;
import org.limepepper.chefclipse.common.chefclient.Ohai;
import org.limepepper.chefclipse.common.chefclient.Search;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl;
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
public class ChefclientPackageImpl extends EPackageImpl implements ChefclientPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ohaiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass searchEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientConfigEClass = null;

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
     * @see org.limepepper.chefclipse.common.chefclient.ChefclientPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ChefclientPackageImpl() {
        super(eNS_URI, ChefclientFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ChefclientPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ChefclientPackage init() {
        if (isInited) return (ChefclientPackage)EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI);

        // Obtain or create and register package
        ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChefclientPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
        ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
        CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
        WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);
        KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
        RESTPackageImpl theRESTPackage = (RESTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI) instanceof RESTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI) : RESTPackage.eINSTANCE);

        // Create package meta-data objects
        theChefclientPackage.createPackageContents();
        theChefclipsePackage.createPackageContents();
        theChefserverPackage.createPackageContents();
        theCookbookPackage.createPackageContents();
        theWorkstationPackage.createPackageContents();
        theKnifePackage.createPackageContents();
        theRESTPackage.createPackageContents();

        // Initialize created meta-data
        theChefclientPackage.initializePackageContents();
        theChefclipsePackage.initializePackageContents();
        theChefserverPackage.initializePackageContents();
        theCookbookPackage.initializePackageContents();
        theWorkstationPackage.initializePackageContents();
        theKnifePackage.initializePackageContents();
        theRESTPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theChefclientPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ChefclientPackage.eNS_URI, theChefclientPackage);
        return theChefclientPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClient() {
        return clientEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClient_Server() {
        return (EReference)clientEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOhai() {
        return ohaiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSearch() {
        return searchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClientConfig() {
        return clientConfigEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclientFactory getChefclientFactory() {
        return (ChefclientFactory)getEFactoryInstance();
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
        clientEClass = createEClass(CLIENT);
        createEReference(clientEClass, CLIENT__SERVER);

        ohaiEClass = createEClass(OHAI);

        searchEClass = createEClass(SEARCH);

        clientConfigEClass = createEClass(CLIENT_CONFIG);
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
        ChefserverPackage theChefserverPackage = (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);
        ChefclipsePackage theChefclipsePackage = (ChefclipsePackage)EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        clientConfigEClass.getESuperTypes().add(theChefclipsePackage.getConfig());

        // Initialize classes and features; add operations and parameters
        initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClient_Server(), theChefserverPackage.getServer(), null, "server", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ohaiEClass, Ohai.class, "Ohai", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(clientConfigEClass, ClientConfig.class, "ClientConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //ChefclientPackageImpl
