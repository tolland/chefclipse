/**
 */
package org.limepepper.chefclipse;

import java.net.URL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Url List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.NameUrlList#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getNameUrlList()
 * @model
 * @generated
 */
public interface NameUrlList extends NamedObject {
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
     * @see org.limepepper.chefclipse.ChefclipsePackage#getNameUrlList_Url()
     * @model dataType="org.limepepper.chefclipse.URL" required="true"
     * @generated
     */
    URL getUrl();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.NameUrlList#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(URL value);

} // NameUrlList
