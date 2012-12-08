/**
 */
package org.limepepper.chefclipse.common.knife.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.common.knife.KnifeSearch;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifeSearchTest extends TestCase {

    /**
	 * The fixture for this Search test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KnifeSearch fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(KnifeSearchTest.class);
	}

    /**
	 * Constructs a new Search test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnifeSearchTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Search test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(KnifeSearch fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Search test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KnifeSearch getFixture() {
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
		setFixture(KnifeFactory.eINSTANCE.createKnifeSearch());
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

} //KnifeSearchTest
