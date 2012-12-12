/**
 */
package org.limepepper.chefclipse.common.chefserver;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getCookbook_maintainer <em>Cookbook maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getCookbook_description <em>Cookbook description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getCookbook_name <em>Cookbook name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookInfo()
 * @model annotation="JSON root='true' element='items'"
 * @generated
 */
public interface CookbookInfo extends EObject {
    /**
     * Returns the value of the '<em><b>Cookbook maintainer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook maintainer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook maintainer</em>' attribute.
     * @see #setCookbook_maintainer(String)
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookInfo_Cookbook_maintainer()
     * @model required="true"
     * @generated
     */
    String getCookbook_maintainer();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getCookbook_maintainer <em>Cookbook maintainer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook maintainer</em>' attribute.
     * @see #getCookbook_maintainer()
     * @generated
     */
    void setCookbook_maintainer(String value);

    /**
     * Returns the value of the '<em><b>Cookbook description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook description</em>' attribute.
     * @see #setCookbook_description(String)
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookInfo_Cookbook_description()
     * @model dataType="org.limepepper.chefclipse.Text" required="true"
     * @generated
     */
    String getCookbook_description();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getCookbook_description <em>Cookbook description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook description</em>' attribute.
     * @see #getCookbook_description()
     * @generated
     */
    void setCookbook_description(String value);

    /**
     * Returns the value of the '<em><b>Cookbook name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook name</em>' attribute.
     * @see #setCookbook_name(String)
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookInfo_Cookbook_name()
     * @model required="true"
     * @generated
     */
    String getCookbook_name();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getCookbook_name <em>Cookbook name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook name</em>' attribute.
     * @see #getCookbook_name()
     * @generated
     */
    void setCookbook_name(String value);

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
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookInfo_Url()
     * @model dataType="org.limepepper.chefclipse.URL" required="true"
     * @generated
     */
    URL getUrl();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookInfo#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(URL value);

} // CookbookInfo
