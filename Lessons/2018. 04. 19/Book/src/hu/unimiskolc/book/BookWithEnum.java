package hu.unimiskolc.book;

public class BookWithEnum extends Book {

	private Style style;

	public BookWithEnum(String author, String title, int pages, int price, int tax, Style style) {
		super(author, title, pages, price, tax);
		this.style = style;
	}

	public enum Style {
		SCIFI, COOK, ROMANCE, OTHER;
	}

	@Override
	public String toString() {
		return super.toString() + " " + style;
	}

	public Style getStyle() {
		return style;
	}

}
