/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.SandboxedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Cookbook File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getBytes <em>Bytes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookFileImpl#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerCookbookFileImpl extends SandboxedObjectImpl implements
		ServerCookbookFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerCookbookFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.SERVER_COOKBOOK_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(UtilityPackage.Literals.NAMED_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(UtilityPackage.Literals.NAMED_OBJECT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecksum() {
		return (String) eGet(UtilityPackage.Literals.CHECKSUM_FILE__CHECKSUM,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(String newChecksum) {
		eSet(UtilityPackage.Literals.CHECKSUM_FILE__CHECKSUM, newChecksum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String) eGet(CookbookPackage.Literals.COOKBOOK_FILE__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eSet(CookbookPackage.Literals.COOKBOOK_FILE__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificity() {
		return (String) eGet(
				CookbookPackage.Literals.COOKBOOK_FILE__SPECIFICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificity(String newSpecificity) {
		eSet(CookbookPackage.Literals.COOKBOOK_FILE__SPECIFICITY,
				newSpecificity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookVersion getCookbook() {
		return (CookbookVersion) eGet(
				CookbookPackage.Literals.COOKBOOK_FILE__COOKBOOK, true);
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
		return (byte[]) eGet(CookbookPackage.Literals.COOKBOOK_FILE__BYTES,
				true);
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
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
			case ChefserverPackage.SERVER_COOKBOOK_FILE__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case ChefserverPackage.SERVER_COOKBOOK_FILE__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
			}
		}
		if (baseClass == ChecksumFile.class) {
			switch (derivedFeatureID) {
			case ChefserverPackage.SERVER_COOKBOOK_FILE__CHECKSUM:
				return UtilityPackage.CHECKSUM_FILE__CHECKSUM;
			default:
				return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (derivedFeatureID) {
			case ChefserverPackage.SERVER_COOKBOOK_FILE__BYTES:
				return CookbookPackage.COOKBOOK_FILE__BYTES;
			case ChefserverPackage.SERVER_COOKBOOK_FILE__PATH:
				return CookbookPackage.COOKBOOK_FILE__PATH;
			case ChefserverPackage.SERVER_COOKBOOK_FILE__SPECIFICITY:
				return CookbookPackage.COOKBOOK_FILE__SPECIFICITY;
			case ChefserverPackage.SERVER_COOKBOOK_FILE__COOKBOOK:
				return CookbookPackage.COOKBOOK_FILE__COOKBOOK;
			default:
				return -1;
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
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
			case UtilityPackage.NAMED_OBJECT__NAME:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__ID;
			default:
				return -1;
			}
		}
		if (baseClass == ChecksumFile.class) {
			switch (baseFeatureID) {
			case UtilityPackage.CHECKSUM_FILE__CHECKSUM:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__CHECKSUM;
			default:
				return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (baseFeatureID) {
			case CookbookPackage.COOKBOOK_FILE__BYTES:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__BYTES;
			case CookbookPackage.COOKBOOK_FILE__PATH:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__PATH;
			case CookbookPackage.COOKBOOK_FILE__SPECIFICITY:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__SPECIFICITY;
			case CookbookPackage.COOKBOOK_FILE__COOKBOOK:
				return ChefserverPackage.SERVER_COOKBOOK_FILE__COOKBOOK;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ServerCookbookFileImpl
