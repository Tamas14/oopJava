package ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny implements Comparable<CsaladiAdokedvezmeny>
{
	private int gyerekekSzama;
	private int egyfoKedv;
	public static int[] kedv = { 10000, 17500, 33000 };

	public CsaladiAdokedvezmeny(int gyerekekSzama)
	{
		this.gyerekekSzama = gyerekekSzama;

		if (gyerekekSzama == 1)
			this.egyfoKedv = kedv[0];
		else if (gyerekekSzama == 2)
			this.egyfoKedv = kedv[1];
		else if (gyerekekSzama >= 3)
			this.egyfoKedv = kedv[2];
	}

	public int getGyerekek()
	{
		return gyerekekSzama;
	}

	public int getEgyfoKedv()
	{
		return egyfoKedv;
	}

	@Override
	public int getKedvezmenyMertek()
	{
		return getGyerekek() * getEgyfoKedv();
	}

	@Override
	public String toString()
	{
		return getGyerekek() + " " + getEgyfoKedv() + " " + getKedvezmenyMertek();
	}

	public boolean nagyobbAdoKedvezmenyu(CsaladiAdokedvezmeny csa)
	{
		return this.getKedvezmenyMertek() > csa.getKedvezmenyMertek();
	}

	@Override
	public int compareTo(CsaladiAdokedvezmeny o)
	{
		if (this.getKedvezmenyMertek() < o.getKedvezmenyMertek())
			return -1;
		if (this.getKedvezmenyMertek() > o.getKedvezmenyMertek())
			return 1;

		return 0;
	}

}
