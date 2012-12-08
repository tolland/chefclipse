/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.impl.SandboxedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.DefinitionImpl#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends SandboxedObjectImpl implements Definition {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DefinitionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return CookbookPackage.Literals.DEFINITION;
	}

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
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ChecksumFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.DEFINITION__CHECKSUM: return ChefclipsePackage.CHECKSUM_FILE__CHECKSUM;
				case CookbookPackage.DEFINITION__PATH: return ChefclipsePackage.CHECKSUM_FILE__PATH;
				case CookbookPackage.DEFINITION__SPECIFICITY: return ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.DEFINITION__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case CookbookPackage.DEFINITION__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.DEFINITION__COOKBOOK: return CookbookPackage.COOKBOOK_FILE__COOKBOOK;
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
				case ChefclipsePackage.CHECKSUM_FILE__CHECKSUM: return CookbookPackage.DEFINITION__CHECKSUM;
				case ChefclipsePackage.CHECKSUM_FILE__PATH: return CookbookPackage.DEFINITION__PATH;
				case ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY: return CookbookPackage.DEFINITION__SPECIFICITY;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.DEFINITION__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.DEFINITION__ID;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (baseFeatureID) {
				case CookbookPackage.COOKBOOK_FILE__COOKBOOK: return CookbookPackage.DEFINITION__COOKBOOK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DefinitionImpl
