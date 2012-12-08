/**
 */
package org.limepepper.chefclipse.model.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.model.ChefContainer;
import org.limepepper.chefclipse.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chef Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefContainerTest extends ChefResourceTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(ChefContainerTest.class);
	}

    /**
	 * Constructs a new Chef Container test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefContainerTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Chef Container test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected ChefContainer getFixture() {
		return (ChefContainer)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createChefContainer());
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

} //ChefContainerTest
