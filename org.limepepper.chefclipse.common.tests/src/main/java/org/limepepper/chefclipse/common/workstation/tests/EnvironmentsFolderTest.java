/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.EnvironmentsFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

import org.limepepper.chefclipse.tests.NamedObjectTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environments Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentsFolderTest extends NamedObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(EnvironmentsFolderTest.class);
    }

    /**
     * Constructs a new Environments Folder test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnvironmentsFolderTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Environments Folder test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EnvironmentsFolder getFixture() {
        return (EnvironmentsFolder)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(WorkstationFactory.eINSTANCE.createEnvironmentsFolder());
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

} //EnvironmentsFolderTest
