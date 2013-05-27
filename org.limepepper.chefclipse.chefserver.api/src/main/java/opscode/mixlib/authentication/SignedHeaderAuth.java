package opscode.mixlib.authentication;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.core.util.Base64;

/*
 * lazily ported from the origin opscode;
 * opscode/mixlib-authentication
 *
 * require 'time'
 * require 'base64'
 * require 'digest/sha1'
 * require 'mixlib/authentication'
 * require 'mixlib/authentication/digester'
 */

public class SignedHeaderAuth {

	Logger logger = LoggerFactory.getLogger(SignedHeaderAuth.class);

	// NULL_ARG = Object.new

	static final String[] SUPPORTED_ALGORITHMS = { "sha1" };
	static final String[] SUPPORTED_VERSIONS = { "1.0", "1.1" };

	static final String DEFAULT_SIGN_ALGORITHM = "sha1";
	static final String DEFAULT_PROTO_VERSION = "1.0";
	private static String sign_version;

	String client_name;
	String http_method;
	String body;
	String host;
	String timestamp;
	String file;
	String proto_version;
	private Map<String, String> request_params;

	public SignedHeaderAuth(Map<String, String> request_params) {
		client_name = request_params.get("client_name");
		this.request_params = request_params;

		logger.debug("Created new SignedHeaderAuth for:" + client_name);

		for (Entry<String, String> entry : request_params.entrySet()) {
			logger.debug(entry.getKey().toString() + ":" + entry.getValue());
		}
	}

	String getAlgorithm() {
		return DEFAULT_SIGN_ALGORITHM;
	}

	String getProto_version() {
		return DEFAULT_PROTO_VERSION;

	}

	/*
	 *
	 * http://apidock.com/ruby/v1_9_2_180/OpenSSL/PKey/RSA/private_encrypt
	 */
	public Map<String, String> sign(PrivateKey private_key,
			String sign_algorithm, String sign_version)
			throws SignatureException, IllegalBlockSizeException,
			BadPaddingException, NoSuchPaddingException {

		Map<String, String> header_hash = new HashMap<String, String>();

		try {

			header_hash.put("X-Ops-Sign", "algorithm=" + sign_algorithm
					+ ";version=" + sign_version + ";");
			header_hash.put("X-Ops-Userid", client_name);
			header_hash.put("X-Ops-Timestamp", canonical_time());
			header_hash.put("X-Ops-Content-Hash", hashed_body());

			String plaintext = canonicalize_request(sign_algorithm,
					sign_version);

			assertTrue(plaintext.length() > 0);

			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, private_key);
			byte[] signature = cipher.doFinal(plaintext.getBytes());

			logger.debug("Input data: ======>", plaintext);

			String signed_string = new String(Base64.encode(signature));
			logger.debug("Signature: " + signed_string);

			String[] signature_lines = signed_string.split("(?<=\\G.{60})");

			for (int idx = 0; idx < signature_lines.length; idx++) {
				String key = "X-Ops-Authorization-" + (idx + 1);
				header_hash.put(key, signature_lines[idx]);
			}

			logger.debug("String to sign:" + plaintext);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			fail();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
			fail();

		}
		return header_hash;

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
	 *
	 * def hashed_body # Hash the file object if it was passed in, otherwise
	 * hash based on # the body. # TODO: tim 2009-12-28: It'd be nice to just
	 * remove this special case, # always sign the entire request body, using
	 * the expanded multipart # body in the case of a file being include.
	 *
	 * @hashed_body ||= (self.file && self.file.respond_to?(:read)) ?
	 * digester.hash_file(self.file) : digester.hash_string(self.body) end
	 */
	String hashed_body() throws NoSuchAlgorithmException {
		return Digester.hash_string(request_params.get("body"));

	}

	String canonical_time() {
		return request_params.get("timestamp");
	}

	String canonical_path() {

		return request_params.get("path");
	}

	String hashed_path() throws NoSuchAlgorithmException {
		return Digester.hash_string(request_params.get("path"));
	}

	String canonicalize_request(String algorithm, String version)
			throws NoSuchAlgorithmException {

		/*
		 * unless SUPPORTED_ALGORITHMS.include?(sign_algorithm) &&
		 * SUPPORTED_VERSIONS.include?(sign_version) raise AuthenticationError,
		 * "Bad algorithm '#{sign_algorithm}' (allowed: #{SUPPORTED_ALGORITHMS.inspect}) or version '#{sign_version}' (allowed: #{SUPPORTED_VERSIONS.inspect})"
		 * end
		 *
		 * def canonicalize_request(sign_algorithm=algorithm,
		 * sign_version=proto_version)
		 *
		 * canonical_x_ops_user_id = canonicalize_user_id(user_id, sign_version)
		 * "Method:#{http_method.to_s.upcase}\nHashed Path:#{digester.hash_string(canonical_path)}\nX-Ops-Content-Hash:#{hashed_body}\nX-Ops-Timestamp:#{canonical_time}\nX-Ops-UserId:#{canonical_x_ops_user_id}"
		 * end
		 */

		String req = "Method:"
				+ request_params.get("method")
				+ "\nHashed Path:"
				+ hashed_path()
				+ "\nX-Ops-Content-Hash:"
				+ hashed_body()
				+ "\n"
				+ "X-Ops-Timestamp:"
				+ canonical_time()
				+ "\n"
				+ "X-Ops-UserId:"
				+ canonicalize_user_id(request_params.get("client_name"),
						sign_version);

		logger.debug("req:" + req);
		return req;
	}

	String canonicalize_user_id(String client_name, String proto_version) {

		return request_params.get("client_name");
	}

	/*
	 * // private :canonical_time, :canonical_path, :parse_signing_description,
	 * :digester, :canonicalize_user_id
	 *
	 * # === SigningObject # A Struct-based value object that contains the
	 * necessary information to # generate a request signature.
	 * `SignedHeaderAuth.signing_object()` # provides a more convenient
	 * interface to the constructor. class SigningObject <
	 * Struct.new(:http_method, :path, :body, :host, :timestamp, :user_id,
	 * :file, :proto_version) include SignedHeaderAuth
	 *
	 * truct.new(:http_method, :path, :body, :host, :timestamp, :user_id, :file,
	 * :proto_version)
	 *
	 * def proto_version (self[:proto_version] or DEFAULT_PROTO_VERSION).to_s
	 * end end
	 */

	/*
	 * private class SigningObject { String http_method, path, body, host,
	 * timestamp, client_name, file, proto_version;
	 *
	 * public SigningObject(String http_method, String path, String body, String
	 * host, String timestamp, String client_name, String file, String
	 * proto_version) { super(); this.http_method = http_method; this.path =
	 * path; this.body = body; this.host = host; this.timestamp = timestamp;
	 * this.client_name = client_name; this.file = file; this.proto_version =
	 * proto_version; }
	 *
	 * private String proto_version() { return proto_version != null ?
	 * proto_version : DEFAULT_PROTO_VERSION; } }
	 */
}
