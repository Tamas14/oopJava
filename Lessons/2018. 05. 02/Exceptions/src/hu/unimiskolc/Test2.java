package hu.unimiskolc;

import hu.unimiskolc.exception.UnsupportedConsoleException;

public class Test2
{
	public static void main(String[] args)
	{
		double num = Double.MIN_VALUE;
		try
		{
			num = MyConsole.readDouble("Adj meg egy szamot: ");
			System.out.print(num);
		} catch (UnsupportedConsoleException e)
		{
			System.out.println("Console not supported");
		}
	}
}
