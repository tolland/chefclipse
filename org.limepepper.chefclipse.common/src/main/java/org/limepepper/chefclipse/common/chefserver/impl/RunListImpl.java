/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;

import org.limepepper.chefclipse.common.cookbook.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RunListImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RunListImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RunListImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.RunListImpl#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunListImpl extends EObjectImpl implements RunList {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RunListImpl() {
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
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getNode() {
        return (Node)eGet(ChefserverPackage.Literals.RUN_LIST__NODE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode(Node newNode) {
        eSet(ChefserverPackage.Literals.RUN_LIST__NODE, newNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Environment getEnvironment() {
        return (Environment)eGet(ChefserverPackage.Literals.RUN_LIST__ENVIRONMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnvironment(Environment newEnvironment) {
        eSet(ChefserverPackage.Literals.RUN_LIST__ENVIRONMENT, newEnvironment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role getRole() {
        return (Role)eGet(ChefserverPackage.Literals.RUN_LIST__ROLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(Role newRole) {
        eSet(ChefserverPackage.Literals.RUN_LIST__ROLE, newRole);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Recipe> getRecipes() {
        return (EList<Recipe>)eGet(ChefserverPackage.Literals.RUN_LIST__RECIPES, true);
    }

} //RunListImpl
