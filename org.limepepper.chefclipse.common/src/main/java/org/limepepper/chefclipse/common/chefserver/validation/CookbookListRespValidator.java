/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.common.chefserver.validation;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.common.chefserver.CookbookListResp}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CookbookListRespValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateVersions(EList<CookbookVersion> value);

	boolean validateUrl(String value);
}
