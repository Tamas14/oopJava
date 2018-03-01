package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		methodTwo(s);
		s.close();
	}

	public static void methodOne(Scanner s) {
		System.out.println("Enter the following constants (ax^2 + bx + c)");

		System.out.print("a: ");
		double a = s.nextDouble();

		if (a == 0) {
			System.out.println("a cannot be 0");
			return;
		}

		System.out.print("b: ");
		double b = s.nextDouble();

		System.out.print("c: ");
		double c = s.nextDouble();

		System.out.println("The formula has " + resultNumber(a, b, c) + " results:");
		double[] results = results(a, b, c);

		System.out.println("x1: " + results[0]);
		System.out.println("x2: " + results[1]);
	}

	public static void methodTwo(Scanner s) {
		System.out.println("Enter the following constants (ax^2 + bx + c)");

		System.out.print("(a,b,c): ");
		String[] input = s.nextLine().split(",");

		double a = Double.parseDouble(input[0]);
		double b = Double.parseDouble(input[1]);
		double c = Double.parseDouble(input[2]);

		if (a == 0) {
			System.out.println("a cannot be 0");
			return;
		}

		System.out.println("The formula has " + resultNumber(a, b, c) + " results:");
		double[] results = results(a, b, c);

		System.out.println("x1: " + results[0]);
		System.out.println("x2: " + results[1]);
	}

	public static int resultNumber(double a, double b, double c) {
		double discriminant = b * b - (4 * a * c);

		if (discriminant > 0)
			return 2;
		else if (discriminant == 0)
			return 1;
		return 0;
	}

	public static double[] results(double a, double b, double c) {
		double[] results = new double[2];
		double discriminant = b * b - (4 * a * c);

		results[0] = ((-b) + Math.sqrt(discriminant)) / (2.0 * a);
		results[1] = ((-b) - Math.sqrt(discriminant)) / (2.0 * a);

		return results;
	}

}
