package szgep;

public class Merevlemez extends Adathordozo implements Comparable<Merevlemez>
{
	double foglalt;

	public Merevlemez(String tipus, double kapacitas, double foglalt)
	{
		super(tipus, kapacitas);
		this.foglalt = foglalt;
	}

	public double getFoglalt()
	{
		return foglalt;
	}

	@Override
	public double getSzabadHely()
	{
		return getKapacitas() - getFoglalt();
	}

	@Override
	public String toString()
	{
		return getTipus() + " " + getKapacitas() + " " + getFoglalt() + " " + getSzabadHely();
	}

	public boolean compareSzabadTerulet(Merevlemez m)
	{
		return getSzabadHely() > m.getSzabadHely();
	}

	public static Merevlemez getNagyobbKapacitasu(Merevlemez m1, Merevlemez m2)
	{
		if (m1.getKapacitas() > m2.getKapacitas())
			return m1;

		return m2;
	}

	@Override
	public int compareTo(Merevlemez o)
	{
		if (getSzabadHely() < o.getSzabadHely())
			return 1;

		if (getSzabadHely() > o.getSzabadHely())
			return -1;

		return 0;
	}

}
