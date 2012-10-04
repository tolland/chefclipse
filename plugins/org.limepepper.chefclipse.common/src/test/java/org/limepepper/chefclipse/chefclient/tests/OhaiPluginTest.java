/**
 */
package org.limepepper.chefclipse.chefclient.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.chefclient.ChefClientFactory;
import org.limepepper.chefclipse.chefclient.OhaiPlugin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ohai Plugin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OhaiPluginTest extends TestCase {

	/**
	 * The fixture for this Ohai Plugin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OhaiPlugin fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OhaiPluginTest.class);
	}

	/**
	 * Constructs a new Ohai Plugin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OhaiPluginTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ohai Plugin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OhaiPlugin fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ohai Plugin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OhaiPlugin getFixture() {
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
		setFixture(ChefClientFactory.eINSTANCE.createOhaiPlugin());
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

} //OhaiPluginTest
