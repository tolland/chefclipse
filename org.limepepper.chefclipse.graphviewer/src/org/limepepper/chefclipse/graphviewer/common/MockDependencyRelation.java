package org.limepepper.chefclipse.graphviewer.common;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.impl.DependencyRelationImpl;


public class MockDependencyRelation extends DependencyRelationImpl {
	public EList<Cookbook> cookbooks;
}