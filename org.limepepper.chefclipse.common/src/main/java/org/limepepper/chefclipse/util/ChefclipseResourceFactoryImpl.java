/**
 */
package org.limepepper.chefclipse.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.util.ChefclipseResourceImpl
 * @generated
 */
public class ChefclipseResourceFactoryImpl extends ResourceFactoryImpl {
    /**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefclipseResourceFactoryImpl() {
		super();
	}

    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Resource createResource(URI uri) {
		Resource result = new ChefclipseResourceImpl(uri);
		return result;
	}

} //ChefclipseResourceFactoryImpl
