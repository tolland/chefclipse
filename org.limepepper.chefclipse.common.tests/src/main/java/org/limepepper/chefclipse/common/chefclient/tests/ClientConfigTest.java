/**
 */
package org.limepepper.chefclipse.common.chefclient.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;
import org.limepepper.chefclipse.common.chefclient.ClientConfig;

import org.limepepper.chefclipse.tests.ConfigTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Client Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientConfigTest extends ConfigTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClientConfigTest.class);
	}

	/**
	 * Constructs a new Client Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientConfigTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Client Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClientConfig getFixture() {
		return (ClientConfig)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ChefclientFactory.eINSTANCE.createClientConfig());
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

} //ClientConfigTest
