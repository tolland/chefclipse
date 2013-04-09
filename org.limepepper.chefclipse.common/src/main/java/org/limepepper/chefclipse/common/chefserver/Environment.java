/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.NamedDescribedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Environment#getOverride_attributes <em>Override attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends NamedDescribedObject {

    /**
	 * Returns the value of the '<em><b>Override attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Override attributes</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Override attributes</em>' attribute list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getEnvironment_Override_attributes()
	 * @model
	 * @generated
	 */
    EList<String> getOverride_attributes();
} // Environment
