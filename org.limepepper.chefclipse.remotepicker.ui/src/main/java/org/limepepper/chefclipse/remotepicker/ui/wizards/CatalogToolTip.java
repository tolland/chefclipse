package org.limepepper.chefclipse.remotepicker.ui.wizards;

import org.eclipse.equinox.internal.p2.ui.discovery.util.GradientToolTip;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;

/**
 * @author Sebastian Sampaoli
 */
public class CatalogToolTip extends GradientToolTip {

	private Image image;

	private final CatalogDescriptor catalogDescriptor;

	private final Label label;

	public static void attachCatalogToolTip(Label label, CatalogDescriptor catalogDescriptor) {
		new CatalogToolTip(label, catalogDescriptor);
	}

	private CatalogToolTip(Label label, CatalogDescriptor catalogDescriptor) {
		super(label);
		this.label = label;
		this.catalogDescriptor = catalogDescriptor;
	}

	@Override
	protected Composite createToolTipArea(Event event, Composite parent) {
		GridLayoutFactory.fillDefaults().numColumns(2).margins(5, 5).equalWidth(false).applyTo(parent);
		createIcon(parent);
		createLabel(parent);
		createDescription(parent);
		return parent;
	}

	private void createDescription(Composite parent) {
		Label descriptionLabel = new Label(parent, SWT.WRAP);
		GridDataFactory.fillDefaults().grab(true, false).span(2, 1).hint(100, SWT.DEFAULT).applyTo(descriptionLabel);
		descriptionLabel.setBackground(null);
		String description = catalogDescriptor.getDescription() == null ? "" : escapeText(catalogDescriptor.getDescription()); //$NON-NLS-1$
		descriptionLabel.setText(description);
	}

	private void createLabel(Composite parent) {
		Label nameLabel = new Label(parent, SWT.NULL);
		FontDescriptor h1FontDescriptor = createFontDescriptor(SWT.BOLD, 1.35f);
		nameLabel.setFont(h1FontDescriptor.createFont(parent.getDisplay()));
		nameLabel.setText(escapeText(catalogDescriptor.getLabel()));
		nameLabel.setBackground(null);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(nameLabel);
	}

	private void createIcon(Composite parent) {
		image = label.getImage();
		if (image == null) {
			ImageRegistry registry = Activator.getDefault().getImageRegistry();
			image = registry.get(Activator.NO_ICON_PROVIDED_CATALOG);
		}
		Label iconLabel = new Label(parent, SWT.NULL);
		iconLabel.setImage(image);
		iconLabel.setBackground(null);
		GridDataFactory.swtDefaults().align(SWT.CENTER, SWT.BEGINNING).span(1, 2).applyTo(iconLabel);
	}

	private FontDescriptor createFontDescriptor(int style, float heightMultiplier) {
		Font baseFont = JFaceResources.getDialogFont();
		FontData[] fontData = baseFont.getFontData();
		FontData[] newFontData = new FontData[fontData.length];
		for (int i = 0; i < newFontData.length; i++) {
			newFontData[i] = new FontData(fontData[i].getName(), (int) (fontData[i].getHeight() * heightMultiplier),
					fontData[i].getStyle() | style);
		}
		return FontDescriptor.createFrom(newFontData);
	}
	
	public static String escapeText(String text) {
		if (text == null) {
			return null;
		}
		text = text.replace("&", "&&"); //$NON-NLS-1$ //$NON-NLS-2$
		return text;
	}
}