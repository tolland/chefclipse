/*
* generated by Xtext
*/
package org.limepepper.chefclipse.json;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JsonStandaloneSetup extends JsonStandaloneSetupGenerated{

	public static void doSetup() {
		new JsonStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

