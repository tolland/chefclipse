package org.limepepper.chefclipse.structured.json.editor.editors;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;

public class ResourceDeltaVisitor implements IResourceDeltaVisitor {
    /**
	 * 
	 */
	private final MultiPageStructuredJsonEditor multiPageStructuredJsonEditor;
	protected Collection<IFile> changedResources = new ArrayList<IFile>();
    protected Collection<IFile> removedResources = new ArrayList<IFile>();
    protected Collection<IFile> addedResources = new ArrayList<IFile>();

    public ResourceDeltaVisitor(MultiPageStructuredJsonEditor multiPageStructuredJsonEditor) {
		this.multiPageStructuredJsonEditor = multiPageStructuredJsonEditor;
    }

    public boolean visit(IResourceDelta delta) {
        StructuredJsonEditorInput editorInput = (StructuredJsonEditorInput) this.multiPageStructuredJsonEditor.getEditorInput();
        if (delta.getResource().getType() == IResource.FILE) {
            IFile resource = (IFile) delta.getResource();
            if (!editorInput.contains(resource)) {
            	return false;
            }
            if (delta.getKind() == IResourceDelta.REMOVED ||
                    delta.getKind() == IResourceDelta.CHANGED) {
                if (delta.getKind() == IResourceDelta.REMOVED) {
                    removedResources.add((IFile)resource);
                }
            } else if (delta.getKind() == IResourceDelta.ADDED) {
                addedResources.add((IFile)resource);
            }
        }
        return true;
    }

    public Collection<IFile> getChangedResources() {
        return changedResources;
    }

    public Collection<IFile> getRemovedResources() {
        return removedResources;
    }

    public Collection<IFile> getAddedResources() {
        return addedResources;
    }
}