/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.CookbooksFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbooks Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbooksFolderTest extends WorkstationFolderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CookbooksFolderTest.class);
	}

	/**
	 * Constructs a new Cookbooks Folder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbooksFolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cookbooks Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CookbooksFolder getFixture() {
		return (CookbooksFolder) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WorkstationFactory.eINSTANCE.createCookbooksFolder());
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

} //CookbooksFolderTest
