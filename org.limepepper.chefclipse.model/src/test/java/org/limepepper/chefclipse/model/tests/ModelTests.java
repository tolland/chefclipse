/**
 */
package org.limepepper.chefclipse.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>model</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite() {
        TestSuite suite = new ModelTests("model Tests");
        suite.addTestSuite(ChefContainerTest.class);
        suite.addTestSuite(ChefFileTest.class);
        suite.addTestSuite(ChefFolderTest.class);
        suite.addTestSuite(ChefObjectTest.class);
        suite.addTestSuite(ChefObjectDefinitionFileTest.class);
        suite.addTestSuite(ChefObjectElementFileTest.class);
        suite.addTestSuite(ChefProjectTest.class);
        suite.addTestSuite(ChefResourceTest.class);
        suite.addTestSuite(ChefWorkspaceTest.class);
        suite.addTestSuite(ChefServerTest.class);
        suite.addTestSuite(CookbookFolderTest.class);
        suite.addTestSuite(DataBagsFolderTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelTests(String name) {
        super(name);
    }

} //ModelTests
