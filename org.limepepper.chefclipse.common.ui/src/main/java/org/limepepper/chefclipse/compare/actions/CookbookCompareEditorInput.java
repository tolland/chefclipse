package org.limepepper.chefclipse.compare.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

public class CookbookCompareEditorInput extends CompareEditorInput {

    public CookbookCompareEditorInput(CompareConfiguration configuration) {
        super(configuration);
    }

    public CookbookCompareEditorInput(ITypedElement ancestor,
            ITypedElement left, ITypedElement right) {
        super(new CompareConfiguration());

    }

    public static ITypedElement createFileElement(IFile resource) {
        return null;
    }

    @Override
    protected Object prepareInput(IProgressMonitor monitor)
            throws InvocationTargetException, InterruptedException {
        return null;
    }

}
