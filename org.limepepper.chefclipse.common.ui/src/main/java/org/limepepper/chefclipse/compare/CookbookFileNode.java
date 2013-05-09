package org.limepepper.chefclipse.compare;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.ui.Activator;
import org.limepepper.chefclipse.compare.CookbookCompareInput.FilteredBufferedResourceNode;

class CookbookFileNode extends CookbookResourceNode implements
        IStreamContentAccessor, ITypedElement {

    ServerCookbookFile file;
    private byte[]     fContents;

    private String     md5Sum;

    public void setMd5Sum(String md5Sum) {
        this.md5Sum = md5Sum;
    }

    byte[] getBytes() {
        return fContents;
    }

    String getMd5Sum() {
        return md5Sum;
    }

    public CookbookFileNode(EObject input) {
        this.file = (ServerCookbookFile) input;

    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public InputStream getContents() throws CoreException {
        return new ByteArrayInputStream("thisnis a enruewnfuinwe".getBytes());
    }

    public String getType() {
        String s = this.getName();
        int pos = s.lastIndexOf('.');
        if (pos >= 0)
            return s.substring(pos + 1);
        return ITypedElement.UNKNOWN_TYPE;
    }

    void appendBytes(byte[] buffer, int length) {
        if (length > 0) {
            int oldLen = 0;
            if (fContents != null)
                oldLen = fContents.length;
            byte[] newBuf = new byte[oldLen + length];
            if (oldLen > 0)
                System.arraycopy(fContents, 0, newBuf, 0, oldLen);
            System.arraycopy(buffer, 0, newBuf, oldLen, length);
            fContents = newBuf;
        }
    }

    // @todo utils bundle
    static String bytes2String(byte[] bytes) {
        StringBuilder string = new StringBuilder();
        for (byte b : bytes) {
            String hexString = Integer.toHexString(0x00FF & b);
            string.append(hexString.length() == 1 ? "0" + hexString : hexString);
        }
        return string.toString();
    }

    /*
     * Returns true if other is ITypedElement and names are equal.
     * 
     * @see IComparator#equals
     */
    public boolean equals(Object other) {
        if ((other instanceof FilteredBufferedResourceNode)
                && (getName().equals(((FilteredBufferedResourceNode) other)
                        .getName()))) {

            Activator.log(" local -->{}" + getName());
            Activator.log(" remote -->{}" +

            ((FilteredBufferedResourceNode) other).getName());

            Activator.log("checking md5sums: local -->{}" + getMd5Sum());

            byte[] content = ((FilteredBufferedResourceNode) other)
                    .getContent();

            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("MD5");
                byte[] hash = md.digest(content);
                Activator.log("checking md5sums: remote -->{}"
                        + bytes2String(hash));

                if (getMd5Sum().equals(bytes2String(hash))) {
                    Activator.log("returning true");
                    return true;
                }

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            /*
             * ((ITypedElement) other).ge)
             * ChefRepositoryManager.INSTANCE.getElement(resource)
             */

        } else {

            Activator.log("is not a filtered buffered resource node" + "");
        }
        return false;

    }
}