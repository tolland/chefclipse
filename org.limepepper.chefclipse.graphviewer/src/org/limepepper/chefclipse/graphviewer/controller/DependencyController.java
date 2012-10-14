package org.limepepper.chefclipse.graphviewer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.limepepper.chefclipse.graphviewer.common.ChefElement;
import org.limepepper.chefclipse.graphviewer.common.ChefRelation;
import org.limepepper.chefclipse.graphviewer.common.Cookbook;
import org.limepepper.chefclipse.graphviewer.common.Recipe;
import org.limepepper.chefclipse.graphviewer.model.DependencyModel;

public class DependencyController {
	static private DependencyController sController=null;
	
	static public DependencyController getController()
	{
		if(sController==null)
		{
			sController=new DependencyController();
		}
		return sController;
	}
	
	public void removeDependency(ChefRelation chefRelation)
	{
		ChefElement source = chefRelation.getSource();
		ChefElement target = chefRelation.getTarget();
		
		source.remvoeChild(target);
		target.removeParent(source);
		DependencyModel.getModel().notifyDependencyChanged();
	}
	
	public void removeNode(ChefElement chefElement)
	{
		//remove chefElement from all its parent nodes.
		List<ChefElement> parent = chefElement.getParent();
		if(parent!=null)
		{
			for(ChefElement p:parent)
			{
				p.remvoeChild(chefElement);
			}
		}
		
		//remove chefElement from all its children nodes.
		List<ChefElement> children1 = chefElement.getChildren();
		if(children1!=null)
		{
			for(ChefElement child:children1)
			{
				child.removeParent(chefElement);
			}
		}
		
		DependencyModel.getModel().notifyDependencyChanged();
	}
	
	public Cookbook getRootCookbook() {
		Recipe mysql_R1 = new Recipe("default.rb", null);
		Recipe mysql_R2 = new Recipe("client.rb", null);
		Recipe mysql_R3 = new Recipe("server.rb", null);
		Cookbook mysqlCb = new Cookbook("mysql v1.3.0 (Databases)",
				new ArrayList<Recipe>(Arrays.asList(new Recipe[] { mysql_R1, mysql_R2, mysql_R3 })));

		Recipe apt_R1 = new Recipe("default.rb", null);
		Recipe apt_R2 = new Recipe("cacher-client.rb", null);
		Recipe apt_R3 = new Recipe("cacher-ng.rb", null);
		Cookbook aptCb = new Cookbook("mysql v1.1.16 (Web Servers)",
				new ArrayList<Recipe>(Arrays.asList(new Recipe[] { apt_R1, apt_R2, apt_R3 })));

		Recipe apache2_R1 = new Recipe("mod_auth_basic.rb",
				new ArrayList<Cookbook>(Arrays.asList(new Cookbook[] { mysqlCb, aptCb })));
		Recipe apache2_R2 = new Recipe("mod_authz_groupfile.rb", null);
		Recipe apache2_R3 = new Recipe("mod_authz_host.rb", null);
		Recipe apache2_R4 = new Recipe("mod_proxy_balancer.rb",
				new ArrayList<Cookbook>(Arrays.asList(new Cookbook[] { aptCb })));
		Cookbook apache2Cb = new Cookbook("apt v1.4.8 (Package Management)",
				new ArrayList<Recipe>(Arrays.asList(new Recipe[] { apache2_R1, apache2_R2,
						apache2_R3, apache2_R4 })));

		Recipe yum_R1 = new Recipe("default.rb", null);
		Recipe yum_R2 = new Recipe("epel.rb", null);
		Recipe yum_R3 = new Recipe("ius.rb", null);
		Cookbook yumCb = new Cookbook("yum v1.0.0 (Package Management)",
				new ArrayList<Recipe>(Arrays.asList(new Recipe[] { yum_R1, yum_R2, yum_R3 })));

		Recipe php_R1 = new Recipe("default.rb",
				new ArrayList<Cookbook>(Arrays.asList(new Cookbook[] { apache2Cb })));
		Recipe php_R2 = new Recipe("module_apc.rb", null);
		Recipe php_R3 = new Recipe("module_curl.rb",
				new ArrayList<Cookbook>(Arrays.asList(new Cookbook[] { mysqlCb, yumCb })));
		Recipe php_R4 = new Recipe("module_module_mysql.rb",
				new ArrayList<Cookbook>(Arrays.asList(new Cookbook[] { mysqlCb, aptCb })));
		Cookbook phpCb = new Cookbook("php v1.1.0 (Programming Languages)",
				new ArrayList<Recipe>(Arrays.asList(new Recipe[] { php_R1, php_R2, php_R3, php_R4 })));

		return phpCb;
	}
}
