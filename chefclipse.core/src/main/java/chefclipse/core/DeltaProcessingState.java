package chefclipse.core;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.core.managers.ChefRepositoryManager;

public class DeltaProcessingState implements IResourceChangeListener,
		IResourceDeltaVisitor {
	private static Logger logger = LoggerFactory
			.getLogger(DeltaProcessingState.class);
	private Set<IResource> fAdded;
	private Set<IResource> fRemoved;

	@Override
	public void resourceChanged(IResourceChangeEvent event) {

		// ChefModelManager.getChefModelManager().getChefModel().getChefProject();

		if (event == null || event.getDelta() == null) {
			logger.debug("event or event delta was null");
			return;
		}

		fAdded = new HashSet<IResource>(1);
		fRemoved = new HashSet<IResource>(1);
		try {
			event.getDelta().accept(this);
			// @todo don't want to process anything if accept failed?

			// IWorkspace workspace = ResourcesPlugin.getWorkspace();

			if (fAdded.size() > 0) {
				for (IResource iterable_element : fAdded) {
					logger.debug("add item: {}", iterable_element.getName());

				}

			}

			if (fRemoved.size() > 0) {
				for (IResource iterable_element : fRemoved) {
					logger.debug("remove item: {}", iterable_element.getName());
				}
			}

			Job job = new WorkspaceJob("Creating folders") {
				public IStatus runInWorkspace(IProgressMonitor monitor)
						throws CoreException {
					// do the actual work in here
					if (fAdded.size() > 0) {
						for (IResource iterable_element : fAdded) {
							logger.debug(
									"calling ChefRepositoryManager.add on: {}",
									iterable_element.getName());
							ChefRepositoryManager.INSTANCE
									.add(iterable_element);
						}

					}

					if (fRemoved.size() > 0) {
						for (IResource iterable_element : fRemoved) {
							logger.debug(
									"calling ChefRepositoryManager.remove on: {}",
									iterable_element.getName());
							ChefRepositoryManager.INSTANCE
									.remove(iterable_element);
						}
					}
					return Status.OK_STATUS;
				}
			};

			/*
			 * IWorkspaceRunnable myRunnable = new IWorkspaceRunnable() { public
			 * void run(IProgressMonitor monitor) throws CoreException { // do
			 * the actual work in here if (fAdded.size() > 0) {
			 * logger.debug("processing added"); for (IResource iterable_element
			 * : fAdded) { logger.debug(iterable_element.getName());
			 * ChefRepositoryManager.INSTANCE .add(iterable_element); }
			 *
			 * }
			 *
			 * if (fRemoved.size() > 0) { logger.debug("processing removed");
			 * for (IResource iterable_element : fRemoved) {
			 * logger.debug("rmovig {}", iterable_element.getName());
			 * ChefRepositoryManager.INSTANCE .remove(iterable_element); } }
			 * //return Status.OK_STATUS; } };
			 */

			// job.setRule(workspace);
			job.schedule();

			// workspace.run(myRunnable, null, IWorkspace.AVOID_UPDATE, null);

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		final IResource resource = delta.getResource();
		int flags = delta.getFlags();

		if (resource != null) {

			// seems to send an emtpy workspace notification and work down.
			if (resource instanceof IWorkspaceRoot) {
				logger.debug("on workspace Root: {}", resource);

				switch (delta.getKind()) {
				// @todo is OPEN a valid kind here?
				case IResourceDelta.OPEN:
					if (resource instanceof IProject)
						return true;
					break;
				case IResourceDelta.CHANGED:
					logger.debug("Resource " + delta.getFullPath().toString()
							+ " has changed.");
					if ((flags & IResourceDelta.OPEN) != 0)
						return true;

					logger.debug(" flags are ." + flags);
					if ((flags & IResourceDelta.CONTENT) != 0) {
						logger.debug("--> Content Change");
					}
					if ((flags & IResourceDelta.REPLACED) != 0) {
						logger.debug("--> Content Replaced");
					}
					if ((flags & IResourceDelta.MARKERS) != 0) {
						logger.debug("--> Marker Change");
						IMarkerDelta[] markers = delta.getMarkerDeltas();
						// if interested in markers, check these deltas
					}
					if ((flags & IResourceDelta.OPEN) != 0) {
						logger.debug("--> Project opened");
						// if interested in markers, check these deltas
					}
					if (flags == 0) {
						logger.debug("--> resource flags were zero, visit children");
						return true;
					}
					break;
				default:
					break;
				}
			} else if (resource instanceof IProject) {
				logger.debug("on project {}", resource);
				switch (delta.getKind()) {
				case IResourceDelta.CHANGED:
					logger.debug("on project {} - changed", resource);
					if ((flags & IResourceDelta.OPEN) != 0) {
						if (((IProject) resource).isOpen()) {
							logger.debug(resource.getClass() + " opening "
									+ resource);
							fAdded.add(resource);
						} else {
							logger.debug(resource.getClass() + " closing "
									+ resource);
							fRemoved.add(resource);
						}
					}

					logger.debug(" flags are ." + flags);
					if ((flags & IResourceDelta.CONTENT) != 0) {
						logger.debug("--> Content Change");
					}
					if ((flags & IResourceDelta.REPLACED) != 0) {
						logger.debug("--> Content Replaced");
					}
					if ((flags & IResourceDelta.MARKERS) != 0) {
						logger.debug("--> Marker Change");
						IMarkerDelta[] markers = delta.getMarkerDeltas();
						// if interested in markers, check these deltas
					}
					if (flags == 0) {
						logger.debug("--> resource flags were zero, so visit children");
						return true;
					}

					break;
				case IResourceDelta.OPEN:
				case IResourceDelta.NO_CHANGE:
				case IResourceDelta.REMOVED:
				case IResourceDelta.MOVED_TO:
				case IResourceDelta.MOVED_FROM:
				case IResourceDelta.MARKERS:
				case IResourceDelta.LOCAL_CHANGED:
				case IResourceDelta.DESCRIPTION:
				case IResourceDelta.CONTENT:
					logger.debug("on project {}, ignoring" + delta.getKind(),
							resource);
					break;
				default:
					logger.debug("on project {}, ignoring some other mask"
							+ delta.getKind(), resource);
					break;

				}
			}
			// IProject project = resource.getProject();
			else if (resource instanceof IFile) {
				logger.debug("on file {}", resource);
				switch (delta.getKind()) {

				case IResourceDelta.CHANGED:
					if (!isIgnored(resource)) {
						fAdded.add(resource);
					}
					break;
				case IResourceDelta.REMOVED:
					fRemoved.add(resource);
					break;
				case IResourceDelta.ADDED:
					if (!isIgnored(resource)) {
						fAdded.add(resource);
					}
					break;
				default:
					break;
				}
			} else if (resource instanceof IFolder) {
				logger.debug("on ifolder {}", resource);
				// dont want to visit children of new cookbooks or project
				// objects, because they will be processed by the model builder
				// if (isContainer(resource)) {
				switch (delta.getKind()) {
				case IResourceDelta.CHANGED:

					logger.debug("on container {} - changed", resource);

					logger.debug(" flags are ." + flags);
					if ((flags & IResourceDelta.CONTENT) != 0) {
						logger.debug("--> Content Change");
					}
					if ((flags & IResourceDelta.REPLACED) != 0) {
						logger.debug("--> Content Replaced");
					}
					if ((flags & IResourceDelta.MARKERS) != 0) {
						logger.debug("--> Marker Change");
						IMarkerDelta[] markers = delta.getMarkerDeltas();
						// if interested in markers, check these deltas
					}
					if (flags == 0) {
						// logger.debug("--> resource flags were zero, so visit children");
						return true;
					}

					break;
				case IResourceDelta.ADDED:
					if (!isIgnored(resource)) {
						fAdded.add(resource);
					}
					break;
				case IResourceDelta.REMOVED:
					fRemoved.add(resource);
					break;
				default:
					break;
				}

			} else if (resource instanceof IWorkspace) {
				logger.debug("on workspace {}", resource);

			}

		}
		return false;
	}

	/**
	 * this is stupid, change it!
	 *
	 * @param resource
	 * @return
	 */
	public boolean isIgnored(IResource resource) {
		if (resource.isDerived()) {
			return true;
		}
		// @todo
		if (resource.getName().endsWith(".workstation")
				|| resource.getName().equals(".cookbook")
				|| resource.getName().endsWith(".knife")
				|| resource.getName().endsWith(".settings")
				|| resource.getParent().getName().endsWith(".settings")
				|| resource.getName().equals("metadata.json"))
			return true;
		return false;
	}

	public boolean isContainer(IResource resource) {
		if (resource.getName().equals("cookbooks")
				|| (resource instanceof IProject)) {
			return true;
		}
		return false;
	}

}
