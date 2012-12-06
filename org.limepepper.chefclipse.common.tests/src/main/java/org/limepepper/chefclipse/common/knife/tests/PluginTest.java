/**
 */
package org.limepepper.chefclipse.common.knife.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.common.knife.Plugin;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PluginTest extends TestCase {

    /**
     * The fixture for this Plugin test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Plugin fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PluginTest.class);
    }

    /**
     * Constructs a new Plugin test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PluginTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Plugin test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Plugin fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Plugin test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Plugin getFixture() {
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
        setFixture(KnifeFactory.eINSTANCE.createPlugin());
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

} //PluginTest
