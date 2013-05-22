/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.editors;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
//import org.codehaus.jackson.JsonNode;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageRegistry;
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
import org.limepepper.chefclipse.databag.editor.Activator;
import org.limepepper.chefclipse.json.json.JsonObjectValue;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.json.Value;
import org.limepepper.chefclipse.json.json.provider.JsonItemProviderAdapterFactory;

/**
 * Provides the value and image for a {@link DataBagItem}.
 * 
 * @author Sebastian Sampaoli
 */
public class DataBagLabelProvider extends StyledCellLabelProvider implements IColorProvider {

//    private Map<String, JsonNode> dataBagItemsMap;

    private Resource resource;
	private AdapterFactoryLabelProvider adapterProvider;

	public DataBagLabelProvider(Resource resource /*Map<String, JsonNode> nodesMap*/) {
//        this.dataBagItemsMap = nodesMap;
    	this.resource = resource;
    	adapterProvider = new AdapterFactoryLabelProvider(new JsonItemProviderAdapterFactory());
    }

    @SuppressWarnings("unchecked")
    @Override
    public void update(final ViewerCell cell) {
//        final Entry<String, JsonNode> entryElement = (Entry<String, JsonNode>) cell.getElement();
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
            String text = getText(entryElement, cell.getColumnIndex());
            styledString.append(text, dataStyler);
            cell.setStyleRanges(styledString.getStyleRanges());
            cell.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
            cell.setText(styledString.getString());
            cell.setImage(getImage(entryElement, cell.getColumnIndex()));
//            cell.setText(getText(entryElement, cell.getColumnIndex()));
        } else {
            cell.setText(getText(entryElement, cell.getColumnIndex()));
        }
    }

    private Image getImage(EObject entryElement, /*Entry<String, JsonNode> entryElement,*/ int columnIndex) {
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

    private String getText(EObject entryElement, /*Entry<String, JsonNode> entryElement,*/ int columnIndex) {
        if (columnIndex == 0) {
        	return adapterProvider.getText(entryElement);
        }
//        ArrayList<Entry<String, JsonNode>> entries = new ArrayList<Entry<String, JsonNode>>(
//                dataBagItemsMap.entrySet());
//        String dataBagItemName = entries.get(columnIndex - 1).getKey();
//        JsonNode propertyValue = DataBagEditorManager.INSTANCE.getValue(entryElement,
//                dataBagItemName);
//        if (propertyValue != null) {
//            if (propertyValue.isValueNode()) {
//                return propertyValue.asText();
//            }
//            return propertyValue.toString();
//        }
    	String uriFragment = entryElement.eResource().getURIFragment(entryElement);
    	EObject value = resource.getEObject(uriFragment);
    	if (value instanceof Pair) {
    		Pair pair = (Pair) value;
    		if (!(pair.getValue() instanceof JsonObjectValue)) {
    			return adapterProvider.getText(pair.getValue());
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
