package hu.unimiskolc.shape2D;

import java.awt.Color;
import hu.unimiskolc.interfaces.Colorable;

public class ColoredPoint extends Point implements Colorable {
	Color color;

	public ColoredPoint(Color color) {
		super(0, 0);
		this.color = color;
	}

	public ColoredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + " " + color;
	}

	@Override
	public void setDefColor(Color color) {
		this.color = color;
	}

	@Override
	public Color getDefColor() {
		return color;
	}

}
