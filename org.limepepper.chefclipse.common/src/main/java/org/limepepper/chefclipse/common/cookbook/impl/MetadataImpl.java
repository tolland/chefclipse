/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.impl.RubyFileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getMaintainer_email <em>Maintainer email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getCookbookVersion <em>Cookbook Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getLong_description <em>Long description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataImpl extends RubyFileImpl implements Metadata {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MetadataImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return CookbookPackage.Literals.METADATA;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMaintainer() {
		return (String)eGet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMaintainer(String newMaintainer) {
		eSet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER, newMaintainer);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMaintainer_email() {
		return (String)eGet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMaintainer_email(String newMaintainer_email) {
		eSet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL, newMaintainer_email);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLicense() {
		return (String)eGet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__LICENSE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLicense(String newLicense) {
		eSet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__LICENSE, newLicense);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDescription() {
		return (String)eGet(ChefclipsePackage.Literals.DESCRIBED_OBJECT__DESCRIPTION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDescription(String newDescription) {
		eSet(ChefclipsePackage.Literals.DESCRIBED_OBJECT__DESCRIPTION, newDescription);
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
    public CookbookVersion getCookbookVersion() {
		return (CookbookVersion)eGet(CookbookPackage.Literals.METADATA__COOKBOOK_VERSION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCookbookVersion(CookbookVersion newCookbookVersion) {
		eSet(CookbookPackage.Literals.METADATA__COOKBOOK_VERSION, newCookbookVersion);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLong_description() {
		return (String)eGet(CookbookPackage.Literals.METADATA__LONG_DESCRIPTION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLong_description(String newLong_description) {
		eSet(CookbookPackage.Literals.METADATA__LONG_DESCRIPTION, newLong_description);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getVersion() {
		return (String)eGet(CookbookPackage.Literals.METADATA__VERSION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion(String newVersion) {
		eSet(CookbookPackage.Literals.METADATA__VERSION, newVersion);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getReplaces() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__REPLACES, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getProvides() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__PROVIDES, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getConflicts() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__CONFLICTS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getSuggests() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__SUGGESTS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getDependencies() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__DEPENDENCIES, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getPlatforms() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__PLATFORMS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EMap<String, String> getRecipes() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__RECIPES, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MaintainedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.METADATA__MAINTAINER: return ChefclipsePackage.MAINTAINED_OBJECT__MAINTAINER;
				case CookbookPackage.METADATA__MAINTAINER_EMAIL: return ChefclipsePackage.MAINTAINED_OBJECT__MAINTAINER_EMAIL;
				case CookbookPackage.METADATA__LICENSE: return ChefclipsePackage.MAINTAINED_OBJECT__LICENSE;
				default: return -1;
			}
		}
		if (baseClass == DescribedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.METADATA__DESCRIPTION: return ChefclipsePackage.DESCRIBED_OBJECT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.METADATA__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case CookbookPackage.METADATA__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedDescribedObject.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == MaintainedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.MAINTAINED_OBJECT__MAINTAINER: return CookbookPackage.METADATA__MAINTAINER;
				case ChefclipsePackage.MAINTAINED_OBJECT__MAINTAINER_EMAIL: return CookbookPackage.METADATA__MAINTAINER_EMAIL;
				case ChefclipsePackage.MAINTAINED_OBJECT__LICENSE: return CookbookPackage.METADATA__LICENSE;
				default: return -1;
			}
		}
		if (baseClass == DescribedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.DESCRIBED_OBJECT__DESCRIPTION: return CookbookPackage.METADATA__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.NAMED_OBJECT__NAME: return CookbookPackage.METADATA__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return CookbookPackage.METADATA__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedDescribedObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MetadataImpl
