/*
* generated by Xtext
*/
package org.limepepper.chefclipse.json.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JsonAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/limepepper/chefclipse/json/parser/antlr/internal/InternalJson.tokens");
	}
}
