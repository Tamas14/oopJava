package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		System.out.println("PI: " + calcPI(10000));
	}

	public static double calcPI(int limit) {
		double pi = 0;
		int currentDivisor = 1;

		for (int i = 0; i < limit; i++) {
			if (i % 2 == 0)
				pi += 1 / (double) currentDivisor;
			else
				pi -= 1 / (double) currentDivisor;

			currentDivisor += 2;
		}

		return pi * 4;
	}
}
