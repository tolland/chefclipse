/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.impl.CookbookVersionImpl;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Cookbook Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getCookbook_name <em>Cookbook name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getKnifeConfig <em>Knife Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerCookbookVersionImpl extends CookbookVersionImpl implements
		ServerCookbookVersion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerCookbookVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String) eGet(
				ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__VERSION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__VERSION,
				newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCookbook_name() {
		return (String) eGet(
				ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__COOKBOOK_NAME,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook_name(String newCookbook_name) {
		eSet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__COOKBOOK_NAME,
				newCookbook_name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeConfig getKnifeConfig() {
		return (KnifeConfig) eGet(
				ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__KNIFE_CONFIG,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnifeConfig(KnifeConfig newKnifeConfig) {
		eSet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__KNIFE_CONFIG,
				newKnifeConfig);
	}

} //ServerCookbookVersionImpl
