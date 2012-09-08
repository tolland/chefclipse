/**
 */
package org.limepepper.chefclipse.workstation;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.workstation.Repository#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.workstation.Repository#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.workstation.WorkstationPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' containment reference.
	 * @see #setCookbooks(Cookbook)
	 * @see org.limepepper.chefclipse.workstation.WorkstationPackage#getRepository_Cookbooks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Cookbook getCookbooks();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.workstation.Repository#getCookbooks <em>Cookbooks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbooks</em>' containment reference.
	 * @see #getCookbooks()
	 * @generated
	 */
	void setCookbooks(Cookbook value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Config)
	 * @see org.limepepper.chefclipse.workstation.WorkstationPackage#getRepository_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getConfiguration();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.workstation.Repository#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Config value);

} // Repository
