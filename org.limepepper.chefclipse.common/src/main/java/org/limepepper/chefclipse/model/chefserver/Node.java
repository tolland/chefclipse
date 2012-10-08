/**
 */
package org.limepepper.chefclipse.model.chefserver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.model.chefclient.Client;

import org.limepepper.chefclipse.model.cookbook.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Node#getRun_list <em>Run list</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Node#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Node#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Node#getClient <em>Client</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.Node#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Run list</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefserver.RunList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run list</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getNode_Run_list()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunList> getRun_list();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getNode_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.chefserver.Node#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getNode_Server()
	 * @model required="true"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.chefserver.Node#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getNode_Client()
	 * @model
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.chefserver.Node#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attribute)
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getNode_Attributes()
	 * @model
	 * @generated
	 */
	Attribute getAttributes();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.chefserver.Node#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attribute value);

} // Node
