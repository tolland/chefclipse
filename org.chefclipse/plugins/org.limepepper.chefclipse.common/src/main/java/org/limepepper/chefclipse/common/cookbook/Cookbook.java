/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getJson_class <em>Json class</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getChef_type <em>Chef type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbook()
 * @model
 * @generated
 */
public interface Cookbook extends EObject {
	/**
	 * Returns the value of the '<em><b>Json class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json class</em>' attribute.
	 * @see #setJson_class(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbook_Json_class()
	 * @model
	 * @generated
	 */
	String getJson_class();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getJson_class <em>Json class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json class</em>' attribute.
	 * @see #getJson_class()
	 * @generated
	 */
	void setJson_class(String value);

	/**
	 * Returns the value of the '<em><b>Chef type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef type</em>' attribute.
	 * @see #setChef_type(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbook_Chef_type()
	 * @model
	 * @generated
	 */
	String getChef_type();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Cookbook#getChef_type <em>Chef type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef type</em>' attribute.
	 * @see #getChef_type()
	 * @generated
	 */
	void setChef_type(String value);

} // Cookbook
