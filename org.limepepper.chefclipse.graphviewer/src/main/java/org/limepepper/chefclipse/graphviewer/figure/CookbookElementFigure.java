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
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableContainer;
import org.limepepper.chefclipse.graphviewer.common.ICookbookElement;
import org.limepepper.chefclipse.graphviewer.common.ImageLoader;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor;


public class CookbookElementFigure extends Figure {
	
	private Image cookbookElementImage = ImageLoader.Load("bulleted_list_options.png");
	
	private ICookbookElement cookbookElement;
	private Font titleFont = new Font(null, "Arial", 11, SWT.BOLD);
	
	public CookbookElementFigure(ICookbookElement cookbookElement)
	{
		this.cookbookElement=cookbookElement;
		
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(new Color(null, 255, 255, 255));
		setOpaque(true);
		
		Label titleLabel = new Label(cookbookElement.getName(), cookbookElementImage);
		titleLabel.setFont(titleFont);
		
		add(titleLabel);
		setSize(-1, -1);
	}
}