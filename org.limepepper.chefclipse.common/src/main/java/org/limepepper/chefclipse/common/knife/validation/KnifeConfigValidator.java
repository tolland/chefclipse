/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.common.knife.validation;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.Plugin;
import org.limepepper.chefclipse.common.workstation.Repository;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.common.knife.KnifeConfig}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface KnifeConfigValidator {
	boolean validate();

	boolean validatePlugins(EList<Plugin> value);
	boolean validateCache_type(String value);
	boolean validateCache_option(String value);
	boolean validateCookbook_path(File value);
	boolean validateCookbook_copyright(String value);
	boolean validateCookbook_email(String value);
	boolean validateCookbook_license(String value);
	boolean validatePath(File value);
	boolean validateServer(Server value);

	boolean validateServerCookbookVersion(EList<ServerCookbookVersion> value);

	boolean validateRepository(Repository value);
}
