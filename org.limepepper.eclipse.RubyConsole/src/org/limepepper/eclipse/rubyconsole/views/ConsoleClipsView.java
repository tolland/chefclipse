package org.limepepper.eclipse.rubyconsole.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.jruby.Ruby;
import org.jruby.RubyInstanceConfig;
import org.jruby.demo.TextAreaReadline;
import org.jruby.internal.runtime.ValueAccessor;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class ConsoleClipsView extends ViewPart {

    /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "org.limepepper.eclipse.rubyconsole.views.ConsoleClipsView";

    private TableViewer        viewer;
    private Action             action1;
    private Action             action2;
    private Action             doubleClickAction;





    /**
     * The constructor.
     */
    public ConsoleClipsView() {
    }

    public Font findFont(String otherwise, int style, int size,
            String[] families) {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        Arrays.sort(fonts);
        Font font = null;
        for (int i = 0; i < families.length; i++) {
            if (Arrays.binarySearch(fonts, families[i]) >= 0) {
                font = new Font(families[i], style, size);
                break;
            }
        }
        if (font == null) {
            font = new Font(otherwise, style, size);
        }
        return font;
    }

    /**
     * This is a callback that will allow us
     * to create the viewer and initialize it.
     */
    public void createPartControl(Composite parent) {
/*
 * viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
 * viewer.setContentProvider(new ViewContentProvider());
 * viewer.setLabelProvider(new ViewLabelProvider());
 * viewer.setSorter(new NameSorter());
 * viewer.setInput(getViewSite());
 */

        Composite swtAwtComponent = new Composite(parent, SWT.EMBEDDED);



        java.awt.Frame frame = SWT_AWT.new_Frame(swtAwtComponent);

        javax.swing.JPanel console = new javax.swing.JPanel();

        // final IRBchefconsole console = new
        // IRBchefconsole("Chefclipse IRB Console");

        frame.add(console);

        console.setLayout(new BorderLayout());

        // console.setSize(700, 600);

        JEditorPane text = new JTextPane();

        text.setMargin(new Insets(8, 8, 8, 8));
        text.setCaretColor(new Color(0xa4, 0x00, 0x00));
        text.setBackground(new Color(0xf2, 0xf2, 0xf2));
        text.setForeground(new Color(0xa4, 0x00, 0x00));
        Font font = findFont("Monospaced", Font.PLAIN, 14, new String[] {
                "Monaco", "Andale Mono" });

        text.setFont(font);
        JScrollPane pane = new JScrollPane();
        pane.setViewportView(text);
        pane.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        console.add(pane);
        console.validate();

        final TextAreaReadline tar = new TextAreaReadline(text,
                " Welcome to the JRuby Chefclipse IRB Console \n\n");
        /*
         * parent.g.addWindowListener(new WindowAdapter() {
         * public void windowClosing(WindowEvent e) {
         * tar.shutdown();
         * }
         * });
         */

        final RubyInstanceConfig config = new RubyInstanceConfig() {
            {
                setInput(tar.getInputStream());
                setOutput(new PrintStream(tar.getOutputStream()));
                setError(new PrintStream(tar.getOutputStream()));
                setArgv(new String[] {});
            }
        };
        final Ruby runtime = Ruby.newInstance(config);

        runtime.getGlobalVariables().defineReadonly(
                "$$",
                new ValueAccessor(runtime.newFixnum(System
                        .identityHashCode(runtime))));
        runtime.getLoadService().init(new ArrayList());

        tar.hookIntoRuntime(runtime);

        Job job = new Job("My Job") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                // Do something long running
                // ...

/*
 * System.setProperty("jruby.script", "jruby");
 * System.setProperty("jruby.shell", "/bin/bash");
 * System.setProperty("jruby.home", "/usr/share/jruby");
 * System.setProperty("jruby.version", "1.8");
 * System.setProperty("jruby.lib", "/usr/share/jruby/lib");
 *
 * List pathsLoad = new ArrayList();
 * pathsLoad.add("/usr/share/jruby/lib/ruby/1.8");
 * pathsLoad.add("/usr/share/jruby/lib/ruby/site_ruby/1.8");
 * pathsLoad.add("/usr/share/jruby/lib/ruby/site_ruby/shared");
 *
 * Ruby rubyRuntime = JavaEmbedUtils.initialize(pathsLoad);
 */

                // org.jruby.Main.main(new String[] { "-S", "jirb_swing" });

                // System.setSecurityManager(new NoExitSecurityManager());
                try {
                    // IRBConsole irb = new
                    // IRBConsole("Chefclipse IRB console");

                    runtime.evalScriptlet("ARGV << '--readline' << '--prompt' << 'inf-ruby';"
                            + "require 'irb'; require 'irb/completion';"
                            + "IRB.start");
                } catch (Exception e) {
                    System.out.println("Exit status: " + 42 + " :");
                    e.printStackTrace();
                }
                //System.setSecurityManager(null);

                return Status.OK_STATUS;
            }
        };

        // Start the Job
        job.schedule();

        hookContextMenu();

/*        // Create the help context id for the viewer's control
        PlatformUI
                .getWorkbench()
                .getHelpSystem()
                .setHelp(viewer.getControl(),
                        "org.limepepper.eclipse.RubyConsole.viewer");
        makeActions();
        hookDoubleClickAction();
        contributeToActionBars();*/
    }

    private void hookContextMenu() {
        MenuManager menuMgr = new MenuManager("#PopupMenu");
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(IMenuManager manager) {
                ConsoleClipsView.this.fillContextMenu(manager);
            }
        });

    }

    private void contributeToActionBars() {
        IActionBars bars = getViewSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(IMenuManager manager) {
        manager.add(action1);
        manager.add(new Separator());
        manager.add(action2);
    }

    private void fillContextMenu(IMenuManager manager) {
        manager.add(action1);
        manager.add(action2);
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    private void fillLocalToolBar(IToolBarManager manager) {
        manager.add(action1);
        manager.add(action2);
    }

    private void makeActions() {
        action1 = new Action() {
            public void run() {
                showMessage("Action 1 executed");
            }
        };
        action1.setText("Action 1");
        action1.setToolTipText("Action 1 tooltip");
        action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

        action2 = new Action() {
            public void run() {
                showMessage("Action 2 executed");
            }
        };
        action2.setText("Action 2");
        action2.setToolTipText("Action 2 tooltip");
        action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
        doubleClickAction = new Action() {
            public void run() {
                ISelection selection = viewer.getSelection();
                Object obj = ((IStructuredSelection) selection)
                        .getFirstElement();
                showMessage("Double-click detected on " + obj.toString());
            }
        };
    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                doubleClickAction.run();
            }
        });
    }

    private void showMessage(String message) {
        MessageDialog.openInformation(viewer.getControl().getShell(),
                "ConsoleClips", message);
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {
        //viewer.getControl().setFocus();
    }
}