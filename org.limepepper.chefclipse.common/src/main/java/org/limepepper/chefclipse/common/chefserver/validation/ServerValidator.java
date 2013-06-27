/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.common.chefserver.validation;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefserver.Client;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.Sandbox;
import org.limepepper.chefclipse.common.chefserver.ServerConfig;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.common.chefserver.Server}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServerValidator {
	boolean validate();

	boolean validateCookbooks(EList<ServerCookbookVersion> value);

	boolean validateRoles(EList<Role> value);

	boolean validateNodes(EList<Node> value);

	boolean validateDatabags(EList<DataBag> value);

	boolean validateEnvironments(EList<Environment> value);

	boolean validateClients(EList<Client> value);

	boolean validateWebuiport(int value);

	boolean validateSandboxes(EList<Sandbox> value);

	boolean validateConfig(ServerConfig value);

	boolean validateKnifeConfig(EList<KnifeConfig> value);
}
