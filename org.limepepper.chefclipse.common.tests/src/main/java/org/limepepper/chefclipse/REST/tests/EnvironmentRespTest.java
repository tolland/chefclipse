/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.EnvironmentResp;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environment Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentRespTest extends JSONObjectRespTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(EnvironmentRespTest.class);
	}

    /**
	 * Constructs a new Environment Resp test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EnvironmentRespTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Environment Resp test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EnvironmentResp getFixture() {
		return (EnvironmentResp)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(RESTFactory.eINSTANCE.createEnvironmentResp());
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

} //EnvironmentRespTest
