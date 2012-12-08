/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.CookbookDefinition;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbook Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookDefinitionTest extends TestCase {

    /**
	 * The fixture for this Cookbook Definition test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookDefinition fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CookbookDefinitionTest.class);
	}

    /**
	 * Constructs a new Cookbook Definition test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookDefinitionTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Cookbook Definition test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CookbookDefinition fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Cookbook Definition test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CookbookDefinition getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createCookbookDefinition());
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

} //CookbookDefinitionTest
