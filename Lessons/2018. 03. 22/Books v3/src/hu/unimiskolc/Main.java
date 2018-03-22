package hu.unimiskolc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Book[] books;
		String title, author;
		int pages;
		double price;
		int count;
		Scanner s = new Scanner(System.in);

		System.out.print("Books count: ");
		count = Integer.parseInt(s.nextLine());

		books = new Book[count];

		for (int i = 0; i < count; i++) {
			System.out.print("Book " + (i + 1) + ") Title: ");
			title = s.nextLine();

			System.out.print("Book " + (i + 1) + ") Author: ");
			author = s.nextLine();

			System.out.print("Book " + (i + 1) + ") pages: ");
			pages = Integer.parseInt(s.nextLine());

			System.out.print("Book " + (i + 1) + ") Price: ");
			price = Double.parseDouble(s.nextLine());

			books[i] = new Book(title, author, pages, price);
		}

		s.close();

		// test(books);

		System.out.println("Longest book: " + longestBook(books).toString());

		List<Book> evenBookList = Arrays.asList(books).stream().filter((Book b) -> b.evenPages())
				.collect(Collectors.toList());
		Book[] evenBooks = evenBookList.toArray(new Book[evenBookList.size()]);

		for (Book b : evenBooks)
			System.out.println("- " + b.toString());

		System.out.println("Longest book (even pages): " + longestBook(evenBooks).toString());

		HashMap<String, Integer> artistsBookCount = new HashMap<>();
		for (Book b : books) {
			if (!artistsBookCount.containsKey(b.getAuthor()))
				artistsBookCount.put(b.getAuthor(), 1);
			else
				artistsBookCount.replace(b.getAuthor(), artistsBookCount.get(b.getAuthor()) + 1);
		}

		for (String st : artistsBookCount.keySet()) {
			System.out.println(st + ": " + artistsBookCount.get(st) + " books");
		}
	}

	public static Book longestBook(Book[] books) {
		int m = 0;
		for (int i = 1; i < books.length; i++) {
			if (Book.getLonger(books[m], books[i]).equals(books[i]))
				m = i;
		}

		return books[m];
	}

	// public static void test(Book[] books) {
	// for (int i = 0; i < books.length; i++) {
	// books[i] = new Book((char) (65 + i) + "", (char) (65 + i % 2) + "", new
	// Random().nextInt(300) + 100);
	// }
	// }

}
