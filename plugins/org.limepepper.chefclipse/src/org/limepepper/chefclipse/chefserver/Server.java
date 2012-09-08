/**
 */
package org.limepepper.chefclipse.chefserver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Cookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' reference list.
	 * @see #isSetCookbooks()
	 * @see #unsetCookbooks()
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Cookbooks()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<Cookbook> getCookbooks();

	/**
	 * Unsets the value of the '{@link org.limepepper.chefclipse.chefserver.Server#getCookbooks <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	void unsetCookbooks();

	/**
	 * Returns whether the value of the '{@link org.limepepper.chefclipse.chefserver.Server#getCookbooks <em>Cookbooks</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cookbooks</em>' reference list is set.
	 * @see #unsetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	boolean isSetCookbooks();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(Role)
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Roles()
	 * @model containment="true"
	 * @generated
	 */
	Role getRoles();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.chefserver.Server#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Role value);

} // Server
