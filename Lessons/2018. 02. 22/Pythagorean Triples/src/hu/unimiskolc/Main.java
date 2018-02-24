package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		int limit = 50;

		System.out.format("%2s | %2s | %2s \n", "a", "b", "c");
		for (int i = 1; i <= limit; i++)
			for (int j = (i + 1); j <= limit; j++)
				for (int k = (j + 1); k <= limit; k++)
					if (validate(i, j, k))
						System.out.format("%2d | %2d | %2d \n", i, j, k);

	}

	public static boolean validate(int a, int b, int c) {
		return (a * a + b * b == c * c);
	}

}
