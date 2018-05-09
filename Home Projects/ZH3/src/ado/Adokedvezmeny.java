package ado;

public abstract class Adokedvezmeny
{
	private String tipus;

	public String getTipus()
	{
		return tipus;
	}

	public abstract int getKedvezmenyMertek();
}
