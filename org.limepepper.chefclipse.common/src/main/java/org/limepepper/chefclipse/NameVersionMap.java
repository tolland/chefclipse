/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Version Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.NameVersionMap#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getNameVersionMap()
 * @model
 * @generated
 */
public interface NameVersionMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.limepepper.chefclipse.VersionUrl},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see org.limepepper.chefclipse.ChefclipsePackage#getNameVersionMap_Entries()
	 * @model mapType="org.limepepper.chefclipse.EStringToVersionUrlMap<org.eclipse.emf.ecore.EString, org.limepepper.chefclipse.VersionUrl>"
	 *        annotation="JSON AnonRoot='true'"
	 * @generated
	 */
	EMap<String, VersionUrl> getEntries();

} // NameVersionMap
