/**
 */
package org.limepepper.chefclipse.cookbook.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.chefclient.ChefClientPackage;

import org.limepepper.chefclipse.chefclient.impl.ChefClientPackageImpl;

import org.limepepper.chefclipse.chefserver.ChefPackage;

import org.limepepper.chefclipse.chefserver.impl.ChefPackageImpl;

import org.limepepper.chefclipse.cookbook.Attribute;
import org.limepepper.chefclipse.cookbook.Cookbook;
import org.limepepper.chefclipse.cookbook.CookbookFactory;
import org.limepepper.chefclipse.cookbook.CookbookPackage;
import org.limepepper.chefclipse.cookbook.Definition;
import org.limepepper.chefclipse.cookbook.DependencyRelation;
import org.limepepper.chefclipse.cookbook.Library;
import org.limepepper.chefclipse.cookbook.Recipe;
import org.limepepper.chefclipse.cookbook.Resource;
import org.limepepper.chefclipse.cookbook.Version;
import org.limepepper.chefclipse.cookbook.supports;

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
public class CookbookPackageImpl extends EPackageImpl implements CookbookPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookbookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supportsEEnum = null;

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
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CookbookPackageImpl() {
		super(eNS_URI, CookbookFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CookbookPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CookbookPackage init() {
		if (isInited) return (CookbookPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI);

		// Obtain or create and register package
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CookbookPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefClientPackageImpl theChefClientPackage = (ChefClientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) instanceof ChefClientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefClientPackage.eNS_URI) : ChefClientPackage.eINSTANCE);
		ChefPackageImpl theChefPackage = (ChefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) instanceof ChefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefPackage.eNS_URI) : ChefPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

		// Create package meta-data objects
		theCookbookPackage.createPackageContents();
		theChefClientPackage.createPackageContents();
		theChefPackage.createPackageContents();
		theKnifePackage.createPackageContents();
		theWorkstationPackage.createPackageContents();

		// Initialize created meta-data
		theCookbookPackage.initializePackageContents();
		theChefClientPackage.initializePackageContents();
		theChefPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCookbookPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CookbookPackage.eNS_URI, theCookbookPackage);
		return theCookbookPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookbook() {
		return cookbookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbook_Depends() {
		return (EReference)cookbookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipe() {
		return recipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyRelation() {
		return dependencyRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getsupports() {
		return supportsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookFactory getCookbookFactory() {
		return (CookbookFactory)getEFactoryInstance();
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
		cookbookEClass = createEClass(COOKBOOK);
		createEReference(cookbookEClass, COOKBOOK__DEPENDS);

		definitionEClass = createEClass(DEFINITION);

		libraryEClass = createEClass(LIBRARY);

		attributeEClass = createEClass(ATTRIBUTE);

		recipeEClass = createEClass(RECIPE);

		versionEClass = createEClass(VERSION);

		resourceEClass = createEClass(RESOURCE);

		dependencyRelationEClass = createEClass(DEPENDENCY_RELATION);

		// Create enums
		supportsEEnum = createEEnum(SUPPORTS);
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
		initEClass(cookbookEClass, Cookbook.class, "Cookbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbook_Depends(), this.getDependencyRelation(), null, "depends", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyRelationEClass, DependencyRelation.class, "DependencyRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(supportsEEnum, supports.class, "supports");
		addEEnumLiteral(supportsEEnum, supports.CENTOS);
		addEEnumLiteral(supportsEEnum, supports.WINDOWS);
		addEEnumLiteral(supportsEEnum, supports.DEBIAN);

		// Create resource
		createResource(eNS_URI);
	}

} //CookbookPackageImpl
