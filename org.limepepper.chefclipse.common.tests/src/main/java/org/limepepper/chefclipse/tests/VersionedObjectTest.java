/**
 */
package org.limepepper.chefclipse.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.ChefclipseFactory;
import org.limepepper.chefclipse.VersionedObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Versioned Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersionedObjectTest extends TestCase {

    /**
     * The fixture for this Versioned Object test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VersionedObject fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(VersionedObjectTest.class);
    }

    /**
     * Constructs a new Versioned Object test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VersionedObjectTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Versioned Object test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(VersionedObject fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Versioned Object test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VersionedObject getFixture() {
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
        setFixture(ChefclipseFactory.eINSTANCE.createVersionedObject());
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

} //VersionedObjectTest
