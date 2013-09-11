/**
 * 
 */

package org.limepepper.chefclipse.structured.json.editor.dialogs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
 * Dialog which allows to add a new JSON file.
 * 
 * @author Sebastian Sampaoli
 */
public class AddNewJsonFileDialog extends TitleAreaDialog {

    private Text text;
    private boolean editMode;
    private String jsonFileName;
    private Pattern pattern;

    public AddNewJsonFileDialog(Shell parentShell, String oldValue, boolean edit) {
        super(parentShell);
        setJsonFileName(oldValue);
        editMode = edit;
        String filePattern = "[_a-zA-Z0-9\\-\\.]+";
        pattern = Pattern.compile(filePattern);
    }

    protected void configureShell(Shell shell) {
        super.configureShell(shell);
    }

    protected Control createDialogArea(Composite parent) {
        parent = (Composite) super.createDialogArea(parent);

        if (editMode) {
            setTitle("Edit JSON file name");
            setMessage("Edit the selected JSON file name.");
        } else {
            setTitle("Add JSON file");
            setMessage("Add a new JSON file.");
        }

        Composite composite = new Composite(parent, SWT.NONE);
        GridLayoutFactory.swtDefaults().equalWidth(false).numColumns(2).applyTo(composite);
        GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).applyTo(composite);

        Label labelName = new Label(composite, SWT.NONE);
        final GridDataFactory gridDataBeginning = GridDataFactory.fillDefaults()
                .align(SWT.BEGINNING, SWT.CENTER).indent(6, 6).span(1, 1).grab(false, false);
        gridDataBeginning.applyTo(labelName);
        labelName.setText("JSON file name:");

        text = new Text(composite, SWT.BORDER);
        final GridDataFactory gridData = GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER)
                .hint(300, SWT.DEFAULT).indent(6, 6);
        gridData.span(1, 1).grab(true, false).applyTo(text);
        if (editMode && getJsonFileName() != null) {
            text.setText(getJsonFileName());
        }
        text.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent arg0) {
                Matcher matcher = pattern.matcher(text.getText());
                if (!matcher.matches()) {
                    getButton(IDialogConstants.OK_ID).setEnabled(false);
                } else {
                    setJsonFileName(text.getText());
                    getButton(IDialogConstants.OK_ID).setEnabled(true);
                }
            }
        });
        return composite;
    }

    public String getJsonFileName() {
        return jsonFileName;
    }

    public void setJsonFileName(String jsonFileName) {
        this.jsonFileName = jsonFileName;
    }

}
