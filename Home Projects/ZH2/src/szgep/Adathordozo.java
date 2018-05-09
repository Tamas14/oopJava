package szgep;

public abstract class Adathordozo
{
	String tipus;
	double kapacitas;

	/**
	 * @param tipus
	 * @param kapacitas
	 */
	public Adathordozo(String tipus, double kapacitas)
	{
		this.tipus = tipus;
		this.kapacitas = kapacitas;
	}

	public double getKapacitas()
	{
		return kapacitas;
	}

	public String getTipus()
	{
		return tipus;
	}

	public abstract double getSzabadHely();

}
