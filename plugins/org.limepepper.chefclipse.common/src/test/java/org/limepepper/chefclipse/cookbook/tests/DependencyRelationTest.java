/**
 */
package org.limepepper.chefclipse.cookbook.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.cookbook.CookbookFactory;
import org.limepepper.chefclipse.cookbook.DependencyRelation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyRelationTest extends TestCase {

	/**
	 * The fixture for this Dependency Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyRelation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependencyRelationTest.class);
	}

	/**
	 * Constructs a new Dependency Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyRelationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dependency Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DependencyRelation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dependency Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyRelation getFixture() {
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
		setFixture(CookbookFactory.eINSTANCE.createDependencyRelation());
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

} //DependencyRelationTest
