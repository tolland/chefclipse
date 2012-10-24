package org.limepepper.chefclipse.navigator.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFolder;
import org.limepepper.chefclipse.common.ui.resources.ChefProjectManager;

public class ChefResourcesPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if(property.equals("isWorkstationFolder") && (receiver instanceof IFolder)){
			return ((IFolder)receiver).getName().equals(ChefProjectManager.WORKSTATION_FOLDER);
		}
			
		return false;
	}

	

}
