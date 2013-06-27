/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.utility.validation;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.utility.URLEntryTest;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.utility.VersionUrl}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VersionUrlValidator {
	boolean validate();

	boolean validateUrl(String value);

	boolean validateVersions(EList<URLEntryTest> value);
}
