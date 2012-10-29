package org.limepepper.chefclipse.graphviewer.common;


public class MockAttributeImpl extends AttributeImpl implements ICookbookElement{

	public String name;
	
	public MockAttributeImpl(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
