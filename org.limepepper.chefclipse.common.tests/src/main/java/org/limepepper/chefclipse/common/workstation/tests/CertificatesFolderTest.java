/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.CertificatesFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Certificates Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CertificatesFolderTest extends TestCase {

    /**
	 * The fixture for this Certificates Folder test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CertificatesFolder fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CertificatesFolderTest.class);
	}

    /**
	 * Constructs a new Certificates Folder test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CertificatesFolderTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Certificates Folder test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CertificatesFolder fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Certificates Folder test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CertificatesFolder getFixture() {
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
		setFixture(WorkstationFactory.eINSTANCE.createCertificatesFolder());
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

} //CertificatesFolderTest
