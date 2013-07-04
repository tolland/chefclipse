package chefclipse.ui.compare;

import java.io.InputStream;

import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;

import chefclipse.core.behaviours.DownloadBehaviour;

class CookbookFileNode extends CookbookResourceNode implements
		IStreamContentAccessor, ITypedElement {

	private byte[] fContents;
	private String md5Sum;

	private CookbookFile cookbookFile;

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
		this.cookbookFile = input;
	}

	/**
	 *
	 *
	 */
	@Override
	public InputStream getContents() throws CoreException {

		DownloadBehaviour downloader = (DownloadBehaviour) EcoreUtil
				.getRegisteredAdapter(cookbookFile, DownloadBehaviour.class);

		if (downloader == null) {
			System.err.println("downloader is     null "+cookbookFile.getClass());
			System.err.println("cookbookFile"+cookbookFile.eContainer().eClass());
			return null;
		} else {
			System.out.println("downloader is not null "+cookbookFile.getClass());
			System.out.println("cookbookFile"+cookbookFile.eContainer().eClass());
		}

		return downloader.getContentStream();
	}

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

	public Object[] getChildren() {
		return null;
	}

}