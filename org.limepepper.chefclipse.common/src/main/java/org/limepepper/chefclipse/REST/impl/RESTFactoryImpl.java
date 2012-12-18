/**
 */
package org.limepepper.chefclipse.REST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.limepepper.chefclipse.REST.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTFactoryImpl extends EFactoryImpl implements RESTFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RESTFactory init() {
        try {
            RESTFactory theRESTFactory = (RESTFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/REST"); 
            if (theRESTFactory != null) {
                return theRESTFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RESTFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case RESTPackage.COOKBOOK_LIST_RESP: return createCookbookListResp();
            case RESTPackage.COOKBOOK_VERSION_RESP: return createCookbookVersionResp();
            case RESTPackage.COOKBOOK_METADATA: return createCookbookMetadata();
            case RESTPackage.COOKBOOK_DEFINITION: return createCookbookDefinition();
            case RESTPackage.COOKBOOK_FILE: return createCookbookFile();
            case RESTPackage.COOKBOOK_LIBRARY: return createCookbookLibrary();
            case RESTPackage.COOKBOOK_TEMPLATE: return createCookbookTemplate();
            case RESTPackage.COOKBOOK_ROOT_FILE: return createCookbookRootFile();
            case RESTPackage.COOKBOOK_RECIPE: return createCookbookRecipe();
            case RESTPackage.COOKBOOK_RESOURCE: return createCookbookResource();
            case RESTPackage.COOKBOOK_PROVIDERS: return createCookbookProviders();
            case RESTPackage.COOKBOOK_ATTRIBUTES: return createCookbookAttributes();
            case RESTPackage.COOKBOOK_MAINTAINER: return createCookbookMaintainer();
            case RESTPackage.ROLE_RESP: return createRoleResp();
            case RESTPackage.ROLE_LIST_RESP: return createRoleListResp();
            case RESTPackage.COOKBOOK_LIST_VERSION_RESP: return createCookbookListVersionResp();
            case RESTPackage.NODE_RESP: return createNodeResp();
            case RESTPackage.NODE_LIST_RESP: return createNodeListResp();
            case RESTPackage.SEARCH_RESULT_RESP: return createSearchResultResp();
            case RESTPackage.SEARCH_INDEX_RESP: return createSearchIndexResp();
            case RESTPackage.COOKBOOK_METADATA_DEPENDENCY: return createCookbookMetadataDependency();
            case RESTPackage.ENVIRONMENT_RESP: return createEnvironmentResp();
            case RESTPackage.JSON_OBJECT_RESP: return createJSONObjectResp();
            case RESTPackage.CLIENT_RESP: return createClientResp();
            case RESTPackage.CLIENT_LIST_RESP: return createClientListResp();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookListResp createCookbookListResp() {
        CookbookListRespImpl cookbookListResp = new CookbookListRespImpl();
        return cookbookListResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookVersionResp createCookbookVersionResp() {
        CookbookVersionRespImpl cookbookVersionResp = new CookbookVersionRespImpl();
        return cookbookVersionResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookMetadata createCookbookMetadata() {
        CookbookMetadataImpl cookbookMetadata = new CookbookMetadataImpl();
        return cookbookMetadata;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookDefinition createCookbookDefinition() {
        CookbookDefinitionImpl cookbookDefinition = new CookbookDefinitionImpl();
        return cookbookDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookFile createCookbookFile() {
        CookbookFileImpl cookbookFile = new CookbookFileImpl();
        return cookbookFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookLibrary createCookbookLibrary() {
        CookbookLibraryImpl cookbookLibrary = new CookbookLibraryImpl();
        return cookbookLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookTemplate createCookbookTemplate() {
        CookbookTemplateImpl cookbookTemplate = new CookbookTemplateImpl();
        return cookbookTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookRootFile createCookbookRootFile() {
        CookbookRootFileImpl cookbookRootFile = new CookbookRootFileImpl();
        return cookbookRootFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookRecipe createCookbookRecipe() {
        CookbookRecipeImpl cookbookRecipe = new CookbookRecipeImpl();
        return cookbookRecipe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookResource createCookbookResource() {
        CookbookResourceImpl cookbookResource = new CookbookResourceImpl();
        return cookbookResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookProviders createCookbookProviders() {
        CookbookProvidersImpl cookbookProviders = new CookbookProvidersImpl();
        return cookbookProviders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookAttributes createCookbookAttributes() {
        CookbookAttributesImpl cookbookAttributes = new CookbookAttributesImpl();
        return cookbookAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookMaintainer createCookbookMaintainer() {
        CookbookMaintainerImpl cookbookMaintainer = new CookbookMaintainerImpl();
        return cookbookMaintainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleResp createRoleResp() {
        RoleRespImpl roleResp = new RoleRespImpl();
        return roleResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleListResp createRoleListResp() {
        RoleListRespImpl roleListResp = new RoleListRespImpl();
        return roleListResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookListVersionResp createCookbookListVersionResp() {
        CookbookListVersionRespImpl cookbookListVersionResp = new CookbookListVersionRespImpl();
        return cookbookListVersionResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeResp createNodeResp() {
        NodeRespImpl nodeResp = new NodeRespImpl();
        return nodeResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeListResp createNodeListResp() {
        NodeListRespImpl nodeListResp = new NodeListRespImpl();
        return nodeListResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SearchResultResp createSearchResultResp() {
        SearchResultRespImpl searchResultResp = new SearchResultRespImpl();
        return searchResultResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SearchIndexResp createSearchIndexResp() {
        SearchIndexRespImpl searchIndexResp = new SearchIndexRespImpl();
        return searchIndexResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookMetadataDependency createCookbookMetadataDependency() {
        CookbookMetadataDependencyImpl cookbookMetadataDependency = new CookbookMetadataDependencyImpl();
        return cookbookMetadataDependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnvironmentResp createEnvironmentResp() {
        EnvironmentRespImpl environmentResp = new EnvironmentRespImpl();
        return environmentResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JSONObjectResp createJSONObjectResp() {
        JSONObjectRespImpl jsonObjectResp = new JSONObjectRespImpl();
        return jsonObjectResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClientResp createClientResp() {
        ClientRespImpl clientResp = new ClientRespImpl();
        return clientResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClientListResp createClientListResp() {
        ClientListRespImpl clientListResp = new ClientListRespImpl();
        return clientListResp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTPackage getRESTPackage() {
        return (RESTPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RESTPackage getPackage() {
        return RESTPackage.eINSTANCE;
    }

} //RESTFactoryImpl
