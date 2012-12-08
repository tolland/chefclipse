/**
 */
package org.limepepper.chefclipse;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Url Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.NameUrlMap#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getNameUrlMap()
 * @model
 * @generated
 */
public interface NameUrlMap extends EObject {
    /**
     * Returns the value of the '<em><b>Entry</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' map.
     * @see org.limepepper.chefclipse.ChefclipsePackage#getNameUrlMap_Entry()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     *        annotation="JSON AnonRoot='true'"
     * @generated
     */
    EMap<String, String> getEntry();

} // NameUrlMap
