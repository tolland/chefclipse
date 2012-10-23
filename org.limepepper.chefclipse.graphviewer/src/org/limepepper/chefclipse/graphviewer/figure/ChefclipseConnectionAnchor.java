package org.limepepper.chefclipse.graphviewer.figure;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;

public class ChefclipseConnectionAnchor extends AbstractConnectionAnchor {

	/**
	 * Constructor for a Digraph2ConnectionAnchor.
	 * 
	 * @param owner
	 *            the figure that owns this anchor.
	 */
	public ChefclipseConnectionAnchor(IFigure owner) {
		super(owner);
	}

	/*
	 * @see org.eclipse.draw2d.ConnectionAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
	 */
	public Point getLocation(Point reference) {
		Point point = getOwner().getBounds().getCenter();
		getOwner().translateToAbsolute(point);
		if (reference.y < point.y)
			point = getOwner().getBounds().getTop();
		else
			point = getOwner().getBounds().getBottom();
		getOwner().translateToAbsolute(point);
		return point;
	}

}
