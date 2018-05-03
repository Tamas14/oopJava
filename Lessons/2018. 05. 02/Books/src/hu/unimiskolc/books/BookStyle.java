package hu.unimiskolc.books;

public class BookStyle extends Book
{
	private String style;

	/**
	 * 
	 * @param title
	 * @param author
	 * @param pages
	 * @param price
	 * @param style
	 */
	public BookStyle(String author, String title, int pages, double price, String style)
	{
		super(title, author, pages, price);
		this.style = style;
	}

	/**
	 * 
	 * @param title
	 * @param author
	 * @param pages
	 * @param style
	 */
	public BookStyle(String author, String title, int pages, String style)
	{
		super(title, author, pages);
		this.style = style;
	}

	public String getStyle()
	{
		return style;
	}

	@Override
	public String toString()
	{
		return super.toString() + " " + this.style;
	}

}
