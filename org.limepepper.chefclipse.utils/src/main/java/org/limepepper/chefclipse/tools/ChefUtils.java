package org.limepepper.chefclipse.tools;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
        java.util.Scanner s = new java.util.Scanner(is, "UTF-8")
                .useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

}
