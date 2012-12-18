/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.impl.CookbookImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Cookbook Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getRoot_files <em>Root files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerCookbookVersionImpl#getCookbook_name <em>Cookbook name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerCookbookVersionImpl extends CookbookImpl implements ServerCookbookVersion {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServerCookbookVersionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getRoot_files() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ROOT_FILES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getRecipes() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RECIPES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getTemplates() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__TEMPLATES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getLibraries() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__LIBRARIES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getProviders() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__PROVIDERS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getResources() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RESOURCES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getFiles() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__FILES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getDefinitions() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__DEFINITIONS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ServerCookbookFile> getAttributes() {
        return (EList<ServerCookbookFile>)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ATTRIBUTES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return (String)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__VERSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        eSet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__VERSION, newVersion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCookbook_name() {
        return (String)eGet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__COOKBOOK_NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCookbook_name(String newCookbook_name) {
        eSet(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__COOKBOOK_NAME, newCookbook_name);
    }

} //ServerCookbookVersionImpl
