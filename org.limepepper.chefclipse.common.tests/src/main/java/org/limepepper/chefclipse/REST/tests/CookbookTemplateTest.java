/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.CookbookTemplate;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbook Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookTemplateTest extends TestCase {

    /**
	 * The fixture for this Cookbook Template test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookTemplate fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CookbookTemplateTest.class);
	}

    /**
	 * Constructs a new Cookbook Template test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookTemplateTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Cookbook Template test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CookbookTemplate fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Cookbook Template test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookTemplate getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createCookbookTemplate());
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

} //CookbookTemplateTest
