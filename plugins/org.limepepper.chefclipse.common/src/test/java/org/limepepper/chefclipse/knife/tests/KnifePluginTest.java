/**
 */
package org.limepepper.chefclipse.knife.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.knife.KnifeFactory;
import org.limepepper.chefclipse.knife.KnifePlugin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifePluginTest extends TestCase {

	/**
	 * The fixture for this Plugin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnifePlugin fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KnifePluginTest.class);
	}

	/**
	 * Constructs a new Plugin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifePluginTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Plugin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KnifePlugin fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Plugin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnifePlugin getFixture() {
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
		setFixture(KnifeFactory.eINSTANCE.createKnifePlugin());
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

} //KnifePluginTest
