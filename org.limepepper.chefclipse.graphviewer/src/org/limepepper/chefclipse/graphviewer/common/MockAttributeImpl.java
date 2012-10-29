package org.limepepper.chefclipse.graphviewer.common;

import org.limepepper.chefclipse.model.cookbook.impl.AttributeImpl;

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
