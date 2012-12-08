/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbook List Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookListRespTest extends TestCase {

    /**
	 * The fixture for this Cookbook List Resp test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookListResp fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CookbookListRespTest.class);
	}

    /**
	 * Constructs a new Cookbook List Resp test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookListRespTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Cookbook List Resp test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CookbookListResp fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Cookbook List Resp test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookListResp getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createCookbookListResp());
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

} //CookbookListRespTest
