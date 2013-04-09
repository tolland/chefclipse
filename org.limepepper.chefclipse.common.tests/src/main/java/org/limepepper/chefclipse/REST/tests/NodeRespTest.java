/**
 */
package org.limepepper.chefclipse.REST.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.REST.NodeResp;
import org.limepepper.chefclipse.REST.RESTFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Resp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeRespTest extends TestCase {

	/**
	 * The fixture for this Node Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResp fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeRespTest.class);
	}

	/**
	 * Constructs a new Node Resp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeRespTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Node Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NodeResp fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Node Resp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResp getFixture() {
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
		setFixture(RESTFactory.eINSTANCE.createNodeResp());
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

} //NodeRespTest
