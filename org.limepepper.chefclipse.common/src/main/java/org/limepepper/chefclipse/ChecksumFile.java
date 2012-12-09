/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checksum File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.ChecksumFile#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.ChecksumFile#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.ChecksumFile#getSpecificity <em>Specificity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getChecksumFile()
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
     * @see org.limepepper.chefclipse.ChefclipsePackage#getChecksumFile_Checksum()
     * @model required="true"
     * @generated
     */
    String getChecksum();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.ChecksumFile#getChecksum <em>Checksum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Checksum</em>' attribute.
     * @see #getChecksum()
     * @generated
     */
    void setChecksum(String value);

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getChecksumFile_Path()
     * @model required="true"
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.ChecksumFile#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

    /**
     * Returns the value of the '<em><b>Specificity</b></em>' attribute.
     * The default value is <code>"default"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specificity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specificity</em>' attribute.
     * @see #setSpecificity(String)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getChecksumFile_Specificity()
     * @model default="default" required="true"
     * @generated
     */
    String getSpecificity();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.ChecksumFile#getSpecificity <em>Specificity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specificity</em>' attribute.
     * @see #getSpecificity()
     * @generated
     */
    void setSpecificity(String value);

} // ChecksumFile
