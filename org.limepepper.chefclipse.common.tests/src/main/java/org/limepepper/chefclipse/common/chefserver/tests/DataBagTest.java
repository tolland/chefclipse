/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.DataBag;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Bag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataBagTest extends TestCase {

	/**
	 * The fixture for this Data Bag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBag fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataBagTest.class);
	}

	/**
	 * Constructs a new Data Bag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBagTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Bag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataBag fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Bag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBag getFixture() {
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
		setFixture(ChefserverFactory.eINSTANCE.createDataBag());
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

} //DataBagTest
