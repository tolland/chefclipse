/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.ConfigFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigFolderTest extends TestCase {

	/**
     * The fixture for this Config Folder test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConfigFolder fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ConfigFolderTest.class);
    }

	/**
     * Constructs a new Config Folder test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConfigFolderTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Config Folder test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(ConfigFolder fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Config Folder test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConfigFolder getFixture() {
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
        setFixture(WorkstationFactory.eINSTANCE.createConfigFolder());
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

} //ConfigFolderTest
