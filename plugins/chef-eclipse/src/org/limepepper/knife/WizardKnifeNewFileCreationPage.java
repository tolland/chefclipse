package org.limepepper.knife;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import chef_eclipse.Activator;

public class WizardKnifeNewFileCreationPage extends WizardNewFileCreationPage {

	public WizardKnifeNewFileCreationPage(String pageName,
			IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}
	
    public WizardKnifeNewFileCreationPage(IStructuredSelection selection) {
        super("knife Plug-in File Wizard", selection);

        setTitle("Knife plugin File Wizard");
        setDescription("Create a Knife Plugin");
        setFileExtension("rb");
    }

    protected InputStream getInitialContents() {
        String templateFilePath = "/templates/knife-plugin-template.rb";
        InputStream inputStream = null;
        try {
            inputStream = Activator.getDefault().getBundle().getEntry(templateFilePath).openStream();
        } catch (IOException e) {
            // send back null
        }

        return inputStream;
    }
}
