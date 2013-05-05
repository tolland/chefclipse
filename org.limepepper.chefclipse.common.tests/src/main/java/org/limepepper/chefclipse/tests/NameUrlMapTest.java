/**
 */
package org.limepepper.chefclipse.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.ChefclipseFactory;
import org.limepepper.chefclipse.NameUrlMap;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Name Url Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NameUrlMapTest extends TestCase {

    /**
	 * The fixture for this Name Url Map test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected NameUrlMap fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(NameUrlMapTest.class);
	}

    /**
	 * Constructs a new Name Url Map test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NameUrlMapTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Name Url Map test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(NameUrlMap fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Name Url Map test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected NameUrlMap getFixture() {
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
		setFixture(ChefclipseFactory.eINSTANCE.createNameUrlMap());
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

} //NameUrlMapTest
