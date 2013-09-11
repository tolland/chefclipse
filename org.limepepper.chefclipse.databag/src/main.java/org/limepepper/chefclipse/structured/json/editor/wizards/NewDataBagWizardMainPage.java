/**
 * 
 */

package org.limepepper.chefclipse.structured.json.editor.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.limepepper.chefclipse.common.chefserver.DataBag;

/**
 * Standard main page for a wizard which creates a {@link DataBag}.
 * 
 * @author Sebastian Sampaoli
 */
public class NewDataBagWizardMainPage extends WizardPage {

    private Text dataBagNameText;
    private IProject chefProject;

    /**
     * 
     */
    public NewDataBagWizardMainPage() {
        super("dataBagMainPage");
    }

    public NewDataBagWizardMainPage(String title, IProject chefProject) {
        super("dataBagMainPage");
        setTitle(title);
        setDescription("Create a new Data Bag");
        this.chefProject = chefProject;
    }

    public NewDataBagWizardMainPage(String title) {
        super("dataBagMainPage");
        setTitle(title);
        setDescription("Create a new Data Bag");
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        layout.verticalSpacing = 9;
        Label label = new Label(container, SWT.NULL);
        label.setText("&Data bag name:");

        dataBagNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        dataBagNameText.setLayoutData(gd);
        dataBagNameText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                dialogChanged();
            }
        });

        dialogChanged();
        setControl(container);
    }

    private void dialogChanged() {
        if (getDataBagName().length() == 0) {
            updateStatus("Data bag name must be specified");
            return;
        }
        if (chefProject != null && !chefProject.isAccessible()) {
            updateStatus("Project must be writable");
            return;
        }
        updateStatus(null);
    }

    private void updateStatus(String message) {
        setErrorMessage(message);
        setPageComplete(message == null);
    }

    public String getDataBagName() {
        return dataBagNameText.getText();
    }

}
