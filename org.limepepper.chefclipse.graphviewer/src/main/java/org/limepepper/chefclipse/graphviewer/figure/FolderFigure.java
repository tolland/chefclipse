package org.limepepper.chefclipse.graphviewer.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableContainer;
import org.limepepper.chefclipse.graphviewer.common.DrawableCookbook.DrawableFolder;

public class FolderFigure extends Figure {
	
	private DrawableFolder drawableFolder;
	private Font titleFont = new Font(null, "Arial", 14, SWT.BOLD);
	
	public FolderFigure(DrawableFolder drawableFolder)
	{
		this.drawableFolder=drawableFolder;
		
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(drawableFolder.getBackgroundColor());
		setOpaque(true);
		
		Label titleLabel = new Label(drawableFolder.getName(), drawableFolder.getImage());
		titleLabel.setFont(titleFont);
		
		add(titleLabel);
		setSize(-1, -1);
	}
}
