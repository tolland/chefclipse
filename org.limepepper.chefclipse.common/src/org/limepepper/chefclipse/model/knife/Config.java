/**
 */
package org.limepepper.chefclipse.model.knife;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.knife.Config#getPlugins <em>Plugins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.knife.KnifePackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.knife.Plugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.knife.KnifePackage#getConfig_Plugins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plugin> getPlugins();

} // Config
