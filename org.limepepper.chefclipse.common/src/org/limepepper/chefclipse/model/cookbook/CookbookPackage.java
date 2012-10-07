/**
 */
package org.limepepper.chefclipse.model.cookbook;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.limepepper.chefclipse.model.cookbook.CookbookFactory
 * @model kind="package"
 * @generated
 */
public interface CookbookPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cookbook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://limepepper.org/chefclipse/cookbook";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.limepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CookbookPackage eINSTANCE = org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl <em>Cookbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getCookbook()
	 * @generated
	 */
	int COOKBOOK = 0;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK__DEPENDS = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK__RECIPES = 2;

	/**
	 * The number of structural features of the '<em>Cookbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.DefinitionImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.LibraryImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.AttributeImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 4;

	/**
	 * The feature id for the '<em><b>Runlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__RUNLIST = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__COOKBOOK = 3;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.VersionImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 5;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.ResourceImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RECIPE = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.impl.DependencyRelationImpl <em>Dependency Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.impl.DependencyRelationImpl
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getDependencyRelation()
	 * @generated
	 */
	int DEPENDENCY_RELATION = 7;

	/**
	 * The number of structural features of the '<em>Dependency Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.cookbook.supports <em>supports</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.cookbook.supports
	 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getsupports()
	 * @generated
	 */
	int SUPPORTS = 8;


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Cookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cookbook</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Cookbook
	 * @generated
	 */
	EClass getCookbook();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Cookbook#getDepends()
	 * @see #getCookbook()
	 * @generated
	 */
	EReference getCookbook_Depends();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Cookbook#getEnvironment()
	 * @see #getCookbook()
	 * @generated
	 */
	EReference getCookbook_Environment();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipes</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Cookbook#getRecipes()
	 * @see #getCookbook()
	 * @generated
	 */
	EReference getCookbook_Recipes();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getRunlist <em>Runlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runlist</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe#getRunlist()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Runlist();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe#getRole()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe#getResources()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Resources();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getCookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cookbook</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe#getCookbook()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Cookbook();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the container reference '{@link org.limepepper.chefclipse.model.cookbook.Resource#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recipe</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.Resource#getRecipe()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Recipe();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.cookbook.DependencyRelation <em>Dependency Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Relation</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.DependencyRelation
	 * @generated
	 */
	EClass getDependencyRelation();

	/**
	 * Returns the meta object for enum '{@link org.limepepper.chefclipse.model.cookbook.supports <em>supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>supports</em>'.
	 * @see org.limepepper.chefclipse.model.cookbook.supports
	 * @generated
	 */
	EEnum getsupports();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CookbookFactory getCookbookFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl <em>Cookbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getCookbook()
		 * @generated
		 */
		EClass COOKBOOK = eINSTANCE.getCookbook();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOK__DEPENDS = eINSTANCE.getCookbook_Depends();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOK__ENVIRONMENT = eINSTANCE.getCookbook_Environment();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOK__RECIPES = eINSTANCE.getCookbook_Recipes();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.DefinitionImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.LibraryImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.AttributeImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Runlist</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__RUNLIST = eINSTANCE.getRecipe_Runlist();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__ROLE = eINSTANCE.getRecipe_Role();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__RESOURCES = eINSTANCE.getRecipe_Resources();

		/**
		 * The meta object literal for the '<em><b>Cookbook</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__COOKBOOK = eINSTANCE.getRecipe_Cookbook();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.VersionImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.ResourceImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RECIPE = eINSTANCE.getResource_Recipe();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.impl.DependencyRelationImpl <em>Dependency Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.impl.DependencyRelationImpl
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getDependencyRelation()
		 * @generated
		 */
		EClass DEPENDENCY_RELATION = eINSTANCE.getDependencyRelation();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.cookbook.supports <em>supports</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.cookbook.supports
		 * @see org.limepepper.chefclipse.model.cookbook.impl.CookbookPackageImpl#getsupports()
		 * @generated
		 */
		EEnum SUPPORTS = eINSTANCE.getsupports();

	}

} //CookbookPackage
