/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.VersionedObject#getNUM_VERSIONS <em>NUM VERSIONS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getVersionedObject()
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
     * @see org.limepepper.chefclipse.ChefclipsePackage#getVersionedObject_NUM_VERSIONS()
     * @model default="3" required="true" changeable="false"
     * @generated
     */
    Integer getNUM_VERSIONS();

} // VersionedObject
