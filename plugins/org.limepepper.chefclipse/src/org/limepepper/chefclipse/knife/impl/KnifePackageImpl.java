/**
 */
package org.limepepper.chefclipse.knife.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.chefclient.ChefClientPackage;

import org.limepepper.chefclipse.chefclient.impl.ChefClientPackageImpl;

import org.limepepper.chefclipse.chefserver.ChefPackage;

import org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl;

import org.limepepper.chefclipse.cookbook.CookbookPackage;

import org.limepepper.chefclipse.cookbook.impl.CookbookPackageImpl;

import org.limepepper.chefclipse.knife.Configuration;
import org.limepepper.chefclipse.knife.KnifeFactory;
import org.limepepper.chefclipse.knife.KnifePackage;
import org.limepepper.chefclipse.knife.KnifeSearch;
import org.limepepper.chefclipse.knife.Plugin;

import org.limepepper.chefclipse.workstation.WorkstationPackage;

import org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl;

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
	private EClass configurationEClass = null;

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
	 * @see org.limepepper.chefclipse.knife.KnifePackage#eNS_URI
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
		ChefClientPackageImpl theChefClientPackage = (ChefClientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) instanceof ChefClientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) : ChefClientPackage.eINSTANCE);
		ChefPackageImpl theChefPackage = (ChefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) instanceof ChefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) : ChefPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Plugins() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__PLUGINS);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knifeSearchEClass, KnifeSearch.class, "KnifeSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KnifePackageImpl
