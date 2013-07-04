/**
 */
package org.limepepper.chefclipse.common.chefclient.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;
import org.limepepper.chefclipse.common.chefclient.Search;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchTest extends TestCase {

	/**
	 * The fixture for this Search test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Search fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SearchTest.class);
	}

	/**
	 * Constructs a new Search test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Search test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Search fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Search test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Search getFixture() {
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
		setFixture(ChefclientFactory.eINSTANCE.createSearch());
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

} //SearchTest
