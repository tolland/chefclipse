package org.limepepper.chefclipse.common.ui.builder;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class ChefProjectBuilder extends IncrementalProjectBuilder {

    public static final String BUILDER_ID = "org.limepepper.chefclipse.ChefclipseProjectBuilder";

    class ChefclipseProjectDeltaVisitor implements IResourceDeltaVisitor {

        public boolean visit(IResourceDelta delta) throws CoreException {

            IResource resource = delta.getResource();
            
            
       //     System.out.println("kind was "+delta.getKind());
            switch (delta.getKind()) {
            case IResourceDelta.ADDED:

            break;
            case IResourceDelta.REMOVED:

            break;
            case IResourceDelta.CHANGED:

            break;
            }

            return true;
        }
    }

    class ChefResourceVisitor implements IResourceVisitor {

        public boolean visit(IResource resource) {
            return true;
        }
    }

    protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
            throws CoreException {
/*
 * IWorkbenchWindow window = HandlerUtil
 * .getActiveWorkbenchWindowChecked(event);
 */
        // ChefRepositoryManager.instance().fullBuild(getProject());
/*
 * MessageDialog
 * .openInformation(
 * PlatformUI
 * .getWorkbench()
 * .getActiveWorkbenchWindow()
 * .getShell(),
 * "org.limepepper.chefclipse.common.ui",
 * "Hello, Cheflipse world");
 */
        // Repository repo = ChefRepositoryManager.instance().loadRepository(
        // getProject());

        System.out.println("HERE!!!");
/*
 * ChefRepositoryManager.instance().persistChefRepository(
 * eObject,"repoxxx.workstation", getProject().getFullPath().toString(),
 * getProject(), null);
 * 
 * try {
 * ChefRepositoryManager.instance().persistChefclipseModel(repo,
 * ".workstation", getProject().getFullPath().toString(),
 * getProject(), null);
 * } catch (Exception e) {
 * 
 * e.printStackTrace();
 * }
 */
        
        if (kind == FULL_BUILD) {

            fullBuild(monitor);
        } else {
            IResourceDelta delta = getDelta(getProject());
            if (delta == null) {
                fullBuild(monitor);
            } else {
                incrementalBuild(delta, monitor);
            }
        }

        return null;
    }

    protected void fullBuild(final IProgressMonitor monitor)
            throws CoreException {

        try {
            getProject().accept(new ChefResourceVisitor());

        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    protected void incrementalBuild(IResourceDelta delta,
            IProgressMonitor monitor) throws CoreException {

        delta.accept(new ChefclipseProjectDeltaVisitor());
    }
}
