/**
 */
package org.limepepper.chefclipse.REST.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
import org.limepepper.chefclipse.REST.RESTPackage;
import org.limepepper.chefclipse.REST.RoleListResp;
import org.limepepper.chefclipse.REST.RoleResp;
import org.limepepper.chefclipse.REST.SearchIndexResp;
import org.limepepper.chefclipse.REST.SearchResultResp;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.REST.RESTPackage
 * @generated
 */
public class RESTAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static RESTPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RESTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RESTPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RESTSwitch<Adapter> modelSwitch =
        new RESTSwitch<Adapter>() {
			@Override
			public Adapter caseCookbookListResp(CookbookListResp object) {
				return createCookbookListRespAdapter();
			}
			@Override
			public Adapter caseCookbookVersionResp(CookbookVersionResp object) {
				return createCookbookVersionRespAdapter();
			}
			@Override
			public Adapter caseCookbookMetadata(CookbookMetadata object) {
				return createCookbookMetadataAdapter();
			}
			@Override
			public Adapter caseCookbookDefinition(CookbookDefinition object) {
				return createCookbookDefinitionAdapter();
			}
			@Override
			public Adapter caseCookbookFile(CookbookFile object) {
				return createCookbookFileAdapter();
			}
			@Override
			public Adapter caseCookbookLibrary(CookbookLibrary object) {
				return createCookbookLibraryAdapter();
			}
			@Override
			public Adapter caseCookbookTemplate(CookbookTemplate object) {
				return createCookbookTemplateAdapter();
			}
			@Override
			public Adapter caseCookbookRootFile(CookbookRootFile object) {
				return createCookbookRootFileAdapter();
			}
			@Override
			public Adapter caseCookbookRecipe(CookbookRecipe object) {
				return createCookbookRecipeAdapter();
			}
			@Override
			public Adapter caseCookbookResource(CookbookResource object) {
				return createCookbookResourceAdapter();
			}
			@Override
			public Adapter caseCookbookProviders(CookbookProviders object) {
				return createCookbookProvidersAdapter();
			}
			@Override
			public Adapter caseCookbookAttributes(CookbookAttributes object) {
				return createCookbookAttributesAdapter();
			}
			@Override
			public Adapter caseCookbookMaintainer(CookbookMaintainer object) {
				return createCookbookMaintainerAdapter();
			}
			@Override
			public Adapter caseRoleResp(RoleResp object) {
				return createRoleRespAdapter();
			}
			@Override
			public Adapter caseRoleListResp(RoleListResp object) {
				return createRoleListRespAdapter();
			}
			@Override
			public Adapter caseCookbookListVersionResp(CookbookListVersionResp object) {
				return createCookbookListVersionRespAdapter();
			}
			@Override
			public Adapter caseNodeResp(NodeResp object) {
				return createNodeRespAdapter();
			}
			@Override
			public Adapter caseNodeListResp(NodeListResp object) {
				return createNodeListRespAdapter();
			}
			@Override
			public Adapter caseSearchResultResp(SearchResultResp object) {
				return createSearchResultRespAdapter();
			}
			@Override
			public Adapter caseSearchIndexResp(SearchIndexResp object) {
				return createSearchIndexRespAdapter();
			}
			@Override
			public Adapter caseCookbookMetadataDependency(CookbookMetadataDependency object) {
				return createCookbookMetadataDependencyAdapter();
			}
			@Override
			public Adapter caseEnvironmentResp(EnvironmentResp object) {
				return createEnvironmentRespAdapter();
			}
			@Override
			public Adapter caseJSONObjectResp(JSONObjectResp object) {
				return createJSONObjectRespAdapter();
			}
			@Override
			public Adapter caseClientResp(ClientResp object) {
				return createClientRespAdapter();
			}
			@Override
			public Adapter caseClientListResp(ClientListResp object) {
				return createClientListRespAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookListResp <em>Cookbook List Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookListResp
	 * @generated
	 */
    public Adapter createCookbookListRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookVersionResp <em>Cookbook Version Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookVersionResp
	 * @generated
	 */
    public Adapter createCookbookVersionRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookMetadata <em>Cookbook Metadata</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookMetadata
	 * @generated
	 */
    public Adapter createCookbookMetadataAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookDefinition <em>Cookbook Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookDefinition
	 * @generated
	 */
    public Adapter createCookbookDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookFile <em>Cookbook File</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookFile
	 * @generated
	 */
    public Adapter createCookbookFileAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookLibrary <em>Cookbook Library</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookLibrary
	 * @generated
	 */
    public Adapter createCookbookLibraryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookTemplate <em>Cookbook Template</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookTemplate
	 * @generated
	 */
    public Adapter createCookbookTemplateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookRootFile <em>Cookbook Root File</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookRootFile
	 * @generated
	 */
    public Adapter createCookbookRootFileAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookRecipe <em>Cookbook Recipe</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookRecipe
	 * @generated
	 */
    public Adapter createCookbookRecipeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookResource <em>Cookbook Resource</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookResource
	 * @generated
	 */
    public Adapter createCookbookResourceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookProviders <em>Cookbook Providers</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookProviders
	 * @generated
	 */
    public Adapter createCookbookProvidersAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookAttributes <em>Cookbook Attributes</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookAttributes
	 * @generated
	 */
    public Adapter createCookbookAttributesAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookMaintainer <em>Cookbook Maintainer</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookMaintainer
	 * @generated
	 */
    public Adapter createCookbookMaintainerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.RoleResp <em>Role Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.RoleResp
	 * @generated
	 */
    public Adapter createRoleRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.RoleListResp <em>Role List Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.RoleListResp
	 * @generated
	 */
    public Adapter createRoleListRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookListVersionResp <em>Cookbook List Version Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookListVersionResp
	 * @generated
	 */
    public Adapter createCookbookListVersionRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.NodeResp <em>Node Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.NodeResp
	 * @generated
	 */
    public Adapter createNodeRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.NodeListResp <em>Node List Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.NodeListResp
	 * @generated
	 */
    public Adapter createNodeListRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.SearchResultResp <em>Search Result Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.SearchResultResp
	 * @generated
	 */
    public Adapter createSearchResultRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.SearchIndexResp <em>Search Index Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.SearchIndexResp
	 * @generated
	 */
    public Adapter createSearchIndexRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.CookbookMetadataDependency <em>Cookbook Metadata Dependency</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.CookbookMetadataDependency
	 * @generated
	 */
    public Adapter createCookbookMetadataDependencyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.EnvironmentResp <em>Environment Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.EnvironmentResp
	 * @generated
	 */
    public Adapter createEnvironmentRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.JSONObjectResp <em>JSON Object Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.JSONObjectResp
	 * @generated
	 */
    public Adapter createJSONObjectRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.ClientResp <em>Client Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.ClientResp
	 * @generated
	 */
    public Adapter createClientRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.REST.ClientListResp <em>Client List Resp</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.REST.ClientListResp
	 * @generated
	 */
    public Adapter createClientListRespAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //RESTAdapterFactory
