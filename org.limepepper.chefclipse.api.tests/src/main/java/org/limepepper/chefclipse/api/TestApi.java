package org.limepepper.chefclipse.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.Api;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.testing.KnifeConfigUtils;

public class TestApi {

    KnifeConfig knifeConfig;

    /**
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    	knifeConfig = KnifeConfigUtils.getDefaultKnifeConfig();
    }

    @Test
    public void testApiGetNodes() {

        List<Node> list = Api.INSTANCE.getNodes(knifeConfig);
        assertNotNull(list);
        assertTrue(list.size() > 0);

    }

    @Test
    public void testApiGetSinglenode() {

        Node list = Api.INSTANCE.getNode(knifeConfig, "test1");
        assertNotNull(list);
        assertTrue(list.getName().length() > 0);

    }

}
