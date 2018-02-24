package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		int limit = 5;

		for (int i = 1; i <= limit; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

}
