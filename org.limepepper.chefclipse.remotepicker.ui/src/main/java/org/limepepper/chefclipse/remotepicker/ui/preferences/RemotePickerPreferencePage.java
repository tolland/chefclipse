/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.preferences;

import java.util.Collection;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;

/**
 * @author Sebastian Sampaoli
 *
 */
public class RemotePickerPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	public RemotePickerPreferencePage(){
		super(GRID);
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    setDescription("Set the remote picker general preferences.");
	}

	@Override
	protected void createFieldEditors() {
		
		String[][] nameAndIdOfRepositories = getRepositoriesInfo(); 
		RadioGroupFieldEditor editor = new RadioGroupFieldEditor(IRemotePickerPreferences.DEFAULT_REPOSITORY,
		        "Select the default repository to be used in the remote picker", 1,
		        nameAndIdOfRepositories, getFieldEditorParent(), true);
		addField(editor);
	}

	private String[][] getRepositoriesInfo() {
		
		Collection<RemoteRepository> repositories = CookbookRepositoryManager.getInstance().getRepositories();
		String[][] repositoriesInfo = new String[repositories.size()][2];
		int i = 0;
		for (RemoteRepository remoteRepository : repositories) {			
			String[] repositoryInfo = {"&" + remoteRepository.getName(), remoteRepository.getId()};
			repositoriesInfo[i++] = repositoryInfo;
		}
		return repositoriesInfo;
	}

}
