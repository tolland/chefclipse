/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Resource;
import org.limepepper.chefclipse.impl.RubyFileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends RubyFileImpl implements Resource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CookbookPackage.Literals.RESOURCE;
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
        if (baseClass == SandboxedObject.class) {
            switch (derivedFeatureID) {
                case CookbookPackage.RESOURCE__URL: return ChefclipsePackage.SANDBOXED_OBJECT__URL;
                default: return -1;
            }
        }
        if (baseClass == ChecksumFile.class) {
            switch (derivedFeatureID) {
                case CookbookPackage.RESOURCE__CHECKSUM: return ChefclipsePackage.CHECKSUM_FILE__CHECKSUM;
                case CookbookPackage.RESOURCE__PATH: return ChefclipsePackage.CHECKSUM_FILE__PATH;
                case CookbookPackage.RESOURCE__SPECIFICITY: return ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY;
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case CookbookPackage.RESOURCE__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
                case CookbookPackage.RESOURCE__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
                default: return -1;
            }
        }
        if (baseClass == CookbookFile.class) {
            switch (derivedFeatureID) {
                case CookbookPackage.RESOURCE__COOKBOOK: return CookbookPackage.COOKBOOK_FILE__COOKBOOK;
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
                case ChefclipsePackage.SANDBOXED_OBJECT__URL: return CookbookPackage.RESOURCE__URL;
                default: return -1;
            }
        }
        if (baseClass == ChecksumFile.class) {
            switch (baseFeatureID) {
                case ChefclipsePackage.CHECKSUM_FILE__CHECKSUM: return CookbookPackage.RESOURCE__CHECKSUM;
                case ChefclipsePackage.CHECKSUM_FILE__PATH: return CookbookPackage.RESOURCE__PATH;
                case ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY: return CookbookPackage.RESOURCE__SPECIFICITY;
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.RESOURCE__NAME;
                case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.RESOURCE__ID;
                default: return -1;
            }
        }
        if (baseClass == CookbookFile.class) {
            switch (baseFeatureID) {
                case CookbookPackage.COOKBOOK_FILE__COOKBOOK: return CookbookPackage.RESOURCE__COOKBOOK;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ResourceImpl