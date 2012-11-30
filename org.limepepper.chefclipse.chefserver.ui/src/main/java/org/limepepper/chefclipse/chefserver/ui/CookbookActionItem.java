package org.limepepper.chefclipse.chefserver.ui;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.limepepper.chefclipse.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.chefserver.api.ChefServerAPI;
import org.limepepper.chefclipse.chefserver.api.Config;

public class CookbookActionItem implements IObjectActionDelegate {

    public CookbookActionItem() {

    }

    private Properties    props = new Properties();
    private String        client_name;
    private File          client_key;
    private URL           chef_server_url;
    private ChefServerAPI chefServerAPI;

    @Override
    public void run(IAction action) {

        try {
            System.out.println("called the action");
            Config config;
            props.load(new FileInputStream("opscode-tests.properties"));
            client_name = props.getProperty("client_name");
            client_key = new File(props.getProperty("client_key"));
            chef_server_url = new URL(props.getProperty("chef_server_url"));
            assertNotNull(props);
            assertTrue(client_key.exists());
            assertTrue(client_name.length() > 0);

            config = new Config(client_name, client_key, chef_server_url);
            ChefServerAPI repo;

            repo = ChefServerAPI.getInstance(config);
            CookbookListResp cookbook = repo.getCookbookInfo("apache2");
            System.out.println(cookbook.getUrl());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        // TODO Auto-generated method stub

    }

}
