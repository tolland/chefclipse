/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.utility.DescribedObject;
import org.limepepper.chefclipse.utility.MaintainedObject;
import org.limepepper.chefclipse.utility.NamedDescribedObject;
import org.limepepper.chefclipse.utility.RubyFile;
import org.limepepper.chefclipse.utility.UtilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getMaintainer_email <em>Maintainer email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getLong_description <em>Long description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getReplacing <em>Replacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataImpl extends CookbookFileImpl implements Metadata {
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
	public String getExtension() {
		return (String) eGet(UtilityPackage.Literals.RUBY_FILE__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		eSet(UtilityPackage.Literals.RUBY_FILE__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER,
				newMaintainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer_email() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer_email(String newMaintainer_email) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL,
				newMaintainer_email);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__LICENSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__LICENSE, newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String) eGet(
				UtilityPackage.Literals.DESCRIBED_OBJECT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(UtilityPackage.Literals.DESCRIBED_OBJECT__DESCRIPTION,
				newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLong_description() {
		return (String) eGet(
				CookbookPackage.Literals.METADATA__LONG_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong_description(String newLong_description) {
		eSet(CookbookPackage.Literals.METADATA__LONG_DESCRIPTION,
				newLong_description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String) eGet(CookbookPackage.Literals.METADATA__VERSION, true);
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
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__REPLACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getProvides() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__PROVIDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getConflicts() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__CONFLICTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getSuggests() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__SUGGESTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getDependencies() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__DEPENDENCIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getPlatforms() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__PLATFORMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getRecipes() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__RECIPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacing() {
		return (String) eGet(CookbookPackage.Literals.METADATA__REPLACING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacing(String newReplacing) {
		eSet(CookbookPackage.Literals.METADATA__REPLACING, newReplacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RubyFile.class) {
			switch (derivedFeatureID) {
			case CookbookPackage.METADATA__EXTENSION:
				return UtilityPackage.RUBY_FILE__EXTENSION;
			default:
				return -1;
			}
		}
		if (baseClass == MaintainedObject.class) {
			switch (derivedFeatureID) {
			case CookbookPackage.METADATA__MAINTAINER:
				return UtilityPackage.MAINTAINED_OBJECT__MAINTAINER;
			case CookbookPackage.METADATA__MAINTAINER_EMAIL:
				return UtilityPackage.MAINTAINED_OBJECT__MAINTAINER_EMAIL;
			case CookbookPackage.METADATA__LICENSE:
				return UtilityPackage.MAINTAINED_OBJECT__LICENSE;
			default:
				return -1;
			}
		}
		if (baseClass == DescribedObject.class) {
			switch (derivedFeatureID) {
			case CookbookPackage.METADATA__DESCRIPTION:
				return UtilityPackage.DESCRIBED_OBJECT__DESCRIPTION;
			default:
				return -1;
			}
		}
		if (baseClass == NamedDescribedObject.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == RubyFile.class) {
			switch (baseFeatureID) {
			case UtilityPackage.RUBY_FILE__EXTENSION:
				return CookbookPackage.METADATA__EXTENSION;
			default:
				return -1;
			}
		}
		if (baseClass == MaintainedObject.class) {
			switch (baseFeatureID) {
			case UtilityPackage.MAINTAINED_OBJECT__MAINTAINER:
				return CookbookPackage.METADATA__MAINTAINER;
			case UtilityPackage.MAINTAINED_OBJECT__MAINTAINER_EMAIL:
				return CookbookPackage.METADATA__MAINTAINER_EMAIL;
			case UtilityPackage.MAINTAINED_OBJECT__LICENSE:
				return CookbookPackage.METADATA__LICENSE;
			default:
				return -1;
			}
		}
		if (baseClass == DescribedObject.class) {
			switch (baseFeatureID) {
			case UtilityPackage.DESCRIBED_OBJECT__DESCRIPTION:
				return CookbookPackage.METADATA__DESCRIPTION;
			default:
				return -1;
			}
		}
		if (baseClass == NamedDescribedObject.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MetadataImpl
