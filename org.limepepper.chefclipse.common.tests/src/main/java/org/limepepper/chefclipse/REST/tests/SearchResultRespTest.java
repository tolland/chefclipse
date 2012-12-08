/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.SearchResultResp;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search Result Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchResultRespTest extends TestCase {

	/**
	 * The fixture for this Search Result Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchResultResp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SearchResultRespTest.class);
	}

	/**
	 * Constructs a new Search Result Resp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResultRespTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Search Result Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SearchResultResp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Search Result Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchResultResp getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createSearchResultResp());
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

} //SearchResultRespTest
