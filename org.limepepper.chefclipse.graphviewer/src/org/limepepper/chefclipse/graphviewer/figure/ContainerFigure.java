package org.limepepper.chefclipse.graphviewer.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableContainer;

public class ContainerFigure extends Figure {
	
	private DrawableContainer drawableContainer;
	private Font titleFont = new Font(null, "Arial", 14, SWT.BOLD);
	
	public ContainerFigure(DrawableContainer drawableContainer)
	{
		this.drawableContainer=drawableContainer;
		
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(drawableContainer.getBackgroundColor());
		setOpaque(true);
		
		Label titleLabel = new Label(drawableContainer.getName(), drawableContainer.getImage());
		titleLabel.setFont(titleFont);
		
		add(titleLabel);
		setSize(-1, -1);
	}
}
