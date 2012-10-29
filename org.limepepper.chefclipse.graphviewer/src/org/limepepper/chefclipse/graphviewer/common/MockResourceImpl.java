package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class MockResourceImpl extends ResourceImpl implements ICookbookElement {
	public String name;
	
	public MockResourceImpl(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
