/**
 */
package org.limepepper.chefclipse.common.chefserver.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.chefserver.util.ChefserverResourceImpl
 * @generated
 */
public class ChefserverResourceFactoryImpl extends ResourceFactoryImpl {
    /**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefserverResourceFactoryImpl() {
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
		Resource result = new ChefserverResourceImpl(uri);
		return result;
	}

} //ChefserverResourceFactoryImpl
