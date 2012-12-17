package org.limepepper.chefclipse.tools;

import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

public class BundleUtils {


    public static Object showDependencies(String bundleId){

        String requireBundle = (String)Platform.getBundle(bundleId).getHeaders().get(
                Constants.REQUIRE_BUNDLE);
                try {
                    ManifestElement[] elements = ManifestElement.parseHeader(
                    Constants.BUNDLE_CLASSPATH, requireBundle);
                    for (ManifestElement manifestElement : elements) {
                        System.out.println( manifestElement.getValue());
                    }
                } catch (BundleException e) {
                    e.printStackTrace();
                }
        return null;
    }

}
