/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EClass;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.impl.IdentObjectImpl;
import org.limepepper.chefclipse.utility.impl.NamedObjectImpl;
=======
import org.limepepper.chefclipse.impl.NamedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Bag Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl#getDataBag <em>Data Bag</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl#getJsonResource <em>Json Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
<<<<<<< HEAD
public class DataBagItemImpl extends IdentObjectImpl implements DataBagItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBagItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.DATA_BAG_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag getDataBag() {
		return (DataBag) eGet(
				ChefserverPackage.Literals.DATA_BAG_ITEM__DATA_BAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBag(DataBag newDataBag) {
		eSet(ChefserverPackage.Literals.DATA_BAG_ITEM__DATA_BAG, newDataBag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource getJsonResource() {
		return (IResource) eGet(
				ChefserverPackage.Literals.DATA_BAG_ITEM__JSON_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonResource(IResource newJsonResource) {
		eSet(ChefserverPackage.Literals.DATA_BAG_ITEM__JSON_RESOURCE,
				newJsonResource);
=======
public class DataBagItemImpl extends NamedObjectImpl implements DataBagItem {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataBagItemImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ChefserverPackage.Literals.DATA_BAG_ITEM;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataBag getDataBag() {
		return (DataBag)eGet(ChefserverPackage.Literals.DATA_BAG_ITEM__DATA_BAG, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataBag(DataBag newDataBag) {
		eSet(ChefserverPackage.Literals.DATA_BAG_ITEM__DATA_BAG, newDataBag);
>>>>>>> origin/tomhodder
	}

} //DataBagItemImpl
