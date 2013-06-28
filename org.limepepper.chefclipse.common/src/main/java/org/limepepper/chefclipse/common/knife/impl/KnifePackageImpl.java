/**
 */
package org.limepepper.chefclipse.common.knife.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.ChefclipsePackage;
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.UtilityPackageImpl;
=======
import org.limepepper.chefclipse.impl.ChefclipsePackageImpl;
>>>>>>> origin/tomhodder

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
<<<<<<< HEAD
		if (isInited)
			return (KnifePackage) EPackage.Registry.INSTANCE
					.getEPackage(KnifePackage.eNS_URI);

		// Obtain or create and register package
		KnifePackageImpl theKnifePackage = (KnifePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new KnifePackageImpl());
=======
		if (isInited) return (KnifePackage)EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI);

		// Obtain or create and register package
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KnifePackageImpl());
>>>>>>> origin/tomhodder

		isInited = true;

		// Obtain or create and register interdependencies
<<<<<<< HEAD
		ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ChefserverPackage.eNS_URI)
				: ChefserverPackage.eINSTANCE);
		ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ChefclientPackage.eNS_URI)
				: ChefclientPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CookbookPackage.eNS_URI)
				: CookbookPackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(WorkstationPackage.eNS_URI)
				: WorkstationPackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theKnifePackage.createPackageContents();
=======
		ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
		ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
		ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

		// Create package meta-data objects
		theKnifePackage.createPackageContents();
		theChefclipsePackage.createPackageContents();
>>>>>>> origin/tomhodder
		theChefserverPackage.createPackageContents();
		theChefclientPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theWorkstationPackage.createPackageContents();
<<<<<<< HEAD
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theKnifePackage.initializePackageContents();
=======

		// Initialize created meta-data
		theKnifePackage.initializePackageContents();
		theChefclipsePackage.initializePackageContents();
>>>>>>> origin/tomhodder
		theChefserverPackage.initializePackageContents();
		theChefclientPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();
<<<<<<< HEAD
		theUtilityPackage.initializePackageContents();
=======
>>>>>>> origin/tomhodder

		// Mark meta-data to indicate it can't be changed
		theKnifePackage.freeze();

<<<<<<< HEAD
=======
  
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		return (EReference) knifeConfigEClass.getEStructuralFeatures().get(0);
=======
		return (EReference)knifeConfigEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Cache_type() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(1);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Cache_option() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(2);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(2);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Cookbook_path() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(3);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(3);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Cookbook_copyright() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(4);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(4);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Cookbook_email() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(5);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(5);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Cookbook_license() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(6);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(6);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnifeConfig_Path() {
<<<<<<< HEAD
		return (EAttribute) knifeConfigEClass.getEStructuralFeatures().get(7);
=======
		return (EAttribute)knifeConfigEClass.getEStructuralFeatures().get(7);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnifeConfig_Server() {
<<<<<<< HEAD
		return (EReference) knifeConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnifeConfig_ServerCookbookVersion() {
		return (EReference) knifeConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnifeConfig_Repository() {
		return (EReference) knifeConfigEClass.getEStructuralFeatures().get(10);
=======
		return (EReference)knifeConfigEClass.getEStructuralFeatures().get(8);
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		return (KnifeFactory) getEFactoryInstance();
=======
		return (KnifeFactory)getEFactoryInstance();
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		if (isCreated)
			return;
=======
		if (isCreated) return;
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		createEReference(knifeConfigEClass,
				KNIFE_CONFIG__SERVER_COOKBOOK_VERSION);
		createEReference(knifeConfigEClass, KNIFE_CONFIG__REPOSITORY);
=======
>>>>>>> origin/tomhodder

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
<<<<<<< HEAD
		if (isInitialized)
			return;
=======
		if (isInitialized) return;
>>>>>>> origin/tomhodder
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
<<<<<<< HEAD
		UtilityPackage theUtilityPackage = (UtilityPackage) EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI);
		ChefserverPackage theChefserverPackage = (ChefserverPackage) EPackage.Registry.INSTANCE
				.getEPackage(ChefserverPackage.eNS_URI);
		WorkstationPackage theWorkstationPackage = (WorkstationPackage) EPackage.Registry.INSTANCE
				.getEPackage(WorkstationPackage.eNS_URI);
=======
		ChefclipsePackage theChefclipsePackage = (ChefclipsePackage)EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI);
		ChefserverPackage theChefserverPackage = (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);
>>>>>>> origin/tomhodder

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
<<<<<<< HEAD
		knifeConfigEClass.getESuperTypes().add(theUtilityPackage.getConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(knifeConfigEClass, KnifeConfig.class, "KnifeConfig",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnifeConfig_Plugins(), this.getPlugin(), null,
				"plugins", null, 0, -1, KnifeConfig.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Cache_type(), ecorePackage.getEString(),
				"cache_type", null, 0, 1, KnifeConfig.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Cache_option(),
				ecorePackage.getEString(), "cache_option", null, 0, 1,
				KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Cookbook_path(),
				theUtilityPackage.getFile(), "cookbook_path", null, 1, 1,
				KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Cookbook_copyright(),
				ecorePackage.getEString(), "cookbook_copyright", null, 0, 1,
				KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Cookbook_email(),
				ecorePackage.getEString(), "cookbook_email", null, 0, 1,
				KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Cookbook_license(),
				ecorePackage.getEString(), "cookbook_license", null, 0, 1,
				KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnifeConfig_Path(), theUtilityPackage.getFile(),
				"path", null, 1, 1, KnifeConfig.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getKnifeConfig_Server(),
				theChefserverPackage.getServer(),
				theChefserverPackage.getServer_KnifeConfig(), "server", null,
				0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnifeConfig_ServerCookbookVersion(),
				theChefserverPackage.getServerCookbookVersion(),
				theChefserverPackage.getServerCookbookVersion_KnifeConfig(),
				"serverCookbookVersion", null, 0, -1, KnifeConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getKnifeConfig_Repository(),
				theWorkstationPackage.getRepository(),
				theWorkstationPackage.getRepository_Knives(), "repository",
				null, 0, 1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knifeSearchEClass, KnifeSearch.class, "KnifeSearch",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
=======
		knifeConfigEClass.getESuperTypes().add(theChefclipsePackage.getConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(knifeConfigEClass, KnifeConfig.class, "KnifeConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnifeConfig_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
>>>>>>> origin/tomhodder
	}

} //KnifePackageImpl
