package org.limepepper.chefclipse.testing;

import static org.fest.assertions.api.Fail.fail;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.fest.util.Files;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KnifeConfigUtils {

	static final Logger logger = LoggerFactory
			.getLogger(KnifeConfigUtils.class);

	public static Properties getDefaultServerProperties() {
		Properties props = new Properties();
		try {
			props.load(KnifeConfigUtils.class
					.getResourceAsStream("/default-opscode-tests.properties"));
			return props;
		} catch (IOException ex) {
			fail("Cannot load opscode properties file", ex);
		}
		return null;
	}

	public static KnifeConfig getDefaultKnifeConfig() {
		try {
			return getKnifeConfig(getDefaultServerProperties());
		} catch (MalformedURLException ex) {
			logger.error("Inalid URL in properties file", ex);
			fail("Invalid URL for default chef-server properties file", ex);
		} catch (URISyntaxException ex) {
			logger.error("Inalid URL in properties file", ex);
			fail("Invalid URL for default chef-server properties file", ex);
		}
		return null;
	}

	public static KnifeConfig getKnifeConfig(Properties props)
			throws MalformedURLException, URISyntaxException {
		String client_name = props.getProperty("client_name");
		URL chef_server_url = new URL(props.getProperty("chef_server_url"));

		URL keyUrl = KnifeConfigUtils.class.getResource("/"
				+ props.getProperty("client_key"));
		System.err.println("TTT: " + Files.currentFolder());
		File client_key = null;
		try {
			client_key = java.nio.file.Files.createTempFile(
					props.getProperty("client_key"), "").toFile();
			FileUtils.copyURLToFile(keyUrl, client_key);
		} catch (IOException e) {
			logger.error("Cannot copy pem to temp", e);
		}
		System.err.println(client_key);
		KnifeConfig knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
		knifeConfig.setChef_server_url(chef_server_url);
		knifeConfig.setClient_key(client_key);
		knifeConfig.setNode_name(client_name);
		return knifeConfig;
	}
}
