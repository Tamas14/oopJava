package hu.unimiskolc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Main {

	public enum Operations implements DoubleBinaryOperator {
		ADD("+", (x, y) -> x + y),
		SUBTRACT("-", (x, y) -> x - y),
		MULTIPLY("*", (x, y) -> x * y),
		DIVIDE("/",	(x, y) -> x / y);

		private String operator;
		private DoubleBinaryOperator binOperator;

		private Operations(String operator, DoubleBinaryOperator binOperator) {
			this.operator = operator;
			this.binOperator = binOperator;
		}

		@Override
		public double applyAsDouble(double left, double right) {
			return binOperator.applyAsDouble(left, right);
		}
	}

	public static void main(String[] args) {
		List<Operations> ops = new ArrayList<>(Arrays.asList(Operations.values()));

		Scanner s = new Scanner(System.in);
		System.out.print("Expression (a + b): ");
		String input = s.nextLine();
		s.close();

		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[2]);
		String operator = input.split(" ")[1];

		Operations operation = ops.stream().filter(f -> f.operator.equals(operator)).iterator().next();
		System.out.println(operation.applyAsDouble(a, b));
	}

}
