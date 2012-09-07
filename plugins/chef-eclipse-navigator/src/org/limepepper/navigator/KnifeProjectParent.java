


package org.limepepper.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

import chef_eclipse_navigator.Activator;


public class KnifeProjectParent implements IKnifeProjectElement {

    IProject                _project;
    Image                   _image;
    IKnifeProjectElement[] _children;

    public KnifeProjectParent(IProject iProject) {
        _project = iProject;
    }

    public String getText() {
        return _project.getName();
    }

    public Image getImage() {
        if (_image == null) {
            _image = Activator.getImage("icons/project-folder.png"); //$NON-NLS-1$
        }

        return _image;
    }

    @Override
    public IProject getProject() {
        return _project;
    }
    
    @Override
    public Object getParent() {
        return null;
    }

    @Override
    public IKnifeProjectElement[] getChildren() {
        if (_children == null) {
            _children = initializeChildren(_project);
        }
        // else we have already initialized them
    
        return _children;
    }

    @Override
    public boolean hasChildren() {
        if (_children == null) {
            _children = initializeChildren(_project);
        }
        // else we have already initialized them
        return _children.length > 0;
    }

    private IKnifeProjectElement[] initializeChildren(IProject project) {
        IKnifeProjectElement[] children = {
                new KnifeProjectSchema(this),
                new knifeProjectStoredProcedures(this)
        };

        return children;
    }

}
