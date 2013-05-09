package org.limepepper.chefclipse.common.ui.providers;

import java.util.HashSet;
import java.util.List;
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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.mapping.ModelProvider;
import org.eclipse.core.runtime.CoreException;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.navigator.testers.ChefTester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// @todo during development, not interested in unused messages
@SuppressWarnings("unused")
public class ChefModelProvider extends ModelProvider implements
        IResourceChangeListener, IResourceDeltaVisitor {

    Logger                           logger         = LoggerFactory
                                                            .getLogger(ChefModelProvider.class);

    public static final String       MODEL_ID       = "org.limepepper.chefclipse.ChefModelProvider";
    static ChefTester                propertyTester = new ChefTester();

    private Set<IResource>           fAdded;
    private Set<IResource>           fRemoved;

    private static ChefModelProvider instance       = null;

    public static ChefModelProvider instance() {
        if (instance == null) {
            instance = new ChefModelProvider();
            startup();
        }

        return instance;
    }


    public String getModelProviderId() {
        return MODEL_ID;
    }

    public Repository getModel(IResource resource) {

        return ChefRepositoryManager.INSTANCE.getRepository(resource
                .getProject());

    }

    /**
     * not sure if this is a good pattern, but further instances of
     * ChefModelProvide will
     * just wrap the static singleton
     */
    public ChefModelProvider() {
        // @todo do nothing
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {

        System.err.println("resource chjanged");

        if (event == null || event.getDelta() == null) {
            // was set to run on empty??
            System.err.println("event was null");
            return;
        }

        fAdded = new HashSet<IResource>(1);
        fRemoved = new HashSet<IResource>(1);

        try {
            event.getDelta().accept(this);
            // @todo don;t want to process anything if accept failed?

            if (fAdded.size() > 0) {
                logger.debug("processing added");
                for (IResource iterable_element : fAdded) {
                    logger.debug(iterable_element.getName());
                    ChefRepositoryManager.INSTANCE.add(iterable_element);
                }

            }

            if (fRemoved.size() > 0) {
                logger.debug("processing removed");
                for (IResource iterable_element : fRemoved) {
                    logger.debug("rmovig {}", iterable_element.getName());
                    ChefRepositoryManager.INSTANCE.remove(iterable_element);
                }
            }

        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean visit(IResourceDelta delta) throws CoreException {
        final IResource resource = delta.getResource();
        int flags = delta.getFlags();

        if (resource != null && resource.getProject() != null
        		&& resource.getProject().isNatureEnabled(ChefProjectNature.NATURE_ID)) {

            // seems to send an emtpy workspace notification and work down.
            if (resource instanceof IWorkspaceRoot) {
                logger.debug("on workspace Root {}", resource);

                switch (delta.getKind()) {
                // @todo can't open here?
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
                        logger.debug("--> resource flags were zero, so visit children");
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

    public boolean isIgnored(IResource resource) {
        if (resource.isDerived()) {
            return true;
        }
        if (resource.getName().endsWith(".workstation")
                || resource.getName().equals(".cookbook")
                || resource.getName().endsWith(".knife")
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

    public static void startup() {
        ResourcesPlugin.getWorkspace().addResourceChangeListener(
                (IResourceChangeListener) instance(),
                IResourceChangeEvent.POST_CHANGE);
    }

    public static void shutdown() {
        if (instance != null)
            ResourcesPlugin.getWorkspace().removeResourceChangeListener(
                    (IResourceChangeListener) instance);
    }

    private void extractResourceDeltas(IResourceDelta[] deltas,
            List<IResourceDelta> bag) {
        for (IResourceDelta delta : deltas) {
            if (delta.getAffectedChildren().length > 0) {
                extractResourceDeltas(delta.getAffectedChildren(), bag);
            } else {
                bag.add(delta);
            }
        }
    }

}
