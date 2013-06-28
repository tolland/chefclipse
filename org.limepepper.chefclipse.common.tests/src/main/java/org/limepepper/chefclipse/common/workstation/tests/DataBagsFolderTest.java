/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.DataBagsFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Bags Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataBagsFolderTest extends WorkstationFolderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataBagsFolderTest.class);
	}

	/**
	 * Constructs a new Data Bags Folder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBagsFolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Bags Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataBagsFolder getFixture() {
<<<<<<< HEAD
		return (DataBagsFolder) fixture;
=======
		return (DataBagsFolder)fixture;
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
		setFixture(WorkstationFactory.eINSTANCE.createDataBagsFolder());
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

} //DataBagsFolderTest
