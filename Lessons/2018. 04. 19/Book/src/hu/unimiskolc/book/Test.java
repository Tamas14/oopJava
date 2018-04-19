package hu.unimiskolc.book;

import java.util.Arrays;
import java.util.Scanner;

import hu.unimiskolc.book.BookWithEnum.Style;

public class Test {

	public static void main(String[] args) {
		BookWithEnum[] books;

		int count;
		Scanner s = new Scanner(System.in);

		System.out.print("Books count: ");
		count = Integer.parseInt(s.nextLine());

		books = new BookWithEnum[count];

		String title, author;
		int pages;
		int price;
		String style;

		for (int i = 0; i < count; i++) {
			System.out.print("Book " + (i + 1) + ") Author: ");
			author = s.nextLine();

			System.out.print("Book " + (i + 1) + ") Title: ");
			title = s.nextLine();

			System.out.print("Book " + (i + 1) + ") pages: ");
			pages = Integer.parseInt(s.nextLine());

			System.out.print("Book " + (i + 1) + ") Price: ");
			price = Integer.parseInt(s.nextLine());

			do {
				System.out.print("Book " + (i + 1) + ") Style: ");
				style = s.nextLine();

				if (!checkStyle(style)) {
					System.out.print("Possible choices: ");
					for (Style st : Style.values())
						System.out.print(st.toString() + ", ");

					System.out.println();
				} else {
					break;
				}
			} while (true);

			books[i] = new BookWithEnum(author, title, pages, price, 27, Style.valueOf(style.toUpperCase()));
		}

		s.close();

		print(books);

		print(getByStyle(books, Style.SCIFI));
	}

	public static boolean checkStyle(String style) {
		boolean exist = false;

		for (Style st : Style.values())
			if (st.toString().equalsIgnoreCase(style))
				exist = true;

		return exist;
	}

	public static void print(Book[] books) {
		for (Book b : books) {
			System.out.println(b.toString());
		}
	}

	public static BookWithEnum[] getByStyle(BookWithEnum[] books, Style style) {
		BookWithEnum[] ret = new BookWithEnum[books.length];
		int i = 0;

		for (BookWithEnum b : books) {
			if (b.getStyle().equals(style)) {
				ret[i++] = b;
			}
		}

		return Arrays.copyOf(ret, i);
	}
}
