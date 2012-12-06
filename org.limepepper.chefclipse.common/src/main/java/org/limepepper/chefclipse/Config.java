/**
 */
package org.limepepper.chefclipse;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.Config#getChef_server_url <em>Chef server url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.Config#getClient_key <em>Client key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.Config#getNode_name <em>Node name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.Config#getLog_level <em>Log level</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.Config#getValidation_key <em>Validation key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.Config#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.Config#getValidation_client_name <em>Validation client name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
    /**
     * Returns the value of the '<em><b>Chef server url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Chef server url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Chef server url</em>' attribute.
     * @see #setChef_server_url(URL)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Chef_server_url()
     * @model dataType="org.limepepper.chefclipse.URL" required="true"
     * @generated
     */
    URL getChef_server_url();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getChef_server_url <em>Chef server url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chef server url</em>' attribute.
     * @see #getChef_server_url()
     * @generated
     */
    void setChef_server_url(URL value);

    /**
     * Returns the value of the '<em><b>Client key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client key</em>' attribute.
     * @see #setClient_key(File)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Client_key()
     * @model dataType="org.limepepper.chefclipse.File" required="true"
     * @generated
     */
    File getClient_key();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getClient_key <em>Client key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client key</em>' attribute.
     * @see #getClient_key()
     * @generated
     */
    void setClient_key(File value);

    /**
     * Returns the value of the '<em><b>Node name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node name</em>' attribute.
     * @see #setNode_name(String)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Node_name()
     * @model required="true"
     * @generated
     */
    String getNode_name();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getNode_name <em>Node name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node name</em>' attribute.
     * @see #getNode_name()
     * @generated
     */
    void setNode_name(String value);

    /**
     * Returns the value of the '<em><b>Log level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log level</em>' attribute.
     * @see #setLog_level(String)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Log_level()
     * @model
     * @generated
     */
    String getLog_level();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getLog_level <em>Log level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log level</em>' attribute.
     * @see #getLog_level()
     * @generated
     */
    void setLog_level(String value);

    /**
     * Returns the value of the '<em><b>Validation key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validation key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Validation key</em>' attribute.
     * @see #setValidation_key(File)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Validation_key()
     * @model dataType="org.limepepper.chefclipse.File"
     * @generated
     */
    File getValidation_key();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getValidation_key <em>Validation key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation key</em>' attribute.
     * @see #getValidation_key()
     * @generated
     */
    void setValidation_key(File value);

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
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Version()
     * @model dataType="org.limepepper.chefclipse.Version"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Validation client name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validation client name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Validation client name</em>' attribute.
     * @see #setValidation_client_name(String)
     * @see org.limepepper.chefclipse.ChefclipsePackage#getConfig_Validation_client_name()
     * @model
     * @generated
     */
    String getValidation_client_name();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.Config#getValidation_client_name <em>Validation client name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation client name</em>' attribute.
     * @see #getValidation_client_name()
     * @generated
     */
    void setValidation_client_name(String value);

} // Config
