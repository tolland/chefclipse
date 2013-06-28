/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.RecipeDescription;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.tests.DescribedObjectTest;
=======
import org.limepepper.chefclipse.tests.DescribedObjectTest;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recipe Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecipeDescriptionTest extends DescribedObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecipeDescriptionTest.class);
	}

	/**
	 * Constructs a new Recipe Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecipeDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Recipe Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecipeDescription getFixture() {
<<<<<<< HEAD
		return (RecipeDescription) fixture;
=======
		return (RecipeDescription)fixture;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CookbookFactory.eINSTANCE.createRecipeDescription());
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

} //RecipeDescriptionTest
