package polynomial;

import java.text.DecimalFormat;

import math.Polynomial;

public class QuadraticPolynomial implements Polynomial
{
	double a, b, c;

	public final class Complex
	{
		private final double re;
		private final double im;

		public Complex(double real, double imag)
		{
			re = real;
			im = imag;
		}

		public String toString()
		{
			double re = format(this.re);
			double im = format(this.im);

			if (im == 0)
				return re + "";
			if (re == 0)
				return im + "i";
			if (im < 0)
				return re + " - " + -im + "i";
			return re + " + " + im + "i";
		}

		public double format(double num)
		{
			DecimalFormat df = new DecimalFormat("#.####");
			String tmp = df.format(num).replace(',', '.');
			return Double.parseDouble(tmp);
		}

		public double re()
		{
			return re;
		}

		public double im()
		{
			return im;
		}
	}

	public enum Root
	{
		COMPLEX, REAL_ONE, REAL_TWO;
	}

	public QuadraticPolynomial(double a, double b, double c)
	{
		if (a == 0)
			return;

		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getY(double x)
	{
		return a * x * x + b * x + c;
	}

	@Override
	public int getDegree()
	{
		return 2;
	}

	@Override
	public String toString()
	{
		return "y = " + a + "x^2 " + ((b >= 0) ? "+ " : "- ") + Math.abs(b) + "x " + ((c >= 0) ? "+ " : "- ")
				+ Math.abs(c);
	}

	public double getDiscriminant()
	{
		return (b * b) - (4 * a * c);
	}

	public Root getRootType()
	{
		double d = getDiscriminant();

		if (d < 0)
			return Root.COMPLEX;
		else if (d > 0)
			return Root.REAL_TWO;
		else
			return Root.REAL_ONE;
	}

	public Complex[] getRoots()
	{
		Root type = getRootType();
		double dis = getDiscriminant();

		Complex[] roots = new Complex[2];

		switch (type)
		{
			case COMPLEX:
			{
				double realPart = -b / (2 * a);
				double imaginaryPart = Math.sqrt(-dis) / (2 * a);

				roots[0] = new Complex(realPart, imaginaryPart);
				roots[1] = new Complex(realPart, -imaginaryPart);

				break;
			}
			case REAL_ONE:
			{
				double root = (-b + Math.sqrt(dis)) / (2 * a);

				roots[0] = new Complex(root, 0);
				// roots[1] = new Complex(root, 0);

				break;
			}
			case REAL_TWO:
			{
				double root = (-b + Math.sqrt(dis)) / (2 * a);
				double root2 = (-b - Math.sqrt(dis)) / (2 * a);

				roots[0] = new Complex(root, 0);
				roots[1] = new Complex(root2, 0);

				break;
			}
			default:// Cannot get here
				break;

		}

		return roots;
	}

}
