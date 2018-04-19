package polynomial;

import java.util.Scanner;

import polynomial.QuadraticPolynomial.Complex;

public class Test
{
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		QuadraticPolynomial[] polyArr = new QuadraticPolynomial[5];

		System.out.println("Quadratic Polynomials:");
		for (int i = 0; i < polyArr.length; i++)
		{
			System.out.print((i + 1) + ") A: ");
			double a = Double.parseDouble(s.nextLine());
			System.out.print((i + 1) + ") B: ");
			double b = Double.parseDouble(s.nextLine());
			System.out.print((i + 1) + ") C: ");
			double c = Double.parseDouble(s.nextLine());
			polyArr[i] = new QuadraticPolynomial(a, b, c);
		}

		s.close();

		for (QuadraticPolynomial poly : polyArr)
		{
			System.out.println("Solving: " + poly.toString());

			for (Complex root : poly.getRoots())
			{
				if (root != null)
					System.out.println(root.toString());
			}
		}

	}
}
