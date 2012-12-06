/**
 */
package org.limepepper.chefclipse.REST.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookListVersionResp;
import org.limepepper.chefclipse.REST.RESTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook List Resp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookListRespImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookListRespImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookListRespImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookListRespImpl extends EObjectImpl implements CookbookListResp {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookListRespImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RESTPackage.Literals.COOKBOOK_LIST_RESP;
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
    public String getName() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_LIST_RESP__NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eSet(RESTPackage.Literals.COOKBOOK_LIST_RESP__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CookbookListVersionResp> getVersions() {
        return (EList<CookbookListVersionResp>)eGet(RESTPackage.Literals.COOKBOOK_LIST_RESP__VERSIONS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUrl() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_LIST_RESP__URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(String newUrl) {
        eSet(RESTPackage.Literals.COOKBOOK_LIST_RESP__URL, newUrl);
    }

} //CookbookListRespImpl
