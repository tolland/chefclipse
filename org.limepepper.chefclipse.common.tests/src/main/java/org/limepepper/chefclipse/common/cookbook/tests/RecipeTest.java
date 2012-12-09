/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Recipe;

import org.limepepper.chefclipse.tests.SandboxedObjectTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeTest extends SandboxedObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RecipeTest.class);
    }

    /**
     * Constructs a new Recipe test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecipeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Recipe test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Recipe getFixture() {
        return (Recipe)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(CookbookFactory.eINSTANCE.createRecipe());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //RecipeTest
