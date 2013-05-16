/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Dialog with fields for name and value to edit a metadata item.
 * 
 * @author Sebastian Sampaoli
 */
public class AddNewDataBagItemDialog extends TitleAreaDialog {

    private Text text;
    private boolean editMode;
    private String dataBagitemName;

    public AddNewDataBagItemDialog(Shell parentShell, String oldValue, boolean edit) {
        super(parentShell);
        setDataBagitemName(oldValue);
        editMode = edit;
    }

    protected void configureShell(Shell shell) {
        super.configureShell(shell);
    }

    protected Control createDialogArea(Composite parent) {

        parent = (Composite) super.createDialogArea(parent);

        if (editMode) {
            setTitle("Edit data bag item name");
            setMessage("Edit the selected data bag item name.");
        } else {
            setTitle("Add data bag item");
            setMessage("Add a new data bag item.");
        }

        Composite composite = new Composite(parent, SWT.NONE);
        GridLayoutFactory.swtDefaults().equalWidth(false).numColumns(2).applyTo(composite);
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).applyTo(composite);

        Label labelName = new Label(composite, SWT.NONE);
        final GridDataFactory gridDataBeginning = GridDataFactory.fillDefaults()
                .align(SWT.BEGINNING, SWT.CENTER).indent(6, 6).span(1, 1).grab(false, false);
        gridDataBeginning.applyTo(labelName);
        labelName.setText("Data bag item name:");

        text = new Text(composite, SWT.BORDER);
        final GridDataFactory gridData = GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER)
                .hint(300, SWT.DEFAULT).indent(6, 6);
        gridData.span(1, 1).grab(true, false).applyTo(text);
        if (editMode && getDataBagitemName() != null) {
            text.setText(getDataBagitemName());
        }
        text.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent arg0) {
                if (text.getText().isEmpty()) {
                    getButton(IDialogConstants.OK_ID).setEnabled(false);
                } else {
                    setDataBagitemName(text.getText());
                    getButton(IDialogConstants.OK_ID).setEnabled(true);
                }
            }
        });
        return composite;
    }

    public String getDataBagitemName() {
        return dataBagitemName;
    }

    public void setDataBagitemName(String dataBagitemName) {
        this.dataBagitemName = dataBagitemName;
    }

}
