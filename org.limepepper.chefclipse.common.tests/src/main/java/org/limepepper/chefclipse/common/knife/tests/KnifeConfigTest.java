/**
 */
package org.limepepper.chefclipse.common.knife.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.tests.ConfigTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifeConfigTest extends ConfigTest {

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
	 * Returns the fixture for this Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KnifeConfig getFixture() {
		return (KnifeConfig)fixture;
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
