package org.limepepper.chefclipse.dltk.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ast.expressions.CallExpression;

public class Resource {

	/**
	 * Resources as specified here:
	 * http://docs.opscode.com/chef/resources.html#resources
	 */
	public static final List<String> RESOURCE_TYPES = Arrays.asList(new String[] {
			"apt_package", "bash", "chef_gem", "cookbook_file", "cron", "csh",
			"deploy", "directory", "dpkg_package", "easy_install_package",
			"env", "erl_call", "execute", "file", "freebsd_package",
			"gem_package", "git", "group", "http_request", "ifconfig",
			"ips_package", "link", "log", "macports_package", "mdadm", "mount",
			"ohai", "package", "pacman_package", "perl", "portage_package",
			"powershell_script", "python", "registry_key", "remote_directory",
			"remote_file", "rpm_package", "route", "ruby", "ruby_block", "scm",
			"script", "service", "smartos_package", "solaris_package",
			"subversion", "template", "user", "yum" });

	private String resourceType;
	
	private String name;

	private Map<String, String> attributes = new HashMap<String, String>();

	private String action;

	private CallExpression callExpression;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public void setSourceElement(CallExpression callExpression) {
		this.callExpression = callExpression;		
	}
	
	public CallExpression getSourceElement() {
		return callExpression;
	}

	public String getDisplayName() {
		return resourceType + " " + (name != null ? name : "");
	}

}
