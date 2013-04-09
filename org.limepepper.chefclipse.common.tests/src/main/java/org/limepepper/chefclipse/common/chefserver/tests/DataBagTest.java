/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.tests.DescribedObjectTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Bag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataBagTest extends DescribedObjectTest {

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
	 * Returns the fixture for this Data Bag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    protected DataBag getFixture() {
		return (DataBag)fixture;
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
