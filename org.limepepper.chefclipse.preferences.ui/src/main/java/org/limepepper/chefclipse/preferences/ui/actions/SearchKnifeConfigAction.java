/**
 *
 */
package org.limepepper.chefclipse.preferences.ui.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.preferences.ui.PreferencesActivator;
import org.limepepper.chefclipse.preferences.ui.dialogs.AddChefConfigurationPreferenceContainer;
import org.limepepper.chefclipse.preferences.ui.preferences.PreferenceConstants;
import org.limepepper.chefclipse.utility.Config;

import chefclipse.ui.messages.Messages;

/**
 * Shows a dialog for selecting a knife config file and create a
 * {@link KnifeConfig} from the selected file.
 *
 * @author Sebastian Sampaoli
 *
 */
public class SearchKnifeConfigAction extends Action {

	private static final String CURRENT_DIR = "#{current_dir}";
	private static final String DEFAULT_KNIFE_FILE = "knife.rb"; //$NON-NLS-1$
	private final static Charset ENCODING = StandardCharsets.UTF_8;

	private Shell shell;

	private KnifeConfig generatedKnifeConfig;

	public SearchKnifeConfigAction() {

	}

	public SearchKnifeConfigAction(Shell shell) {
		this.shell = shell;
		this.setText(Messages.ChefConfigurationPreferencePage_SearchButton);
	}

	@Override
	public void run() {
		FileDialog dialog = new FileDialog(shell);
		dialog.setText(Messages.ChefConfigurationPreferencePage_SearchFile);
		String homefolder = System.getProperty("user.home"); //$NON-NLS-1$
		File chefDirectory = new File(homefolder + File.separator + ".chef"); //$NON-NLS-1$
		dialog.setFilterExtensions(new String[] { "*.rb" }); //$NON-NLS-1$
		dialog.setFilterNames(new String[] { "Ruby DSL(*.rb)" }); //$NON-NLS-1$
		if (chefDirectory.exists() && chefDirectory.isDirectory()) {
			dialog.setFilterPath(chefDirectory.getAbsolutePath());
		} else {
			dialog.setFilterPath(homefolder);
		}
		String fileName = dialog.getFilterPath() + File.separator
				+ DEFAULT_KNIFE_FILE;
		dialog.setFileName(fileName);
		String selected = dialog.open();
		if (selected != null && !selected.isEmpty()) {
			File knifeConfigFile = new File(selected);
			setGeneratedKnifeConfig(parse(knifeConfigFile));
			AddChefConfigurationPreferenceContainer editDialog = new AddChefConfigurationPreferenceContainer(
					shell, getGeneratedKnifeConfig(), false);
			if (editDialog.open() == Window.OK) {
				Config editedConfig = editDialog.getCreatedChefConfig();
				setGeneratedKnifeConfig((KnifeConfig) editedConfig);
				return;
			}
		}
		setGeneratedKnifeConfig(null);
	}

	/**
	 * Parses the file passed as a parameter and generate a {@link KnifeConfig}.
	 *
	 * @param knifeConfigFile
	 * @return a knifeConfig
	 */
	public KnifeConfig parse(File knifeConfigFile) {
		KnifeConfig knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
		knifeConfig.setCache_option(parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_CACHE_OPTIONS));
		knifeConfig.setCache_type(parseFileAndGetPropertyValue(knifeConfigFile,
				PreferenceConstants.P_CACHE_TYPE));

		String urlValue = parseFileAndGetPropertyValue(knifeConfigFile,
				PreferenceConstants.P_CHEF_SERVER_URL);
		URL chefServerUrl;
		try {
			chefServerUrl = new URL(urlValue);
			knifeConfig.setChef_server_url(chefServerUrl);
		} catch (MalformedURLException ex) {
			IStatus status = new Status(Status.ERROR, PreferencesActivator.PLUGIN_ID,
					ex.getMessage(), ex);
			Platform.getLog(PreferencesActivator.getDefault().getBundle()).log(status);
		}
		knifeConfig.setNode_name(parseFileAndGetPropertyValue(knifeConfigFile,
				PreferenceConstants.P_NODE_NAME));

