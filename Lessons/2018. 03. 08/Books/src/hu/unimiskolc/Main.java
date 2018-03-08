package hu.unimiskolc;

public class Main {
	
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("Unknown");
		b.setTitle("The Universe");
		b.setDate(2018);
		b.setPrice(25);
		
		System.out.println(b.getData());
		
		b.incPrice(20);
		
		System.out.println(b.getData());
	}
	
}
