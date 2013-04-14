package org.limepepper.chefclipse.compare;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.compare.CompareUI;
import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.ResourceNode;
import org.eclipse.compare.internal.CompareUIPlugin;
import org.eclipse.compare.structuremergeviewer.DiffTreeViewer;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.compare.structuremergeviewer.IStructureCreator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import chefclipse.ui.compare.CookbookCompareInput.FilteredBufferedResourceNode;

public class ServerCookbookStructureCreator implements IStructureCreator {
    static Logger                logger          = LoggerFactory
                                                         .getLogger(ServerCookbookStructureCreator.class);
    private static final boolean NORMALIZE_CASE  = true;

    private boolean              fThreeWay       = false;
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
    private String[]             cookbookFolders = new String[] { "attributes",
            "files", "templates"                };

    public ServerCookbookStructureCreator(ServerCookbookVersion cookbook) {
    }

    @Override
    public String getName() {
        return "Compare Server Cookbook with ...";
    }

    @Override
    @SuppressWarnings("null")
    public IStructureComparator getStructure(final Object input) {

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

                        if (cookbookResource instanceof IContainer) {
                            return new FilteredBufferedResourceNode(
                                    cookbookResource);
                        }

                    }
                }
            }
        }

        if (!(input instanceof IStreamContentAccessor)) {

            // return null;
        } else {

        }

        System.err.println("don';t care what the other type of resource input is");

        IResource ires = EMFUtils.getIResource(input);
        KnifeConfig knifeConfig = ChefConfigManager.instance().retrieveProjectChefConfig(ires);

        KnifeConfigController api = KnifeConfigController.INSTANCE;

        ServerCookbookVersion cookbook = api.getServer(knifeConfig)
                .getCookbookVersion("XXchecksum-test-cookbook");

        assertNotNull(cookbook);

        ZipFolder zipRoot = new ZipFolder(cookbook.getCookbook_name());

        // CookbookItemProviderAdapterFactory cookbookItemprovier = new
        // CookbookItemProviderAdapterFactory();

        // cookbookItemprovier.createCookbookAdapter();

        for (Adapter adapter : cookbook.eAdapters()) {
            logger.info("adapter is: {}", adapter.getTarget());
            logger.info("class is: {}", adapter.getClass());
        }

        for (EObject eObject : cookbook.eContents()) {
            logger.info("object is: {}", eObject.toString());
            logger.info("class is: {}", eObject.eClass());
        }

        for (ServerCookbookFile file : cookbook.getRoot_files()) {
            logger.debug("processing: {}", file.getName());
            ZipFile zipFile = new ZipFile(file.getName(),
                    file.getChecksum());

            zipFile.setBytes(file.getChecksum().getBytes());
            zipRoot.add(file.getName(), zipFile);
        }

        return zipRoot;
    }

    @Override
    public String getContents(final Object node, final boolean ignoreWhitespace) {

        return null;
    }

    @Override
    public IStructureComparator locate(final Object path, final Object source) {
        return null;
    }

    public boolean canSave() {
        return false;
    }

    @Override
    public void save(final IStructureComparator node, final Object input) {
    }

    /**
     * Common base class for ZipFolder and ZipFile
     */
    static abstract class ZipResource implements IStructureComparator,
            ITypedElement {

        private final String fName;

        ZipResource(final String name) {
            fName = name;
        }

        @Override
        public String getName() {
            return fName;
        }

        @Override
        public Image getImage() {
            return CompareUI.getImage(getType());
        }

        @Override
        public boolean equals(final Object other) {
            if (other instanceof ITypedElement) {
                return fName.equals(((ITypedElement) other).getName());
            }
            return super.equals(other);
        }

        @Override
        public int hashCode() {
            return fName.hashCode();
        }
    }

    static class ZipFolder extends ZipResource {

        private final HashMap<String, ZipResource> fChildren = new HashMap<String, ZipResource>(
                10);

        ZipFolder(final String name) {
            super(name);
        }

        @Override
        public String getType() {
            return ITypedElement.FOLDER_TYPE;
        }

        public void add(final String name, final ZipResource resource) {
            fChildren.put(name, resource);
        }

        @Override
        public Object[] getChildren() {
            Object[] children = new Object[fChildren.size()];
            Iterator<ZipResource> iter = fChildren.values().iterator();
            for (int i = 0; iter.hasNext(); i++) {
                children[i] = iter.next();
            }
            return children;
        }

        ZipFile createContainer(String path) {
            String entry = path;
            int pos = path.indexOf('/');
            if (pos < 0) {
                pos = path.indexOf('\\');
            }
            if (pos >= 0) {
                entry = path.substring(0, pos);
                path = path.substring(pos + 1);
            } else if (entry.length() > 0) {
                if (CompareUIPlugin.getDefault().filter(path, false, true)) {
                    return null;
                }
                // ZipFile ze = new ZipFile(entry, null);
                // fChildren.put(entry, ze);
                // return ze;
                return null;
            } else {
                return null;
            }

            ZipFolder folder = null;
            if (fChildren != null) {
                Object o = fChildren.get(entry);
                if (o instanceof ZipFolder) {
                    folder = (ZipFolder) o;
                }
            }

            if (folder == null) {
                if (path.length() > 0
                        && CompareUIPlugin.getDefault()
                        .filter(path, true, true)) {
                    return null;
                }
                folder = new ZipFolder(entry);
                fChildren.put(entry, folder);
            }

            return folder.createContainer(path);
        }
    }

    static class ZipFile extends ZipResource implements IStreamContentAccessor {

        private byte[] fContents;
        private String md5Sum;

        public void setMd5Sum(final String md5Sum) {
            this.md5Sum = md5Sum;
        }

        byte[] getBytes() {
            return fContents;
        }

        String getMd5Sum() {
            return md5Sum;
        }

        ZipFile(@NonNull final String name, @NonNull final String md5Sum) {
            super(name);
            setMd5Sum(md5Sum);
        }

        @Override
        public String getType() {
            String s = this.getName();
            int pos = s.lastIndexOf('.');
            if (pos >= 0) {
                return s.substring(pos + 1);
            }
            return ITypedElement.UNKNOWN_TYPE;
        }

        @Override
        public Object[] getChildren() {
            return null;
        }

        @Override
        public InputStream getContents() {
            if (fContents == null) {
                fContents = new byte[0];
            }
            return new ByteArrayInputStream(fContents);
        }

        void setBytes(final byte[] buffer) {
            fContents = buffer;
        }

        void appendBytes(final byte[] buffer, final int length) {
            if (length > 0) {
                int oldLen = 0;
                if (fContents != null) {
                    oldLen = fContents.length;
                }
                byte[] newBuf = new byte[oldLen + length];
                if (oldLen > 0) {
                    System.arraycopy(fContents, 0, newBuf, 0, oldLen);
                }
                System.arraycopy(buffer, 0, newBuf, oldLen, length);
                fContents = newBuf;
            }
        }

        // @todo utils bundle
        static String bytes2String(final byte[] bytes) {
            StringBuilder string = new StringBuilder();
            for (byte b : bytes) {
                String hexString = Integer.toHexString(0x00FF & b);
                string.append(hexString.length() == 1 ? "0" + hexString
                        : hexString);
            }
            return string.toString();
        }

        /*
         * Returns true if other is ITypedElement and names are equal.
         * 
         * @see IComparator#equals
         */
        @Override
        public boolean equals(final Object other) {
            if ((other instanceof FilteredBufferedResourceNode)
                    && (getName().equals(((FilteredBufferedResourceNode) other)
                            .getName()))) {

                logger.debug(" local -->{}", getName());
                logger.debug(" remote -->{}",

                ((FilteredBufferedResourceNode) other).getName());

                logger.debug("checking md5sums: local -->{}", getMd5Sum());

                byte[] content = ((FilteredBufferedResourceNode) other)
                        .getContent();

                MessageDigest md = null;
                try {
                    md = MessageDigest.getInstance("MD5");
                    byte[] hash = md.digest(content);
                    logger.debug("checking md5sums: remote -->{}",
                            bytes2String(hash));

                    if (getMd5Sum().equals(bytes2String(hash))) {
                        logger.debug("returning true");
                        return true;
                    }

                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
                /*
                 * ((ITypedElement) other).ge)
                 * ChefRepositoryManager.INSTANCE.getElement(resource)
                 */

            }
            return false;

        }
    }

}
