/**
 */
package org.limepepper.chefclipse.common.knife.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.common.knife.Config;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.Plugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getNode_name <em>Node name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getClient_key <em>Client key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getChef_server_url <em>Chef server url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getCache_type <em>Cache type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getCache_option <em>Cache option</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getValidation_client_name <em>Validation client name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getValidation_key <em>Validation key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getCookbook_path <em>Cookbook path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getCookbook_copyright <em>Cookbook copyright</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getCookbook_email <em>Cookbook email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getCookbook_license <em>Cookbook license</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KnifePackage.Literals.CONFIG;
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
        return (String)eGet(ChefclipsePackage.Literals.NAMED_DESCRIBED_OBJECT__NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eSet(ChefclipsePackage.Literals.NAMED_DESCRIBED_OBJECT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return (String)eGet(ChefclipsePackage.Literals.NAMED_DESCRIBED_OBJECT__DESCRIPTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        eSet(ChefclipsePackage.Literals.NAMED_DESCRIBED_OBJECT__DESCRIPTION, newDescription);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Plugin> getPlugins() {
        return (EList<Plugin>)eGet(KnifePackage.Literals.CONFIG__PLUGINS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNode_name() {
        return (String)eGet(KnifePackage.Literals.CONFIG__NODE_NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode_name(String newNode_name) {
        eSet(KnifePackage.Literals.CONFIG__NODE_NAME, newNode_name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File getClient_key() {
        return (File)eGet(KnifePackage.Literals.CONFIG__CLIENT_KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClient_key(File newClient_key) {
        eSet(KnifePackage.Literals.CONFIG__CLIENT_KEY, newClient_key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public URL getChef_server_url() {
        return (URL)eGet(KnifePackage.Literals.CONFIG__CHEF_SERVER_URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChef_server_url(URL newChef_server_url) {
        eSet(KnifePackage.Literals.CONFIG__CHEF_SERVER_URL, newChef_server_url);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCache_type() {
        return (String)eGet(KnifePackage.Literals.CONFIG__CACHE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCache_type(String newCache_type) {
        eSet(KnifePackage.Literals.CONFIG__CACHE_TYPE, newCache_type);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCache_option() {
        return (String)eGet(KnifePackage.Literals.CONFIG__CACHE_OPTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCache_option(String newCache_option) {
        eSet(KnifePackage.Literals.CONFIG__CACHE_OPTION, newCache_option);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValidation_client_name() {
        return (String)eGet(KnifePackage.Literals.CONFIG__VALIDATION_CLIENT_NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidation_client_name(String newValidation_client_name) {
        eSet(KnifePackage.Literals.CONFIG__VALIDATION_CLIENT_NAME, newValidation_client_name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File getValidation_key() {
        return (File)eGet(KnifePackage.Literals.CONFIG__VALIDATION_KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidation_key(File newValidation_key) {
        eSet(KnifePackage.Literals.CONFIG__VALIDATION_KEY, newValidation_key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File getCookbook_path() {
        return (File)eGet(KnifePackage.Literals.CONFIG__COOKBOOK_PATH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbook_path(File newCookbook_path) {
        eSet(KnifePackage.Literals.CONFIG__COOKBOOK_PATH, newCookbook_path);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCookbook_copyright() {
        return (String)eGet(KnifePackage.Literals.CONFIG__COOKBOOK_COPYRIGHT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbook_copyright(String newCookbook_copyright) {
        eSet(KnifePackage.Literals.CONFIG__COOKBOOK_COPYRIGHT, newCookbook_copyright);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCookbook_email() {
        return (String)eGet(KnifePackage.Literals.CONFIG__COOKBOOK_EMAIL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbook_email(String newCookbook_email) {
        eSet(KnifePackage.Literals.CONFIG__COOKBOOK_EMAIL, newCookbook_email);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCookbook_license() {
        return (String)eGet(KnifePackage.Literals.CONFIG__COOKBOOK_LICENSE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbook_license(String newCookbook_license) {
        eSet(KnifePackage.Literals.CONFIG__COOKBOOK_LICENSE, newCookbook_license);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File getPath() {
        return (File)eGet(KnifePackage.Literals.CONFIG__PATH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(File newPath) {
        eSet(KnifePackage.Literals.CONFIG__PATH, newPath);
    }

} //ConfigImpl
