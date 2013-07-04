/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.utils;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * Helper class to manage common functionality.
 * 
 * @author Sebastian Sampaoli
 *
 */
public enum DataBagEditorUtils {
    
    INSTANCE;
    
    public ImageDescriptor getOverlayImageDescriptor(ImageDescriptor baseDescriptor, ImageDescriptor overlayIcon) {
        Image addImage = overlayIcon.createImage();
        Image scaledImage = new Image(Display.getDefault(), addImage.getImageData().scaledTo(10,10));
        ImageDescriptor overlay = ImageDescriptor.createFromImage(scaledImage);
        DecorationOverlayIcon imageOverlayed = new DecorationOverlayIcon(baseDescriptor.createImage(), overlay, IDecoration.BOTTOM_RIGHT);
        return imageOverlayed;
    }

//    public MultiPageDataBagEditor getDataBagEditorFromActivePage() {
//
//        final IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//        if (activeWorkbenchWindow == null) {
//            return null;
//        }
//        final IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
//        if (activePage == null)
//            return null;
//        final IEditorPart activeEditor = activePage.getActiveEditor();
//        if (activeEditor == null)
//            return null;
//        if (!(activeEditor instanceof MultiPageDataBagEditor)) {
//            return null;
//        }
//        return (MultiPageDataBagEditor) activeEditor;
//    }
}
