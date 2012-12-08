/**
 */
package org.limepepper.chefclipse.REST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook List Version Resp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookListVersionResp#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookListVersionResp#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookListVersionResp()
 * @model
 * @generated
 */
public interface CookbookListVersionResp extends EObject {
    /**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookListVersionResp_Url()
	 * @model
	 * @generated
	 */
    String getUrl();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookListVersionResp#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
    void setUrl(String value);

    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookListVersionResp_Version()
	 * @model required="true"
	 * @generated
	 */
    String getVersion();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookListVersionResp#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(String value);

} // CookbookListVersionResp
