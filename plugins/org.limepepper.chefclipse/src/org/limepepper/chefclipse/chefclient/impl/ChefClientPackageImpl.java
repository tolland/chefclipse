/**
 */
package org.limepepper.chefclipse.chefclient.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.chefclient.ChefClientFactory;
import org.limepepper.chefclipse.chefclient.ChefClientPackage;
import org.limepepper.chefclipse.chefclient.Client;

import org.limepepper.chefclipse.chefserver.ChefPackage;

import org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl;

import org.limepepper.chefclipse.cookbook.CookbookPackage;

import org.limepepper.chefclipse.cookbook.impl.CookbookPackageImpl;

import org.limepepper.chefclipse.knife.KnifePackage;

import org.limepepper.chefclipse.knife.impl.KnifePackageImpl;

import org.limepepper.chefclipse.workstation.WorkstationPackage;

import org.limepepper.chefclipse.workstation.impl.WorkstationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefClientPackageImpl extends EPackageImpl implements ChefClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

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
	private ChefClientPackageImpl() {
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
		ChefClientPackageImpl theChefClientPackage = (ChefClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChefClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChefClientPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefPackageImpl theChefPackage = (ChefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) instanceof ChefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) : ChefPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

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
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ChefClientPackageImpl