		String clientKeyValue = parseFileAndGetPropertyValue(knifeConfigFile,
				PreferenceConstants.P_CLIENT_KEY);
		File clientKeyFile = new File(clientKeyValue);
		knifeConfig.setClient_key(clientKeyFile);

		String cookbookPathValue = parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_COOKBOOK_PATH);
		File cookbookPathPath = new File(cookbookPathValue);
		knifeConfig.setCookbook_path(cookbookPathPath);

		knifeConfig.setCookbook_copyright(parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_COOKBOOK_COPYRIGHT));
		knifeConfig.setCookbook_email(parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_COOKBOOK_EMAIL));
		knifeConfig.setCookbook_license(parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_COOKBOOK_LICENSE));
		knifeConfig.setValidation_client_name(parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_VALIDATION_CLIENT_NAME));

		String validationKeyValue = parseFileAndGetPropertyValue(
				knifeConfigFile, PreferenceConstants.P_VALIDATION_KEY);
		File validationKeyFile = new File(validationKeyValue);
		knifeConfig.setValidation_key(validationKeyFile);

		return knifeConfig;
	}

	private String parseFileAndGetPropertyValue(File knifeConfigFile,
			String variable) {
		Path path = Paths.get(knifeConfigFile.getAbsolutePath());
		Pattern pattern = Pattern.compile("\\s*" + variable
				+ "\\s+?\\[?[\\s]*?\"(.+?)[\\s]*?\\]?\"");
		Pattern cacheOptionsPattern = Pattern.compile("\\s*"
				+ PreferenceConstants.P_CACHE_OPTIONS
				+ "\\(\\{?\\s+?(:path.+?)\\s?\\}?\\)");
		Pattern cacheTypePattern = Pattern.compile("\\s*"
				+ PreferenceConstants.P_CACHE_TYPE + "\\s+?('.+?')");
		try {
			BufferedReader reader = Files.newBufferedReader(path, ENCODING);
			String line = "";
			String varValue = "";
			while ((line = reader.readLine()) != null) {
				if (!line.startsWith("#")) {
					Matcher matcher = pattern.matcher(line);
					if (matcher.find()) {
						varValue = matcher.group(1);
					}
					varValue = checkForSpecificPattern(variable,
							cacheOptionsPattern, line, varValue,
							PreferenceConstants.P_CACHE_OPTIONS);
					varValue = checkForSpecificPattern(variable,
							cacheTypePattern, line, varValue,
							PreferenceConstants.P_CACHE_TYPE);
					if (!varValue.isEmpty() && varValue.contains(CURRENT_DIR)) {
						varValue = varValue.replace(CURRENT_DIR,
								knifeConfigFile.getParent());
						return varValue;
					} else if (!varValue.isEmpty()) {
						return varValue;
					}
				}
			}
		} catch (IOException ex) {
			IStatus status = new Status(Status.ERROR, PreferencesActivator.PLUGIN_ID,
					ex.getMessage(), ex);
			Platform.getLog(PreferencesActivator.getDefault().getBundle()).log(status);
		}
		return "";
	}

	private String checkForSpecificPattern(String variable, Pattern pattern,
			String line, String varValue, String expectedVariable) {
		if (line.contains(expectedVariable)
				&& variable.equals(expectedVariable)) {
			Matcher matcher = pattern.matcher(line);
			if (matcher.find()) {
				varValue = matcher.group(1);
			}
		}
		return varValue;
	}

	public KnifeConfig getGeneratedKnifeConfig() {
		return generatedKnifeConfig;
	}

	public void setGeneratedKnifeConfig(KnifeConfig generatedKnifeConfig) {
		this.generatedKnifeConfig = generatedKnifeConfig;
	}
}
