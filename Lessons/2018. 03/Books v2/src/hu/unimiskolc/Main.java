package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Book b1, b2;
		String title, author;
		int date;
		double price;

		Scanner s = new Scanner(System.in);

		System.out.print("Book 1) Title: ");
		title = s.nextLine();
		System.out.print("Book 1) Author: ");
		author = s.nextLine();
		System.out.print("Book 1) Date: ");
		date = Integer.parseInt(s.nextLine());
		System.out.print("Book 1) Price: ");
		price = Double.parseDouble(s.nextLine());
		b1 = new Book(title, author, date, price);

		System.out.print("Book 2) Title: ");
		title = s.nextLine();
		System.out.print("Book 2) Author: ");
		author = s.nextLine();
		b2 = new Book(title, author);

		s.close();

		System.out.println(b1.toString());
		System.out.println(b2.toString());

		System.out.println("Same title? " + b1.equalsTitle(b2));
	}

}
