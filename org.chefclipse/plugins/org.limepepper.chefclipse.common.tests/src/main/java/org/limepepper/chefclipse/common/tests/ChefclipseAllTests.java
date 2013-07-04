/**
 */
package org.limepepper.chefclipse.common.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.chefserver.tests.ChefserverTests;
import org.limepepper.chefclipse.common.cookbook.tests.CookbookTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Chefclipse</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefclipseAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ChefclipseAllTests("Chefclipse Tests");
		suite.addTest(ChefserverTests.suite());
		suite.addTest(CookbookTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefclipseAllTests(String name) {
		super(name);
	}

} //ChefclipseAllTests
