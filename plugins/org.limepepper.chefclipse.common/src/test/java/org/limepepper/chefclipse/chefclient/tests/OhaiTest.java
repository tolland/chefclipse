/**
 */
package org.limepepper.chefclipse.chefclient.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.chefclient.ChefClientFactory;
import org.limepepper.chefclipse.chefclient.Ohai;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ohai</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OhaiTest extends TestCase {

	/**
	 * The fixture for this Ohai test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ohai fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OhaiTest.class);
	}

	/**
	 * Constructs a new Ohai test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OhaiTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ohai test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ohai fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ohai test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ohai getFixture() {
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
		setFixture(ChefClientFactory.eINSTANCE.createOhai());
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

} //OhaiTest
