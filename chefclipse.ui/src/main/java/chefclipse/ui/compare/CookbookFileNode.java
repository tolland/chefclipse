package chefclipse.ui.compare;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.runtime.CoreException;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;

import chefclipse.ui.ChefPlugin;

class CookbookFileNode extends CookbookResourceNode implements
		IStreamContentAccessor, ITypedElement {

	private byte[] fContents;

	private String md5Sum;

	public void setMd5Sum(String md5Sum) {
		this.md5Sum = md5Sum;
	}

	byte[] getBytes() {
		return fContents;
	}

	String getMd5Sum() {
		return md5Sum;
	}

	public CookbookFileNode(CookbookFile input) {
		super(input.getName());
		setMd5Sum(input.getChecksum());
	}

	public CookbookFileNode(ServerCookbookFile input) {
		super(input.getName());
	}

	@Override
	public InputStream getContents() throws CoreException {
		return new ByteArrayInputStream("thisnis a enruewnfuinwe".getBytes());
	}

	/*
	 * public String getType() { String s = this.getName(); int pos =
	 * s.lastIndexOf('.'); if (pos >= 0) return s.substring(pos + 1); return
	 * ITypedElement.UNKNOWN_TYPE; }
	 */

	public String getType() {

		return "txt";
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
		if ((other instanceof CookbookFileNode)
				&& (getName().equals(((CookbookFileNode) other).getName()))) {

			ChefPlugin.log(" local -->{}" + getName());
			ChefPlugin.log(" remote -->{}" +

			((CookbookFileNode) other).getName());

			ChefPlugin.log("checking md5sums: local -->{}" + getMd5Sum());
			ChefPlugin.log("checking md5sums: remove  -->{}"
					+ ((CookbookFileNode) other).getMd5Sum());

			if (getMd5Sum().equals(((CookbookFileNode) other).getMd5Sum())) {
				return true;
			}

		} else {

			ChefPlugin.log("is not a cookbook file resource node" + "");
		}
		return false;

	}

	public Object[] getChildren() {
		return null;
	}

}