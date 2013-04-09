/**
 */
package org.limepepper.chefclipse.REST.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.limepepper.chefclipse.REST.*;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.REST.RESTPackage
 * @generated
 */
public class RESTSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static RESTPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RESTSwitch() {
		if (modelPackage == null) {
			modelPackage = RESTPackage.eINSTANCE;
		}
	}

    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RESTPackage.COOKBOOK_LIST_RESP: {
				CookbookListResp cookbookListResp = (CookbookListResp)theEObject;
				T result = caseCookbookListResp(cookbookListResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_VERSION_RESP: {
				CookbookVersionResp cookbookVersionResp = (CookbookVersionResp)theEObject;
				T result = caseCookbookVersionResp(cookbookVersionResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_METADATA: {
				CookbookMetadata cookbookMetadata = (CookbookMetadata)theEObject;
				T result = caseCookbookMetadata(cookbookMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_DEFINITION: {
				CookbookDefinition cookbookDefinition = (CookbookDefinition)theEObject;
				T result = caseCookbookDefinition(cookbookDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_FILE: {
				CookbookFile cookbookFile = (CookbookFile)theEObject;
				T result = caseCookbookFile(cookbookFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_LIBRARY: {
				CookbookLibrary cookbookLibrary = (CookbookLibrary)theEObject;
				T result = caseCookbookLibrary(cookbookLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_TEMPLATE: {
				CookbookTemplate cookbookTemplate = (CookbookTemplate)theEObject;
				T result = caseCookbookTemplate(cookbookTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_ROOT_FILE: {
				CookbookRootFile cookbookRootFile = (CookbookRootFile)theEObject;
				T result = caseCookbookRootFile(cookbookRootFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_RECIPE: {
				CookbookRecipe cookbookRecipe = (CookbookRecipe)theEObject;
				T result = caseCookbookRecipe(cookbookRecipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_RESOURCE: {
				CookbookResource cookbookResource = (CookbookResource)theEObject;
				T result = caseCookbookResource(cookbookResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_PROVIDERS: {
				CookbookProviders cookbookProviders = (CookbookProviders)theEObject;
				T result = caseCookbookProviders(cookbookProviders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_ATTRIBUTES: {
				CookbookAttributes cookbookAttributes = (CookbookAttributes)theEObject;
				T result = caseCookbookAttributes(cookbookAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_MAINTAINER: {
				CookbookMaintainer cookbookMaintainer = (CookbookMaintainer)theEObject;
				T result = caseCookbookMaintainer(cookbookMaintainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.ROLE_RESP: {
				RoleResp roleResp = (RoleResp)theEObject;
				T result = caseRoleResp(roleResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.ROLE_LIST_RESP: {
				RoleListResp roleListResp = (RoleListResp)theEObject;
				T result = caseRoleListResp(roleListResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_LIST_VERSION_RESP: {
				CookbookListVersionResp cookbookListVersionResp = (CookbookListVersionResp)theEObject;
				T result = caseCookbookListVersionResp(cookbookListVersionResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.NODE_RESP: {
				NodeResp nodeResp = (NodeResp)theEObject;
				T result = caseNodeResp(nodeResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.NODE_LIST_RESP: {
				NodeListResp nodeListResp = (NodeListResp)theEObject;
				T result = caseNodeListResp(nodeListResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.SEARCH_RESULT_RESP: {
				SearchResultResp searchResultResp = (SearchResultResp)theEObject;
				T result = caseSearchResultResp(searchResultResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.SEARCH_INDEX_RESP: {
				SearchIndexResp searchIndexResp = (SearchIndexResp)theEObject;
				T result = caseSearchIndexResp(searchIndexResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.COOKBOOK_METADATA_DEPENDENCY: {
				CookbookMetadataDependency cookbookMetadataDependency = (CookbookMetadataDependency)theEObject;
				T result = caseCookbookMetadataDependency(cookbookMetadataDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.ENVIRONMENT_RESP: {
				EnvironmentResp environmentResp = (EnvironmentResp)theEObject;
				T result = caseEnvironmentResp(environmentResp);
				if (result == null) result = caseJSONObjectResp(environmentResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.JSON_OBJECT_RESP: {
				JSONObjectResp jsonObjectResp = (JSONObjectResp)theEObject;
				T result = caseJSONObjectResp(jsonObjectResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.CLIENT_RESP: {
				ClientResp clientResp = (ClientResp)theEObject;
				T result = caseClientResp(clientResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.CLIENT_LIST_RESP: {
				ClientListResp clientListResp = (ClientListResp)theEObject;
				T result = caseClientListResp(clientListResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook List Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook List Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookListResp(CookbookListResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Version Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Version Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookVersionResp(CookbookVersionResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Metadata</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookMetadata(CookbookMetadata object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Definition</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookDefinition(CookbookDefinition object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook File</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookFile(CookbookFile object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Library</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookLibrary(CookbookLibrary object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Template</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookTemplate(CookbookTemplate object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Root File</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Root File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookRootFile(CookbookRootFile object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Recipe</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Recipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookRecipe(CookbookRecipe object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Resource</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookResource(CookbookResource object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Providers</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Providers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookProviders(CookbookProviders object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Attributes</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookAttributes(CookbookAttributes object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Maintainer</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Maintainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookMaintainer(CookbookMaintainer object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Role Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRoleResp(RoleResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Role List Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role List Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRoleListResp(RoleListResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook List Version Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook List Version Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookListVersionResp(CookbookListVersionResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNodeResp(NodeResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node List Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node List Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNodeListResp(NodeListResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Search Result Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Result Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSearchResultResp(SearchResultResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Search Index Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Index Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSearchIndexResp(SearchIndexResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook Metadata Dependency</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook Metadata Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookMetadataDependency(CookbookMetadataDependency object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnvironmentResp(EnvironmentResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Object Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Object Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseJSONObjectResp(JSONObjectResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Client Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseClientResp(ClientResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Client List Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client List Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseClientListResp(ClientListResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
    @Override
    public T defaultCase(EObject object) {
		return null;
	}

} //RESTSwitch
