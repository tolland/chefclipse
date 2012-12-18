/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruby File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.RubyFile#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getRubyFile()
 * @model
 * @generated
 */
public interface RubyFile extends EObject {
    /**
     * Returns the value of the '<em><b>Extension</b></em>' attribute.
     * The default value is <code>"rb"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' attribute.
     * @see #setExtension(String)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getRubyFile_Extension()
     * @model default="rb"
     * @generated
     */
    String getExtension();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.RubyFile#getExtension <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' attribute.
     * @see #getExtension()
     * @generated
     */
    void setExtension(String value);

} // RubyFile
