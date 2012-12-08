/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.Sandbox;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sandbox</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SandboxTest extends TestCase {

    /**
	 * The fixture for this Sandbox test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Sandbox fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(SandboxTest.class);
	}

    /**
	 * Constructs a new Sandbox test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SandboxTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Sandbox test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(Sandbox fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Sandbox test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Sandbox getFixture() {
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
		setFixture(ChefserverFactory.eINSTANCE.createSandbox());
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

} //SandboxTest
