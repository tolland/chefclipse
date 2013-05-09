/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.common.util.EMap;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.RubyFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getCookbookVersion <em>Cookbook Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getLong_description <em>Long description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Metadata#getReplacing <em>Replacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends RubyFile, MaintainedObject, NamedDescribedObject, CookbookFile {
    /**
	 * Returns the value of the '<em><b>Cookbook Version</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook Version</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook Version</em>' container reference.
	 * @see #setCookbookVersion(CookbookVersion)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_CookbookVersion()
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMetadata
	 * @model opposite="metadata" required="true" transient="false"
	 * @generated
	 */
    CookbookVersion getCookbookVersion();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getCookbookVersion <em>Cookbook Version</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbook Version</em>' container reference.
	 * @see #getCookbookVersion()
	 * @generated
	 */
    void setCookbookVersion(CookbookVersion value);

    /**
	 * Returns the value of the '<em><b>Long description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Long description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Long description</em>' attribute.
	 * @see #setLong_description(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Long_description()
	 * @model dataType="org.limepepper.chefclipse.Text"
	 * @generated
	 */
    String getLong_description();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getLong_description <em>Long description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long description</em>' attribute.
	 * @see #getLong_description()
	 * @generated
	 */
    void setLong_description(String value);

    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Version()
	 * @model default="0.0.0" dataType="org.limepepper.chefclipse.Version" required="true"
	 * @generated
	 */
    String getVersion();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(String value);

    /**
	 * Returns the value of the '<em><b>Replaces</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Replaces</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaces</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Replaces()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getReplaces();

    /**
	 * Returns the value of the '<em><b>Provides</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provides</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Provides()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getProvides();

    /**
	 * Returns the value of the '<em><b>Conflicts</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conflicts</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Conflicts()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getConflicts();

    /**
	 * Returns the value of the '<em><b>Suggests</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suggests</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggests</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Suggests()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getSuggests();

    /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Dependencies()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getDependencies();

    /**
	 * Returns the value of the '<em><b>Platforms</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Platforms</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Platforms()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getPlatforms();

    /**
	 * Returns the value of the '<em><b>Recipes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipes</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' map.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Recipes()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
    EMap<String, String> getRecipes();

				/**
	 * Returns the value of the '<em><b>Replacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacing</em>' attribute.
	 * @see #setReplacing(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getMetadata_Replacing()
	 * @model required="true"
	 * @generated
	 */
	String getReplacing();

				/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getReplacing <em>Replacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacing</em>' attribute.
	 * @see #getReplacing()
	 * @generated
	 */
	void setReplacing(String value);

} // Metadata
