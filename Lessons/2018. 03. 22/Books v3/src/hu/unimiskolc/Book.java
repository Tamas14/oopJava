package hu.unimiskolc;

import java.time.LocalDate;

public class Book {

	private String title;
	private String author;
	private final int date;
	private double price;
	private int pages;

	public static String publisher = "Móra";

	public Book(String title, String author, int pages, double price) {
		this.title = title;
		this.author = author;
		this.date = LocalDate.now().getYear();
		this.pages = pages;
		this.price = price;
	}

	public Book(String title, String author, int pages) {
		this(title, author, pages, 2500);
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
		return publisher + ", " + this.title + ": " + this.author + ", " + this.pages + ", " + this.date + ", "
				+ this.price;
	}

}
