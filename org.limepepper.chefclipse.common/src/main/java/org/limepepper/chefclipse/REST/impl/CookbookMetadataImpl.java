/**
 */
package org.limepepper.chefclipse.REST.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.REST.CookbookMetadata;
import org.limepepper.chefclipse.REST.RESTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookMetadataImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookMetadataImpl extends EObjectImpl implements CookbookMetadata {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookMetadataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RESTPackage.Literals.COOKBOOK_METADATA;
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
        return (String)eGet(RESTPackage.Literals.COOKBOOK_METADATA__MAINTAINER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaintainer(String newMaintainer) {
        eSet(RESTPackage.Literals.COOKBOOK_METADATA__MAINTAINER, newMaintainer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<String> getPlatforms() {
        return (EList<String>)eGet(RESTPackage.Literals.COOKBOOK_METADATA__PLATFORMS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_METADATA__VERSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        eSet(RESTPackage.Literals.COOKBOOK_METADATA__VERSION, newVersion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<String> getDependencies() {
        return (EList<String>)eGet(RESTPackage.Literals.COOKBOOK_METADATA__DEPENDENCIES, true);
    }

} //CookbookMetadataImpl
