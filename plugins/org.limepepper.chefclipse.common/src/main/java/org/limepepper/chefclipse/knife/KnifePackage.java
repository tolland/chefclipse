/**
 */
package org.limepepper.chefclipse.knife;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.chefclient.ChefClientPackage;

import org.limepepper.chefclipse.chefserver.ChefPackage;

import org.limepepper.chefclipse.cookbook.CookbookPackage;

import org.limepepper.chefclipse.workstation.WorkstationPackage;

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
 * @see org.limepepper.chefclipse.knife.KnifeFactory
 * @model kind="package"
 * @generated
 */
public class KnifePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "knife";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://limepepper.org/chefclipse/v0.0.1//knife";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.limepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KnifePackage eINSTANCE = org.limepepper.chefclipse.knife.KnifePackage.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.knife.KnifeConfig <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.knife.KnifeConfig
	 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifeConfig()
	 * @generated
	 */
	public static final int KNIFE_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KNIFE_CONFIG__PLUGINS = 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KNIFE_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.knife.KnifePlugin <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.knife.KnifePlugin
	 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifePlugin()
	 * @generated
	 */
	public static final int KNIFE_PLUGIN = 1;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KNIFE_PLUGIN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.knife.KnifeSearch <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.knife.KnifeSearch
	 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifeSearch()
	 * @generated
	 */
	public static final int KNIFE_SEARCH = 2;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KNIFE_SEARCH_FEATURE_COUNT = 0;

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
	private EClass knifePluginEClass = null;

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
	 * @see org.limepepper.chefclipse.knife.KnifePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KnifePackage() {
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
		KnifePackage theKnifePackage = (KnifePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KnifePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KnifePackage());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefClientPackage theChefClientPackage = (ChefClientPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) instanceof ChefClientPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) : ChefClientPackage.eINSTANCE);
		ChefPackage theChefPackage = (ChefPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) instanceof ChefPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) : ChefPackage.eINSTANCE);
		CookbookPackage theCookbookPackage = (CookbookPackage)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackage ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		WorkstationPackage theWorkstationPackage = (WorkstationPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

		// Create package meta-data objects
		theKnifePackage.createPackageContents();
		theChefClientPackage.createPackageContents();
		theChefPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theWorkstationPackage.createPackageContents();

		// Initialize created meta-data
		theKnifePackage.initializePackageContents();
		theChefClientPackage.initializePackageContents();
		theChefPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKnifePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KnifePackage.eNS_URI, theKnifePackage);
		return theKnifePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.knife.KnifeConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.knife.KnifeConfig
	 * @generated
	 */
	public EClass getKnifeConfig() {
		return knifeConfigEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.knife.KnifeConfig#getPluginsList <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see org.limepepper.chefclipse.knife.KnifeConfig#getPluginsList()
	 * @see #getKnifeConfig()
	 * @generated
	 */
	public EReference getKnifeConfig_Plugins() {
		return (EReference)knifeConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.knife.KnifePlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.limepepper.chefclipse.knife.KnifePlugin
	 * @generated
	 */
	public EClass getKnifePlugin() {
		return knifePluginEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.knife.KnifeSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.limepepper.chefclipse.knife.KnifeSearch
	 * @generated
	 */
	public EClass getKnifeSearch() {
		return knifeSearchEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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

		knifePluginEClass = createEClass(KNIFE_PLUGIN);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(knifeConfigEClass, KnifeConfig.class, "KnifeConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnifeConfig_Plugins(), this.getKnifePlugin(), null, "plugins", null, 0, -1, KnifeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knifePluginEClass, KnifePlugin.class, "KnifePlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knifeSearchEClass, KnifeSearch.class, "KnifeSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.knife.KnifeConfig <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.knife.KnifeConfig
		 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifeConfig()
		 * @generated
		 */
		public static final EClass KNIFE_CONFIG = eINSTANCE.getKnifeConfig();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference KNIFE_CONFIG__PLUGINS = eINSTANCE.getKnifeConfig_Plugins();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.knife.KnifePlugin <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.knife.KnifePlugin
		 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifePlugin()
		 * @generated
		 */
		public static final EClass KNIFE_PLUGIN = eINSTANCE.getKnifePlugin();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.knife.KnifeSearch <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.knife.KnifeSearch
		 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifeSearch()
		 * @generated
		 */
		public static final EClass KNIFE_SEARCH = eINSTANCE.getKnifeSearch();

	}

} //KnifePackage
