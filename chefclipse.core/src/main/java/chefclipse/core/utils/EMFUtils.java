package chefclipse.core.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * The Class EMFUtils provides utility methods for dealing with EMF and EObjects.
 * 
 * @author Guillermo Zunino
 */
public class EMFUtils {

    /**
     * Returns the {@link IFile} containing the given {@link EObject}.
     * Returns <code>null</code> if the eobject is not contained in any resource.
     * 
     * @param eobject the eobject
     * @return the {@link IFile} from an {@link EObject}
     */
    public static IFile getIFileFromEObject(final EObject eobject) {
        IFile res = null;
        if (eobject != null) {
            Resource eResource = eobject.eResource();
            if (eResource != null) {
                URI eUri = eResource.getURI();
                if (eUri.isPlatformResource()) {
                    String platformString = eUri.toPlatformString(true);
                    res = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
                }
            }
        }
        return res;
    }

    /**
     * Tries to get and {@link IResource} from the given input.
     * 
     * @param input the input
     * @return the {@link IResource}
     */
    public static IResource getIResource(final Object input) {
        IResource ires = null;
        if (input instanceof IResource) {
            ires = (IResource) input;
        } else if (input instanceof EObject) {
            ires = EMFUtils.getIFileFromEObject((EObject) input);
        }
        return ires;
    }

}
