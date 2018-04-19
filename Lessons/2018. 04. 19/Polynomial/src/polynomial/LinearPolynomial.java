package polynomial;

import math.Polynomial;

public class LinearPolynomial implements Polynomial {
	private double a, b;

	public LinearPolynomial(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double getY(double x) {
		return a * x + b;
	}

	@Override
	public int getDegree() {
		return (int) a;
	}

	@Override
	public String toString() {
		return "y = " + a + "x + " + b;
	}

}
