/**
 */
package org.limepepper.chefclipse.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.URLEntryTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Entry Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.URLEntryTestImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLEntryTestImpl extends EObjectImpl implements URLEntryTest {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public URLEntryTestImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ChefclipsePackage.Literals.URL_ENTRY_TEST;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected int eStaticFeatureCount() {
		return 0;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getUrl() {
		return (String)eGet(ChefclipsePackage.Literals.URL_ENTRY_TEST__URL, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUrl(String newUrl) {
		eSet(ChefclipsePackage.Literals.URL_ENTRY_TEST__URL, newUrl);
	}

} //URLEntryTestImpl
