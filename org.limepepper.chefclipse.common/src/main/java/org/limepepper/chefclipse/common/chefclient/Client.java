/**
 */
package org.limepepper.chefclipse.common.chefclient;

import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.Server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefclient.Client#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefclient.ChefclientPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
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
     * @see org.limepepper.chefclipse.common.chefclient.ChefclientPackage#getClient_Server()
     * @model required="true"
     * @generated
     */
    Server getServer();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefclient.Client#getServer <em>Server</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server</em>' reference.
     * @see #getServer()
     * @generated
     */
    void setServer(Server value);

} // Client
