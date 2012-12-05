/**
 */
package org.limepepper.chefclipse.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.Config;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getChef_server_url <em>Chef server url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getClient_key <em>Client key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getNode_name <em>Node name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getLog_level <em>Log level</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getValidation_key <em>Validation key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.ConfigImpl#getValidation_client_name <em>Validation client name</em>}</li>
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
        return ChefclipsePackage.Literals.CONFIG;
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
    public URL getChef_server_url() {
        return (URL)eGet(ChefclipsePackage.Literals.CONFIG__CHEF_SERVER_URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChef_server_url(URL newChef_server_url) {
        eSet(ChefclipsePackage.Literals.CONFIG__CHEF_SERVER_URL, newChef_server_url);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File getClient_key() {
        return (File)eGet(ChefclipsePackage.Literals.CONFIG__CLIENT_KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClient_key(File newClient_key) {
        eSet(ChefclipsePackage.Literals.CONFIG__CLIENT_KEY, newClient_key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNode_name() {
        return (String)eGet(ChefclipsePackage.Literals.CONFIG__NODE_NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode_name(String newNode_name) {
        eSet(ChefclipsePackage.Literals.CONFIG__NODE_NAME, newNode_name);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLog_level() {
        return (String)eGet(ChefclipsePackage.Literals.CONFIG__LOG_LEVEL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLog_level(String newLog_level) {
        eSet(ChefclipsePackage.Literals.CONFIG__LOG_LEVEL, newLog_level);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File getValidation_key() {
        return (File)eGet(ChefclipsePackage.Literals.CONFIG__VALIDATION_KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidation_key(File newValidation_key) {
        eSet(ChefclipsePackage.Literals.CONFIG__VALIDATION_KEY, newValidation_key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return (String)eGet(ChefclipsePackage.Literals.CONFIG__VERSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        eSet(ChefclipsePackage.Literals.CONFIG__VERSION, newVersion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValidation_client_name() {
        return (String)eGet(ChefclipsePackage.Literals.CONFIG__VALIDATION_CLIENT_NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValidation_client_name(String newValidation_client_name) {
        eSet(ChefclipsePackage.Literals.CONFIG__VALIDATION_CLIENT_NAME, newValidation_client_name);
    }

} //ConfigImpl
