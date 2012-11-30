/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.Attributes;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.impl.SandboxedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.AttributesImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributesImpl extends SandboxedObjectImpl implements Attributes {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CookbookPackage.Literals.ATTRIBUTES;
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
    public URL getUrl() {
        return (URL)eGet(ChefclipsePackage.Literals.CHECKSUM_FILE__URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(URL newUrl) {
        eSet(ChefclipsePackage.Literals.CHECKSUM_FILE__URL, newUrl);
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
                case CookbookPackage.ATTRIBUTES__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
                default: return -1;
            }
        }
        if (baseClass == ChecksumFile.class) {
            switch (derivedFeatureID) {
                case CookbookPackage.ATTRIBUTES__CHECKSUM: return ChefclipsePackage.CHECKSUM_FILE__CHECKSUM;
                case CookbookPackage.ATTRIBUTES__PATH: return ChefclipsePackage.CHECKSUM_FILE__PATH;
                case CookbookPackage.ATTRIBUTES__SPECIFICITY: return ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY;
                case CookbookPackage.ATTRIBUTES__URL: return ChefclipsePackage.CHECKSUM_FILE__URL;
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
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.ATTRIBUTES__NAME;
                default: return -1;
            }
        }
        if (baseClass == ChecksumFile.class) {
            switch (baseFeatureID) {
                case ChefclipsePackage.CHECKSUM_FILE__CHECKSUM: return CookbookPackage.ATTRIBUTES__CHECKSUM;
                case ChefclipsePackage.CHECKSUM_FILE__PATH: return CookbookPackage.ATTRIBUTES__PATH;
                case ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY: return CookbookPackage.ATTRIBUTES__SPECIFICITY;
                case ChefclipsePackage.CHECKSUM_FILE__URL: return CookbookPackage.ATTRIBUTES__URL;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AttributesImpl
