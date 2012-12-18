package rubyconsole;

import java.io.InputStream;
import java.io.PrintStream;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.jruby.Ruby;
import org.jruby.RubyInstanceConfig;

/**
 * 
 * @author Jeremy Meyer
 * 
 */
public class RubyConsole extends IOConsole implements Runnable {
    final static Color OUTPUT_COLOUR = new Color(null, 0, 0, 255);  // blue
    final static Color ERROR_COLOUR  = new Color(null, 255, 0, 0);  // red
    final static Color INPUT_COLOUR  = new Color(null, 0, 180, 180); // cyan


    @Override
    public String getName() {
        return "Eclipse Ruby console";
    }

    public RubyConsole() {
        super("Eclipse Ruby console", null);
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        final IOConsoleInputStream in = getInputStream();
        IOConsoleOutputStream ioOut = newOutputStream();
        IOConsoleOutputStream ioErr = newOutputStream();
        in.setColor(INPUT_COLOUR);
        ioOut.setColor(OUTPUT_COLOUR);
        ioErr.setColor(ERROR_COLOUR);
        final PrintStream out = new PrintStream(ioOut);
        final PrintStream err = new PrintStream(ioErr);

        final String[] args = new String[] {};

        final RubyInstanceConfig config = new RubyInstanceConfig() {
            public InputStream getInput() {
                return in;
            }

            public PrintStream getOutput() {
                return out;
            }

            public PrintStream getError() {
                return err;
            }
            // setArgv(args);
        };

        try {
            Ruby rubyRuntime = Ruby.newInstance(config);
            System.setProperty("jruby.home", "/usr/share/jruby");
            System.setProperty("jruby.version", "1.8");
            String jRubyHome = System.getProperty("jruby.home");
            String jRubyVersion = System.getProperty("jruby.version");
            rubyRuntime.evalScriptlet("$:.insert(0, '" + jRubyHome
                    + "/lib/ruby/" + jRubyVersion + "')");
            rubyRuntime.evalScriptlet("$:.insert(0, '" + jRubyHome + "/lib')");
            rubyRuntime.evalScriptlet("require 'jruby';");
            rubyRuntime.evalScriptlet("require 'eclipse_console_irb';");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}