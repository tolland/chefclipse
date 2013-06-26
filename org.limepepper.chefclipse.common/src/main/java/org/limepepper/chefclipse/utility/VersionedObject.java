/**
 */
package org.limepepper.chefclipse.utility;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.utility.VersionedObject#getNUM_VERSIONS <em>NUM VERSIONS</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.utility.VersionedObject#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.utility.UtilityPackage#getVersionedObject()
 * @model
 * @generated
 */
public interface VersionedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>NUM VERSIONS</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NUM VERSIONS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NUM VERSIONS</em>' attribute.
	 * @see org.limepepper.chefclipse.utility.UtilityPackage#getVersionedObject_NUM_VERSIONS()
	 * @model default="3" required="true" changeable="false"
	 * @generated
	 */
	Integer getNUM_VERSIONS();

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
	 * @see org.limepepper.chefclipse.utility.UtilityPackage#getVersionedObject_Version()
	 * @model default="0.0.0" dataType="org.limepepper.chefclipse.utility.Version" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.utility.VersionedObject#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // VersionedObject
