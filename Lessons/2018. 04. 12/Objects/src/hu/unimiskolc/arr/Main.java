package hu.unimiskolc.arr;

import java.util.Scanner;

import hu.unimiskolc.Cuboid;
import hu.unimiskolc.Cylinder;
import hu.unimiskolc.Prism;

public class Main
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		PrismArray pa = new PrismArray(5);
		Cuboid cub;
		Cylinder cyl;

		int a, b, r, h;

		for (int i = 0; i < pa.getSize() - 1; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print("Radius: ");
				r = Integer.parseInt(s.nextLine());

				System.out.print("Height: ");
				h = Integer.parseInt(s.nextLine());

				System.out.println();

				cyl = new Cylinder(h, r);

				pa.setItem(i, cyl);
			} else
			{
				System.out.print("A: ");
				a = Integer.parseInt(s.nextLine());

				System.out.print("B: ");
				b = Integer.parseInt(s.nextLine());

				System.out.print("Height: ");
				h = Integer.parseInt(s.nextLine());

				System.out.println();

				cub = new Cuboid(a, b, h);

				pa.setItem(i, cub);
			}
		}

		s.close();

		Prism p;

		for (int i = 0; i < pa.getSize(); i++)
		{
			p = pa.getItem(i);
			if (p != null)
				System.out.println(p.toString());
		}

		System.out.println("Average volume: " + pa.getAvgVolume());

		System.out.println("Cylinders count: " + pa.getCylinderCount());
	}

}
