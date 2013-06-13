package org.limepepper.chefclipse.dltk.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.core.ISourceModule;


public class ModelRoot {
	
	private ISourceModule sourceModule;
	
	private List<Resource> resources = new ArrayList<Resource>();

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public ISourceModule getSourceModule() {
		return sourceModule;
	}

	public void setSourceModule(ISourceModule sourceModule) {
		this.sourceModule = sourceModule;
	}
}
