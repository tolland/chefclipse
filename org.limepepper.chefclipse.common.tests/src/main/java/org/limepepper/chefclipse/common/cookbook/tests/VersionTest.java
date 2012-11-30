/**
 */
package org.limepepper.chefclipse.common.cookbook.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Version;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersionTest extends TestCase {

    /**
     * The fixture for this Version test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Version fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(VersionTest.class);
    }

    /**
     * Constructs a new Version test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VersionTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Version test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Version fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Version test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Version getFixture() {
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
        setFixture(CookbookFactory.eINSTANCE.createVersion());
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

} //VersionTest
