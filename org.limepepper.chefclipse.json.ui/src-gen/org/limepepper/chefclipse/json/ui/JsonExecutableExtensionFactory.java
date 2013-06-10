/*
 * generated by Xtext
 */
package org.limepepper.chefclipse.json.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.limepepper.chefclipse.json.ui.internal.JsonActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JsonExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return JsonActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return JsonActivator.getInstance().getInjector(JsonActivator.ORG_LIMEPEPPER_CHEFCLIPSE_JSON_JSON);
	}
	
}
