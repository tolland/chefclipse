/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.utility.validation;

import java.net.URL;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.utility.SandboxedObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SandboxedObjectValidator {
	boolean validate();

	boolean validateUrl(URL value);
}
