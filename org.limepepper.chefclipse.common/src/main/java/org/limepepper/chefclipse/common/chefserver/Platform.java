/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Platform#getTestVal <em>Test Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject {

    /**
	 * Returns the value of the '<em><b>Test Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Val</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Val</em>' attribute.
	 * @see #setTestVal(int)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getPlatform_TestVal()
	 * @model
	 * @generated
	 */
    int getTestVal();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Platform#getTestVal <em>Test Val</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Val</em>' attribute.
	 * @see #getTestVal()
	 * @generated
	 */
    void setTestVal(int value);
} // Platform
