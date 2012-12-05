package org.limepepper.chefclipse.chefserver.api;

import java.net.MalformedURLException;
import java.util.List;

import org.limepepper.chefclipse.REST.ClientResp;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.EnvironmentResp;
import org.limepepper.chefclipse.REST.NodeListResp;
import org.limepepper.chefclipse.REST.NodeResp;
import org.limepepper.chefclipse.REST.RoleListResp;
import org.limepepper.chefclipse.REST.RoleResp;
import org.limepepper.chefclipse.REST.SearchIndexResp;
import org.limepepper.chefclipse.REST.SearchResultResp;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Sandbox;

/**
 * @author tomhodder
 * 
 */
public interface IChefServerAPI {

    /**
     * provides a function that returns the banner from the server as a means to
     * test a connection
     * 
     * @return string containing the HTTP banner
     */
    String getServerInfo();

    /**
     * @return list of cookbooks in JSON response format objects (i.e. not the
     *         CookbookVersion object that is used in the model
     * @throws MalformedURLException 
     */
    List<CookbookListResp> getCookbooks() throws MalformedURLException;

    /*
     * from Server API;
     * http://wiki.opscode.com/display/chef/Server+API#ServerAPI-%2Fcookbooks%2F
     * COOKBOOKNAME%2FCOOKBOOKVERSION
     * Returns a hash of all the cookbooks and their versions. Query parameter
     * num_versions can be used to set the number of versions being returned.
     * For example, GET to /cookbooks?num_versions=3 returns 3 latest versions,
     * in descending order (high to low); /cookbooks?num_versions=all returns
     * all available versions, in descending order (high to low). If
     * num_versions is not specified, it defaults to 1. Note that 0 is a valid
     * input that returns an empty array for the versions of each cookbooks.
     */

    /**
     * @return list of clients
     */
    List<ClientResp> getClients();

    ClientResp getClient(String name);

    // #/cookbooks
    // #/cookbooks/COOKBOOK_NAME
    // #/cookbooks/COOKBOOK_NAME/COOKBOOK_VERSION

    /**
     * @param num_versions
     * @return
     */
    List<CookbookListResp> getCookbooks(int num_versions);

    /**
     * @param name
     * @return list of
     * @throws MalformedURLException 
     */
    CookbookListResp getCookbookInfo(String name) throws MalformedURLException;

    /**
     * @param name
     *            the identifier of the cookbook to retrieve
     * @param version
     *            the version string of the cookbook, or leave null to retrieve
     *            "_latest"
     * @return a CookbookVersionResp response object which reflects the JSON
     *         object...
     * 
     */
    CookbookVersionResp getCookbookVersion(String name, String version);

    /**
     * @return List of Data bags
     * 
     * 
     *         #/data
     *         #/data/DATA_BAG_NAME
     *         #/data/DATA_BAG_NAME/DATA_BAG_ITEM_ID
     */
    List<DataBag> getDataBags();

    /*
     * /data/DATA_BAG_NAME
     * HTTP Methods
     * GET
     * 
     * Returns a hash of all the entries in the given bag.
     * Response
     * Response to a GET on /data/DATA_BAG_NAME
     * {
     * "adam": "http://localhost:4000/data/users/adam"
     * }
     * 
     * Returns "200 OK".
     * Returns "401 Unauthorized" if the user is not allowed to view the bag.
     * Returns "404 Not Found" if the bag does not exist.
     */
    DataBag getDataBag(String bag);

    /*
     * /data/DATA_BAG_NAME/DATA_BAG_ITEM_ID
     * 
     * This endpoint allows you to show/manipulate data bag items within a bag.
     * The data bag item itself can be any arbitrary JSON you construct.
     * HTTP Methods
     * GET
     * 
     * Returns the data bag item in the bag.
     * Response
     * Response to a GET on /data/DATA_BAG_NAME/DATA_BAG_ITEM_ID
     * {
     * "real_name": "Adam Jacob",
     * "id": "adam"
     * }
     * 
     * Returns "200 OK"
     * Returns "401 Unauthorized"
     * Returns "404 Not Found"
     */

    DataBagItem getDataBag(String bag, String name);

    /*
     * 
     * 
     * 
     */

    List<RoleListResp> getRoles();

    RoleResp getRole(String name);

    /*
     * 
     * 
     * 
     */

    List<NodeListResp> getNodes();

    NodeResp getNode(String fqdn);

    /*
     * Environments
     * /environments
     * HTTP Methods
     * GET
     * 
     * A GET call to /environments returns a data structure that contains links
     * to each available environment.
     * Response
     * Response to GET /environments
     * {
     * "webserver": "http://localhost:4000/environments/webserver"
     * }
     */

    List<Environment> getEnvironments();

    EnvironmentResp getEnvironment(String name);

    /*
     * 
     * 
     * 
     * 
     */

    List<CookbookVersionResp> getNodeCookbooks(String name);

    /*
     * 
     * Search
     * 
     * /search
     * /search/INDEX
     */

    List<SearchIndexResp> getSearchIndexes();

    /*
     * The response contains the total number of rows that matched your request,
     * the position this result set returns (useful for paging) and the rows
     * themselves.
     * 
     * You can modify the search results with the following request parameters:
     * Param Description
     * q A valid search string.
     * sort A sort string, such as 'name DESC'
     * rows How many rows to return
     * start The result number to start from
     */

    SearchResultResp doSearch(String q);

    SearchResultResp doSearch(String q, String sort, int rows, int start);

    /*
     * 
     * /sandboxes
     * /sandboxes/SANDBOX_ID
     * /sandboxes/SANDBOX_ID/CHECKSUM
     * Sandboxes
     * 
     * Sandboxes are used to commit files so that they only have to be uploaded
     * once, as opposed to each time a cookbook is uploaded, even if only one
     * file has changed.
     * 
     * return to top of page
     * /sandboxes
     * 
     * Create or list sandboxes.
     */

    List<Sandbox> getSandboxes();

    boolean putSandbox(Sandbox sandbox);

    List<CookbookVersionResp> getCookbooksByEnvironment(String name);

    List<CookbookVersionResp> getCookbookVersionsByEnvironment(
            String environment, String cookbook);

}