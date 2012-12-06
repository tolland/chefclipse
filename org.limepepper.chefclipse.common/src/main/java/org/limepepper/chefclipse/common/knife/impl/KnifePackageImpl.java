/**
 */
package org.limepepper.chefclipse.common.knife.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.REST.RESTPackage;
import org.limepepper.chefclipse.REST.impl.RESTPackageImpl;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.KnifeSearch;
import org.limepepper.chefclipse.common.knife.Plugin;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
import org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl;
import org.limepepper.chefclipse.impl.ChefclipsePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifePackageImpl extends EPackageImpl implements KnifePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knifeConfigEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pluginEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass knifeSearchEClass = null;

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
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private KnifePackageImpl() {
        super(eNS_URI, KnifeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link KnifePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static KnifePackage init() {
        if (isInited) return (KnifePackage)EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI);

        // Obtain or create and register package
        KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KnifePackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
        ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
        ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
        CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
        WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);
        RESTPackageImpl theRESTPackage = (RESTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI) instanceof RESTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI) : RESTPackage.eINSTANCE);

        // Create package meta-data objects
        theKnifePackage.createPackageContents();
        theChefclipsePackage.createPackageContents();
        theChefserverPackage.createPackageContents();
        theChefclientPackage.createPackageContents();
        theCookbookPackage.createPackageContents();
        theWorkstationPackage.createPackageContents();
        theRESTPackage.createPackageContents();

        // Initialize created meta-data
        theKnifePackage.initializePackageContents();
        theChefclipsePackage.initializePackageContents();
        theChefserverPackage.initializePackageContents();
        theChefclientPackage.initializePackageContents();
        theCookbookPackage.initializePackageContents();
        theWorkstationPackage.initializePackageContents();
        theRESTPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theKnifePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(KnifePackage.eNS_URI, theKnifePackage);
        return theKnifePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnifeConfig() {
        return knifeConfigEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKnifeConfig_Plugins() {
        return (EReference)knifeConfigEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Cache_type() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Cache_option() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Cookbook_path() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Cookbook_copyright() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Cookbook_email() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Cookbook_license() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKnifeConfig_Path() {
        return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKnifeConfig_Server() {
        return (EReference)knifeConfigEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPlugin() {
        return pluginEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKnifeSearch() {
        return knifeSearchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KnifeFactory getKnifeFactory() {
        return (KnifeFactory)getEFactoryInstance();
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
        knifeConfigEClass = createEClass(KNIFE_CONFIG);
        createEReference(knifeConfigEClass, KNIFE_CONFIG__PLUGINS);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__CACHE_TYPE);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__CACHE_OPTION);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__COOKBOOK_PATH);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__COOKBOOK_COPYRIGHT);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__COOKBOOK_EMAIL);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__COOKBOOK_LICENSE);
        createEAttribute(knifeConfigEClass, KNIFE_CONFIG__PATH);
        createEReference(knifeConfigEClass, KNIFE_CONFIG__SERVER);

        pluginEClass = createEClass(PLUGIN);

        knifeSearchEClass = createEClass(KNIFE_SEARCH);
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
        ChefserverPackage theChefserverPackage = (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        knifeConfigEClass.getESuperTypes().add(theChefclipsePackage.getConfig());

        // Initialize classes and features; add operations and parameters
        initEClass(knifeConfigEClass, KnifeConfig.class, "KnifeConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKnifeConfig_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Cache_type(), ecorePackage.getEString(), "cache_type", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Cache_option(), ecorePackage.getEString(), "cache_option", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Cookbook_path(), theChefclipsePackage.getFile(), "cookbook_path", null, 1, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Cookbook_copyright(), ecorePackage.getEString(), "cookbook_copyright", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Cookbook_email(), ecorePackage.getEString(), "cookbook_email", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Cookbook_license(), ecorePackage.getEString(), "cookbook_license", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKnifeConfig_Path(), theChefclipsePackage.getFile(), "path", null, 1, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKnifeConfig_Server(), theChefserverPackage.getServer(), null, "server", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(knifeSearchEClass, KnifeSearch.class, "KnifeSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //KnifePackageImpl
