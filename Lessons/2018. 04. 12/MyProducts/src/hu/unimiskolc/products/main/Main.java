package hu.unimiskolc.products.main;

import java.awt.Color;

import hu.unimiskolc.awt.Colour;
import hu.unimiskolc.interfaces.Colorable;
import hu.unimiskolc.products.Pen;
import hu.unimiskolc.shape2D.ColoredPoint;

public class Main {
	public static void main(String[] args) {
		Colorable colorable = new ColoredPoint(10, 10, Color.BLACK);

		System.out.println("Black: " + Colour.convert(colorable.getDefColor()).toString());

		colorable.setDefColor(Color.BLUE);
		System.out.println("Blue: " + Colour.convert(colorable.getDefColor()).toString());

		resetColor(colorable);
		System.out.println("Color should be red: " + Colour.convert(colorable.getDefColor()).toString());

		colorable = new Pen("Golyóstoll", 1500, 19, "Parker", Color.GRAY);
		System.out.println("Gray: " + Colour.convert(colorable.getDefColor()).toString());

		colorable.setDefColor(Color.BLUE);
		System.out.println("Blue: " + Colour.convert(colorable.getDefColor()).toString());

		resetColor(colorable);
		System.out.println("Color should be red: " + Colour.convert(colorable.getDefColor()).toString());

	}

	public static void resetColor(Colorable obj) {
		obj.setDefColor(Colorable.defColor);
	}
}
