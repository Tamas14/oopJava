package hu.unimiskolc;

public abstract class Prism
{
	private int height;

	public Prism(int height)
	{
		this.height = height;
	}

	public abstract double getBaseArea();

	public int getHeight()
	{
		return height;
	}

	public double getVolume()
	{
		return getBaseArea() * height;
	}

	public boolean biggerThan(Prism p)
	{
		return getVolume() > p.getVolume();
	}

}
