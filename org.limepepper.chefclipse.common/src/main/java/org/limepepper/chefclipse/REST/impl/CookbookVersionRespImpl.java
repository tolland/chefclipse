/**
 */
package org.limepepper.chefclipse.REST.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.REST.CookbookAttributes;
import org.limepepper.chefclipse.REST.CookbookDefinition;
import org.limepepper.chefclipse.REST.CookbookFile;
import org.limepepper.chefclipse.REST.CookbookMetadata;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.RESTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook Version Resp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getLatestVersion <em>Latest Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getExternalUrl <em>External Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getReplacement <em>Replacement</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getCookbookName <em>Cookbook Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getJsonClass <em>Json Class</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getChefType <em>Chef Type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookVersionRespImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookVersionRespImpl extends EObjectImpl implements CookbookVersionResp {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookVersionRespImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RESTPackage.Literals.COOKBOOK_VERSION_RESP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMaintainer() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__MAINTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaintainer(String newMaintainer) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__MAINTAINER, newMaintainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCategory() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__CATEGORY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCategory(String newCategory) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__CATEGORY, newCategory);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getUpdatedAt() {
        return (Date)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__UPDATED_AT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpdatedAt(Date newUpdatedAt) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__UPDATED_AT, newUpdatedAt);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getCreatedAt() {
        return (Date)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__CREATED_AT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreatedAt(Date newCreatedAt) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__CREATED_AT, newCreatedAt);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLatestVersion() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__LATEST_VERSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLatestVersion(String newLatestVersion) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__LATEST_VERSION, newLatestVersion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExternalUrl() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__EXTERNAL_URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExternalUrl(String newExternalUrl) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__EXTERNAL_URL, newExternalUrl);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDeprecated() {
        return (Boolean)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__DEPRECATED, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeprecated(boolean newDeprecated) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__DEPRECATED, newDeprecated);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReplacement() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__REPLACEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplacement(String newReplacement) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__REPLACEMENT, newReplacement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CookbookDefinition> getDefinitions() {
        return (EList<CookbookDefinition>)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__DEFINITIONS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CookbookFile> getFiles() {
        return (EList<CookbookFile>)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__FILES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CookbookAttributes> getAttributes() {
        return (EList<CookbookAttributes>)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__ATTRIBUTES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCookbookName() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__COOKBOOK_NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbookName(String newCookbookName) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__COOKBOOK_NAME, newCookbookName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__VERSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__VERSION, newVersion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJsonClass() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__JSON_CLASS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJsonClass(String newJsonClass) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__JSON_CLASS, newJsonClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getChefType() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__CHEF_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChefType(String newChefType) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__CHEF_TYPE, newChefType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookMetadata getMetadata() {
        return (CookbookMetadata)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__METADATA, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMetadata(CookbookMetadata newMetadata) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__METADATA, newMetadata);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__DESCRIPTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        eSet(RESTPackage.Literals.COOKBOOK_VERSION_RESP__DESCRIPTION, newDescription);
    }

} //CookbookVersionRespImpl
