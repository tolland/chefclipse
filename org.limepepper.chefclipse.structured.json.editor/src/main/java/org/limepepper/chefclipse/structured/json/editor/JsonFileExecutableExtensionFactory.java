/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor;

import org.limepepper.chefclipse.json.ui.JsonExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * @author Guillermo Zunino
 *
 */
public class JsonFileExecutableExtensionFactory extends
		JsonExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StructuredJsonEditorActivator.getDefault().getBundle();
	}

}
