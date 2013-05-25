/**
 */
package org.limepepper.chefclipse.utility;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checksum File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.utility.ChecksumFile#getChecksum <em>Checksum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.utility.UtilityPackage#getChecksumFile()
 * @model
 * @generated
 */
public interface ChecksumFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(String)
	 * @see org.limepepper.chefclipse.utility.UtilityPackage#getChecksumFile_Checksum()
	 * @model required="true"
	 * @generated
	 */
	String getChecksum();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.utility.ChecksumFile#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(String value);

} // ChecksumFile
