/**
 */
package org.limepepper.chefclipse.model.workstation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.model.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.workstation.Repository#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.workstation.Repository#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.workstation.Repository#getOS <em>OS</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.workstation.Repository#getBasepath <em>Basepath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.workstation.WorkstationPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.cookbook.Cookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.workstation.WorkstationPackage#getRepository_Cookbooks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Cookbook> getCookbooks();

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
	 * @see org.limepepper.chefclipse.model.workstation.WorkstationPackage#getRepository_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getConfiguration();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.workstation.Repository#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Config value);

	/**
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see #setOS(String)
	 * @see org.limepepper.chefclipse.model.workstation.WorkstationPackage#getRepository_OS()
	 * @model
	 * @generated
	 */
	String getOS();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.workstation.Repository#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see #getOS()
	 * @generated
	 */
	void setOS(String value);

	/**
	 * Returns the value of the '<em><b>Basepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basepath</em>' attribute.
	 * @see #setBasepath(String)
	 * @see org.limepepper.chefclipse.model.workstation.WorkstationPackage#getRepository_Basepath()
	 * @model
	 * @generated
	 */
	String getBasepath();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.workstation.Repository#getBasepath <em>Basepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basepath</em>' attribute.
	 * @see #getBasepath()
	 * @generated
	 */
	void setBasepath(String value);

} // Repository
