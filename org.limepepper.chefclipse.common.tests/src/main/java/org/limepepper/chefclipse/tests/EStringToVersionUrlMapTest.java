/**
 */
package org.limepepper.chefclipse.tests;

import java.util.Map;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.limepepper.chefclipse.ChefclipseFactory;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.VersionUrl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EString To Version Url Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EStringToVersionUrlMapTest extends TestCase {

    /**
	 * The fixture for this EString To Version Url Map test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Map.Entry<String, VersionUrl> fixture = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(EStringToVersionUrlMapTest.class);
	}

    /**
	 * Constructs a new EString To Version Url Map test case with the given name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EStringToVersionUrlMapTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this EString To Version Url Map test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(Map.Entry<String, VersionUrl> fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this EString To Version Url Map test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Map.Entry<String, VersionUrl> getFixture() {
		return fixture;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
    @Override
    @SuppressWarnings("unchecked")
    protected void setUp() throws Exception {
		setFixture((Map.Entry<String, VersionUrl>)ChefclipseFactory.eINSTANCE.create(ChefclipsePackage.Literals.ESTRING_TO_VERSION_URL_MAP));
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

} //EStringToVersionUrlMapTest
