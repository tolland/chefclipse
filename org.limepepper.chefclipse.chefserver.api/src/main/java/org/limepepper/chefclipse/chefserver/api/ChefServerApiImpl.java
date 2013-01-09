/**
 *
 */
package org.limepepper.chefclipse.chefserver.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient.getConnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import opscode.chef.REST.AuthCredentials;
import opscode.chef.REST.JSONRestWrapper;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.NameUrlMap;
import org.limepepper.chefclipse.NameVersionMap;
import org.limepepper.chefclipse.VersionUrl;
import org.limepepper.chefclipse.REST.ClientResp;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookListVersionResp;
import org.limepepper.chefclipse.REST.CookbookMetadata;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.RoleListResp;
import org.limepepper.chefclipse.REST.RoleResp;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.emfjson.EmfJsonWrapper;
import org.limepepper.chefclipse.emfjson.chefserver.ChefServerURIHandler;
import org.limepepper.chefclipse.emfjson.chefserver.internal.ChefRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.ClientResponse;

/**
 * 
 * @author tolland
 */
public class ChefServerApiImpl implements ChefServerApi {

    private JSONRestWrapper jSONRestWrapper;
    static Logger           logger  = LoggerFactory
                                            .getLogger(ChefServerApiImpl.class);

    AuthCredentials         auth    = null;
    Map<String, Object>     options = new HashMap<String, Object>();

