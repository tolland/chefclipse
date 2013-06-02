/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import org.eclipse.emf.ecore.EObject;
//import org.codehaus.jackson.JsonNode;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.json.json.JsonObjectValue;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.json.provider.JsonItemProviderAdapterFactory;
import org.limepepper.chefclipse.json.json.provider.ValueItemProvider;

/**
 * Provides the value and image for a {@link DataBagItem}.
 * 
 * @author Sebastian Sampaoli
 */
public class DataBagLabelProvider extends StyledCellLabelProvider implements IColorProvider {

    private Resource resource;
	private AdapterFactoryLabelProvider adapterProvider;
	private JsonItemProviderAdapterFactory adapterFactory;

	public DataBagLabelProvider(Resource resource) {
    	this.resource = resource;
    	adapterFactory = new JsonItemProviderAdapterFactory();
		adapterProvider = new AdapterFactoryLabelProvider(adapterFactory);
    }

    @Override
    public void update(final ViewerCell cell) {
        final EObject entryElement = (EObject) cell.getElement();
        if (cell.getColumnIndex() == 0) {
            StyledString styledString = new StyledString();
            Styler dataStyler = new Styler() {

                @Override
                public void applyStyles(TextStyle textStyle) {
                    textStyle.foreground = getForeground(entryElement);
                    textStyle.background = getBackground(entryElement);
//                    textStyle.font = getFont(element);
                }
            };
            String text = getText(entryElement, cell.getColumnIndex(), cell);
            styledString.append(text, dataStyler);
            cell.setStyleRanges(styledString.getStyleRanges());
            cell.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
            cell.setText(styledString.getString());
            cell.setImage(getImage(entryElement, cell.getColumnIndex()));
        } else {
            cell.setText(getText(entryElement, cell.getColumnIndex(), cell));
        }
    }

    private Image getImage(EObject entryElement, int columnIndex) {
        if (columnIndex == 0) {
        	return adapterProvider.getImage(entryElement);
//            boolean hasChildren = DataBagEditorManager.INSTANCE.hasChildren(entryElement,
//                    dataBagItemsMap);
//            ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
//            if (hasChildren) {
//                return imageRegistry
//                        .getDescriptor(Activator.JSON_OBJECT).createImage();
//            }
//            return imageRegistry
//                    .getDescriptor(Activator.JSON_FIELD).createImage();
        }
        return null;
    }

    private String getText(EObject entryElement, int columnIndex, final ViewerCell cell) {
        if (columnIndex == 0) {
        	return adapterProvider.getText(entryElement);
        }
    	String uriFragment = entryElement.eResource().getURIFragment(entryElement);
    	EObject value = resource.getEObject(uriFragment);
    	if (value != null && value instanceof Pair) {
    		Pair pair = (Pair) value;
    		if (pair.getValue() != null && !(pair.getValue() instanceof JsonObjectValue)) {
    			ValueItemProvider labelProvider = (ValueItemProvider) adapterFactory.adapt(pair.getValue(), ValueItemProvider.class);
    			String text = labelProvider.getUpdateableText(pair.getValue());
    			return text;
    		}
    	}
        return "";
    }

    @Override
    public Color getForeground(Object element) {
        return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_BLUE);
    }

    @Override
    public Color getBackground(Object element) {
        return null;
    }

}
