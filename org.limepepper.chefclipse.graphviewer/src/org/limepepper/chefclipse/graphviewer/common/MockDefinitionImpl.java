package org.limepepper.chefclipse.graphviewer.common;

import org.limepepper.chefclipse.model.cookbook.impl.DefinitionImpl;

public class MockDefinitionImpl extends DefinitionImpl {
	public String name;
	
	public MockDefinitionImpl(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
