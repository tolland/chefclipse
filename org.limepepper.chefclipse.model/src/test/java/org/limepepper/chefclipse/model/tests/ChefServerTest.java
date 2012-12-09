/**
 */
package org.limepepper.chefclipse.model.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.model.ChefServer;
import org.limepepper.chefclipse.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chef Server</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefServerTest extends ChefObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ChefServerTest.class);
    }

    /**
     * Constructs a new Chef Server test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefServerTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Chef Server test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ChefServer getFixture() {
        return (ChefServer)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ModelFactory.eINSTANCE.createChefServer());
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

} //ChefServerTest
