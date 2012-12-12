package org.limepepper.chefclipse.emfjson.chefserver.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Iterator;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.emf.common.util.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@SuppressWarnings("unused")
public class ChefServerClient {

    static Logger logger = LoggerFactory.getLogger(ChefServerClient.class);

    public static JsonNode getContent(ChefRequest uri, String method) {
        JsonNode node = null;

        // setAuthenticator(uri);

        HttpURLConnection connection = null;
        try {
            connection = getConnection(uri, method);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (connection != null)
            logger.debug(connection.toString());

        try {
            if (connection != null && connection.getResponseCode() == 200) {
                node = getRootNode(connection.getInputStream());
            } else {
                handleNonOKresponse(connection);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (uri.userInfo() != null) {
            Authenticator.setDefault(null);
        }

        return node;
    }

    public static JsonParser getJsonParser(InputStream inStream) {
        final JsonFactory jsonFactory = new JsonFactory();
        JsonParser jp = null;
        try {

            BufferedInputStream bis = new BufferedInputStream(inStream);
            bis.mark(Integer.MAX_VALUE);
            logger.debug("input stream was", convertStreamToString(bis));
            bis.reset();
            jp = jsonFactory.createJsonParser(bis);
        } catch (JsonParseException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return jp;
    }


    public static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is, "UTF-8")
                .useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public static HttpURLConnection getGetConnection(ChefRequest uri)
            throws IOException {
        URL url = null;
        try {
            url = new URL(uri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url != null) {
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            uri.addSignedHeaders(connection);
            return connection;
        } else {
            return null;
        }
    }

    public static HttpURLConnection getConnection(ChefRequest request,
            String type) throws MalformedURLException, IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(request
                .getUri().toString()).openConnection();

        connection.setDoOutput(true);
        connection.setRequestMethod(type);
        connection.setRequestProperty("Content-Type", "application/json");

        connection = request.addSignedHeaders(connection);

        return connection;
    }

    public static void createDataBase(ChefRequest uri) {
        // setAuthenticator(uri);

        HttpURLConnection connection;
        try {
            String db = uri.segments()[0];
            URI baseURI = uri.trimSegments(uri.segmentCount());

            uri.getUri().appendSegment(db);

            connection = getGetConnection(uri);
            connection.setDoOutput(true);
            connection.setRequestMethod(PUT);

            if (checkResponse(connection.getInputStream()) == 0) {
                throw new IllegalArgumentException(
                        "Could not create database on " + uri);
            }

            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (uri.userInfo() != null) {
            Authenticator.setDefault(null);
        }
    }

    public static int checkDataBase(ChefRequest uri) {
        final String[] segments = uri.segments();
        int result = 0;

        if (segments.length == 0) {
            throw new IllegalArgumentException();
        } else {

            // setAuthenticator(uri);

            String database = segments[0];
            URI baseURI = uri.trimSegments(uri.segmentCount());

            HttpURLConnection connection = null;
            try {
                connection = getGetConnection(uri);
                connection.setAllowUserInteraction(true);
                connection.setRequestProperty("Authorization", "Basic");
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return 0;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }

            InputStream inputStream = null;
            try {
                inputStream = connection.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }

            JsonNode node = getRootNode(inputStream);

            if (node != null) {
                if (node.isArray()) {
                    for (Iterator<JsonNode> it = node.getElements(); it
                            .hasNext() && result == 0;) {
                        JsonNode n = it.next();

                        if (database.equalsIgnoreCase(n.getTextValue())) {
                            result = 1;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static boolean isChefServerApiService(ChefRequest uri) {
        final URI baseURI = uri.trimSegments(uri.segmentCount());
        boolean isChefServerApiDB = false;
        // setAuthenticator(uri);

        try {
            HttpURLConnection connection = getGetConnection(uri);
            InputStream inStream = connection.getInputStream();
            try {
                JsonNode node = getRootNode(inStream);
                isChefServerApiDB = node.has("couchdb");
            } catch (Exception e) {
                return false;
            } finally {

                if (uri.userInfo() != null) {
                    Authenticator.setDefault(null);
                }

                inStream.close();
                connection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (uri.userInfo() != null) {
            Authenticator.setDefault(null);
        }

        return isChefServerApiDB;
    }

    private static boolean isUpdate(ChefRequest uri) {
        if (uri.segmentCount() > 1) {
            try {
                HttpURLConnection connection = getGetConnection(uri);
                if (connection.getResponseCode() == 200) {
                    return true;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static void setAuthenticator(URI uri) {
        if (uri.userInfo() != null) {
            final String username = uri.userInfo().split(":")[0];
            final String password = uri.userInfo().split(":")[1];

            Authenticator.setDefault(new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password
                            .toCharArray());
                }
            });

        }
    }

    private static int checkResponse(InputStream inStream) {
        try {
            JsonNode node = getRootNode(inStream);
            if (node != null && node.isObject()) {
                return node.findValue("ok") != null ? 1 : 0;
            }
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private static JsonNode getRootNode(InputStream inStream) {
        final JsonParser parser = getJsonParser(inStream);
        final ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(parser, JsonNode.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static JsonNode emptyNode() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.createObjectNode();
    }

    private static final String GET    = "GET";
    private static final String POST   = "POST";
    private static final String PUT    = "PUT";
    private static final String DELETE = "DELETE";

    private static void handleNonOKresponse(HttpURLConnection connection)
            throws Exception {

        try {
            logger.debug(connection.getResponseMessage());

            InputStream es = connection.getErrorStream();

            java.util.Scanner s = new java.util.Scanner(es);
            s.useDelimiter("\\A");
            logger.debug(s.hasNext() ? s.next() : "");

            s.close();
            es.close();

            throw new Exception("some other repsonbse code:"
                    + connection.getResponseCode());
        } finally {
        }

    }

}
