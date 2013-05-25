/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.repositories;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastian Sampaoli
 *
 */
public enum MultipleVendorCategoryProvider {
	
	INSTANCE;
	
	private Map<String,String> categoriesMap = new HashMap<String, String>() {
	   
		private static final long serialVersionUID = -4150951188115675124L;

		{
	        //Organization owners
	    	put("as-", "Atalanta");
	        put("co-", "Coroutine");
	        put("db-", "Digital Butter");
	        put("el-", "Edelight");
	        put("ey-", "Engine Yard");
	        put("hw-", "Heavy Water");
	        put("ic-", "Infochimps");
	        put("mc-", "Modcloth");
	        put("nd-", "Needle");
	        put("oc-", "OpsCode");
	        put("rs-", "Right Scale");
	        put("ss-", "Silver Sky");
	        put("su-", "Sensu");
	        //Individual owners
	        put("ap-", "Individual Owner");
	        put("ao-", "Individual Owner");
	        put("cr-", "Individual Owner");
	        put("jv-", "Individual Owner");
	        put("km-", "Individual Owner");
	        put("ko-", "Individual Owner");
	        put("yv-", "Individual Owner");
	    }
	};


	public String getCategory(String name){
		
		String categoryPrefix = name.substring(0, 3);
		if (categoriesMap.containsKey(categoryPrefix)){
			return categoriesMap.get(categoryPrefix);
		}
		return "Uncategorized";
	}

}
