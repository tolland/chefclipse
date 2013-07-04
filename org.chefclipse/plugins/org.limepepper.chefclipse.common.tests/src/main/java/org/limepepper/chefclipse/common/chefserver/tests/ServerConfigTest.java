/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ServerConfig;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerConfigTest extends TestCase {

	/**
	 * The fixture for this Server Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerConfigTest.class);
	}

	/**
	 * Constructs a new Server Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Server Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServerConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Server Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerConfig getFixture() {
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
		setFixture(ChefserverFactory.eINSTANCE.createServerConfig());
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

} //ServerConfigTest
