/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.RunListItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Run List Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunListItemTest extends TestCase {

	/**
	 * The fixture for this Run List Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunListItem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RunListItemTest.class);
	}

	/**
	 * Constructs a new Run List Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunListItemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Run List Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RunListItem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Run List Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunListItem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ChefserverFactory.eINSTANCE.createRunListItem());
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

} //RunListItemTest
