package org.limepepper.chefclipse.chefserver.ui;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import org.limepepper.chefclipse.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.chefserver.api.ChefServerAPI;

public class someTEst {

    @Test
    public void test() throws IOException {
        ChefServerAPI repo = ChefServerAPI.getInstance(null);
        CookbookListResp cookbook = repo.getCookbookInfo("apache2");
        
        assertNotNull(cookbook);
        
    }

}
