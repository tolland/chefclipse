/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.impl.ChecksumFileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root file</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.Root_fileImpl#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Root_fileImpl extends ChecksumFileImpl implements Root_file {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root_fileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.ROOT_FILE;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookVersion getCookbook() {
		return (CookbookVersion)eGet(CookbookPackage.Literals.COOKBOOK_FILE__COOKBOOK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook(CookbookVersion newCookbook) {
		eSet(CookbookPackage.Literals.COOKBOOK_FILE__COOKBOOK, newCookbook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBytes() {
		return (byte[])eGet(CookbookPackage.Literals.COOKBOOK_FILE__BYTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytes(byte[] newBytes) {
		eSet(CookbookPackage.Literals.COOKBOOK_FILE__BYTES, newBytes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBytes() {
		eUnset(CookbookPackage.Literals.COOKBOOK_FILE__BYTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBytes() {
		return eIsSet(CookbookPackage.Literals.COOKBOOK_FILE__BYTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream getContentStream() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SandboxedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.ROOT_FILE__URL: return ChefclipsePackage.SANDBOXED_OBJECT__URL;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.ROOT_FILE__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case CookbookPackage.ROOT_FILE__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.ROOT_FILE__COOKBOOK: return CookbookPackage.COOKBOOK_FILE__COOKBOOK;
				case CookbookPackage.ROOT_FILE__BYTES: return CookbookPackage.COOKBOOK_FILE__BYTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SandboxedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.SANDBOXED_OBJECT__URL: return CookbookPackage.ROOT_FILE__URL;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.ROOT_FILE__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.ROOT_FILE__ID;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (baseFeatureID) {
				case CookbookPackage.COOKBOOK_FILE__COOKBOOK: return CookbookPackage.ROOT_FILE__COOKBOOK;
				case CookbookPackage.COOKBOOK_FILE__BYTES: return CookbookPackage.ROOT_FILE__BYTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Root_fileImpl
