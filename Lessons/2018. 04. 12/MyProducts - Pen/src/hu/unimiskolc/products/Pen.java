package hu.unimiskolc.products;

import java.awt.Color;
import hu.unimiskolc.interfaces.Colorable;

public class Pen extends Product implements Colorable {
	String brand;
	Color color;

	public Pen(String name, int price, int tax, String brand, Color color) {
		super(name, price, tax);
		this.brand = brand;
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + " " + brand + " " + color;
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
