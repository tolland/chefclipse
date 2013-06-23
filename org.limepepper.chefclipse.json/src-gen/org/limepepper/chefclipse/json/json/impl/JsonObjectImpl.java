/**
 */
package org.limepepper.chefclipse.json.json.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.limepepper.chefclipse.json.json.JsonObject;
import org.limepepper.chefclipse.json.json.JsonPackage;
import org.limepepper.chefclipse.json.json.Pair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.json.json.impl.JsonObjectImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonObjectImpl extends MinimalEObjectImpl.Container implements
		JsonObject {
	/**
	 * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair> pairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonPackage.Literals.JSON_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pair> getPairs() {
		if (pairs == null) {
			pairs = new EObjectContainmentEList<Pair>(Pair.class, this,
					JsonPackage.JSON_OBJECT__PAIRS);
		}
		return pairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonPackage.JSON_OBJECT__PAIRS:
			return ((InternalEList<?>) getPairs()).basicRemove(otherEnd, msgs);
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
		case JsonPackage.JSON_OBJECT__PAIRS:
			return getPairs();
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
		case JsonPackage.JSON_OBJECT__PAIRS:
			getPairs().clear();
			getPairs().addAll((Collection<? extends Pair>) newValue);
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
		case JsonPackage.JSON_OBJECT__PAIRS:
			getPairs().clear();
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
		case JsonPackage.JSON_OBJECT__PAIRS:
			return pairs != null && !pairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String eURIFragmentSegment(EStructuralFeature eStructuralFeature,
			EObject eObject) {
		if (eStructuralFeature.isMany() && eObject instanceof Pair) {
			EList<EAttribute> eKeys = ((EReference) eStructuralFeature)
					.getEKeys();
			if (eKeys.isEmpty()) {
				StringBuilder result = new StringBuilder();
				result.append('@');
				result.append(eStructuralFeature.getName());

				result.append('.');
				result.append(((Pair) eObject).getString());

				return result.toString();
			}
		}
		return super.eURIFragmentSegment(eStructuralFeature, eObject);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EObject eObjectForURIFragmentSegment(String uriFragmentSegment) {
		if (uriFragmentSegment.startsWith("@pairs")) {
			int dotIndex = uriFragmentSegment.lastIndexOf('.');
			if (dotIndex >= 0) {
				EList<Pair> eList = getPairs();
				String pairName = uriFragmentSegment.substring(dotIndex + 1);
				for (Pair pair : eList) {
					if (pair.getString().equals(pairName)) {
						return pair;
					}
				}
			}
			return null;
		}
		return super.eObjectForURIFragmentSegment(uriFragmentSegment);
	}

} //JsonObjectImpl
