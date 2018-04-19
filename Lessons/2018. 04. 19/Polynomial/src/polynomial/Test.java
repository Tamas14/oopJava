package polynomial;

import java.text.DecimalFormat;
import java.util.Scanner;

import math.Polynomial;

public class Test {

	public static void main(String[] args) {
		LinearPolynomial[] polys = new LinearPolynomial[5];
		Scanner s = new Scanner(System.in);
		double a, b;

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ") a: ");
			a = Double.parseDouble(s.nextLine());

			System.out.print((i + 1) + ") b: ");
			b = Double.parseDouble(s.nextLine());

			polys[i] = new LinearPolynomial(a, b);
		}
		s.close();

		for (LinearPolynomial p : polys) {
			System.out.println(p.toString());
		}

		draw(polys[4]);
	}

	public static void draw(Polynomial p) {
		DecimalFormat df = new DecimalFormat("#.###");

		for (double i = 0; i < 1; i += 0.1) {
			System.out.println("x = " + df.format(i) + "\t | " + p.getY(i));
		}
	}

}
