/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintained Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.MaintainedObject#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.MaintainedObject#getMaintainer_email <em>Maintainer email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.MaintainedObject#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getMaintainedObject()
 * @model
 * @generated
 */
public interface MaintainedObject extends EObject {
    /**
	 * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' attribute.
	 * @see #setMaintainer(String)
	 * @see org.limepepper.chefclipse.ChefclipsePackage#getMaintainedObject_Maintainer()
	 * @model required="true"
	 * @generated
	 */
    String getMaintainer();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.MaintainedObject#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
    void setMaintainer(String value);

    /**
	 * Returns the value of the '<em><b>Maintainer email</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maintainer email</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer email</em>' attribute.
	 * @see #setMaintainer_email(String)
	 * @see org.limepepper.chefclipse.ChefclipsePackage#getMaintainedObject_Maintainer_email()
	 * @model dataType="org.limepepper.chefclipse.Email" required="true"
	 * @generated
	 */
    String getMaintainer_email();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.MaintainedObject#getMaintainer_email <em>Maintainer email</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer email</em>' attribute.
	 * @see #getMaintainer_email()
	 * @generated
	 */
    void setMaintainer_email(String value);

    /**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>License</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.limepepper.chefclipse.ChefclipsePackage#getMaintainedObject_License()
	 * @model dataType="org.limepepper.chefclipse.Text"
	 * @generated
	 */
    String getLicense();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.MaintainedObject#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
    void setLicense(String value);

} // MaintainedObject
