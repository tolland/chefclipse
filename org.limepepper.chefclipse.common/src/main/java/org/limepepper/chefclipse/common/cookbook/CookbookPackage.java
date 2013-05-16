/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.limepepper.chefclipse.utility.UtilityPackage;

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
    String eNS_URI = "http://limepepper.org/v1/chefclipse/cookbook";

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;

    /**
	 * The feature id for the '<em><b>Json class</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__JSON_CLASS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Chef type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__CHEF_TYPE = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__ENVIRONMENT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__TEMPLATES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__RECIPES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__DEFINITIONS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_VERSION__FILES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 6;

				/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__RESOURCES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__LIBRARIES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__METADATA = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__PROVIDERS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 10;

    /**
	 * The feature id for the '<em><b>Root files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__ROOT_FILES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 11;

    /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__ATTRIBUTES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 12;

    /**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__CATALOG = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 13;

    /**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__DEPENDS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 14;

    /**
	 * The feature id for the '<em><b>Missing</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION__MISSING = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 15;

    /**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_VERSION_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 16;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.LibraryImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getLibrary()
	 * @generated
	 */
    int LIBRARY = 2;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.RecipeImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRecipe()
	 * @generated
	 */
    int RECIPE = 4;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeDescriptionImpl <em>Recipe Description</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.RecipeDescriptionImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRecipeDescription()
	 * @generated
	 */
    int RECIPE_DESCRIPTION = 5;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getResource()
	 * @generated
	 */
    int RESOURCE = 6;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getTemplate()
	 * @generated
	 */
    int TEMPLATE = 7;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getAttributes()
	 * @generated
	 */
    int ATTRIBUTES = 8;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.DependencyRelationImpl <em>Dependency Relation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.DependencyRelationImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getDependencyRelation()
	 * @generated
	 */
    int DEPENDENCY_RELATION = 10;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getMetadata()
	 * @generated
	 */
    int METADATA = 11;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.ProviderImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getProvider()
	 * @generated
	 */
    int PROVIDER = 12;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl <em>Root file</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRoot_file()
	 * @generated
	 */
    int ROOT_FILE = 13;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.MinimalMetadataImpl <em>Minimal Metadata</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.MinimalMetadataImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getMinimalMetadata()
	 * @generated
	 */
    int MINIMAL_METADATA = 14;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbookFile()
	 * @generated
	 */
    int COOKBOOK_FILE = 15;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__NAME = UtilityPackage.NAMED_OBJECT__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__ID = UtilityPackage.NAMED_OBJECT__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__CHECKSUM = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__URL = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__BYTES = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__PATH = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__SPECIFICITY = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FILE__COOKBOOK = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 5;

				/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COOKBOOK_FILE_FEATURE_COUNT = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 6;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFINITION_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LIBRARY_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__EXTENSION = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__ROLE = COOKBOOK_FILE_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Runlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE__RUNLIST = COOKBOOK_FILE_FEATURE_COUNT + 2;

				/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE_DESCRIPTION__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE_DESCRIPTION__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE_DESCRIPTION__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;

				/**
	 * The number of structural features of the '<em>Recipe Description</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RECIPE_DESCRIPTION_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE__EXTENSION = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOURCE_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TEMPLATE_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EXTENSION = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTES_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 1;

				/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.FileImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Dependency Relation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY_RELATION_FEATURE_COUNT = 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__EXTENSION = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__MAINTAINER = COOKBOOK_FILE_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Maintainer email</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__MAINTAINER_EMAIL = COOKBOOK_FILE_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__LICENSE = COOKBOOK_FILE_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__DESCRIPTION = COOKBOOK_FILE_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Long description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__LONG_DESCRIPTION = COOKBOOK_FILE_FEATURE_COUNT + 5;

				/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__VERSION = COOKBOOK_FILE_FEATURE_COUNT + 6;

				/**
	 * The feature id for the '<em><b>Replaces</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__REPLACES = COOKBOOK_FILE_FEATURE_COUNT + 7;

				/**
	 * The feature id for the '<em><b>Provides</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__PROVIDES = COOKBOOK_FILE_FEATURE_COUNT + 8;

				/**
	 * The feature id for the '<em><b>Conflicts</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__CONFLICTS = COOKBOOK_FILE_FEATURE_COUNT + 9;

				/**
	 * The feature id for the '<em><b>Suggests</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__SUGGESTS = COOKBOOK_FILE_FEATURE_COUNT + 10;

				/**
	 * The feature id for the '<em><b>Dependencies</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__DEPENDENCIES = COOKBOOK_FILE_FEATURE_COUNT + 11;

				/**
	 * The feature id for the '<em><b>Platforms</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__PLATFORMS = COOKBOOK_FILE_FEATURE_COUNT + 12;

				/**
	 * The feature id for the '<em><b>Recipes</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA__RECIPES = COOKBOOK_FILE_FEATURE_COUNT + 13;

				/**
	 * The feature id for the '<em><b>Replacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REPLACING = COOKBOOK_FILE_FEATURE_COUNT + 14;

				/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int METADATA_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 15;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROVIDER_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE__NAME = COOKBOOK_FILE__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE__ID = COOKBOOK_FILE__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE__CHECKSUM = COOKBOOK_FILE__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE__URL = COOKBOOK_FILE__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FILE__BYTES = COOKBOOK_FILE__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE__PATH = COOKBOOK_FILE__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE__SPECIFICITY = COOKBOOK_FILE__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FILE__COOKBOOK = COOKBOOK_FILE__COOKBOOK;

				/**
	 * The number of structural features of the '<em>Root file</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_FILE_FEATURE_COUNT = COOKBOOK_FILE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__NAME = METADATA__NAME;

				/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__ID = METADATA__ID;

				/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__CHECKSUM = METADATA__CHECKSUM;

				/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__URL = METADATA__URL;

				/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__BYTES = METADATA__BYTES;

				/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__PATH = METADATA__PATH;

				/**
	 * The feature id for the '<em><b>Specificity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__SPECIFICITY = METADATA__SPECIFICITY;

				/**
	 * The feature id for the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__COOKBOOK = METADATA__COOKBOOK;

				/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__EXTENSION = METADATA__EXTENSION;

				/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__MAINTAINER = METADATA__MAINTAINER;

				/**
	 * The feature id for the '<em><b>Maintainer email</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__MAINTAINER_EMAIL = METADATA__MAINTAINER_EMAIL;

				/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__LICENSE = METADATA__LICENSE;

				/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__DESCRIPTION = METADATA__DESCRIPTION;

				/**
	 * The feature id for the '<em><b>Long description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__LONG_DESCRIPTION = METADATA__LONG_DESCRIPTION;

				/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__VERSION = METADATA__VERSION;

				/**
	 * The feature id for the '<em><b>Replaces</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__REPLACES = METADATA__REPLACES;

				/**
	 * The feature id for the '<em><b>Provides</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__PROVIDES = METADATA__PROVIDES;

				/**
	 * The feature id for the '<em><b>Conflicts</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__CONFLICTS = METADATA__CONFLICTS;

				/**
	 * The feature id for the '<em><b>Suggests</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__SUGGESTS = METADATA__SUGGESTS;

				/**
	 * The feature id for the '<em><b>Dependencies</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__DEPENDENCIES = METADATA__DEPENDENCIES;

				/**
	 * The feature id for the '<em><b>Platforms</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__PLATFORMS = METADATA__PLATFORMS;

				/**
	 * The feature id for the '<em><b>Recipes</b></em>' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA__RECIPES = METADATA__RECIPES;

				/**
	 * The feature id for the '<em><b>Replacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_METADATA__REPLACING = METADATA__REPLACING;

				/**
	 * The number of structural features of the '<em>Minimal Metadata</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MINIMAL_METADATA_FEATURE_COUNT = METADATA_FEATURE_COUNT + 0;

				/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl <em>Cookbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl
	 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbook()
	 * @generated
	 */
	int COOKBOOK = 16;

				/**
	 * The feature id for the '<em><b>Json class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK__JSON_CLASS = 0;

				/**
	 * The feature id for the '<em><b>Chef type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK__CHEF_TYPE = 1;

				/**
	 * The number of structural features of the '<em>Cookbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOK_FEATURE_COUNT = 2;


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
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getLibraries()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EReference getCookbookVersion_Libraries();

    /**
	 * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMetadata()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EReference getCookbookVersion_Metadata();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getProviders()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EReference getCookbookVersion_Providers();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRoot_files <em>Root files</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root files</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRoot_files()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EReference getCookbookVersion_Root_files();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getAttributes()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EReference getCookbookVersion_Attributes();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getCatalog()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EAttribute getCookbookVersion_Catalog();

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
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Missing</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMissing()
	 * @see #getCookbookVersion()
	 * @generated
	 */
    EReference getCookbookVersion_Missing();

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
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.RecipeDescription <em>Recipe Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe Description</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.RecipeDescription
	 * @generated
	 */
    EClass getRecipeDescription();

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
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Template
	 * @generated
	 */
    EClass getTemplate();

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
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata
	 * @generated
	 */
    EClass getMetadata();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getLong_description <em>Long description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long description</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getLong_description()
	 * @see #getMetadata()
	 * @generated
	 */
    EAttribute getMetadata_Long_description();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getVersion()
	 * @see #getMetadata()
	 * @generated
	 */
    EAttribute getMetadata_Version();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getReplaces <em>Replaces</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Replaces</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getReplaces()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Replaces();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Provides</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getProvides()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Provides();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Conflicts</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getConflicts()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Conflicts();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getSuggests <em>Suggests</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Suggests</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getSuggests()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Suggests();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Dependencies</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getDependencies()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Dependencies();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Platforms</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getPlatforms()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Platforms();

    /**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Recipes</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getRecipes()
	 * @see #getMetadata()
	 * @generated
	 */
    EReference getMetadata_Recipes();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getReplacing <em>Replacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacing</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getReplacing()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Replacing();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Provider
	 * @generated
	 */
    EClass getProvider();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.Root_file <em>Root file</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root file</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Root_file
	 * @generated
	 */
    EClass getRoot_file();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.MinimalMetadata <em>Minimal Metadata</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimal Metadata</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.MinimalMetadata
	 * @generated
	 */
    EClass getMinimalMetadata();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookFile
	 * @generated
	 */
    EClass getCookbookFile();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes()
	 * @see #getCookbookFile()
	 * @generated
	 */
	EAttribute getCookbookFile_Bytes();

				/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookFile#getPath()
	 * @see #getCookbookFile()
	 * @generated
	 */
	EAttribute getCookbookFile_Path();

				/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getSpecificity <em>Specificity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specificity</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookFile#getSpecificity()
	 * @see #getCookbookFile()
	 * @generated
	 */
	EAttribute getCookbookFile_Specificity();

				/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getCookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cookbook</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookFile#getCookbook()
	 * @see #getCookbookFile()
	 * @generated
	 */
	EReference getCookbookFile_Cookbook();

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
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getJson_class <em>Json class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json class</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getJson_class()
	 * @see #getCookbook()
	 * @generated
	 */
	EAttribute getCookbook_Json_class();

				/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getChef_type <em>Chef type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chef type</em>'.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook#getChef_type()
	 * @see #getCookbook()
	 * @generated
	 */
	EAttribute getCookbook_Chef_type();

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
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__LIBRARIES = eINSTANCE.getCookbookVersion_Libraries();

        /**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__METADATA = eINSTANCE.getCookbookVersion_Metadata();

        /**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__PROVIDERS = eINSTANCE.getCookbookVersion_Providers();

        /**
		 * The meta object literal for the '<em><b>Root files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__ROOT_FILES = eINSTANCE.getCookbookVersion_Root_files();

        /**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__ATTRIBUTES = eINSTANCE.getCookbookVersion_Attributes();

        /**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute COOKBOOK_VERSION__CATALOG = eINSTANCE.getCookbookVersion_Catalog();

        /**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__DEPENDS = eINSTANCE.getCookbookVersion_Depends();

        /**
		 * The meta object literal for the '<em><b>Missing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference COOKBOOK_VERSION__MISSING = eINSTANCE.getCookbookVersion_Missing();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.RecipeDescriptionImpl <em>Recipe Description</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.RecipeDescriptionImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRecipeDescription()
		 * @generated
		 */
        EClass RECIPE_DESCRIPTION = eINSTANCE.getRecipeDescription();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.TemplateImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getTemplate()
		 * @generated
		 */
        EClass TEMPLATE = eINSTANCE.getTemplate();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getMetadata()
		 * @generated
		 */
        EClass METADATA = eINSTANCE.getMetadata();

        /**
		 * The meta object literal for the '<em><b>Long description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute METADATA__LONG_DESCRIPTION = eINSTANCE.getMetadata_Long_description();

        /**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute METADATA__VERSION = eINSTANCE.getMetadata_Version();

        /**
		 * The meta object literal for the '<em><b>Replaces</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__REPLACES = eINSTANCE.getMetadata_Replaces();

        /**
		 * The meta object literal for the '<em><b>Provides</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__PROVIDES = eINSTANCE.getMetadata_Provides();

        /**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__CONFLICTS = eINSTANCE.getMetadata_Conflicts();

        /**
		 * The meta object literal for the '<em><b>Suggests</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__SUGGESTS = eINSTANCE.getMetadata_Suggests();

        /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__DEPENDENCIES = eINSTANCE.getMetadata_Dependencies();

        /**
		 * The meta object literal for the '<em><b>Platforms</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__PLATFORMS = eINSTANCE.getMetadata_Platforms();

        /**
		 * The meta object literal for the '<em><b>Recipes</b></em>' map feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference METADATA__RECIPES = eINSTANCE.getMetadata_Recipes();

        /**
		 * The meta object literal for the '<em><b>Replacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__REPLACING = eINSTANCE.getMetadata_Replacing();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.ProviderImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getProvider()
		 * @generated
		 */
        EClass PROVIDER = eINSTANCE.getProvider();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl <em>Root file</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getRoot_file()
		 * @generated
		 */
        EClass ROOT_FILE = eINSTANCE.getRoot_file();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.MinimalMetadataImpl <em>Minimal Metadata</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.MinimalMetadataImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getMinimalMetadata()
		 * @generated
		 */
        EClass MINIMAL_METADATA = eINSTANCE.getMinimalMetadata();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl
		 * @see org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl#getCookbookFile()
		 * @generated
		 */
        EClass COOKBOOK_FILE = eINSTANCE.getCookbookFile();

        /**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK_FILE__BYTES = eINSTANCE.getCookbookFile_Bytes();

								/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK_FILE__PATH = eINSTANCE.getCookbookFile_Path();

								/**
		 * The meta object literal for the '<em><b>Specificity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK_FILE__SPECIFICITY = eINSTANCE.getCookbookFile_Specificity();

								/**
		 * The meta object literal for the '<em><b>Cookbook</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOK_FILE__COOKBOOK = eINSTANCE.getCookbookFile_Cookbook();

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
		 * The meta object literal for the '<em><b>Json class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK__JSON_CLASS = eINSTANCE.getCookbook_Json_class();

								/**
		 * The meta object literal for the '<em><b>Chef type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKBOOK__CHEF_TYPE = eINSTANCE.getCookbook_Chef_type();

    }

} //CookbookPackage
