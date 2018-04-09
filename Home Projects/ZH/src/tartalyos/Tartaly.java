package tartalyos;

public class Tartaly extends Tarolo
{
	private double nyomas;

	public Tartaly(int terfogat, double nyomas)
	{
		super(terfogat);
		this.nyomas = nyomas;
	}

	@Override
	public boolean isVeszelyes()
	{
		return getTerfogat() * nyomas > 100;
	}

	@Override
	public String toString()
	{
		return getTerfogat() + " " + nyomas + " " + (isVeszelyes() ? "veszélyes" : "nem veszélyes");
	}

	public boolean nagyobbNyomasuMint(Tartaly t)
	{
		return nyomas > t.getNyomas();
	}

	public double getNyomas()
	{
		return nyomas;
	}

	public static Tartaly getBigger(Tartaly t1, Tartaly t2)
	{
		if (t1 == null)
			return t2;

		if (t1.getTerfogat() > t2.getTerfogat())
			return t1;

		return t2;
	}

}
