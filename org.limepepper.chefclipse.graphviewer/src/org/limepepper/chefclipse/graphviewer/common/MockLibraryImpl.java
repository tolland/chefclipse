package org.limepepper.chefclipse.graphviewer.common;

import org.limepepper.chefclipse.model.cookbook.impl.LibraryImpl;

public class MockLibraryImpl extends LibraryImpl implements ICookbookElement{
	public String name;
	
	public MockLibraryImpl(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
