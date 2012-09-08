/**
 */
package org.limepepper.chefclipse.cookbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Cookbook#getDepends <em>Depends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook()
 * @model
 * @generated
 */
public interface Cookbook extends EObject {
	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference.
	 * @see #setDepends(DependencyRelation)
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook_Depends()
	 * @model
	 * @generated
	 */
	DependencyRelation getDepends();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.cookbook.Cookbook#getDepends <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' reference.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(DependencyRelation value);

} // Cookbook
