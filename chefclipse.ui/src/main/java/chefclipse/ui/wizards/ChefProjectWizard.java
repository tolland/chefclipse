package chefclipse.ui.wizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;

import chefclipse.core.managers.ChefProjectManager;
import chefclipse.core.managers.ChefRepositoryManager;

public abstract class ChefProjectWizard extends Wizard {

	private ChefProjectWizardPage projectPage;
	private ChefRepositoryWizardPage repoPage;



	@Override
	public boolean performFinish() {
		final IProject proj = projectPage.getProjectHandle();
		final String repoPath = repoPage.getLocationPath();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					ChefProjectManager.instance().createChefProject(proj, repoPath, monitor);
					final ChefConfigSelectionWizardPage page = (ChefConfigSelectionWizardPage) getPage(ChefConfigSelectionWizardPage.CHEF_CONFIG_SELECTION_PAGE);
					if (page != null) {
					    Display.getCurrent().asyncExec(new Runnable() {
			                public void run() {
			                    page.performOk();
			                }
			            });
					}
					if(!proj.isOpen()){
						proj.open(monitor);
					}
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};


		try {
			this.getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage()); //$NON-NLS-1$
			return false;
		}
		return true;
	}

	/**
	 * Saves knives of the project to Chef-server configuration.
	 *
	 * @param proj
	 */
	private void importKnivesToChefConfig(final IProject proj) {
		ChefConfigManager configManager = ChefConfigManager.instance();
		Collection<KnifeConfig> knives = ChefRepositoryManager.INSTANCE
				.getKnives(proj);
		if (!knives.isEmpty()) {
			List<KnifeConfig> configs = configManager
					.retrieveChefConfigurations();
			KnifeConfig projectConfig = knives.iterator().next();

			IResource clientKeyRes = proj.findMember(projectConfig
					.getClient_key().getPath());
			projectConfig.setClient_key(clientKeyRes.getLocation().toFile());
			if (configs.isEmpty()) {
				configManager.saveDefaultChefConfig(projectConfig);
			}
			configs.addAll(knives);
			configManager.saveChefConfigs(configs);
			configManager.saveProjectChefConfig(proj, projectConfig);
		}
	}

	public static void copyFolder(final File src, final File dest)
			throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				// System.out.println("Directory copied from " + src + "  to " +
				// dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			// System.out.println("File copied from " + src + " to " + dest);
		}
	}

}
