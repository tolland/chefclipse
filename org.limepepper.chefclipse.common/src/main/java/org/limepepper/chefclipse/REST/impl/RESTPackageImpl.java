/**
 */
package org.limepepper.chefclipse.REST.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.ChefclipsePackage;

import org.limepepper.chefclipse.REST.ClientListResp;
import org.limepepper.chefclipse.REST.ClientResp;
import org.limepepper.chefclipse.REST.CookbookAttributes;
import org.limepepper.chefclipse.REST.CookbookDefinition;
import org.limepepper.chefclipse.REST.CookbookFile;
import org.limepepper.chefclipse.REST.CookbookLibrary;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookListVersionResp;
import org.limepepper.chefclipse.REST.CookbookMaintainer;
import org.limepepper.chefclipse.REST.CookbookMetadata;
import org.limepepper.chefclipse.REST.CookbookMetadataDependency;
import org.limepepper.chefclipse.REST.CookbookProviders;
import org.limepepper.chefclipse.REST.CookbookRecipe;
import org.limepepper.chefclipse.REST.CookbookResource;
import org.limepepper.chefclipse.REST.CookbookRootFile;
import org.limepepper.chefclipse.REST.CookbookTemplate;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.EnvironmentResp;
import org.limepepper.chefclipse.REST.JSONObjectResp;
import org.limepepper.chefclipse.REST.NodeListResp;
import org.limepepper.chefclipse.REST.NodeResp;
import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.RESTPackage;
import org.limepepper.chefclipse.REST.RoleListResp;
import org.limepepper.chefclipse.REST.RoleResp;
import org.limepepper.chefclipse.REST.SearchIndexResp;
import org.limepepper.chefclipse.REST.SearchResultResp;

import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;

import org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl;

import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;

import org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl;

import org.limepepper.chefclipse.common.cookbook.CookbookPackage;

import org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl;

import org.limepepper.chefclipse.common.knife.KnifePackage;

import org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl;

import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

import org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl;

