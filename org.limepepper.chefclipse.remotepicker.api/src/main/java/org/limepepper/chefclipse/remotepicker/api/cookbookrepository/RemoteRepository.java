/**
 */
package org.limepepper.chefclipse.remotepicker.api.cookbookrepository;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getId <em>Id</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getDescription <em>Description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getRetriever <em>Retriever</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getUri <em>Uri</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getUpdatedAt <em>Updated At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository()
 * @model kind="class"
 * @generated
 */
public class RemoteRepository extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getCookbooks() <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbooks()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteCookbook> cookbooks;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetriever() <em>Retriever</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetriever()
	 * @generated
	 * @ordered
	 */
	protected static final Object RETRIEVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetriever() <em>Retriever</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetriever()
	 * @generated
	 * @ordered
	 */
	protected Object retriever = RETRIEVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date updatedAt = UPDATED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteRepository() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookrepositoryPackage.Literals.REMOTE_REPOSITORY;
	}

	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' reference list.
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Cookbooks()
	 * @model ordered="false"
	 * @generated
	 */
	public EList<RemoteCookbook> getCookbooks() {
		if (cookbooks == null) {
			cookbooks = new EObjectResolvingEList<RemoteCookbook>(RemoteCookbook.class, this, CookbookrepositoryPackage.REMOTE_REPOSITORY__COOKBOOKS);
		}
		return cookbooks;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Id()
	 * @model id="true"
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__ID, oldId, id));
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Description()
	 * @model
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Icon()
	 * @model
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__ICON, oldIcon, icon));
	}

	/**
	 * Returns the value of the '<em><b>Retriever</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retriever</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retriever</em>' attribute.
	 * @see #setRetriever(Object)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Retriever()
	 * @model
	 * @generated
	 */
	public Object getRetriever() {
		return retriever;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getRetriever <em>Retriever</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retriever</em>' attribute.
	 * @see #getRetriever()
	 * @generated
	 */
	public void setRetriever(Object newRetriever) {
		Object oldRetriever = retriever;
		retriever = newRetriever;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__RETRIEVER, oldRetriever, retriever));
	}

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_Uri()
	 * @model
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__URI, oldUri, uri));
	}

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository_UpdatedAt()
	 * @model
	 * @generated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	public void setUpdatedAt(Date newUpdatedAt) {
		Date oldUpdatedAt = updatedAt;
		updatedAt = newUpdatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_REPOSITORY__UPDATED_AT, oldUpdatedAt, updatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__COOKBOOKS:
				return getCookbooks();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ID:
				return getId();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__NAME:
				return getName();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__DESCRIPTION:
				return getDescription();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ICON:
				return getIcon();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__RETRIEVER:
				return getRetriever();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__URI:
				return getUri();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__UPDATED_AT:
				return getUpdatedAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__COOKBOOKS:
				getCookbooks().clear();
				getCookbooks().addAll((Collection<? extends RemoteCookbook>)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ID:
				setId((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ICON:
				setIcon((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__RETRIEVER:
				setRetriever(newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__URI:
				setUri((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__COOKBOOKS:
				getCookbooks().clear();
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ID:
				setId(ID_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__RETRIEVER:
				setRetriever(RETRIEVER_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__URI:
				setUri(URI_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__COOKBOOKS:
				return cookbooks != null && !cookbooks.isEmpty();
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__RETRIEVER:
				return RETRIEVER_EDEFAULT == null ? retriever != null : !RETRIEVER_EDEFAULT.equals(retriever);
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case CookbookrepositoryPackage.REMOTE_REPOSITORY__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updatedAt != null : !UPDATED_AT_EDEFAULT.equals(updatedAt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", icon: ");
		result.append(icon);
		result.append(", retriever: ");
		result.append(retriever);
		result.append(", uri: ");
		result.append(uri);
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(')');
		return result.toString();
	}

} // RemoteRepository
