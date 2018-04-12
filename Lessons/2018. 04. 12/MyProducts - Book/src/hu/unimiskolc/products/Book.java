package hu.unimiskolc.products;

import java.time.LocalDate;

public class Book extends Product
{
	private String title;
	private String author;
	private final int date;
	// private int price;
	private int pages;

	public static String publisher = "Móra";

	public Book(String author, String title, int pages, int price, int tax)
	{
		super("Book", (int) price / pages, tax);
		this.title = title;
		this.author = author;
		this.date = LocalDate.now().getYear();
		this.pages = pages;
		// this.price = price;
	}

	// public Book(String title, String author, int pages, int tax)
	// {
	// this(title, author, pages, pages * new Random().nextInt(10) + 10, tax);
	// }

	public boolean equalsTitle(Book b)
	{
		return (this.title.equalsIgnoreCase(b.getTitle()));
	}

	public static Book getLonger(Book b1, Book b2)
	{
		if (b1.getPages() > b2.getPages())
			return b1;
		return b2;
	}

	public boolean evenPages()
	{
		return pages % 2 == 0;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public int getDate()
	{
		return date;
	}

	public int getPages()
	{
		return pages;
	}

	public void setPages(int pages)
	{
		this.pages = pages;
	}

	public void incPrice(double percent)
	{
		this.price *= (1 + (percent / 100));
	}

	@Override
	public String toString()
	{
		return publisher + ", " + this.author + ": " + this.title + ", " + this.pages + ", " + this.date + ", "
				+ this.price;
	}

	@Override
	public int getPrice()
	{
		return price;
	}

}
