package hu.unimiskolc;

public class Book {

	private String title;
	private String author;
	private int date;
	private double price;

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

	public String getData() {
		return "Title: " + this.title + " Author: " + this.author + " Release date: " + this.date + " Price: "
				+ this.price;
	}

}
