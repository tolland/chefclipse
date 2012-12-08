/**
 */
package org.limepepper.chefclipse.common.chefserver.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

import org.limepepper.chefclipse.tests.NamedObjectTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Bag Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataBagItemTest extends NamedObjectTest {

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(DataBagItemTest.class);
	}

    /**
	 * Constructs a new Data Bag Item test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataBagItemTest(String name) {
		super(name);
	}

    /**
	 * Returns the fixture for this Data Bag Item test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected DataBagItem getFixture() {
		return (DataBagItem)fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    protected void setUp() throws Exception {
		setFixture(ChefserverFactory.eINSTANCE.createDataBagItem());
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

} //DataBagItemTest
