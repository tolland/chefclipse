
package org.limepepper.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

import chef_eclipse_navigator.Activator;


public class knifeProjectStoredProcedures implements IKnifeProjectElement {

    private IKnifeProjectElement _parent;
    private Image _image;
    private IKnifeProjectElement[] _children;

    public knifeProjectStoredProcedures(IKnifeProjectElement parent) {
        _parent = parent;
    }

    @Override
    public Image getImage() {
        if (_image == null) {
            _image = Activator.getImage("icons/project-stored-procedures.png"); //$NON-NLS-1$
        }

        return _image;
    }

    @Override
    public String getText() {
        return "Stored Procedures";
    }

    @Override
    public IProject getProject() {
        return _parent.getProject();
    }

    @Override
    public Object getParent() {
        return _parent;
    }

    /* (non-Javadoc)
     * @see customnavigator.navigator.ICustomProjectElement#getChildren()
     */
    @Override
    public IKnifeProjectElement[] getChildren() {
        if (_children == null) {
            _children = initializeChildren(getProject());
        }
        // else the children are just fine
        
        return _children;
    }

    @Override
    public boolean hasChildren() {
        if (_children == null) {
            _children = initializeChildren(getProject());
        }
        // else we have already initialized them
    
        return _children.length > 0;
    }

    private IKnifeProjectElement[] initializeChildren(IProject iProject) {
        IKnifeProjectElement[] children = new IKnifeProjectElement [0];
    	System.out
        .println("calling initialize children in stored proc ");
        return children;
    }
}
