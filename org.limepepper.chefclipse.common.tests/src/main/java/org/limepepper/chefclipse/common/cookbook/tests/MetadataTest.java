/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Metadata;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.tests.RubyFileTest;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataTest extends CookbookFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetadataTest.class);
	}

	/**
	 * Constructs a new Metadata test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Metadata test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Metadata getFixture() {
<<<<<<< HEAD
		return (Metadata) fixture;
=======
		return (Metadata)fixture;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CookbookFactory.eINSTANCE.createMetadata());
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

} //MetadataTest
