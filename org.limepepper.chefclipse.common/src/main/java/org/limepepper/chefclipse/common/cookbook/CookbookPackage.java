/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;

import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;

import org.limepepper.chefclipse.common.knife.KnifePackage;

import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

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
 * @see org.limepepper.chefclipse.common.cookbook.CookbookFactory
 * @model kind="package"
 * @generated
 */
public class CookbookPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "cookbook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://limepepper.org/chefclipse/cookbook";

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
	public static final CookbookPackage eINSTANCE = org.limepepper.chefclipse.common.cookbook.CookbookPackage.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Cookbook <em>Cookbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbook()
	 * @generated
	 */
	public static final int COOKBOOK = 0;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COOKBOOK__DEPENDS = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COOKBOOK__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COOKBOOK__RECIPES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COOKBOOK__NAME = 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COOKBOOK__REPOSITORY = 4;

	/**
	 * The number of structural features of the '<em>Cookbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COOKBOOK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Definition <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Definition
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getDefinition()
	 * @generated
	 */
	public static final int DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Library <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Library
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getLibrary()
	 * @generated
	 */
	public static final int LIBRARY = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Attribute <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Attribute
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getAttribute()
	 * @generated
	 */
	public static final int ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Recipe <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe()
	 * @generated
	 */
	public static final int RECIPE = 4;

	/**
	 * The feature id for the '<em><b>Runlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPE__RUNLIST = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPE__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPE__COOKBOOK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECIPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Version <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Version
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getVersion()
	 * @generated
	 */
	public static final int VERSION = 5;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.Resource
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getResource()
	 * @generated
	 */
	public static final int RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__RECIPE = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.DependencyRelation <em>Dependency Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.DependencyRelation
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getDependencyRelation()
	 * @generated
	 */
	public static final int DEPENDENCY_RELATION = 7;

	/**
	 * The number of structural features of the '<em>Dependency Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_RELATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.supports <em>supports</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.supports
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getsupports()
	 * @generated
	 */
	public static final int SUPPORTS = 8;

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
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CookbookPackage() {
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
		CookbookPackage theCookbookPackage = (CookbookPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CookbookPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CookbookPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefclientPackage theChefclientPackage = (ChefclientPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
		ChefserverPackage theChefserverPackage = (ChefserverPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
		KnifePackage theKnifePackage = (KnifePackage)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackage ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		WorkstationPackage theWorkstationPackage = (WorkstationPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

		// Create package meta-data objects
		theCookbookPackage.createPackageContents();
		theChefclientPackage.createPackageContents();
		theChefserverPackage.createPackageContents();
		theKnifePackage.createPackageContents();
		theWorkstationPackage.createPackageContents();

		// Initialize created meta-data
		theCookbookPackage.initializePackageContents();
		theChefclientPackage.initializePackageContents();
		theChefserverPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCookbookPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CookbookPackage.eNS_URI, theCookbookPackage);
		return theCookbookPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Cookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cookbook</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook
	 * @generated
	 */
	public EClass getCookbook() {
		return cookbookEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getDepends()
	 * @see #getCookbook()
	 * @generated
	 */
	public EReference getCookbook_Depends() {
		return (EReference)cookbookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getEnvironment()
	 * @see #getCookbook()
	 * @generated
	 */
	public EReference getCookbook_Environment() {
		return (EReference)cookbookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipes</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getRecipes()
	 * @see #getCookbook()
	 * @generated
	 */
	public EReference getCookbook_Recipes() {
		return (EReference)cookbookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getName()
	 * @see #getCookbook()
	 * @generated
	 */
	public EAttribute getCookbook_Name() {
		return (EAttribute)cookbookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getRepository()
	 * @see #getCookbook()
	 * @generated
	 */
	public EReference getCookbook_Repository() {
		return (EReference)cookbookEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Definition
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Library
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Attribute
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe
	 * @generated
	 */
	public EClass getRecipe() {
		return recipeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRunlist <em>Runlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runlist</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe#getRunlist()
	 * @see #getRecipe()
	 * @generated
	 */
	public EReference getRecipe_Runlist() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe#getRole()
	 * @see #getRecipe()
	 * @generated
	 */
	public EReference getRecipe_Role() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe#getResources()
	 * @see #getRecipe()
	 * @generated
	 */
	public EReference getRecipe_Resources() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cookbook</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook()
	 * @see #getRecipe()
	 * @generated
	 */
	public EReference getRecipe_Cookbook() {
		return (EReference)recipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Recipe#getName()
	 * @see #getRecipe()
	 * @generated
	 */
	public EAttribute getRecipe_Name() {
		return (EAttribute)recipeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Version
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Resource
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link org.limepepper.chefclipse.common.cookbook.Resource#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recipe</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Resource#getRecipe()
	 * @see #getResource()
	 * @generated
	 */
	public EReference getResource_Recipe() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.DependencyRelation <em>Dependency Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Relation</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.DependencyRelation
	 * @generated
	 */
	public EClass getDependencyRelation() {
		return dependencyRelationEClass;
	}

	/**
	 * Returns the meta object for enum '{@link org.limepepper.chefclipse.common.cookbook.supports <em>supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>supports</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.supports
	 * @generated
	 */
	public EEnum getsupports() {
		return supportsEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		createEReference(cookbookEClass, COOKBOOK__ENVIRONMENT);
		createEReference(cookbookEClass, COOKBOOK__RECIPES);
		createEAttribute(cookbookEClass, COOKBOOK__NAME);
		createEReference(cookbookEClass, COOKBOOK__REPOSITORY);

		definitionEClass = createEClass(DEFINITION);

		libraryEClass = createEClass(LIBRARY);

		attributeEClass = createEClass(ATTRIBUTE);

		recipeEClass = createEClass(RECIPE);
		createEReference(recipeEClass, RECIPE__RUNLIST);
		createEReference(recipeEClass, RECIPE__ROLE);
		createEReference(recipeEClass, RECIPE__RESOURCES);
		createEReference(recipeEClass, RECIPE__COOKBOOK);
		createEAttribute(recipeEClass, RECIPE__NAME);

		versionEClass = createEClass(VERSION);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__RECIPE);

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

		// Obtain other dependent packages
		ChefserverPackage theChefserverPackage = (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);
		WorkstationPackage theWorkstationPackage = (WorkstationPackage)EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cookbookEClass, Cookbook.class, "Cookbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbook_Depends(), this.getDependencyRelation(), null, "depends", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbook_Environment(), theChefserverPackage.getEnvironment(), null, "environment", null, 1, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbook_Recipes(), this.getRecipe(), this.getRecipe_Cookbook(), "recipes", null, 0, -1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbook_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbook_Repository(), theWorkstationPackage.getRepository(), null, "repository", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecipe_Runlist(), theChefserverPackage.getRunList(), null, "runlist", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Role(), theChefserverPackage.getRole(), null, "role", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Resources(), this.getResource(), this.getResource_Recipe(), "resources", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Cookbook(), this.getCookbook(), this.getCookbook_Recipes(), "cookbook", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Recipe(), this.getRecipe(), this.getRecipe_Resources(), "recipe", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyRelationEClass, DependencyRelation.class, "DependencyRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(supportsEEnum, supports.class, "supports");
		addEEnumLiteral(supportsEEnum, supports.CENTOS);
		addEEnumLiteral(supportsEEnum, supports.WINDOWS);
		addEEnumLiteral(supportsEEnum, supports.DEBIAN);

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Cookbook <em>Cookbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Cookbook
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbook()
		 * @generated
		 */
		public static final EClass COOKBOOK = eINSTANCE.getCookbook();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COOKBOOK__DEPENDS = eINSTANCE.getCookbook_Depends();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COOKBOOK__ENVIRONMENT = eINSTANCE.getCookbook_Environment();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COOKBOOK__RECIPES = eINSTANCE.getCookbook_Recipes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COOKBOOK__NAME = eINSTANCE.getCookbook_Name();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COOKBOOK__REPOSITORY = eINSTANCE.getCookbook_Repository();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Definition <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Definition
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getDefinition()
		 * @generated
		 */
		public static final EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Library <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Library
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getLibrary()
		 * @generated
		 */
		public static final EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Attribute <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Attribute
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getAttribute()
		 * @generated
		 */
		public static final EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Recipe <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Recipe
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe()
		 * @generated
		 */
		public static final EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Runlist</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECIPE__RUNLIST = eINSTANCE.getRecipe_Runlist();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECIPE__ROLE = eINSTANCE.getRecipe_Role();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECIPE__RESOURCES = eINSTANCE.getRecipe_Resources();

		/**
		 * The meta object literal for the '<em><b>Cookbook</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECIPE__COOKBOOK = eINSTANCE.getRecipe_Cookbook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Version <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Version
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getVersion()
		 * @generated
		 */
		public static final EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.Resource <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.Resource
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getResource()
		 * @generated
		 */
		public static final EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESOURCE__RECIPE = eINSTANCE.getResource_Recipe();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.DependencyRelation <em>Dependency Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.DependencyRelation
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getDependencyRelation()
		 * @generated
		 */
		public static final EClass DEPENDENCY_RELATION = eINSTANCE.getDependencyRelation();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.supports <em>supports</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.supports
		 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getsupports()
		 * @generated
		 */
		public static final EEnum SUPPORTS = eINSTANCE.getsupports();

	}

} //CookbookPackage
