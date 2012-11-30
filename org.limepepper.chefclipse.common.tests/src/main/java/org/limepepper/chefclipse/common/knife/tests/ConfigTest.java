/**
 */
package org.limepepper.chefclipse.common.knife.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.knife.Config;
import org.limepepper.chefclipse.common.knife.KnifeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigTest extends TestCase {

    /**
     * The fixture for this Config test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Config fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ConfigTest.class);
    }

    /**
     * Constructs a new Config test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Config test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Config fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Config test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Config getFixture() {
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
        setFixture(KnifeFactory.eINSTANCE.createConfig());
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

} //ConfigTest
