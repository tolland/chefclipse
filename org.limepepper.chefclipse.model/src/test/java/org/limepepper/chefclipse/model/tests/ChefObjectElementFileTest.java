/**
 */
package org.limepepper.chefclipse.model.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.model.ChefObjectElementFile;
import org.limepepper.chefclipse.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chef Object Element File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefObjectElementFileTest extends ChefFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChefObjectElementFileTest.class);
	}

	/**
	 * Constructs a new Chef Object Element File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefObjectElementFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Chef Object Element File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChefObjectElementFile getFixture() {
		return (ChefObjectElementFile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createChefObjectElementFile());
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

} //ChefObjectElementFileTest
