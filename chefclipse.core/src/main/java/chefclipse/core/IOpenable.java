package chefclipse.core;

import org.eclipse.core.runtime.IProgressMonitor;

public interface IOpenable {

	public void close() throws ChefModelException;

	// public String findRecommendedLineSeparator() throws ChefModelException;

	// public IBuffer getBuffer() throws ChefModelException;

	// boolean hasUnsavedChanges() throws ChefModelException;

	// boolean isConsistent() throws ChefModelException;

	// boolean isOpen();

	// void makeConsistent(IProgressMonitor progress) throws ChefModelException;

	public void open(IProgressMonitor progress) throws ChefModelException;

	// public void save(IProgressMonitor progress, boolean force)
	// throws ChefModelException;
}
