package org.limepepper.jruby;

import java.util.ArrayList;
import java.util.List;

import org.jruby.embed.LocalContextScope;
import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;

public class GemProjectHelper {



    ///home/tomh/workspace/chef-eclipse-jruby/scripts/testMaths.rb
    private final static String jrubyhome = "/home/tomh/workspace/chef-eclipse-jruby";
    private final static String filename = jrubyhome + "/scripts/testMaths.rb";

    public static void SetupSimpleProject(String projectName) {
        ScriptingContainer container = new ScriptingContainer(LocalContextScope.SINGLETON);
        List<String> loadPaths = new ArrayList();
        container.put("projectName", projectName);
        loadPaths.add(jrubyhome);
        // JRuby 1.5.x
        container.setLoadPaths(loadPaths);
        // JRuby 1.4.0
        //container.getProvider().setLoadPaths(loadPaths);
        container.runScriptlet(PathType.ABSOLUTE, filename);
    }
    
    public static void main(String[] args) {
        SetupSimpleProject("testapp");
    }
}
