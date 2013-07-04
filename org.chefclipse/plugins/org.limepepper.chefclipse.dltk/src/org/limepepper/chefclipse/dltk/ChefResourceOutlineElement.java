package org.limepepper.chefclipse.dltk;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.CompletionRequestor;
import org.eclipse.dltk.core.IBuffer;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.IOpenable;
import org.eclipse.dltk.core.IPackageDeclaration;
import org.eclipse.dltk.core.IProblemRequestor;
import org.eclipse.dltk.core.IScriptModel;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.IType;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.WorkingCopyOwner;
import org.eclipse.ui.views.properties.IPropertySource;
import org.limepepper.chefclipse.dltk.model.Resource;

/**
 * Chef resources are not real DLTK model elements, and the DLTK framework
 * strictly uses {@link IModelElement}s. To fit in, we "emulate" chef model
 * elements by implementing {@link ISourceModule} interface by delegating
 * implementation to the real ruby script file and we override the
 * {@link #getSourceRange()} method in order to link the selection to the source
 * range of the ruby call expression representing the chef resource.
 *
 */
public class ChefResourceOutlineElement implements ISourceModule {

	private final ISourceModule sourceModule;

	/**
	 * Override this method to point to the real chef element
	 */
	public ISourceRange getSourceRange() throws ModelException {
		return new ISourceRange() {

			@Override
			public int getOffset() {
				return getChefResource().getSourceElement().sourceStart();
			}

			@Override
			public int getLength() {
				return getChefResource().getSourceElement().sourceEnd()
						- getOffset();
			}
		};
	}

	/**
	 * Override this to not show children in the outline
	 */
	public boolean hasChildren() throws ModelException {
		return false;
	}

	/**
	 * OVerride this to return no children
	 */
	public IModelElement[] getChildren() throws ModelException {
		return new IModelElement[0];
	}

	public Object getAdapter(Class adapter) {
		if (IPropertySource.class.equals(adapter)) {
			// here we can put own property source for filling the properties
			// page, for example with attributes and actions
			return null;
		}
		return null;
	}

	// /////////////////////////////// DELEGATED METHODS
	public void codeComplete(int offset, CompletionRequestor requestor,
			long timeout) throws ModelException {
		sourceModule.codeComplete(offset, requestor, timeout);
	}

	public void copy(IModelElement container, IModelElement sibling,
			String rename, boolean replace, IProgressMonitor monitor)
			throws ModelException {
		sourceModule.copy(container, sibling, rename, replace, monitor);
	}

	public void commitWorkingCopy(boolean force, IProgressMonitor monitor)
			throws ModelException {
		sourceModule.commitWorkingCopy(force, monitor);
	}

	public void codeComplete(int offset, CompletionRequestor requestor)
			throws ModelException {
		sourceModule.codeComplete(offset, requestor);
	}

	public void codeComplete(int offset, CompletionRequestor requestor,
			WorkingCopyOwner owner, long timeout) throws ModelException {
		sourceModule.codeComplete(offset, requestor, owner, timeout);
	}

	public void close() throws ModelException {
		sourceModule.close();
	}

	public void delete(boolean force, IProgressMonitor monitor)
			throws ModelException {
		sourceModule.delete(force, monitor);
	}

	public IBuffer getBuffer() throws ModelException {
		return sourceModule.getBuffer();
	}

	public void becomeWorkingCopy(IProblemRequestor problemRequestor,
			IProgressMonitor monitor) throws ModelException {
		sourceModule.becomeWorkingCopy(problemRequestor, monitor);
	}

	public void move(IModelElement container, IModelElement sibling,
			String rename, boolean replace, IProgressMonitor monitor)
			throws ModelException {
		sourceModule.move(container, sibling, rename, replace, monitor);
	}

	public boolean hasUnsavedChanges() throws ModelException {
		return sourceModule.hasUnsavedChanges();
	}

	public void codeComplete(int offset, CompletionRequestor requestor,
			WorkingCopyOwner owner) throws ModelException {
		sourceModule.codeComplete(offset, requestor, owner);
	}

	public IModelElement[] codeSelect(int offset, int length)
			throws ModelException {
		return sourceModule.codeSelect(offset, length);
	}

	public int getElementType() {
		return sourceModule.getElementType();
	}

	public boolean isConsistent() throws ModelException {
		return sourceModule.isConsistent();
	}

	public String getElementName() {
		return sourceModule.getElementName();
	}

	public IModelElement getParent() {
		return sourceModule.getParent();
	}

	public void rename(String name, boolean replace, IProgressMonitor monitor)
			throws ModelException {
		sourceModule.rename(name, replace, monitor);
	}

	public void discardWorkingCopy() throws ModelException {
		sourceModule.discardWorkingCopy();
	}

