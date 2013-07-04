package chefclipse.core.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

import chefclipse.core.managers.ChefRepositoryManager;
import chefclipse.core.managers.ChefRepositoryManagerImpl;

public class ChefUtils {

	public static String hexMd5Sum(InputStream is) {
		try {
			BufferedInputStream bis = new BufferedInputStream(is);
			bis.mark(Integer.MAX_VALUE);
			byte[] filebytes = new byte[bis.available()];
			is.read(filebytes);

			return hexMd5Sum(filebytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String hexMd5Sum(byte[] content) {

		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(content);
			return bytes2String(hash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String bytes2String(byte[] bytes) {
		StringBuilder string = new StringBuilder();
		for (byte b : bytes) {
			String hexString = Integer.toHexString(0x00FF & b);
			string.append(hexString.length() == 1 ? "0" + hexString : hexString);
		}
		return string.toString();
	}

	public static String convertStreamToString(java.io.InputStream is) {
		java.util.Scanner s1 = new java.util.Scanner(is, "UTF-8");

		java.util.Scanner s = s1.useDelimiter("\\A");
		String returnString = s.hasNext() ? s.next() : "";
		s1.close();
		s.close();
		return returnString;
	}

	/**
	 * do a search up the file tree to see if any of the containers are a
	 * cookbookVersion
	 *
	 * @param selection
	 * @return
	 */
	public static CookbookVersion getCookbookVersionForResource(
			IResource selection) {

		if (selection == null) {
			return null;
		}

		EObject element = ChefRepositoryManager.INSTANCE.getElement(selection);

		if (element instanceof CookbookVersion) {
			return (CookbookVersion) element;
		}

		/**
		 * either the getParent will return null, and hence the recursive call
		 * will return null or it will recurse up the IContainers
		 */
		return getCookbookVersionForResource(selection.getParent());

	}
}
