/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.Metadata;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.DescribedObject;
import org.limepepper.chefclipse.utility.MaintainedObject;
import org.limepepper.chefclipse.utility.NamedDescribedObject;
import org.limepepper.chefclipse.utility.RubyFile;
import org.limepepper.chefclipse.utility.UtilityPackage;
=======
import org.limepepper.chefclipse.impl.RubyFileImpl;
>>>>>>> origin/tomhodder

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
<<<<<<< HEAD
public class MetadataImpl extends CookbookFileImpl implements Metadata {
=======
public class MetadataImpl extends RubyFileImpl implements Metadata {
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
	public String getExtension() {
		return (String) eGet(UtilityPackage.Literals.RUBY_FILE__EXTENSION, true);
=======
	public String getMaintainer() {
		return (String)eGet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setExtension(String newExtension) {
		eSet(UtilityPackage.Literals.RUBY_FILE__EXTENSION, newExtension);
=======
	public void setMaintainer(String newMaintainer) {
		eSet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER, newMaintainer);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getMaintainer() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER, true);
=======
	public String getMaintainer_email() {
		return (String)eGet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setMaintainer(String newMaintainer) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER,
				newMaintainer);
=======
	public void setMaintainer_email(String newMaintainer_email) {
		eSet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL, newMaintainer_email);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getMaintainer_email() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL,
				true);
=======
	public String getLicense() {
		return (String)eGet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__LICENSE, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setMaintainer_email(String newMaintainer_email) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__MAINTAINER_EMAIL,
				newMaintainer_email);
=======
	public void setLicense(String newLicense) {
		eSet(ChefclipsePackage.Literals.MAINTAINED_OBJECT__LICENSE, newLicense);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getLicense() {
		return (String) eGet(
				UtilityPackage.Literals.MAINTAINED_OBJECT__LICENSE, true);
=======
	public String getDescription() {
		return (String)eGet(ChefclipsePackage.Literals.DESCRIBED_OBJECT__DESCRIPTION, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setLicense(String newLicense) {
		eSet(UtilityPackage.Literals.MAINTAINED_OBJECT__LICENSE, newLicense);
=======
	public void setDescription(String newDescription) {
		eSet(ChefclipsePackage.Literals.DESCRIBED_OBJECT__DESCRIPTION, newDescription);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getDescription() {
		return (String) eGet(
				UtilityPackage.Literals.DESCRIBED_OBJECT__DESCRIPTION, true);
=======
	public String getName() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setDescription(String newDescription) {
		eSet(UtilityPackage.Literals.DESCRIBED_OBJECT__DESCRIPTION,
				newDescription);
=======
	public void setName(String newName) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, newName);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getLong_description() {
		return (String) eGet(
				CookbookPackage.Literals.METADATA__LONG_DESCRIPTION, true);
=======
	public String getID() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setLong_description(String newLong_description) {
		eSet(CookbookPackage.Literals.METADATA__LONG_DESCRIPTION,
				newLong_description);
=======
	public void setID(String newID) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, newID);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getVersion() {
		return (String) eGet(CookbookPackage.Literals.METADATA__VERSION, true);
=======
	public CookbookVersion getCookbookVersion() {
		return (CookbookVersion)eGet(CookbookPackage.Literals.METADATA__COOKBOOK_VERSION, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setVersion(String newVersion) {
		eSet(CookbookPackage.Literals.METADATA__VERSION, newVersion);
=======
	public void setCookbookVersion(CookbookVersion newCookbookVersion) {
		eSet(CookbookPackage.Literals.METADATA__COOKBOOK_VERSION, newCookbookVersion);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	@SuppressWarnings("unchecked")
	public EMap<String, String> getReplaces() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__REPLACES, true);
=======
	public String getLong_description() {
		return (String)eGet(CookbookPackage.Literals.METADATA__LONG_DESCRIPTION, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	@SuppressWarnings("unchecked")
	public EMap<String, String> getProvides() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__PROVIDES, true);
=======
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
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
<<<<<<< HEAD
	public EMap<String, String> getConflicts() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__CONFLICTS, true);
=======
	public EMap<String, String> getReplaces() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__REPLACES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
<<<<<<< HEAD
	public EMap<String, String> getSuggests() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__SUGGESTS, true);
=======
	public EMap<String, String> getProvides() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__PROVIDES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
<<<<<<< HEAD
	public EMap<String, String> getDependencies() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__DEPENDENCIES, true);
=======
	public EMap<String, String> getConflicts() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__CONFLICTS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
<<<<<<< HEAD
	public EMap<String, String> getPlatforms() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__PLATFORMS, true);
=======
	public EMap<String, String> getSuggests() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__SUGGESTS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
<<<<<<< HEAD
	public EMap<String, String> getRecipes() {
		return (EMap<String, String>) eGet(
				CookbookPackage.Literals.METADATA__RECIPES, true);
=======
	public EMap<String, String> getDependencies() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__DEPENDENCIES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public String getReplacing() {
		return (String) eGet(CookbookPackage.Literals.METADATA__REPLACING, true);
=======
	@SuppressWarnings("unchecked")
	public EMap<String, String> getPlatforms() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__PLATFORMS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public void setReplacing(String newReplacing) {
		eSet(CookbookPackage.Literals.METADATA__REPLACING, newReplacing);
=======
	@SuppressWarnings("unchecked")
	public EMap<String, String> getRecipes() {
		return (EMap<String, String>)eGet(CookbookPackage.Literals.METADATA__RECIPES, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
<<<<<<< HEAD
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
=======
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
>>>>>>> origin/tomhodder
			}
		}
		if (baseClass == NamedDescribedObject.class) {
			switch (derivedFeatureID) {
<<<<<<< HEAD
			default:
				return -1;
=======
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
<<<<<<< HEAD
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
=======
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
>>>>>>> origin/tomhodder
			}
		}
		if (baseClass == NamedDescribedObject.class) {
			switch (baseFeatureID) {
<<<<<<< HEAD
			default:
				return -1;
=======
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MetadataImpl
