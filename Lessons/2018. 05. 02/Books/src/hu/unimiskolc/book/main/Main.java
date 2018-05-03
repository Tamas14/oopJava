package hu.unimiskolc.book.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import hu.unimiskolc.books.Book;
import hu.unimiskolc.books.BookStyle;

public class Main
{

	public static void main(String[] args)
	{
		BookStyle[] books;

		String title, author, style;
		int pages;
		double price;

		int count;
		Scanner s = new Scanner(System.in);

		System.out.print("Books count: ");
		count = Integer.parseInt(s.nextLine());

		books = new BookStyle[count];

		for (int i = 0; i < count; i++)
		{
			System.out.print("Book " + (i + 1) + ") Author: ");
			author = s.nextLine();

			System.out.print("Book " + (i + 1) + ") Title: ");
			title = s.nextLine();

			System.out.print("Book " + (i + 1) + ") pages: ");
			pages = Integer.parseInt(s.nextLine());

			System.out.print("Book " + (i + 1) + ") Price: ");
			price = Double.parseDouble(s.nextLine());

			System.out.print("Book " + (i + 1) + ") Style: ");
			style = s.nextLine();

			books[i] = new BookStyle(title, author, pages, price, style);
		}

		s.close();

		// test(books);

		// Search for the longest book

		try
		{
			System.out.println("Longest book: " + longestBook(books).toString());
		} catch (NullPointerException e)
		{
			System.out.println("There is no book in the array");
			System.exit(0);
		}

		List<Book> evenBookList = Arrays.asList(books).stream().filter((Book b) -> b.evenPages())
				.collect(Collectors.toList());
		Book[] evenBooks = evenBookList.toArray(new Book[evenBookList.size()]);

		// Print out books with even number of pages

		for (Book b : evenBooks)
			System.out.println("- " + b.toString());

		// Print out the longest book with even pages

		try
		{
			System.out.println("Longest book (even pages): " + longestBook(evenBooks).toString());
		} catch (NullPointerException e)
		{
			System.out.println("There is no even book in the array");
		}
		// Sum books per author

		HashMap<String, Integer> artistsBookCount = new HashMap<>();
		for (Book b : books)
		{
			if (!artistsBookCount.containsKey(b.getAuthor()))
				artistsBookCount.put(b.getAuthor(), 1);
			else
				artistsBookCount.replace(b.getAuthor(), artistsBookCount.get(b.getAuthor()) + 1);
		}

		// Print out the result
		for (String st : artistsBookCount.keySet())
		{
			System.out.println("Author " + st + " has " + artistsBookCount.get(st) + " books");
		}

		// Print different styles count

		System.out.println("The array has " + stylesCount(books) + " different styles of books.");

		// Print scifi books
		for (int i = 0; i < books.length; i++)
		{
			if (books[i].getStyle().equalsIgnoreCase("scifi"))
			{
				System.out.println(books[i].toString());
			}
		}

		// Calculate average price of books with style scifi

		double priceSum = 0;
		int num = 0;

		for (int i = 0; i < books.length; i++)
		{
			if (books[i].getStyle().equalsIgnoreCase("scifi"))
			{
				priceSum += books[i].getPrice();
				num++;
			}
		}

		if (num == 0)
			System.out.println("There is no scifi book in the array");
		else
			System.out.println("Average price of scifi books: " + priceSum / num);
	}

	public static int stylesCount(BookStyle[] books)
	{
		int count = 0;
		int pointer = 0;
		String[] counted = new String[books.length];

		outer: for (BookStyle bs : books)
		{
			String style = bs.getStyle();

			for (String s : counted)
			{
				if (s == null)
					break;
				if (s.equalsIgnoreCase(style))
					continue outer;
			}

			counted[pointer++] = style;
			count++;
		}

		return count;
	}

	public static Book longestBook(Book[] books)
	{
		if (books.length < 1)
			return null;
		if (books.length == 1)
			return books[0];

		int m = 0;
		for (int i = 1; i < books.length; i++)
		{
			if (Book.getLonger(books[m], books[i]).equals(books[i]))
				m = i;
		}

		return books[m];
	}

	public static void test(Book[] books)
	{
		String[] styles = { "Scifi", "Modern", "Romantic", "Scientific" };
		Random r = new Random();
		for (int i = 0; i < books.length; i++)
		{
			books[i] = new BookStyle((char) (65 + i % 3) + "", (char) (97 + i) + "", r.nextInt(300) + 100,
					styles[r.nextInt(styles.length)]);
		}
	}

}
