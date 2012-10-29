package org.limepepper.chefclipse.graphviewer.common;


public class MockDefinitionImpl extends DefinitionImpl implements ICookbookElement {
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
