/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.RolesFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roles Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RolesFolderTest extends TestCase {

    /**
     * The fixture for this Roles Folder test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RolesFolder fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RolesFolderTest.class);
    }

    /**
     * Constructs a new Roles Folder test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RolesFolderTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Roles Folder test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(RolesFolder fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Roles Folder test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RolesFolder getFixture() {
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
        setFixture(WorkstationFactory.eINSTANCE.createRolesFolder());
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

} //RolesFolderTest
