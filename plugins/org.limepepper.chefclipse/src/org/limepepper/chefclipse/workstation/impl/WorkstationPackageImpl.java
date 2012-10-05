/**
 */
package org.limepepper.chefclipse.workstation.impl;

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

import org.limepepper.chefclipse.knife.KnifePackage;

import org.limepepper.chefclipse.knife.impl.KnifePackageImpl;

import org.limepepper.chefclipse.workstation.Config;
import org.limepepper.chefclipse.workstation.Repository;
import org.limepepper.chefclipse.workstation.WorkstationFactory;
import org.limepepper.chefclipse.workstation.WorkstationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkstationPackageImpl extends EPackageImpl implements WorkstationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

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
	 * @see org.limepepper.chefclipse.workstation.WorkstationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkstationPackageImpl() {
		super(eNS_URI, WorkstationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkstationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkstationPackage init() {
		if (isInited) return (WorkstationPackage)EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI);

		// Obtain or create and register package
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkstationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefClientPackageImpl theChefClientPackage = (ChefClientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) instanceof ChefClientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) : ChefClientPackage.eINSTANCE);
		ChefPackageImpl theChefPackage = (ChefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) instanceof ChefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) : ChefPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);

		// Create package meta-data objects
		theWorkstationPackage.createPackageContents();
		theChefClientPackage.createPackageContents();
		theChefPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theKnifePackage.createPackageContents();

		// Initialize created meta-data
		theWorkstationPackage.initializePackageContents();
		theChefClientPackage.initializePackageContents();
		theChefPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkstationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkstationPackage.eNS_URI, theWorkstationPackage);
		return theWorkstationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Cookbooks() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Configuration() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstationFactory getWorkstationFactory() {
		return (WorkstationFactory)getEFactoryInstance();
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
		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__COOKBOOKS);
		createEReference(repositoryEClass, REPOSITORY__CONFIGURATION);

		configEClass = createEClass(CONFIG);
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
		CookbookPackage theCookbookPackage = (CookbookPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Cookbooks(), theCookbookPackage.getCookbook(), null, "cookbooks", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRepository_Configuration(), this.getConfig(), null, "configuration", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WorkstationPackageImpl
