package org.limepepper.chefclipse.remotepicker.repositories;

import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Guillermo Zunino
 *
 */
public class GithubCookbookRepositoryConfig implements ICookbooksRepository.Builder<String> {

	static final Logger logger = LoggerFactory.getLogger(GithubCookbookRepositoryConfig.class);
	
	@Override
	public ICookbooksRepository createRepository(String githubUser) {
		return new GitHubCookbookRepository(githubUser);
	}

	@Override
	public String configure(final RemoteRepository repo) {
		Shell shell = Display.getCurrent().getActiveShell();
		
		IInputValidator validator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if (newText == null || "".equals(newText.trim())) {
					return "Enter a non empty GitHub user or organization";
				}
				return null;
			}
		};
		InputDialog dialog = new InputDialog(shell, "Github Cookbooks Repository", "Enter a Github organization (or user) hosting public cookbook repositories (e.g.: \"cookbooks\" or \"opscode-cookbooks\")", null, validator) {
			@Override
			protected void okPressed() {
				String error = fetchCookbooksInfo(getValue(), repo, null);
				setErrorMessage(error);
				if (error == null)
					super.okPressed();
			}
		};
		if (dialog.open() == Window.OK && dialog.getValue() != null) {
			String githubUser = dialog.getValue();
			return githubUser;
		}
		return null;
	}

	private String fetchCookbooksInfo(final String githubUser, final RemoteRepository repo, final InputDialog dialog) {
		IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
		try {
			progressService.busyCursorWhile(new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException {
					try {
						ClientConfig config = new DefaultClientConfig();
						Client client = Client.create(config);
						WebResource service = client.resource(GitHubCookbookRepository.repositoryUrl());
						JSONObject json = service.path("users").path(githubUser)
								.accept(MediaType.APPLICATION_JSON_TYPE)
								.get(JSONObject.class);
						String name = json.getString("name");
						String login = json.getString("login");
						String url = json.getString("html_url");
						String blog = json.getString("blog");
						String type = json.getString("type");
						String avatar_id = json.getString("gravatar_id");
						repo.setName(name + " (GitHub)");
						repo.setDescription("Cookbooks provided by GitHub repositories from " + type + " \"" + login + "\". More info on \"" + blog + "\"");
						repo.setUri(url);
						repo.setIcon("http://www.gravatar.com/avatar/" + avatar_id + "?s=32&d=" + URLEncoder.encode("http://raw.github.com/limepepper/chefclipse/gh-pages/css/images/github.png", "UTF-8") );
					} catch (Exception e) {
						logger.error("Cannot fetch github organization info", e);
						throw new InvocationTargetException(e);
					}
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			return "Cannot fetch Github organization information for user \"" + githubUser + "\".";
		}
		return null;
	};

}
