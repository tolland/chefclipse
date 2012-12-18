package org.limepepper.chefclipse.compare;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class Utilities {

    public static IResource[] getResources(ISelection selection) {

        if (selection instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) selection;
            IResource[] resources = new IResource[sel.toArray().length];
            for (int i = 0; i < sel.toArray().length; i++) {
                if (sel.toArray()[i] instanceof IResource) {
                    resources[i] = (IResource) sel.toArray()[i];
                } else {
                    resources[i] = null;
                }

            }
            return resources;
        }
        return null;

    }
}
