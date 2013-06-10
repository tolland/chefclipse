/**
 */
package org.limepepper.chefclipse.json.json;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.json.json.ArrayValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.json.json.JsonPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.json.json.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.limepepper.chefclipse.json.json.JsonPackage#getArrayValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

} // ArrayValue
