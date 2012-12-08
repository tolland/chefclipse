/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.CookbookMaintainer;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbook Maintainer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookMaintainerTest extends TestCase {

    /**
	 * The fixture for this Cookbook Maintainer test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookMaintainer fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CookbookMaintainerTest.class);
	}

    /**
	 * Constructs a new Cookbook Maintainer test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookMaintainerTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Cookbook Maintainer test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CookbookMaintainer fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Cookbook Maintainer test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookMaintainer getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createCookbookMaintainer());
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

} //CookbookMaintainerTest
