/**
 */
package org.limepepper.chefclipse.json.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.json.json.Model#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.json.json.JsonPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.json.json.JsonObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see org.limepepper.chefclipse.json.json.JsonPackage#getModel_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsonObject> getObjects();

} // Model
