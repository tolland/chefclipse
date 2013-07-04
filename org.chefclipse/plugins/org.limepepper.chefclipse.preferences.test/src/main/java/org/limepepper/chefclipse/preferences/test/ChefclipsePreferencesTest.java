/**
 * 
 */
package org.limepepper.chefclipse.preferences.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.ui.actions.SearchKnifeConfigAction;

/**
 * Tests for the preferences plugins
 * 
 * @author Sebastian Sampaoli
 *
 */
public class ChefclipsePreferencesTest {

    private static final String TEST_PREFERENCES_PATH = "test" + File.separator + "resources";
    private static final String FIRST_KNIFE_CONFIG_FILE_NAME = "knife.rb";
    private static final String SECOND_KNIFE_CONFIG_FILE_NAME = "knife1.rb";
    
    @Before
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testFirstCorrectDefinedKnifeConfigFile() {
        File firstFile = new File(TEST_PREFERENCES_PATH, FIRST_KNIFE_CONFIG_FILE_NAME);
        SearchKnifeConfigAction searchAction = new SearchKnifeConfigAction();
        KnifeConfig knifeConfig = searchAction.parse(firstFile);
        assertThat(knifeConfig.getChef_server_url().toExternalForm(), is("https://api.opscode.com/organizations/someorganization"));
        assertThat(knifeConfig.getNode_name(), is("ssampaoli"));
        
        String parentPath = firstFile.getParentFile().getAbsolutePath() + File.separator;
        
        assertThat(knifeConfig.getClient_key().getAbsolutePath(), is(parentPath + "sampaoli.pem"));
        assertThat(knifeConfig.getValidation_client_name(), is("some-validator"));
        assertThat(knifeConfig.getValidation_key().getAbsolutePath(), is(parentPath + "some-validator.pem"));
        assertThat(knifeConfig.getCache_type(), is("'BasicFile'"));
        assertThat(knifeConfig.getCache_option(), is(":path => \"#{ENV['HOME']}/.chef/checksums\""));
        assertThat(knifeConfig.getCookbook_path().getAbsolutePath(), is(parentPath + "../cookbooks"));
    }
    
    @Test
    public void testSecondCorrectDefinedKnifeConfigFile() {
        File firstFile = new File(TEST_PREFERENCES_PATH, SECOND_KNIFE_CONFIG_FILE_NAME);
        SearchKnifeConfigAction searchAction = new SearchKnifeConfigAction();
        KnifeConfig knifeConfig = searchAction.parse(firstFile);
        assertThat(knifeConfig.getChef_server_url().toExternalForm(), is("http://localhost:4000"));
        assertThat(knifeConfig.getNode_name(), is(""));
        assertThat(knifeConfig.getClient_key().getAbsolutePath(), is("/etc/chef/client.pem"));
        assertThat(knifeConfig.getValidation_client_name(), is("chef-validator"));
        assertThat(knifeConfig.getValidation_key().getAbsolutePath(), is("/etc/chef/validation.pem"));
        assertThat(knifeConfig.getCache_type(), is("'BasicFile'"));
        assertThat(knifeConfig.getCache_option(), is(":path => \"/var/chef/cache/checksums\", :skip_expires => true"));
        assertThat(knifeConfig.getCookbook_path().getAbsolutePath(), is("/var/chef/cookbooks"));
        assertThat(knifeConfig.getCookbook_copyright(), is("YOUR_COMPANY_NAME"));
        assertThat(knifeConfig.getCookbook_email(), is("YOUR_EMAIL"));
        assertThat(knifeConfig.getCookbook_license(), is("none"));
    }

}
