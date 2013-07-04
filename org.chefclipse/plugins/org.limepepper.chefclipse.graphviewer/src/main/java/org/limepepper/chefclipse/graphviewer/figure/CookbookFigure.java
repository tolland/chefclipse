package org.limepepper.chefclipse.graphviewer.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.graphviewer.common.ImageLoader;

public class CookbookFigure extends Figure {
	
	private CompartmentFigure attributeFigure = new CompartmentFigure();

	private Font titleFont = new Font(null, "Arial", 12, SWT.BOLD);
	
	private Image cookbookImage = ImageLoader.Load("class_obj.gif");
	
	Image attributeImage = ImageLoader.Load("methpub_obj.gif");
	
	public CookbookFigure(String name,String version,String catalog)
	{
		this(name,version,catalog,false);
	}
	
	public CookbookFigure(String name,String version,String catalog,boolean selected) {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		
		Color backgroundColor;
		if(selected)
		{
			backgroundColor=new Color(null, 206, 206, 255);
		}
		else
		{
			backgroundColor=new Color(null, 255, 255, 206);
		}
		
		setBackgroundColor(backgroundColor);
		setOpaque(true);

		Label titleLabel = new Label(name, cookbookImage);
		titleLabel.setFont(titleFont);
		
		Label attribute1 = new Label("Version:"+version, attributeImage);
		attributeFigure.add(attribute1);
		Label attribute2 = new Label("Catalog:"+catalog, attributeImage);
		attributeFigure.add(attribute2);
		
		add(titleLabel);
		add(attributeFigure);
		setSize(-1, -1);
	}

	public CompartmentFigure getAttributesCompartment() {
		return attributeFigure;
	}
}
