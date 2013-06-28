/**
 */
package org.limepepper.chefclipse;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Test Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.MapTestContainer#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getMapTestContainer()
 * @model
 * @generated
 */
public interface MapTestContainer extends EObject {
    /**
	 * Returns the value of the '<em><b>Entries</b></em>' attribute list.
	 * The list contents are of type {@link java.util.HashMap}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entries</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' attribute list.
	 * @see org.limepepper.chefclipse.ChefclipsePackage#getMapTestContainer_Entries()
	 * @model dataType="org.limepepper.chefclipse.MapTest"
	 * @generated
	 */
    EList<HashMap> getEntries();

} // MapTestContainer