	public boolean isOpen() {
		return sourceModule.isOpen();
	}

	public IModelElement[] codeSelect(int offset, int length,
			WorkingCopyOwner owner) throws ModelException {
		return sourceModule.codeSelect(offset, length, owner);
	}

	public IResource getResource() {
		return null;
	}

	public void makeConsistent(IProgressMonitor progress) throws ModelException {
		sourceModule.makeConsistent(progress);
	}

	public String getSource() throws ModelException {
		return sourceModule.getSource();
	}

	public IPath getPath() {
		return sourceModule.getPath();
	}

	public char[] getSourceAsCharArray() throws ModelException {
		return sourceModule.getSourceAsCharArray();
	}

	public boolean exists() {
		return sourceModule.exists();
	}

	public void open(IProgressMonitor progress) throws ModelException {
		sourceModule.open(progress);
	}

	public ISourceModule getWorkingCopy(IProgressMonitor monitor)
			throws ModelException {
		return sourceModule.getWorkingCopy(monitor);
	}

	public void save(IProgressMonitor progress, boolean force)
			throws ModelException {
		sourceModule.save(progress, force);
	}

	public IModelElement getAncestor(int ancestorType) {
		return sourceModule.getAncestor(ancestorType);
	}

	public IOpenable getOpenable() {
		return sourceModule.getOpenable();
	}

	public IScriptModel getModel() {
		return sourceModule.getModel();
	}

	public ISourceModule getWorkingCopy(WorkingCopyOwner owner,
			IProblemRequestor problemRequestor, IProgressMonitor monitor)
			throws ModelException {
		return sourceModule.getWorkingCopy(owner, problemRequestor, monitor);
	}

	public IScriptProject getScriptProject() {
		return sourceModule.getScriptProject();
	}

	public void reconcile(boolean forceProblemDetection,
			WorkingCopyOwner owner, IProgressMonitor monitor)
			throws ModelException {
		sourceModule.reconcile(forceProblemDetection, owner, monitor);
	}

	public IResource getUnderlyingResource() throws ModelException {
		return sourceModule.getUnderlyingResource();
	}

	public IResource getCorrespondingResource() throws ModelException {
		return sourceModule.getCorrespondingResource();
	}

	public IModelElement getPrimaryElement() {
		return sourceModule.getPrimaryElement();
	}

	public String getHandleIdentifier() {
		return sourceModule.getHandleIdentifier();
	}

	public boolean isStructureKnown() throws ModelException {
		return sourceModule.isStructureKnown();
	}

	public ISourceModule getPrimary() {
		return sourceModule.getPrimary();
	}

	public IModelElement getElementAt(int position) throws ModelException {
		return sourceModule.getElementAt(position);
	}

	public void accept(IModelElementVisitor visitor) throws ModelException {
		sourceModule.accept(visitor);
	}

	public WorkingCopyOwner getOwner() {
		return sourceModule.getOwner();
	}

	public boolean isWorkingCopy() {
		return sourceModule.isWorkingCopy();
	}

	public IType getType(String name) {
		return sourceModule.getType(name);
	}

	public IType[] getTypes() throws ModelException {
		return sourceModule.getTypes();
	}

	public IType[] getAllTypes() throws ModelException {
		return sourceModule.getAllTypes();
	}

	public boolean isReadOnly() {
		return sourceModule.isReadOnly();
	}

	public boolean isPrimary() {
		return sourceModule.isPrimary();
	}

	public IPackageDeclaration getPackageDeclaration(String name) {
		return sourceModule.getPackageDeclaration(name);
	}

	public IPackageDeclaration[] getPackageDeclarations() throws ModelException {
		return sourceModule.getPackageDeclarations();
	}

	public IMethod getMethod(String name) {
		return sourceModule.getMethod(name);
	}

	public IField getField(String string) {
		return sourceModule.getField(string);
	}

	public IField[] getFields() throws ModelException {
		return sourceModule.getFields();
	}

	public boolean isBuiltin() {
		return sourceModule.isBuiltin();
	}

	public boolean isBinary() {
		return sourceModule.isBinary();
	}

	private final Resource chefResource;

	public Resource getChefResource() {
		return chefResource;
	}

	public ChefResourceOutlineElement(Resource resource,
			ISourceModule sourceModule) {
		this.chefResource = resource;
		this.sourceModule = sourceModule;
	}

	@Override
	public Object[] codeSelectAll(int offset, int length) throws ModelException {
		return sourceModule.codeSelectAll(offset, length);
	}

	@Override
	public Object[] codeSelectAll(int offset, int length, WorkingCopyOwner owner)
			throws ModelException {
		return sourceModule.codeSelectAll(offset, length, owner);
	}

}
