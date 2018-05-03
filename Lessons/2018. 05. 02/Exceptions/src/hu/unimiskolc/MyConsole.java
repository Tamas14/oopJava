package hu.unimiskolc;

import java.io.Console;
import java.util.Scanner;

import hu.unimiskolc.exception.UnsupportedConsoleException;

public class MyConsole
{
	public static int readInt(String msg)
	{
		Scanner s = new Scanner(System.in);
		
		String num;
		int cNum = Integer.MIN_VALUE;
		
		do {
			System.out.print(msg);
			num = s.nextLine();
			
			try {
				cNum = Integer.parseInt(num);
			}catch(NumberFormatException e)
			{
				System.out.println("Not a number");
				num = null;
			}
			
		}while(num != null);
		
		s.close();
		
		return cNum;
	}
	
	public static double readDouble(String msg) throws UnsupportedConsoleException
	{
		//Don't know, how it supposed to be. u.u
		Console con = System.console();
		
		if(con == null)
			throw new UnsupportedConsoleException();
		
		String num;
		double cNum = Double.MIN_VALUE;
		
		do {
			System.out.print(msg);
			
			num = con.readLine();
			
			try {
				cNum = Double.parseDouble(num);
			}catch(NumberFormatException e)
			{
				System.out.println("Not a number");
				num = null;
			}
			
		}while(num != null);
		
		return cNum;
	}
}
