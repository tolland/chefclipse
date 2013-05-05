/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Cookbook Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getCookbook_name <em>Cookbook name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion()
 * @model
 * @generated
 */
public interface ServerCookbookVersion extends CookbookVersion {
    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Version()
	 * @model default="0.0.0" dataType="org.limepepper.chefclipse.Version" required="true"
	 * @generated
	 */
    String getVersion();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(String value);

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
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Cookbook_name()
	 * @model required="true"
	 * @generated
	 */
    String getCookbook_name();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getCookbook_name <em>Cookbook name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbook name</em>' attribute.
	 * @see #getCookbook_name()
	 * @generated
	 */
    void setCookbook_name(String value);

} // ServerCookbookVersion
