/**
 *
 * $Id$
 */
package org.limepepper.chefclipse.common.chefserver.validation;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Server;

/**
 * A sample validator interface for {@link org.limepepper.chefclipse.common.chefserver.DataBag}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataBagValidator {
	boolean validate();

	boolean validateServer(Server value);

	boolean validateItems(EList<DataBagItem> value);

	boolean validateResource(IResource value);
}