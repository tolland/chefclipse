/**
 */
package org.limepepper.chefclipse.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.RubyFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.RubyFileImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RubyFileImpl extends EObjectImpl implements RubyFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefclipsePackage.Literals.RUBY_FILE;
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
	public String getExtension() {
		return (String)eGet(ChefclipsePackage.Literals.RUBY_FILE__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		eSet(ChefclipsePackage.Literals.RUBY_FILE__EXTENSION, newExtension);
	}

} //RubyFileImpl
