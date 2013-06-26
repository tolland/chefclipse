/**
 */
package org.limepepper.chefclipse.utility.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.utility.MaintainedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintained Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl#getMaintainer_email <em>Maintainer email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaintainedObjectImpl extends EObjectImpl implements
		MaintainedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilityPackage.Literals.MAINTAINED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER,
				newMaintainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer_email() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer_email(String newMaintainer_email) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL,
				newMaintainer_email);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__LICENSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__LICENSE, newLicense);
	}

} //MaintainedObjectImpl