    ChefServerApiImpl(KnifeConfig knifeConfig) {

        Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
                "http", new JsResourceFactoryImpl());

        Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
                "https", new JsResourceFactoryImpl());

        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put(
                "application/json", new JsResourceFactoryImpl());

        options.put("knifeConfig", knifeConfig);

        try {
            auth = new AuthCredentials(knifeConfig.getNode_name(),
                    knifeConfig.getClient_key());
            if (auth != null) {
                jSONRestWrapper = new JSONRestWrapper(auth,
                        knifeConfig.getChef_server_url());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    URL getUrl() {
        return ((KnifeConfig) options.get("knifeConfig")).getChef_server_url();
    }

    KnifeConfig getConfig() {
        return (KnifeConfig) options.get("knifeConfig");
    }

    private JSONObject getRestCookbookVersion(String cookbook, int versions)
            throws MalformedURLException {

        Map<String, List<String>> query_params = new HashMap<String, List<String>>();
        query_params.put("num_versions",
                Arrays.asList(new String[] { Integer.toString(versions) }));
        return jSONRestWrapper.rest_get("/cookbooks/" + cookbook + "/_latest",
                query_params);

    }

    private JSONObject getRestCookbooks(int versions, int start, int items) {

        Map<String, List<String>> query_params = new HashMap<String, List<String>>();
        query_params.put("num_versions",
                Arrays.asList(new String[] { Integer.toString(versions) }));
        return jSONRestWrapper.rest_get("/cookbooks", query_params);
    }

    public CookbookVersionResp getRestCookbookVersion(String cookbook)
            throws MalformedURLException {
        JSONObject json = getRestCookbookVersion(cookbook, 3);
        return createCookbookVersionResp(cookbook, json);
    }

    private CookbookVersionResp createCookbookVersionResp(String cookbook,
            JSONObject json) {
        CookbookVersionResp cookbookVersionResp = RESTFactory.eINSTANCE
                .createCookbookVersionResp();
        try {
            cookbookVersionResp.setName(cookbook);
            cookbookVersionResp.setVersion(json.getString("version"));
            cookbookVersionResp.setJsonClass(json.getString("json_class"));
            cookbookVersionResp.setChefType(json.getString("chef_type"));

            for (@SuppressWarnings("unchecked")
            Iterator<String> iterator = json.getJSONObject("metadata")
                    .getJSONObject("dependencies").keys(); iterator.hasNext();) {

                String dep = iterator.next();

                CookbookMetadata cookbookMetadata = cookbookVersionResp
                        .getMetadata();

                cookbookMetadata.getDependencies().add(dep);
            }

        } catch (JSONException e) {
            System.out.println(json);
            e.printStackTrace();
        }
        return cookbookVersionResp;
    }

    public ServerCookbookVersion getCookbookVersion(String string,
            String version) {

        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                ChefserverPackage.eINSTANCE.getServerCookbookVersion());

        ResourceSetImpl resourceSet = new ResourceSetImpl();

        resourceSet.getURIConverter().getURIHandlers()
                .add(0, new ChefServerURIHandler());

        URI uri = URI.createURI(((Config) options.get("knifeConfig"))
                .getChef_server_url().toString()
                + "/cookbooks/"
                + string
                + "/"
                + version);

        Resource resource = resourceSet.createResource(uri);

        try {
            resource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
            fail("failed to load resource");
        }

        ServerCookbookVersion cookbook = (ServerCookbookVersion) resource
                .getContents().get(0);

        assertNotNull(cookbook);
        assertTrue(cookbook.getCookbook_name() != null);

        return cookbook;

    }

    private List<CookbookListResp> createCookbookListRespList(JSONObject json) {

        List<CookbookListResp> cookbooks = new ArrayList<CookbookListResp>();

        try {

            for (@SuppressWarnings("unchecked")
            Iterator<String> iterator = json.keys(); iterator.hasNext();) {
                String key = iterator.next();

                cookbooks.add(createCookbookListResp(key,
                        json.getJSONObject(key)));

            }

        } catch (JSONException e1) {

            e1.printStackTrace();
        }
        return cookbooks;

    }

    private CookbookListResp createCookbookListResp(String cookbook_name,
            JSONObject cookbookJson) {
        CookbookListResp CookbookListResp = RESTFactory.eINSTANCE
                .createCookbookListResp();
        try {
            CookbookListResp.setName(cookbook_name);

            JSONObject json2 = cookbookJson.getJSONObject(cookbook_name);

            CookbookListResp.setUrl(json2.getString("url"));
            JSONArray versionsJSON = json2.getJSONArray("versions");
            for (int i = 0; i < versionsJSON.length(); i++) {
                CookbookListResp.getVersions().add(
                        createCookbookInfoVersionResp(versionsJSON
                                .getJSONObject(i)));

            }

        } catch (JSONException e) {
            System.out.println(cookbookJson);
            e.printStackTrace();
        }
        return CookbookListResp;
    }

    private CookbookListVersionResp createCookbookInfoVersionResp(
            JSONObject jsonObject) {
        CookbookListVersionResp cookbookInfoVersion = RESTFactory.eINSTANCE
                .createCookbookListVersionResp();
        try {
            cookbookInfoVersion.setVersion(jsonObject.getString("version"));
            cookbookInfoVersion.setUrl(jsonObject.getString("url"));
        } catch (JSONException e) {

            e.printStackTrace();
        }
        return cookbookInfoVersion;

    }

    @SuppressWarnings("unused")
    private CookbookVersionResp createCookbook(JSONObject cookbookJson) {
        CookbookVersionResp cookbook = RESTFactory.eINSTANCE
                .createCookbookVersionResp();
        try {
            cookbook.setName(cookbookJson.getString("cookbook_name"));
            cookbook.setDescription(cookbookJson
                    .getString("cookbook_description"));
            cookbook.setMaintainer(cookbookJson
                    .getString("cookbook_maintainer"));
        } catch (JSONException e) {

            e.printStackTrace();
        }
        return cookbook;
    }

    private JSONObject getRestCookbook(String cookbook)
            throws MalformedURLException {

        return getRestCookbook(cookbook, 3);
    }

    private JSONObject getRestCookbook(String cookbook, int versions)
            throws MalformedURLException {
        Map<String, List<String>> query_params = new HashMap<String, List<String>>();
        query_params.put("num_versions",
                Arrays.asList(new String[] { Integer.toString(versions) }));
        return jSONRestWrapper.rest_get("/cookbooks/" + cookbook, query_params);
    }

    public CookbookListResp getCookbookInfo(String cookbook) {

        JSONObject json;
        try {
            json = getRestCookbook(cookbook);

            System.out.println(json);
            return createCookbookListResp(cookbook, json);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CookbookListResp> getCookbooks(int num_versions) {
        return null;
    }

    @Override
    public ServerCookbookVersion getCookbookVersion(String name) {
        return getCookbookVersion(name, "_latest");
    }

    @Override
    public List<Node> getNodes() {

        List<Node> nodes = new ArrayList<Node>();
        Map<String, String> list = getNodeList();
        for (Entry<String, String> entry : list.entrySet()) {
            nodes.add(getNode(entry.getKey()));
        }
        return nodes;
    }

    @Override
    public Node getNode(String name) {

        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                ChefserverPackage.eINSTANCE.getNode());

        ResourceSetImpl resourceSet = new ResourceSetImpl();

        resourceSet.getURIConverter().getURIHandlers()
                .add(0, new ChefServerURIHandler());

        URI uri = URI.createURI(((Config) options.get("knifeConfig"))
                .getChef_server_url().toString() + "/nodes/" + name);

        Resource resource = resourceSet.createResource(uri);

        try {
            resource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
            fail("failed to load resource");
        }

        Node eObject = (Node) resource.getContents().get(0);

        assertNotNull(eObject);
        assertTrue(eObject.getName() != null);

        EList<String> runList = eObject.getRun_list_items();
        for (String runListItem : runList) {
            System.out.println("text is :" + runListItem);
            if (runListItem.startsWith("role[")) {
                Role role = getRole(runListItem.substring("role[".length(),
                        runListItem.length() - 1));

                if (eObject.getRun_list() == null) {
                    eObject.setRun_list(ChefserverFactory.eINSTANCE
                            .createRunList());
                }

                eObject.getRun_list().getRun_list_items().add(role);

            } else if (runListItem.startsWith("recipe[")) {

            }
        }

        return eObject;
    }

    @Override
    public List<CookbookVersionResp> getNodeCookbooks(String name) {
        return null;
    }

    @Override
    public List<ClientResp> getClients() {
        return null;
    }

    @Override
    public ClientResp getClient(String name) {
        return null;
    }

    @Override
    public String getServerInfo() {
        Map<String, List<String>> query_params = new HashMap<String, List<String>>();

        ClientResponse cr = jSONRestWrapper.rest_head("/", query_params);

        return cr.toString();
    }

    public void connectChefServer() {

        EmfJsonWrapper.instance().getOjectFromJson();

    }

    @Override
    public Map<String, String> getNodeList() {

        URI uri = URI.createURI(getUrl().toString() + "/nodes");
        try {

            assertNotNull(uri);
            ResourceSetImpl resourceSet = new ResourceSetImpl();

            HttpURLConnection connection = getConnection(new ChefRequest(uri,
                    getConfig()), "GET");

            Map<String, Object> options = new HashMap<String, Object>();

            options.put(EMFJs.OPTION_ROOT_ELEMENT,
                    ChefclipsePackage.eINSTANCE.getNameUrlMap());

            URL url = null;

            Resource resource = resourceSet.createResource(uri,
                    "application/json");

            assertNotNull(resource);

            final InputStream inStream = connection.getInputStream();

            resource.load(inStream, options);

            inStream.close();

            NameUrlMap user = (NameUrlMap) resource.getContents().get(0);

            assertTrue(user.getEntries() != null);

            return user.getEntries().map();

        } catch (IOException e) {
            e.printStackTrace();
            fail("error");
        } finally {

        }

        return null;
    }

    public List<ServerCookbookVersion> getCookbooks() {

        List<ServerCookbookVersion> items = new ArrayList<ServerCookbookVersion>();
        Map<String, VersionUrl> list = getCookbookList();
        for (Entry<String, VersionUrl> entry : list.entrySet()) {
            items.add(getCookbookVersion(entry.getKey()));
        }
        return items;

    }

    @Override
    public Map<String, VersionUrl> getCookbookList() {
        URI uri = URI.createURI(getUrl().toString()
                + "/cookbooks?start=0&items=25");

        try {

            assertNotNull(uri);
            ResourceSetImpl resourceSet = new ResourceSetImpl();

            HttpURLConnection connection = getConnection(new ChefRequest(uri,
                    getConfig()), "GET");

            Map<String, Object> options = new HashMap<String, Object>();

            options.put(EMFJs.OPTION_ROOT_ELEMENT,
                    ChefclipsePackage.eINSTANCE.getNameVersionMap());

            URL url = null;

            Resource resource = resourceSet.createResource(uri,
                    "application/json");

            assertNotNull(resource);

            final InputStream inStream = connection.getInputStream();

            resource.load(inStream, options);

            inStream.close();

            NameVersionMap user = (NameVersionMap) resource.getContents()
                    .get(0);

            assertNotNull(user);

            return user.getEntries().map();

        } catch (IOException e) {
            e.printStackTrace();
            fail("error");
        } finally {

        }
        return null;
    }

    public static List<KnifeConfig> getKnifeConfigs() {
        return null;
    }

    @Override
    public Map<String, String> getEnvironmentsList() {
        URI uri = URI.createURI(getUrl().toString() + "/environments");

        try {

            assertNotNull(uri);
            ResourceSetImpl resourceSet = new ResourceSetImpl();

            HttpURLConnection connection = getConnection(new ChefRequest(uri,
                    getConfig()), "GET");

            Map<String, Object> options = new HashMap<String, Object>();

            options.put(EMFJs.OPTION_ROOT_ELEMENT,
                    ChefclipsePackage.eINSTANCE.getNameUrlMap());

            URL url = null;

            Resource resource = resourceSet.createResource(uri,
                    "application/json");

            assertNotNull(resource);

            final InputStream inStream = connection.getInputStream();

            resource.load(inStream, options);

            inStream.close();

            NameUrlMap itemMap = (NameUrlMap) resource.getContents().get(0);

            assertNotNull(itemMap);

            return itemMap.getEntries().map();

        } catch (IOException e) {
            e.printStackTrace();
            fail("error");
        } finally {

        }
        return null;
    }

    @Override
    public List<Environment> getEnvironments() {

        List<Environment> environments = new ArrayList<Environment>();
        Map<String, String> list = getEnvironmentsList();
        for (Entry<String, String> entry : list.entrySet()) {
            environments.add(getEnvironment(entry.getKey()));
        }
        return environments;
    }

    @Override
    public Environment getEnvironment(String name) {

        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                ChefserverPackage.eINSTANCE.getEnvironment());

        ResourceSetImpl resourceSet = new ResourceSetImpl();

        resourceSet.getURIConverter().getURIHandlers()
                .add(0, new ChefServerURIHandler());

        URI uri = URI.createURI(((Config) options.get("knifeConfig"))
                .getChef_server_url().toString() + "/environments/" + name);

        Resource resource = resourceSet.createResource(uri);

        try {
            resource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
            fail("failed to load resource");
        }

        Environment eObject = (Environment) resource.getContents().get(0);

        assertNotNull(eObject);
        assertTrue(eObject.getName() != null);

        return eObject;
    }

    @Override
    public List<Role> getRoles() {

        List<Role> items = new ArrayList<Role>();
        Map<String, String> list = getRolesList();
        for (Entry<String, String> entry : list.entrySet()) {
            items.add(getRole(entry.getKey()));
        }
        return items;

    }

    @Override
    public Role getRole(String name) {
        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                ChefserverPackage.eINSTANCE.getRole());

        ResourceSetImpl resourceSet = new ResourceSetImpl();

        resourceSet.getURIConverter().getURIHandlers()
                .add(0, new ChefServerURIHandler());

        URI uri = URI.createURI(((Config) options.get("knifeConfig"))
                .getChef_server_url().toString() + "/roles/" + name);

        Resource resource = resourceSet.createResource(uri);

        try {
            resource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
            fail("failed to load resource");
        }

        Role eObject = (Role) resource.getContents().get(0);

        assertNotNull(eObject);
        assertTrue(eObject.getName() != null);

        return eObject;
    }

    @Override
    public Map<String, String> getRolesList() {
        URI uri = URI.createURI(getUrl().toString() + "/roles");
        try {

            assertNotNull(uri);
            ResourceSetImpl resourceSet = new ResourceSetImpl();

            HttpURLConnection connection = getConnection(new ChefRequest(uri,
                    getConfig()), "GET");

            Map<String, Object> options = new HashMap<String, Object>();

            options.put(EMFJs.OPTION_ROOT_ELEMENT,
                    ChefclipsePackage.eINSTANCE.getNameUrlMap());

            URL url = null;

            Resource resource = resourceSet.createResource(uri,
                    "application/json");

            assertNotNull(resource);

            final InputStream inStream = connection.getInputStream();

            resource.load(inStream, options);

            inStream.close();

            NameUrlMap user = (NameUrlMap) resource.getContents().get(0);

            assertTrue(user.getEntries() != null);

            return user.getEntries().map();

        } catch (IOException e) {
            e.printStackTrace();
            fail("error");
        } finally {

        }

        return null;
    }

}
