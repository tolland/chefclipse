/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import java.io.InputStream;
import java.net.URL;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
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
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getBytes <em>Bytes</em>}</li>
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
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.MetadataImpl#getReplacing <em>Replacing</em>}</li>
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
	public String getReplacing() {
		return (String)eGet(CookbookPackage.Literals.METADATA__REPLACING, true);
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
		if (baseClass == ChecksumFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.METADATA__CHECKSUM: return ChefclipsePackage.CHECKSUM_FILE__CHECKSUM;
				case CookbookPackage.METADATA__PATH: return ChefclipsePackage.CHECKSUM_FILE__PATH;
				case CookbookPackage.METADATA__SPECIFICITY: return ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY;
				default: return -1;
			}
		}
		if (baseClass == SandboxedObject.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.METADATA__URL: return ChefclipsePackage.SANDBOXED_OBJECT__URL;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (derivedFeatureID) {
				case CookbookPackage.METADATA__COOKBOOK: return CookbookPackage.COOKBOOK_FILE__COOKBOOK;
				case CookbookPackage.METADATA__BYTES: return CookbookPackage.COOKBOOK_FILE__BYTES;
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
		if (baseClass == ChecksumFile.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.CHECKSUM_FILE__CHECKSUM: return CookbookPackage.METADATA__CHECKSUM;
				case ChefclipsePackage.CHECKSUM_FILE__PATH: return CookbookPackage.METADATA__PATH;
				case ChefclipsePackage.CHECKSUM_FILE__SPECIFICITY: return CookbookPackage.METADATA__SPECIFICITY;
				default: return -1;
			}
		}
		if (baseClass == SandboxedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.SANDBOXED_OBJECT__URL: return CookbookPackage.METADATA__URL;
				default: return -1;
			}
		}
		if (baseClass == CookbookFile.class) {
			switch (baseFeatureID) {
				case CookbookPackage.COOKBOOK_FILE__COOKBOOK: return CookbookPackage.METADATA__COOKBOOK;
				case CookbookPackage.COOKBOOK_FILE__BYTES: return CookbookPackage.METADATA__BYTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MetadataImpl
