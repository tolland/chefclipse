package chefclipse.ui.compare;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;

import chefclipse.ui.ChefPlugin;

class CookbookFileNode extends CookbookResourceNode implements
		IStreamContentAccessor, ITypedElement {

	private byte[] fContents;
	private String md5Sum;
	static KnifeConfigController api = KnifeConfigController.INSTANCE;

	private CookbookFile cookbookFile;
	private IResource resource;

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
		this.cookbookFile = input;
		setMd5Sum(input.getChecksum());
	}

	/**
	 * if the cookbook file is remote, then we need the project as well as there
	 * is no corresponding local resource to track
	 *
	 * @param input
	 * @param project
	 */
	public CookbookFileNode(ServerCookbookFile input, IResource project) {
		super(input.getName());
		this.cookbookFile = (CookbookFile) input;
	}

	/**
	 *
	 * @todo the client is responsible for closing the stream when finished
	 */
	@Override
	public InputStream getContents() throws CoreException {

		try {
			InputStream is = cookbookFile.getContentStream();
			if (is != null)
				return is;
		} catch (Exception e) {
			// e.printStackTrace();
			// System.out.println("isnt a local file");
			if (cookbookFile instanceof SandboxedObject) {
				URLConnection connection;

				System.out.println("isnt a local file-trying "
						+ ((SandboxedObject) cookbookFile).getUrl());

				try {
					URL url = ((SandboxedObject) cookbookFile).getUrl();

					connection = url.openConnection();
					return connection.getInputStream();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		}

		/*
		 * if (resource != null) {
		 *
		 * KnifeConfig config = ChefConfigManager.instance()
		 * .retrieveProjectChefConfig(resource.getProject());
		 *
		 * ChefServerApi chefServerApi = api.getServer(config);
		 *
		 * // ChefPlugin.log(item);
		 *
		 * // IResource cookbookResource = item.getResource();
		 *
		 * // assertNotNull(cookbookVersion);
		 *
		 * // String cookbookName = cookbookResource.getName();
		 * System.out.println("path is:" + cookbookFile.getPath());
		 *
		 * CookbookFile remoteCookbookFile = chefServerApi
		 * .getCookbookFile(cookbookFile.getPath());
		 *
		 * }
		 */

		return null;
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
	public boolean equals3(Object other) {
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