import org.limepepper.chefclipse.impl.ChefclipsePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTPackageImpl extends EPackageImpl implements RESTPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookListRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookVersionRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookMetadataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookLibraryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookRootFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookRecipeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookProvidersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookMaintainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roleListRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookListVersionRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeListRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass searchResultRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass searchIndexRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cookbookMetadataDependencyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass environmentRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jsonObjectRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientRespEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientListRespEClass = null;

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
     * @see org.limepepper.chefclipse.REST.RESTPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RESTPackageImpl() {
        super(eNS_URI, RESTFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RESTPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RESTPackage init() {
        if (isInited) return (RESTPackage)EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI);

        // Obtain or create and register package
        RESTPackageImpl theRESTPackage = (RESTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RESTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RESTPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
        ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
        ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
        CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
        WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);
        KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);

        // Create package meta-data objects
        theRESTPackage.createPackageContents();
        theChefclipsePackage.createPackageContents();
        theChefserverPackage.createPackageContents();
        theChefclientPackage.createPackageContents();
        theCookbookPackage.createPackageContents();
        theWorkstationPackage.createPackageContents();
        theKnifePackage.createPackageContents();

        // Initialize created meta-data
        theRESTPackage.initializePackageContents();
        theChefclipsePackage.initializePackageContents();
        theChefserverPackage.initializePackageContents();
        theChefclientPackage.initializePackageContents();
        theCookbookPackage.initializePackageContents();
        theWorkstationPackage.initializePackageContents();
        theKnifePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRESTPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RESTPackage.eNS_URI, theRESTPackage);
        return theRESTPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookListResp() {
        return cookbookListRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookListResp_Name() {
        return (EAttribute)cookbookListRespEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookListResp_Versions() {
        return (EReference)cookbookListRespEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookListResp_Url() {
        return (EAttribute)cookbookListRespEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookVersionResp() {
        return cookbookVersionRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Maintainer() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Category() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_UpdatedAt() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_CreatedAt() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_LatestVersion() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_ExternalUrl() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Deprecated() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Replacement() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersionResp_Definitions() {
        return (EReference)cookbookVersionRespEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersionResp_Files() {
        return (EReference)cookbookVersionRespEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersionResp_Attributes() {
        return (EReference)cookbookVersionRespEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_CookbookName() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Version() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_JsonClass() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_ChefType() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersionResp_Metadata() {
        return (EReference)cookbookVersionRespEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Name() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookVersionResp_Description() {
        return (EAttribute)cookbookVersionRespEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookMetadata() {
        return cookbookMetadataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookMetadata_Maintainer() {
        return (EAttribute)cookbookMetadataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookMetadata_Platforms() {
        return (EAttribute)cookbookMetadataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookMetadata_Version() {
        return (EAttribute)cookbookMetadataEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookMetadata_Dependencies() {
        return (EAttribute)cookbookMetadataEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookDefinition() {
        return cookbookDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookFile() {
        return cookbookFileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookLibrary() {
        return cookbookLibraryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookTemplate() {
        return cookbookTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookRootFile() {
        return cookbookRootFileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookRecipe() {
        return cookbookRecipeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookRecipe_Path() {
        return (EAttribute)cookbookRecipeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookResource() {
        return cookbookResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookProviders() {
        return cookbookProvidersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookAttributes() {
        return cookbookAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookMaintainer() {
        return cookbookMaintainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleResp() {
        return roleRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoleListResp() {
        return roleListRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookListVersionResp() {
        return cookbookListVersionRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookListVersionResp_Url() {
        return (EAttribute)cookbookListVersionRespEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbookListVersionResp_Version() {
        return (EAttribute)cookbookListVersionRespEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNodeResp() {
        return nodeRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNodeListResp() {
        return nodeListRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSearchResultResp() {
        return searchResultRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSearchIndexResp() {
        return searchIndexRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCookbookMetadataDependency() {
        return cookbookMetadataDependencyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnvironmentResp() {
        return environmentRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJSONObjectResp() {
        return jsonObjectRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClientResp() {
        return clientRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClientListResp() {
        return clientListRespEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESTFactory getRESTFactory() {
        return (RESTFactory)getEFactoryInstance();
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
        cookbookListRespEClass = createEClass(COOKBOOK_LIST_RESP);
        createEAttribute(cookbookListRespEClass, COOKBOOK_LIST_RESP__NAME);
        createEReference(cookbookListRespEClass, COOKBOOK_LIST_RESP__VERSIONS);
        createEAttribute(cookbookListRespEClass, COOKBOOK_LIST_RESP__URL);

        cookbookVersionRespEClass = createEClass(COOKBOOK_VERSION_RESP);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__MAINTAINER);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__CATEGORY);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__UPDATED_AT);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__CREATED_AT);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__LATEST_VERSION);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__EXTERNAL_URL);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__DEPRECATED);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__REPLACEMENT);
        createEReference(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__DEFINITIONS);
        createEReference(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__FILES);
        createEReference(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__ATTRIBUTES);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__COOKBOOK_NAME);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__VERSION);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__JSON_CLASS);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__CHEF_TYPE);
        createEReference(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__METADATA);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__NAME);
        createEAttribute(cookbookVersionRespEClass, COOKBOOK_VERSION_RESP__DESCRIPTION);

        cookbookMetadataEClass = createEClass(COOKBOOK_METADATA);
        createEAttribute(cookbookMetadataEClass, COOKBOOK_METADATA__MAINTAINER);
        createEAttribute(cookbookMetadataEClass, COOKBOOK_METADATA__PLATFORMS);
        createEAttribute(cookbookMetadataEClass, COOKBOOK_METADATA__VERSION);
        createEAttribute(cookbookMetadataEClass, COOKBOOK_METADATA__DEPENDENCIES);

        cookbookDefinitionEClass = createEClass(COOKBOOK_DEFINITION);

        cookbookFileEClass = createEClass(COOKBOOK_FILE);

        cookbookLibraryEClass = createEClass(COOKBOOK_LIBRARY);

        cookbookTemplateEClass = createEClass(COOKBOOK_TEMPLATE);

        cookbookRootFileEClass = createEClass(COOKBOOK_ROOT_FILE);

        cookbookRecipeEClass = createEClass(COOKBOOK_RECIPE);
        createEAttribute(cookbookRecipeEClass, COOKBOOK_RECIPE__PATH);

        cookbookResourceEClass = createEClass(COOKBOOK_RESOURCE);

        cookbookProvidersEClass = createEClass(COOKBOOK_PROVIDERS);

        cookbookAttributesEClass = createEClass(COOKBOOK_ATTRIBUTES);

        cookbookMaintainerEClass = createEClass(COOKBOOK_MAINTAINER);

        roleRespEClass = createEClass(ROLE_RESP);

        roleListRespEClass = createEClass(ROLE_LIST_RESP);

        cookbookListVersionRespEClass = createEClass(COOKBOOK_LIST_VERSION_RESP);
        createEAttribute(cookbookListVersionRespEClass, COOKBOOK_LIST_VERSION_RESP__URL);
        createEAttribute(cookbookListVersionRespEClass, COOKBOOK_LIST_VERSION_RESP__VERSION);

        nodeRespEClass = createEClass(NODE_RESP);

        nodeListRespEClass = createEClass(NODE_LIST_RESP);

        searchResultRespEClass = createEClass(SEARCH_RESULT_RESP);

        searchIndexRespEClass = createEClass(SEARCH_INDEX_RESP);

        cookbookMetadataDependencyEClass = createEClass(COOKBOOK_METADATA_DEPENDENCY);

        environmentRespEClass = createEClass(ENVIRONMENT_RESP);

        jsonObjectRespEClass = createEClass(JSON_OBJECT_RESP);

        clientRespEClass = createEClass(CLIENT_RESP);

        clientListRespEClass = createEClass(CLIENT_LIST_RESP);
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
        environmentRespEClass.getESuperTypes().add(this.getJSONObjectResp());

        // Initialize classes and features; add operations and parameters
        initEClass(cookbookListRespEClass, CookbookListResp.class, "CookbookListResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCookbookListResp_Name(), ecorePackage.getEString(), "name", null, 1, 1, CookbookListResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookListResp_Versions(), this.getCookbookListVersionResp(), null, "versions", null, 0, -1, CookbookListResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookListResp_Url(), ecorePackage.getEString(), "url", null, 1, 1, CookbookListResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cookbookVersionRespEClass, CookbookVersionResp.class, "CookbookVersionResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCookbookVersionResp_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_Category(), ecorePackage.getEString(), "category", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_LatestVersion(), ecorePackage.getEString(), "latestVersion", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_ExternalUrl(), ecorePackage.getEString(), "externalUrl", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_Replacement(), ecorePackage.getEString(), "replacement", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersionResp_Definitions(), this.getCookbookDefinition(), null, "definitions", null, 0, -1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersionResp_Files(), this.getCookbookFile(), null, "files", null, 0, -1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersionResp_Attributes(), this.getCookbookAttributes(), null, "attributes", null, 0, -1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_CookbookName(), ecorePackage.getEString(), "cookbookName", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_Version(), ecorePackage.getEString(), "version", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_JsonClass(), ecorePackage.getEString(), "JsonClass", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_ChefType(), ecorePackage.getEString(), "ChefType", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersionResp_Metadata(), this.getCookbookMetadata(), null, "metadata", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_Name(), ecorePackage.getEString(), "name", null, 1, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookVersionResp_Description(), ecorePackage.getEString(), "description", null, 0, 1, CookbookVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cookbookMetadataEClass, CookbookMetadata.class, "CookbookMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCookbookMetadata_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, CookbookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookMetadata_Platforms(), ecorePackage.getEString(), "platforms", null, 0, -1, CookbookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookMetadata_Version(), ecorePackage.getEString(), "version", null, 1, 1, CookbookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookMetadata_Dependencies(), ecorePackage.getEString(), "dependencies", null, 0, -1, CookbookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cookbookDefinitionEClass, CookbookDefinition.class, "CookbookDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookFileEClass, CookbookFile.class, "CookbookFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookLibraryEClass, CookbookLibrary.class, "CookbookLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookTemplateEClass, CookbookTemplate.class, "CookbookTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookRootFileEClass, CookbookRootFile.class, "CookbookRootFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookRecipeEClass, CookbookRecipe.class, "CookbookRecipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCookbookRecipe_Path(), ecorePackage.getEString(), "path", null, 1, 1, CookbookRecipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cookbookResourceEClass, CookbookResource.class, "CookbookResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookProvidersEClass, CookbookProviders.class, "CookbookProviders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookAttributesEClass, CookbookAttributes.class, "CookbookAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookMaintainerEClass, CookbookMaintainer.class, "CookbookMaintainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(roleRespEClass, RoleResp.class, "RoleResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(roleListRespEClass, RoleListResp.class, "RoleListResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookListVersionRespEClass, CookbookListVersionResp.class, "CookbookListVersionResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCookbookListVersionResp_Url(), ecorePackage.getEString(), "url", null, 0, 1, CookbookListVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbookListVersionResp_Version(), ecorePackage.getEString(), "version", null, 1, 1, CookbookListVersionResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nodeRespEClass, NodeResp.class, "NodeResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nodeListRespEClass, NodeListResp.class, "NodeListResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(searchResultRespEClass, SearchResultResp.class, "SearchResultResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(searchIndexRespEClass, SearchIndexResp.class, "SearchIndexResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookMetadataDependencyEClass, CookbookMetadataDependency.class, "CookbookMetadataDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(environmentRespEClass, EnvironmentResp.class, "EnvironmentResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jsonObjectRespEClass, JSONObjectResp.class, "JSONObjectResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(clientRespEClass, ClientResp.class, "ClientResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(clientListRespEClass, ClientListResp.class, "ClientListResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //RESTPackageImpl
