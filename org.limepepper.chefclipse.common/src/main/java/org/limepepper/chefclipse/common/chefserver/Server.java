/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getDatabags <em>Databags</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getClients <em>Clients</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getWebuiport <em>Webuiport</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getSandboxes <em>Sandboxes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getConfig <em>Config</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getKnifeConfig <em>Knife Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' containment reference list.
	 * @see #isSetCookbooks()
	 * @see #unsetCookbooks()
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Cookbooks()
	 * @model containment="true" resolveProxies="true" unsettable="true"
	 * @generated
	 */
	EList<ServerCookbookVersion> getCookbooks();

	/**
	 * Unsets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	void unsetCookbooks();

	/**
	 * Returns whether the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cookbooks</em>' containment reference list is set.
	 * @see #unsetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	boolean isSetCookbooks();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Roles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Nodes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Databags</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.DataBag}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databags</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Databags()
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag#getServer
	 * @model opposite="server" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DataBag> getDatabags();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Environment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Environments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefclient.ChefClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Clients()
	 * @model
	 * @generated
	 */
	EList<ChefClient> getClients();

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
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Webuiport()
	 * @model
	 * @generated
	 */
	int getWebuiport();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getWebuiport <em>Webuiport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webuiport</em>' attribute.
	 * @see #getWebuiport()
	 * @generated
	 */
	void setWebuiport(int value);

	/**
	 * Returns the value of the '<em><b>Sandboxes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Sandbox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sandboxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sandboxes</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Sandboxes()
	 * @model
	 * @generated
	 */
	EList<Sandbox> getSandboxes();

	/**
	 * Returns the value of the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' reference.
	 * @see #setConfig(ServerConfig)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Config()
	 * @model
	 * @generated
	 */
	ServerConfig getConfig();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getConfig <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ServerConfig value);

	/**
	 * Returns the value of the '<em><b>Knife Config</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.knife.KnifeConfig}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knife Config</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knife Config</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_KnifeConfig()
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getServer
	 * @model opposite="server"
	 * @generated
	 */
	EList<KnifeConfig> getKnifeConfig();

} // Server
