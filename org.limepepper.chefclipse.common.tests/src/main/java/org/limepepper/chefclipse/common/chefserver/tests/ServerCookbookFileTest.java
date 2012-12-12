/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;

import org.limepepper.chefclipse.tests.NamedObjectTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Cookbook File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerCookbookFileTest extends NamedObjectTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ServerCookbookFileTest.class);
    }

    /**
     * Constructs a new Server Cookbook File test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServerCookbookFileTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Server Cookbook File test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ServerCookbookFile getFixture() {
        return (ServerCookbookFile)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ChefserverFactory.eINSTANCE.createServerCookbookFile());
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

} //ServerCookbookFileTest
