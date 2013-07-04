package org.limepepper.chefclipse.dltk.tests.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IScriptModel;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.internal.core.ModelManager;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

public class AbstractModelTests extends TestCase {

	private String fTestProjectName;

	public AbstractModelTests(String testProjectName, String name) {
		super(name);
		this.fTestProjectName = testProjectName;
	}

	public void setUp() throws Exception {
		super.setUp();
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceDescription description = workspace.getDescription();
		if (description.isAutoBuilding()) {
			description.setAutoBuilding(false);
			workspace.setDescription(description);
		}
	}

	protected IScriptProject setUpScriptProject(final String projectName)
			throws CoreException, IOException {
		final IProject project = setUpProject(projectName);
		return DLTKCore.create(project);
	}

	public IProject setUpProject(final String projectName)
			throws CoreException, IOException {
		return setUpProjectTo(projectName, projectName);
	}

	public File getSourceWorkspacePath() {
		return new File(getPluginDirectoryPath(), "workspace");
	}

	/**
	 * Returns the OS path to the directory that contains this plugin.
	 */
	protected File getPluginDirectoryPath() {
		try {
			final Bundle bundle = Platform.getBundle(this.fTestProjectName);
			if (bundle == null) {
				throw new IllegalStateException(NLS.bind(
						"Bundle \"{0}\" with test data not found",
						fTestProjectName));
			}
			URL platformURL = bundle.getEntry("/");
			return new File(FileLocator.toFileURL(platformURL).getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Copy the given source directory (and all its contents) to the given
	 * target directory.
	 */
	protected void copyDirectory(File source, File target) throws IOException {
		FileUtil.copyDirectory(source, target);
	}

	protected IProject setUpProjectTo(final String projectName,
			final String fromName) throws CoreException, IOException {
		// copy files in project from source workspace to target workspace
		final File sourceWorkspacePath = getSourceWorkspacePath();
		final File targetWorkspacePath = getWorkspaceRoot().getLocation()
				.toFile();

		final File source = new File(sourceWorkspacePath, fromName);
		if (!source.isDirectory()) {
			throw new IllegalArgumentException(NLS.bind(
					"Source directory \"{0}\" doesn't exist", source));
		}
		copyDirectory(source, new File(targetWorkspacePath, projectName));

		return createProject(projectName);
	}

	public static void waitUntilIndexesReady() {
		ModelManager.getModelManager().getIndexManager().waitUntilReady();
	}

	/*
	 * Create simple project.
	 */
	protected IProject createProject(final String projectName)
			throws CoreException {
		final IProject project = getProject(projectName);
		IWorkspaceRunnable create = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				project.create(null);
				project.open(null);
			}
		};
		getWorkspace().run(create, null);
		return project;
	}

	public void deleteProject(String projectName) throws CoreException {
		IProject project = getProject(projectName);
		if (project.exists() && !project.isOpen()) { // force opening so that
			// project can be
			// deleted without
			// logging (see bug
			// 23629)
			project.open(null);
		}
		deleteResource(project);
	}

	/**
	 * Delete this resource.
	 */
	public static void deleteResource(IResource resource) throws CoreException {
		CoreException lastException = null;
		try {
			resource.delete(true, null);
		} catch (CoreException e) {
			lastException = e;
			// just print for info
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException iae) {
			// just print for info
			System.out.println(iae.getMessage());
		}
		int retryCount = 60; // wait 1 minute at most
		while (resource.isAccessible() && --retryCount >= 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			try {
				resource.delete(true, null);
			} catch (CoreException e) {
				lastException = e;
				// just print for info
				System.out.println("Retry " + retryCount + ": "
						+ e.getMessage());
			} catch (IllegalArgumentException iae) {
				// just print for info
				System.out.println("Retry " + retryCount + ": "
						+ iae.getMessage());
			}
		}
		if (!resource.isAccessible())
			return;
		System.err.println("Failed to delete " + resource.getFullPath());
		if (lastException != null) {
			throw lastException;
		}
	}

	/**
	 * Returns the IWorkspace this test suite is running on.
	 */
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	public static IWorkspaceRoot getWorkspaceRoot() {
		return getWorkspace().getRoot();
	}

	public static IProject getProject(String project) {
		return getWorkspaceRoot().getProject(project);
	}

	/**
	 * Returns the script Model this test suite is running on.
	 */
	public IScriptModel getScriptModel() {
		return DLTKCore.create(getWorkspaceRoot());
	}

}
