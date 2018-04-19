package polynomial;

import math.Polynomial;

public class QuadraticPolynomial implements Polynomial {
	double a, b, c;

	public enum Root {
		COMPLEX, REAL_ONE, REAL_TWO;
	}

	public QuadraticPolynomial(double a, double b, double c) {
		if (a == 0)
			return;

		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getY(double x) {
		return a * x * x + b * x + c;
	}

	@Override
	public int getDegree() {
		return 2;
	}

	@Override
	public String toString() {
		return "y = " + a + "x^2 " + ((b >= 0) ? "+ " : "- ") + Math.abs(b) + "x " + ((c >= 0) ? "+ " : "- ")
				+ Math.abs(c);
	}

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	public Root getRootType() {
		double d = getDiscriminant();

		if (d < 0)
			return Root.COMPLEX;
		else if (d > 0)
			return Root.REAL_TWO;
		else
			return Root.REAL_ONE;
	}

}
