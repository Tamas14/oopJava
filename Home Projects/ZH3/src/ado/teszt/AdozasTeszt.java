package ado.teszt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import ado.CsaladiAdokedvezmeny;

public class AdozasTeszt
{

	public static void main(String[] args)
	{
		CsaladiAdokedvezmeny[] tomb = new CsaladiAdokedvezmeny[5];
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int gyerekekSzama;

		for (int i = 0; i < tomb.length; i++)
		{
			try
			{
				System.out.print((i + 1) + ") Gyerekek száma: ");
				gyerekekSzama = Integer.parseInt(input.readLine());

				tomb[i] = new CsaladiAdokedvezmeny(gyerekekSzama);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		for (int i = 0; i < tomb.length; i++)
		{
			System.out.println(tomb[i].toString());
		}

		System.out.println("Legnagyobb számított kedvezmény: " + getLegnagyobbAdokedvezmeny(tomb));
		System.out.println(getNagyCsalados(tomb) + " család veszi igénybe a kedvezményt 3 vagy több gyermekkel");

		System.out.println("Rendezett tömb: ");
		Arrays.sort(tomb);

		for (int i = 0; i < tomb.length; i++)
		{
			System.out.println(tomb[i].toString());
		}
	}

	public static CsaladiAdokedvezmeny getLegnagyobbAdokedvezmeny(CsaladiAdokedvezmeny[] tomb)
	{
		CsaladiAdokedvezmeny max = tomb[0];

		for (int i = 1; i < tomb.length; i++)
		{
			if (tomb[i].getKedvezmenyMertek() > max.getKedvezmenyMertek())
				max = tomb[i];
		}

		return max;
	}

	public static int getNagyCsalados(CsaladiAdokedvezmeny[] tomb)
	{
		int sum = 0;

		for (int i = 0; i < tomb.length; i++)
		{
			if (tomb[i].getGyerekek() >= 3)
				sum++;
		}

		return sum;
	}

}
