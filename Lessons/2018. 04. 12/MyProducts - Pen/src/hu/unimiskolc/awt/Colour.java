package hu.unimiskolc.awt;

import java.awt.Color;
import java.awt.color.ColorSpace;

public class Colour extends Color {

	private static final long serialVersionUID = 1L;

	public Colour(ColorSpace cspace, float[] components, float alpha) {
		super(cspace, components, alpha);
		// TODO Auto-generated constructor stub
	}

	public Colour(float r, float g, float b, float a) {
		super(r, g, b, a);
		// TODO Auto-generated constructor stub
	}

	public Colour(float r, float g, float b) {
		super(r, g, b);
		// TODO Auto-generated constructor stub
	}

	public Colour(int rgba, boolean hasalpha) {
		super(rgba, hasalpha);
		// TODO Auto-generated constructor stub
	}

	public Colour(int r, int g, int b, int a) {
		super(r, g, b, a);
		// TODO Auto-generated constructor stub
	}

	public Colour(int r, int g, int b) {
		super(r, g, b);
		// TODO Auto-generated constructor stub
	}

	public Colour(int rgb) {
		super(rgb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getColorName(convert(this));
	}

	public enum Colors {
		PIROS(Color.RED), KÉK(Color.BLUE), ZÖLD(Color.GREEN), SZÜRKE(Color.GRAY), SÁRGA(Color.YELLOW), FEKETE(
				Color.BLACK), FEHÉR(
						Color.WHITE), RÓZSASZÍN(Color.PINK), NARANCSSÁRGA(Color.ORANGE), MAGENTA(Color.MAGENTA);

		java.awt.Color color;

		Colors(java.awt.Color color) {
			this.color = color;
		}

	}

	private String getColorName(Colour color) {
		for (Colors colors : Colors.values()) {
			if (colors.color.equals(color)) {
				return colors.name().toLowerCase();
			}
		}
		return "unidentifyed";
	}

	public static Colour convert(Color color) {
		return new Colour(color.getRed(), color.getGreen(), color.getBlue());
	}

}
