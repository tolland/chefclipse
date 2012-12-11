/**
 */
package org.limepepper.chefclipse.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.ChefclipseFactory;
import org.limepepper.chefclipse.MaintainedObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maintained Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintainedObjectTest extends TestCase {

	/**
     * The fixture for this Maintained Object test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MaintainedObject fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(MaintainedObjectTest.class);
    }

	/**
     * Constructs a new Maintained Object test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MaintainedObjectTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Maintained Object test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(MaintainedObject fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Maintained Object test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MaintainedObject getFixture() {
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
        setFixture(ChefclipseFactory.eINSTANCE.createMaintainedObject());
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

} //MaintainedObjectTest
