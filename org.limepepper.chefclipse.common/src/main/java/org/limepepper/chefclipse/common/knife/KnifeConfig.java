/**
 */
package org.limepepper.chefclipse.common.knife;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.utility.Config;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_type <em>Cache type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_option <em>Cache option</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_path <em>Cookbook path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_copyright <em>Cookbook copyright</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_email <em>Cookbook email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_license <em>Cookbook license</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getServerCookbookVersion <em>Server Cookbook Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig()
 * @model
 * @generated
 */
public interface KnifeConfig extends Config {
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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Plugins()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<Plugin> getPlugins();

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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Cache_type()
	 * @model
	 * @generated
	 */
    String getCache_type();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_type <em>Cache type</em>}' attribute.
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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Cache_option()
	 * @model
	 * @generated
	 */
    String getCache_option();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_option <em>Cache option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache option</em>' attribute.
	 * @see #getCache_option()
	 * @generated
	 */
    void setCache_option(String value);

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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Cookbook_path()
	 * @model dataType="org.limepepper.chefclipse.utility.File" required="true"
	 * @generated
	 */
    File getCookbook_path();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_path <em>Cookbook path</em>}' attribute.
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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Cookbook_copyright()
	 * @model
	 * @generated
	 */
    String getCookbook_copyright();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_copyright <em>Cookbook copyright</em>}' attribute.
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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Cookbook_email()
	 * @model
	 * @generated
	 */
    String getCookbook_email();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_email <em>Cookbook email</em>}' attribute.
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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Cookbook_license()
	 * @model
	 * @generated
	 */
    String getCookbook_license();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_license <em>Cookbook license</em>}' attribute.
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
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Path()
	 * @model dataType="org.limepepper.chefclipse.utility.File" required="true"
	 * @generated
	 */
    File getPath();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
    void setPath(File value);

    /**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_Server()
	 * @model
	 * @generated
	 */
    Server getServer();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
    void setServer(Server value);

				/**
	 * Returns the value of the '<em><b>Server Cookbook Version</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getKnifeConfig <em>Knife Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Cookbook Version</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Cookbook Version</em>' reference list.
	 * @see org.limepepper.chefclipse.common.knife.KnifePackage#getKnifeConfig_ServerCookbookVersion()
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getKnifeConfig
	 * @model opposite="knifeConfig"
	 * @generated
	 */
	EList<ServerCookbookVersion> getServerCookbookVersion();

} // KnifeConfig
