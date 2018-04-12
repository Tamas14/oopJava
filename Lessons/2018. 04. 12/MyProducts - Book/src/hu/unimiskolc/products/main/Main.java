package hu.unimiskolc.products.main;

import java.util.Arrays;
import java.util.Scanner;

import hu.unimiskolc.products.Book;

public class Main
{
	public static void main(String[] args)
	{
		Book[] books;

		String title, author;
		int pages;
		int price;

		int count;
		Scanner s = new Scanner(System.in);

		System.out.print("Books count: ");
		count = Integer.parseInt(s.nextLine());

		books = new Book[count];

		for (int i = 0; i < count; i++)
		{
			System.out.print("Book " + (i + 1) + ") Author: ");
			author = s.nextLine();

			System.out.print("Book " + (i + 1) + ") Title: ");
			title = s.nextLine();

			System.out.print("Book " + (i + 1) + ") pages: ");
			pages = Integer.parseInt(s.nextLine());

			System.out.print("Book " + (i + 1) + ") Price: ");
			price = Integer.parseInt(s.nextLine());

			books[i] = new Book(author, title, pages, price, 27);
		}

		s.close();

		sortByTitle(books);

		for (int i = 0; i < books.length; i++)
		{
			String prefix = books[i].getAuthor() + " " + books[i].getTitle() + ": ";
			System.out.println(prefix + books[i].getPrice());
		}

		printArray(getAuthorsWithExpensiveBooks(books));
	}

	public static void sortByTitle(Book[] books)
	{
		Book tmp;
		boolean doSwap = true;

		while (doSwap)
		{
			doSwap = false;

			for (int i = 0; i < books.length - 1; i++)
			{
				if (books[i].getTitle().compareToIgnoreCase(books[i + 1].getTitle()) > 0)
				{
					tmp = books[i];
					books[i] = books[i + 1];
					books[i + 1] = tmp;

					doSwap = true;
				}
			}
		}
	}

	public static String[] getAuthorsWithExpensiveBooks(Book[] books)
	{
		int i = 0;
		String[] ret = new String[books.length];

		for (Book b : books)
		{
			if (b.getPrice() > 20)
				ret[i++] = b.getAuthor();
		}

		return Arrays.copyOfRange(ret, 0, i);
	}

	public static <T> void printArray(T[] data)
	{
		for (T t : data)
		{
			System.out.println(t.toString());
		}
	}
}
