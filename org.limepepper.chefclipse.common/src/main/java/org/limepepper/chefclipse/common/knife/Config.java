/**
 */
package org.limepepper.chefclipse.common.knife;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.NamedDescribedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getNode_name <em>Node name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getClient_key <em>Client key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getChef_server_url <em>Chef server url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getCache_type <em>Cache type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getCache_option <em>Cache option</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getValidation_client_name <em>Validation client name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getValidation_key <em>Validation key</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_path <em>Cookbook path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_copyright <em>Cookbook copyright</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_email <em>Cookbook email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_license <em>Cookbook license</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.Config#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends NamedDescribedObject {
    /**
     * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
     * The list contents are of type {@link org.limepepper.chefclipse.common.knife.Plugin}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plugins</em>' containment reference list.
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Plugins()
     * @model containment="true"
     * @generated
     */
    EList<Plugin> getPlugins();

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
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Node_name()
     * @model required="true"
     * @generated
     */
    String getNode_name();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getNode_name <em>Node name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node name</em>' attribute.
     * @see #getNode_name()
     * @generated
     */
    void setNode_name(String value);

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
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Client_key()
     * @model dataType="org.limepepper.chefclipse.File" required="true"
     * @generated
     */
    File getClient_key();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getClient_key <em>Client key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client key</em>' attribute.
     * @see #getClient_key()
     * @generated
     */
    void setClient_key(File value);

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
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Chef_server_url()
     * @model dataType="org.limepepper.chefclipse.URL" required="true"
     * @generated
     */
    URL getChef_server_url();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getChef_server_url <em>Chef server url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chef server url</em>' attribute.
     * @see #getChef_server_url()
     * @generated
     */
    void setChef_server_url(URL value);

    /**
     * Returns the value of the '<em><b>Cache type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cache type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cache type</em>' attribute.
     * @see #setCache_type(String)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Cache_type()
     * @model
     * @generated
     */
    String getCache_type();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getCache_type <em>Cache type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cache type</em>' attribute.
     * @see #getCache_type()
     * @generated
     */
    void setCache_type(String value);

    /**
     * Returns the value of the '<em><b>Cache option</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cache option</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cache option</em>' attribute.
     * @see #setCache_option(String)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Cache_option()
     * @model
     * @generated
     */
    String getCache_option();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getCache_option <em>Cache option</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cache option</em>' attribute.
     * @see #getCache_option()
     * @generated
     */
    void setCache_option(String value);

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
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Validation_client_name()
     * @model
     * @generated
     */
    String getValidation_client_name();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getValidation_client_name <em>Validation client name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation client name</em>' attribute.
     * @see #getValidation_client_name()
     * @generated
     */
    void setValidation_client_name(String value);

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
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Validation_key()
     * @model dataType="org.limepepper.chefclipse.File"
     * @generated
     */
    File getValidation_key();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getValidation_key <em>Validation key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation key</em>' attribute.
     * @see #getValidation_key()
     * @generated
     */
    void setValidation_key(File value);

    /**
     * Returns the value of the '<em><b>Cookbook path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook path</em>' attribute.
     * @see #setCookbook_path(File)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Cookbook_path()
     * @model dataType="org.limepepper.chefclipse.File" required="true"
     * @generated
     */
    File getCookbook_path();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_path <em>Cookbook path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook path</em>' attribute.
     * @see #getCookbook_path()
     * @generated
     */
    void setCookbook_path(File value);

    /**
     * Returns the value of the '<em><b>Cookbook copyright</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook copyright</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook copyright</em>' attribute.
     * @see #setCookbook_copyright(String)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Cookbook_copyright()
     * @model
     * @generated
     */
    String getCookbook_copyright();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_copyright <em>Cookbook copyright</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook copyright</em>' attribute.
     * @see #getCookbook_copyright()
     * @generated
     */
    void setCookbook_copyright(String value);

    /**
     * Returns the value of the '<em><b>Cookbook email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook email</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook email</em>' attribute.
     * @see #setCookbook_email(String)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Cookbook_email()
     * @model
     * @generated
     */
    String getCookbook_email();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_email <em>Cookbook email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook email</em>' attribute.
     * @see #getCookbook_email()
     * @generated
     */
    void setCookbook_email(String value);

    /**
     * Returns the value of the '<em><b>Cookbook license</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook license</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook license</em>' attribute.
     * @see #setCookbook_license(String)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Cookbook_license()
     * @model
     * @generated
     */
    String getCookbook_license();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_license <em>Cookbook license</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook license</em>' attribute.
     * @see #getCookbook_license()
     * @generated
     */
    void setCookbook_license(String value);

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(File)
     * @see org.limepepper.chefclipse.common.knife.KnifePackage#getConfig_Path()
     * @model dataType="org.limepepper.chefclipse.File" required="true"
     * @generated
     */
    File getPath();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.Config#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(File value);

} // Config
