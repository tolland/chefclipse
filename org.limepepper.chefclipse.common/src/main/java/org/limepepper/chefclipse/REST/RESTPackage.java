/**
 */
package org.limepepper.chefclipse.REST;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.limepepper.chefclipse.REST.RESTFactory
 * @model kind="package"
 * @generated
 */
public interface RESTPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "REST";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://limepepper.org/v1/chefclipse/REST";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.limepepepper.chefclipse";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RESTPackage eINSTANCE = org.limepepper.chefclipse.REST.impl.RESTPackageImpl.init();

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookListRespImpl <em>Cookbook List Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookListRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookListResp()
     * @generated
     */
    int COOKBOOK_LIST_RESP = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_RESP__NAME = 0;

    /**
     * The feature id for the '<em><b>Versions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_RESP__VERSIONS = 1;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_RESP__URL = 2;

    /**
     * The number of structural features of the '<em>Cookbook List Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_RESP_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl <em>Cookbook Version Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookVersionResp()
     * @generated
     */
    int COOKBOOK_VERSION_RESP = 1;

    /**
     * The feature id for the '<em><b>Maintainer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__MAINTAINER = 0;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__CATEGORY = 1;

    /**
     * The feature id for the '<em><b>Updated At</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__UPDATED_AT = 2;

    /**
     * The feature id for the '<em><b>Created At</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__CREATED_AT = 3;

    /**
     * The feature id for the '<em><b>Latest Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__LATEST_VERSION = 4;

    /**
     * The feature id for the '<em><b>External Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__EXTERNAL_URL = 5;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__DEPRECATED = 6;

    /**
     * The feature id for the '<em><b>Replacement</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__REPLACEMENT = 7;

    /**
     * The feature id for the '<em><b>Definitions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__DEFINITIONS = 8;

    /**
     * The feature id for the '<em><b>Files</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__FILES = 9;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__ATTRIBUTES = 10;

    /**
     * The feature id for the '<em><b>Cookbook Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__COOKBOOK_NAME = 11;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__VERSION = 12;

    /**
     * The feature id for the '<em><b>Json Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__JSON_CLASS = 13;

    /**
     * The feature id for the '<em><b>Chef Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__CHEF_TYPE = 14;

    /**
     * The feature id for the '<em><b>Metadata</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__METADATA = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__NAME = 16;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP__DESCRIPTION = 17;

    /**
     * The number of structural features of the '<em>Cookbook Version Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_VERSION_RESP_FEATURE_COUNT = 18;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl <em>Cookbook Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookMetadata()
     * @generated
     */
    int COOKBOOK_METADATA = 2;

    /**
     * The feature id for the '<em><b>Maintainer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_METADATA__MAINTAINER = 0;

    /**
     * The feature id for the '<em><b>Platforms</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_METADATA__PLATFORMS = 1;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_METADATA__VERSION = 2;

    /**
     * The feature id for the '<em><b>Dependencies</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_METADATA__DEPENDENCIES = 3;

    /**
     * The number of structural features of the '<em>Cookbook Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_METADATA_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookDefinitionImpl <em>Cookbook Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookDefinitionImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookDefinition()
     * @generated
     */
    int COOKBOOK_DEFINITION = 3;

    /**
     * The number of structural features of the '<em>Cookbook Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_DEFINITION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookFileImpl <em>Cookbook File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookFileImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookFile()
     * @generated
     */
    int COOKBOOK_FILE = 4;

    /**
     * The number of structural features of the '<em>Cookbook File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_FILE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookLibraryImpl <em>Cookbook Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookLibraryImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookLibrary()
     * @generated
     */
    int COOKBOOK_LIBRARY = 5;

    /**
     * The number of structural features of the '<em>Cookbook Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIBRARY_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookTemplateImpl <em>Cookbook Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookTemplateImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookTemplate()
     * @generated
     */
    int COOKBOOK_TEMPLATE = 6;

    /**
     * The number of structural features of the '<em>Cookbook Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_TEMPLATE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookRootFileImpl <em>Cookbook Root File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookRootFileImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookRootFile()
     * @generated
     */
    int COOKBOOK_ROOT_FILE = 7;

    /**
     * The number of structural features of the '<em>Cookbook Root File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_ROOT_FILE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookRecipeImpl <em>Cookbook Recipe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookRecipeImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookRecipe()
     * @generated
     */
    int COOKBOOK_RECIPE = 8;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_RECIPE__PATH = 0;

    /**
     * The number of structural features of the '<em>Cookbook Recipe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_RECIPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookResourceImpl <em>Cookbook Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookResourceImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookResource()
     * @generated
     */
    int COOKBOOK_RESOURCE = 9;

    /**
     * The number of structural features of the '<em>Cookbook Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_RESOURCE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookProvidersImpl <em>Cookbook Providers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookProvidersImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookProviders()
     * @generated
     */
    int COOKBOOK_PROVIDERS = 10;

    /**
     * The number of structural features of the '<em>Cookbook Providers</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_PROVIDERS_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookAttributesImpl <em>Cookbook Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookAttributesImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookAttributes()
     * @generated
     */
    int COOKBOOK_ATTRIBUTES = 11;

    /**
     * The number of structural features of the '<em>Cookbook Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_ATTRIBUTES_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookMaintainerImpl <em>Cookbook Maintainer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookMaintainerImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookMaintainer()
     * @generated
     */
    int COOKBOOK_MAINTAINER = 12;

    /**
     * The number of structural features of the '<em>Cookbook Maintainer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_MAINTAINER_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.RoleRespImpl <em>Role Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.RoleRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getRoleResp()
     * @generated
     */
    int ROLE_RESP = 13;

    /**
     * The number of structural features of the '<em>Role Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.RoleListRespImpl <em>Role List Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.RoleListRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getRoleListResp()
     * @generated
     */
    int ROLE_LIST_RESP = 14;

    /**
     * The number of structural features of the '<em>Role List Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIST_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookListVersionRespImpl <em>Cookbook List Version Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookListVersionRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookListVersionResp()
     * @generated
     */
    int COOKBOOK_LIST_VERSION_RESP = 15;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_VERSION_RESP__URL = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_VERSION_RESP__VERSION = 1;

    /**
     * The number of structural features of the '<em>Cookbook List Version Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_LIST_VERSION_RESP_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.NodeRespImpl <em>Node Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.NodeRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getNodeResp()
     * @generated
     */
    int NODE_RESP = 16;

    /**
     * The number of structural features of the '<em>Node Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.NodeListRespImpl <em>Node List Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.NodeListRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getNodeListResp()
     * @generated
     */
    int NODE_LIST_RESP = 17;

    /**
     * The number of structural features of the '<em>Node List Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_LIST_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.SearchResultRespImpl <em>Search Result Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.SearchResultRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getSearchResultResp()
     * @generated
     */
    int SEARCH_RESULT_RESP = 18;

    /**
     * The number of structural features of the '<em>Search Result Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEARCH_RESULT_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.SearchIndexRespImpl <em>Search Index Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.SearchIndexRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getSearchIndexResp()
     * @generated
     */
    int SEARCH_INDEX_RESP = 19;

    /**
     * The number of structural features of the '<em>Search Index Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEARCH_INDEX_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataDependencyImpl <em>Cookbook Metadata Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.CookbookMetadataDependencyImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookMetadataDependency()
     * @generated
     */
    int COOKBOOK_METADATA_DEPENDENCY = 20;

    /**
     * The number of structural features of the '<em>Cookbook Metadata Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COOKBOOK_METADATA_DEPENDENCY_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.JSONObjectRespImpl <em>JSON Object Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.JSONObjectRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getJSONObjectResp()
     * @generated
     */
    int JSON_OBJECT_RESP = 22;

    /**
     * The number of structural features of the '<em>JSON Object Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_OBJECT_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.EnvironmentRespImpl <em>Environment Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.EnvironmentRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getEnvironmentResp()
     * @generated
     */
    int ENVIRONMENT_RESP = 21;

    /**
     * The number of structural features of the '<em>Environment Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIRONMENT_RESP_FEATURE_COUNT = JSON_OBJECT_RESP_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.ClientRespImpl <em>Client Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.ClientRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getClientResp()
     * @generated
     */
    int CLIENT_RESP = 23;

    /**
     * The number of structural features of the '<em>Client Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_RESP_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.REST.impl.ClientListRespImpl <em>Client List Resp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.REST.impl.ClientListRespImpl
     * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getClientListResp()
     * @generated
     */
    int CLIENT_LIST_RESP = 24;

    /**
     * The number of structural features of the '<em>Client List Resp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LIST_RESP_FEATURE_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookListResp <em>Cookbook List Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook List Resp</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListResp
     * @generated
     */
    EClass getCookbookListResp();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookListResp#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListResp#getName()
     * @see #getCookbookListResp()
     * @generated
     */
    EAttribute getCookbookListResp_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.REST.CookbookListResp#getVersions <em>Versions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Versions</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListResp#getVersions()
     * @see #getCookbookListResp()
     * @generated
     */
    EReference getCookbookListResp_Versions();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookListResp#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListResp#getUrl()
     * @see #getCookbookListResp()
     * @generated
     */
    EAttribute getCookbookListResp_Url();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookVersionResp <em>Cookbook Version Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Version Resp</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp
     * @generated
     */
    EClass getCookbookVersionResp();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getMaintainer <em>Maintainer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maintainer</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getMaintainer()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Maintainer();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getCategory()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Category();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getUpdatedAt <em>Updated At</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Updated At</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getUpdatedAt()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_UpdatedAt();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCreatedAt <em>Created At</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Created At</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getCreatedAt()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_CreatedAt();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getLatestVersion <em>Latest Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Latest Version</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getLatestVersion()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_LatestVersion();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getExternalUrl <em>External Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>External Url</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getExternalUrl()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_ExternalUrl();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#isDeprecated <em>Deprecated</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deprecated</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#isDeprecated()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Deprecated();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getReplacement <em>Replacement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replacement</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getReplacement()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Replacement();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Definitions</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getDefinitions()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EReference getCookbookVersionResp_Definitions();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getFiles <em>Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Files</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getFiles()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EReference getCookbookVersionResp_Files();

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Attributes</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getAttributes()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EReference getCookbookVersionResp_Attributes();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCookbookName <em>Cookbook Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cookbook Name</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getCookbookName()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_CookbookName();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getVersion()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Version();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getJsonClass <em>Json Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Json Class</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getJsonClass()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_JsonClass();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getChefType <em>Chef Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chef Type</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getChefType()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_ChefType();

    /**
     * Returns the meta object for the containment reference '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getMetadata <em>Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Metadata</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getMetadata()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EReference getCookbookVersionResp_Metadata();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getName()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Name();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookVersionResp#getDescription()
     * @see #getCookbookVersionResp()
     * @generated
     */
    EAttribute getCookbookVersionResp_Description();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookMetadata <em>Cookbook Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Metadata</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMetadata
     * @generated
     */
    EClass getCookbookMetadata();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookMetadata#getMaintainer <em>Maintainer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maintainer</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMetadata#getMaintainer()
     * @see #getCookbookMetadata()
     * @generated
     */
    EAttribute getCookbookMetadata_Maintainer();

    /**
     * Returns the meta object for the attribute list '{@link org.limepepper.chefclipse.REST.CookbookMetadata#getPlatforms <em>Platforms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Platforms</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMetadata#getPlatforms()
     * @see #getCookbookMetadata()
     * @generated
     */
    EAttribute getCookbookMetadata_Platforms();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookMetadata#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMetadata#getVersion()
     * @see #getCookbookMetadata()
     * @generated
     */
    EAttribute getCookbookMetadata_Version();

    /**
     * Returns the meta object for the attribute list '{@link org.limepepper.chefclipse.REST.CookbookMetadata#getDependencies <em>Dependencies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Dependencies</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMetadata#getDependencies()
     * @see #getCookbookMetadata()
     * @generated
     */
    EAttribute getCookbookMetadata_Dependencies();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookDefinition <em>Cookbook Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Definition</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookDefinition
     * @generated
     */
    EClass getCookbookDefinition();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookFile <em>Cookbook File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook File</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookFile
     * @generated
     */
    EClass getCookbookFile();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookLibrary <em>Cookbook Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Library</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookLibrary
     * @generated
     */
    EClass getCookbookLibrary();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookTemplate <em>Cookbook Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Template</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookTemplate
     * @generated
     */
    EClass getCookbookTemplate();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookRootFile <em>Cookbook Root File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Root File</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookRootFile
     * @generated
     */
    EClass getCookbookRootFile();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookRecipe <em>Cookbook Recipe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Recipe</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookRecipe
     * @generated
     */
    EClass getCookbookRecipe();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookRecipe#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookRecipe#getPath()
     * @see #getCookbookRecipe()
     * @generated
     */
    EAttribute getCookbookRecipe_Path();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookResource <em>Cookbook Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Resource</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookResource
     * @generated
     */
    EClass getCookbookResource();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookProviders <em>Cookbook Providers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Providers</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookProviders
     * @generated
     */
    EClass getCookbookProviders();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookAttributes <em>Cookbook Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Attributes</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookAttributes
     * @generated
     */
    EClass getCookbookAttributes();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookMaintainer <em>Cookbook Maintainer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Maintainer</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMaintainer
     * @generated
     */
    EClass getCookbookMaintainer();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.RoleResp <em>Role Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role Resp</em>'.
     * @see org.limepepper.chefclipse.REST.RoleResp
     * @generated
     */
    EClass getRoleResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.RoleListResp <em>Role List Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role List Resp</em>'.
     * @see org.limepepper.chefclipse.REST.RoleListResp
     * @generated
     */
    EClass getRoleListResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookListVersionResp <em>Cookbook List Version Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook List Version Resp</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListVersionResp
     * @generated
     */
    EClass getCookbookListVersionResp();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookListVersionResp#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListVersionResp#getUrl()
     * @see #getCookbookListVersionResp()
     * @generated
     */
    EAttribute getCookbookListVersionResp_Url();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.REST.CookbookListVersionResp#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookListVersionResp#getVersion()
     * @see #getCookbookListVersionResp()
     * @generated
     */
    EAttribute getCookbookListVersionResp_Version();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.NodeResp <em>Node Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Resp</em>'.
     * @see org.limepepper.chefclipse.REST.NodeResp
     * @generated
     */
    EClass getNodeResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.NodeListResp <em>Node List Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node List Resp</em>'.
     * @see org.limepepper.chefclipse.REST.NodeListResp
     * @generated
     */
    EClass getNodeListResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.SearchResultResp <em>Search Result Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Search Result Resp</em>'.
     * @see org.limepepper.chefclipse.REST.SearchResultResp
     * @generated
     */
    EClass getSearchResultResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.SearchIndexResp <em>Search Index Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Search Index Resp</em>'.
     * @see org.limepepper.chefclipse.REST.SearchIndexResp
     * @generated
     */
    EClass getSearchIndexResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.CookbookMetadataDependency <em>Cookbook Metadata Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cookbook Metadata Dependency</em>'.
     * @see org.limepepper.chefclipse.REST.CookbookMetadataDependency
     * @generated
     */
    EClass getCookbookMetadataDependency();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.EnvironmentResp <em>Environment Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Environment Resp</em>'.
     * @see org.limepepper.chefclipse.REST.EnvironmentResp
     * @generated
     */
    EClass getEnvironmentResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.JSONObjectResp <em>JSON Object Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JSON Object Resp</em>'.
     * @see org.limepepper.chefclipse.REST.JSONObjectResp
     * @generated
     */
    EClass getJSONObjectResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.ClientResp <em>Client Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Client Resp</em>'.
     * @see org.limepepper.chefclipse.REST.ClientResp
     * @generated
     */
    EClass getClientResp();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.REST.ClientListResp <em>Client List Resp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Client List Resp</em>'.
     * @see org.limepepper.chefclipse.REST.ClientListResp
     * @generated
     */
    EClass getClientListResp();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RESTFactory getRESTFactory();

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
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookListRespImpl <em>Cookbook List Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookListRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookListResp()
         * @generated
         */
        EClass COOKBOOK_LIST_RESP = eINSTANCE.getCookbookListResp();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_LIST_RESP__NAME = eINSTANCE.getCookbookListResp_Name();

        /**
         * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_LIST_RESP__VERSIONS = eINSTANCE.getCookbookListResp_Versions();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_LIST_RESP__URL = eINSTANCE.getCookbookListResp_Url();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl <em>Cookbook Version Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookVersionResp()
         * @generated
         */
        EClass COOKBOOK_VERSION_RESP = eINSTANCE.getCookbookVersionResp();

        /**
         * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__MAINTAINER = eINSTANCE.getCookbookVersionResp_Maintainer();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__CATEGORY = eINSTANCE.getCookbookVersionResp_Category();

        /**
         * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__UPDATED_AT = eINSTANCE.getCookbookVersionResp_UpdatedAt();

        /**
         * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__CREATED_AT = eINSTANCE.getCookbookVersionResp_CreatedAt();

        /**
         * The meta object literal for the '<em><b>Latest Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__LATEST_VERSION = eINSTANCE.getCookbookVersionResp_LatestVersion();

        /**
         * The meta object literal for the '<em><b>External Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__EXTERNAL_URL = eINSTANCE.getCookbookVersionResp_ExternalUrl();

        /**
         * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__DEPRECATED = eINSTANCE.getCookbookVersionResp_Deprecated();

        /**
         * The meta object literal for the '<em><b>Replacement</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__REPLACEMENT = eINSTANCE.getCookbookVersionResp_Replacement();

        /**
         * The meta object literal for the '<em><b>Definitions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION_RESP__DEFINITIONS = eINSTANCE.getCookbookVersionResp_Definitions();

        /**
         * The meta object literal for the '<em><b>Files</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION_RESP__FILES = eINSTANCE.getCookbookVersionResp_Files();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION_RESP__ATTRIBUTES = eINSTANCE.getCookbookVersionResp_Attributes();

        /**
         * The meta object literal for the '<em><b>Cookbook Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__COOKBOOK_NAME = eINSTANCE.getCookbookVersionResp_CookbookName();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__VERSION = eINSTANCE.getCookbookVersionResp_Version();

        /**
         * The meta object literal for the '<em><b>Json Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__JSON_CLASS = eINSTANCE.getCookbookVersionResp_JsonClass();

        /**
         * The meta object literal for the '<em><b>Chef Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__CHEF_TYPE = eINSTANCE.getCookbookVersionResp_ChefType();

        /**
         * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COOKBOOK_VERSION_RESP__METADATA = eINSTANCE.getCookbookVersionResp_Metadata();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__NAME = eINSTANCE.getCookbookVersionResp_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_VERSION_RESP__DESCRIPTION = eINSTANCE.getCookbookVersionResp_Description();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl <em>Cookbook Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookMetadata()
         * @generated
         */
        EClass COOKBOOK_METADATA = eINSTANCE.getCookbookMetadata();

        /**
         * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_METADATA__MAINTAINER = eINSTANCE.getCookbookMetadata_Maintainer();

        /**
         * The meta object literal for the '<em><b>Platforms</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_METADATA__PLATFORMS = eINSTANCE.getCookbookMetadata_Platforms();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_METADATA__VERSION = eINSTANCE.getCookbookMetadata_Version();

        /**
         * The meta object literal for the '<em><b>Dependencies</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_METADATA__DEPENDENCIES = eINSTANCE.getCookbookMetadata_Dependencies();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookDefinitionImpl <em>Cookbook Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookDefinitionImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookDefinition()
         * @generated
         */
        EClass COOKBOOK_DEFINITION = eINSTANCE.getCookbookDefinition();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookFileImpl <em>Cookbook File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookFileImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookFile()
         * @generated
         */
        EClass COOKBOOK_FILE = eINSTANCE.getCookbookFile();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookLibraryImpl <em>Cookbook Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookLibraryImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookLibrary()
         * @generated
         */
        EClass COOKBOOK_LIBRARY = eINSTANCE.getCookbookLibrary();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookTemplateImpl <em>Cookbook Template</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookTemplateImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookTemplate()
         * @generated
         */
        EClass COOKBOOK_TEMPLATE = eINSTANCE.getCookbookTemplate();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookRootFileImpl <em>Cookbook Root File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookRootFileImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookRootFile()
         * @generated
         */
        EClass COOKBOOK_ROOT_FILE = eINSTANCE.getCookbookRootFile();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookRecipeImpl <em>Cookbook Recipe</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookRecipeImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookRecipe()
         * @generated
         */
        EClass COOKBOOK_RECIPE = eINSTANCE.getCookbookRecipe();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_RECIPE__PATH = eINSTANCE.getCookbookRecipe_Path();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookResourceImpl <em>Cookbook Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookResourceImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookResource()
         * @generated
         */
        EClass COOKBOOK_RESOURCE = eINSTANCE.getCookbookResource();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookProvidersImpl <em>Cookbook Providers</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookProvidersImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookProviders()
         * @generated
         */
        EClass COOKBOOK_PROVIDERS = eINSTANCE.getCookbookProviders();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookAttributesImpl <em>Cookbook Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookAttributesImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookAttributes()
         * @generated
         */
        EClass COOKBOOK_ATTRIBUTES = eINSTANCE.getCookbookAttributes();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookMaintainerImpl <em>Cookbook Maintainer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookMaintainerImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookMaintainer()
         * @generated
         */
        EClass COOKBOOK_MAINTAINER = eINSTANCE.getCookbookMaintainer();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.RoleRespImpl <em>Role Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.RoleRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getRoleResp()
         * @generated
         */
        EClass ROLE_RESP = eINSTANCE.getRoleResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.RoleListRespImpl <em>Role List Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.RoleListRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getRoleListResp()
         * @generated
         */
        EClass ROLE_LIST_RESP = eINSTANCE.getRoleListResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookListVersionRespImpl <em>Cookbook List Version Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookListVersionRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookListVersionResp()
         * @generated
         */
        EClass COOKBOOK_LIST_VERSION_RESP = eINSTANCE.getCookbookListVersionResp();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_LIST_VERSION_RESP__URL = eINSTANCE.getCookbookListVersionResp_Url();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COOKBOOK_LIST_VERSION_RESP__VERSION = eINSTANCE.getCookbookListVersionResp_Version();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.NodeRespImpl <em>Node Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.NodeRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getNodeResp()
         * @generated
         */
        EClass NODE_RESP = eINSTANCE.getNodeResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.NodeListRespImpl <em>Node List Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.NodeListRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getNodeListResp()
         * @generated
         */
        EClass NODE_LIST_RESP = eINSTANCE.getNodeListResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.SearchResultRespImpl <em>Search Result Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.SearchResultRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getSearchResultResp()
         * @generated
         */
        EClass SEARCH_RESULT_RESP = eINSTANCE.getSearchResultResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.SearchIndexRespImpl <em>Search Index Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.SearchIndexRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getSearchIndexResp()
         * @generated
         */
        EClass SEARCH_INDEX_RESP = eINSTANCE.getSearchIndexResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataDependencyImpl <em>Cookbook Metadata Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.CookbookMetadataDependencyImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getCookbookMetadataDependency()
         * @generated
         */
        EClass COOKBOOK_METADATA_DEPENDENCY = eINSTANCE.getCookbookMetadataDependency();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.EnvironmentRespImpl <em>Environment Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.EnvironmentRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getEnvironmentResp()
         * @generated
         */
        EClass ENVIRONMENT_RESP = eINSTANCE.getEnvironmentResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.JSONObjectRespImpl <em>JSON Object Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.JSONObjectRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getJSONObjectResp()
         * @generated
         */
        EClass JSON_OBJECT_RESP = eINSTANCE.getJSONObjectResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.ClientRespImpl <em>Client Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.ClientRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getClientResp()
         * @generated
         */
        EClass CLIENT_RESP = eINSTANCE.getClientResp();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.REST.impl.ClientListRespImpl <em>Client List Resp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.REST.impl.ClientListRespImpl
         * @see org.limepepper.chefclipse.REST.impl.RESTPackageImpl#getClientListResp()
         * @generated
         */
        EClass CLIENT_LIST_RESP = eINSTANCE.getClientListResp();

    }

} //RESTPackage
