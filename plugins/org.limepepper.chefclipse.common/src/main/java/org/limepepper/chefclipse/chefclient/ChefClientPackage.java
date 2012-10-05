/**
 */
package org.limepepper.chefclipse.chefclient;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.chefserver.ChefPackage;

import org.limepepper.chefclipse.cookbook.CookbookPackage;

import org.limepepper.chefclipse.knife.KnifePackage;

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
 * @see org.limepepper.chefclipse.chefclient.ChefClientFactory
 * @model kind="package"
 * @generated
 */
public class ChefClientPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "chefclient";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://limepepper.org/chefclipse/v0.0.1/chefclipse";

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
	public static final ChefClientPackage eINSTANCE = org.limepepper.chefclipse.chefclient.ChefClientPackage.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefclient.Client <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefclient.Client
	 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getClient()
	 * @generated
	 */
	public static final int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT__SERVER = 0;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefclient.Ohai <em>Ohai</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefclient.Ohai
	 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getOhai()
	 * @generated
	 */
	public static final int OHAI = 1;

	/**
	 * The number of structural features of the '<em>Ohai</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OHAI_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefclient.Search <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefclient.Search
	 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getSearch()
	 * @generated
	 */
	public static final int SEARCH = 2;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.chefclient.OhaiPlugin <em>Ohai Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.chefclient.OhaiPlugin
	 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getOhaiPlugin()
	 * @generated
	 */
	public static final int OHAI_PLUGIN = 3;

	/**
	 * The number of structural features of the '<em>Ohai Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OHAI_PLUGIN_FEATURE_COUNT = 0;

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
	private EClass ohaiPluginEClass = null;

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
	 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChefClientPackage() {
		super(eNS_URI, ChefClientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChefClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChefClientPackage init() {
		if (isInited) return (ChefClientPackage)EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI);

		// Obtain or create and register package
		ChefClientPackage theChefClientPackage = (ChefClientPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChefClientPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChefClientPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefPackage theChefPackage = (ChefPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) instanceof ChefPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) : ChefPackage.eINSTANCE);
		CookbookPackage theCookbookPackage = (CookbookPackage)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackage ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		KnifePackage theKnifePackage = (KnifePackage)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackage ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		WorkstationPackage theWorkstationPackage = (WorkstationPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

		// Create package meta-data objects
		theChefClientPackage.createPackageContents();
		theChefPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theKnifePackage.createPackageContents();
		theWorkstationPackage.createPackageContents();

		// Initialize created meta-data
		theChefClientPackage.initializePackageContents();
		theChefPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChefClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChefClientPackage.eNS_URI, theChefClientPackage);
		return theChefClientPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefclient.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see org.limepepper.chefclipse.chefclient.Client
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.chefclient.Client#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.chefclient.Client#getServer()
	 * @see #getClient()
	 * @generated
	 */
	public EReference getClient_Server() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefclient.Ohai <em>Ohai</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ohai</em>'.
	 * @see org.limepepper.chefclipse.chefclient.Ohai
	 * @generated
	 */
	public EClass getOhai() {
		return ohaiEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefclient.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.limepepper.chefclipse.chefclient.Search
	 * @generated
	 */
	public EClass getSearch() {
		return searchEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.chefclient.OhaiPlugin <em>Ohai Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ohai Plugin</em>'.
	 * @see org.limepepper.chefclipse.chefclient.OhaiPlugin
	 * @generated
	 */
	public EClass getOhaiPlugin() {
		return ohaiPluginEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ChefClientFactory getChefClientFactory() {
		return (ChefClientFactory)getEFactoryInstance();
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

		ohaiPluginEClass = createEClass(OHAI_PLUGIN);
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
		ChefPackage theChefPackage = (ChefPackage)EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Server(), theChefPackage.getServer(), null, "server", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ohaiEClass, Ohai.class, "Ohai", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ohaiPluginEClass, OhaiPlugin.class, "OhaiPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefclient.Client <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefclient.Client
		 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getClient()
		 * @generated
		 */
		public static final EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLIENT__SERVER = eINSTANCE.getClient_Server();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefclient.Ohai <em>Ohai</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefclient.Ohai
		 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getOhai()
		 * @generated
		 */
		public static final EClass OHAI = eINSTANCE.getOhai();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefclient.Search <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefclient.Search
		 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getSearch()
		 * @generated
		 */
		public static final EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.chefclient.OhaiPlugin <em>Ohai Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.chefclient.OhaiPlugin
		 * @see org.limepepper.chefclipse.chefclient.ChefClientPackage#getOhaiPlugin()
		 * @generated
		 */
		public static final EClass OHAI_PLUGIN = eINSTANCE.getOhaiPlugin();

	}

} //ChefClientPackage
