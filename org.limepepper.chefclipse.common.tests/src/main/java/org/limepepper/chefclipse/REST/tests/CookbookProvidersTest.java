/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.CookbookProviders;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbook Providers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookProvidersTest extends TestCase {

    /**
	 * The fixture for this Cookbook Providers test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookProviders fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CookbookProvidersTest.class);
	}

    /**
	 * Constructs a new Cookbook Providers test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookProvidersTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Cookbook Providers test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CookbookProviders fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Cookbook Providers test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookProviders getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createCookbookProviders());
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

} //CookbookProvidersTest
