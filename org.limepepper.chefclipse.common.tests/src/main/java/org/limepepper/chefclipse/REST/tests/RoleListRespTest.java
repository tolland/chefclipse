/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.RoleListResp;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role List Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleListRespTest extends TestCase {

	/**
	 * The fixture for this Role List Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleListResp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleListRespTest.class);
	}

	/**
	 * Constructs a new Role List Resp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleListRespTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Role List Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoleListResp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Role List Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleListResp getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createRoleListResp());
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

} //RoleListRespTest
