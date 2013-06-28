/**
 */
package org.limepepper.chefclipse.impl;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.SandboxedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sandboxed Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.SandboxedObjectImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SandboxedObjectImpl extends EObjectImpl implements SandboxedObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SandboxedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefclipsePackage.Literals.SANDBOXED_OBJECT;
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
	public URL getUrl() {
		return (URL)eGet(ChefclipsePackage.Literals.SANDBOXED_OBJECT__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(URL newUrl) {
		eSet(ChefclipsePackage.Literals.SANDBOXED_OBJECT__URL, newUrl);
	}

} //SandboxedObjectImpl
