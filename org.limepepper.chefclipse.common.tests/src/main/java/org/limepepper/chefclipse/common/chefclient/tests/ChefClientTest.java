/**
 */
package org.limepepper.chefclipse.common.chefclient.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chef Client</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefClientTest extends TestCase {

	/**
	 * The fixture for this Chef Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChefClient fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChefClientTest.class);
	}

	/**
	 * Constructs a new Chef Client test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefClientTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Chef Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ChefClient fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Chef Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChefClient getFixture() {
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
		setFixture(ChefclientFactory.eINSTANCE.createChefClient());
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

} //ChefClientTest
