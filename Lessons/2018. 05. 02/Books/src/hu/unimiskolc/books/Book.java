package hu.unimiskolc.books;

import java.time.LocalDate;
import java.util.Random;

public class Book {

	private String title;
	private String author;
	private final int date;
	private double price;
	private int pages;

	public static String publisher = "Móra";

	public Book(String author, String title, int pages, double price) {
		if(pages < 0 || price < 0)
			throw new IllegalArgumentException();
		
		this.title = title;
		this.author = author;
		this.date = LocalDate.now().getYear();
		
		this.pages = pages;
		this.price = price;
	}

	public Book(String title, String author, int pages) {
		this(title, author, pages, pages * new Random().nextInt(10) + 10);
	}

	public boolean equalsTitle(Book b) {
		return (this.title.equalsIgnoreCase(b.getTitle()));
	}

	public static Book getLonger(Book b1, Book b2) {
		if (b1.getPages() > b2.getPages())
			return b1;
		return b2;
	}

	public boolean evenPages() {
		return pages % 2 == 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDate() {
		return date;
	}

	public double getPrice() {
		return price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void incPrice(double percent) {
		this.price *= (1 + (percent / 100));
	}

	@Override
	public String toString() {
		String pages = (this.pages < 0) ? "Invalid page number" : (this.pages + "");
		String price = (this.price < 0) ? "Invalid price" : (this.price + "");
		
		return publisher + ", " + this.author + ": " + this.title + ", " + pages + ", " + this.date + ", "
				+ price;
	}

}
