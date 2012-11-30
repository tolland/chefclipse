/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.DependencyRelation;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.workstation.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.impl.CookbookImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookImpl extends EObjectImpl implements Cookbook {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CookbookPackage.Literals.COOKBOOK;
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
    public DependencyRelation getDepends() {
        return (DependencyRelation)eGet(CookbookPackage.Literals.COOKBOOK__DEPENDS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDepends(DependencyRelation newDepends) {
        eSet(CookbookPackage.Literals.COOKBOOK__DEPENDS, newDepends);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Environment getEnvironment() {
        return (Environment)eGet(CookbookPackage.Literals.COOKBOOK__ENVIRONMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnvironment(Environment newEnvironment) {
        eSet(CookbookPackage.Literals.COOKBOOK__ENVIRONMENT, newEnvironment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Recipe> getRecipes() {
        return (EList<Recipe>)eGet(CookbookPackage.Literals.COOKBOOK__RECIPES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eGet(CookbookPackage.Literals.COOKBOOK__NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eSet(CookbookPackage.Literals.COOKBOOK__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repository getRepository() {
        return (Repository)eGet(CookbookPackage.Literals.COOKBOOK__REPOSITORY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepository(Repository newRepository) {
        eSet(CookbookPackage.Literals.COOKBOOK__REPOSITORY, newRepository);
    }

} //CookbookImpl
