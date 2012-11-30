/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.limepepper.chefclipse.ChefclipsePackage;

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
    String eNS_URI = "http://limepepper.org/chefclipse/1.0.0/cookbook";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.limepepper.chefclipse";

    /**
     * The package content type ID.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eCONTENT_TYPE = "org.limepepper.chefclipse.content-types.cookbook";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CookbookPackage eINSTANCE = org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl.init();

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbookVersion()
     * @generated
     */
    int COOKBOOK_VERSION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__NAME = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__DESCRIPTION = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Depends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__DEPENDS = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Environment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__ENVIRONMENT = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Templates</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__TEMPLATES = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__RECIPES = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__DEFINITIONS = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Files</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__FILES = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION__RESOURCES = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Version</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_FEATURE_COUNT = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getDefinition()
     * @generated
     */
    int DEFINITION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITION__NAME = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITION__DESCRIPTION = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITION_FEATURE_COUNT = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.LibraryImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getLibrary()
     * @generated
     */
    int LIBRARY = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIBRARY__NAME = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIBRARY__DESCRIPTION = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIBRARY_FEATURE_COUNT = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.AttributeImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = ChefclipsePackage.NAMED_OBJECT__NAME;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = ChefclipsePackage.NAMED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeImpl <em>Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.RecipeImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRecipe()
     * @generated
     */
    int RECIPE = 4;

    /**
     * The feature id for the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__EXTENSION = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__NAME = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__CHECKSUM = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__PATH = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__SPECIFICITY = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__URL = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Cookbook Version</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__COOKBOOK_VERSION = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__RESOURCES = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__ROLE = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Runlist</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__RUNLIST = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Cookbook</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE__COOKBOOK = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Recipe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECIPE_FEATURE_COUNT = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getResource()
     * @generated
     */
    int RESOURCE = 5;

    /**
     * The feature id for the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__EXTENSION = ChefclipsePackage.RUBY_FILE__EXTENSION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__NAME = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__CHECKSUM = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__PATH = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__SPECIFICITY = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__URL = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Recipe</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__RECIPE = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_FEATURE_COUNT = ChefclipsePackage.RUBY_FILE_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getTemplate()
     * @generated
     */
    int TEMPLATE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE__NAME = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE__CHECKSUM = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE__PATH = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE__SPECIFICITY = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE__URL = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Cookbook</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE__COOKBOOK = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLATE_FEATURE_COUNT = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl <em>Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getAttributes()
     * @generated
     */
    int ATTRIBUTES = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES__NAME = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES__CHECKSUM = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES__PATH = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES__SPECIFICITY = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES__URL = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES_FEATURE_COUNT = ChefclipsePackage.SANDBOXED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.FileImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getFile()
     * @generated
     */
    int FILE = 8;

    /**
     * The feature id for the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__EXTENSION = RESOURCE__EXTENSION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__NAME = RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__CHECKSUM = RESOURCE__CHECKSUM;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__PATH = RESOURCE__PATH;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__SPECIFICITY = RESOURCE__SPECIFICITY;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__URL = RESOURCE__URL;

    /**
     * The feature id for the '<em><b>Recipe</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE__RECIPE = RESOURCE__RECIPE;

    /**
     * The number of structural features of the '<em>File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.DependencyRelationImpl <em>Dependency Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.DependencyRelationImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getDependencyRelation()
     * @generated
     */
    int DEPENDENCY_RELATION = 9;

    /**
     * The number of structural features of the '<em>Dependency Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_RELATION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl <em>Cookbook</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbook()
     * @generated
     */
    int COOKBOOK = 10;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK__NAME = 3;

    /**
     * The feature id for the '<em><b>Repository</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK__REPOSITORY = 4;

    /**
     * The number of structural features of the '<em>Cookbook</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.impl.VersionImpl
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getVersion()
     * @generated
     */
    int VERSION = 11;

    /**
     * The number of structural features of the '<em>Version</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.supports <em>supports</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.cookbook.supports
     * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getsupports()
     * @generated
     */
    int SUPPORTS = 12;


    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Version</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion
     * @generated
     */
    EClass getCookbookVersion();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDepends <em>Depends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Depends</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDepends()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Depends();

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getEnvironment <em>Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Environment</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getEnvironment()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Environment();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getTemplates <em>Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Templates</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getTemplates()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Templates();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRecipes <em>Recipes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Recipes</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRecipes()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Recipes();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Definitions</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDefinitions()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Definitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getFiles <em>Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Files</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getFiles()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Files();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getResources()
     * @see #getCookbookVersion()
     * @generated
     */
    EReference getCookbookVersion_Resources();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Definition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Definition</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Definition
     * @generated
     */
    EClass getDefinition();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Library <em>Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Library</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Library
     * @generated
     */
    EClass getLibrary();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Recipe <em>Recipe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Recipe</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe
     * @generated
     */
    EClass getRecipe();

    /**
     * Returns the meta object for the container reference '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getCookbookVersion <em>Cookbook Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Cookbook Version</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe#getCookbookVersion()
     * @see #getRecipe()
     * @generated
     */
    EReference getRecipe_CookbookVersion();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe#getResources()
     * @see #getRecipe()
     * @generated
     */
    EReference getRecipe_Resources();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Role</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe#getRole()
     * @see #getRecipe()
     * @generated
     */
    EReference getRecipe_Role();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRunlist <em>Runlist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Runlist</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe#getRunlist()
     * @see #getRecipe()
     * @generated
     */
    EReference getRecipe_Runlist();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook <em>Cookbook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Cookbook</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook()
     * @see #getRecipe()
     * @generated
     */
    EReference getRecipe_Cookbook();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Resource
     * @generated
     */
    EClass getResource();

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Resource#getRecipe <em>Recipe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Recipe</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Resource#getRecipe()
     * @see #getResource()
     * @generated
     */
    EReference getResource_Recipe();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Template <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Template</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Template
     * @generated
     */
    EClass getTemplate();

    /**
     * Returns the meta object for the container reference '{@link org.limepepper.chefclipse.common.cookbook.Template#getCookbook <em>Cookbook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Cookbook</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Template#getCookbook()
     * @see #getTemplate()
     * @generated
     */
    EReference getTemplate_Cookbook();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Attributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attributes</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Attributes
     * @generated
     */
    EClass getAttributes();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.File <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.File
     * @generated
     */
    EClass getFile();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.DependencyRelation <em>Dependency Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency Relation</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.DependencyRelation
     * @generated
     */
    EClass getDependencyRelation();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Cookbook <em>Cookbook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Cookbook
     * @generated
     */
    EClass getCookbook();

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getDepends <em>Depends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Depends</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getDepends()
     * @see #getCookbook()
     * @generated
     */
    EReference getCookbook_Depends();

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getEnvironment <em>Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Environment</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getEnvironment()
     * @see #getCookbook()
     * @generated
     */
    EReference getCookbook_Environment();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getRecipes <em>Recipes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Recipes</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getRecipes()
     * @see #getCookbook()
     * @generated
     */
    EReference getCookbook_Recipes();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getName()
     * @see #getCookbook()
     * @generated
     */
    EAttribute getCookbook_Name();

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Repository</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getRepository()
     * @see #getCookbook()
     * @generated
     */
    EReference getCookbook_Repository();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Version <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Version</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.Version
     * @generated
     */
    EClass getVersion();

    /**
     * Returns the meta object for enum '{@link org.limepepper.chefclipse.common.cookbook.supports <em>supports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>supports</em>'.
     * @see org.limepepper.chefclipse.common.cookbook.supports
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
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl <em>Version</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbookVersion()
         * @generated
         */
        EClass COOKBOOK_VERSION = eINSTANCE.getCookbookVersion();

        /**
         * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__DEPENDS = eINSTANCE.getCookbookVersion_Depends();

        /**
         * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__ENVIRONMENT = eINSTANCE.getCookbookVersion_Environment();

        /**
         * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__TEMPLATES = eINSTANCE.getCookbookVersion_Templates();

        /**
         * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__RECIPES = eINSTANCE.getCookbookVersion_Recipes();

        /**
         * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__DEFINITIONS = eINSTANCE.getCookbookVersion_Definitions();

        /**
         * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__FILES = eINSTANCE.getCookbookVersion_Files();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION__RESOURCES = eINSTANCE.getCookbookVersion_Resources();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl <em>Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getDefinition()
         * @generated
         */
        EClass DEFINITION = eINSTANCE.getDefinition();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.LibraryImpl <em>Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.LibraryImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getLibrary()
         * @generated
         */
        EClass LIBRARY = eINSTANCE.getLibrary();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.AttributeImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeImpl <em>Recipe</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.RecipeImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRecipe()
         * @generated
         */
        EClass RECIPE = eINSTANCE.getRecipe();

        /**
         * The meta object literal for the '<em><b>Cookbook Version</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECIPE__COOKBOOK_VERSION = eINSTANCE.getRecipe_CookbookVersion();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECIPE__RESOURCES = eINSTANCE.getRecipe_Resources();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECIPE__ROLE = eINSTANCE.getRecipe_Role();

        /**
         * The meta object literal for the '<em><b>Runlist</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECIPE__RUNLIST = eINSTANCE.getRecipe_Runlist();

        /**
         * The meta object literal for the '<em><b>Cookbook</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECIPE__COOKBOOK = eINSTANCE.getRecipe_Cookbook();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl <em>Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getResource()
         * @generated
         */
        EClass RESOURCE = eINSTANCE.getResource();

        /**
         * The meta object literal for the '<em><b>Recipe</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE__RECIPE = eINSTANCE.getResource_Recipe();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl <em>Template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getTemplate()
         * @generated
         */
        EClass TEMPLATE = eINSTANCE.getTemplate();

        /**
         * The meta object literal for the '<em><b>Cookbook</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEMPLATE__COOKBOOK = eINSTANCE.getTemplate_Cookbook();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl <em>Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getAttributes()
         * @generated
         */
        EClass ATTRIBUTES = eINSTANCE.getAttributes();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl <em>File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.FileImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getFile()
         * @generated
         */
        EClass FILE = eINSTANCE.getFile();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.DependencyRelationImpl <em>Dependency Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.DependencyRelationImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getDependencyRelation()
         * @generated
         */
        EClass DEPENDENCY_RELATION = eINSTANCE.getDependencyRelation();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl <em>Cookbook</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbook()
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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK__NAME = eINSTANCE.getCookbook_Name();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK__REPOSITORY = eINSTANCE.getCookbook_Repository();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.VersionImpl <em>Version</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.impl.VersionImpl
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getVersion()
         * @generated
         */
        EClass VERSION = eINSTANCE.getVersion();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.supports <em>supports</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.cookbook.supports
         * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getsupports()
         * @generated
         */
        EEnum SUPPORTS = eINSTANCE.getsupports();

    }

} //CookbookPackage
