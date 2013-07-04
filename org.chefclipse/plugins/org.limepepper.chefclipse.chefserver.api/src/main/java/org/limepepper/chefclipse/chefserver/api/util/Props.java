package org.limepepper.chefclipse.chefserver.api.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {

    public static void OpenTestProperties() {

        Properties prop = new Properties();

        try {
            // load a properties file
            prop.load(new FileInputStream("opscode-tests.properties"));

            // get the property value and print it out
            System.out.println(prop.getProperty("user"));
            System.out.println(prop.getProperty("pass"));
            System.out.println(prop.getProperty("host"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
