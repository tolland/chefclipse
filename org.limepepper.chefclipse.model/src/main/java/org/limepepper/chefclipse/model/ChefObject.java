/**
 */
package org.limepepper.chefclipse.model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chef Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.ChefObject#getChildren <em>Children</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.ChefObject#getParent <em>Parent</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.ChefObject#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.ChefObject#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject()
 * @model kind="class"
 * @generated
 */
public class ChefObject extends EObjectImpl implements EObject {
    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<ChefObject> children;

    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected ChefObject parent;

    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProject()
     * @generated
     * @ordered
     */
    protected ChefProject project;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefObject() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.CHEF_OBJECT;
    }

    /**
     * Returns the value of the '<em><b>Children</b></em>' reference list.
     * The list contents are of type {@link org.limepepper.chefclipse.model.ChefObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Children</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' reference list.
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject_Children()
     * @model
     * @generated
     */
    public EList<ChefObject> getChildren() {
        if (children == null) {
            children = new EObjectResolvingEList<ChefObject>(ChefObject.class, this, ModelPackage.CHEF_OBJECT__CHILDREN);
        }
        return children;
    }

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(ChefObject)
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject_Parent()
     * @model
     * @generated
     */
    public ChefObject getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = (ChefObject)eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHEF_OBJECT__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefObject basicGetParent() {
        return parent;
    }

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.model.ChefObject#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    public void setParent(ChefObject newParent) {
        ChefObject oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHEF_OBJECT__PARENT, oldParent, parent));
    }

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject_Path()
     * @model required="true"
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.model.ChefObject#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHEF_OBJECT__PATH, oldPath, path));
    }

    /**
     * Returns the value of the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' reference.
     * @see #setProject(ChefProject)
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject_Project()
     * @model required="true"
     * @generated
     */
    public ChefProject getProject() {
        if (project != null && project.eIsProxy()) {
            InternalEObject oldProject = (InternalEObject)project;
            project = (ChefProject)eResolveProxy(oldProject);
            if (project != oldProject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CHEF_OBJECT__PROJECT, oldProject, project));
            }
        }
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefProject basicGetProject() {
        return project;
    }

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.model.ChefObject#getProject <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' reference.
     * @see #getProject()
     * @generated
     */
    public void setProject(ChefProject newProject) {
        ChefProject oldProject = project;
        project = newProject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHEF_OBJECT__PROJECT, oldProject, project));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model resourceRequired="true"
     * @generated
     */
    public void create(ChefResource resource) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.CHEF_OBJECT__CHILDREN:
                return getChildren();
            case ModelPackage.CHEF_OBJECT__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case ModelPackage.CHEF_OBJECT__PATH:
                return getPath();
            case ModelPackage.CHEF_OBJECT__PROJECT:
                if (resolve) return getProject();
                return basicGetProject();
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
            case ModelPackage.CHEF_OBJECT__CHILDREN:
                getChildren().clear();
                getChildren().addAll((Collection<? extends ChefObject>)newValue);
                return;
            case ModelPackage.CHEF_OBJECT__PARENT:
                setParent((ChefObject)newValue);
                return;
            case ModelPackage.CHEF_OBJECT__PATH:
                setPath((String)newValue);
                return;
            case ModelPackage.CHEF_OBJECT__PROJECT:
                setProject((ChefProject)newValue);
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
            case ModelPackage.CHEF_OBJECT__CHILDREN:
                getChildren().clear();
                return;
            case ModelPackage.CHEF_OBJECT__PARENT:
                setParent((ChefObject)null);
                return;
            case ModelPackage.CHEF_OBJECT__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case ModelPackage.CHEF_OBJECT__PROJECT:
                setProject((ChefProject)null);
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
            case ModelPackage.CHEF_OBJECT__CHILDREN:
                return children != null && !children.isEmpty();
            case ModelPackage.CHEF_OBJECT__PARENT:
                return parent != null;
            case ModelPackage.CHEF_OBJECT__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case ModelPackage.CHEF_OBJECT__PROJECT:
                return project != null;
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
        result.append(" (path: ");
        result.append(path);
        result.append(')');
        return result.toString();
    }

} // ChefObject
