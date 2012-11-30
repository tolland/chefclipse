package org.limepepper.chefclipse.chefserver.api;

import java.io.File;
import java.net.URL;

public class Config {
    String client_name;
    File   client_key;
    URL    chef_server_url;

    public Config(String client_name, File client_key, URL chef_server_url) {
        super();
        this.client_name = client_name;
        this.client_key = client_key;
        this.chef_server_url = chef_server_url;
    }
}