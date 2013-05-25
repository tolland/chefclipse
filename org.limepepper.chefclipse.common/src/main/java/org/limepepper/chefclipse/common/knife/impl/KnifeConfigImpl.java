/**
 */
package org.limepepper.chefclipse.common.knife.impl;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.Plugin;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.utility.impl.ConfigImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getCache_type <em>Cache type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getCache_option <em>Cache option</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getCookbook_path <em>Cookbook path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getCookbook_copyright <em>Cookbook copyright</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getCookbook_email <em>Cookbook email</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getCookbook_license <em>Cookbook license</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getServerCookbookVersion <em>Server Cookbook Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KnifeConfigImpl extends ConfigImpl implements KnifeConfig {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnifeConfigImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KnifePackage.Literals.KNIFE_CONFIG;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<Plugin> getPlugins() {
		return (EList<Plugin>)eGet(KnifePackage.Literals.KNIFE_CONFIG__PLUGINS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCache_type() {
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_TYPE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCache_type(String newCache_type) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_TYPE, newCache_type);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCache_option() {
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_OPTION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCache_option(String newCache_option) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_OPTION, newCache_option);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public File getCookbook_path() {
		return (File)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCookbook_path(File newCookbook_path) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH, newCookbook_path);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCookbook_copyright() {
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCookbook_copyright(String newCookbook_copyright) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT, newCookbook_copyright);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCookbook_email() {
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCookbook_email(String newCookbook_email) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL, newCookbook_email);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCookbook_license() {
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCookbook_license(String newCookbook_license) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE, newCookbook_license);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public File getPath() {
		return (File)eGet(KnifePackage.Literals.KNIFE_CONFIG__PATH, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPath(File newPath) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__PATH, newPath);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Server getServer() {
		return (Server)eGet(KnifePackage.Literals.KNIFE_CONFIG__SERVER, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServer(Server newServer) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__SERVER, newServer);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServerCookbookVersion> getServerCookbookVersion() {
		return (EList<ServerCookbookVersion>)eGet(KnifePackage.Literals.KNIFE_CONFIG__SERVER_COOKBOOK_VERSION, true);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		return (Repository)eGet(KnifePackage.Literals.KNIFE_CONFIG__REPOSITORY, true);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__REPOSITORY, newRepository);
	}

} //KnifeConfigImpl
