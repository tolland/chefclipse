/**
 */
package org.limepepper.chefclipse.REST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.REST.CookbookRecipe;
import org.limepepper.chefclipse.REST.RESTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.impl.CookbookRecipeImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookRecipeImpl extends EObjectImpl implements CookbookRecipe {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookRecipeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RESTPackage.Literals.COOKBOOK_RECIPE;
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
    public String getPath() {
        return (String)eGet(RESTPackage.Literals.COOKBOOK_RECIPE__PATH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath) {
        eSet(RESTPackage.Literals.COOKBOOK_RECIPE__PATH, newPath);
    }

} //CookbookRecipeImpl
