package tartalyos.fut;

import java.util.Scanner;

import tartalyos.Tartaly;

public class Proba
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Tartaly[] tartalyok = new Tartaly[5];

		int terfogat;
		double nyomas;

		for (int i = 0; i < tartalyok.length; i++)
		{
			System.out.print((i + 1) + ") Térfogat:");
			terfogat = Integer.parseInt(s.nextLine());

			System.out.print((i + 1) + ") Nyomás:");
			nyomas = Double.parseDouble(s.nextLine());

			tartalyok[i] = new Tartaly(terfogat, nyomas);
		}
		
		s.close();

		System.out.println("------Adatok------");

		for (Tartaly t : tartalyok)
		{
			System.out.println(t.toString());
		}

		System.out.println("Legnagyobb nyomasu: " + getLegnagyobbNyomasu(tartalyok).toString());
		System.out.println("Legnagyobb terfogatu: " + getLegnagyobbTerfogatu(tartalyok).toString());

	}

	public static Tartaly getLegnagyobbNyomasu(Tartaly[] t)
	{
		int max = 0;
		for (int i = 1; i < t.length; i++)
		{
			if (t[i].nagyobbNyomasuMint(t[max]))
				max = i;
		}

		return t[max];
	}

	public static Tartaly getLegnagyobbTerfogatu(Tartaly[] t)
	{
		Tartaly ret = null;
		for (int i = 0; i < t.length; i++)
		{
			ret = Tartaly.getBigger(ret, t[i]);
		}

		return ret;
	}

}
