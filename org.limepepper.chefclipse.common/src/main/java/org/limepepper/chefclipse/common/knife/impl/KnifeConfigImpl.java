/**
 */
package org.limepepper.chefclipse.common.knife.impl;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.chefserver.Server;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.Plugin;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.utility.impl.ConfigImpl;
=======
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.Plugin;
import org.limepepper.chefclipse.impl.ConfigImpl;
>>>>>>> origin/tomhodder

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
<<<<<<< HEAD
		return (EList<Plugin>) eGet(
				KnifePackage.Literals.KNIFE_CONFIG__PLUGINS, true);
=======
		return (EList<Plugin>)eGet(KnifePackage.Literals.KNIFE_CONFIG__PLUGINS, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCache_type() {
<<<<<<< HEAD
		return (String) eGet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_TYPE,
				true);
=======
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_TYPE, true);
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		return (String) eGet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_OPTION,
				true);
=======
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__CACHE_OPTION, true);
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		return (File) eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH,
				true);
=======
		return (File)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook_path(File newCookbook_path) {
<<<<<<< HEAD
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH,
				newCookbook_path);
=======
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH, newCookbook_path);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCookbook_copyright() {
<<<<<<< HEAD
		return (String) eGet(
				KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT, true);
=======
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook_copyright(String newCookbook_copyright) {
<<<<<<< HEAD
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT,
				newCookbook_copyright);
=======
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT, newCookbook_copyright);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCookbook_email() {
<<<<<<< HEAD
		return (String) eGet(
				KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL, true);
=======
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook_email(String newCookbook_email) {
<<<<<<< HEAD
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL,
				newCookbook_email);
=======
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL, newCookbook_email);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCookbook_license() {
<<<<<<< HEAD
		return (String) eGet(
				KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE, true);
=======
		return (String)eGet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook_license(String newCookbook_license) {
<<<<<<< HEAD
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE,
				newCookbook_license);
=======
		eSet(KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE, newCookbook_license);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getPath() {
<<<<<<< HEAD
		return (File) eGet(KnifePackage.Literals.KNIFE_CONFIG__PATH, true);
=======
		return (File)eGet(KnifePackage.Literals.KNIFE_CONFIG__PATH, true);
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		return (Server) eGet(KnifePackage.Literals.KNIFE_CONFIG__SERVER, true);
=======
		return (Server)eGet(KnifePackage.Literals.KNIFE_CONFIG__SERVER, true);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__SERVER, newServer);
	}
<<<<<<< HEAD

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServerCookbookVersion> getServerCookbookVersion() {
		return (EList<ServerCookbookVersion>) eGet(
				KnifePackage.Literals.KNIFE_CONFIG__SERVER_COOKBOOK_VERSION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		return (Repository) eGet(
				KnifePackage.Literals.KNIFE_CONFIG__REPOSITORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		eSet(KnifePackage.Literals.KNIFE_CONFIG__REPOSITORY, newRepository);
	}
=======
>>>>>>> origin/tomhodder

} //KnifeConfigImpl
