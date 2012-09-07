
package org.limepepper.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;


public interface IKnifeProjectElement {

    public Image getImage();

    public Object[] getChildren();

    public String getText();

    public boolean hasChildren();

    public IProject getProject();

    public Object getParent();
}
