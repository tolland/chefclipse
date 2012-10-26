/**
 * 
 */
package org.limepepper.chefclipse.graphviewer.controller;

import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook;
import org.limepepper.chefclipse.graphviewer.model.CookbookModel;

/**
 * @author Binhua2
 *
 */
public class CookbookController {
	
	private CookbookModel cookbookModel;
	
	public CookbookController(CookbookModel cookbookModel)
	{
		this.cookbookModel=cookbookModel;
	}
	
	public DrawableCookbook buildDrawableCookbook()
	{
		return null;
	}

}
