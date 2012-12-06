package opscode.mixlib.authentication;

import static org.junit.Assert.fail;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.core.util.Base64;

public class Digester {

Logger logger = LoggerFactory.getLogger(Digester.class);

    public static String hash_file(File f) {
        
        Logger logger = LoggerFactory.getLogger(Digester.class);
/*
 *  * digester = Digest::SHA1.new
 * buf = ""
 * while f.read(16384, buf)
 * digester.update buf
 * end
 * ::Base64.encode64(digester.digest).chomp
 */
        MessageDigest sha1;
        try {
            sha1 = MessageDigest.getInstance("SHA1");
            logger.debug("encoded:",Base64.encode(sha1.digest(("").getBytes())));

            return new String(Base64.encode(sha1.digest("".getBytes())));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            fail();
        }
        return null;

    }

    public static String hash_string(String str)
            throws NoSuchAlgorithmException {
        MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        return new String(Base64.encode(sha1.digest(str.getBytes())));
    }

/*
 * def hash_file(f)
 * digester = Digest::SHA1.new
 * buf = ""
 * while f.read(16384, buf)
 * digester.update buf
 * end
 * ::Base64.encode64(digester.digest).chomp
 * end
 * 
 * # Digests a string, base64's and chomps the end
 * #
 * # ====Parameters
 * #
 * def hash_string(str)
 * ::Base64.encode64(Digest::SHA1.digest(str)).chomp
 * end
 */

}
