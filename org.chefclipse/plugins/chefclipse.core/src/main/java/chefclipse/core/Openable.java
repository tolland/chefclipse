package chefclipse.core;

import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;

public abstract class Openable implements IOpenable {

	public Openable(ChefModel parent) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void close() throws ChefModelException {

	}

	/**
	 * Builds this element's structure and properties in the given info object,
	 * based on this element's current contents (reuse buffer contents if this
	 * element has an open buffer, or resource contents if this element does not
	 * have an open buffer). Children are placed in the given newElements table
	 * (note, this element has already been placed in the newElements table).
	 * Returns true if successful, or false if an error is encountered while
	 * determining the structure of this element.
	 */
	protected abstract boolean buildStructure(OpenableElementInfo info,
			IProgressMonitor pm, Map newElements, IResource underlyingResource)
			throws ChefModelException;

	@Override
	public void open(IProgressMonitor progress) throws ChefModelException {

	}

}
