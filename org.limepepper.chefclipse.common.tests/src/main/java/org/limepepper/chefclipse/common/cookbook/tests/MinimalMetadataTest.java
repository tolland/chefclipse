/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.MinimalMetadata;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Minimal Metadata</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinimalMetadataTest extends MetadataTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(MinimalMetadataTest.class);
    }

	/**
     * Constructs a new Minimal Metadata test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MinimalMetadataTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Minimal Metadata test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected MinimalMetadata getFixture() {
        return (MinimalMetadata)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(CookbookFactory.eINSTANCE.createMinimalMetadata());
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

} //MinimalMetadataTest
