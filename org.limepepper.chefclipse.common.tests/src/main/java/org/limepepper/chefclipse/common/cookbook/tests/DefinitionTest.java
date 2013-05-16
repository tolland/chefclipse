/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Definition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionTest extends CookbookFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DefinitionTest.class);
	}

	/**
	 * Constructs a new Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Definition getFixture() {
		return (Definition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CookbookFactory.eINSTANCE.createDefinition());
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

} //DefinitionTest
