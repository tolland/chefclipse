package org.limepepper.chefclipse.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.Api;
import org.limepepper.chefclipse.common.chefserver.Node;

public class TestApi {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testApiGetNodes() {

        List<Node> list = Api.INSTANCE.getNodes();
        assertNotNull(list);
        assertTrue(list.size() > 0);

    }

    @Test
    public void testApiGetSinglenode() {

       Node list = Api.INSTANCE.getNode("test1");
        assertNotNull(list);
        assertTrue(list.getName().length() > 0);

    }

}
