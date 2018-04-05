package hu.unimiskolc.products.main;

import hu.unimiskolc.products.Bread;
import hu.unimiskolc.products.Product;

public class Main
{
	public static void main(String[] args)
	{
		// a
		Product product1 = new Product("Wheat", 10, 27);
		Bread bread1 = new Bread("White Bread", 30, 16, 1);
		
		System.out.println(product1.toString());
		System.out.println(bread1.toString());
		
		System.out.print("More expensive one: ");
		if(product1.compPrice(bread1) == 1)
			System.out.println(product1.toString());
		else
			System.out.println(bread1.toString());
		
		// b
		System.out.println();
		Product product2 = new Bread("Brown Bread", 50, 16, 0.75);
		System.out.println(product2.toString());

		/*
		 * Not accessible System.out.println(product2.getQuantity());
		 */

		// c
		System.out.println();
		Bread bread2 = new Bread("Gold Bread", 200, 27, 0.5);

		if (bread2.compPrice(product2) == 1)
			System.out.println(bread2.toString());
		else
			System.out.println(product2.toString());

		// if(Bread.compPrice(bread2, (Bread) product2))
		// System.out.println(bread2.toString());
		// else
		// System.out.println(product2.toString());

	}
}
