/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.Role;

import org.limepepper.chefclipse.tests.DescribedObjectTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleTest extends DescribedObjectTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(RoleTest.class);
	}

    /**
	 * Constructs a new Role test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RoleTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Role test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected Role getFixture() {
		return (Role)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(ChefserverFactory.eINSTANCE.createRole());
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

} //RoleTest
