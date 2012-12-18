package org.limepepper.chefclipse.compare;

import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.IDiffContainer;

public class CookbookDiffNode extends DiffNode {

    private boolean       fDirty = false;
    private ITypedElement fLastId;
    private String        fLastName;

    public CookbookDiffNode(IDiffContainer parent, int description,
            ITypedElement ancestor, ITypedElement left, ITypedElement right) {
        super(parent, description, ancestor, left, right);
    }

/*    public void fireChange() {
        super.fireChange();
        setDirty(true);
        fDirty = true;
        if (fDiffViewer != null)
            fDiffViewer.refresh(this);
    }*/

    void clearDirty() {
        fDirty = false;
    }

    public String getName() {
        if (fLastName == null)
            fLastName = super.getName();
        if (fDirty)
            return '<' + fLastName + '>';
        return fLastName;
    }

    public ITypedElement getId() {
        ITypedElement id = super.getId();
        if (id == null)
            return fLastId;
        fLastId = id;
        return id;
    }

}
