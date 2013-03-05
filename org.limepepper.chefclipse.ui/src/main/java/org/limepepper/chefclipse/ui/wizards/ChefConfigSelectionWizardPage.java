/**
 * 
 */

package org.limepepper.chefclipse.ui.wizards;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.limepepper.chefclipse.ui.Messages;
import org.limepepper.chefclipse.ui.properties.ChefConfigurationPropertyPage;

/**
 * Wizard page in the New Chef project wizard, which allows to associate a Chef
 * configuration to a project during its creation.
 * 
 * @author Sebastian Sampaoli
 */
public class ChefConfigSelectionWizardPage extends ChefConfigurationPropertyPage implements IWizardPage {

    public static final String CHEF_CONFIG_SELECTION_PAGE = "ChefConfigSelectionPage"; //$NON-NLS-1$
    private IWizard wizard;

    public ChefConfigSelectionWizardPage(IWizard wizard) {
        super();
        this.wizard = wizard;
        noDefaultAndApplyButton();
        setTitle(Messages.ChefConfigSelectWizardPage_SelectTitle);
    }
    
    @Override
    protected Composite createHeader(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());
        GridLayout layout = new GridLayout();
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        layout.numColumns = 2;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        Label description = new Label(composite, SWT.WRAP);
        description.setText(Messages.ChefConfigurationPropertyPage_Description);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(description);
        
        Hyperlink configurationHyperlink = new Hyperlink(composite, SWT.NONE);
        configurationHyperlink.setUnderlined(true);
        configurationHyperlink.setText(Messages.ChefConfigurationPropertyPage_CONFIGURE_WORKSPACE);
        configurationHyperlink.setForeground(JFaceColors.getHyperlinkText(getShell().getDisplay()));
        configurationHyperlink.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent e) {
                PreferenceDialog dlg = PreferencesUtil.createPreferenceDialogOn(getShell(),
                        CHEF_CONFIG_PREFERENCE_ID, new String[] { CHEF_CONFIG_PREFERENCE_ID }, null);
                dlg.open();
            }
        });

        return composite;
    }
    
    @Override
    public boolean canFlipToNextPage() {
        return false;
    }

    @Override
    public String getName() {
        return CHEF_CONFIG_SELECTION_PAGE;
    }

    @Override
    public IWizardPage getNextPage() {
        return null;
    }

    @Override
    public IWizardPage getPreviousPage() {
        return getWizard().getPreviousPage(this);
    }

    @Override
    public IWizard getWizard() {
        return wizard;
    }

    @Override
    public boolean isPageComplete() {
        return true;
    }

    @Override
    public void setPreviousPage(IWizardPage page) {
        
    }

    @Override
    public void setWizard(IWizard newWizard) {
        this.wizard = newWizard;
    }
    
    /**
     * Initialize dialog.
     */
    protected void initialize() {
        super.initialize();
        setDescription(Messages.ChefConfigSelectWizardPage_SelectDescription); 
    }
    
}
