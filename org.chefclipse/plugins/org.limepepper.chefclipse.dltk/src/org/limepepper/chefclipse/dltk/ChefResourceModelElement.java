package org.limepepper.chefclipse.dltk;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementMemento;
import org.eclipse.dltk.core.ISourceReference;
import org.eclipse.dltk.core.WorkingCopyOwner;
import org.eclipse.dltk.internal.core.util.MementoTokenizer;
import org.limepepper.chefclipse.dltk.model.Resource;

public class ChefResourceModelElement implements IModelElementMemento,
		IAdaptable {

	private final Resource resource;
	private ISourceReference sourceRef;

	public ChefResourceModelElement(Resource resource,
			ISourceReference sourceRef) {
		this.resource = resource;
		this.sourceRef = sourceRef;
	}

	/**
	 * TODO: when is this called?
	 */
	@Override
	public IModelElement getHandleFromMemento(MementoTokenizer memento,
			WorkingCopyOwner owner) {
		System.out.println("ChefModelElement.getHandleFromMemento()");
		return null;
	}

	@Override
	public IModelElement getHandleFromMemento(String token,
			MementoTokenizer memento, WorkingCopyOwner owner) {
		System.out.println("ChefModelElement.getHandleFromMemento()");
		return null;
	}

	public Resource getResource() {
		return resource;
	}

	@Override
	public Object getAdapter(Class adapter) {
		// this is needed in order to open the source file, when user double
		// clicks the node in explorer /invokes the DLTK Open Action/
		if (ISourceReference.class.equals(adapter)) {
			return sourceRef;
		}
		return null;
	}

}
