/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.RoleResp;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleRespTest extends TestCase {

	/**
     * The fixture for this Role Resp test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RoleResp fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(RoleRespTest.class);
    }

	/**
     * Constructs a new Role Resp test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RoleRespTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Role Resp test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(RoleResp fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Role Resp test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RoleResp getFixture() {
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
        setFixture(RESTFactory.eINSTANCE.createRoleResp());
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

} //RoleRespTest
