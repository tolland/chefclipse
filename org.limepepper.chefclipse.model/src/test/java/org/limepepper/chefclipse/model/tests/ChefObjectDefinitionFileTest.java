/**
 */
package org.limepepper.chefclipse.model.tests;

import junit.textui.TestRunner;

import org.limepepper.chefclipse.model.ChefObjectDefinitionFile;
import org.limepepper.chefclipse.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chef Object Definition File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefObjectDefinitionFileTest extends ChefFileTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ChefObjectDefinitionFileTest.class);
    }

    /**
     * Constructs a new Chef Object Definition File test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefObjectDefinitionFileTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Chef Object Definition File test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ChefObjectDefinitionFile getFixture() {
        return (ChefObjectDefinitionFile)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ModelFactory.eINSTANCE.createChefObjectDefinitionFile());
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

} //ChefObjectDefinitionFileTest
