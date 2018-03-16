package hu.unimiskolc;

import java.time.LocalDate;

public class Book {

	private String title;
	private String author;
	private int date;
	private double price;

	public Book(String title, String author, int date, double price) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.price = price;
	}

	public Book(String title, String author) {
		this(title, author, 0, 2500);

		LocalDate currDate = LocalDate.now();
		this.date = currDate.getYear();
	}

	public boolean equalsTitle(Book b) {
		return (this.title.equalsIgnoreCase(b.getTitle()));
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

	public void setDate(int date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void incPrice(double percent) {
		this.price *= (1 + (percent / 100));
	}

	@Override
	public String toString() {
		return "Title: " + this.title + " Author: " + this.author + " Release date: " + this.date + " Price: "
				+ this.price;
	}

}
