package org.limepepper.chefclipse.graphviewer.common;

public class ChefRelation {
	public ChefElement source;
	public ChefElement target;

	public ChefElement getSource() {
		return source;
	}

	public ChefElement getTarget() {
		return target;
	}

	public ChefRelation(ChefElement source, ChefElement target) {
		this.source = source;
		this.target = target;
	}
}