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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Cookbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getDescription <em>Description</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getUrl <em>Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getCategory <em>Category</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getLatestVersion <em>Latest Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getExternalUrl <em>External Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getRating <em>Rating</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getReplacement <em>Replacement</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getInstalledAt <em>Installed At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook()
 * @model kind="class"
 * @generated
 */
public class RemoteCookbook extends EObjectImpl implements EObject {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected String maintainer = MAINTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestVersion() <em>Latest Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LATEST_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatestVersion() <em>Latest Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestVersion()
	 * @generated
	 * @ordered
	 */
	protected String latestVersion = LATEST_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> versions;

	/**
	 * The default value of the '{@link #getExternalUrl() <em>External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalUrl() <em>External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalUrl()
	 * @generated
	 * @ordered
	 */
	protected String externalUrl = EXTERNAL_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final double RATING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected double rating = RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacement() <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacement()
	 * @generated
	 * @ordered
	 */
	protected String replacement = REPLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstalledAt() <em>Installed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date INSTALLED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstalledAt() <em>Installed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledAt()
	 * @generated
	 * @ordered
	 */
	protected Date installedAt = INSTALLED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteCookbook() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookrepositoryPackage.Literals.REMOTE_COOKBOOK;
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
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__NAME, oldName, name));
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
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Description()
	 * @model
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getDescription <em>Description</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Url()
	 * @model
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__URL, oldUrl, url));
	}

	/**
	 * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' attribute.
	 * @see #setMaintainer(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Maintainer()
	 * @model
	 * @generated
	 */
	public String getMaintainer() {
		return maintainer;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		String oldMaintainer = maintainer;
		maintainer = newMaintainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__MAINTAINER, oldMaintainer, maintainer));
	}

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Category()
	 * @model
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__CATEGORY, oldCategory, category));
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
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_UpdatedAt()
	 * @model
	 * @generated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getUpdatedAt <em>Updated At</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__UPDATED_AT, oldUpdatedAt, updatedAt));
	}

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_CreatedAt()
	 * @model
	 * @generated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		Date oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * Returns the value of the '<em><b>Latest Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Version</em>' attribute.
	 * @see #setLatestVersion(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_LatestVersion()
	 * @model
	 * @generated
	 */
	public String getLatestVersion() {
		return latestVersion;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getLatestVersion <em>Latest Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Version</em>' attribute.
	 * @see #getLatestVersion()
	 * @generated
	 */
	public void setLatestVersion(String newLatestVersion) {
		String oldLatestVersion = latestVersion;
		latestVersion = newLatestVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__LATEST_VERSION, oldLatestVersion, latestVersion));
	}

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' attribute list.
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Versions()
	 * @model
	 * @generated
	 */
	public EList<String> getVersions() {
		if (versions == null) {
			versions = new EDataTypeUniqueEList<String>(String.class, this, CookbookrepositoryPackage.REMOTE_COOKBOOK__VERSIONS);
		}
		return versions;
	}

	/**
	 * Returns the value of the '<em><b>External Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Url</em>' attribute.
	 * @see #setExternalUrl(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_ExternalUrl()
	 * @model
	 * @generated
	 */
	public String getExternalUrl() {
		return externalUrl;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getExternalUrl <em>External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Url</em>' attribute.
	 * @see #getExternalUrl()
	 * @generated
	 */
	public void setExternalUrl(String newExternalUrl) {
		String oldExternalUrl = externalUrl;
		externalUrl = newExternalUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__EXTERNAL_URL, oldExternalUrl, externalUrl));
	}

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(double)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Rating()
	 * @model
	 * @generated
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	public void setRating(double newRating) {
		double oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__RATING, oldRating, rating));
	}

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Deprecated()
	 * @model
	 * @generated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	public void setDeprecated(boolean newDeprecated) {
		boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * Returns the value of the '<em><b>Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement</em>' attribute.
	 * @see #setReplacement(String)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_Replacement()
	 * @model
	 * @generated
	 */
	public String getReplacement() {
		return replacement;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getReplacement <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement</em>' attribute.
	 * @see #getReplacement()
	 * @generated
	 */
	public void setReplacement(String newReplacement) {
		String oldReplacement = replacement;
		replacement = newReplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__REPLACEMENT, oldReplacement, replacement));
	}

	/**
	 * Returns the value of the '<em><b>Installed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed At</em>' attribute.
	 * @see #setInstalledAt(Date)
	 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook_InstalledAt()
	 * @model
	 * @generated
	 */
	public Date getInstalledAt() {
		return installedAt;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook#getInstalledAt <em>Installed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed At</em>' attribute.
	 * @see #getInstalledAt()
	 * @generated
	 */
	public void setInstalledAt(Date newInstalledAt) {
		Date oldInstalledAt = installedAt;
		installedAt = newInstalledAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookrepositoryPackage.REMOTE_COOKBOOK__INSTALLED_AT, oldInstalledAt, installedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__NAME:
				return getName();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DESCRIPTION:
				return getDescription();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__URL:
				return getUrl();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__MAINTAINER:
				return getMaintainer();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CATEGORY:
				return getCategory();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__UPDATED_AT:
				return getUpdatedAt();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CREATED_AT:
				return getCreatedAt();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__LATEST_VERSION:
				return getLatestVersion();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__VERSIONS:
				return getVersions();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__EXTERNAL_URL:
				return getExternalUrl();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__RATING:
				return getRating();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DEPRECATED:
				return isDeprecated();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__REPLACEMENT:
				return getReplacement();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__INSTALLED_AT:
				return getInstalledAt();
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
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__NAME:
				setName((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__URL:
				setUrl((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__MAINTAINER:
				setMaintainer((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CATEGORY:
				setCategory((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__LATEST_VERSION:
				setLatestVersion((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__EXTERNAL_URL:
				setExternalUrl((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__RATING:
				setRating((Double)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__REPLACEMENT:
				setReplacement((String)newValue);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__INSTALLED_AT:
				setInstalledAt((Date)newValue);
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
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__LATEST_VERSION:
				setLatestVersion(LATEST_VERSION_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__VERSIONS:
				getVersions().clear();
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__EXTERNAL_URL:
				setExternalUrl(EXTERNAL_URL_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__RATING:
				setRating(RATING_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__REPLACEMENT:
				setReplacement(REPLACEMENT_EDEFAULT);
				return;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__INSTALLED_AT:
				setInstalledAt(INSTALLED_AT_EDEFAULT);
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
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updatedAt != null : !UPDATED_AT_EDEFAULT.equals(updatedAt);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__LATEST_VERSION:
				return LATEST_VERSION_EDEFAULT == null ? latestVersion != null : !LATEST_VERSION_EDEFAULT.equals(latestVersion);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__VERSIONS:
				return versions != null && !versions.isEmpty();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__EXTERNAL_URL:
				return EXTERNAL_URL_EDEFAULT == null ? externalUrl != null : !EXTERNAL_URL_EDEFAULT.equals(externalUrl);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__RATING:
				return rating != RATING_EDEFAULT;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__DEPRECATED:
				return deprecated != DEPRECATED_EDEFAULT;
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__REPLACEMENT:
				return REPLACEMENT_EDEFAULT == null ? replacement != null : !REPLACEMENT_EDEFAULT.equals(replacement);
			case CookbookrepositoryPackage.REMOTE_COOKBOOK__INSTALLED_AT:
				return INSTALLED_AT_EDEFAULT == null ? installedAt != null : !INSTALLED_AT_EDEFAULT.equals(installedAt);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", url: ");
		result.append(url);
		result.append(", maintainer: ");
		result.append(maintainer);
		result.append(", category: ");
		result.append(category);
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", latestVersion: ");
		result.append(latestVersion);
		result.append(", versions: ");
		result.append(versions);
		result.append(", externalUrl: ");
		result.append(externalUrl);
		result.append(", rating: ");
		result.append(rating);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(", replacement: ");
		result.append(replacement);
		result.append(", installedAt: ");
		result.append(installedAt);
		result.append(')');
		return result.toString();
	}

} // RemoteCookbook
