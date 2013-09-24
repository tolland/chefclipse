/**
 * 
 */
package org.limepepper.chefclipse.structured.json.editor.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.limepepper.chefclipse.structured.json.editor.StructuredJsonEditorActivator;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorInput;

/**
 * @author Sebastian Sampaoli
 * 
 */
public enum StructuredEditorFactory {

	INSTANCE;

	public StructuredJsonEditorInput createEditorInput(List<?> elements) throws CoreException {
		StructuredJsonEditorInput editorInput = new StructuredJsonEditorInput();
		if (elements.size() == 1 && elements.get(0) instanceof IFile) {
			IFile jsonFile = (IFile) elements.get(0);
			ArrayList<IFile> arrayList = new ArrayList<IFile>(Arrays.asList(jsonFile));
			editorInput.setJSONFiles(arrayList);
			editorInput.setName(jsonFile.getName());
			editorInput.setParentFolder((IFolder) jsonFile.getParent());
			return editorInput;
		}
		if (elements.size() == 1 && elements.get(0) instanceof IFolder) {
			IFolder folder = (IFolder) elements.get(0);
			editorInput.setJSONFiles(generateListOfJsonFiles(Arrays.asList(folder.members())));
			editorInput.setName(folder.getName());
			editorInput.setParentFolder(folder);
			return editorInput;
		}
		//there are more than an element selected which are going to be the input, and they can be
		//of any type (folder, file), so let's put a custom name to the editor input
		List<IFile> listOfJsonFiles = generateListOfJsonFiles(elements);
		editorInput.setJSONFiles(listOfJsonFiles);
		editorInput.setName("Collection of JSON files");
		editorInput.setParentFolder((IFolder) listOfJsonFiles.get(0).getParent());
		return editorInput;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<IFile> generateListOfJsonFiles(List<?> elements) {
		List<IFile> jsonFiles = new ArrayList<IFile>();
		for (Object object : elements) {
			if (object instanceof IFile
					&& ((IFile) object).getName().toLowerCase()
							.endsWith(StructuredJsonEditorActivator.JSON_EXTENSION)) {
				jsonFiles.add((IFile) object);
			} else if (elements instanceof IFolder) {
				try {
					jsonFiles.addAll(generateListOfJsonFiles(new ArrayList(
							Arrays.asList(((IFolder) elements).members()))));
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return jsonFiles;
	}
}
