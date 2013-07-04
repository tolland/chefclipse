package org.limepepper.chefclipse.chefserver.api.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ServerAPITests.class,
        SignHeaderTest.class })
public class AllTests {

}
