/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.tests.CookbookTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Cookbook Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerCookbookVersionTest extends CookbookTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(ServerCookbookVersionTest.class);
	}

    /**
	 * Constructs a new Server Cookbook Version test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServerCookbookVersionTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Server Cookbook Version test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected ServerCookbookVersion getFixture() {
		return (ServerCookbookVersion)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(ChefserverFactory.eINSTANCE.createServerCookbookVersion());
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

} //ServerCookbookVersionTest
