package rubyconsole.actions;

import java.security.Permission;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import rubyconsole.IRBchefconsole;

public class Redgregregrg implements IWorkbenchWindowActionDelegate {

    protected static class ExitException extends SecurityException {
        public final int status;

        public ExitException(int status) {
            super("There is no escape!");
            this.status = status;
        }
    }

    private static class NoExitSecurityManager extends SecurityManager {
        @Override
        public void checkPermission(Permission perm) {
            // allow anything.
        }

        @Override
        public void checkPermission(Permission perm, Object context) {
            // allow anything.
        }

        @Override
        public void checkExit(int status) {
            super.checkExit(status);
            throw new ExitException(status);
        }
    }

    @Override
    public void run(IAction action) {

        Job job = new Job("My Job") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                // Do something long running
                // ...

/*                System.setProperty("jruby.script", "jruby");
                System.setProperty("jruby.shell", "/bin/bash");
                System.setProperty("jruby.home", "/usr/share/jruby");
                System.setProperty("jruby.version", "1.8");
                System.setProperty("jruby.lib", "/usr/share/jruby/lib");

                List pathsLoad = new ArrayList();
                pathsLoad.add("/usr/share/jruby/lib/ruby/1.8");
                pathsLoad.add("/usr/share/jruby/lib/ruby/site_ruby/1.8");
                pathsLoad.add("/usr/share/jruby/lib/ruby/site_ruby/shared");

                Ruby rubyRuntime = JavaEmbedUtils.initialize(pathsLoad);*/

                // org.jruby.Main.main(new String[] { "-S", "jirb_swing" });

              //  System.setSecurityManager(new NoExitSecurityManager());
                try {
                  //  IRBConsole irb = new IRBConsole("Chefclipse IRB console");

                    IRBchefconsole.main(new String[] {});
                } catch (ExitException e) {
                    System.out.println("Exit status: "+ 42 +" :"+ e.status);
                }
                System.setSecurityManager(null);

                return Status.OK_STATUS;
            }
        };

        // Start the Job
        job.schedule();

    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public void init(IWorkbenchWindow window) {
    }

}
