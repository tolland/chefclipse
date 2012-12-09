/**
 */
package org.limepepper.chefclipse.REST;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookMetadata#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookMetadata#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookMetadata#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookMetadata#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookMetadata()
 * @model
 * @generated
 */
public interface CookbookMetadata extends EObject {
    /**
     * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maintainer</em>' attribute.
     * @see #setMaintainer(String)
     * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookMetadata_Maintainer()
     * @model required="true"
     * @generated
     */
    String getMaintainer();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookMetadata#getMaintainer <em>Maintainer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maintainer</em>' attribute.
     * @see #getMaintainer()
     * @generated
     */
    void setMaintainer(String value);

    /**
     * Returns the value of the '<em><b>Platforms</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Platforms</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Platforms</em>' attribute list.
     * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookMetadata_Platforms()
     * @model
     * @generated
     */
    EList<String> getPlatforms();

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookMetadata_Version()
     * @model required="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookMetadata#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependencies</em>' attribute list.
     * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookMetadata_Dependencies()
     * @model
     * @generated
     */
    EList<String> getDependencies();

} // CookbookMetadata
