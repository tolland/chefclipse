/**
 */
package org.limepepper.chefclipse.model.chefserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.DataBag#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getDataBag()
 * @model
 * @generated
 */
public interface DataBag extends EObject {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.model.chefserver.Server#getDatabags <em>Databags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' container reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.model.chefserver.ChefserverPackage#getDataBag_Server()
	 * @see org.limepepper.chefclipse.model.chefserver.Server#getDatabags
	 * @model opposite="databags" transient="false"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.chefserver.DataBag#getServer <em>Server</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' container reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

} // DataBag
