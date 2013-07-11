/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.common.cookbook.validation;

import org.eclipse.emf.common.util.EMap;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.common.cookbook.Metadata}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MetadataValidator {
	boolean validate();

	boolean validateCookbookVersion(CookbookVersion value);

	boolean validateLong_description(String value);

	boolean validateVersion(String value);

	boolean validateReplaces(EMap<String, String> value);

	boolean validateProvides(EMap<String, String> value);

	boolean validateConflicts(EMap<String, String> value);

	boolean validateSuggests(EMap<String, String> value);

	boolean validateDependencies(EMap<String, String> value);

	boolean validatePlatforms(EMap<String, String> value);

	boolean validateRecipes(EMap<String, String> value);

	boolean validateReplacing(String value);
}