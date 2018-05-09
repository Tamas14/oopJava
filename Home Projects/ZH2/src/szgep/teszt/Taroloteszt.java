package szgep.teszt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import szgep.Merevlemez;

public class Taroloteszt
{
	public static void main(String[] args)
	{
		Merevlemez[] lemezek = new Merevlemez[5];
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String tipus;
		double kapacitas;
		double foglalt;

		for (int i = 0; i < lemezek.length; i++)
		{
			try
			{
				System.out.print((i + 1) + ") Add meg a márkát: ");
				tipus = input.readLine();
				System.out.print((i + 1) + ") Add meg a kapacitást (GB): ");
				kapacitas = Double.parseDouble(input.readLine());
				System.out.print((i + 1) + ") Add meg a foglalt területet (GB): ");
				foglalt = Double.parseDouble(input.readLine());

				lemezek[i] = new Merevlemez(tipus, kapacitas, foglalt);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		System.out.println("Legnagyobb kapacitasu: " + getLegnagyobbKapacitasu(lemezek).toString());
		System.out.println(tobbSzabadMintFoglalt(lemezek) + "db lemeznek több a szabad helye");

		for (int i = 0; i < lemezek.length; i++)
		{
			System.out.println(lemezek[i].toString());
		}

		Arrays.sort(lemezek);
		System.out.println("Rendezve:");

		for (int i = 0; i < lemezek.length; i++)
		{
			System.out.println(lemezek[i].toString());
		}
	}

	public static Merevlemez getLegnagyobbKapacitasu(Merevlemez[] lemezek)
	{
		Merevlemez max = lemezek[0];
		for (int i = 1; i < lemezek.length; i++)
		{
			if (lemezek[i].getKapacitas() > max.getKapacitas())
				max = lemezek[i];
		}

		return max;
	}

	public static int tobbSzabadMintFoglalt(Merevlemez[] lemezek)
	{
		int sum = 0;

		for (int i = 0; i < lemezek.length; i++)
		{
			if (lemezek[i].getSzabadHely() > lemezek[i].getFoglalt())
				sum++;
		}

		return sum;
	}
}
