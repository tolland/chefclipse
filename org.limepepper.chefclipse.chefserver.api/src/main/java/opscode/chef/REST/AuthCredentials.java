package opscode.chef.REST;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import opscode.mixlib.authentication.SignedHeaderAuth;

public class AuthCredentials {

    private String     client_name;
    private String     raw_key;
    private File       key_file;
    private PrivateKey key;


    public AuthCredentials(String client_name, File key_file)
            throws IOException {
        this.client_name = client_name;
        this.key_file = new File("resources/chefclipse.pem");

        if (sign_requests())
            load_signing_key();

        assertNotNull(client_name);
        assertNotNull(key_file);
        assertNotNull(key);
    }

/*
 *
 *
 * @raw_key = IO.read(key_file).strip
 *
 * @key = OpenSSL::PKey::RSA.new(@raw_key)
 * rescue SystemCallError, IOError => e
 * Chef::Log.warn "Failed to read the private key #{key_file}: #{e.inspect}"
 * raise Chef::Exceptions::PrivateKeyMissing,
 * "I cannot read #{key_file}, which you told me to use to sign requests!"
 * rescue OpenSSL::PKey::RSAError
 * msg =
 * "The file #{key_file} does not contain a correctly formatted private key.\n"
 * msg <<
 * "The key file should begin with '-----BEGIN RSA PRIVATE KEY-----' and end with '-----END RSA PRIVATE KEY-----'"
 * raise Chef::Exceptions::InvalidPrivateKey, msg
 * end
 */

    private void load_signing_key() throws IOException {

        RandomAccessFile f;

        f = new RandomAccessFile(key_file, "r");
        byte[] b;
        b = new byte[(int) f.length()];
        f.read(b);
        // raw_key = IO.read(key_file);
        setRaw_key(new String(b));
        key = RSAUtils.readKeyFromFile(key_file);
        f.close();

    }

    public boolean sign_requests() {
        return (key_file != null) && key_file.canRead();
    }

/*
 * def signature_headers(request_params={})
 * raise ArgumentError,
 * "Cannot sign the request without a client name, check that :node_name is assigned"
 * if client_name.nil?
 * Chef::Log.debug("Signing the request as #{client_name}")
 * # params_in = {:http_method => :GET, :path => "/clients", :body => "", :host
 * request_params = request_params.dup
 * request_params[:timestamp] = Time.now.utc.iso8601
 * request_params[:user_id] = client_name
 * host = request_params.delete(:host) || "localhost"
 * sign_obj =
 * Mixlib::Authentication::SignedHeaderAuth.signing_object(request_params)
 * signed = sign_obj.sign(key).merge({:host => host})
 * signed.inject({}){|memo, kv| memo["#{kv[0].to_s.upcase}"] = kv[1];memo}
 */

    public Map<String, String> signature_headers(
            Map<String, String> request_params) throws SignatureException,
            IllegalBlockSizeException, BadPaddingException,
            NoSuchPaddingException {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);
        String nowAsISO = df.format(new Date());
        request_params.put("timestamp", nowAsISO);
        request_params.put("client_name", client_name);
        if (request_params.containsKey("host"))
            request_params.remove("host");

        assertNotNull(request_params.get("client_name"));
        assertTrue(request_params.get("client_name").length() > 0);

        SignedHeaderAuth signedHeaderAuth = new SignedHeaderAuth(request_params);
        assertNotNull(signedHeaderAuth);
        return signedHeaderAuth.sign(key, "sha1", "1.0");
    }

    /**
     * @return the raw_key
     */
    public String getRaw_key() {
        return raw_key;
    }

    /**
     * @param raw_key
     *            the raw_key to set
     */
    private void setRaw_key(String raw_key) {
        this.raw_key = raw_key;
    }

}
