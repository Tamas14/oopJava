package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++)
			System.out.println("Factorial of " + i + ": " + factorial(i));
	}

	public static int factorial(int number) {
		if (number > 1)
			return factorial(number - 1) * number;
		else
			return 1;
	}
}
