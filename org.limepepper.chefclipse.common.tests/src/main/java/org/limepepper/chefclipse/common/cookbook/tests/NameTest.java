/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Name;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NameTest extends TestCase {

    /**
     * The fixture for this Name test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Name fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(NameTest.class);
    }

    /**
     * Constructs a new Name test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Name test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Name fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Name test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Name getFixture() {
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
        setFixture(CookbookFactory.eINSTANCE.createName());
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

} //NameTest
