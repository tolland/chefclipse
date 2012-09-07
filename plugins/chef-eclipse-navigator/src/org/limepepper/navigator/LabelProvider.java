
package org.limepepper.navigator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;


public class LabelProvider implements ILabelProvider {

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    @Override
    public Image getImage(Object element) {
        Image image = null;
        
        if (IKnifeProjectElement.class.isInstance(element)) {
            image = ((IKnifeProjectElement)element).getImage();
        }
        // else ignore the element
        
        return image;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
        String text = ""; //$NON-NLS-1$
        if (IKnifeProjectElement.class.isInstance(element)) {
            text = ((IKnifeProjectElement)element).getText()+" hefuwehfuih huih ";
        }
        // else ignore the element
        
        return text;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    @Override
    public void addListener(ILabelProviderListener listener) {
        System.out.println("LabelProvider.addListener: " + listener.getClass().getName()); //$NON-NLS-1$
            	System.out
        .println("calling add listener");

    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    @Override
    public void dispose() {
        System.out.println("LabelProvider.dispose"); //$NON-NLS-1$
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    @Override
    public boolean isLabelProperty(Object element, String property) {
        System.out.println("LabelProvider.isLabelProperty: " + element.getClass().getName()); //$NON-NLS-1$
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    @Override
    public void removeListener(ILabelProviderListener listener) {
        System.out.println("LabelProvider.removeListener: " + listener.getClass().getName()); //$NON-NLS-1$
        // TODO Auto-generated method stub

    }

}
