package hu.unimiskolc;

public class Cylinder extends Prism
{
	private double radius;

	public Cylinder(int height, int radius)
	{
		super(height);
		this.radius = radius;
	}

	@Override
	public double getBaseArea()
	{
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString()
	{
		return radius + " " + getHeight();
	}

}
