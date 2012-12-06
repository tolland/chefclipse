/**
 */
package org.limepepper.chefclipse.common.chefserver;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sandbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Sandbox#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Sandbox#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getSandbox()
 * @model
 * @generated
 */
public interface Sandbox extends EObject {
    /**
     * Returns the value of the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Checksum</em>' attribute.
     * @see #setChecksum(String)
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getSandbox_Checksum()
     * @model required="true"
     * @generated
     */
    String getChecksum();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Sandbox#getChecksum <em>Checksum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Checksum</em>' attribute.
     * @see #getChecksum()
     * @generated
     */
    void setChecksum(String value);

    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(URL)
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getSandbox_Url()
     * @model dataType="org.limepepper.chefclipse.URL" required="true"
     * @generated
     */
    URL getUrl();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Sandbox#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(URL value);

} // Sandbox