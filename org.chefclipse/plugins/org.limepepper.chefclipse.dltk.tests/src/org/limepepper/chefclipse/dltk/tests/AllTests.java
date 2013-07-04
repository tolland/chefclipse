package org.limepepper.chefclipse.dltk.tests;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("org.limepepper.chefclipse.dltk.tests");
		// $JUnit-BEGIN$
		suite.addTest(new JUnit4TestAdapter(ChefParserTest.class));
		// $JUnit-END$
		return suite;
	}
}
