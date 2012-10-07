/**
 */
package org.limepepper.chefclipse.model.chefserver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.model.chefclient.Client;

import org.limepepper.chefclipse.model.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getDatabags <em>Databags</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getClients <em>Clients</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Server#getWebuiport <em>Webuiport</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.cookbook.Cookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' reference list.
	 * @see #isSetCookbooks()
	 * @see #unsetCookbooks()
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Cookbooks()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<Cookbook> getCookbooks();

	/**
	 * Unsets the value of the '{@link org.limepepper.chefclipse.model.chefserver.Server#getCookbooks <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	void unsetCookbooks();

	/**
	 * Returns whether the value of the '{@link org.limepepper.chefclipse.model.chefserver.Server#getCookbooks <em>Cookbooks</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cookbooks</em>' reference list is set.
	 * @see #unsetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	boolean isSetCookbooks();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefserver.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefserver.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Databags</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefserver.DataBag}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.model.chefserver.DataBag#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databags</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Databags()
	 * @see org.limepepper.chefclipse.model.chefserver.DataBag#getServer
	 * @model opposite="server" containment="true"
	 * @generated
	 */
	EList<DataBag> getDatabags();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefserver.Environment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Environments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefclient.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Clients()
	 * @model
	 * @generated
	 */
	EList<Client> getClients();

	/**
	 * Returns the value of the '<em><b>Webuiport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webuiport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webuiport</em>' attribute.
	 * @see #setWebuiport(int)
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getServer_Webuiport()
	 * @model
	 * @generated
	 */
	int getWebuiport();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.chefserver.Server#getWebuiport <em>Webuiport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webuiport</em>' attribute.
	 * @see #getWebuiport()
	 * @generated
	 */
	void setWebuiport(int value);

} // Server
