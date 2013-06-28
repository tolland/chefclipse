/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

<<<<<<< HEAD
import org.eclipse.emf.ecore.EClass;
=======
import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.File;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.impl.SandboxedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
<<<<<<< HEAD
=======
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.FileImpl#getBytes <em>Bytes</em>}</li>
 * </ul>
>>>>>>> origin/tomhodder
 * </p>
 *
 * @generated
 */
<<<<<<< HEAD
public class FileImpl extends CookbookFileImpl implements File {
=======
public class FileImpl extends SandboxedObjectImpl implements File {
>>>>>>> origin/tomhodder
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.FILE;
	}
<<<<<<< HEAD
=======

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecksum() {
		return (String)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__CHECKSUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(String newChecksum) {
		eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__CHECKSUM, newChecksum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificity() {
		return (String)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__SPECIFICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificity(String newSpecificity) {
		eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__SPECIFICITY, newSpecificity);
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
		if (baseClass == ChecksumFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.FILE__CHECKSUM: return ChefclipsePackage.CHECKSUM_FILE__CHECKSUM;
				case CookbookPackage.FILE__PATH: return ChefclipsePackage.CHECKSUM_FILE__PATH;
				case CookbookPackage.FILE__SPECIFICITY: return ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.FILE__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case CookbookPackage.FILE__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.FILE__COOKBOOK: return CookbookPackage.COOKBOOK_FILE__COOKBOOK;
				case CookbookPackage.FILE__BYTES: return CookbookPackage.COOKBOOK_FILE__BYTES;
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
		if (baseClass == ChecksumFile.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.CHECKSUM_FILE__CHECKSUM: return CookbookPackage.FILE__CHECKSUM;
				case ChefclipsePackage.CHECKSUM_FILE__PATH: return CookbookPackage.FILE__PATH;
				case ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY: return CookbookPackage.FILE__SPECIFICITY;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.FILE__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.FILE__ID;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (baseFeatureID) {
				case CookbookPackage.COOKBOOK_FILE__COOKBOOK: return CookbookPackage.FILE__COOKBOOK;
				case CookbookPackage.COOKBOOK_FILE__BYTES: return CookbookPackage.FILE__BYTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
>>>>>>> origin/tomhodder

} //FileImpl
