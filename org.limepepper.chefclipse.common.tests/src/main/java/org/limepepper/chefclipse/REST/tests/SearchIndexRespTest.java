/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.SearchIndexResp;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search Index Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchIndexRespTest extends TestCase {

	/**
	 * The fixture for this Search Index Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchIndexResp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SearchIndexRespTest.class);
	}

	/**
	 * Constructs a new Search Index Resp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchIndexRespTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Search Index Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SearchIndexResp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Search Index Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchIndexResp getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createSearchIndexResp());
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

} //SearchIndexRespTest
