package org.limepepper.chefclipse.compare.structurecreator;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.IViewerCreator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

public class TextMergeViewerCreator implements IViewerCreator {

    public TextMergeViewerCreator() {
    }

    @Override
    public Viewer createViewer(Composite parent, CompareConfiguration config) {
        return null;
    }

}
