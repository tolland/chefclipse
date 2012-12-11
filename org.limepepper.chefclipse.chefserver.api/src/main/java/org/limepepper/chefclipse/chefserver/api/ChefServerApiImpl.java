/**
 *
 */
package org.limepepper.chefclipse.chefserver.api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import opscode.chef.REST.AuthCredentials;
import opscode.chef.REST.JSONRestWrapper;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.limepepper.chefclipse.NameUrlMap;
import org.limepepper.chefclipse.REST.ClientResp;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookListVersionResp;
import org.limepepper.chefclipse.REST.CookbookMetadata;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.EnvironmentResp;
import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.RoleListResp;
import org.limepepper.chefclipse.REST.RoleResp;
import org.limepepper.chefclipse.REST.SearchIndexResp;
import org.limepepper.chefclipse.REST.SearchResultResp;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Sandbox;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.emfjson.EmfJsonWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.ClientResponse;

/**
 *
 * @author tolland
 */
public class ChefServerApiImpl implements ChefServerApi {

    private JSONRestWrapper                 jSONRestWrapper;
    static Logger                           logger    = LoggerFactory
                                                              .getLogger(ChefServerApiImpl.class);
    private static Map<KnifeConfig, Object> instances = new HashMap<KnifeConfig, Object>(
                                                              1);
    AuthCredentials                         auth      = null;

    public static ChefServerApi getServerApi(@NonNull KnifeConfig knifeConfig) {

        if (!instances.containsKey(knifeConfig)) {

            instances.put(knifeConfig, new ChefServerApiImpl(knifeConfig));

        }

        return (ChefServerApi) instances.get(knifeConfig);
    }

    ChefServerApiImpl(KnifeConfig knifeConfig) {
        try {
            auth = new AuthCredentials(knifeConfig.getNode_name(),
                    knifeConfig.getClient_key());
            if (auth == null) {
                throw new Exception("is null");
            } else {
                jSONRestWrapper = new JSONRestWrapper(auth,
                        knifeConfig.getChef_server_url());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JSONObject getRestCookbooks() {
        return getRestCookbooks(3, 0, -1);
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

    public List<CookbookListResp> getCookbooks() {
        JSONObject json = getRestCookbooks();
        return createCookbookListRespList(json);
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

    public CookbookVersionResp getCookbookVersion(String string)
            throws MalformedURLException {
        return getRestCookbookVersion(string);
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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cookbookInfoVersion;

    }

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
            // TODO Auto-generated catch block
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
    public CookbookVersionResp getCookbookVersion(String name, String version) {
        return null;
    }

    @Override
    public List<RoleListResp> getRoles() {
        return null;
    }

    @Override
    public RoleResp getRole(String name) {
        return null;
    }

    @Override
    public List<Node> getNodes() {
        return null;
    }

    @Override
    public Node getNode(String fqdn) {
        return null;
    }

    @Override
    public List<CookbookVersionResp> getNodeCookbooks(String name) {
        return null;
    }

    @Override
    public List<SearchIndexResp> getSearchIndexes() {
        return null;
    }

    @Override
    public SearchResultResp doSearch(String q, String sort, int rows, int start) {
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
    public List<DataBag> getDataBags() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DataBag getDataBag(String bag) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DataBagItem getDataBag(String bag, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Environment> getEnvironments() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EnvironmentResp getEnvironment(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Sandbox> getSandboxes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean putSandbox(Sandbox sandbox) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<CookbookVersionResp> getCookbooksByEnvironment(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<CookbookVersionResp> getCookbookVersionsByEnvironment(
            String environment, String cookbook) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SearchResultResp doSearch(String q) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServerInfo() {
        Map<String, List<String>> query_params = new HashMap<String, List<String>>();

        ClientResponse cr = jSONRestWrapper.rest_head("/", query_params);

        return cr.toString();
    }

    @Override
    public Server getChefServer() {
        return null;
    }

    public void connectChefServer() {

        EmfJsonWrapper.instance().getOjectFromJson();

    }

    @Override
    public NameUrlMap getNodeList() {

        Map<String, List<String>> query_params = new HashMap<String, List<String>>();

        JSONObject jsonObject = jSONRestWrapper.rest_get("/nodes/",
                query_params);
        jSONRestWrapper.asFile(".cache.node-list-.json", jsonObject.toString());

        Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
                "http", new JsResourceFactoryImpl());

        return null;
    }

    @Override
    public NameUrlMap getRoleList() {
        return null;
    }

    @Override
    public NameUrlMap getEnvironmentList() {
        return null;
    }

}
