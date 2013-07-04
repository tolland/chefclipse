/**
 */
package org.limepepper.chefclipse.json.json;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.json.json.JsonObjectValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.json.json.JsonPackage#getJsonObjectValue()
 * @model
 * @generated
 */
public interface JsonObjectValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(JsonObject)
	 * @see org.limepepper.chefclipse.json.json.JsonPackage#getJsonObjectValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	JsonObject getValue();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.json.json.JsonObjectValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(JsonObject value);

} // JsonObjectValue
