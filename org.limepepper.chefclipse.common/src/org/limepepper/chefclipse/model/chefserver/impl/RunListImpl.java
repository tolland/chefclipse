/**
 */
package org.limepepper.chefclipse.model.chefserver.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.limepepper.chefclipse.model.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.model.chefserver.Environment;
import org.limepepper.chefclipse.model.chefserver.Node;
import org.limepepper.chefclipse.model.chefserver.Role;
import org.limepepper.chefclipse.model.chefserver.RunList;

import org.limepepper.chefclipse.model.cookbook.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.RunListImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.RunListImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.RunListImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.RunListImpl#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunListImpl extends EObjectImpl implements RunList {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipes()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe> recipes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.RUN_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (Node)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefserverPackage.RUN_LIST__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefserverPackage.RUN_LIST__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefserverPackage.RUN_LIST__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefserverPackage.RUN_LIST__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefserverPackage.RUN_LIST__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefserverPackage.RUN_LIST__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recipe> getRecipes() {
		if (recipes == null) {
			recipes = new EObjectResolvingEList<Recipe>(Recipe.class, this, ChefserverPackage.RUN_LIST__RECIPES);
		}
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChefserverPackage.RUN_LIST__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case ChefserverPackage.RUN_LIST__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case ChefserverPackage.RUN_LIST__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case ChefserverPackage.RUN_LIST__RECIPES:
				return getRecipes();
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
			case ChefserverPackage.RUN_LIST__NODE:
				setNode((Node)newValue);
				return;
			case ChefserverPackage.RUN_LIST__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ChefserverPackage.RUN_LIST__ROLE:
				setRole((Role)newValue);
				return;
			case ChefserverPackage.RUN_LIST__RECIPES:
				getRecipes().clear();
				getRecipes().addAll((Collection<? extends Recipe>)newValue);
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
			case ChefserverPackage.RUN_LIST__NODE:
				setNode((Node)null);
				return;
			case ChefserverPackage.RUN_LIST__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ChefserverPackage.RUN_LIST__ROLE:
				setRole((Role)null);
				return;
			case ChefserverPackage.RUN_LIST__RECIPES:
				getRecipes().clear();
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
			case ChefserverPackage.RUN_LIST__NODE:
				return node != null;
			case ChefserverPackage.RUN_LIST__ENVIRONMENT:
				return environment != null;
			case ChefserverPackage.RUN_LIST__ROLE:
				return role != null;
			case ChefserverPackage.RUN_LIST__RECIPES:
				return recipes != null && !recipes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RunListImpl
