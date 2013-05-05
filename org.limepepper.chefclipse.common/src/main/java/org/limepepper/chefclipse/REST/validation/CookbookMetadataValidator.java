/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.REST.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.REST.CookbookMetadata}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CookbookMetadataValidator {
	boolean validate();

	boolean validateMaintainer(String value);
	boolean validatePlatforms(EList<String> value);
	boolean validateVersion(String value);
	boolean validateDependencies(EList<String> value);
	boolean validateLicense(String value);
	boolean validateReplacing(String value);
	boolean validateDescription(String value);
}
