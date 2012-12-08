/**
 */
package org.limepepper.chefclipse.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.ChefclipseFactory;
import org.limepepper.chefclipse.DescribedObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Described Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescribedObjectTest extends TestCase {

    /**
	 * The fixture for this Described Object test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DescribedObject fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(DescribedObjectTest.class);
	}

    /**
	 * Constructs a new Described Object test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DescribedObjectTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Described Object test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(DescribedObject fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Described Object test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DescribedObject getFixture() {
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
		setFixture(ChefclipseFactory.eINSTANCE.createDescribedObject());
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

} //DescribedObjectTest
