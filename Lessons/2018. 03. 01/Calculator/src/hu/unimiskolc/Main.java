package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] operators = { '+', '-', '*', '/' };

		methodTwo(s, operators);
		
		s.close();
	}

	public static void methodOne(Scanner s, char[] operators) {
		System.out.print("Number one: ");
		double n1 = s.nextDouble();

		System.out.print("Operation: ");
		String op = s.next();

		System.out.print("Number two: ");
		double n2 = s.nextDouble();

		if (op.equals("/") && n2 == 0) {
			System.out.println("Cannot divide with 0");
			return;
		}

		double value = 0;
		boolean done = false;

		for (char c : operators) {
			if ((c + "").equals(op)) {
				value = calculate(n1, op, n2);
				done = true;
			}
		}

		if (!done) {
			System.out.println("Bad operator");
			return;
		}

		System.out.println(n1 + " " + op + " " + n2 + " = " + value);
	}

	public static void methodTwo(Scanner s, char[] operators) {
		System.out.print("Input (a + b): ");
		String input = s.nextLine();

		double n1, n2;
		String op;

		try {
			n1 = Double.parseDouble(input.split(" ")[0]);
			op = input.split(" ")[1];
			n2 = Double.parseDouble(input.split(" ")[2]);
		} catch (NumberFormatException e) {
			System.out.println("Use the format shown before.");
			return;
		}

		if (op.equals("/") && n2 == 0) {
			System.out.println("Cannot divide with 0");
			return;
		}

		double value = 0;
		boolean done = false;

		for (char c : operators) {
			if ((c + "").equals(op)) {
				value = calculate(n1, op, n2);
				done = true;
			}
		}

		if (!done) {
			System.out.println("Bad operator");
			return;
		}

		System.out.println(input + " = " + value);
	}

	public static double calculate(double n1, String op, double n2) {
		switch (op) {
			case "+": {
				return n1 + n2;
			}
			case "-": {
				return n1 - n2;
			}
			case "*": {
				return n1 * n2;
			}
			case "/": {
				return n1 / n2;
			}
		}

		return 0;
	}

}
