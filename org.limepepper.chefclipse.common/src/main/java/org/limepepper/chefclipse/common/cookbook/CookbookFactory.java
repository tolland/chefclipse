/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage
 * @generated
 */
public interface CookbookFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    CookbookFactory eINSTANCE = org.limepepper.chefclipse.common.cookbook.impl.CookbookFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
    CookbookVersion createCookbookVersion();

    /**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
    Definition createDefinition();

    /**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
    Library createLibrary();

    /**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
    Attribute createAttribute();

    /**
	 * Returns a new object of class '<em>Recipe</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe</em>'.
	 * @generated
	 */
    Recipe createRecipe();

    /**
	 * Returns a new object of class '<em>Recipe Description</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recipe Description</em>'.
	 * @generated
	 */
    RecipeDescription createRecipeDescription();

    /**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
    Resource createResource();

    /**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
    Template createTemplate();

    /**
	 * Returns a new object of class '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes</em>'.
	 * @generated
	 */
    Attributes createAttributes();

    /**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
    File createFile();

    /**
	 * Returns a new object of class '<em>Dependency Relation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Relation</em>'.
	 * @generated
	 */
    DependencyRelation createDependencyRelation();

    /**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
    Metadata createMetadata();

    /**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
    Provider createProvider();

    /**
	 * Returns a new object of class '<em>Root file</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root file</em>'.
	 * @generated
	 */
    Root_file createRoot_file();

    /**
	 * Returns a new object of class '<em>Minimal Metadata</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimal Metadata</em>'.
	 * @generated
	 */
    MinimalMetadata createMinimalMetadata();

    /**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated
	 */
    Name createName();

    /**
	 * Returns a new object of class '<em>Cookbook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cookbook</em>'.
	 * @generated
	 */
	Cookbook createCookbook();

				/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    CookbookPackage getCookbookPackage();

} //CookbookFactory
