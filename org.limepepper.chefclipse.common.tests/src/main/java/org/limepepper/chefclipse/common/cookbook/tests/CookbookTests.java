/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cookbook</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookTests extends TestSuite {

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
		TestSuite suite = new CookbookTests("cookbook Tests");
		suite.addTestSuite(DefinitionTest.class);
		suite.addTestSuite(LibraryTest.class);
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(RecipeTest.class);
		suite.addTestSuite(ResourceTest.class);
		suite.addTestSuite(TemplateTest.class);
		suite.addTestSuite(AttributesTest.class);
		suite.addTestSuite(FileTest.class);
		suite.addTestSuite(MetadataTest.class);
		suite.addTestSuite(ProviderTest.class);
		suite.addTestSuite(Root_fileTest.class);
		suite.addTestSuite(MinimalMetadataTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookTests(String name) {
		super(name);
	}

} //CookbookTests
