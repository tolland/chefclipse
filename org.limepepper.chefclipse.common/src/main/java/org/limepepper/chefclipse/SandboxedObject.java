/**
 */
package org.limepepper.chefclipse;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sandboxed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.SandboxedObject#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getSandboxedObject()
 * @model
 * @generated
 */
public interface SandboxedObject extends EObject {
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
	 * @see org.limepepper.chefclipse.ChefclipsePackage#getSandboxedObject_Url()
	 * @model dataType="org.limepepper.chefclipse.URL"
	 * @generated
	 */
    URL getUrl();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.SandboxedObject#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
    void setUrl(URL value);

} // SandboxedObject
