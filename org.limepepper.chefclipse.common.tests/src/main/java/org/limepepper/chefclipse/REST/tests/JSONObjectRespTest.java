/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.JSONObjectResp;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>JSON Object Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JSONObjectRespTest extends TestCase {

	/**
     * The fixture for this JSON Object Resp test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JSONObjectResp fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(JSONObjectRespTest.class);
    }

	/**
     * Constructs a new JSON Object Resp test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JSONObjectRespTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this JSON Object Resp test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(JSONObjectResp fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this JSON Object Resp test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected JSONObjectResp getFixture() {
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
        setFixture(RESTFactory.eINSTANCE.createJSONObjectResp());
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

} //JSONObjectRespTest
