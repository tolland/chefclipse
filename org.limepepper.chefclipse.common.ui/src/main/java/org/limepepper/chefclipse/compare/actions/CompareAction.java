package org.limepepper.chefclipse.compare.actions;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.internal.CompareEditor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionDelegate;

public class CompareAction extends ActionDelegate  implements IObjectActionDelegate  {

    protected IWorkbenchPage fWorkbenchPage;
    ISelection               selection;

    public void run(ISelection selection) {
        System.err.println("logged selection");
    }

    public boolean isEnabled(ISelection selection) {

        CompareConfiguration cc = new CompareConfiguration();
        // buffered merge mode: don't ask for confirmation
        // when switching between modified resources
        cc.setProperty(CompareEditor.CONFIRM_SAVE_PROPERTY, new Boolean(false));
        System.err.println("logged checking enabled");
        return true;
    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        fWorkbenchPage= targetPart.getSite().getPage();
    }



}