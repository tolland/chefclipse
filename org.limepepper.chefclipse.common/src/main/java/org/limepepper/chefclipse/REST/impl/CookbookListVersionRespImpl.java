/**
 */
package org.limepepper.chefclipse.REST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.REST.CookbookListVersionResp;
import org.limepepper.chefclipse.REST.RESTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook List Version Resp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookListVersionRespImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookListVersionRespImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookListVersionRespImpl extends EObjectImpl implements CookbookListVersionResp {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookListVersionRespImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RESTPackage.Literals.COOKBOOK_LIST_VERSION_RESP;
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
    public String getUrl() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_LIST_VERSION_RESP__URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(String newUrl) {
        eSet(RESTPackage.Literals.COOKBOOK_LIST_VERSION_RESP__URL, newUrl);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_LIST_VERSION_RESP__VERSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        eSet(RESTPackage.Literals.COOKBOOK_LIST_VERSION_RESP__VERSION, newVersion);
    }

} //CookbookListVersionRespImpl
