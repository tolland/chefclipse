/**
 */
package org.limepepper.chefclipse.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Checksum File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChecksumFileTest extends TestCase {

    /**
	 * The fixture for this Checksum File test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ChecksumFile fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(ChecksumFileTest.class);
	}

    /**
	 * Constructs a new Checksum File test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChecksumFileTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Checksum File test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(ChecksumFile fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Checksum File test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ChecksumFile getFixture() {
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
		setFixture(ChefclipseFactory.eINSTANCE.createChecksumFile());
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

} //ChecksumFileTest
