/**
 */
package org.limepepper.chefclipse.chefserver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Node#getRun_list <em>Run list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Run list</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.RunList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run list</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list</em>' containment reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode_Run_list()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunList> getRun_list();

} // Node
