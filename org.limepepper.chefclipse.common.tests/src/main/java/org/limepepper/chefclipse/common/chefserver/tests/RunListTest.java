/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.RunList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Run List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunListTest extends TestCase {

    /**
     * The fixture for this Run List test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RunList fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RunListTest.class);
    }

    /**
     * Constructs a new Run List test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RunListTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Run List test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(RunList fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Run List test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RunList getFixture() {
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
        setFixture(ChefserverFactory.eINSTANCE.createRunList());
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

} //RunListTest
