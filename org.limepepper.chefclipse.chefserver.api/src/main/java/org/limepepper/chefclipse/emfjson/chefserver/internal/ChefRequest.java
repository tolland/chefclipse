package org.limepepper.chefclipse.emfjson.chefserver.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import opscode.chef.REST.AuthCredentials;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChefRequest {

    Logger              logger          = LoggerFactory
                                                .getLogger(ChefRequest.class);
    URI                 uri;
    KnifeConfig         knifeConfig;

    Map<String, String> default_headers = new HashMap<String, String>();

    public ChefRequest(@NonNull URI uri, @NonNull  KnifeConfig knifeConfig) {
        super();
        this.uri = uri;
        this.knifeConfig = knifeConfig;
        default_headers.put("X-CHEF-VERSION", "10.8.0");
    }

    public URI getUri() {
        return uri;
    }

    public KnifeConfig getKnifeConfig() {
        return knifeConfig;
    }

    public static Map<String, String> authentication_headers(String method,
            URL url, String json_body, AuthCredentials auth) {

        Map<String, String> request_params = new HashMap<String, String>();
        request_params.put("method", method);
        request_params.put("path", url.getPath());
        request_params.put("body", (json_body == null) ? "" : json_body);
        request_params.put("host", url.getHost() + ":" + url.getPort());

        try {

            return auth.signature_headers(request_params);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return request_params;

    }

    public static Map<String, String> build_headers(String method, URL url,
            Map<String, String> headers, String json_body, boolean raw,
            AuthCredentials auth) {

        if (!raw)
            headers.put("Accept", "application/json");

        if (json_body != null) {
            headers.put("Content-Type", "application/json");
            headers.put("Content-Length", Integer.toString(json_body.length()));
        }

        Map<String, String> auth_headers = authentication_headers(method, url,
                json_body, auth);

        for (String key : auth_headers.keySet()) {
            headers.put(key, auth_headers.get(key));
        }

        return headers;

    }

    public HttpURLConnection addSignedHeaders(HttpURLConnection connection) {

        Map<String, String> auth_headers = null;

        try {
            auth_headers = build_headers(
                    connection.getRequestMethod(),
                    connection.getURL(),
                    default_headers,
                    null,
                    false,
                    new AuthCredentials(knifeConfig.getNode_name(), knifeConfig
                            .getClient_key()));

            for (Entry<String, String> entry : auth_headers.entrySet()) {
                logger.debug("adding header-->>"+entry.getKey().toString() + ":" + entry.getValue());
            }

            for (String key : auth_headers.keySet()) {
                connection.setRequestProperty(key, auth_headers.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        return connection;
    }

    public String userInfo() {
        return getUri().userInfo();
    }

    public String[] segments() {
        return getUri().segments();
    }

    public int segmentCount() {
        return getUri().segmentCount();
    }

    public URI trimSegments(int i) {
        return getUri().trimSegments(i);
    }

    public String toString() {
        return getUri().toString();

    }

}
