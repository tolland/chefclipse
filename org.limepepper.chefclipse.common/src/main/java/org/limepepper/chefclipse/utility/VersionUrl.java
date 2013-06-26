/**
 */
package org.limepepper.chefclipse.utility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.utility.VersionUrl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.utility.VersionUrl#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.utility.UtilityPackage#getVersionUrl()
 * @model
 * @generated
 */
public interface VersionUrl extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.limepepper.chefclipse.utility.UtilityPackage#getVersionUrl_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.utility.VersionUrl#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.utility.URLEntryTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' reference list.
	 * @see org.limepepper.chefclipse.utility.UtilityPackage#getVersionUrl_Versions()
	 * @model required="true"
	 * @generated
	 */
	EList<URLEntryTest> getVersions();

} // VersionUrl
