/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Template;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateTest extends CookbookFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemplateTest.class);
	}

	/**
	 * Constructs a new Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Template getFixture() {
		return (Template) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CookbookFactory.eINSTANCE.createTemplate());
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

} //TemplateTest