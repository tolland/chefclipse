/**
 */
package org.limepepper.chefclipse.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.VersionedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.VersionedObjectImpl#getNUM_VERSIONS <em>NUM VERSIONS</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.VersionedObjectImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionedObjectImpl extends EObjectImpl implements VersionedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefclipsePackage.Literals.VERSIONED_OBJECT;
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
	public Integer getNUM_VERSIONS() {
		return (Integer)eGet(ChefclipsePackage.Literals.VERSIONED_OBJECT__NUM_VERSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(ChefclipsePackage.Literals.VERSIONED_OBJECT__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(ChefclipsePackage.Literals.VERSIONED_OBJECT__VERSION, newVersion);
	}

} //VersionedObjectImpl
