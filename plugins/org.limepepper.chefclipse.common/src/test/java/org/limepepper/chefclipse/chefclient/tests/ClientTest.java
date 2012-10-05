/**
 */
package org.limepepper.chefclipse.chefclient.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.chefclient.ChefClientFactory;
import org.limepepper.chefclipse.chefclient.Client;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientTest extends TestCase {

	/**
	 * The fixture for this Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Client fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClientTest.class);
	}

	/**
	 * Constructs a new Client test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Client fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Client getFixture() {
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
		setFixture(ChefClientFactory.eINSTANCE.createClient());
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

} //ClientTest
