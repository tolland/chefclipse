/**
 */
package org.limepepper.chefclipse.common.cookbook.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.cookbook.*;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.common.cookbook.Attributes;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.DependencyRelation;
import org.limepepper.chefclipse.common.cookbook.File;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.Resource;
import org.limepepper.chefclipse.common.cookbook.Template;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage
 * @generated
 */
public class CookbookSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CookbookPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookSwitch() {
        if (modelPackage == null) {
            modelPackage = CookbookPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case CookbookPackage.COOKBOOK_VERSION: {
                CookbookVersion cookbookVersion = (CookbookVersion)theEObject;
                T result = caseCookbookVersion(cookbookVersion);
                if (result == null) result = caseNamedDescribedObject(cookbookVersion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.DEFINITION: {
                Definition definition = (Definition)theEObject;
                T result = caseDefinition(definition);
                if (result == null) result = caseNamedDescribedObject(definition);
                if (result == null) result = caseSandboxedObject(definition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.LIBRARY: {
                Library library = (Library)theEObject;
                T result = caseLibrary(library);
                if (result == null) result = caseSandboxedObject(library);
                if (result == null) result = caseNamedDescribedObject(library);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T result = caseAttribute(attribute);
                if (result == null) result = caseNamedObject(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.RECIPE: {
                Recipe recipe = (Recipe)theEObject;
                T result = caseRecipe(recipe);
                if (result == null) result = caseSandboxedObject(recipe);
                if (result == null) result = caseRubyFile(recipe);
                if (result == null) result = caseChecksumFile(recipe);
                if (result == null) result = caseNamedObject(recipe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.RESOURCE: {
                Resource resource = (Resource)theEObject;
                T result = caseResource(resource);
                if (result == null) result = caseRubyFile(resource);
                if (result == null) result = caseSandboxedObject(resource);
                if (result == null) result = caseChecksumFile(resource);
                if (result == null) result = caseNamedObject(resource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.TEMPLATE: {
                Template template = (Template)theEObject;
                T result = caseTemplate(template);
                if (result == null) result = caseSandboxedObject(template);
                if (result == null) result = caseChecksumFile(template);
                if (result == null) result = caseNamedObject(template);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.ATTRIBUTES: {
                Attributes attributes = (Attributes)theEObject;
                T result = caseAttributes(attributes);
                if (result == null) result = caseSandboxedObject(attributes);
                if (result == null) result = caseChecksumFile(attributes);
                if (result == null) result = caseNamedObject(attributes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.FILE: {
                File file = (File)theEObject;
                T result = caseFile(file);
                if (result == null) result = caseResource(file);
                if (result == null) result = caseRubyFile(file);
                if (result == null) result = caseSandboxedObject(file);
                if (result == null) result = caseChecksumFile(file);
                if (result == null) result = caseNamedObject(file);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.DEPENDENCY_RELATION: {
                DependencyRelation dependencyRelation = (DependencyRelation)theEObject;
                T result = caseDependencyRelation(dependencyRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.COOKBOOK: {
                Cookbook cookbook = (Cookbook)theEObject;
                T result = caseCookbook(cookbook);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CookbookPackage.VERSION: {
                Version version = (Version)theEObject;
                T result = caseVersion(version);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Version</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCookbookVersion(CookbookVersion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefinition(Definition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLibrary(Library object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Recipe</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Recipe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecipe(Recipe object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResource(Resource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemplate(Template object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributes(Attributes object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFile(File object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dependency Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dependency Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDependencyRelation(DependencyRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cookbook</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cookbook</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCookbook(Cookbook object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Version</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVersion(Version object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Described Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Described Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedDescribedObject(NamedDescribedObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sandboxed Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sandboxed Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSandboxedObject(SandboxedObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedObject(NamedObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ruby File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ruby File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRubyFile(RubyFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Checksum File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Checksum File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChecksumFile(ChecksumFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //CookbookSwitch
