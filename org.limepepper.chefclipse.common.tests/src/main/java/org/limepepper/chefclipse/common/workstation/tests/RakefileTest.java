/**
 */
package org.limepepper.chefclipse.common.workstation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.workstation.Rakefile;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rakefile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RakefileTest extends TestCase {

    /**
	 * The fixture for this Rakefile test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Rakefile fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(RakefileTest.class);
	}

    /**
	 * Constructs a new Rakefile test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RakefileTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Rakefile test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(Rakefile fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Rakefile test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Rakefile getFixture() {
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
		setFixture(WorkstationFactory.eINSTANCE.createRakefile());
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

} //RakefileTest
