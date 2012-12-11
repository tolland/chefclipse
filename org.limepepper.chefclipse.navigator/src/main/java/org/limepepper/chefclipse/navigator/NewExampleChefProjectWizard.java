package org.limepepper.chefclipse.navigator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.osgi.framework.Bundle;

public class NewExampleChefProjectWizard extends Wizard implements INewWizard {
    ChefRepositoryWizardPage repoPage = new ChefRepositoryWizardPage();

    public NewExampleChefProjectWizard() {
        setNeedsProgressMonitor(true);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }

    @Override
    public boolean performFinish() {
        /*
         * String base =
         * Platform.getBundle(config.getPluginId()).getEntry("/").toString();
         * String relativeUri = "com/flow/FlowMain.java";
         * File f = new File(base+relativeUri);
         */


        /*
         * 
         * IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
         * IResource resourceInRuntimeWorkspace =
         * root.findMember("rules/setup.txt");
         * File file = new File(resourceInRuntimeWorkspace.getLocationURI());
         */
/*
 * try {
 * getZipFiles(FileLocator.toFileURL(setupUrl).getPath(),
 * ResourcesPlugin.getWorkspace().getRoot().getLocation()
 * .toString()
 * + "/");
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 */

        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor)
                    throws InvocationTargetException {
                try {

                    Bundle bundle = NavigatorActivator.getDefault().getBundle();
                    IPath path = new Path("resources/chef-repo-example");
                    URL setupUrl = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
                    copyFolder(new File(FileLocator.toFileURL(setupUrl)
                            .getPath()),

                    new File(ResourcesPlugin.getWorkspace().getRoot()
                            .getLocation().toString()
                            + "/chef-repo-example"));

                    IProject proj = ResourcesPlugin.getWorkspace().getRoot()
                            .getProject("/chef-repo-example");

                    IProjectDescription desc = proj.getWorkspace()
                            .newProjectDescription(proj.getName());

                    desc.setNatureIds(new String[] { ChefProjectNature.NATURE_ID });
                    proj.create(desc, monitor);

                    if (!proj.isOpen()) {
                        proj.open(monitor);
                    }
                } catch (CoreException e) {
                    e.printStackTrace();
                    throw new InvocationTargetException(e);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    monitor.done();
                }
            }
        };

        try {
            this.getContainer().run(true, false, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), "Error",
                    realException.getMessage());
            return false;
        }
        return true;
    }

    public void addPages() {

        addPage(repoPage);
    }

    public static void copyFolder(File src, File dest) throws IOException {

        if (src.isDirectory()) {

            // if directory not exists, create it
            if (!dest.exists()) {
                dest.mkdir();
                // System.out.println("Directory copied from " + src + "  to " +
                // dest);
            }

            // list all the directory contents
            String files[] = src.list();

            for (String file : files) {
                // construct the src and dest file structure
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                // recursive copy
                copyFolder(srcFile, destFile);
            }

        } else {
            // if file, then copy it
            // Use bytes stream to support all file types
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int length;
            // copy the file content in bytes
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();
          //  System.out.println("File copied from " + src + " to " + dest);
        }
    }

    public static void getZipFiles(String filename, String destinationname) {
        try {
            byte[] buf = new byte[1024];
            ZipInputStream zipinputstream = null;
            ZipEntry zipentry;
            zipinputstream = new ZipInputStream(new FileInputStream(filename));

            zipentry = zipinputstream.getNextEntry();
            while (zipentry != null) {

                // for each entry to be extracted
                String entryName = destinationname + zipentry.getName();
                entryName = entryName.replace('/', File.separatorChar);
                // System.out.println("entryname " + entryName);

                File f = new File(entryName);

                // @todo this is truly dreadful stuff

                // System.err.println(f.getParentFile());
                if (!f.getParentFile().isDirectory()) {
                    f.getParentFile().mkdirs();
                }

                int n;
                FileOutputStream fileoutputstream;
                File newFile = new File(entryName);
                if (zipentry.isDirectory()) {
                    if (!newFile.mkdirs()) {
                        break;
                    }
                    zipentry = zipinputstream.getNextEntry();
                    continue;
                }

                fileoutputstream = new FileOutputStream(entryName);

                while ((n = zipinputstream.read(buf, 0, 1024)) > -1) {
                    fileoutputstream.write(buf, 0, n);
                }

                fileoutputstream.close();
                zipinputstream.closeEntry();
                zipentry = zipinputstream.getNextEntry();

            }// while

            zipinputstream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
