package hu.unimiskolc.products.main;

import hu.unimiskolc.person.Seller;
import hu.unimiskolc.place.Property;
import hu.unimiskolc.products.Book;

public class Main
{
	public static void main(String[] args)
	{
		Seller first = new Property(4000000, "Ft", 64, "Miskolc");
		System.out.println(first.toString());
		first.setCurrency("€");
		first.setPrice((int) Property.toEuro(first.getPrice()));
		System.out.println(first.toString());
		
		Seller second = new Book("J.K.Rowling", "Harry Potter", 500, 3500, 27);
		System.out.println(second.toString());
	}
}
