package org.limepepper.chefclipse.chefserver.api.ui.editors;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

public class RunListEditorInput implements IEditorInput {

	private final KnifeConfig knifeConfig;

	private final RunList itemWithRunList;

	public RunListEditorInput(KnifeConfig knifeConfig, RunList itemWithRunList) {
		this.knifeConfig = knifeConfig;
		this.itemWithRunList = itemWithRunList;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return "RunList Editor";
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "RunList Editor";
	}

	@Override
	public Object getAdapter(Class adapter) {
		System.out.println("not adapter for type :" + adapter.toString());
		return null;
	}

	public KnifeConfig getKnifeConfig() {
		return knifeConfig;
	}

	public RunList getItemWithRunList() {
		return itemWithRunList;
	}
}
