/**
 */
package org.limepepper.chefclipse.knife;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.knife.KnifeConfig#getPluginsList <em>Plugins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifeConfig()
 * @model kind="class"
 * @generated
 */
public class KnifeConfig extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getPluginsList() <em>Plugins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginsList()
	 * @generated
	 * @ordered
	 */
	protected EList<KnifePlugin> plugins;

	/**
	 * The empty value for the '{@link #getPlugins() <em>Plugins</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected static final KnifePlugin[] PLUGINS_EEMPTY_ARRAY = new KnifePlugin [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnifeConfig() {
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
	public KnifePlugin[] getPlugins() {
		if (plugins == null || plugins.isEmpty()) return PLUGINS_EEMPTY_ARRAY;
		BasicEList<KnifePlugin> list = (BasicEList<KnifePlugin>)plugins;
		list.shrink();
		return (KnifePlugin[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifePlugin getPlugins(int index) {
		return getPluginsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPluginsLength() {
		return plugins == null ? 0 : plugins.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugins(KnifePlugin[] newPlugins) {
		((BasicEList<KnifePlugin>)getPluginsList()).setData(newPlugins.length, newPlugins);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugins(int index, KnifePlugin element) {
		getPluginsList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.knife.KnifePlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see org.limepepper.chefclipse.knife.KnifePackage#getKnifeConfig_Plugins()
	 * @model containment="true"
	 * @generated
	 */
	public EList<KnifePlugin> getPluginsList() {
		if (plugins == null) {
			plugins = new EObjectContainmentEList<KnifePlugin>(KnifePlugin.class, this, KnifePackage.KNIFE_CONFIG__PLUGINS);
		}
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KnifePackage.KNIFE_CONFIG__PLUGINS:
				return ((InternalEList<?>)getPluginsList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KnifePackage.KNIFE_CONFIG__PLUGINS:
				return getPluginsList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KnifePackage.KNIFE_CONFIG__PLUGINS:
				getPluginsList().clear();
				getPluginsList().addAll((Collection<? extends KnifePlugin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KnifePackage.KNIFE_CONFIG__PLUGINS:
				getPluginsList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KnifePackage.KNIFE_CONFIG__PLUGINS:
				return plugins != null && !plugins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // KnifeConfig
