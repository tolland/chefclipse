package org.limepepper.chefclipse.compare;

import java.util.Random;

import org.eclipse.compare.CompareUI;
import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.ResourceNode;
import org.eclipse.compare.structuremergeviewer.DiffTreeViewer;
import org.eclipse.compare.structuremergeviewer.DocumentRangeNode;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.compare.structuremergeviewer.IStructureCreator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.compare.CookbookCompareInput.FilteredBufferedResourceNode;

public class CookbookStructureCreator implements IStructureCreator {

    private static final boolean NORMALIZE_CASE = true;

    private boolean              fThreeWay      = false;
    private Object               fRoot;
    private IStructureComparator fAncestor;
    private IStructureComparator fLeft;
    private IStructureComparator fRight;
    private IResource            fAncestorResource;
    private IResource            fLeftResource;
    private IResource            fRightResource;
    private DiffTreeViewer       fDiffViewer;
    private IAction              fOpenAction;
    IResource[]                  selection;

    public CookbookStructureCreator() {
    }

    @Override
    public String getName() {
        return "Compare Cookbook with ...";
    }

    // If the compare is three-way, this method asks the user which resource
    // to use as the ancestor. Depending on the value of
    // showSelectAncestorDialog flag it uses different dialogs to get the
    // feedback from the user. Returns false if the user cancels the prompt,
    // true otherwise.
    boolean setSelection(ISelection s, Shell shell,
            boolean showSelectAncestorDialog) {

        // if (!showSelectAncestorDialog)
        // return showCompareWithOtherResourceDialog(shell, s);

        selection = Utilities.getResources(s);

        fThreeWay = selection.length == 3;

        // if (fThreeWay) {
/*
 * SelectAncestorDialog dialog =
 * new SelectAncestorDialog(shell, selection);
 * int code = dialog.open();
 * if (code != Window.OK)
 * return false;
 *
 * fAncestorResource= dialog.ancestorResource;
 * fAncestor= getStructure(fAncestorResource);
 * fLeftResource= dialog.leftResource;
 * fRightResource= dialog.rightResource;
 */
        // } else {
        fAncestorResource = null;
        fAncestor = null;
        fLeftResource = selection[0];

        // fRightResource = selection[1];
        // }
        fLeft = getStructure(fLeftResource);
        // fRight = getStructure(fRightResource);
        return true;
    }

    @SuppressWarnings("null")
    public IStructureComparator getStructure(Object input) {



        System.out.println("object is:" + input);

        if ((input instanceof ResourceNode)) {

            System.out.println(((ResourceNode) input).getType());
            if (((ResourceNode) input).getType().equals("cookbook")) {
                System.out.println(((ITypedElement) input).getType());

                if ((((ResourceNode) input).getResource()).getParent()
                        .getParent() != null) {

                    if ((((ResourceNode) input).getResource()).getParent()
                            .getParent().getName().equals("cookbooks")) {

                        System.err.println("here");
                        System.err.println("here2");

                        EObject eObject = ChefRepositoryManager.INSTANCE
                                .getElement((((ResourceNode) input)
                                        .getResource()).getParent());

                        IResource cookbookResource = (((ResourceNode) input)
                                .getResource()).getParent();

                        if (cookbookResource instanceof IContainer)
                            return new FilteredBufferedResourceNode(
                                    cookbookResource);

                    }
                }
            }
        }

        if (!(input instanceof IStreamContentAccessor)) {

          //  return null;
        } else {

        }

        System.err.println("don';t care what the other type of resource input is");

        IStreamContentAccessor sca = (IStreamContentAccessor) input;
        try {
            StringBuffer contents = new StringBuffer(
                    "wfhwyregf=uywegfugeuyg\nnohu=ihiuhiuhi\niuh=igiuguy");

            // note a single Random object is reused here
            Random randomGenerator = new Random();
            for (int idx = 1; idx <= 10; ++idx) {
                int randomInt = randomGenerator.nextInt(100);
                contents.append("Generated : " + randomInt);
            }

            if (contents == null)
                contents = new StringBuffer(""); //$NON-NLS-1$

            Document doc = new Document(contents.toString());

            KeyValueNode root = new KeyValueNode(
                    "root", "", doc, 0, doc.getLength()); //$NON-NLS-1$ //$NON-NLS-2$

            for (int i = 0; i < doc.getNumberOfLines(); i++) {

                IRegion r = doc.getLineInformation(i);
                String s = doc.get(r.getOffset(), r.getLength());
                int start = r.getOffset();

                String key = ""; //$NON-NLS-1$
                String value = ""; //$NON-NLS-1$
                int pos = s.indexOf('=');
                if (pos >= 0) {
                    key = s.substring(0, pos);
                    value = s.substring(pos + 1);
                } else {
                    key = s;
                }
                if (key.length() > 0)
                    root.addChild(new KeyValueNode(key, value, doc, start, s
                            .length()));
            }
            return root;
        } catch (BadLocationException ex) {
            String message = "bad location";
            CompareUI
                    .getPlugin()
                    .getLog()
                    .log(new Status(IStatus.ERROR, CompareUI.PLUGIN_ID, 0,
                            message, ex));
        }

        return null;
    }

    public String getContents(Object node, boolean ignoreWhitespace) {
        if (node instanceof KeyValueNode) {
            String s = ((KeyValueNode) node).getValue();
            if (ignoreWhitespace)
                s = s.trim();
            return s;
        }
        return null;
    }

    public IStructureComparator locate(Object path, Object source) {
        return null;
    }

    @Override
    public void save(IStructureComparator node, Object input) {
    }

    static class KeyValueNode extends DocumentRangeNode implements
            ITypedElement {

        String fValue;

        public KeyValueNode(String id, String value, IDocument doc, int start,
                int length) {
            super(0, id, doc, start, length);
            fValue = value;
        }

        String getValue() {
            return fValue;
        }

        /*
         * @see ITypedElement#getName
         */
        public String getName() {
            return this.getId();
        }

        /*
         * Every key/value pair is of type "kvtxt". We register a
         * TextMergeViewer for it.
         *
         * @see ITypedElement#getType
         */
        public String getType() {
            return "kvtxt"; //$NON-NLS-1$
        }

        /*
         * @see ITypedElement#getImage
         */
        public Image getImage() {
            return CompareUI.getImage(getType());
        }
    }

}
