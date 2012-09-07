
package org.limepepper.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

import chef_eclipse_navigator.Activator;


public class KnifeProjectSchema implements IKnifeProjectElement {

    private IKnifeProjectElement _parent;
    private IKnifeProjectElement[] _children;
    private Image _image;

    public KnifeProjectSchema(IKnifeProjectElement parent) {
        _parent = parent;
    }

    public Image getImage() {
        if (_image == null) {
            _image = Activator.getImage("icons/project-schema.png"); //$NON-NLS-1$
        }

        return _image;
    }

    public String getText() {
        return "Schema";
    }

    @Override
    public IProject getProject() {
        return _parent.getProject();
    }
    
    @Override
    public Object getParent() {
        return _parent;
    }

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
        IKnifeProjectElement[] children = new IKnifeProjectElement [] {
                new KnifeProjectSchemaTables(this),
                new KnifeProjectSchemaViews(this),
                new KnifeProjectSchemaFilters(this)
        };
        
        return children;
    }

}
