package opscode.chef.REST;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * 
 * this script maps some calls between the opscode mixlib-authentication lib
 * structure and the java requirements
 * 
 * provides a mapping to the calls handled by ruby rest libs
 * 
 * @author tomhodder
 * 
 * 
 */

public class JSONRestWrapper {

    Logger                  logger          = LoggerFactory
                                                    .getLogger(JSONRestWrapper.class);

    private WebResource     service;
    private AuthCredentials auth;
    private URL             url;

    Map<String, String>     default_headers = new HashMap<String, String>();

    // static Map<String, String> config = new HashMap<String, String>();

    public JSONRestWrapper(AuthCredentials auth, URL url) {
        this.auth = auth;
        this.url = url;
        ClientConfig cc = new DefaultClientConfig();
        Client client = Client.create(cc);
        client.addFilter(new LoggingFilter(System.out));
        service = client.resource(url.toString());
        
        default_headers.put("X-CHEF-VERSION", "10.8.0");

    }

    /**
     * @param path
     *            is the service relative path of the request.
     * @param params
     *            is a named list of multivalued paramaters, e.g.
     *            ?p=1&q=1,2,3&r=&s=123
     *            so it is requied to collapse the list in some suitable fashion
     *            into the querystring
     * @return
     * @throws MalformedURLException
     * 
     */
    public JSONObject rest_get(String path, Map<String, List<String>> params)
            throws MalformedURLException {

        final String method = "GET";

        Map<String, String> headers = default_headers;

        MultivaluedMap<String, String> query_params = new MultivaluedMapImpl();
        query_params.putAll(params);

        WebResource.Builder builder = getService().path(path)
                .queryParams(query_params).getRequestBuilder();

        logger.debug("Created WebResource.Builder with the following details");
        logger.debug("path:" + path);
        logger.debug("query_params:");

        for (Entry<String, List<String>> key : query_params.entrySet()) {
            logger.debug("key:" + key.getKey().toString());
            for (String val : key.getValue()) {
                logger.debug("val:" + val);
            }

        }

        logger.debug("server:" + service.toString());

        Map<String, String> auth_headers = null;

        auth_headers = build_headers(method, new URL(url.toString() + path),
                headers, null, false);

        logger.debug("auth_headers:");

        for (Entry<String, String> entry : auth_headers.entrySet()) {
            logger.debug(entry.getKey().toString() + ":" + entry.getValue());
        }

        for (String key : auth_headers.keySet()) {
            builder.header(key, auth_headers.get(key));
        }

        builder.accept(MediaType.APPLICATION_JSON_TYPE);

        JSONObject response = builder.get(JSONObject.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
        try {
            logger.debug(mapper.defaultPrettyPrintingWriter()
                    .writeValueAsString(response));
        } catch (JsonGenerationException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }

    public ClientResponse rest_head(String path,
            Map<String, List<String>> params) {

        final String method = "HEAD";

        Map<String, String> headers = new HashMap<String, String>();

        MultivaluedMap<String, String> query_params = new MultivaluedMapImpl();
        query_params.putAll(params);

        WebResource.Builder builder = getService().path(path)
                .queryParams(query_params).getRequestBuilder();

        Map<String, String> auth_headers = null;
        try {
            auth_headers = build_headers(method,
                    new URL(url.toString() + path), headers, null, false);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        for (String key : auth_headers.keySet()) {
            builder.header(key, auth_headers.get(key));
        }

        return builder.accept(MediaType.APPLICATION_JSON_TYPE).head();

    }

    Map<String, String> authentication_headers(String method, URL url,
            String json_body) {

        Map<String, String> request_params = new HashMap<String, String>();
        request_params.put("method", method);
        request_params.put("path", url.getPath());
        request_params.put("body", (json_body == null) ? "" : json_body);
        request_params.put("host", url.getHost() + ":" + url.getPort());

        try {

            return auth.signature_headers(request_params);
        } catch (SignatureException | IllegalBlockSizeException
                | NoSuchPaddingException | BadPaddingException e) {
            e.printStackTrace();
        }
        return request_params;

    }

    Map<String, String> build_headers(String method, URL url,
            Map<String, String> headers, String json_body, boolean raw) {

        if (!raw)
            headers.put("Accept", "application/json");

        if (json_body != null) {
            headers.put("Content-Type", "application/json");
            headers.put("Content-Length", Integer.toString(json_body.length()));
        }

        Map<String, String> auth_headers = authentication_headers(method, url,
                json_body);

        for (String key : auth_headers.keySet()) {
            headers.put(key, auth_headers.get(key));
        }

        return headers;

    }

    public WebResource getService() {
        return service;
    }
}
