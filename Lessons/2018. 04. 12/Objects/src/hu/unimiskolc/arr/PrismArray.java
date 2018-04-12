package hu.unimiskolc.arr;

import hu.unimiskolc.Cylinder;
import hu.unimiskolc.Prism;

public class PrismArray
{
	private Prism[] prisms;
	
	public PrismArray(int size)
	{
		prisms = new Prism[size];
	}
	
	public void setItem(int i, Prism p)
	{
		if(i >= prisms.length || i < 0)
			return;
		
		prisms[i] = p;
	}
	
	public int getSize()
	{
		return prisms.length;
	}
	
	public Prism getItem(int i)
	{
		if(i >= prisms.length || i < 0)
			return null;
		
		return prisms[i];
	}
	
	public int getItemCount()
	{
		int count = 0;
		
		for(int i = 0; i < prisms.length; i++)
			if(prisms[i] != null)
				count++;
		
		return count;
	}
	
	public double getAvgVolume()
	{
		double sum = 0;
		
		for(int i = 0; i < prisms.length; i++)
			if(prisms[i] != null)
				sum += prisms[i].getVolume();
		
		return sum / getItemCount();
	}
	
	public int getCylinderCount()
	{
		int count = 0;
		
		for(int i = 0; i < prisms.length; i++)
			if(prisms[i] instanceof Cylinder)
				count++;
		
		return count;
	}
}
