/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.utility.validation;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.utility.VersionedObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VersionedObjectValidator {
	boolean validate();

	boolean validateNUM_VERSIONS(Integer value);

	boolean validateVersion(String value);
}