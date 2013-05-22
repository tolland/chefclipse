/**
 * 
 */
package org.limepepper.chefclipse.databag.editor;

import org.limepepper.chefclipse.json.ui.JsonExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * @author Guillermo Zunino
 *
 */
public class DatabagExecutableExtensionFactory extends
		JsonExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

}
