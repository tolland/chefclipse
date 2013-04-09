/**
 */
package org.limepepper.chefclipse.model.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.model.CookbookFolder;
import org.limepepper.chefclipse.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cookbook Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookFolderTest extends ChefFolderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CookbookFolderTest.class);
	}

	/**
	 * Constructs a new Cookbook Folder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookFolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cookbook Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CookbookFolder getFixture() {
		return (CookbookFolder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createCookbookFolder());
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

} //CookbookFolderTest
