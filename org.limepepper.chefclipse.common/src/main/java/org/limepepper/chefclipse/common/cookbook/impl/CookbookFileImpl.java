/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.io.InputStream;
<<<<<<< HEAD
import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.SandboxedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.NamedObjectImpl;
=======

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.impl.NamedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getChecksum <em>Checksum</em>}</li>
<<<<<<< HEAD
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getBytes <em>Bytes</em>}</li>
=======
>>>>>>> origin/tomhodder
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookFileImpl#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
<<<<<<< HEAD
public abstract class CookbookFileImpl extends NamedObjectImpl implements
		CookbookFile {
=======
public abstract class CookbookFileImpl extends NamedObjectImpl implements CookbookFile {
>>>>>>> origin/tomhodder
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.COOKBOOK_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecksum() {
<<<<<<< HEAD
		return (String) eGet(UtilityPackage.Literals.CHECKSUM_FILE__CHECKSUM,
				true);
=======
		return (String)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__CHECKSUM, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(String newChecksum) {
<<<<<<< HEAD
		eSet(UtilityPackage.Literals.CHECKSUM_FILE__CHECKSUM, newChecksum);
=======
		eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__CHECKSUM, newChecksum);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
<<<<<<< HEAD
		return (String) eGet(CookbookPackage.Literals.COOKBOOK_FILE__PATH, true);
=======
		return (String)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__PATH, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
<<<<<<< HEAD
		eSet(CookbookPackage.Literals.COOKBOOK_FILE__PATH, newPath);
=======
		eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__PATH, newPath);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificity() {
<<<<<<< HEAD
		return (String) eGet(
				CookbookPackage.Literals.COOKBOOK_FILE__SPECIFICITY, true);
=======
		return (String)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__SPECIFICITY, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificity(String newSpecificity) {
<<<<<<< HEAD
		eSet(CookbookPackage.Literals.COOKBOOK_FILE__SPECIFICITY,
				newSpecificity);
=======
		eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__SPECIFICITY, newSpecificity);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookVersion getCookbook() {
<<<<<<< HEAD
		return (CookbookVersion) eGet(
				CookbookPackage.Literals.COOKBOOK_FILE__COOKBOOK, true);
=======
		return (CookbookVersion)eGet(CookbookPackage.Literals.COOKBOOK_FILE__COOKBOOK, true);
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
	public URL getUrl() {
		return (URL) eGet(UtilityPackage.Literals.SANDBOXED_OBJECT__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(URL newUrl) {
		eSet(UtilityPackage.Literals.SANDBOXED_OBJECT__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBytes() {
		return (byte[]) eGet(CookbookPackage.Literals.COOKBOOK_FILE__BYTES,
				true);
=======
	public byte[] getBytes() {
		return (byte[])eGet(CookbookPackage.Literals.COOKBOOK_FILE__BYTES, true);
>>>>>>> origin/tomhodder
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
		if (baseClass == ChecksumFile.class) {
			switch (derivedFeatureID) {
<<<<<<< HEAD
			case CookbookPackage.COOKBOOK_FILE__CHECKSUM:
				return UtilityPackage.CHECKSUM_FILE__CHECKSUM;
			default:
				return -1;
			}
		}
		if (baseClass == SandboxedObject.class) {
			switch (derivedFeatureID) {
			case CookbookPackage.COOKBOOK_FILE__URL:
				return UtilityPackage.SANDBOXED_OBJECT__URL;
			default:
				return -1;
=======
				case CookbookPackage.COOKBOOK_FILE__CHECKSUM: return ChefclipsePackage.CHECKSUM_FILE__CHECKSUM;
				case CookbookPackage.COOKBOOK_FILE__PATH: return ChefclipsePackage.CHECKSUM_FILE__PATH;
				case CookbookPackage.COOKBOOK_FILE__SPECIFICITY: return ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY;
				default: return -1;
>>>>>>> origin/tomhodder
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
		if (baseClass == ChecksumFile.class) {
			switch (baseFeatureID) {
<<<<<<< HEAD
			case UtilityPackage.CHECKSUM_FILE__CHECKSUM:
				return CookbookPackage.COOKBOOK_FILE__CHECKSUM;
			default:
				return -1;
			}
		}
		if (baseClass == SandboxedObject.class) {
			switch (baseFeatureID) {
			case UtilityPackage.SANDBOXED_OBJECT__URL:
				return CookbookPackage.COOKBOOK_FILE__URL;
			default:
				return -1;
=======
				case ChefclipsePackage.CHECKSUM_FILE__CHECKSUM: return CookbookPackage.COOKBOOK_FILE__CHECKSUM;
				case ChefclipsePackage.CHECKSUM_FILE__PATH: return CookbookPackage.COOKBOOK_FILE__PATH;
				case ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY: return CookbookPackage.COOKBOOK_FILE__SPECIFICITY;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CookbookFileImpl
