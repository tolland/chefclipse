/**
 */
package org.limepepper.chefclipse.knife.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.knife.KnifeConfig;
import org.limepepper.chefclipse.knife.KnifeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifeConfigTest extends TestCase {

	/**
	 * The fixture for this Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnifeConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KnifeConfigTest.class);
	}

	/**
	 * Constructs a new Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KnifeConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnifeConfig getFixture() {
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
		setFixture(KnifeFactory.eINSTANCE.createKnifeConfig());
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

} //KnifeConfigTest
